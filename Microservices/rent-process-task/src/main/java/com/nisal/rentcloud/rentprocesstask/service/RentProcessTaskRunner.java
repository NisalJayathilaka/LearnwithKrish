package com.nisal.rentcloud.rentprocesstask.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

public class RentProcessTaskRunner implements CommandLineRunner {

    @Autowired
    ReneProcessService reneProcessService;
    @Override
    public void run(String... args) throws Exception {

        if(args.length>0){
            if(reneProcessService.validateDL(args[0]))
            {
                System.out.println("validate driving lince");
            }
            else
            {
                System.out.println("invalid driving license");
            }
        }
        else
        {
            System.out.println("task running without argument");
        }

    }
}
