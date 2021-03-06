package com.ucab.javachat.Cliente.model;

import com.ucab.javachat.Cliente.controller.*;

	/**
	 * Esta clase ejecuta un hilo que se activa cada cierto tiempo para 
	 * actualizar la lista de contactos de todos los usuarios.
	 * @author Grupo 3 - A. Rodriguez, I. Teixeira, L. Valladares, D. Suarez
	 * @version 2.0
	 *
	 */
public class ThreadActualizarUsuario extends Thread{
	
	private ControladorCliente vcli;
	private Cliente cliente;
	
	/**
	 * Constructor de la clase que extiende de Thread.  
	 * @param cliente
	 */
	
	public ThreadActualizarUsuario (Cliente cliente) {
	      this.cliente = cliente;
	      this.vcli = cliente.vent;
	   }
	
	/**
	 *  Cuando se ejecuta el hilo este actualiza la lista de usuarios conectados cada 3 segundos. 
	 */
	public void run(){
		while (true) {	
			vcli.ponerActivos(cliente.pedirUsuarios());
			try {
				sleep (7500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
