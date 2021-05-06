package com.camba;

class Cariler implements java.io.Serializable{
    String Name;
    String Tel;
    int Receivable;
}

class Project implements java.io.Serializable{
    String StartDate;
    String EndDate;
    String BalconyType;
    Cariler ProjectCari;
    int Amount;
    int Winnings;
    int Credit;
}