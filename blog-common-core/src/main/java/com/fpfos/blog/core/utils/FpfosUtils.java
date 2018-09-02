package com.fpfos.blog.core.utils;

import java.util.UUID;

/**
 * Created by alvin on 18-9-2.
 */
public class FpfosUtils {

    public static String UUID() {

        return UUID.randomUUID().toString().replace("-", "");
    }
}
