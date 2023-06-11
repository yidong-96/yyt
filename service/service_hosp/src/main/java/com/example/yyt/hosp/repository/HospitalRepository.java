package com.example.yyt.hosp.repository;

import com.example.yyt.model.hosp.Hospital;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface HospitalRepository extends MongoRepository<Hospital,String> {

    //判断是否存在数据
    Hospital getHospitalByHoscode(String hoscode);

    //根据医院名称查询
    List<Hospital> findHospitalByHosnameLike(String hosname);
}
