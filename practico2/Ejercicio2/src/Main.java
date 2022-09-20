import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;

public class Main {

    public static void main (String[] args){

        User user1 = new User("Berna", "bbaigorri@gmail.com", 12345);
        User user2 = new User("Martu", "mseijas@gmail.com", 12344);
        User user3 = new User("Bianca", "biancab@gmail.com",112233);

        Meeting m1 = new Meeting();
        Meeting m2 = new Meeting("TDL","M2", LocalDate.of(2022, Month.SEPTEMBER,23), LocalTime.of(14,0),LocalTime.of(15,30));
        Meeting m3 = new Meeting("TDL", "M3",LocalDate.of(2022,9,23),LocalTime.of(14,0),LocalTime.of(15,30));
        Meeting m4 = new Meeting("TDL", "M4",LocalDate.of(2022,9,18),LocalTime.of(14,0),LocalTime.of(15,30));

        Agenda agenda1 = new Agenda(user1);

        m1.addContact(user1);
        m1.addContact(user2);
        m1.addContact(user3);

        //m1.getMeetingInfo();
//        m1.printContacts();
//        agenda1.addMeeting(m1);
        agenda1.addMeeting(m2);
//        agenda1.addMeeting(m3);
//        agenda1.addMeeting(m4);
        agenda1.mOverlaps(m2);
//        agenda1.mOverlaps(m3);

    }

}
