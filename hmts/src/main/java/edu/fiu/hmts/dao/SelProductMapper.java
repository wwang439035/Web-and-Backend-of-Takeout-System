package edu.fiu.hmts.dao;

import edu.fiu.hmts.domain.SelProduct;
import edu.fiu.hmts.domain.SelProductExample;
import edu.fiu.hmts.domain.SelProductKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * The Interface SelProductMapper.
 */
public interface SelProductMapper {
    
    /**
	 * Count by example.
	 *
	 * @param example
	 *            the example
	 * @return the int
	 */
    int countByExample(SelProductExample example);

    /**
	 * Delete by example.
	 *
	 * @param example
	 *            the example
	 * @return the int
	 */
    int deleteByExample(SelProductExample example);

    /**
	 * Delete by primary key.
	 *
	 * @param key
	 *            the key
	 * @return the int
	 */
    int deleteByPrimaryKey(SelProductKey key);

    /**
	 * Insert.
	 *
	 * @param record
	 *            the record
	 * @return the int
	 */
    int insert(SelProduct record);

    /**
	 * Insert selective.
	 *
	 * @param record
	 *            the record
	 * @return the int
	 */
    int insertSelective(SelProduct record);

    /**
	 * Query by example.
	 *
	 * @param example
	 *            the example
	 * @return the list
	 */
    List<SelProduct> selectByExample(SelProductExample example);

    /**
	 * Query by primary key.
	 *
	 * @param key
	 *            the key
	 * @return the sel product
	 */
    SelProduct selectByPrimaryKey(SelProductKey key);

    /**
	 * Update by example selective.
	 *
	 * @param record
	 *            the record
	 * @param example
	 *            the example
	 * @return the int
	 */
    int updateByExampleSelective(@Param("record") SelProduct record, @Param("example") SelProductExample example);

    /**
	 * Update by example.
	 *
	 * @param record
	 *            the record
	 * @param example
	 *            the example
	 * @return the int
	 */
    int updateByExample(@Param("record") SelProduct record, @Param("example") SelProductExample example);

    /**
	 * Update by primary key selective.
	 *
	 * @param record
	 *            the record
	 * @return the int
	 */
    int updateByPrimaryKeySelective(SelProduct record);

    /**
	 * Update by primary key.
	 *
	 * @param record
	 *            the record
	 * @return the int
	 */
    int updateByPrimaryKey(SelProduct record);
}