package com.syncstream_dev.syncstream.config;

import com.syncstream_dev.syncstream.converter.CharArrayToStringConverter;
import com.syncstream_dev.syncstream.converter.StringToCharArrayConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.core.convert.CassandraCustomConversions;

import java.util.Arrays;

@Configuration
public class CassandraConfig {
    @Bean
    public CassandraCustomConversions cassandraCustomConversions() {
        return new CassandraCustomConversions(
                Arrays.asList(new StringToCharArrayConverter(), new CharArrayToStringConverter()));
    }
}
