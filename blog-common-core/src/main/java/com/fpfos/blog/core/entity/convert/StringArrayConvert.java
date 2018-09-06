package com.fpfos.blog.core.entity.convert;

import org.springframework.util.StringUtils;

import javax.persistence.AttributeConverter;

/**
 * Created by alvin on 18-9-6.
 */
public class StringArrayConvert implements AttributeConverter<String[], String> {

    @Override
    public String convertToDatabaseColumn(String[] attribute) {

        if (null == attribute || 0 == attribute.length) {
            return "";
        }
        return String.join(",", attribute);
    }

    @Override
    public String[] convertToEntityAttribute(String dbData) {

        if (StringUtils.isEmpty(dbData)) {
            return new String[]{};
        }

        return dbData.split(",");
    }
}
