import java.util.ArrayList;

public class Agenda {

    private User owner;

    private ArrayList<Meeting> meetings;

    //CONSTRUCTOR
    public Agenda (User owner){
        this.owner = owner;
        meetings = new ArrayList<Meeting>();
    }

    //Agregar una reunión a la agenda
    public void addMeeting(Meeting newMeeting) {
        meetings.add(newMeeting);
        System.out.println("Se agregó la reunión " + newMeeting.getTopic());
    }


    //Validación horarios
    public void mOverlaps (Meeting newMeeting) {
        boolean notOverlapped = true;
        for (int i = 0; i < meetings.size(); i++) {

            if (newMeeting.getTimeStart().isAfter(meetings.get(i).getTimeEnd())) {
                notOverlapped = false;
                System.out.println("NO SE SUPERPONE");
            } else if (newMeeting.getTimeStart().isBefore(meetings.get(i).getTimeEnd())) {
                notOverlapped = true;
                System.out.println("SE SUPERPONE");
            } else if ((meetings.get(i).getTimeStart().isBefore(newMeeting.getTimeStart())) && (meetings.get(i).getTimeEnd().isAfter(newMeeting.getTimeEnd()))) {
                notOverlapped = true;
                System.out.println("SE SUPERPONE OP2");
            }
        }


    }

    //VALIDACION HORARIO OPCION B
    //            if ((meetings.get(i).getTimeEnd().isBefore(newMeeting.getTimeStart()) || meetings.get(i).getTimeStart().isAfter(newMeeting.getTimeEnd())))
//                notOverlapped = true;
//        }
//        if (!notOverlapped) {
//            System.out.println("La reunión " + newMeeting.getTopic() + " NO SE SUPERPONE con ninguna otra reunión");
//        }
//
//        else if (notOverlapped) {
//            System.out.println("La reunión " + newMeeting.getTopic() + " se superpone con otra ya existente");
//        }


}
