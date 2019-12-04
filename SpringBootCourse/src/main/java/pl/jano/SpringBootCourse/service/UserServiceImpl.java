package pl.jano.SpringBootCourse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.jano.SpringBootCourse.model.UserDTO;
import pl.jano.SpringBootCourse.persistence.model.User;
import pl.jano.SpringBootCourse.persistence.repository.UserRepo;


@Service
public class UserServiceImpl extends BaseServiceImpl<User, Long, UserRepo> implements UserService {

    @Autowired
    private UserRepo userRepo;

    @Override
    public UserRepo getRepository() {
        return userRepo;
    }

    @Override
    public UserDTO createUser(UserDTO userDTO) {
        User u = save(Mapper.dtoToUser(userDTO));
        return Mapper.userToDTO(u);
    }

    @Override
    public UserDTO editUser(UserDTO userDTO) {
        User u = save(Mapper.dtoToUser(userDTO));
        return Mapper.userToDTO(u);
    }
}
