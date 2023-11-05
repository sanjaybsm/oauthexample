package com.oauth.example.oauthexample;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserDetailsRepository extends MongoRepository<UserDetails,String> {

}
