package com.contactkeeper.repository;

import com.contactkeeper.entity.User;
import com.contactkeeper.utils.Queries;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository  {

    private String qq= Queries.getQuery("test.query");

    @Autowired
    private JdbcTemplate template;

    public User findUser(String name) {
        return template.queryForObject(qq, new String[]{name}, (rs, rowNum) -> {
            User p = new User();
            p.setName(rs.getString("name"));
            p.setEmail(rs.getString("email"));
            return p;
        });
    }



}
