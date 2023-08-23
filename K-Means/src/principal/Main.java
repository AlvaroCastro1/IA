package principal;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {



    public static class Cluster {
        Objeto centroide;
        List<Objeto> puntos;

        public Cluster(Objeto centroide) {
            this.centroide = centroide;
            this.puntos = new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de clusters: ");
        int numClusters = scanner.nextInt();

        List<Objeto> puntos = generarPuntosAleatorios(100);
        List<Objeto> centroidesIniciales = obtenerCentroidesIniciales(scanner, numClusters);

        List<Cluster> clusters = kMeans(puntos, centroidesIniciales);

        for (int i = 0; i < clusters.size(); i++) {
            System.out.println("Cluster " + i + " Centroide: (" + clusters.get(i).centroide.x + ", " + clusters.get(i).centroide.y + ")");
            System.out.println("Puntos en el cluster:");
            for (Objeto punto : clusters.get(i).puntos) {
                System.out.println("(" + punto.x + ", " + punto.y + ")");
            }
            System.out.println();
        }
    }


    public static List<Objeto> generarPuntosAleatorios(int numPuntos) {
        List<Objeto> puntos = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < numPuntos; i++) {
            double x = rand.nextDouble() * 100;
            double y = rand.nextDouble() * 100;
            puntos.add(new Objeto(x, y));
        }

        return puntos;
    }

    public static List<Objeto> obtenerCentroidesIniciales(Scanner scanner, int numClusters) {
        List<Objeto> centroides = new ArrayList<>();
        System.out.println("Ingrese las coordenadas de los centroides iniciales:");
        
        for (int i = 0; i < numClusters; i++) {
            System.out.print("Centroide " + (i + 1) + " - X: ");
            double x = scanner.nextDouble();
            System.out.print("Centroide " + (i + 1) + " - Y: ");
            double y = scanner.nextDouble();
            centroides.add(new Objeto(x, y));
        }

        return centroides;
    }

    public static List<Cluster> kMeans(List<Objeto> puntos, List<Objeto> centroidesIniciales) {
    List<Cluster> clusters = new ArrayList<>();
    
    // Inicializar clusters con centroides iniciales
    for (Objeto centroide : centroidesIniciales) {
        clusters.add(new Cluster(centroide));
    }
    
    boolean convergencia = false;
    while (!convergencia) {
        // Asignar puntos a clusters
        for (Cluster cluster : clusters) {
            cluster.puntos.clear();
        }
        for (Objeto punto : puntos) {
            Cluster clusterMasCercano = null;
            double distanciaMinima = Double.MAX_VALUE;
            for (Cluster cluster : clusters) {
                double distancia = calcularDistancia(punto, cluster.centroide);
                if (distancia < distanciaMinima) {
                    distanciaMinima = distancia;
                    clusterMasCercano = cluster;
                }
            }
            clusterMasCercano.puntos.add(punto);
        }

        // Actualizar centroides y verificar convergencia
        convergencia = true;
        for (Cluster cluster : clusters) {
            double sumaX = 0, sumaY = 0;
            for (Objeto punto : cluster.puntos) {
                sumaX += punto.x;
                sumaY += punto.y;
            }
            Objeto nuevoCentroide = new Objeto(sumaX / cluster.puntos.size(), sumaY / cluster.puntos.size());
            if (calcularDistancia(nuevoCentroide, cluster.centroide) > 0.01) {
                convergencia = false;
            }
            cluster.centroide = nuevoCentroide;
        }
    }

    return clusters;
}


    public static double calcularDistancia(Objeto p1, Objeto p2) {
        double dx = p1.x - p2.x;
        double dy = p1.y - p2.y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
