package com.shanhai.service.impl;

import com.shanhai.dao.ComponentVersionMapper;
import com.shanhai.domain.ComponentVersion;
import com.shanhai.service.ComponentVersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ComponentVersionServiceImpl implements ComponentVersionService {

    @Autowired
    private ComponentVersionMapper componentVersionMapper;

    @Override
    public ComponentVersion findById(int versionId) {
        return componentVersionMapper.findById(versionId);
    }

    @Override
    public int addOrUpdate(ComponentVersion componentVersion) {
        //TODO ：判断是否存在，基于三坐标
        return componentVersionMapper.insert(componentVersion);
    }


}
