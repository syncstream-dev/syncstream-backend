package com.syncstream_dev.syncstream.repository;

import com.syncstream_dev.syncstream.model.User;
import org.springframework.data.cassandra.repository.CassandraRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CassandraRepository<User, String> {
    // Custom Queries
}
