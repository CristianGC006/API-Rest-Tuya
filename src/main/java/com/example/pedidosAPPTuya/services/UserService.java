package com.example.pedidosAPPTuya.services;
import com.example.pedidosAPPTuya.models.User;
import com.example.pedidosAPPTuya.repositories.IUserRepository;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.pedidosAPPTuya.models.User;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    IUserRepository repository;

    //Listar los metodos que activaran las consultas de la BD

    //Guardar
    public User createUser(User UserData)throws Exception{
        try{
            //Validar los datos de entrada
            return this.repository.save((User)UserData);
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
    //Buscar todos los registros
    public List<User> searchUser() throws Exception{
       try {
            return this.repository.findAll();
       }catch (Exception error){
           throw new Exception(error.getMessage());
       }
    }
    //Buscar por id
    public User searchUserById(Integer id)throws Exception{
        try{
           Optional<org.apache.catalina.User> userSearched=this.repository.findById(id);
           if (userSearched.isPresent()){
               return userSearched.get();
           }else{
               throw new Exception("El usuario buscado no se encuentra en la base de datos");
           }
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }

    }

    //Metodo para modificar por id
    public User modifyUser(Integer id,User UserData) throws Exception{
        try{
            Optional<User> userSearched=this.repository.findById(id);
            if (userSearched.isPresent()){
                userSearched.get().setNumberPhone(UserData.getNumberPhone());
            }else{
                throw new Exception("Usuario no encontrado");
            }
            return this.repository.save(userSearched.get())
        }catch (Exception error){
            throw new Exception(error.getMessage());
        }
    }
    //Eliminar por id
    public boolean deleteUser(Integer id)throws Exception{
        try {
            Optional<User> userSearched=this.repository.findById(id);
            if (userSearched.isPresent()){
                this.repository.deleteById(id);
                return true;
            }else{
                throw new Exception("Usuario no encontrado");
            }
        }catch (Exception error){
            throw new Exception(error.getMessage());

        }
    }

}
