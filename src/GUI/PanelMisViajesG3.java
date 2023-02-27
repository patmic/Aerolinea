package GUI;

import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.BorderLayout;
import java.awt.GridBagConstraints;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import BL.VuelosG3BL;
import BL.Entities.VuelosG3;
import DAC.VuelosG3DAC;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class PanelMisViajesG3 extends JFrame {
  public PanelMisViajesG3() throws SQLException {
    setTitle("Vuelos mas buscados");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setBounds(300, 100, 800, 600);
    setLayout(new GridLayout());
    vuelos();

  }

  private void vuelos() throws SQLException {
    setLayout(new GridLayout(2, 3, 10, 10));
    int maxId = numeroVuelos();

    String url = "jdbc:sqlite:data/DBAerolineaG3.db";
    VuelosG3DAC vuelosDAC = new VuelosG3DAC(url);
    VuelosG3BL vuelosBL = new VuelosG3BL(vuelosDAC);
    List<VuelosG3> vuelos = vuelosBL.obtenerVuelos();
    
    for(int i = 0; i<maxId;i++){
      for (VuelosG3 vuelo : vuelos) {
          
          String desde        = vuelos.get(i).getDesde();
          String hasta        = vuelos.get(i).getHasta();
          String fecha        = vuelos.get(i).getFecha();
          String precio       = vuelos.get(i).getPrecio();
          String duracion     = vuelos.get(i).getDuracion();
          String clase        = vuelos.get(i).getClase();
          String horaSalida   = vuelos.get(i).getHoraSalida();
          String horaLlegada  = vuelos.get(i).getHoraLlegada();
          add(Itinerario(desde, hasta, fecha, precio , duracion, clase, horaSalida, horaLlegada));
          
          break;
      }
    }
    setVisible(true);
  }

  public JPanel Itinerario(String desde, String hasta, String fecha, String precio , String duracion, String clase, String horaSalida, String horaLlegada) {
    JPanel panel = new JPanel(null);
    panel.setBackground(Color.LIGHT_GRAY);


    JLabel lugarDesde = new JLabel();
    lugarDesde.setText("Desde "+desde + " a");
    lugarDesde.setFont(new Font("Arial", Font.PLAIN, 9));
    lugarDesde.setBounds(100,40, 200, 100);
    panel.add(lugarDesde);

    JLabel fechaIda = new JLabel();
    fechaIda.setText("Ida "+fecha);
    fechaIda.setFont(new Font("Arial", Font.PLAIN, 15));
    fechaIda.setBounds(280,30, 200, 100);
    panel.add(fechaIda);
    
    JLabel lugarHasta = new JLabel();
    lugarHasta.setText(hasta );
    lugarHasta.setFont(new Font("Arial", Font.PLAIN, 15));
    lugarHasta.setBounds(100,60, 100, 100);
    panel.add(lugarHasta);

    JLabel claseVuelo = new JLabel();
    claseVuelo.setText("Clase " + clase );
    claseVuelo.setFont(new Font("Arial", Font.PLAIN, 15));
    claseVuelo.setBounds(100,90, 300, 100);
    panel.add(claseVuelo);

    JLabel textPrecio = new JLabel();
    textPrecio.setText("Precio final desde" );
    textPrecio.setFont(new Font("Arial", Font.PLAIN, 9));
    textPrecio.setBounds(100,115, 300, 100);
    panel.add(textPrecio);

    JLabel precioFinal = new JLabel();
    precioFinal.setText("USD " + precio );
    precioFinal.setFont(new Font("Arial", Font.PLAIN, 15));
    precioFinal.setBounds(100,130, 300, 100);
    panel.add(precioFinal);

    JLabel tasas = new JLabel();
    tasas.setText("Tasas Incluidas  -  Vuelo Directo" );
    tasas.setFont(new Font("Arial", Font.PLAIN, 10));
    tasas.setBounds(100,150, 300, 100);
    panel.add(tasas);



    JButton boton = crearBoton(duracion,horaSalida,horaLlegada); // llama al método que crea el botón
    panel.add(boton); // agrega el botón en la región este




    return panel;
  }

  public JButton crearBoton(String hora, String horaSalida, String horaLlegada) {
    JButton boton = new JButton("➪");
    
    boton.setBounds(300, 100, 50, 50);

    boton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setBounds(500, 200, 400, 400);

        JPanel nuevoPanel = new JPanel();
        nuevoPanel.setLayout(null);
        nuevoPanel.setBackground(Color.white);
        frame.add(nuevoPanel);
        frame.setVisible(true);

        JLabel nomItinerario = new JLabel();
        nomItinerario.setText("Itinerario de vuelo");
        nomItinerario.setFont(new Font("Arial", Font.PLAIN, 15));
        nomItinerario.setBounds(50, 0, 200, 50);
        nuevoPanel.add(nomItinerario);

        JLabel salida = new JLabel();
        salida.setText("Salida");
        salida.setFont(new Font("Arial", Font.PLAIN, 11));
        salida.setBounds(155, 40, 50, 50);
        nuevoPanel.add(salida);

        JLabel horaSal = new JLabel();
        horaSal.setText(horaSalida);
        horaSal.setFont(new Font("Arial", Font.PLAIN, 11));
        horaSal.setBounds(160, 60, 50, 50);
        nuevoPanel.add(horaSal);



        
        JLabel duracion = new JLabel();
        duracion.setText("Duracion");
        duracion.setFont(new Font("Arial", Font.PLAIN, 11));
        duracion.setBounds(140, 150, 50, 50);
          nuevoPanel.add(duracion);

          JLabel tiempo = new JLabel();
          tiempo.setText(hora +" min");
          tiempo.setFont(new Font("Arial", Font.PLAIN, 11));
          tiempo.setBounds(150, 165, 500, 50);
          nuevoPanel.add(tiempo);


        JLabel llegada = new JLabel();
        llegada.setText("Llegada");
        llegada.setFont(new Font("Arial", Font.PLAIN, 11));
        llegada.setBounds(150, 230, 50, 50);
        nuevoPanel.add(llegada);

        JLabel horaLLeg = new JLabel();
        horaLLeg.setText(horaLlegada);
        horaLLeg.setFont(new Font("Arial", Font.PLAIN, 11));
        horaLLeg.setBounds(160, 250, 50, 50);
        nuevoPanel.add(horaLLeg);
        JLabel pais = new JLabel();
        pais.setText("Ecuador");
        pais.setFont(new Font("Arial", Font.PLAIN, 11));
        pais.setBounds(250, 165, 50, 50);
        nuevoPanel.add(pais);



        try {
          
          BufferedImage image = ImageIO.read(new File("rsrc\\img\\trayecto.png"));
          ImageIcon icon = new ImageIcon(image);
          JLabel trayecto = new JLabel();
          trayecto.setIcon(icon);
          trayecto.setBounds(200, 0, 500, 350);
          nuevoPanel.add(trayecto);

      } catch (IOException ex) {
          System.out.println("Error al cargar la imagen: " + ex.getMessage());
      }







      }
    });

    return boton;
  }

  public static int numeroVuelos() throws SQLException {
    String url = "jdbc:sqlite:data/DBAerolineaG3.db";
    VuelosG3DAC vuelosDAC = new VuelosG3DAC(url);
    VuelosG3BL vuelosBL = new VuelosG3BL(vuelosDAC);
    List<VuelosG3> vuelos = vuelosBL.obtenerVuelos();
    int maxId = 0;
    for (VuelosG3 vuelo : vuelos) {
      if (vuelo.getId() > maxId) {
        maxId = vuelo.getId();
      }
    }
    return maxId;
  }

  

}