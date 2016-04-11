package edu.fiu.hmts.dao.hmts_repos;

import edu.fiu.hmts.domain.hmts_repos.Card;
import edu.fiu.hmts.domain.hmts_repos.CardExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * The Interface CardMapper.
 */
public interface CardMapper {
    
    /**
	 * Count by example.
	 *
	 * @param example
	 *            the example
	 * @return the int
	 */
    int countByExample(CardExample example);

    /**
	 * Delete by example.
	 *
	 * @param example
	 *            the example
	 * @return the int
	 */
    int deleteByExample(CardExample example);

    /**
	 * Delete by primary key.
	 *
	 * @param cardId
	 *            the card id
	 * @return the int
	 */
    int deleteByPrimaryKey(Long cardId);

    /**
	 * Insert.
	 *
	 * @param record
	 *            the record
	 * @return the int
	 */
    int insert(Card record);

    /**
	 * Insert selective.
	 *
	 * @param record
	 *            the record
	 * @return the int
	 */
    int insertSelective(Card record);

    /**
	 * Query by example.
	 *
	 * @param example
	 *            the example
	 * @return the list
	 */
    List<Card> selectByExample(CardExample example);

    /**
	 * Query by primary key.
	 *
	 * @param cardId
	 *            the card id
	 * @return the card
	 */
    Card selectByPrimaryKey(Long cardId);

    /**
	 * Update by example selective.
	 *
	 * @param record
	 *            the record
	 * @param example
	 *            the example
	 * @return the int
	 */
    int updateByExampleSelective(@Param("record") Card record, @Param("example") CardExample example);

    /**
	 * Update by example.
	 *
	 * @param record
	 *            the record
	 * @param example
	 *            the example
	 * @return the int
	 */
    int updateByExample(@Param("record") Card record, @Param("example") CardExample example);

    /**
	 * Update by primary key selective.
	 *
	 * @param record
	 *            the record
	 * @return the int
	 */
    int updateByPrimaryKeySelective(Card record);

    /**
	 * Update by primary key.
	 *
	 * @param record
	 *            the record
	 * @return the int
	 */
    int updateByPrimaryKey(Card record);
}