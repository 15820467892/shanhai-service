package com.shanhai.controller;


import com.shanhai.domain.ComponentVersion;
import com.shanhai.domain.Video;
import com.shanhai.service.ComponentVersionService;

import com.shanhai.utils.JsonData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;


@RestController
@RequestMapping("api/v1/comp_v")
public class ComponentVersionController {

    @Autowired
    private ComponentVersionService componentVersionService;


    @RequestMapping("find")
    public Object findById(int versionId, HttpServletRequest request){
        ComponentVersion componentVersion = componentVersionService.findById(versionId);
        return JsonData.buildSuccess(componentVersion);
    }

    @RequestMapping("findgav")
    public Object findGav(String groupId, String artifactId, String version , HttpServletRequest request){
        ComponentVersion componentVersion = componentVersionService.findByGAV(groupId,artifactId,version);
        return JsonData.buildSuccess(componentVersion);
    }



    @PostMapping("publish")
    public JsonData addOrUpdate(@RequestBody ComponentVersion componentVersion){

        if(componentVersionService.addOrUpdate(componentVersion)==1){
            return JsonData.buildSuccess("success");
        }
        return JsonData.buildError("fail:"+componentVersion.toString());
    }
}
