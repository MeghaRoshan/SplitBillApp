import dao.UserDao
import dao.BillDao
import io.ebean.Database
import main.kotlin.models.service.BillServices
import org.junit.Test
import org.junit.jupiter.api.BeforeEach
import org.mockito.Mock
import org.mockito.MockitoAnnotations

class UserDaoTest {
//    private lateinit var billDao: BillDao
//    private lateinit var userDao: UserDao
    @Mock private lateinit var database: Database
    private lateinit var userDao: UserDao

    @BeforeEach
    fun init(){
        MockitoAnnotations.initMocks(this)
        userDao = UserDao(database)
    }


    @Test
    fun userDaoAddTest(){
//        val user1= User(1, "Megha", "megharoshan21@gmail.com")
//        DB.save(user1)
//        var found = DB.find(User::class.java, 1)
//        DB.delete(found)
    }
}