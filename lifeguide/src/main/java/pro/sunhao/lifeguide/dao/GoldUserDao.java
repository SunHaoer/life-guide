package pro.sunhao.lifeguide.dao;

import org.springframework.stereotype.Repository;
import pro.sunhao.lifeguide.pojo.GoldUser;

import java.util.List;

@Repository
public interface GoldUserDao {

    List<GoldUser> selectUserAll();

}
