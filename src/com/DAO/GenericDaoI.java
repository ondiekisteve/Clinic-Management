package com.DAO;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 3/23/2017.
 */
public interface GenericDaoI<T, PK extends Serializable> {
    T add(T t);
    T findById(PK id);
    T merge(T t);
    List<T> findAll();
    boolean remove(T t);
}
