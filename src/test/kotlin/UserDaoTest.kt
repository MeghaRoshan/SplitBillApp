import io.ebean.DB
import models.User
import org.junit.Test

class UserDaoTest {
    @Test
    fun insert_update_delete(){
        val user1= User(1, "Megha", "megharoshan21@gmail.com")
        DB.save(user1)
        var found = DB.find(User::class.java, 1)
        DB.delete(found)
    }
}