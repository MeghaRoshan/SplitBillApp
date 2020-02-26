import dao.UserDao
import main.kotlin.models.controller.UserController
import main.kotlin.models.models.Bill
import main.kotlin.models.service.UserServices

import models.User
import org.junit.Test
import org.junit.Assert.*
import org.junit.jupiter.api.BeforeEach
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class UserServicesTest {

    @Mock private lateinit var mockUserDao: UserDao
    private lateinit var testUserServices: UserServices

    @BeforeEach
    fun init() {
        MockitoAnnotations.initMocks(this)
        testUserServices = UserServices(mockUserDao)
    }

    @Test
    fun `test user creation`() {
//        val testUserServices = UserServices(mockUserDao)
//        assertTrue(testUserServices.getUserList().isEmpty())
//        val testUser = User(1, "Megha", "megha@awesome.com")
//        testUserServices.addUser(testUser)
//        assertEquals(1, testUserServices.getUserList().size)
//        assertNotNull(testUserServices.getUser(testUser.userId))
//        assertEquals(testUser, testUserServices.getUser(testUser.userId))
        val testUser = User(1, "Megha", "megha@awesome.com")
        Mockito.`when`(mockUserDao.userDaoAdd(testUser)).thenAnswer {
            return@thenAnswer testUser
        }
        val user = testUserServices.addUser(testUser)
        assertEquals(testUser, user)
    }

    @Test
    fun `update email test`() {
        val testUser = User(1, "Megha", "megha@awesome.com")
        Mockito.`when`(mockUserDao.updateUserEmail(1, "test@test.com")).thenAnswer {
            return@thenAnswer testUser.apply {
                email = "test@test.com"
            }
        }
        testUserServices.updateEmail(1, "test@test.com")
        assertEquals("test@test.com", testUser.email)
    }

//    @Test
//    fun `test bill creation`() {
//        val testUserServices = UserServices()
//        assertTrue(testUserServices.getBillsList().isEmpty())
//        val testBill = Bill(1, "lunch",
//            amount = 100.0,
//            payee = User(1, "Megha", "megha@awesome.com")
//        )
//        testUserServices.addBill(testBill)
//        assertEquals(1, testUserServices.getBillsList().size)
//        assertNotNull(testUserServices.getBill(testBill.billId))
//        assertEquals(testBill, testUserServices.getBill(testBill.billId))
//    }
//    @Test
//    fun `test delete bill`(){
//        val testUserServices = UserServices()
//        assertTrue(testUserServices.getBillsList().isEmpty())
//        val testBill = Bill(1, "lunch",
//            amount = 100.0,
//            payee = User(1, "Megha", "megha@awesome.com")
//        )
//        testUserServices.addBill(testBill)
//        testUserServices.deleteBill(1)
//        assertEquals(0, testUserServices.getBillsList().size)
//    }
//    @Test
//    fun `test delete user`(){
//        val testUserServices = UserServices()
//        assertTrue(testUserServices.getUserList().isEmpty())
//        val testUser = User(1, "Megha", "megha@awesome.com")
//        testUserServices.addUser(testUser)
//        testUserServices.deleteUser(1)
//        assertEquals(0, testUserServices.getUserList().size)
//    }
//    @Test
//    fun `test create user route`(){
//        val testController = UserController()
//        assertEquals(2, testController.getUserList().size)
//    }
}