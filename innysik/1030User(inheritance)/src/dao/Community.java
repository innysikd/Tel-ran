package dao;

import data.User;

public class Community {

    private User[] users;
    private int size;

    public Community (int capacity){
        users = new User[capacity];
        size = 0;
    }

    public boolean addUser (User user){
        if (size<users.length) {
            users[size] = user;
            size++;
        }
        return false;
    }

    public boolean deleteUser (User user){
        for (int i =0; i<size; i++){
            if (users[i].equals(user));
            users[i] = user;
            size++;
        }
        return false;
    }

    public void display(){
        for (int i = 0; i<size; i++){
            System.out.println(users[i]);
        }
    }

    public void displayByStatus (String status){
        boolean flag = false;
        for (int i =0; i<size; i++){
            if (users[i].getClass().getSimpleName().equalsIgnoreCase(status)){
                System.out.println(users[i].getName());
                System.out.println(users[i].getStag());
                flag = true;
            }
        }
        if (!flag){
            System.out.println("We don't have such member");
        }
    }

    public void displayUsersByParameter (String parameter){
        for (int i=0; i<size; i++){
            if(users[i].findByParameter(parameter)){
                System.out.println(users[i].getName());
            }

        }
    }




}
