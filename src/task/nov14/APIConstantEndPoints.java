package task.nov14;

public enum APIConstantEndPoints {
    BASE_URL("https://app.vwo.com"),
    LOGIN_PAGE("https://app.vwo.com/login"),
    DASHBOARD_PAGE("https://app.vwo.com/dasHboard"),
    CHATBOT_PAGE("https://app.vwo.com/chat");

    private String name;

    APIConstantEndPoints(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }


}
