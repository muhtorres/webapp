package model;

import java.text.SimpleDateFormat;
import java.text.DateFormat;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="AUTORIZACAO")
public class Authorization 
{	
	@Id
	@Column(name = "AUT_ID")
	private String autorizacao;

	@Column(name = "USER_ID")
	private String titulo;

	@Column(name = "AUT_BY")
	private String autorizadoPor;

	@Column(name = "ACTION_DATE")
	private String actionDate;

	@Column(name = "CAN_VOTE")
	private char podeVotar;

	@Column(name = "ALREADY_VOTED")
	private char jaVotou;

	public String getAutorizacao() {
		return autorizacao;
	}

	public void setAutorizacao() {		
		this.autorizacao = this.titulo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutorizadoPor() {
		return autorizadoPor;
	}

	public void setAutorizadoPor(String autorizadoPor) {
		this.autorizadoPor = autorizadoPor;
	}

	public String getActionDate() {
		return actionDate;
	}

	public void setActionDate() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		this.actionDate = dateFormat.format(date);
	}

	public char getPodeVotar() {
		return podeVotar;
	}

	public void setPodeVotar(char podeVotar) {
		this.podeVotar = podeVotar;
	}

	public char getJaVotou() {
		return jaVotou;
	}

	public void setJaVotou(char jaVotou) {
		this.jaVotou = jaVotou;
	}
}
