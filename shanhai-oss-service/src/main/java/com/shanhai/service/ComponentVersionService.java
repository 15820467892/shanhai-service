package com.shanhai.service;


import com.shanhai.domain.ComponentVersion;


public interface ComponentVersionService {

    ComponentVersion findById(int componentId);

    ComponentVersion findByGAV(String groupId,String artifactId,String version);

    int addOrUpdate(ComponentVersion componentVersion);

    int update(ComponentVersion componentVersion);

}
