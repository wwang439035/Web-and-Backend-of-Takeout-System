package edu.fiu.hmts.dao;

import edu.fiu.hmts.domain.Card;
import edu.fiu.hmts.domain.CardExample;
import edu.fiu.hmts.domain.CardKey;
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
	 * @param key
	 *            the key
	 * @return the int
	 */
    int deleteByPrimaryKey(CardKey key);

    
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
	 * @param key
	 *            the key
	 * @return the card
	 */
    Card selectByPrimaryKey(CardKey key);

    
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