package com.nisal.configconsumer.configconsumer;

import com.nisal.configconsumer.configconsumer.model.MemeberProfileConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class ProfileController {

    @Autowired
    MemeberProfileConfiguration memeberProfileConfiguration;

    @RequestMapping("/profile")
    public String getConfig(Model model)
    {
        model.addAttribute("model",memeberProfileConfiguration.getDefaultModel());
        model.addAttribute("min",memeberProfileConfiguration.getMinRentPeriod());
        return "mprofile";
    }
}
