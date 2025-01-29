package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class Service {
    Map<Integer, User> map = new HashMap<>();

    {
        map.put(1, new User(18, "даня"));
        map.put(2, new User(18, "егор"));
        map.put(3, new User(24, "алекс"));
        map.put(null, new User(19, "базай"));
        map.put(4, null);


    }

    public void findById(int id) {
        Optional<User> optionalUser = Optional.ofNullable(map.get(id));
        if (optionalUser.isPresent()) {
            map.get(id).showUser();
        } else {
            System.out.println("не существует");
        }
    }

}
