package ContactManagementSystem;

public class Contact {

        private int ID;
        private String firstName;
        private String lastName;
        private String phoneNumber;
        private String email;

        public Contact() {}

        public int getID() {return ID;}
        public String getFirstName() {return firstName;}
        public String getLastName() {return lastName;}
        public String getPhoneNumber() {return phoneNumber;}
        public String getEmail() {return email;}

        public void setID(int ID) {this.ID=ID;}
        public void setFirstName(String firstName) {this.firstName=firstName;}
        public void setLastName(String lastName) {this.lastName=lastName;}
        public void setPhoneNumber(String phoneNumber) {this.phoneNumber=phoneNumber;}
        public void setEmail(String email) {this.email=email;}

}
