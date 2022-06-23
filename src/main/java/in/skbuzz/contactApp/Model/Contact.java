package in.skbuzz.contactApp.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Contact {

    @Id
    @GeneratedValue
    private int cid;
    private String name;
    private String email;
    private Long phno;
    private String activeSW;

    public Contact() {

    }

    public Contact(int cid, String name, String email, Long phno, String activeSW) {
        this.cid = cid;
        this.name = name;
        this.email = email;
        this.phno = phno;
        this.activeSW = activeSW;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getPhno() {
        return phno;
    }

    public void setPhno(Long phno) {
        this.phno = phno;
    }

    public String getActiveSW() {
        return activeSW;
    }

    public void setActiveSW(String activeSW) {
        this.activeSW = activeSW;
    }
}
