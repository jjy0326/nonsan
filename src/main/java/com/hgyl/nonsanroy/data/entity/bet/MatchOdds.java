package com.hgyl.nonsanroy.data.entity.bet;

import com.hgyl.nonsanroy.data.entity.BaseEntity;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

/**
 * @classNote 경기 내기 관련 Entity
 * @author 명원식
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Table(name = "matchOdds")
public class MatchOdds extends BaseEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer gameNo;

	@Column(nullable = false)
	private double awayTeamOdds;

	@Column(nullable = false)
	private double homeTeamOdds;

	@Column(nullable = false)
	private double winningPot;

}
