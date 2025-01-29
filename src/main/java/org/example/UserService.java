package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class UserService {
    Map<Integer, User> map = new HashMap<>();

    {

        map.put(1, new User(18, "даня"));
        map.put(2, new User(18, "егор"));
        map.put(3, new User(24, "алекс"));
        map.put(4, new User(19, "базай"));


    }

    public User findById(int id) {
        Optional<User> optionalUser = Optional.ofNullable(map.get(id));
        if (optionalUser.isEmpty()) {
            System.out.println("не существует");
        }
        return map.get(id);
    }

}
