package GUI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Vuelo extends JFrame {
    public Vuelo() {
        getContentPane().setBackground(new Color(255, 255, 255));
        setBackground(new Color(255, 255, 255));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("VUELOS");
        setVisible(true);
        setAlwaysOnTop(true);
        // setResizable(false);
        // setMaximizedBounds(new Rectangle(0, 0, 280, 400));
        setMinimumSize(new Dimension(800, 600));
        // setSize(275, 400);
        setLocationRelativeTo(null);
        getContentPane().setLayout(new BorderLayout(0, 0));

        JPanel panelGRUPO2 = new JPanel();
        panelGRUPO2.setOpaque(false);
        panelGRUPO2.setBorder(new EmptyBorder(5, 0, 10, 0));
        getContentPane().add(panelGRUPO2, BorderLayout.NORTH);
        panelGRUPO2.setLayout(new GridLayout(2, 0, 0, 8));

        JPanel panelFiltros = new JPanel();
        panelFiltros.setBorder(null);
        panelFiltros.setOpaque(false);
        panelGRUPO2.add(panelFiltros);

        JLabel lblNewLabel_1 = new JLabel("AQUI VA LA BARRA DE FILTROS");
        panelFiltros.add(lblNewLabel_1);

        JPanel panelBusqueda = new JPanel();
        panelBusqueda.setBorder(null);
        panelBusqueda.setOpaque(false);
        panelGRUPO2.add(panelBusqueda);

        JLabel lblNewLabel_2 = new JLabel("AQUI VA LA BUSQUEDA");
        panelBusqueda.add(lblNewLabel_2);

        /*
         * Panel del grupo 4 - Anthony Morales y Said Luna
         */
        JPanel panelGRUPO4 = new JPanel();
        panelGRUPO4.setOpaque(false);
        getContentPane().add(panelGRUPO4, BorderLayout.CENTER);

        JLabel lblNewLabel = new JLabel("INFORMACION DE VUELOS");
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        panelGRUPO4.add(lblNewLabel);

        //****************************************************************** */
        JButton btnImprimir = new JButton("Imprimir");
        btnImprimir.addActionListener(new ActionListener() {
    public void actionPerformed(ActionEvent e) {
        // Obtenemos los valores seleccionados en los filtros
        String tipoViaje = (String) cbxConfirmarRetorno.getSelectedItem();
        String plan = (String) elegirPlan.getSelectedItem();
        int numPasajeros = Integer.parseInt((String) cantidadPasajeros.getSelectedItem());
        boolean usarMillas = ckbxUsarMillas.isSelected();
        String origen = txtOrigen.getText();
        String destino = txtDestino.getText();
        String origenIdaVuelta = txtOrigenIdaVuelta.getText();
        String destinoIdaVuelta = txtDestinoIdaVuelta.getText();
        String fecha = txtFechaIda.getText();
        String fechaIdaV = txtFechaIdaV.getText();
        String fechaVuelta = txtFechaVuelta.getText();

        // Obtener el elemento seleccionado del JComboBox
        String seleccion = (String) cbxConfirmarRetorno.getSelectedItem();
        
        // Cambiar el panel de abajo según el elemento seleccionado
        if (seleccion.equals("Solo ida")) {
            String mensaje = "Tipo de viaje: " + tipoViaje + "\n"
                       + "Plan: " + plan + "\n"
                       + "Número de pasajeros: " + numPasajeros + "\n"
                       + "Usar millas: " + usarMillas + "\n"
                       + "Origen: " + origen + "\n"
                       + "Destino: " + destino + "\n"
                       + "Fecha Ida: " + fecha + "\n";
                       //+ "Fecha Vuelta: " + fechaV + "\n";

        // Mostramos la ventana de diálogo
        JOptionPane.showMessageDialog(Vuelo.this, mensaje, "Imprimir datos", JOptionPane.INFORMATION_MESSAGE);
        } else if (seleccion.equals("Ida y Vuelta")) {
            String mensaje = "Tipo de viaje: " + tipoViaje + "\n"
                       + "Plan: " + plan + "\n"
                       + "Número de pasajeros: " + numPasajeros + "\n"
                       + "Usar millas: " + usarMillas + "\n"
                       + "Origen: " + origenIdaVuelta + "\n"
                       + "Destino: " + destinoIdaVuelta + "\n"
                       + "Fecha Ida: " + fechaIdaV + "\n"
                       + "Fecha Vuelta: " + fechaVuelta + "\n";

        // Mostramos la ventana de diálogo
        JOptionPane.showMessageDialog(Vuelo.this, mensaje, "Imprimir datos", JOptionPane.INFORMATION_MESSAGE);
        }
        // Creamos el mensaje que se mostrará en la ventana de impresión
    }
});
panelBusqueda.add(btnImprimir, BorderLayout.EAST);
    }

    }

    public static void main(String[] args) throws Exception {
        Vuelo m = new Vuelo();
        m.setVisible(true);
    }
}
