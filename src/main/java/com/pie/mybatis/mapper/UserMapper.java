package com.pie.mybatis.mapper;

import com.pie.mybatis.entity.User;
import org.apache.ibatis.annotations.Param;

/**
 * @author LIN
 * @since JDK 1.8
 */
public interface UserMapper {
    /**
     * @param user  添加用户
     * @return     返回影响行数
     */
    int insert(@Param("user")User user);

    /**
     * 
     * @param uId 根据id查询
     * @return    用户信息
     */
    User selectById(@Param("uId") int uId);
}
