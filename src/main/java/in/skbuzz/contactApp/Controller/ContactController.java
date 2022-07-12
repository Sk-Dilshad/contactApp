package in.skbuzz.contactApp.Controller;

import in.skbuzz.contactApp.Model.Contact;
import in.skbuzz.contactApp.Service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class ContactController {

    @Autowired
    ContactService contactService;

    @PostMapping("/contact")
     ResponseEntity<String> contact(@RequestBody Contact contact){
        String status=contactService.upsert(contact);
       return new ResponseEntity<>(status, HttpStatus.CREATED);
    }
    @GetMapping("/contacts")
    ResponseEntity<List<Contact>> getAllContacts(){
       List<Contact> allContacts= contactService.getAllContacts();
        return new ResponseEntity<>(allContacts, HttpStatus.OK);
    }
    @GetMapping("/contact/{cid}")
    ResponseEntity<Contact> getContact(@PathVariable("cid") int cid){
       Contact contact= contactService.getContact(cid);
        return new ResponseEntity<>(contact, HttpStatus.OK);
    }
    @DeleteMapping("/contact/{cid}")
    ResponseEntity<String> deleteContact(@PathVariable("cid") int cid){
      String deleteContact=  contactService.deleteContact(cid);
        return new ResponseEntity<>(deleteContact, HttpStatus.OK);
    }
}
