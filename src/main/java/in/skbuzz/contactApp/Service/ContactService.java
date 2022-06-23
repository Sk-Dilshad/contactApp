package in.skbuzz.contactApp.Service;

import in.skbuzz.contactApp.Model.Contact;

import java.util.List;

public interface ContactService {

    String upsert (Contact contact);
    List<Contact> getAllContacts();
    Contact getContact(int cid);
    String deleteContact(int cid);


}
