package com.magic.addressbook.entity;

    public class Person {
        private String first_name,last_name,city,state,email;
        private String zip;
        private String phone_number;

        public void getFirst_name() {
            System.out.println(first_name);
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public void getLast_name() {
            System.out.println(last_name);
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }

        public void getCity() {
            System.out.println(city);
        }

        public void setCity(String city) {
            this.city = city;
        }

        public void getState() {
            System.out.println(state);

        }

        public void setState(String state) {
            this.state = state;
        }

        public void getEmail() {
            System.out.println(email);
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public void getZip() {
            System.out.println(zip);
        }

        public void setZip(String zip) {
            this.zip = zip;
        }

        public void getPhone_number() {
            System.out.println(phone_number);
        }

        public void setPhone_number(String phone_number) {
            this.phone_number = phone_number;
        }
    }
