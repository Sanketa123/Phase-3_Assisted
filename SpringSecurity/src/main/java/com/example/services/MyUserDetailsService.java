package com.example.services;


import org.apache.el.stream.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.entities.MyUserDetails;
import com.example.repositories.UsersRepository;

@Service
public class MyUserDetailsService implements UserDetailsService {

	@Autowired
	UsersRepository userRepo;
	

	@Override
	public org.springframework.security.core.userdetails.UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException {
		return new MyUserDetails();
	}

}
