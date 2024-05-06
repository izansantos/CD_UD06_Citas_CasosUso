package src.main;

import java.util.List;

// Clase para manejar las consultas médicas
public class GestionMedicos {
    
    private List<Medico> medicos; // Calendario de citas

    // TODO: Método para consultar el historial médico de un paciente
    public void addMedico(Medico medico) {
    }

    // Método para buscar especialistas por especialidad
    public void buscarEspecialistas(String especialidad) {
        // Lógica para buscar especialistas por especialidad
        System.out.println("Buscar especialistas en " + especialidad);
    }

    // Método para ver recetas médicas
    public void verRecetas(String paciente) {
        // Lógica para ver las recetas médicas del paciente
        System.out.println("Ver recetas médicas de " + paciente);
    }

    // Método para generar informes médicos
    public void generarInforme(String paciente) {
        // Lógica para generar informes médicos del paciente
        System.out.println("Generar informe médico de " + paciente);
    }
}