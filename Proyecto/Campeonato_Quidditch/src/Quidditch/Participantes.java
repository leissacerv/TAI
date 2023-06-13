package Quidditch;

import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;


public class Participantes extends javax.swing.JFrame {
    MiBD mibd;
    Fondo fondo= new Fondo();
    
    
    public Participantes() {
        mibd = new MiBD(); //Instanciando la clase MiBD para la conexión
        this.setContentPane(fondo);
        initComponents();
        MostrarTabla();
        System.out.println("Ancho: " + this.getWidth());
        System.out.println("Alto: " + this.getHeight());
    }

    public void MostrarTabla(){
        ResultSet result;
        result = mibd.getQuery("select * from PARTICIPANTE;");
        DefaultTableModel Modelo=(DefaultTableModel) TablaParticipantes.getModel();
        
        if (Modelo.getRowCount() > 0) //Si tengo filas en mi tabla actualmente
            Modelo.setRowCount(0);//Vacía la tabla de la interfaz
        
        Object[] datos=new Object[8]; //Llena a tabla
        try
        {
            while(result.next())
            {
                
                datos[0]=(result.getString("curp"));
                datos[1]=(result.getString("nombre_comp"));
                datos[2]=(result.getInt("fk_idpais"));
                datos[3]=(result.getInt("edad"));
                datos[4]=(result.getFloat("altura"));
                datos[5]=(result.getInt("peso"));
                datos[6]=(result.getInt("fk_hotel"));
                datos[7]=(result.getString("estado"));
                Modelo.addRow(datos);
                
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }

    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField6 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jPanel1 = new Fondo();
        jLabel4 = new javax.swing.JLabel();
        txtAltura = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtPeso = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        cbxPais = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cbxHotel = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        cbxEstado = new javax.swing.JComboBox<>();
        btnGuardar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        txtCurp = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaParticipantes = new javax.swing.JTable();

        jTextField6.setText("jTextField6");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1178, 690));

        jLabel4.setText("ID País de Origen:");

        jLabel5.setText("Altura:");

        jLabel6.setText("Peso:");

        cbxPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona país", "1", "2", "3", "4", "5", "6", "7", "8", " " }));
        cbxPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxPaisActionPerformed(evt);
            }
        });

        jLabel7.setText("ID Hotel:");

        cbxHotel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona hotel", "1", "2" }));
        cbxHotel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxHotelActionPerformed(evt);
            }
        });

        jLabel8.setText("Estado:");

        cbxEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Selecciona estado", "Habilitado", "Deshabilitado" }));
        cbxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxEstadoActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel1.setText("CURP:");

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtCurp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCurpActionPerformed(evt);
            }
        });

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        jLabel3.setText("Edad:");

        TablaParticipantes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "CURP", "Nombre", "ID País", "Edad", "Altura", "Peso", "ID Hotel", "Estado"
            }
        ));
        jScrollPane1.setViewportView(TablaParticipantes);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1)
                                .addComponent(jLabel2))
                            .addGap(61, 61, 61)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(txtCurp, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel3)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7)
                                .addComponent(jLabel8))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtEdad)
                                .addComponent(txtAltura)
                                .addComponent(txtPeso)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cbxPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbxHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(0, 0, Short.MAX_VALUE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(btnGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btnModificar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEliminar)
                        .addGap(18, 18, 18)
                        .addComponent(btnLimpiar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(176, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtCurp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(cbxPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtAltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cbxHotel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(cbxEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(43, 43, 43)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardar)
                            .addComponent(btnModificar)
                            .addComponent(btnEliminar)
                            .addComponent(btnLimpiar)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(87, 87, 87))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1173, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Participantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Participantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Participantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Participantes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Participantes().setVisible(true);
            }
        });
    }
    
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        String fk_idpais=cbxPais.getSelectedItem().toString();
        String fk_hotel=cbxHotel.getSelectedItem().toString();
        String estado=cbxEstado.getSelectedItem().toString();
        String edad=txtEdad.getText();
        String peso=txtPeso.getText();
        try {
            PreparedStatement ps= mibd.getConnection().prepareStatement("INSERT INTO PARTICIPANTE (curp, nombre_comp, fk_idpais, edad, altura, peso, fk_hotel, estado) VALUES (?,?,?,?,?,?,?,?)");
            ps.setString(1,txtCurp.getText());
            ps.setString(2,txtNombre.getText());
            ps.setInt(3,Integer.parseInt(fk_idpais));  //  i   Integer.parseInt()
            ps.setInt(4,Integer.parseInt(edad));
            ps.setFloat(5, Float.parseFloat(txtAltura.getText())); // Float.parseFloat()
            ps.setInt(6,Integer.parseInt(peso));
            ps.setInt(7,Integer.parseInt(fk_hotel));
            ps.setString(8,cbxEstado.getSelectedItem().toString());
            
            int status = ps.executeUpdate();
            
            if (status == 1) { 
                JOptionPane.showMessageDialog(null,"Se guardó correctamente");
            }
        } catch (SQLException ex) {
            Logger.getLogger(Participantes.class.getName()).log(Level.SEVERE, null, ex);
        }
        MostrarTabla();
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        try{
            PreparedStatement ps= mibd.getConnection().prepareStatement("UPDATE participante set estado = ? where curp = ?");
            //ResultSet rs= null;
            ps.setString(1, "Inhabilitado");
            ps.setString(2, txtCurp.getText());
            
            ps.executeUpdate();
 
            
            JOptionPane.showMessageDialog(null, "Participante eliminado ^.^");
            MostrarTabla();
        }catch(SQLException ex){
            Logger.getLogger(Participantes.class.getName()).log(Level.SEVERE,null,ex);
            JOptionPane.showMessageDialog(null,"Participante no eliminado");
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cbxPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxPaisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxPaisActionPerformed

    private void txtCurpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCurpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCurpActionPerformed

    private void cbxHotelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxHotelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxHotelActionPerformed

    private void cbxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxEstadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbxEstadoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        
        try{
            PreparedStatement ps= mibd.getConnection().prepareStatement("SELECT * from Participante WHERE curp=?");
            ResultSet rs= null;
            ps.setString(1, txtCurp.getText());
            
            rs=ps.executeQuery();
            
            if(rs.next()){
                txtCurp.setText(rs.getString("curp"));
                txtNombre.setText(rs.getString("nombre_comp"));
                cbxPais.setSelectedIndex(rs.getInt("fk_idpais"));
                txtEdad.setText(rs.getString("edad"));
                txtAltura.setText(rs.getString("altura"));
                txtPeso.setText(rs.getString("Peso"));
                cbxHotel.setSelectedIndex(rs.getInt("fk_hotel"));
                cbxEstado.setSelectedItem(rs.getString("estado"));
            }
            
            JOptionPane.showMessageDialog(null, "Participante encontrado ^.^");
            MostrarTabla();
        }catch(SQLException ex){
            Logger.getLogger(Participantes.class.getName()).log(Level.SEVERE,null,ex);
            JOptionPane.showMessageDialog(null,"Participante no encontrado unu");
        }
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String fk_idpais=cbxPais.getSelectedItem().toString();
        String fk_hotel=cbxHotel.getSelectedItem().toString();
        String estado=cbxEstado.getSelectedItem().toString();
        String edad=txtEdad.getText();
        String peso=txtPeso.getText();
        
        try {
            PreparedStatement ps= mibd.getConnection().prepareStatement("UPDATE PARTICIPANTE SET nombre_comp=?, fk_idpais=?, edad=?, altura=?, peso=?, fk_hotel=?, estado=? WHERE curp=?");
            ps.setString(1,txtNombre.getText());
            ps.setInt(2,Integer.parseInt(fk_idpais));  //  i   Integer.parseInt()
            ps.setInt(3,Integer.parseInt(edad));
            ps.setFloat(4, Float.parseFloat(txtAltura.getText())); // Float.parseFloat()
            ps.setInt(5,Integer.parseInt(peso));
            ps.setInt(6,Integer.parseInt(fk_hotel));
            ps.setString(7,cbxEstado.getSelectedItem().toString());
            ps.setString(8,txtCurp.getText());
            
            int status = ps.executeUpdate();
            
            if (status == 1) { 
                JOptionPane.showMessageDialog(null,"Se modifico correctamente");
            }
            MostrarTabla();
        } catch (SQLException ex) {
            Logger.getLogger(Participantes.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"No se pudieron modificar datos");
        }
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtCurp.setText("");
        txtNombre.setText("");
        cbxPais.setSelectedIndex(0);
        txtEdad.setText("");
        txtAltura.setText("");
        txtPeso.setText("");
        cbxHotel.setSelectedIndex(0);
        cbxEstado.setSelectedIndex(0);
        
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaParticipantes;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cbxEstado;
    private javax.swing.JComboBox<String> cbxHotel;
    private javax.swing.JComboBox<String> cbxPais;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField txtAltura;
    private javax.swing.JTextField txtCurp;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPeso;
    // End of variables declaration//GEN-END:variables

    private Connection getConection() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
        //Para añadir un background a nuestra interfaz
    class Fondo extends JPanel{
        
        private Image fondo;
        
        public void paint(Graphics g){
            fondo = new ImageIcon(getClass().getResource("/Fondo/fondo.png")).getImage();
            
            //Se obtiene
            g.drawImage(fondo, 0, 0, 1178,690, this);
            
            setOpaque(false);
            
            super.paint(g);
        }
    
    }
}
