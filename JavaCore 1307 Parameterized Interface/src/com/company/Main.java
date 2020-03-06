package com.company;

/*

1307 Parameterized Interface
In the StringObject class, implement the SimpleObject interface with a parameter of type String.
Requirements:
1. The StringObject class must implement the SimpleObject interface.
2. The SimpleObject interface in the StringObject class must be implemented with a parameter of type String.
3. In the StringObject class, implement the getInstance method of the SimpleObject interface.
4. Additional classes or interfaces cannot be created.


 */

import java.io.*;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.nio.file.FileSystemException;
import java.nio.file.attribute.AclFileAttributeView;
import java.rmi.RemoteException;
import java.text.SimpleDateFormat;
import java.util.*;


public class Main {
    public static void main(String[] args) throws Exception {
    }

    interface SimpleObject<T> {
        SimpleObject<T> getInstance();
    }

    class StringObject implements SimpleObject<String>    {
        @Override
        public SimpleObject<String> getInstance() {
            return null;
        }
    }
}


