package com.iserveu.security.secondaryrepo;
//package com.iserveu.pool.secondaryrepo;
//
//import java.util.List;
//
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
//import org.springframework.stereotype.Repository;
//
//import com.iserveu.pool.secondaryEntity.ConnPoolEntity;
//
//
//@Repository
//public interface SecondaryconnectionRepo extends JpaRepository<com.iserveu.pool.secondaryEntity.ConnPoolEntity, Long> {
//	@Query(value = "select * from (select *, pg_sleep(5) from transaction_details) AS data where data.rrn=:inputRRN", nativeQuery = true)
//	List<ConnPoolEntity> test(@Param("inputRRN") Long inputRRN);
//}
