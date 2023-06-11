package com.example.yyt.hosp.repository;

import com.example.yyt.model.hosp.Department;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DepartmentRepository extends MongoRepository<Department,String> {

    //上传科室接口
    Department getDepartmentByHoscodeAndDepcode(String hoscode, String depcode);
}
