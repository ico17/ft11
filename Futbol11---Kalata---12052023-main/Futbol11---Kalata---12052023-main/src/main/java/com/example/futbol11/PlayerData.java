package com.example.futbol11;

public class PlayerData {
    public PlayerData(String FirstName, String LastName, String Leage, String Nationality, String Team, String Team1, String Team2, String Team3, String Image_file,int Height, int Age, String Pos){
        this.firstName = FirstName;
        this.lastName = LastName;
        this.leage = Leage;
        this.nationality = Nationality;
        this.team= Team;
        this.team1= Team1;
        this.team2= Team2;
        this.team3= Team3;
        this.image_file = Image_file;
        this.height = Height;
        this.age = Age;
        this.pos = Pos;
    }

    String firstName;
    String lastName;
    String leage;
    String nationality;
    String team;
    String team1;
    String team2;
    String team3;
    String image_file;
    int height;
    int age;
    String pos;

}
