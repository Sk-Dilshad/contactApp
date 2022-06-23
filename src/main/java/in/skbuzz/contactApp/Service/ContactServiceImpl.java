package in.skbuzz.contactApp.Service;

import in.skbuzz.contactApp.Model.Contact;
import in.skbuzz.contactApp.Repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactServiceImpl implements ContactService{

    @Autowired
    ContactRepository contactRepository;
    @Override
    public String upsert(Contact contact) {
       Contact save= contactRepository.save(contact);
        return "SUCESS";
    }

    @Override
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    @Override
    public Contact getContact(int cid) {
      Optional<Contact> con= contactRepository.findById(cid);
      if(con.isPresent()){
          return  con.get();
      }
        return null;
    }

    @Override
    public String deleteContact(int cid) {
        contactRepository.deleteById(cid);
        return "SUCESS";
    }
}
