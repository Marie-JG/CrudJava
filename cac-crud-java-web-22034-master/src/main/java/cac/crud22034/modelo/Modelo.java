
package cac.crud22034.modelo;

import java.util.List;

/**
 *
 * @author Charly Cimino
 * Aprendé más Java en mi canal: https://www.youtube.com/c/CharlyCimino
 * Encontrá más código en mi repo de GitHub: https://github.com/CharlyCimino
 */
public interface Modelo {
    /**
     * Devuelve una lista de pacientes existentes
     * @return 
     */
    public List<Paciente> getPacientes();
    
    /**
     * Retorna un paciente por ID
     * @param id el id del paciente a retornar
     * @return El paciente encontrado por ID o null si no existe
     */
    public Paciente getPaciente(int id);
    
    /**
     * Agrega un paciente al modelo
     * @param paciente El paciente a agregar
     * @return La cantidad de registros modificados
     */
    public int addPaciente(Paciente paciente);
    
    /**
     * Modifica un paciente del modelo
     * @param paciente El paciente que contiene los datos para modificar
     * @return La cantidad de registros modificados
     */
    public int updatePaciente(Paciente paciente);
    
    /**
     * Borra un paciente por ID
     * @param id el id del paciente a borrar
     * @return La cantidad de registros modificados
     */
    public int removePaciente(int id);
}
