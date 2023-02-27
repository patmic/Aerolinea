package GUI;

import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;

import javax.swing.JFrame;
import javax.swing.JPanel;

import BL.VuelosG3BL;
import BL.Entities.VuelosG3;
import DAC.VuelosG3DAC;

import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.List;

public class PanelMisViajesG3 extends JFrame {
  public PanelMisViajesG3() {
    setTitle("Vuelos mas buscados");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(450, 100, 500, 500);
    setLayout(new GridLayout(3, 3, 0, 0));
    vuelos();

  }

  private void vuelos() {
    setLayout(new GridLayout(3, 3, 10, 10));

    add(Itinerario());
    add(Itinerario());

    setVisible(true);
  }

  public JPanel Itinerario() {
    JPanel panel = new JPanel(new BorderLayout());
    panel.setBackground(Color.red);

    JButton boton = crearBoton(); // llama al método que crea el botón
    panel.add(boton, BorderLayout.EAST); // agrega el botón en la región este

    return panel;
  }

  public JButton crearBoton() {
    JButton boton = new JButton("➪");
    boton.setPreferredSize(new Dimension(50, 50)); // establece el tamaño del botón

    boton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JFrame frame = new JFrame("Itinerario");
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setBounds(500, 200, 400, 400);
        JPanel nuevoPanel = new JPanel();
        nuevoPanel.setBackground(Color.green);
        frame.add(nuevoPanel);
        frame.setVisible(true);
      }
    });

    return boton;
  }

  public static void main(String[] args) throws SQLException {
    String url = "jdbc:sqlite:data/DBAerolineaG3.db";
        VuelosG3DAC vuelosDAC = new VuelosG3DAC(url);
        VuelosG3BL vuelosBL = new VuelosG3BL(vuelosDAC);

        // Ejecutar la consulta SQL y obtener la lista de vuelos
        List<VuelosG3> vuelos = vuelosBL.obtenerVuelos();

        // Procesar los resultados de la consulta
        for (VuelosG3 vuelo : vuelos) {
            System.out.println(vuelo.getId() + "\t" + vuelo.getDesde() + "\t" + vuelo.getHasta() + "\t" + vuelo.getFecha() + "\t" + vuelo.getPrecio() + "\t" + vuelo.getClase() + "\t" + vuelo.getHoraSalida() + "\t" + vuelo.getHoraLlegada());
        }
  }
}
