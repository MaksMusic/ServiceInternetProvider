package org.example.serviceinternetprovider.repository;

import org.example.serviceinternetprovider.entity.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository   extends CrudRepository<User, Long>
{
}
