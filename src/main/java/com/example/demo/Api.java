package com.example.demo;

import com.example.demo.dto.MyReq;
import com.example.demo.dto.MyResp;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api")
public class Api {

    @GetMapping(path = "get")
    public MyResp get() {
        var result = new MyResp();
        result.setMessage("Default message");

        return result;
    }

    @PostMapping("/post")
    public MyResp post(@RequestBody MyReq req) {
        var result = new MyResp();
        result.setMessage("Another message: " + req.getTest());

        return result;
    }

}
