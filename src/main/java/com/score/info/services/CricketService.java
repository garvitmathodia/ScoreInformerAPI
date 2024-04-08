package com.score.info.services;

import java.util.List;

import com.score.info.entities.Match;

public interface CricketService {

	List<Match> getLiveMatchScores();
    List<List<String>> getCWC2023PointTable();

    List<Match> getAllMatches();
}
