package dev.quizz.entity;

import javax.persistence.Column;
import javax.persistence.Id;

/**Schema de base pour les questions
 * @author gaell
 *
 */
public class QuestionBase {
	
	@Id
	private int id;
	/** intitulé de la question */
	private String titre;
	/** image facultative */
	@Column(name = "image_1")
	private String urlImageTitre;
	/** 3 propositions fausses */
	@Column(name = "proposition_1")
	private String proposition1;
	@Column(name = "proposition_2")
	private String proposition2;
	@Column(name = "proposition_3")
	private String proposition3;
	/** proposition exacte */
	private String reponse;
	/** explication */
	private String explication;
	/** image facultative */
	@Column(name = "image_2")
	private String urlImageExplication;
	/** niveau de difficulté */
	private Niveau niveau;
	
	public QuestionBase(int id, String titre, String urlImageTitre, String proposition1, String proposition2,
			String proposition3, String reponse, String explication, String urlImageExplication, Niveau niveau) {
		this.id = id;
		this.titre = titre;
		this.urlImageTitre = urlImageTitre;
		this.proposition1 = proposition1;
		this.proposition2 = proposition2;
		this.proposition3 = proposition3;
		this.reponse = reponse;
		this.explication = explication;
		this.urlImageExplication = urlImageExplication;
		this.niveau = niveau;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getUrlImageTitre() {
		return urlImageTitre;
	}
	public void setUrlImageTitre(String urlImageTitre) {
		this.urlImageTitre = urlImageTitre;
	}
	public String getProposition1() {
		return proposition1;
	}
	public void setProposition1(String proposition1) {
		this.proposition1 = proposition1;
	}
	public String getProposition2() {
		return proposition2;
	}
	public void setProposition2(String proposition2) {
		this.proposition2 = proposition2;
	}
	public String getProposition3() {
		return proposition3;
	}
	public void setProposition3(String proposition3) {
		this.proposition3 = proposition3;
	}
	public String getReponse() {
		return reponse;
	}
	public void setReponse(String reponse) {
		this.reponse = reponse;
	}
	public String getExplication() {
		return explication;
	}
	public void setExplication(String explication) {
		this.explication = explication;
	}
	public String getUrlImageExplication() {
		return urlImageExplication;
	}
	public void setUrlImageExplication(String urlImageExplication) {
		this.urlImageExplication = urlImageExplication;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Niveau getNiveau() {
		return niveau;
	}
	public void setNiveau(Niveau niveau) {
		this.niveau = niveau;
	}
	

}
