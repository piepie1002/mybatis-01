import com.pie.mybatis.entity.User;
import com.pie.mybatis.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author LIN
 * @since JDK 1.8
 */
public class UserMapperTest {
    public static void main(String[] args) {
        //工厂模式
        //构建者模式
        InputStream is = UserMapperTest.class.getClassLoader().getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
        //原生mybatis 默认为 false 
        SqlSession sqlSession = sqlSessionFactory.openSession(true);
        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
        /*添加用户
        User user = new User();
        user.setuName("admin1");
        user.setuPassword("123456");
        int i = userMapper.insert(user);
        System.out.println(i);*/
        //根据id查询用户
        User user = userMapper.selectById(1);
        System.out.println(user);
    }
}
