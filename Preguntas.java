/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proy;

import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author irvin
 */
public class Preguntas extends javax.swing.JFrame {
  
public boolean issuspended = false;//para saber si el hilo esta suspendido o pausado
                int hora = 0, min = 0, seg = 31, ds = 0;
                ArrayList<String>Oraciones=new ArrayList<>();
      int num;
      int a=0;

    /**
     * Creates new form Preguntas
     */
    public Preguntas() {
        initComponents();
    }
        Thread hilo =new Thread(){
   // hilo=new Thread(){
       
             @Override
        public void run() {
            try {
                while (true) {//ciclo infinito
                    if (ds == 0) {//si los decisegundos son iguales a 99
                        ds = 99;//decisegundo vuelve a empezar en cero
                        seg--;//y aumenta un segundo
                    }
                    if (seg == 0) {//si los segundos son iguales a 59
                        
                        //seg = 59;//segundo vuelve a empezar en cero
                        //min--;//y aumenta un minuto
                        //JOptionPane.showMessageDialog(null,"Se te acabo el tiempo,Perdiste!");
                        //issuspended=true;
                       //se suspende el hilo.. (NO utilizamos hilo.stop() porque si lo usamos, el hilo se "muere")
                        ds = seg = min = hora = 0;//todas las unidades en cero
                        lblTime.setText("0:0:0:0");
                        usuario.perder();
                       regresar();
                        
                        hilo.suspend();
                        
                         
                        
                    }
                    if (min == 59) {//si los minutos son iguales a 59
                        min = 0;//minuto vuelve a empezar en cero
                        hora++;//y aumenta una hora
                    }
                    ds--;//aumentan las decimas de segundo

                    lblTime.setText( min + ":" + seg + ":" + ds);//se muestra en el jlabel

                    hilo.sleep(10);//que duerma una decima de segundo
                }
            } catch (java.lang.InterruptedException ie) {
                System.out.println(ie.getMessage());
            }
        }
    };
        public void regresar(){
            Menu abrir=new Menu();
            abrir.setVisible(true);
            this.setVisible(false);
        }
        
        public void Oracioness(){
            Oraciones.add("Thenameofmysisterisveronica");
            Oraciones.add("Iwentwalkingtotheschoolyesterday");
            Oraciones.add("Healwayseatspizzaallthedays");
            Oraciones.add("Iwillnotgotosixflagstomorroy");
            Oraciones.add("HaveyoueverbeeninLondon?");
        }
        
        public void darOracion(int numero){
            num=numero;
            
        }
        
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTime = new javax.swing.JLabel();
        btniniciar = new javax.swing.JButton();
        lbloracion = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txt1 = new javax.swing.JTextField();
        txt2 = new javax.swing.JTextField();
        txt3 = new javax.swing.JTextField();
        txt4 = new javax.swing.JTextField();
        txt5 = new javax.swing.JTextField();
        txt6 = new javax.swing.JTextField();
        txt7 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTime.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTime.setText("0:0:0");

        btniniciar.setText("Iniciar desafio");
        btniniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniniciarActionPerformed(evt);
            }
        });

        lbloracion.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 0, 20)); // NOI18N

        jButton1.setText("Calificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txt7))
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btniniciar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblTime, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbloracion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTime)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btniniciar)))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lbloracion, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btniniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniniciarActionPerformed
        // TODO add your handling code here:
       Oracioness();
       //declaramos el hilo
       Random n = new Random();
      //int a= n.nextInt();
      
       
        
         if (!issuspended) {//si no esta suspendido o pausado
            hilo.start();//el hilo empieza
        }
        btniniciar.setEnabled(false);
        switch (a){
            case 0:
                lbloracion.setText("name   /   my   /   The   /   of   /   veronica   /   is   /   sister");
                darOracion(a);
                break;
            case 1:
                lbloracion.setText("went   /to   /yesterday   /   I   /   walking   /   school   /   the");
                darOracion(a);
                break;
            case 2:
                lbloracion.setText("eats   /   days   /   all   /   He   /   pizza   /   the   /   always");
                darOracion(a);
                break;
            case 3:
                lbloracion.setText("will   /   go   /   not   /   I   /   tomorroy   /   sixflags   /   to");
                darOracion(a);
                break;
            case 4:
                lbloracion.setText("you   /   London   /   Have   /   been   /   ever   /   in   /   ?");
                darOracion(a);
                break;
            default:
                hilo.suspend();
                JOptionPane.showMessageDialog(null,"Numero de pregunta no encontrado");
                darOracion(a);
                
        }
        

    }//GEN-LAST:event_btniniciarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         // TODO add your handling code here:
         hilo.suspend();
        String uno,dos,tres,cuatro,cinco,seis,siete;
        String espa=" ";
        String frase="";
        uno=txt1.getText();
        dos=txt2.getText();
        tres=txt3.getText();
        cuatro=txt4.getText();
        cinco=txt5.getText();
        seis=txt6.getText();
        siete=txt7.getText();
        frase+=uno+espa+dos+espa+tres+espa+cuatro+espa+cinco+espa+seis+espa+siete;
        String aux="";
        String de="";
        char a[] =new char[50];
        a=frase.toCharArray();
        for(int i=0;i<a.length;i++){
            de=(new StringBuffer().append(a[i])).toString();
            if(de.compareTo(" ")!=0){
                aux+=de;  
            }
        }
        JOptionPane.showMessageDialog(null, aux);
        if(aux.compareTo(Oraciones.get(num))==0){
            usuario.victoria();
            num=num+1;
            if (num>=4){
                num=0;
            }
            Menu abrir=new Menu();
            abrir.setVisible(true);
            this.setVisible(false);
        }
        else{
            usuario.perder();
            num=num+1;
            if (num>=4){
                num=0;
            }
            Menu abrir=new Menu();
            abrir.setVisible(true);
            this.setVisible(false);
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Preguntas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Preguntas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btniniciar;
    private javax.swing.JButton jButton1;
    public static javax.swing.JLabel lblTime;
    private javax.swing.JLabel lbloracion;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    private javax.swing.JTextField txt4;
    private javax.swing.JTextField txt5;
    private javax.swing.JTextField txt6;
    private javax.swing.JTextField txt7;
    // End of variables declaration//GEN-END:variables
}
