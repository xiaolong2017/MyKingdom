package io.imking.core.mapping;

import io.imking.core.domain.User;
import org.apache.ibatis.jdbc.SQL;

public class UserSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Wed Jan 17 21:43:23 CST 2018
     */
    public String insertSelective(User record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("t_user");
        
        if (record.getId() != null) {
            sql.VALUES("id", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getAccount() != null) {
            sql.VALUES("account", "#{account,jdbcType=VARCHAR}");
        }
        
        if (record.getPwd() != null) {
            sql.VALUES("pwd", "#{pwd,jdbcType=VARCHAR}");
        }
        
        if (record.getRealname() != null) {
            sql.VALUES("realname", "#{realname,jdbcType=VARCHAR}");
        }
        
        if (record.getNickname() != null) {
            sql.VALUES("nickname", "#{nickname,jdbcType=VARCHAR}");
        }
        
        if (record.getQq() != null) {
            sql.VALUES("qq", "#{qq,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.VALUES("email", "#{email,jdbcType=VARCHAR}");
        }
        
        if (record.getWebsite() != null) {
            sql.VALUES("website", "#{website,jdbcType=VARCHAR}");
        }
        
        if (record.getDream() != null) {
            sql.VALUES("dream", "#{dream,jdbcType=VARCHAR}");
        }
        
        if (record.getPoints() != null) {
            sql.VALUES("points", "#{points,jdbcType=INTEGER}");
        }
        
        if (record.getCreditPoints() != null) {
            sql.VALUES("credit_points", "#{creditPoints,jdbcType=INTEGER}");
        }
        
        if (record.getBalance() != null) {
            sql.VALUES("balance", "#{balance,jdbcType=BIGINT}");
        }
        
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_user
     *
     * @mbg.generated Wed Jan 17 21:43:23 CST 2018
     */
    public String updateByPrimaryKeySelective(User record) {
        SQL sql = new SQL();
        sql.UPDATE("t_user");
        
        if (record.getAccount() != null) {
            sql.SET("account = #{account,jdbcType=VARCHAR}");
        }
        
        if (record.getPwd() != null) {
            sql.SET("pwd = #{pwd,jdbcType=VARCHAR}");
        }
        
        if (record.getRealname() != null) {
            sql.SET("realname = #{realname,jdbcType=VARCHAR}");
        }
        
        if (record.getNickname() != null) {
            sql.SET("nickname = #{nickname,jdbcType=VARCHAR}");
        }
        
        if (record.getQq() != null) {
            sql.SET("qq = #{qq,jdbcType=VARCHAR}");
        }
        
        if (record.getEmail() != null) {
            sql.SET("email = #{email,jdbcType=VARCHAR}");
        }
        
        if (record.getWebsite() != null) {
            sql.SET("website = #{website,jdbcType=VARCHAR}");
        }
        
        if (record.getDream() != null) {
            sql.SET("dream = #{dream,jdbcType=VARCHAR}");
        }
        
        if (record.getPoints() != null) {
            sql.SET("points = #{points,jdbcType=INTEGER}");
        }
        
        if (record.getCreditPoints() != null) {
            sql.SET("credit_points = #{creditPoints,jdbcType=INTEGER}");
        }
        
        if (record.getBalance() != null) {
            sql.SET("balance = #{balance,jdbcType=BIGINT}");
        }
        
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }
}