package co.web.project.entity;

import javax.persistence.*;

@Entity// Anotaciones de String
@Table(name = "Usuarios")//Nombre de la tabla de la BD
public class Usuarios {
	//Atribbutos identicos de la tabla
		@Id
		@Column
		@GeneratedValue(strategy = GenerationType.IDENTITY) //Genera el Id
	    private Integer idUsuario;
		@Column
		private String Usuario;
		@Column
		private String Contrasena;
		@Column
		private Integer TipoUsuario;
		@Column
		private String Nombre;
		@Column
		private String Apellido;
		
		
		public Integer getIdUsuario() {
			return idUsuario;
		}
		public void setIdUsuario(Integer idUsuario) {
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
		public Integer getTipoUsuario() {
			return TipoUsuario;
		}
		public void setTipoUsuario(Integer TipoUsuario) {
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
