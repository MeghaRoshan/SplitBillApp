import dao.BillDao
import dao.UserDao
import io.ebean.DB
import main.kotlin.models.controller.BillController
import main.kotlin.models.controller.UserController
import main.kotlin.models.models.Bill
import main.kotlin.models.service.BillServices
import main.kotlin.models.service.UserServices
import models.User
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class Test {
    val database = DB.getDefault()
    val userDao = UserDao(database)
    val billsDao = BillDao(database)

    val userServices = UserServices(userDao)
    val billServices = BillServices(billsDao)

    val billController = BillController(billServices)
    val userController = UserController(userServices)

    @Test
    fun `test user creation`() {
        val testUserServices = UserServices(userDao)
        assertTrue(testUserServices.getUserList().isEmpty())
        val testUser = User(1, "Megha", "megha@awesome.com")
        testUserServices.addUser(testUser)
        assertEquals(1, testUserServices.getUserList().size)
        assertNotNull(testUserServices.getUser(testUser.userId))
        assertEquals(testUser, testUserServices.getUser(testUser.userId))
      @Test
    fun `test bill creation`() {
        val testBillServices = BillServices(billsDao)
        assertTrue(testBillServices.getBillsList().isEmpty())
        val testBill = Bill(1, "lunch",
            amount = 100.0,
            payee = User(1, "Megha", "megha@awesome.com")
        )
        testBillServices.addBill(testBill)
        assertEquals(1, testBillServices.getBillsList().size)
        assertNotNull(testBillServices.getBill(testBill.billId))
        assertEquals(testBill, testBillServices.getBill(testBill.billId))
    }
    @Test
    fun `test delete bill`(){
        val testBillServices = BillServices(billsDao)
        assertTrue(testBillServices.getBillsList().isEmpty())
        val testBill = Bill(1, "lunch",
            amount = 100.0,
            payee = User(1, "Megha", "megha@awesome.com")
        )
        testBillServices.addBill(testBill)
        testBillServices.deleteBill(1)
        assertEquals(0, testBillServices.getBillsList().size)
    }
    @Test
    fun `test delete user`(){
        val testUserServices = UserServices(userDao)
        assertTrue(testUserServices.getUserList().isEmpty())
        val testUser = User(1, "Megha", "megha@awesome.com")
        testUserServices.addUser(testUser)
        testUserServices.deleteUser(1)
        assertEquals(0, testUserServices.getUserList().size)
    }
    @Test
    fun `test create user route`(){
        val userController = UserController(userServices)
        assertEquals(2, userController.getUserList().size)
    }
    }}