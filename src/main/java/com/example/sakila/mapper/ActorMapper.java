package com.example.sakila.mapper;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.example.sakila.vo.Actor;

@Mapper
public interface ActorMapper {
	List<Actor> selectActorList(Map<String, Object> map);
	
	int insertActor(Actor actor);
}
