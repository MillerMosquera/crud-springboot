package com.example.crudspringboot.Services;import com.example.crudspringboot.Entity.Users;import java.util.List;//Users Servicepublic interface usersService {    public List<Users> getUser(); //Obtener    public Users createdUser(Users Users);//Crear    public Users updateUser(Long id, Users Users);//Actualizar    public Users searchUser(Long id); //Buscar    public void deleteUser(Long id); //Eliminar}