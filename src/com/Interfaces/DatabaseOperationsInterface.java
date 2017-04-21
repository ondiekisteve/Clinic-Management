package com.Interfaces;

import javax.ejb.Local;
import java.sql.Connection;
import java.sql.ResultSet;

@Local
public interface DatabaseOperationsInterface {
    Connection connect();

    ResultSet Read(String read);

    boolean Update(String update);

    boolean delete();

    boolean write(String s);
}
