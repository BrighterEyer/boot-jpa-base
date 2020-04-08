package com.demo.code.controller;

import com.demo.code.config.ServerConfig;
import com.demo.code.entity.MainControl;
import com.demo.code.service.MainControlService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.Map;


@RestController
@RequestMapping("mainControl")
@Slf4j
public class MainControlController {

    @Autowired
    ServerConfig serverConfig;

    @Autowired
    MainControlService service;

    @ResponseBody
    @PostMapping(value = "/report")
    public Object report(@RequestParam Map<String, Object> params) {
        MainControl mainControl = new MainControl();

        mainControl.setMac(params.get("mac").toString());
        mainControl.setLocation(params.get("longitude").toString());
        mainControl.setLatitude(params.get("latitude").toString());
        mainControl.setLocation(params.get("location").toString());
        mainControl.setCreateTime(new Date());
        return service.report(mainControl);
    }


}