package com.ead.course.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ead.course.repositories.CourseRepository;
import com.ead.course.repositories.UserRepository;
import com.ead.course.services.UserService;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;

	@Autowired
	CourseRepository courseRepository;

//	@Override
//	public Page<UserModel> findAll(Specification<UserModel> spec, Pageable pageable) {
//		return userRepository.findAll(spec, pageable);
//	}
//
//	@Override
//	public UserModel save(UserModel userModel) {
//		return userRepository.save(userModel);
//	}
//
//	@Transactional
//	@Override
//	public void delete(UUID userId) {
//		courseRepository.deleteCourseUserByUser(userId);
//		userRepository.deleteById(userId);
//	}
//
//	@Override
//	public Optional<UserModel> findById(UUID userInstructor) {
//		return userRepository.findById(userInstructor);
//	}
}