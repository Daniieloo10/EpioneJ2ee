package en.esprit.epione.interfaces;

import java.util.Date;
import java.util.List;

import javax.ejb.Remote;

import tn.esprit.epione.persistance.Appointment;

@Remote
public interface AppointmentIServices {
	
	//Crud User
		public void addAppointment(Appointment a );
		public void updateAppointment(Appointment a);
		public void removeAppById(int id);
		public List<Appointment> getAll();
		//Patients Services
		public List<Appointment> MyAppointments(int idPatient);
		public List<Appointment> MyRequests(int idPatient);
		public void cancelRequest(int idAppointment);
		// doctor Services
		public List<Appointment> acceptedRequests(int idPatient);
		//
		public Appointment SelectAppByDay(Date date);
	
	
}
