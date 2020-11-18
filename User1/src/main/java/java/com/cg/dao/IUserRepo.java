package java.com.cg.dao;
import java.sql.SQLException;
import java.util.List;

import org.apache.catalina.User;
public interface IUserRepo {
public List<User> getAllusername() throws SQLException;
public User addUser(User user) throws SQLException;

}
