package com.afei.gmall.mamager.modules.pms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/")
public class FileUploadController {

    @RequestMapping("fileUpload")
    @ResponseBody
    public  String fileUpload(@RequestParam("file")MultipartFile multipartFile){
        //将图片或者音视频上传到分布式文件系统

        //将图片路径返回给页面

        //


        return "success";
    }
}
