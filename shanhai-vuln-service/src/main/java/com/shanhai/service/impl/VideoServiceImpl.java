package com.shanhai.service.impl;

import com.shanhai.dao.VideoMapper;
import com.shanhai.domain.Video;
import com.shanhai.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class VideoServiceImpl implements VideoService {

    @Autowired
    private VideoMapper videoMapper;

    @Override
    public Video findById(int videoId) {
        return videoMapper.findById(videoId);
    }

}
