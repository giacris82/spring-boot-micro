package com.springboot.azure.pot.sample-spring-boot-azure.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.springboot.azure.pot.sample-spring-boot-azure.domain.ApplicationItem;
import java.util.List;

/**
 * Created by MRomeh on 23/08/2017.
 */
@Repository
public interface ApplicationRepository extends JpaRepository<ApplicationItem, Long> {

    List<ApplicationItem> findApplicationEntriesByApplicationCode(String applicationCode);

}
