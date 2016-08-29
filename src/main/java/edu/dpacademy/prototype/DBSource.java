package edu.dpacademy.prototype;

public class DBSource extends Sourceable{

    private String jdbcConnector;
    private String login;
    private String password;
    private Long port;

    DBSource(String jdbcConnector, String login, String password, Long port) {
        this.jdbcConnector = jdbcConnector;
        this.login = login;
        this.password = password;
        this.port = port;
    }

    public String getIdentifier() {
        return DBSource.class.getName();
    }

    public Sourceable clone() {
        return new DBSource(jdbcConnector, login, password, port);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DBSource{");
        sb.append("jdbcConnector='").append(jdbcConnector).append('\'');
        sb.append(", login='").append(login).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", port=").append(port);
        sb.append('}');
        return sb.toString();
    }
}
