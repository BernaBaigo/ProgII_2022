import java.time.LocalDate;
import java.time.Period;
import java.time.LocalTime;
import java.time.Duration;
import java.time.chrono.ChronoLocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class Meeting {

    private String place;
    private String topic;
    private LocalDate date;
    private LocalTime timeStart;
    private LocalTime timeEnd;
    private ArrayList<User> contacts;

    private Duration meetingDuration; //No convendría armar un método para esto???

    //CONSTRUCTORES
    public Meeting (){
        place = "";
        topic = "";
        date = LocalDate.now(); //por defecto usa la fecha actual
        timeStart = LocalTime.now(); //por defecto usa la hora actual
        timeEnd = timeStart.plus(1, ChronoUnit.HOURS);
        meetingDuration = Duration.between(timeStart,timeEnd); //por defecto tiene 1 hora de duración
        contacts = new ArrayList<User>();

    }

    public Meeting (String place, String topic, LocalDate date, LocalTime timeStart, LocalTime timeEnd){
        this.place = place;
        //this.attendanceList = new AttendanceList(qAttendees,"Nombre", "Mail", 1234);
        this.topic = topic;
        this.date = date;
        this.timeStart = timeStart;
        this.timeEnd = timeEnd;
        contacts = new ArrayList<User>();

    }

    //METODOS
    public void  getMeetingInfo(){

        System.out.println("Lugar: " + place);
        System.out.println("Tema: " + topic);
        System.out.println("Fecha: " + date);
        System.out.println("Duración: " + meetingDuration);
        System.out.println("Hora de inicio: " + timeStart);
        System.out.println("Hora de fin: " + timeEnd);
    }


    // SETTERS & GETTERS
    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTimeStart() {
        return timeStart;
    }

    public void setTimeStart(LocalTime timeStart) {
        this.timeStart = timeStart;
    }

    public LocalTime getTimeEnd() {
        return timeEnd;
    }

    public void setTimeEnd(LocalTime timeEnd) {
        this.timeEnd = timeEnd;
    }

    public Duration getMeetingDuration() {
        return meetingDuration;
    }

//    public void setMeetingDuration(Duration meetingDuration) {
//        this.meetingDuration = meetingDuration;
//    }

    //Agregar contacto a la reunión
    public void addContact (User newContact){
        contacts.add(newContact);
    }

    public void printContacts (){
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println(contacts.get(i).getName());
        }
    }



}
