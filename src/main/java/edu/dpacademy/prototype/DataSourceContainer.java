package edu.dpacademy.prototype;

import java.util.HashMap;
import java.util.Map;

public class DataSourceContainer {

    private static Map<String, Sourceable> sourceableMap = new HashMap<String, Sourceable>();

    static {
        sourceableMap.put(DBSource.class.getName(), new DBSource("db-adres","login","password",8000L));
        sourceableMap.put(XMLSource.class.getName(), new XMLSource("C://example//path"));
    }

    public static Sourceable getInstance(String className) {
        return sourceableMap.get(className).clone();
    }

}
