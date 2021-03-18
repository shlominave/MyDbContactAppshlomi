package com.example.mydbcontactappshlomi;

import java.util.Arrays;

public class Contact {
        private long id;
        private String name;
        private String email;
        private String phone;
        private String street;
        private String city;
        private byte[] img;

        public Contact(long id, String name, String email, String phone, String street, String city, byte[] img) {
            this.id = id;
            this.name = name;
            this.email = email;
            this.phone = phone;
            this.street = street;
            this.city = city;
            this.img = img;
        }

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
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

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public byte[] getImg() {
            return img;
        }

        public void setImg(byte[] img) {
            this.img = img;
        }

        @Override
        public String toString() {
            return "Contact{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", email='" + email + '\'' +
                    ", phone='" + phone + '\'' +
                    ", street='" + street + '\'' +
                    ", city='" + city + '\'' +
                    ", img=" + Arrays.toString(img) +
                    '}';
        }

}
