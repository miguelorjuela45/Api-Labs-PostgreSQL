package co.web.project.entity;

import javax.persistence.*;

@Entity// Anotaciones de String
@Table(name = "Ususarios")//Nombre de la tabla de la BD
public class Usuarios {
	//Atribbutos identicos de la tabla
		@Id
		@Column
		@GeneratedValue(strategy = GenerationType.IDENTITY) //Genera el Id
	    private Long idUsuario;
		@Column
		private String Usuario;
		@Column
		private String Contrasena;
		@Column
		private Long TipoUsuario;
		@Column
		private String Nombre;
		@Column
		private String Apellido;
		
		
		public Long getIdUsuario() {
			return idUsuario;
		}
		public void setIdUsuario(Long idUsuario) {
			this.idUsuario = idUsuario;
		}
		public String getUsuario() {
			return Usuario;
		}
		public void setUsuario(String Usuario) {
			this.Usuario = Usuario;
		}
		public String getContrasena() {
			return Contrasena;
		}
		public void setContrasena(String Contrasena) {
			this.Contrasena = Contrasena;
		}
		public Long getTipoUsuario() {
			return TipoUsuario;
		}
		public void setTipoUsuario(long TipoUsuario) {
			this.TipoUsuario = TipoUsuario;
		}
		public String getNombre() {
			return Nombre;
		}
		public void setNombre(String Nombre) {
			this.Nombre = Nombre;
		}
		public String getApellido() {
			return Apellido;
		}
		public void setApellido(String Apellido) {
			this.Apellido = Apellido;
		}
		public String toString() {
			return "Customer [idUsuario=" + this.idUsuario + ", Usuario=" + this.Usuario + ", Contrasena=" + this.Contrasena + ", TipoUsuario=" + this.TipoUsuario + ", Nombre=" + this.Nombre + ", Apellido=" + this.Apellido + "]";
		}
}
