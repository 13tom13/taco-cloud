package org.tom13.tacocloud.data;

import org.springframework.data.repository.CrudRepository;
import org.tom13.tacocloud.entity.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
    User findByUsername(String username);
}
