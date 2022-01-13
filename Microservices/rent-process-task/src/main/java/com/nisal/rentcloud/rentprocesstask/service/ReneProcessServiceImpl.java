package com.nisal.rentcloud.rentprocesstask.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class ReneProcessServiceImpl implements ReneProcessService {


    @Override
    public boolean validateDL(String dlNumber)
    {
        return dlNumber.length()>5;
    }
}
