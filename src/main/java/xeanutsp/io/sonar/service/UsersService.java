package xeanutsp.io.sonar.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import xeanutsp.io.sonar.entity.User;
import xeanutsp.io.sonar.repo.UsersRepository;

@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    public List<User> getAllUsers(){
        return usersRepository.findAll(); 
    }
    public List<User> getUserFromId(Long id){
        return usersRepository.find(id);
    }
    public User addUser(User userAdd){
        return usersRepository.saveUser(userAdd);
    }
    public User updateUser(Long id,User userUpdate){
        return usersRepository.updateUser(id,userUpdate);
    }
    public void deleteUser(Long id){
        usersRepository.deleteById(id);
    }
    

}
