package com.arcesium.archetypewar.dao;

import org.apache.ibatis.annotations.Param;

import com.arcesium.archetypewar.domain.SomeObject;

public interface SomeMapper {

    SomeObject getSomeObject(@Param("id") int id);
}
