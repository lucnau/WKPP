//Stelle sicher dass Zugriff auf die anderen Klassen in dieser Klasse habe
package hw2.ex3;
import java.util.ArrayList;


public class Inbox {

    private ArrayList<Mail> mails = new ArrayList<>();

    public void addMail(Mail mail) {
        mails.add(mail);
    }

    public Inbox(ArrayList<Mail> mails) {
        this.mails = mails;

    }

    public String formatMails() {
        StringBuilder sb = new StringBuilder();
        for (Mail mail : mails) {
            sb.append(mail.formatHeader()).append("\n");
        }
        return sb.toString();
    }

    public String open(int index) {
        if (index < 0 || index >= mails.size()) {
            return "Invalid index";
        }
        Mail mail = mails.get(index);
        mail.setIsRead(true); 
        return mail.format();
    }

    public int countUnread() {
        int count = 0;
        for (Mail mail : mails) {
            if (!mail.getIsRead()) {
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {

        Mail m1 = new Mail("Torsten69@googlemail.com", "Bier in Garten", "Wat ist denn mit dem Bier?");
        Mail m2 = new Mail("Paul@dopatka.com", "Hausaufgaben", "Luc, HÖRBITTEAUFMICHUMHILFEZUBITTEN!!! FRAG EINFACH CHATGPT ODER DENK MAL SELBST NACH");
        Mail m3 = new Mail("ex@mpl.es", "examples", "ztubip xampelz");
        ArrayList<Mail> mailliste = new ArrayList<>();
        mailliste.add(m1);
        mailliste.add(m2);
        mailliste.add(m3);
        Inbox inbox1 = new Inbox(mailliste);
    
        System.out.println(inbox1.formatMails());
    
        //to do: evtl kleines Testprogramm schreiben, dass die Methoden testet und mit while auch erstmal interaktiv istlol

    }

}

