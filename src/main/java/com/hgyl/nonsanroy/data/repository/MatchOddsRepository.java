package com.hgyl.nonsanroy.data.repository;

import com.hgyl.nonsanroy.data.entity.bet.MatchOdds;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @classNote SportsMatchRepository Pattern for interacting with DB
 * @author 명원식
 */

public interface MatchOddsRepository extends JpaRepository<MatchOdds, Integer> {
}
