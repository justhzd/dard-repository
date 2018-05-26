package dard.justhzd.ch8_3.dao;

import dard.justhzd.ch8_3.domain.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by 洪志达 on 2018/5/12.
 */
public interface PersonRepository extends JpaRepository<Person, Long> {
    Person findByNameStartsWith(String name);
}
