package com.yc.girl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
public class GirlService {

    @Autowired
    private GirlRepository girlRepository;
   @Transactional
    public void insertTwo(){
        Girl girlA = new Girl();
        girlA.setAge(19);
        girlA.setCupSize("C");
        girlRepository.save(girlA);
        Girl girlB = new Girl();
        girlB.setAge(20);
        girlB.setCupSize("H");
        girlRepository.save(girlB);
    }
}
