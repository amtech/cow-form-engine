package org.ljk.zodiac.cow.form.engine.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.ljk.zodiac.cow.form.engine.model.Order;
import org.ljk.zodiac.cow.form.engine.model.OrderExample;

public interface OrderMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated
     */
    int countByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated
     */
    int deleteByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated
     */
    @Delete({
        "delete from order",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated
     */
    @Insert({
        "insert into order (id, order_no, ",
        "order_amount, order_address, ",
        "commodity_no, commoditf_quantity, ",
        "order_date, order_payer)",
        "values (#{id,jdbcType=BIGINT}, #{orderNo,jdbcType=VARCHAR}, ",
        "#{orderAmount,jdbcType=DOUBLE}, #{orderAddress,jdbcType=VARCHAR}, ",
        "#{commodityNo,jdbcType=VARCHAR}, #{commoditfQuantity,jdbcType=INTEGER}, ",
        "#{orderDate,jdbcType=TIMESTAMP}, #{orderPayer,jdbcType=VARCHAR})"
    })
    int insert(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated
     */
    int insertSelective(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated
     */
    List<Order> selectByExample(OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated
     */
    @Select({
        "select",
        "id, order_no, order_amount, order_address, commodity_no, commoditf_quantity, ",
        "order_date, order_payer",
        "from order",
        "where id = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("BaseResultMap")
    Order selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") Order record, @Param("example") OrderExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(Order record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order
     *
     * @mbggenerated
     */
    @Update({
        "update order",
        "set order_no = #{orderNo,jdbcType=VARCHAR},",
          "order_amount = #{orderAmount,jdbcType=DOUBLE},",
          "order_address = #{orderAddress,jdbcType=VARCHAR},",
          "commodity_no = #{commodityNo,jdbcType=VARCHAR},",
          "commoditf_quantity = #{commoditfQuantity,jdbcType=INTEGER},",
          "order_date = #{orderDate,jdbcType=TIMESTAMP},",
          "order_payer = #{orderPayer,jdbcType=VARCHAR}",
        "where id = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Order record);
}