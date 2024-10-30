package com.learn.cab_book_user.service;

import com.learn.cab_book_user.constant.AppConstant;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class LocationService {


    @KafkaListener(topics = AppConstant.CAB_LOCATION, groupId = AppConstant.USER_GROUP)
    public void cabLocation(String location) {
        System.out.println(location);
    }
}
