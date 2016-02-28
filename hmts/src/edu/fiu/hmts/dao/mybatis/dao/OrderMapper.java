package edu.fiu.hmts.dao.mybatis.dao;

import edu.fiu.hmts.domain.Order;
import edu.fiu.hmts.domain.OrderExample;
import edu.fiu.hmts.domain.OrderKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    int countByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    int deleteByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    int deleteByPrimaryKey(OrderKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    int insert(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    int insertSelective(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    List<Order> selectByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    Order selectByPrimaryKey(OrderKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    int updateByPrimaryKeySelective(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated Sun Feb 28 12:46:23 EST 2016
     */
    int updateByPrimaryKey(Order record);
}