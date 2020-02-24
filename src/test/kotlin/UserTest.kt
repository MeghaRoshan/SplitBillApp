import org.junit.Test
import org.junit.jupiter.api.Test
import models.User

class UserTest {

    @Mock
    private lateinit var user: User

    @BeforeEach
    fun init(){
        var user = User()
    }
    @Test
    fun 'test user creation'(){
        val mockedUser=user(1, "megha", "megharoshan21@gmail.com", 2000.0, 0.0)



    }


}