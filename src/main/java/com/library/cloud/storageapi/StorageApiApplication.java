package com.library.cloud.storageapi;

import org.apache.commons.io.FileUtils;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

@SpringBootApplication
public class StorageApiApplication {

    public static void main(String[] args) {
//        RestTemplate restTemplate = new RestTemplate();
//        HttpHeaders httpHeaders = new HttpHeaders();
//        httpHeaders.set("Authorization", "AQAAAAAy5G9IAAfb1eM43KxG_EE3p8zISNBMB28");
//        String url2 = "https://cloud-api.yandex.net/v1/disk/resources?path=storage/Spring_in_action_6.pdf&fields=preview,path,name";
//        String url = "https://cloud-api.yandex.net/v1/disk/resources/download?path=storage/Spring_in_action_6.pdf";
//        ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, new HttpEntity<>(httpHeaders),String.class);
        File file = new File("./static/");
        try {
            FileUtils.copyURLToFile(new URL("https://downloader.disk.yandex.ru/disk/a63006824e6320bf0c39a1e881e965824e6e865619d9d4e4ee40af91d24b7f5d/626983d8/fOvF4HtEAVTuNw5R93L4y4_pu9XWcxJj4BT04KS0mqJmuuElrL-1WWvSCoxn1TV7VUlOQsipiJOY3iBYoytVmw%3D%3D?uid=853831496&filename=Spring_in_action_6.pdf&disposition=attachment&hash=&limit=0&content_type=application%2Fpdf&owner_uid=853831496&fsize=11513741&hid=a6aba0c1f9370de3e4ab0664758e4091&media_type=document&tknv=v2&etag=1be282d1538ec16b973d636ad4b1350b"),file);
        } catch (IOException e) {
            System.out.println("hsjahfaf");
            e.printStackTrace();
        }
//        System.out.println(response);
        SpringApplication.run(StorageApiApplication.class, args);
    }

}
