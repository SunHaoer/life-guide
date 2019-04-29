package pro.sunhao.goldguide.dao;

import org.springframework.stereotype.Repository;
import pro.sunhao.goldguide.pojo.User;

import java.util.List;

@Repository
public interface UserDao {

    List<User> selectUserAll();

}
