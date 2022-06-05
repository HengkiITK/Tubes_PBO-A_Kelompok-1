package rentalMobil.logic;
import rentalMobil.view.ViewInputDataPeminjam;

public class Main {
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewInputDataPeminjam().setVisible(true);
                new ViewInputDataPeminjam();
            }
        });
    }
}
