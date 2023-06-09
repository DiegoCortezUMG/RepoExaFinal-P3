/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
import Vista.frmMantUsuario;

import java.awt.Dimension;
import javax.swing.JOptionPane;

/**
 *
 * @author visitante
 */
public class MdiExaFinal extends javax.swing.JFrame {

    /**
     * Creates new form MdiGeneral
     */
    public MdiExaFinal() {
        initComponents();
        setLocationRelativeTo(null);
        this.setExtendedState(MdiExaFinal.MAXIMIZED_BOTH);
        this.setTitle("");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jDesktopPane1 = new javax.swing.JDesktopPane();
        mnuGeneral = new javax.swing.JMenuBar();
        mnuArchivo = new javax.swing.JMenu();
        mnuSalirSistema = new javax.swing.JCheckBoxMenuItem();
        mnuCatalogos = new javax.swing.JMenu();
        mnuCatalogosMantenimientos = new javax.swing.JMenu();
        mantenimientoUsuarios = new javax.swing.JMenuItem();
        mnuProcesos = new javax.swing.JMenu();
        aplicacionesUsuarios = new javax.swing.JMenuItem();
        menuperfilUsuario = new javax.swing.JCheckBoxMenuItem();
        mIAplicacionPerfil = new javax.swing.JMenuItem();
        mnuConsultas = new javax.swing.JMenu();
        consultaBitacora = new javax.swing.JCheckBoxMenuItem();
        mnuReportes = new javax.swing.JMenu();
        mnuAyudas = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem4.setText("jMenuItem4");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        mnuArchivo.setText("Archivo");
        mnuArchivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuArchivoActionPerformed(evt);
            }
        });

        mnuSalirSistema.setSelected(true);
        mnuSalirSistema.setText("Salir del Sistema");
        mnuSalirSistema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuSalirSistemaActionPerformed(evt);
            }
        });
        mnuArchivo.add(mnuSalirSistema);

        mnuGeneral.add(mnuArchivo);

        mnuCatalogos.setText("Catalogos");

        mnuCatalogosMantenimientos.setText("Mantenimientos");
        mnuCatalogosMantenimientos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuCatalogosMantenimientosActionPerformed(evt);
            }
        });

        mantenimientoUsuarios.setText("Mantenimiento Usuarios");
        mantenimientoUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mantenimientoUsuariosActionPerformed(evt);
            }
        });
        mnuCatalogosMantenimientos.add(mantenimientoUsuarios);

        mnuCatalogos.add(mnuCatalogosMantenimientos);

        mnuGeneral.add(mnuCatalogos);

        mnuProcesos.setText("Procesos");
        mnuProcesos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuProcesosActionPerformed(evt);
            }
        });

        aplicacionesUsuarios.setText("Aplicaciones Usuarios");
        aplicacionesUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aplicacionesUsuariosActionPerformed(evt);
            }
        });
        mnuProcesos.add(aplicacionesUsuarios);

        menuperfilUsuario.setSelected(true);
        menuperfilUsuario.setText("Perfil Usuario");
        menuperfilUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuperfilUsuarioActionPerformed(evt);
            }
        });
        mnuProcesos.add(menuperfilUsuario);

        mIAplicacionPerfil.setText("Aplicacion Perfil");
        mIAplicacionPerfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mIAplicacionPerfilActionPerformed(evt);
            }
        });
        mnuProcesos.add(mIAplicacionPerfil);

        mnuGeneral.add(mnuProcesos);

        mnuConsultas.setText("Consultas");
        mnuConsultas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnuConsultasActionPerformed(evt);
            }
        });

        consultaBitacora.setSelected(true);
        consultaBitacora.setText("Consulta de Bitacora");
        consultaBitacora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultaBitacoraActionPerformed(evt);
            }
        });
        mnuConsultas.add(consultaBitacora);

        mnuGeneral.add(mnuConsultas);

        mnuReportes.setText("Reportes");
        mnuGeneral.add(mnuReportes);

        mnuAyudas.setText("Ayudas");
        mnuGeneral.add(mnuAyudas);

        setJMenuBar(mnuGeneral);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void mnuCatalogosMantenimientosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuCatalogosMantenimientosActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_mnuCatalogosMantenimientosActionPerformed

    private void mantenimientoUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mantenimientoUsuariosActionPerformed
        // TODO add your handling code here:
        frmMantUsuario ventana = new frmMantUsuario();
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);
    }//GEN-LAST:event_mantenimientoUsuariosActionPerformed

    private void mnuArchivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuArchivoActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_mnuArchivoActionPerformed

    private void mnuSalirSistemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuSalirSistemaActionPerformed
        // TODO add your handling code here:
                /*===== OPERACIÓN CERRAR SESIÓN ====
          Variable entera respuesta_cs*/

        int respuesta_cs = JOptionPane.showConfirmDialog(this, "¿Desea Cerrar Sesión?", "Cerrar Sesión",            JOptionPane.YES_NO_OPTION);

        if (respuesta_cs == 0) {
            this.dispose();
        }        
    }//GEN-LAST:event_mnuSalirSistemaActionPerformed

    private void mnuConsultasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuConsultasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuConsultasActionPerformed

    private void consultaBitacoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultaBitacoraActionPerformed
        /*frmMantenimientoBitacora ventana = new frmMantenimientoBitacora();
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);*/
    }//GEN-LAST:event_consultaBitacoraActionPerformed

    private void aplicacionesUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aplicacionesUsuariosActionPerformed
        /*frmAplicacionUsuario ventana = new frmAplicacionUsuario();
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);*/
    }//GEN-LAST:event_aplicacionesUsuariosActionPerformed

    private void menuperfilUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuperfilUsuarioActionPerformed
        /*frmMantenimientoPerfilUsuario ventana = new frmMantenimientoPerfilUsuario();
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);*/
    }//GEN-LAST:event_menuperfilUsuarioActionPerformed

    private void mIAplicacionPerfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mIAplicacionPerfilActionPerformed
        /*frmProcesoAplicacionPerfil ventana = new frmProcesoAplicacionPerfil();
        jDesktopPane1.add(ventana);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = ventana.getSize();
        ventana.setLocation((desktopSize.width - FrameSize.width) / 2, (desktopSize.height - FrameSize.             height) / 2);*/
    }//GEN-LAST:event_mIAplicacionPerfilActionPerformed

    private void mnuProcesosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnuProcesosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mnuProcesosActionPerformed

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
            java.util.logging.Logger.getLogger(MdiExaFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MdiExaFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MdiExaFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MdiExaFinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MdiExaFinal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aplicacionesUsuarios;
    private javax.swing.JCheckBoxMenuItem consultaBitacora;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem mIAplicacionPerfil;
    private javax.swing.JMenuItem mantenimientoUsuarios;
    private javax.swing.JCheckBoxMenuItem menuperfilUsuario;
    private javax.swing.JMenu mnuArchivo;
    private javax.swing.JMenu mnuAyudas;
    private javax.swing.JMenu mnuCatalogos;
    private javax.swing.JMenu mnuCatalogosMantenimientos;
    private javax.swing.JMenu mnuConsultas;
    private javax.swing.JMenuBar mnuGeneral;
    private javax.swing.JMenu mnuProcesos;
    private javax.swing.JMenu mnuReportes;
    private javax.swing.JCheckBoxMenuItem mnuSalirSistema;
    // End of variables declaration//GEN-END:variables
}
