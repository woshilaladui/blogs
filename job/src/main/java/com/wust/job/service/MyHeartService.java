/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: MyHeartService
 * Author:   meng
 * Date:     2018/7/21 9:41
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wust.job.service;

import com.wust.job.entity.Heart;
import com.wust.job.mapper.IMyHeartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author meng
 * @create 2018/7/21
 * @since 1.0.0
 */
@Service
public class MyHeartService {

    private IMyHeartMapper iMyHeartMapper;

    public MyHeartService() {
    }

    @Autowired
    public MyHeartService(IMyHeartMapper iMyHeartMapper) {
        this.iMyHeartMapper = iMyHeartMapper;
    }

    //返回全部心得
    public List<Heart> getAllHeart(){
        return iMyHeartMapper.getAllHeart();
    }

    public List<Heart> getMyHeart(String username){
        List<Heart> hearts = iMyHeartMapper.getUsersHeart(username);
        if(hearts != null){
            return hearts;
        }
        return null;
    }

    public List<Heart> getUsersHeartByTitle(String title){
        List<Heart> hearts = iMyHeartMapper.getUsersHeartByTitle(title);

        if(hearts != null){
            return hearts;
        }
        return null;
    }

    public boolean deleteMyHeart(String username){
        if(iMyHeartMapper.deleteMyHeart(username)>0){
            return true;
        }
        return false;
    }

    public boolean deleteMyHeartByTitleId(int titleid){
        if(iMyHeartMapper.deleteMyHeartByTitleId(titleid)>0){
            return true;
        }
        return false;
    }

    public boolean addHeart(Heart heart){
        if(iMyHeartMapper.addHeart(heart)>0){
            return true;
        }
        return false;
    }

}