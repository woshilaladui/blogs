/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: EssayController
 * Author:   meng
 * Date:     2018/7/19 9:28
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wust.job.controller;

import com.wust.job.constant.Constant;
import com.wust.job.entity.Essay;
import com.wust.job.modle.BaseModle;
import com.wust.job.modle.EssayModle.EssayModle;
import com.wust.job.service.EssayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author meng
 * @create 2018/7/19
 * @since 1.0.0
 */
@CrossOrigin
@Controller
@RequestMapping("/essay")
public class EssayController {

    @Autowired
    private EssayService essayService;

    @Autowired
    HttpServletRequest request;

    @Autowired
    HttpSession httpSession;


    /**
     * 返回文章的列表信息
     *
     * @return
     */
    @RequestMapping("/getAllEssay")
    @ResponseBody
    public EssayModle getAllEssay() {

        String username = request.getParameter("username");
        String title = request.getParameter("title");

        if(username == null){
            return  returnEssays(essayService.getAllEssay());
        }else{//如果输入框为空
            System.out.println("username = "+username);
            System.out.println("title = "+title);
            if(username.length() == 0){
                return returnEssays(essayService.getAllEssay());
            }else{//输入框不为空，可能是按照用户名，或者是文章标题来搜索
                List<Essay> essays = essayService.getUsersEssayByTitle(title);//按照用户名搜索
                if(essays == null ||essays.size() ==0){//为空的时候说明不是用户名搜索，或者是不存在
                    essays = essayService.getUserEssay(username);
                    if(essays !=null){
                        return returnEssays(essays);
                    }else{
                        return null;
                    }
                }else {//不为空说明是为标题
                    return returnEssays(essays);
                }
            }//end else
        }//end if

    }


    /**
     * 返回该用户的文章
     *
     * @return
     */
    @RequestMapping("/getUserEssay")
    @ResponseBody
    public EssayModle getUserEssay( ) {

        String username = request.getParameter("username");
        System.out.println("getUserEssay"+username);
        return returnEssays(essayService.getUserEssay(username));
    }

    public EssayModle returnEssays(List<Essay> essays) {


        if (essays != null) {
            return new EssayModle(0, "essays success",100, essays);
        }
        return new EssayModle(1, "essays error",0, null);
    }

    /**
     * 添加图书界面
     * @return
     */
    @RequestMapping("/addEssayPage")
    public String essayPage(){
        return "account/addEssay";
    }


    //只能超级用户添加即 admin
    @RequestMapping("/addEssay")
    @ResponseBody
    public BaseModle addEssay(){

        String title = request.getParameter("title");

        System.out.println("title = "+title);

        Random random = new Random();

        int viewCount = random.nextInt(1000000);
        int remarkCount = random.nextInt(1000000);
        int collectCount = random.nextInt(1000000);
        int titleId =  random.nextInt(1000000);

        if(essayService.addEssay(new Essay(
                0,
                title,
                "admin",
                viewCount,
                remarkCount,
                collectCount,
                titleId,
                new Date()
                ))){

            return new BaseModle(Constant.SUCESS,"添加文章成功",10);

        }

        return new BaseModle(Constant.ERROR,"添加文章失败",0);
    }

}