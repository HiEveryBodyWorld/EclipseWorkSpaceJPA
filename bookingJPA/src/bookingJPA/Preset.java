package bookingJPA;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the preset database table.
 * 
 */
@Entity
@NamedQuery(name="Preset.findAll", query="SELECT p FROM Preset p")
public class Preset implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Temporal(TemporalType.DATE)
	private Date predate;

	private String preendtime;

	private String prestarttime;

	private int status;

	//bi-directional many-to-one association to Site
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	public Preset() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getPredate() {
		return this.predate;
	}

	public void setPredate(Date predate) {
		this.predate = predate;
	}

	public String getPreendtime() {
		return this.preendtime;
	}

	public void setPreendtime(String preendtime) {
		this.preendtime = preendtime;
	}

	public String getPrestarttime() {
		return this.prestarttime;
	}

	public void setPrestarttime(String prestarttime) {
		this.prestarttime = prestarttime;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Site getSite() {
		return this.site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

}