/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: GroupService
 * Author:   meng
 * Date:     2018/7/22 15:27
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wust.job.service;

import com.wust.job.entity.Group;
import com.wust.job.mapper.IGroupMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author meng
 * @create 2018/7/22
 * @since 1.0.0
 */

@Service
public class GroupService {

    private IGroupMapper iGroupMapper;


    @Autowired
    public GroupService(IGroupMapper iGroupMapper) {
        this.iGroupMapper = iGroupMapper;
    }


    public List<Group> getAllGroup(){

        List<Group> groups = iGroupMapper.getAllGroup();
        if(groups != null){
            return groups;
        }

        return null;

    }

    public List<Group> getMyGroup(String username){
        List<Group> groups = iGroupMapper.getMyGroup(username);
        if(groups != null){
            return groups;
        }
        return null;
    }

    public boolean deleteOneRealationship(String username){
        if(iGroupMapper.deleteOneRealationship(username)>0){
            return true;
        }
        return false;
    }
}