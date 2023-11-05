package com.oauth.example.oauthexample;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RegistrationService {

    private final UserDetailsRepository userDetailsRepository;

    @Autowired
    public RegistrationService(UserDetailsRepository userDetailsRepository) {
        this.userDetailsRepository = userDetailsRepository;
    }

    public List<UserDetails> getAllUsers() {
        return userDetailsRepository.findAll();
    }

    public UserDetails getUserId(String id) {
        return userDetailsRepository.findById(id).orElse(null);
    }

    public UserDetails createBook(UserDetails book) {
        return userDetailsRepository.save(book);
    }

    public UserDetails updateBook(String id, UserDetails updatedBook) {
        updatedBook.setId(id);
        return userDetailsRepository.save(updatedBook);
    }

    public void deleteBook(String id) {
        userDetailsRepository.deleteById(id);
    }

}
