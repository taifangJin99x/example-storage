package com.example.storage.api;

import com.example.storage.service.StorageService;
import feign.Param;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: com.example.storageservice.api-> StorageController
 * @description:
 * @author: tfJin
 * @createDate: 2021-01-08 13:21
 * @version: 1.0
 * @todo:
 */
@RestController
@Slf4j
public class StorageController {
    @Autowired
    StorageService storageService;

    @GetMapping("/getStorage")
    public String getStorage() {

        return storageService.selectOne();
    }
    @GetMapping("/test")
    public String test() {
        log.info("TEST");
        return storageService.selectOne();
    }

    @GetMapping("/deStorage")
    public String deStorage(@RequestParam("code") String code) {
        log.info("deStorage:{}",code);
        return storageService.deStorage(code);
    }

    @GetMapping("/deStorageError")
    public String deStorageError(@RequestParam("code") String code) {
        log.info("deStorageError:{}",code);
        return storageService.deStorageError(code);
    }
}
