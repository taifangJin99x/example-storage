package com.example.storage.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @className: com.example.gateway.client-> AccountClient
 * @description:
 * @author: tfJin
 * @createDate: 2020-12-29 13:42
 * @version: 1.0
 * @todo:
 */
@FeignClient(value = "user")
public interface AccountService {
    @GetMapping(value =  "/user/user/getUser")
    String checkToken();
}

