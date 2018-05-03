package bookingJPA;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tepdetail database table.
 * 
 */
@Entity
@NamedQuery(name="Tepdetail.findAll", query="SELECT t FROM Tepdetail t")
public class Tepdetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String endtime;

	private int number;

	private String starttime;

	private int tl;

	private int whichday;

	//bi-directional many-to-one association to Template
	@ManyToOne
	@JoinColumn(name="templateid")
	private Template template;

	public Tepdetail() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEndtime() {
		return this.endtime;
	}

	public void setEndtime(String endtime) {
		this.endtime = endtime;
	}

	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getStarttime() {
		return this.starttime;
	}

	public void setStarttime(String starttime) {
		this.starttime = starttime;
	}

	public int getTl() {
		return this.tl;
	}

	public void setTl(int tl) {
		this.tl = tl;
	}

	public int getWhichday() {
		return this.whichday;
	}

	public void setWhichday(int whichday) {
		this.whichday = whichday;
	}

	public Template getTemplate() {
		return this.template;
	}

	public void setTemplate(Template template) {
		this.template = template;
	}

}