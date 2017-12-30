package models.users;

import java.util.*;
import javax.persistence.*;

import io.ebean.*;
import play.data.format.*;
import play.data.validation.*;

@Entity
@Table(name = "user")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE) 
@DiscriminatorColumn(name = "role") 
public class User extends Model {
	
    @Id
    @Constraints.Required
    private String email;

    @Column(name = "role", insertable=false, updatable=false)
    @Constraints.Required
    private String role;

    @Constraints.Required
    private String firstName;

    @Constraints.Required
    private String lastName;

    @Constraints.Required
    private String password;

    public User() {
    }

    public User(String email, String firstName, String lastName, String password) {
        this.email = email;
        this.role = role;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getRole() {
        return role;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public static Finder<String, User> find = new Finder<String, User>(User.class);
    
    public static List<User> findAll() {
        return User.find.all();
    }

    public static User authenticate(String email, String password) {
        return find.query().where().eq("email", email).eq("password", password).findUnique();
    }

    public static User getUserById(String id) {
        if (id == null){
                return null;
        }
        else{
            return find.byId(id);
        }
    }

}

