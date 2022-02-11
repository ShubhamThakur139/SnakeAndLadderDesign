package Design;

public class User {
    private String name;
    private int current_position;

    public User(String name, int current_position) {
        this.name = name;
        this.current_position = current_position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCurrent_position() {
        return current_position;
    }

    public void setCurrent_position(int current_position) {
        this.current_position = current_position;
    }

    public boolean isWin(){
        if(getCurrent_position()==100){
            return true;
        }
        return false;
    }

}
