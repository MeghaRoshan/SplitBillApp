import dao.UserDao
import main.kotlin.models.controller.UserController
import main.kotlin.models.models.Bill
import main.kotlin.models.service.UserServices
import models.User
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.MockitoAnnotations

class UserServicesTest {

    @Mock
    lateinit var mockUserDao: UserDao
    lateinit var testUserServices: UserServices

    @BeforeEach
    fun init() {
        MockitoAnnotations.initMocks(this)
        testUserServices = UserServices(mockUserDao)
    }

    @Test
    fun `test user creation`() {

        val testUser = User(1, "Megha", "megha@awesome.com")
        Mockito.`when`(mockUserDao.userDaoAdd(testUser)).thenAnswer {
            return@thenAnswer testUser
        }
        val user = testUserServices.addUser(testUser)
        assertEquals(testUser, user)
    }

//    @Test
//    fun `update email test`() {
//        val testUser = User(1, "Megha", "megha@awesome.com")
//        Mockito.`when`(mockUserDao.updateUserEmail(1, "test@test.com")).thenAnswer {
//            return@thenAnswer testUser.apply {
//                email = "test@test.com"
//            }
//        }
//        testUserServices.updateEmail(1, "test@test.com")
//        assertEquals("test@test.com", testUser.email)
//    }


}


