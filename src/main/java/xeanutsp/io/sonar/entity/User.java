package xeanutsp.io.sonar.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    // Declareation
    private Long id;
    private String name;
    private String username;
    private String email;
    private String phone;
    private String website;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getWebsites() {
        return website;
    }

    public void setId(Long newId) {
        this.id = newId;
    }

    public void setName(String newname) {
        this.name = newname;
    }


    public void setUsername(String newUsername) {
        this.username = newUsername;
    }

    public void setEmail(String newEmail) {
        this.email = newEmail;
    }

    public void setPhone(String newPhone) {
        this.phone = newPhone;
    }

    public void setWebsites(String newWebsite) {
        this.website = newWebsite;
    }
}
