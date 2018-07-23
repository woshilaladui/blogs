/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: EssayService
 * Author:   meng
 * Date:     2018/7/17 15:36
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wust.job.service;

import com.wust.job.entity.Essay;
import com.wust.job.mapper.IEssayMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author meng
 * @create 2018/7/17
 * @since 1.0.0
 */
@Service
public class EssayService {

    private IEssayMapper iEssayMapper;


    @Autowired
    public EssayService(IEssayMapper iEssayMapper) {
        this.iEssayMapper = iEssayMapper;
    }


    /**
     *
     * @return 返回文章列表的集合
     */
    public List<Essay> getAllEssay(){

        List<Essay> essays = iEssayMapper.getAllEssay();

        if(essays != null){
            return essays;
        }

        return null;

    }


    /**
     * 返回这个人的作文集合
     * @param username
     * @return
     */
    public List<Essay> getUserEssay(String username){
        List<Essay> essays = iEssayMapper.getUsersEssay(username);

        if(essays != null){
            return essays;
        }

        return null;
    }

    public List<Essay> getUsersEssayByTitle(String title){

        List<Essay> essays = iEssayMapper.getUsersEssayByTitle(title);
        if(essays != null){
            return essays;
        }
        return null;
    }

    public boolean deleteMyEssay(String usernmae){
        if(iEssayMapper.deleteMyEssay(usernmae)>0){
            return true;
        }
        return false;
    }

    public boolean deleteMyEssayByTitleId(int titleid){
        if(iEssayMapper.deleteMyEssayByTitleId(titleid)>0) {
            return true;
        }
        return false;
    }


    /**
     * 添加文章
     * @param essay
     * @return
     */
    public boolean addEssay(Essay essay){
        if(iEssayMapper.addEssay(essay)>0){
            return true;
        }
        return false;
    }

}