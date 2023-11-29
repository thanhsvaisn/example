import java.util.ArrayList;

import java.util.List;

class PhoneBook extends Phone {
    private List<PhoneNumber> phoneList;

    public PhoneBook() {
        this.phoneList = new ArrayList<>();
    }
    public List<PhoneNumber> getPhoneList() {
        return phoneList;
    }
    @Override
    void insertPhone(String name, String phone) {
        PhoneNumber existingContact = searchPhone(name);
        if (existingContact != null) {
            List<String> phones = existingContact.getPhone();
            if (!phones.contains(phone)) {
                phones.add(phone);
            }
        } else {
            List<String> newPhoneList = new ArrayList<>();
            newPhoneList.add(phone);
            phoneList.add(new PhoneNumber(name, newPhoneList));
        }
    }

    @Override
    void removePhone(String name) {
        phoneList.removeIf(contact -> contact.getName().equals(name));
    }

    @Override
    void updatePhone(String name, String newPhone) {
        PhoneNumber existingContact = searchPhone(name);
        if (existingContact != null) {
            List<String> phones = existingContact.getPhone();
            phones.clear();
            phones.add(newPhone);
        }
    }

    @Override
    PhoneNumber searchPhone(String name) {
        for (PhoneNumber contact : phoneList) {
            if (contact.getName().equals(name)) {
                return contact;
            }
        }
        return null;
    }

    @Override
    void sort() {
        phoneList.sort((c1, c2) -> c1.getName().compareToIgnoreCase(c2.getName()));
    }
}
