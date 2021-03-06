package com.betverdict.berverdict.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.betverdict.berverdict.entities.Tips;


@Repository
public interface TipsRepository extends JpaRepository<Tips, Long> {

	@Query("select t from Tips t where t.date  = :currentDate")
	// List<Tips> findCurrentTips();
	List<Tips> findCurrentTips(@Param("currentDate") Date currentDate);
}

