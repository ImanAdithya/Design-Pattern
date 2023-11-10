import service.impl.Dasun;
import service.impl.Kamal;
import service.impl.Ramal;
import service.impl.Sithum;

public class Main {
    public static void main(String[] args) {

        //Initialized the Subject
        Kamal kamal=new Kamal ();

        //Initialized th Observers
        Dasun dasun=new Dasun ();
        Ramal ramal=new Ramal ();
        Sithum sithum=new Sithum ();

        //register the Observers to subject
        kamal.register (dasun);
        kamal.register (ramal);
        kamal.register (sithum);

        //Now see what will happen after the subject state change
        kamal.notifyAllObservers ("Kamal upload a New Photo");
        kamal.notifyAllObservers ("Kamal is Dead");
        kamal.notifyAllObservers ("Im in Dubai");
    }
}