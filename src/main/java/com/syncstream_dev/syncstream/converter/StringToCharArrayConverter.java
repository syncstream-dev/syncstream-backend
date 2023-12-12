package com.syncstream_dev.syncstream.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.data.convert.ReadingConverter;

@ReadingConverter
public class StringToCharArrayConverter implements Converter<String, char[]> {
    @Override
    public char[] convert(String source) {
        return source.toCharArray();
    }
}
