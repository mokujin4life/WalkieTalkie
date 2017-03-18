package com.mokujin.domain;

import org.neo4j.ogm.annotation.GraphId;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;
import org.neo4j.ogm.annotation.Transient;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@NodeEntity
public class Profile {
    @GraphId
    private Long id;

    private String username;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    @Transient
    private String confirmedPassword;
    private byte[] photo;
    @Relationship(type = "BE_FRIEND_WITH",direction = Relationship.OUTGOING)
    private Set<Profile> friends = new HashSet<>();

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmedPassword() {
        return confirmedPassword;
    }

    public void setConfirmedPassword(String confirmedPassword) {
        this.confirmedPassword = confirmedPassword;
    }

    public Set<Profile> getFriends() {
        return friends;
    }

    public void addFriend(Profile friend) {
            this.friends.add(friend);
    }

    public void setFriends(Set<Profile> friends) {
        this.friends = friends;
    }

    public byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }


}
