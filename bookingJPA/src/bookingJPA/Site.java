package bookingJPA;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the site database table.
 * 
 */
@Entity
@NamedQuery(name="Site.findAll", query="SELECT s FROM Site s")
public class Site implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String address;

	private String contact;

	private int limitdate;

	private String name;

	private int startdatte;

	//bi-directional many-to-one association to Appointment
	@OneToMany(mappedBy="site")
	private List<Appointment> appointments;

	//bi-directional many-to-one association to Doctor
	@OneToMany(mappedBy="site1")
	private List<Doctor> doctors1;

	//bi-directional many-to-one association to Doctor
	@OneToMany(mappedBy="site2")
	private List<Doctor> doctors2;

	//bi-directional many-to-one association to Patient
	@OneToMany(mappedBy="site")
	private List<Patient> patients;

	//bi-directional many-to-one association to Preset
	@OneToMany(mappedBy="site")
	private List<Preset> presets;

	//bi-directional many-to-one association to Schedules
	@OneToMany(mappedBy="site")
	private List<Schedules> schedules;

	//bi-directional many-to-one association to Template
	@OneToMany(mappedBy="site")
	private List<Template> templates;

	public Site() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getContact() {
		return this.contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public int getLimitdate() {
		return this.limitdate;
	}

	public void setLimitdate(int limitdate) {
		this.limitdate = limitdate;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStartdatte() {
		return this.startdatte;
	}

	public void setStartdatte(int startdatte) {
		this.startdatte = startdatte;
	}

	public List<Appointment> getAppointments() {
		return this.appointments;
	}

	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}

	public Appointment addAppointment(Appointment appointment) {
		getAppointments().add(appointment);
		appointment.setSite(this);

		return appointment;
	}

	public Appointment removeAppointment(Appointment appointment) {
		getAppointments().remove(appointment);
		appointment.setSite(null);

		return appointment;
	}

	public List<Doctor> getDoctors1() {
		return this.doctors1;
	}

	public void setDoctors1(List<Doctor> doctors1) {
		this.doctors1 = doctors1;
	}

	public Doctor addDoctors1(Doctor doctors1) {
		getDoctors1().add(doctors1);
		doctors1.setSite1(this);

		return doctors1;
	}

	public Doctor removeDoctors1(Doctor doctors1) {
		getDoctors1().remove(doctors1);
		doctors1.setSite1(null);

		return doctors1;
	}

	public List<Doctor> getDoctors2() {
		return this.doctors2;
	}

	public void setDoctors2(List<Doctor> doctors2) {
		this.doctors2 = doctors2;
	}

	public Doctor addDoctors2(Doctor doctors2) {
		getDoctors2().add(doctors2);
		doctors2.setSite2(this);

		return doctors2;
	}

	public Doctor removeDoctors2(Doctor doctors2) {
		getDoctors2().remove(doctors2);
		doctors2.setSite2(null);

		return doctors2;
	}

	public List<Patient> getPatients() {
		return this.patients;
	}

	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}

	public Patient addPatient(Patient patient) {
		getPatients().add(patient);
		patient.setSite(this);

		return patient;
	}

	public Patient removePatient(Patient patient) {
		getPatients().remove(patient);
		patient.setSite(null);

		return patient;
	}

	public List<Preset> getPresets() {
		return this.presets;
	}

	public void setPresets(List<Preset> presets) {
		this.presets = presets;
	}

	public Preset addPreset(Preset preset) {
		getPresets().add(preset);
		preset.setSite(this);

		return preset;
	}

	public Preset removePreset(Preset preset) {
		getPresets().remove(preset);
		preset.setSite(null);

		return preset;
	}

	public List<Schedules> getSchedules() {
		return this.schedules;
	}

	public void setSchedules(List<Schedules> schedules) {
		this.schedules = schedules;
	}

	public Schedules addSchedule(Schedules schedule) {
		getSchedules().add(schedule);
		schedule.setSite(this);

		return schedule;
	}

	public Schedules removeSchedule(Schedules schedule) {
		getSchedules().remove(schedule);
		schedule.setSite(null);

		return schedule;
	}

	public List<Template> getTemplates() {
		return this.templates;
	}

	public void setTemplates(List<Template> templates) {
		this.templates = templates;
	}

	public Template addTemplate(Template template) {
		getTemplates().add(template);
		template.setSite(this);

		return template;
	}

	public Template removeTemplate(Template template) {
		getTemplates().remove(template);
		template.setSite(null);

		return template;
	}

}