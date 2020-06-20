package ar.edu.ubp.das.resources;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import ar.edu.ubp.das.bean.AsistenciaBean;
import ar.edu.ubp.das.bean.DetalleAsistenciaBean;

@Path("/asistencias")
@Produces(MediaType.APPLICATION_JSON)
public class AsistenciaResource {
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertarAsistencia(AsistenciaBean asistencia) {
		
		Connection conn;
		CallableStatement stmt;
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn=DriverManager.getConnection("jdbc:sqlserver://127.0.0.1;databaseName=bomberos","sa","AaBbCc123");
			conn.setAutoCommit(false);
			
			try {
				stmt = conn.prepareCall("{CALL dbo.CREAR_ASISTENCIA(?,?,?,?)}");
				stmt.setString(1, asistencia.getIdServicio());
				stmt.setString(2, asistencia.getEstado());
				stmt.setInt(3, asistencia.getIdSolicitud());
				stmt.setLong(4, asistencia.getCuil());
				
				stmt.execute();
				
				stmt.close();
				conn.commit();
				
				return Response.ok().build();
			} catch (SQLException e) {
				conn.rollback();
				throw e;
			}finally {
				conn.setAutoCommit(true);
				conn.close();
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
		}
	}
	
	@PUT
	@Consumes(MediaType.APPLICATION_JSON)
	public Response cerrarAsistencia(AsistenciaBean asistencia) {
		
		Connection conn;
		CallableStatement stmt;
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn=DriverManager.getConnection("jdbc:sqlserver://127.0.0.1;databaseName=bomberos","sa","AaBbCc123");
			conn.setAutoCommit(false);
			
			try {
				stmt = conn.prepareCall("{CALL dbo.CERRAR_ASISTENCIA(?)}");
				stmt.setInt(1, asistencia.getId());
				
				stmt.execute();
				
				stmt.close();
				conn.commit();
				
				return Response.ok().build();
			} catch (SQLException e) {
				conn.rollback();
				throw e;
			}finally {
				conn.setAutoCommit(true);
				conn.close();
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
		}
	}
	
	@PUT
	@Path("/detalles")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response insertarDetalleAsistencia(DetalleAsistenciaBean detalleAsistencia) {
		
		Connection conn;
		CallableStatement stmt;
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn=DriverManager.getConnection("jdbc:sqlserver://127.0.0.1;databaseName=bomberos","sa","AaBbCc123");
			conn.setAutoCommit(false);
			
			try {
				stmt = conn.prepareCall("{CALL dbo.INSERTAR_DETALLE_ASISTENCIA(?,?,?)}");
				stmt.setInt(1, detalleAsistencia.getIdAsistencia());
				stmt.setString(2, detalleAsistencia.getTipoDato());
				stmt.setString(3, detalleAsistencia.getDato());
				
				stmt.execute();
				
				stmt.close();
				conn.commit();
				
				return Response.ok().build();
			} catch (SQLException e) {
				conn.rollback();
				throw e;
			}finally {
				conn.setAutoCommit(true);
				conn.close();
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			return Response.status(Response.Status.BAD_REQUEST).entity(e).build();
		}
	}
}
