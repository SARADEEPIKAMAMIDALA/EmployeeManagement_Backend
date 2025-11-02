//package com.klu.repository;
//
//import com.klu.entity.HrAdmin;
//import org.springframework.data.jpa.repository.JpaRepository;
//import java.util.Optional;
//
//public interface HrAdminRepository extends JpaRepository<HrAdmin, Long> {
//    Optional<HrAdmin> findByEmail(String email);
//}
//package com.klu.repository;
//
//import com.klu.entity.HrAdmin;
//import org.springframework.data.jpa.repository.JpaRepository;
//import java.util.Optional;
//
//public interface HrAdminRepository extends JpaRepository<HrAdmin, Long> {
//    Optional<HrAdmin> findByEmail(String email);
//}

package com.klu.repository;

import com.klu.entity.HrAdmin;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface HrAdminRepository extends JpaRepository<HrAdmin, Long> {
    Optional<HrAdmin> findByEmail(String email);
}