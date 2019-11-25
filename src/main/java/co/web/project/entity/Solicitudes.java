package co.web.project.entity;

import java.sql.Date;

import javax.persistence.*;

@Entity// Anotaciones de String
@Table(name = "Solicitudes")//Nombre de la tabla de la BD
public class Solicitudes {
	//Atribbutos identicos de la tabla
		@Id
		@Column
		@GeneratedValue(strategy = GenerationType.IDENTITY) //Genera el Id
	    private Long idSolicitud;
		@Column
		private Date fecha_solicitud;
		@Column
		private Date fecha_programada;
		@Column
		private String laboratorio;
		@Column
		private String bloque;
		@Column
		private String asignatura;
		@Column
		private String docente;
		@Column
		private String practica;
		@Column
		private String facultad;
		@Column
		private boolean maquinas;
		@Column
		private Integer cantidad_maquinas;
		@Column
		private boolean material;
		@Column
		private Integer cantidad_material;
		@Column
		private boolean ayuda_auxiliar;
		@Column
		private Integer estudiantes;
		@Column
		private String observaciones;
		@Column
		private String hora_entrada;
		@Column
		private String hora_salida;
		@Column
		private String estado_solicitud;
		
		public String toString() {
			return "Customer [idSolicitud=" + this.idSolicitud + 
					", fecha_solicitud=" + this.fecha_solicitud +
					", fecha_programada=" + this.fecha_programada +
					", laboratorio=" + this.laboratorio +
					", asignatura=" + this.asignatura +
					", docente=" + this.docente +
					", practica=" + this.practica +
					", facultad=" + this.facultad +
					", maquinas=" + this.maquinas +
					", cantidad_maquinas=" + this.cantidad_maquinas +
					", material=" + this.material +
					", cantidad_material=" + this.cantidad_material +
					", ayuda_auxiliar=" + this.ayuda_auxiliar +
					", estudiantes=" + this.estudiantes +
					", observaciones=" + this.observaciones +
					", hora_entrada=" + this.hora_entrada +
					", hora_salida=" + this.hora_salida +
					", estado_solicitud=" + this.estado_solicitud + "]";
		}

		public Long getIdSolicitud() {
			return idSolicitud;
		}

		public void setIdSolicitud(Long idSolicitud) {
			this.idSolicitud = idSolicitud;
		}

		public Date getFecha_solicitud() {
			return fecha_solicitud;
		}

		public void setFecha_solicitud(Date fecha_solicitud) {
			this.fecha_solicitud = fecha_solicitud;
		}

		public Date getFecha_programada() {
			return fecha_programada;
		}

		public void setFecha_programada(Date fecha_programada) {
			this.fecha_programada = fecha_programada;
		}

		public String getLaboratorio() {
			return laboratorio;
		}

		public void setLaboratorio(String laboratorio) {
			this.laboratorio = laboratorio;
		}

		public String getBloque() {
			return bloque;
		}

		public void setBloque(String bloque) {
			this.bloque = bloque;
		}

		public String getAsignatura() {
			return asignatura;
		}

		public void setAsignatura(String asignatura) {
			this.asignatura = asignatura;
		}

		public String getDocente() {
			return docente;
		}

		public void setDocente(String docente) {
			this.docente = docente;
		}

		public String getPractica() {
			return practica;
		}

		public void setPractica(String practica) {
			this.practica = practica;
		}

		public String getFacultad() {
			return facultad;
		}

		public void setFacultad(String facultad) {
			this.facultad = facultad;
		}

		public boolean isMaquinas() {
			return maquinas;
		}

		public void setMaquinas(boolean maquinas) {
			this.maquinas = maquinas;
		}

		public Integer getCantidad_maquinas() {
			return cantidad_maquinas;
		}

		public void setCantidad_maquinas(Integer cantidad_maquinas) {
			this.cantidad_maquinas = cantidad_maquinas;
		}

		public boolean isMaterial() {
			return material;
		}

		public void setMaterial(boolean material) {
			this.material = material;
		}

		public Integer getCantidad_material() {
			return cantidad_material;
		}

		public void setCantidad_material(Integer cantidad_material) {
			this.cantidad_material = cantidad_material;
		}

		public boolean isAyuda_auxiliar() {
			return ayuda_auxiliar;
		}

		public void setAyuda_auxiliar(boolean ayuda_auxiliar) {
			this.ayuda_auxiliar = ayuda_auxiliar;
		}

		public Integer getEstudiantes() {
			return estudiantes;
		}

		public void setEstudiantes(Integer estudiantes) {
			this.estudiantes = estudiantes;
		}

		public String getObservaciones() {
			return observaciones;
		}

		public void setObservaciones(String observaciones) {
			this.observaciones = observaciones;
		}

		public String getHora_entrada() {
			return hora_entrada;
		}

		public void setHora_entrada(String hora_entrada) {
			this.hora_entrada = hora_entrada;
		}

		public String getHora_salida() {
			return hora_salida;
		}

		public void setHora_salida(String hora_salida) {
			this.hora_salida = hora_salida;
		}

		public String getEstado_solicitud() {
			return estado_solicitud;
		}

		public void setEstado_solicitud(String estado_solicitud) {
			this.estado_solicitud = estado_solicitud;
		}
}
