package com.springboot.azure.pot.sample-spring-boot-azure.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.springboot.azure.pot.sample-spring-boot-azure.repository.ApplicationRepository;
import com.springboot.azure.pot.sample-spring-boot-azure.domain.ApplicationItem;
import java.util.List;


/**
 * Created by MRomeh
 */
@Service
public class ApplicationService {
    private static final Logger log = LoggerFactory.getLogger(ApplicationService.class);
    @Autowired
    private ApplicationRepository applicationRepository;

    @Transactional
    public void createApplicationItem(ApplicationItem applicationItem) {
        applicationRepository.save(applicationItem);
    }

    public List<ApplicationItem> getApplicationItems() {
      return applicationRepository.findAll();
    }


}
