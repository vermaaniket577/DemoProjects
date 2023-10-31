package com.web.Form.service;

import org.springframework.stereotype.Service;

import com.web.Form.model.Introduction;
import com.web.Form.repository.IntroductionRepository;

@Service
public class IntroductionService {

    private final IntroductionRepository introductionRepository;

    public IntroductionService(IntroductionRepository introductionRepository) {
        this.introductionRepository = introductionRepository;
    }

    public String insertIntroductionData(Introduction introduction) {
        introductionRepository.save(introduction);
        return "redirect:/successPage";

    }

    public Introduction fetchIntroductionDataByName(String name) {
        return introductionRepository.findByName(name);
    }
}
