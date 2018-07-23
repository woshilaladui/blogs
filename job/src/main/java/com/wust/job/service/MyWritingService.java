/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: MyWritingService
 * Author:   meng
 * Date:     2018/7/21 9:44
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wust.job.service;

import com.wust.job.entity.Writing;
import com.wust.job.mapper.IMyWritingMapper;
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
public class MyWritingService {

    private IMyWritingMapper iMyWritingMapper;

    public MyWritingService() {
    }

    @Autowired
    public MyWritingService(IMyWritingMapper iMyWritingMapper) {
        this.iMyWritingMapper = iMyWritingMapper;
    }

    public List<Writing> getAllWriting() {
        List<Writing> writings = iMyWritingMapper.getAllWriting();
        if (writings != null) {
            return writings;
        } else {
            System.out.println("getAllWriting null");
        }
        return null;
    }

    public List<Writing> getMyWritingEssay(String usernrame) {
        List<Writing> writings = iMyWritingMapper.getMyWritingEssay(usernrame);
        if (writings != null) {
            return writings;
        }
        return null;
    }

    public List<Writing> getUsersWritingByTitle(String title) {
        List<Writing> writings = iMyWritingMapper.getUsersWritingByTitle(title);
        if (writings != null) {
            return writings;
        }
        return null;
    }


    public boolean deleteMyWriting(String username) {
        if (iMyWritingMapper.deleteMyWriting(username) > 0) {
            return true;
        }
        return false;
    }

    public boolean deleteMyWritingByTitleId(int titleid) {
        if (iMyWritingMapper.deleteMyWritingByTitleId(titleid) > 0) {
            return true;
        }
        return false;
    }

    public boolean addWriting(Writing writing) {
        if (iMyWritingMapper.addWriting(writing) > 0) {
            return true;
        }
        return false;
    }
}