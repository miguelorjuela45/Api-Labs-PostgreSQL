package co.web.project.entity;

import javax.persistence.*;

@Entity// Anotaciones de String
@Table(name = "Respuesta")//Nombre de la tabla de la BD
public class Respuesta {
	//Atribbutos identicos de la tabla
		@Id
		@Column
		@GeneratedValue(strategy = GenerationType.IDENTITY) //Genera el Id
	    private Integer idRespuesta;
		@Column
		private Integer CodigoRespuesta;
		@Column
		private String Detalle;
		@Column
		private Integer idSolicitud;
		@Column
		private Integer idUsuarios;
		
		public Integer getidRespuesta() {
			return idRespuesta;
		}
		public void setidRespuesta(Integer idRespuesta) {
			this.idRespuesta = idRespuesta;
		}
		public Integer getCodigoRespuesta() {
			return CodigoRespuesta;
		}
		public void setCodigoRespuesta(Integer CodigoRespuesta) {
			this.CodigoRespuesta = CodigoRespuesta;
		}
		public String getDetalle() {
			return Detalle;
		}
		public void setDetalle(String Detalle) {
			this.Detalle = Detalle;
		}
		public Integer getidSolicitud() {
			return idSolicitud;
		}
		public void setidSolicitud(Integer idSolicitud) {
			this.idSolicitud = idSolicitud;
		}
		public Integer getidUsuarios() {
			return idUsuarios;
		}
		public void setidUsuarios(Integer idUsuarios) {
			this.idUsuarios = idUsuarios;
		}
		public String toString() {
			return "Customer [idRespuesta=" + this.idRespuesta + ", CodigoRespuesta=" + this.CodigoRespuesta + ", Detalle=" + this.Detalle + ", idSolicitud=" + this.idSolicitud + ", idUsuarios=" + this.idUsuarios + "]";
		}
}
