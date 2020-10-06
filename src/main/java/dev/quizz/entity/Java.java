package dev.quizz.entity;

import javax.persistence.Entity;

/**Questions sur le thème Java
 * @author gaell
 *
 */
@Entity
public class Java extends QuestionBase {

	public Java(int id, String titre, String urlImageTitre, String proposition1, String proposition2,
			String proposition3, String reponse, String explication, String urlImageExplication, Niveau niveau) {
		super(id, titre, urlImageTitre, proposition1, proposition2, proposition3, reponse, explication, urlImageExplication,
				niveau);
	}

}
