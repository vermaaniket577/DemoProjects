package com.web.Form.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.web.Form.model.Introduction;
import com.web.Form.repository.IntroductionRepository;

@Controller
public class IntroductionController {

    @Autowired
    private IntroductionRepository introductionRepository;

    @GetMapping("/introduction")
    public String introductionForm(Model model) {
        model.addAttribute("introduction", new Introduction());
        return "introduction-form";
    }

    @PostMapping("/introduction")
    public String submitIntroduction(@ModelAttribute Introduction introduction) {
        introductionRepository.save(introduction);
        return "redirect:/success";
    }
    @GetMapping("/success")
    public String successPage() {
        return "signup_success"; // The name of your success page HTML template
    }
}
