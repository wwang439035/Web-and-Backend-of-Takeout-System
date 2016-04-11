package edu.fiu.hmts.dao;

import edu.fiu.hmts.domain.OrderProduct;
import edu.fiu.hmts.domain.OrderProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderProductMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderproduct
     *
     * @mbggenerated Sun Apr 10 20:24:21 EDT 2016
     */
    int countByExample(OrderProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderproduct
     *
     * @mbggenerated Sun Apr 10 20:24:21 EDT 2016
     */
    int deleteByExample(OrderProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderproduct
     *
     * @mbggenerated Sun Apr 10 20:24:21 EDT 2016
     */
    int deleteByPrimaryKey(Long orderproductId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderproduct
     *
     * @mbggenerated Sun Apr 10 20:24:21 EDT 2016
     */
    int insert(OrderProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderproduct
     *
     * @mbggenerated Sun Apr 10 20:24:21 EDT 2016
     */
    int insertSelective(OrderProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderproduct
     *
     * @mbggenerated Sun Apr 10 20:24:21 EDT 2016
     */
    List<OrderProduct> selectByExample(OrderProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderproduct
     *
     * @mbggenerated Sun Apr 10 20:24:21 EDT 2016
     */
    OrderProduct selectByPrimaryKey(Long orderproductId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderproduct
     *
     * @mbggenerated Sun Apr 10 20:24:21 EDT 2016
     */
    int updateByExampleSelective(@Param("record") OrderProduct record, @Param("example") OrderProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderproduct
     *
     * @mbggenerated Sun Apr 10 20:24:21 EDT 2016
     */
    int updateByExample(@Param("record") OrderProduct record, @Param("example") OrderProductExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderproduct
     *
     * @mbggenerated Sun Apr 10 20:24:21 EDT 2016
     */
    int updateByPrimaryKeySelective(OrderProduct record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table orderproduct
     *
     * @mbggenerated Sun Apr 10 20:24:21 EDT 2016
     */
    int updateByPrimaryKey(OrderProduct record);
}