import com.google.errorprone.annotations.DoNotMock
import dao.UserDao
import io.ebean.DB
import main.kotlin.models.Dao.BillDao
import main.kotlin.models.service.BillServices
import models.User
import org.junit.Test
import org.junit.jupiter.api.BeforeEach
import org.mockito.Mock
import org.mockito.MockitoAnnotations

class UserDaoTest {
    @Mock
    private lateinit var billDao: BillDao
    private lateinit var userDao: UserDao

    @BeforeEach
    fun init(){
        MockitoAnnotations.initMocks(this)
        val billServices = BillServices(billDao)
    }


    @Test
    fun userDaoAddTest(){
//        val user1= User(1, "Megha", "megharoshan21@gmail.com")
//        DB.save(user1)
//        var found = DB.find(User::class.java, 1)
//        DB.delete(found)

    }
}