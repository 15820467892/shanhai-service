package com.shanhai.dao;

import com.shanhai.domain.Video;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;



@Repository
public interface VideoMapper {

    @Select("select * from video where id=#{videoId}")
    Video findById(@Param("videoId") int videoId);


}
