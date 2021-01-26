package com.example.storage.service;

import com.example.storage.entity.Storage;
import com.example.storage.repository.StorageDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @className: com.example.storageservice.service-> StorageService
 * @description:
 * @author: tfJin
 * @createDate: 2021-01-08 13:22
 * @version: 1.0
 * @todo:
 */
@Service
public class StorageService {
    @Autowired
    StorageDao storageDao;
    public String selectOne() {
       return storageDao.selectById("1").toString();

    }

    public String deStorage(String code) {
        Storage storage = new Storage();
        storage.setCommodityCode(code);
        storage.setCount(1L);
        storageDao.insert(storage);
        return "ok";
    }

    public String deStorageError(String code) {
        int i = 0/1;
        return "";
    }
}
