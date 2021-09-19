package igu;

import javax.swing.JOptionPane;

/**
 * @author victor
 */
public class Agenda extends javax.swing.JFrame {
    /**
     * Considerando que entre los vectores no se realizan ningún tipo de comparación
     * ni operaciones entre ellos se definen como tipo String.
     */
    
    // Vectores para guardar 10 contactos
        String dni[] = new String [10];
        String nombre[] = new String [10];
        String apellido[] = new String [10];
        String direccion[] = new String [10];
        String telefono[] = new String [10];
        String fecha_nac[] = new String [10];
        int i=0;
        
    public Agenda() {
        initComponents();
        txtIndice.setText("0");
        
        // Se inicializa los vectores con blancos para que no muestre null
        for (int n = 0; n<dni.length; n++){
            dni[n]="";
            nombre[n]="";
            apellido[n]="";
            direccion[n]="";
            telefono[n]="";
            fecha_nac[n]="";
        }  
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelDni = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabelApellido = new javax.swing.JLabel();
        jLabelDireccion = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jLabelFecha = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtFecha = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        btnSiguiente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtIndice = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelTitulo.setFont(new java.awt.Font("Ubuntu", 2, 24)); // NOI18N
        jLabelTitulo.setText("Agenda Electrónica");

        jLabelDni.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabelDni.setText("DNI:");

        jLabelNombre.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabelNombre.setText("Nombre:");

        jLabelApellido.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabelApellido.setText("Apellido:");

        jLabelDireccion.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabelDireccion.setText("Dirección:");

        jLabelTelefono.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabelTelefono.setText("Teléfono:");

        jLabelFecha.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabelFecha.setText("Fecha Nac.:");

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDniKeyTyped(evt);
            }
        });

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        txtTelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtTelefonoKeyTyped(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(18, 226, 30));
        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnAtras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login-arrow-symbol-entering-back-into-a-square_icon-icons.com_73221.png"))); // NOI18N
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnSiguiente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/login-square-arrow-button-outline_icon-icons.com_73220.png"))); // NOI18N
        btnSiguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSiguienteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 1, 15)); // NOI18N
        jLabel1.setText("Contacto :");

        txtIndice.setEditable(false);
        txtIndice.setFont(new java.awt.Font("Ubuntu", 1, 15)); // NOI18N
        txtIndice.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabelApellido)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtApellido))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelNombre)
                                    .addComponent(jLabelDni))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDni, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(17, 17, 17)
                                        .addComponent(txtNombre)))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelTelefono)
                            .addComponent(jLabelDireccion)
                            .addComponent(jLabelFecha))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                            .addComponent(txtTelefono, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtFecha, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIndice, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(btnAtras)
                        .addGap(18, 18, 18)
                        .addComponent(btnSiguiente)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelTitulo)
                .addGap(237, 237, 237))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabelTitulo)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDni)
                    .addComponent(jLabelDireccion)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelefono)
                    .addComponent(txtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelApellido)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelFecha))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnSiguiente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIndice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
       /*
        Obligamos a que todos los campos estén completos.
        Completando todo se guarda en esa posición de todos los vectores los datos cargados
       */
        if (txtDni.getText().equals(0) || txtNombre.getText().equals("") || txtApellido.getText().equals("") || txtDireccion.getText().equals("") || txtTelefono.getText().equals("") || txtFecha.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Por favor complete todos los campos");
        }else{
            
            dni[i]=txtDni.getText();
            nombre[i]=txtNombre.getText();
            apellido[i]=txtApellido.getText();
            direccion[i]=txtDireccion.getText();
            telefono[i]=txtTelefono.getText();
            fecha_nac[i]=txtFecha.getText(); 
        }
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnSiguienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSiguienteActionPerformed
        // Incrementa el contador del Índice 
        if (i<9){
            i++;
            String index = Integer.toString(i);
            txtIndice.setText(index);
         }
         
        /*
            Porque se obligo al principio a completar todos los campos, con preguntar
            en la posición actual del vector DNI se sabe si tiene datos cargados o no,
            de acuerdo a eso se muestra que tiene guardado.
        */
         if (!dni[i].equals("")){
             txtDni.setText(String.valueOf(dni[i]));
             txtNombre.setText(String.valueOf(nombre[i]));
             txtApellido.setText(String.valueOf(apellido[i]));
             txtDireccion.setText(String.valueOf(direccion[i]));
             txtTelefono.setText(String.valueOf(telefono[i]));
             txtFecha.setText(String.valueOf(fecha_nac[i]));   
         } else {
             txtDni.setText("");
             txtNombre.setText("");
             txtApellido.setText("");
             txtDireccion.setText("");
             txtTelefono.setText("");
             txtFecha.setText("");
         }    
    }//GEN-LAST:event_btnSiguienteActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
       // Decrementa el contador del Índice
       if (i>0){
            i--;
            String index = Integer.toString(i);
            txtIndice.setText(index);
       }
       
       /*
            Porque se obligo al principio a completar todos los campos, con preguntar
            en la posición actual del vector DNI se sabe si tiene datos cargados o no,
            de acuerdo a eso se muestra que tiene guardado.
       */
       if (!dni[i].equals("")){
            txtDni.setText(String.valueOf(dni[i]));
            txtNombre.setText(String.valueOf(nombre[i]));
            txtApellido.setText(String.valueOf(apellido[i]));
            txtDireccion.setText(String.valueOf(direccion[i]));
            txtTelefono.setText(String.valueOf(telefono[i]));
            txtFecha.setText(String.valueOf(fecha_nac[i]));
         } else{
                txtDni.setText("");
                txtNombre.setText("");
                txtApellido.setText("");
                txtDireccion.setText("");
                txtTelefono.setText("");
                txtFecha.setText("");
       }
    }//GEN-LAST:event_btnAtrasActionPerformed
    
    /**
     *   Se realizan ciertas restricciones al momento de realizar ingresos de los datos.
     *   Fuente: https://matixa.co/categoria/programacion/java/validar-ingreso-de-caracteres-en-un-jtextfield
    */
    
    // Se permite un DNI solo con números por código ASCII y hasta 8 dígitos
    private void txtDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDniKeyTyped
        // 48--> 0 | 57--> 9
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        
        if (!numeros){
            evt.consume();
        }

        if (txtDni.getText().trim().length() == 8) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDniKeyTyped

    // Se permite un Teléfono solo con números por código ASCII y hasta 15 dígitos
    private void txtTelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTelefonoKeyTyped
        int key = evt.getKeyChar();
        // 48--> 0 | 57--> 9
        boolean numeros = key >= 48 && key <= 57;
        
        if (!numeros){
            evt.consume();
        }

        if (txtTelefono.getText().trim().length() == 15) {
            evt.consume();
        }
    }//GEN-LAST:event_txtTelefonoKeyTyped
    
    // Permite sólo el ingreso de caracteres alfabéticos
    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
            
        if (!(minusculas || mayusculas || espacio))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    // Permite sólo el ingreso de caracteres alfabéticos
    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
            
        if (!(minusculas || mayusculas || espacio))
        {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnSiguiente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelApellido;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelDni;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtIndice;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}