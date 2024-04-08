package com.score.info.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.score.info.entities.Match;

public interface MatchRepo extends JpaRepository<Match, Integer>{

	 Optional<Match> findByTeamHeading(String teamHeading);
}
