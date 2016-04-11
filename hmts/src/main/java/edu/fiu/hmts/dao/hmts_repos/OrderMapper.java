package edu.fiu.hmts.dao.hmts_repos;

import edu.fiu.hmts.domain.hmts_repos.Order;
import edu.fiu.hmts.domain.hmts_repos.OrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

/**
 * The Interface OrderMapper.
 */
public interface OrderMapper {
    
    /**
	 * Count by example.
	 *
	 * @param example
	 *            the example
	 * @return the int
	 */
    int countByExample(OrderExample example);

    /**
	 * Delete by example.
	 *
	 * @param example
	 *            the example
	 * @return the int
	 */
    int deleteByExample(OrderExample example);

    /**
	 * Delete by primary key.
	 *
	 * @param orderId
	 *            the order id
	 * @return the int
	 */
    int deleteByPrimaryKey(Long orderId);

    /**
	 * Insert.
	 *
	 * @param record
	 *            the record
	 * @return the int
	 */
    int insert(Order record);

    /**
	 * Insert selective.
	 *
	 * @param record
	 *            the record
	 * @return the int
	 */
    int insertSelective(Order record);

    /**
	 * Query by example.
	 *
	 * @param example
	 *            the example
	 * @return the list
	 */
    List<Order> selectByExample(OrderExample example);

    /**
	 * Query by primary key.
	 *
	 * @param orderId
	 *            the order id
	 * @return the order
	 */
    Order selectByPrimaryKey(Long orderId);

    /**
	 * Update by example selective.
	 *
	 * @param record
	 *            the record
	 * @param example
	 *            the example
	 * @return the int
	 */
    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    /**
	 * Update by example.
	 *
	 * @param record
	 *            the record
	 * @param example
	 *            the example
	 * @return the int
	 */
    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    /**
	 * Update by primary key selective.
	 *
	 * @param record
	 *            the record
	 * @return the int
	 */
    int updateByPrimaryKeySelective(Order record);

    /**
	 * Update by primary key.
	 *
	 * @param record
	 *            the record
	 * @return the int
	 */
    int updateByPrimaryKey(Order record);
}