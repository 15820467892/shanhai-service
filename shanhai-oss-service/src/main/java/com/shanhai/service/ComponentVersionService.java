package com.shanhai.service;


import com.shanhai.domain.ComponentVersion;


public interface ComponentVersionService {

    ComponentVersion findById(int componentId);

    int addOrUpdate(ComponentVersion componentVersion);

}
