package com.fpfos.blog.core.entity;

import com.fpfos.blog.core.utils.FpfosUtils;

import java.lang.reflect.InvocationTargetException;
import java.util.Calendar;

/**
 * Created by alvin on 18-9-6.
 */
public class EntityFactory {

    public static <E extends AbstractEntity> E newInstance(Class<E> clz) {

        try {
            E entity = clz.getConstructor().newInstance();
            entity.setPrimaryCode(FpfosUtils.UUID());
            entity.setCreateDate(Calendar.getInstance().getTime());

            return entity;
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

        throw new IllegalStateException("Can not happen here.");
    }

}
