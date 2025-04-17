/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dialog;

import interface_noyau_fonctionnel.InterfaceNoyauFonctionnel;
import java.awt.EventQueue;
import java.time.LocalDate;
import presentation.FrameReservation;
import javax.swing.JOptionPane;

public class DialogReservation {

    private FrameReservation frameReservation;
    private InterfaceNoyauFonctionnel inf;
    private LocalDate date;
    private String time;
    private int nbPersons;
    private int numTable;

    public DialogReservation(InterfaceNoyauFonctionnel inf) {
        this.inf = inf;
    }

    public void initDialog() {
        frameReservation = new FrameReservation();
        frameReservation.initFrame();
        frameReservation.setDialog(this);
        frameReservation.setVisible(true);
    }

    public void handleDateSelectedEvent(LocalDate date) {
        this.date = date;
    }

    public void handleTimeSelectedEvent(String time) {
        this.time = time;
    }

    public void handleNumOfPersonsSelectedEvent(int nbPersons) {
        this.nbPersons = nbPersons;
    }

    public void handleTableSelectedEvent(int numTable) {
        this.numTable = numTable;
    }

    public void handleCancelEvent() {
        date = null;
        time = null;
        nbPersons = -1;
        numTable = -1;
    }

    public void handleValidationEvent() {
        String message = String.format("""
                                       Réservation confirmé :
                                       - Date: %s
                                       - Heure: %s
                                       - Nombre de personnes: %d
                                       - Table: %d""",
                date.toString(),
                time,
                nbPersons,
                numTable
        );
        JOptionPane.showMessageDialog(frameReservation,
                message,
                "Confirmation",
                JOptionPane.INFORMATION_MESSAGE);
    }
    
    public void handleErreurDate(){
        String message = "Date déjà Passée. Choissisez une date futur.";
        JOptionPane.showMessageDialog(frameReservation,
                message,
                "Erreur Date",
                JOptionPane.INFORMATION_MESSAGE);
    }
    
    public String[] trouvertabledisponible(int nbPersonnes){
        return inf.trouverTableDisponible(0, 0, nbPersonnes, time);
    }

    public static void main(String[] args) {
        DialogReservation dialog = new DialogReservation(new InterfaceNoyauFonctionnel());
        EventQueue.invokeLater(() -> {
            dialog.initDialog();
        });
    }

}
