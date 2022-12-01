/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package main.frontend;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import com.google.gson.JsonObject;
import main.backend.EmpleadoJSONParser;
import main.backend.controllerJSON;

public class LecturaJSONUI extends javax.swing.JFrame {

    EmpleadoJSONParser empleadoJSONParser = new EmpleadoJSONParser();
    ArrayList<JsonObject> empleados = new ArrayList<JsonObject>();
      
    controllerJSON readJSON = new controllerJSON("C:\\Users\\Usuario\\Downloads\\ConstruccionProyecto\\ConstruccionProyectoUnidad3NovDic2022-development\\files\\empleados3.json");

    int paso = 0;
    int posicion=1;

    public LecturaJSONUI() {
        initComponents();
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        jButtonAnterior.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonAnterior = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabelid = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabelnombre = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabelapellido = new javax.swing.JLabel();
        jLabelfoto = new javax.swing.JLabel();
        jButtonSiguiente = new javax.swing.JButton();
        jButtonActualizar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 30)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Empleados");

        jButtonAnterior.setBackground(new java.awt.Color(0, 153, 255));
        jButtonAnterior.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonAnterior.setText("Anterior");
        jButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel2.setText("ID:");

        jLabelid.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel4.setText("Nombre:");

        jLabelnombre.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N
        jLabel6.setText("Apellido:");

        jLabelapellido.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 24)); // NOI18N

        jLabelfoto.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jButtonSiguiente.setBackground(new java.awt.Color(0, 153, 255));
        jButtonSiguiente.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jButtonSiguiente.setText("Siguiente");
        jButtonSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSiguienteActionPerformed(evt);
            }
        });

        jButtonActualizar.setBackground(new java.awt.Color(255, 153, 153));
        jButtonActualizar.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jButtonActualizar.setText("Actualizar");
        jButtonActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonActualizarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelnombre))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelapellido))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabelid)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jButtonAnterior)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonSiguiente))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(112, 112, 112)
                        .addComponent(jButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabelid))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabelnombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabelapellido))
                .addGap(29, 29, 29)
                .addComponent(jLabelfoto, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAnterior)
                    .addComponent(jButtonSiguiente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonActualizarActionPerformed
        // TODO add your handling code here:

        Actualizar actualizar = new Actualizar(posicion, empleados);
        this.setVisible(false); 
        actualizar.setVisible(true);
        actualizar.iniciar();

    }//GEN-LAST:event_jButtonActualizarActionPerformed

    private void jButtonSiguienteActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonSiguienteActionPerformed

        jButtonAnterior.setEnabled(true);
        if(empleados.size()==0){
            readJSON.getValidadorJSON().esArchivoCorrectoJSON();
            empleadoJSONParser.parseToEmpleados( readJSON.getValidadorJSON().getJSONLeido() );
            empleados = empleadoJSONParser.getEmpleados();
        }

        paso=paso+1;
        posicion=posicion+1;
     
        if (paso == empleados.size()-1  ) {
            jButtonSiguiente.setEnabled(false);
         //   paso = empleados.size();
        }else{
            
        }
        JsonObject empleado=empleados.get(paso);
        jLabelid.setText(String.valueOf(empleado.get("id").getAsString()));
        jLabelnombre.setText(empleado.get("firstName").getAsString());
        jLabelapellido.setText(empleado.get("lastName").getAsString());
        Image imagen = null;
       
        try {
            // Inicializar y asignar url de la imagen a mostrar
            URL url = new URL(empleado.get("photo").getAsString());
            // Asignacion de url a la imagen
            imagen = ImageIO.read(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Mostrar imagen

        jLabelfoto.setIcon(new ImageIcon(imagen));

    }// GEN-LAST:event_jButtonSiguienteActionPerformed

    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButtonAnteriorActionPerformed
        jButtonSiguiente.setEnabled(true);
        if(empleados.size()==0){
            readJSON.getValidadorJSON().esArchivoCorrectoJSON();
            empleadoJSONParser.parseToEmpleados( readJSON.getValidadorJSON().getJSONLeido() );
            empleados = empleadoJSONParser.getEmpleados();
        }
    
        paso = paso - 1;
        posicion=posicion-1;

        if (paso <= 0) {
            paso = 0;
            jButtonAnterior.setEnabled(false);
        }

        jLabelid.setText(String.valueOf(empleados.get(paso).get("id").getAsString()));
        jLabelnombre.setText(empleados.get(paso).get("firstName").getAsString());
        jLabelapellido.setText(empleados.get(paso).get("lastName").getAsString());
        Image imagen = null;
       
        try {
            // Inicializar y asignar url de la imagen a mostrar
            URL url = new URL(empleados.get(paso).get("photo").getAsString());
            // Asignacion de url a la imagen
            imagen = ImageIO.read(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Mostrar imagen

        jLabelfoto.setIcon(new ImageIcon(imagen));

    }// GEN-LAST:event_jButtonAnteriorActionPerformed

    public void iniciar() {

        if(empleados.size()==0){
            readJSON.getValidadorJSON().esArchivoCorrectoJSON();
            empleadoJSONParser.parseToEmpleados( readJSON.getValidadorJSON().getJSONLeido() );
            empleados = empleadoJSONParser.getEmpleados();   
        }

        jLabelid.setText(String.valueOf(empleados.get(paso).get("id").getAsString()));
        jLabelnombre.setText(empleados.get(paso).get("firstName").getAsString());
        jLabelapellido.setText(empleados.get(paso).get("lastName").getAsString());

        Image imagen = null;

        try {
            // Inicializar y asignar url de la imagen a mostrar
            URL url = new URL(empleados.get(paso).get("photo").getAsString());
            // Asignacion de url a la imagen
            imagen = ImageIO.read(url);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // Mostrar imagen
        
        jLabelfoto.setIcon(new ImageIcon(imagen));

    }

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonActualizar;
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelapellido;
    private static javax.swing.JLabel jLabelfoto;
    private javax.swing.JLabel jLabelid;
    private javax.swing.JLabel jLabelnombre;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}