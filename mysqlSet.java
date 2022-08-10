package tasks;

public class mysqlSet {
    private String url = "jdbc:mysql://host/java_base";
    private String username = "java_pass";
    private String password = "java_pass";

    public void setUrl(String bdUrl){
        url=bdUrl;}
        public String getUrl(){
            return url;
        }
    public void setUsername(String bdUsername){
        username=bdUsername;
    }
        public String getUsername(){
            return username;
        }
    public void setPassword(String bdPassword){
        password=bdPassword;
    }
        public String getPassword(){
            return password;
        }
    }

