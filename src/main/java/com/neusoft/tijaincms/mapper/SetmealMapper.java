package com.neusoft.tijaincms.mapper;

import com.neusoft.tijaincms.po.Setmeal;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface SetmealMapper {
    @Select("select * from setmeal order by smId")
    public List<Setmeal> listSetmeal();
}
