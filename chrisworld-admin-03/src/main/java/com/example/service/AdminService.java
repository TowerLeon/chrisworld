/**
 * FileName: AdminService
 * Author:   Lenovo
 * Date:     9/7/2018 6:33 PM
 * Description:
 * History:
 */
package com.example.service;

import java.util.List;

import com.example.model.Admin;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;



@Mapper
public interface AdminService {

    @Select("SELECT * FROM `test`.`admin` where userName = #{userName} and password = #{password} and state = 0;")
    Admin findByNameAndPassword(Admin admin);

    @Select("SELECT * FROM `test`.`admin` where userName = #{userName} and password = #{password} and realName = #{realName}")
    List<Admin> findByAdminWithPage(Admin admin, int start, int end);

    @Insert("INSERT INTO `test`.`admin` (`id`, `userName`, `password`, `realName`, `age`, `phoneNumber`, `headPicture`, `addDate`, `updateDate`, `state`) VALUES (null, #{userName}, #{password}, #{realName}, #{age}, #{phoneNumber}, #{headPicture}, now(), now(), 0);")
    int insert(Admin admin);

    @Update("UPDATE `test`.`admin` SET `userName` = #{userName}, `password` = #{password}, `realName` = #{realName}, `age` = #{age}, `phoneNumber` = #{phoneNumber}, `headPicture` = #{headPicture}, `updateDate` = now(), `state` = #{state} WHERE `id` = #{id};")
    int updateStateById(int id);

    @Delete("DELETE FROM `test`.`admin` WHERE id  = #{id}")
    int deleteById(int id);
}

