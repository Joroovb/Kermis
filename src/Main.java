public class Main {

    public static void main(String[] args) {
        AvondUit joris = new AvondUit();
        Notifications notify = new Notifications();
        notify.Start();
        joris.start();
    }
}