package pl.jano.SpringBootCourse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import pl.jano.SpringBootCourse.exception.WrongIdException;
import pl.jano.SpringBootCourse.model.CourseDTO;
import pl.jano.SpringBootCourse.model.UserDTO;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import pl.jano.SpringBootCourse.persistence.model.User;
import pl.jano.SpringBootCourse.service.UserService;

import javax.websocket.server.PathParam;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserController {

    private List<UserDTO> users = new ArrayList<>();

    @Autowired
    UserService userService;

    @RequestMapping(value = "/registry", method = RequestMethod.POST)
    public ResponseEntity<UserDTO> registry(@RequestBody UserDTO userDTO){
        if (userDTO.getId() != null)
            throw new WrongIdException("Tworzony użytkownik nie powinien posiadać ID.");
        System.out.println("/course/create" + userDTO.getFirstName());
        UserDTO dto = userService.createUser(userDTO);
        return new ResponseEntity<>(dto, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/add", method = RequestMethod.PUT)
    public UserDTO add(@RequestBody UserDTO userDTO){
        if (userDTO.getId() != null)
            throw new WrongIdException("Tworzony użytkownik nie powinien posiadać ID.");
        UserDTO dto = userService.createUser(userDTO);
        return dto;
    }

    @RequestMapping(value = "/confirm/{id}", method = RequestMethod.PUT)
    public UserDTO confirm(@PathParam(value = "id") Long id){
        return new UserDTO();
    }

    @RequestMapping(value = "/edit", method = RequestMethod.PUT)
    public UserDTO edit(@RequestBody UserDTO userDTO){
        if (userDTO.getId() == null)
            throw new WrongIdException("Edytowany user musi posiadać ID.");
        UserDTO dto= userService.editUser(userDTO);
        return dto;
    }
}
