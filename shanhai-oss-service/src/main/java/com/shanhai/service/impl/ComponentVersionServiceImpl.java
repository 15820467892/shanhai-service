package com.shanhai.service.impl;

import com.shanhai.dao.ComponentVersionMapper;
import com.shanhai.domain.ComponentVersion;
import com.shanhai.service.ComponentVersionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;


@Service
public class ComponentVersionServiceImpl implements ComponentVersionService {

    @Autowired
    private ComponentVersionMapper componentVersionMapper;

    @Override
    public ComponentVersion findById(int versionId) {
        return componentVersionMapper.findById(versionId);
    }

    @Override
    public ComponentVersion findByGAV(String groupId, String artifactId, String version) {
        return componentVersionMapper.findByGAV(groupId,artifactId,version);
    }

    @Override
    public int addOrUpdate(ComponentVersion componentVersion) {

        ComponentVersion versionExist=componentVersionMapper.findByGAV(componentVersion.getGroupId(),componentVersion.getArtifactId(),componentVersion.getVersion());
        componentVersion.setUpdateDate(new Date());
        if(versionExist==null){
            componentVersion.setCreateDate(new Date());
            return componentVersionMapper.insert(componentVersion);  //新增
        }
        else{
            componentVersion.setCreateDate(versionExist.getCreateDate());
            return componentVersionMapper.update(componentVersion);
        }
    }

    @Override
    public int update(ComponentVersion version) {
        return componentVersionMapper.update(version);
    }


}
