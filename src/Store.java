public class Store {
    String user;
    String pass;
    String place;
    public Store(String user, String pass, String place) {
        this.user = user;
        this.pass = pass;
        this.place = place;
    }
    public String retrieval() {
        return pass;
    }
    public boolean hollow() {
        if(this.pass == "") {
            return true;
        }else {
            return false;
        }
    }
}
