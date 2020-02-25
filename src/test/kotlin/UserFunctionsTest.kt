import main.kotlin.models.controller.TestController
import main.kotlin.models.models.Bill
import main.kotlin.models.service.UserFunctions
import models.User
import org.junit.Test
import org.junit.Assert.*

class UserFunctionsTest {

    @Test
    fun `test user creation`() {
        val testUserFunctions = UserFunctions()
        assertTrue(testUserFunctions.getUserList().isEmpty())
        val testUser = User(1, "Megha", "megha@awesome.com")
        testUserFunctions.addUser(testUser)
        assertEquals(1, testUserFunctions.getUserList().size)
        assertNotNull(testUserFunctions.getUser(testUser.userId))
        assertEquals(testUser, testUserFunctions.getUser(testUser.userId))
    }

    @Test
    fun `test bill creation`() {
        val testUserFunctions = UserFunctions()
        assertTrue(testUserFunctions.getBillsList().isEmpty())
        val testBill = Bill(1, "lunch",
            amount = 100.0,
            payee = User(1, "Megha", "megha@awesome.com")
        )
        testUserFunctions.addBill(testBill)
        assertEquals(1, testUserFunctions.getBillsList().size)
        assertNotNull(testUserFunctions.getBill(testBill.billId))
        assertEquals(testBill, testUserFunctions.getBill(testBill.billId))
    }
    @Test
    fun `test delete bill`(){
        val testUserFunctions = UserFunctions()
        assertTrue(testUserFunctions.getBillsList().isEmpty())
        val testBill = Bill(1, "lunch",
            amount = 100.0,
            payee = User(1, "Megha", "megha@awesome.com")
        )
        testUserFunctions.addBill(testBill)
        testUserFunctions.deleteBill(1)
        assertEquals(0, testUserFunctions.getBillsList().size)
    }
    @Test
    fun `test delete user`(){
        val testUserFunctions = UserFunctions()
        assertTrue(testUserFunctions.getUserList().isEmpty())
        val testUser = User(1, "Megha", "megha@awesome.com")
        testUserFunctions.addUser(testUser)
        testUserFunctions.deleteUser(1)
        assertEquals(0, testUserFunctions.getUserList().size)
    }
    @Test
    fun `test create user route`(){
        val testController = TestController()
        assertEquals(2, testController.getUserList().size)
    }
}