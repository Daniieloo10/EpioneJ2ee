package epioneClient;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


import en.esprit.epione.interfaces.AppointmentIServices;
import en.esprit.epione.interfaces.PatientServices;
import en.esprit.epione.interfaces.UserServices;
import tn.esprit.epione.persistance.Adresse;
import tn.esprit.epione.persistance.Appointment;
import tn.esprit.epione.persistance.Patient;
import tn.esprit.epione.persistance.Role;
import tn.esprit.epione.persistance.Sexe;
import tn.esprit.epione.persistance.State;
import tn.esprit.epione.persistance.User;
import tn.esprit.epione.resources.UserServicesImpl;


public class Test {

	public static void main(String[] args) throws NamingException, ParseException {
		String jndiName="Epione-ear/Epione-ejb/AppointmentServicesImpl!en.esprit.epione.interfaces.AppointmentIServices";
		Context context = new InitialContext(); 
		AppointmentIServices proxy = (AppointmentIServices) context.lookup(jndiName);
		System.out.println("connexion ok"+context);
		UserServicesImpl us = new UserServicesImpl(); 

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date2 = dateFormat.parse("15/10/2007");

        Adresse adr = new Adresse("rue", "ville");
        
		Patient u = new Patient();
		
		
	
		u.setFirstName("haw zebi");
		u.setLastName("eddine");
		u.setBirthDate(date2);
		u.setAdress(adr);
		u.setPhoto("photo");
		u.setPhone("28 058 894");
		u.setEmail("dhiae");
		u.setLogin("dediano");
		u.setPassword("dhiaedd");
		u.setSexe(Sexe.homme);
		u.setRole(Role.admin);
		u.setNumberSocialSecurity("numsecurity");
		
		//proxy.updateUser(u,1);
		//proxy.getAll();
		//proxy.addPatient(u);
		//proxy.getUserById(1);
		//proxy.removeUser(1);
		
		
		//Adresse adresse = new Adresse();
		
		//us.addUser(new User("dhia", "edidne", date2, adresse, "2555", "email", "login", "password", Sexe.femme, Role.admin));
		

		
		 Appointment ap = new Appointment();
		ap.setMessage("message");
		ap.setObject("object");
		ap.setEndHour("endHour");
		ap.setStart_hour("dsqdqs");
		ap.setState(State.accepeted);
		ap.setTitle("haw zebi");
		ap.setDate_appointment(date2);
		proxy.addAppointment(ap);
		//proxy.getAll();
		//proxy.cancelRequest(2);
		
		
	}

}
