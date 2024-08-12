package com.example.designPatterns.creationalPattern.Builder;

class User {
    private final String fName;
    private final String lName;
    private final String address;

    private User(UserBuilder userBuilder) {
        this.fName = userBuilder.fName;
        this.lName = userBuilder.lName;
        this.address = userBuilder.address;
    }

    @Override
    public String toString() {
        return "User{" +
                "fName='" + fName + '\'' +
                ", lName='" + lName + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public static class UserBuilder {
        private final String fName;
        private final String lName;
        private String address; // this attribute is to be made optional.

        public UserBuilder(String fName, String lName) {
            this.fName = fName;
            this.lName = lName;
        }

        public UserBuilder address(String address) {
            this.address = address;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}

public class BuilderPattern {
    public static void main(String[] args) {
        User prateek = new User.UserBuilder("Prateek", "Bhayana").address("Patel Nagar").build();
        System.out.println(prateek);
    }
}