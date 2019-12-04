package pl.jano.SpringBootCourse.service;

import pl.jano.SpringBootCourse.model.UserDTO;
import pl.jano.SpringBootCourse.persistence.model.User;
import pl.jano.SpringBootCourse.persistence.repository.UserRepo;

public interface UserService extends BaseService<User, Long, UserRepo> {

    public UserDTO createUser (UserDTO userDTO);

    public UserDTO editUser (UserDTO userDTO);
}
