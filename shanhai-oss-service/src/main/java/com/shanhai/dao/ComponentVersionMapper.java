package com.shanhai.dao;

import com.shanhai.domain.ComponentVersion;
import com.shanhai.domain.Video;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;


@Repository
public interface ComponentVersionMapper {

    @Select("select * from component_version where id=#{versionId}")
    ComponentVersion findById(@Param("versionId") int versionId);

    @Select("select * from component_version where group_id=#{groupId} and artifact_id=#{artifactId} and version=#{version}")
    ComponentVersion findByGAV(@Param("groupId") String groupId,   @Param("artifactId") String artifactId,   @Param("version") String version);



    @Insert("   INSERT INTO `component_version` (\n" +
            "     `group_id`,\n" +
            "     `artifact_id`,\n" +
            "     `version`,\n" +
            "     `component_id`,\n" +
            "     `categories`,\n" +
            "     `organization`,\n" +
            "     `home_page`,\n" +
            "     `license`,\n" +
            "     `souce_link`,\n" +
            "     `files_link`,\n" +
            "     `pom_xml`,\n" +
            "     `release_date`,\n" +
            "     `create_date`,\n" +
            "     `update_date`)\n" +
            "     VALUES (\n" +
            "        #{groupId,jdbcType=VARCHAR},\n" +
            "        #{artifactId,jdbcType=VARCHAR},\n" +
            "        #{version,jdbcType=VARCHAR},\n" +
            "        #{componentId,jdbcType=INTEGER},\n" +
            "        #{categories,jdbcType=VARCHAR},\n" +
            "        #{organization,jdbcType=VARCHAR},\n" +
            "        #{homePage,jdbcType=VARCHAR},\n" +
            "        #{license,jdbcType=VARCHAR},\n" +
            "        #{souceLink,jdbcType=VARCHAR},\n" +
            "        #{filesLink,jdbcType=VARCHAR},\n" +
            "        #{pomXml,jdbcType=VARCHAR},\n" +
            "        #{releaseDate,jdbcType=TIMESTAMP},\n" +
            "        #{createDate,jdbcType=TIMESTAMP},\n" +
            "        #{updateDate,jdbcType=TIMESTAMP}\n" +
            "     )")
    int insert(ComponentVersion componentVersion);


    @Update("   UPDATE  `component_version` set " +
            "     `component_id`=#{componentId,jdbcType=INTEGER}," +
            "     `categories`= #{categories,jdbcType=VARCHAR}," +
            "     `organization`=#{organization,jdbcType=VARCHAR}," +
            "     `home_page`=#{homePage,jdbcType=VARCHAR}," +
            "     `license`=#{license,jdbcType=VARCHAR}," +
            "     `souce_link`=#{souceLink,jdbcType=VARCHAR}," +
            "     `files_link`=#{filesLink,jdbcType=VARCHAR}," +
            "     `pom_xml`=#{pomXml,jdbcType=VARCHAR}," +
            "     `release_date`=#{releaseDate,jdbcType=TIMESTAMP}," +
            "     `create_date`=#{createDate,jdbcType=TIMESTAMP}," +
            "     `update_date`=#{updateDate,jdbcType=TIMESTAMP}" +
            "    where group_id=#{groupId} and artifact_id=#{artifactId} and version=#{version}  " +
            "     ")
    int update(ComponentVersion componentVersion);



}
