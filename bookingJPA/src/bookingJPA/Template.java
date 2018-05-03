package bookingJPA;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the template database table.
 * 
 */
@Entity
@NamedQuery(name="Template.findAll", query="SELECT t FROM Template t")
public class Template implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String name;

	private int status;

	private int type;

	//bi-directional many-to-one association to Schedules
	@OneToMany(mappedBy="template")
	private List<Schedules> schedules;

	//bi-directional many-to-one association to Doctor
	@ManyToOne
	@JoinColumn(name="adoctorid")
	private Doctor doctor;

	//bi-directional many-to-one association to Site
	@ManyToOne
	@JoinColumn(name="siteid")
	private Site site;

	//bi-directional many-to-one association to Tepdetail
	@OneToMany(mappedBy="template")
	private List<Tepdetail> tepdetails;

	public Template() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public List<Schedules> getSchedules() {
		return this.schedules;
	}

	public void setSchedules(List<Schedules> schedules) {
		this.schedules = schedules;
	}

	public Schedules addSchedule(Schedules schedule) {
		getSchedules().add(schedule);
		schedule.setTemplate(this);

		return schedule;
	}

	public Schedules removeSchedule(Schedules schedule) {
		getSchedules().remove(schedule);
		schedule.setTemplate(null);

		return schedule;
	}

	public Doctor getDoctor() {
		return this.doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public Site getSite() {
		return this.site;
	}

	public void setSite(Site site) {
		this.site = site;
	}

	public List<Tepdetail> getTepdetails() {
		return this.tepdetails;
	}

	public void setTepdetails(List<Tepdetail> tepdetails) {
		this.tepdetails = tepdetails;
	}

	public Tepdetail addTepdetail(Tepdetail tepdetail) {
		getTepdetails().add(tepdetail);
		tepdetail.setTemplate(this);

		return tepdetail;
	}

	public Tepdetail removeTepdetail(Tepdetail tepdetail) {
		getTepdetails().remove(tepdetail);
		tepdetail.setTemplate(null);

		return tepdetail;
	}

}