/**
 * Copyright (C), 2015-2018, XXX有限公司
 * FileName: WritingModle
 * Author:   meng
 * Date:     2018/7/20 16:33
 * Description:
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.wust.job.modle.writing;

import com.wust.job.entity.Writing;
import com.wust.job.modle.BaseModle;

import java.util.List;

/**
 * 〈一句话功能简述〉<br> 
 * 〈〉
 *
 * @author meng
 * @create 2018/7/20
 * @since 1.0.0
 */
public class WritingModle extends BaseModle {
    public List<Writing> data;

    public WritingModle() {
    }

    public WritingModle(int code, String msg, int count, List<Writing> data) {
        super(code, msg, count);
        this.data = data;
    }
}