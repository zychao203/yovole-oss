package com.soft.cloud.yovoleoss.app;


import com.yovole.sdk.oss.OssApi;
import com.yovole.sdk.oss.model.PutObjectRequest;
import com.yovole.sdk.oss.model.PutObjectResult;

import java.io.File;

/**
 * Created by zhuyongchao on 2021-03-20
 */

public class DemoOssUtil {

    public static void main(String[] args) {
        String endPoint = "https://cn-east-1.cloud-oss.com";
        String appId = "asdf";
        String appSecret = "asdf";

        OssApi ossApi = new OssApi(endPoint, appId, appSecret);

        String bucketName = "bucket";
        String key = "test.jar";
        File sFile = new File("./test.jar");
        PutObjectRequest request = new PutObjectRequest(bucketName, key, sFile);
        try {
            PutObjectResult result = ossApi.putObject(request);
            System.out.println(result);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}