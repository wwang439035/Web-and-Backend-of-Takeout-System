package edu.fiu.hmts.dao;

import edu.fiu.hmts.domain.OrderProduct;
import edu.fiu.hmts.domain.OrderProductExample;
import edu.fiu.hmts.domain.OrderProductKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * The Interface OrderProductMapper.
 */
public interface OrderProductMapper {
    
    /**
	 * Count by example.
	 *
	 * @param example
	 *            the example
	 * @return the int
	 */
    int countByExample(OrderProductExample example);

    /**
	 * Delete by example.
	 *
	 * @param example
	 *            the example
	 * @return the int
	 */
    int deleteByExample(OrderProductExample example);

    /**
	 * Delete by primary key.
	 *
	 * @param key
	 *            the key
	 * @return the int
	 */
    int deleteByPrimaryKey(OrderProductKey key);

    /**
	 * Insert.
	 *
	 * @param record
	 *            the record
	 * @return the int
	 */
    int insert(OrderProduct record);

    /**
	 * Insert selective.
	 *
	 * @param record
	 *            the record
	 * @return the int
	 */
    int insertSelective(OrderProduct record);

    /**
	 * Query by example.
	 *
	 * @param example
	 *            the example
	 * @return the list
	 */
    List<OrderProduct> selectByExample(OrderProductExample example);

    /**
	 * Query by primary key.
	 *
	 * @param key
	 *            the key
	 * @return the order product
	 */
    OrderProduct selectByPrimaryKey(OrderProductKey key);

    /**
	 * Update by example selective.
	 *
	 * @param record
	 *            the record
	 * @param example
	 *            the example
	 * @return the int
	 */
    int updateByExampleSelective(@Param("record") OrderProduct record, @Param("example") OrderProductExample example);

    /**
	 * Update by example.
	 *
	 * @param record
	 *            the record
	 * @param example
	 *            the example
	 * @return the int
	 */
    int updateByExample(@Param("record") OrderProduct record, @Param("example") OrderProductExample example);

    /**
	 * Update by primary key selective.
	 *
	 * @param record
	 *            the record
	 * @return the int
	 */
    int updateByPrimaryKeySelective(OrderProduct record);

    /**
	 * Update by primary key.
	 *
	 * @param record
	 *            the record
	 * @return the int
	 */
    int updateByPrimaryKey(OrderProduct record);
}