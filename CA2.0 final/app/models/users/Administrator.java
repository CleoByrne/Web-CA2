package models.users;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
@DiscriminatorValue("admin")

public class Administrator extends User{

	public Administrator() {

	}

	public Administrator(String email, String firstName, String lastName, String password)
	{
		super(email, firstName, lastName, password);
	}
	
} 