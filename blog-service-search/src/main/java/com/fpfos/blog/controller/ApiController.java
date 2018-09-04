package com.fpfos.blog.controller;

import com.fpfos.blog.core.utils.FpfosUtils;
import com.fpfos.blog.entity.ArticleSearch;
import com.fpfos.blog.service.ArticleServer;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * Created by alvin on 18-9-4.
 */

@RestController
public class ApiController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @GetMapping("save")
    public String save(){

        ArticleSearch article = new ArticleSearch();
        article.setPrimary_code(FpfosUtils.UUID());
        article.setAuthor("fpfos");
        article.setTitle("标题是我爱代码test-elsearch");
        article.setLabel(new String[]{"label1","label2"});
        article.setCreate_date(new Date());
        article.setArticle_content("# fpfos-blog-config\n" +
                "\n" +
                "#### 项目介绍\n" +
                "{**以下是码云平台说明，您可以替换为您的项目简介**\n" +
                "码云是开源中国推出的基于 Git 的代码托管平台（同时支持 SVN）。专为开发者提供稳定、高效、安全的云端软件开发协作平台\n" +
                "无论是个人、团队、或是企业，都能够用码云实现代码托管、项目管理、协作开发。企业项目请看 [https://gitee.com/enterprises](https://gitee.com/enterprises)}\n" +
                "\n" +
                "#### 软件架构\n" +
                "软件架构说明\n" +
                "\n" +
                "\n" +
                "#### 安装教程\n" +
                "\n" +
                "1. xxxx\n" +
                "2. xxxx\n" +
                "3. xxxx\n" +
                "\n" +
                "#### 使用说明\n" +
                "\n" +
                "1. xxxx\n" +
                "2. xxxx\n" +
                "3. xxxx\n" +
                "\n" +
                "#### 参与贡献\n" +
                "\n" +
                "1. Fork 本项目\n" +
                "2. 新建 Feat_xxx 分支\n" +
                "3. 提交代码\n" +
                "4. 新建 Pull Request\n" +
                "\n" +
                "\n" +
                "#### 码云特技\n" +
                "\n" +
                "1. 使用 Readme\\_XXX.md 来支持不同的语言，例如 Readme\\_en.md, Readme\\_zh.md\n" +
                "2. 码云官方博客 [blog.gitee.com](https://blog.gitee.com)\n" +
                "3. 你可以 [https://gitee.com/explore](https://gitee.com/explore) 这个地址来了解码云上的优秀开源项目\n" +
                "4. [GVP](https://gitee.com/gvp) 全称是码云最有价值开源项目，是码云综合评定出的优秀开源项目\n" +
                "5. 码云官方提供的使用手册 [https://gitee.com/help](https://gitee.com/help)\n" +
                "6. 码云封面人物是一档用来展示码云会员风采的栏目 [https://gitee.com/gitee-stars/](https://gitee.com/gitee-stars/)");

        rabbitTemplate.convertAndSend("article", article);

        return "ok";
    }
}
