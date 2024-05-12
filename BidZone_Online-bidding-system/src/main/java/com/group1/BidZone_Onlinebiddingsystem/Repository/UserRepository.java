package com.group1.BidZone_Onlinebiddingsystem.Repository;

import com.group1.BidZone_Onlinebiddingsystem.Model.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<Users, Long> {
    Users findByEmail(String email);


}

