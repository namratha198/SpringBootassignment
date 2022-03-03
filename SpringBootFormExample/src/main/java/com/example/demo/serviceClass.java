
package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class serviceClass {
	@Autowired
	private UserRepo userRepository;
	public void saveUser(User user) {
        userRepository.save(user);
    }
}
