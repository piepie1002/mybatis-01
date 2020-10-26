package com.pie.mybatis.mapper;

import com.pie.mybatis.entity.Test;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author LIN
 * @since JDK 1.8
 */
public interface TestMapper {
    Test selectByID(@Param("id") Integer id);
    int insert(@Param("test") Test test);
    
    List<Test>selectList(@Param("start") Integer start, @Param("size") Integer size);
}
