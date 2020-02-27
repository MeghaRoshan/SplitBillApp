import dao.BillDao
import dao.UserDao
import main.kotlin.models.controller.UserController
import main.kotlin.models.models.Bill
import main.kotlin.models.service.BillServices
import main.kotlin.models.service.UserServices
import models.User
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

open class BillServicesTest {
    @Mock
    lateinit var mockBillDao: BillDao
    lateinit var testBillServices: BillServices

    @BeforeEach
    fun init() {
        MockitoAnnotations.initMocks(this)
        testBillServices = BillServices(mockBillDao)
    }

    @Test
    fun `test bill creation`() {
        var user = User(1, "Megha", "megha@awesome.com")
//        val list= []
        val testBill = Bill(1, "lunch123", amount = 4000.0, payee = user)
        Mockito.`when`(mockBillDao.addBill(testBill)).thenAnswer {
            return@thenAnswer testBill
        }
        val bill = testBillServices.addBill(testBill)
        assertEquals(testBill, bill)

    }
    fun `update amount test`() {
        var user = User(1, "Megha", "megha@awesome.com")
        val testBill = Bill(1, "lunch123", amount = 4000.0, payee = user)
        Mockito.`when`(mockBillDao.updateBillAmount(1, 5000.0)).thenAnswer {
            return@thenAnswer testBill.apply {
                amount = 5000.0
            }
        }
        testBillServices.updateBill(1, 5000.0)
        assertEquals(5000.0, testBill.amount)
    }



}