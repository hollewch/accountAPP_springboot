package com.example.mapper;

import com.example.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wch的个人理财通
 * @since 2020-10-30
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

}
