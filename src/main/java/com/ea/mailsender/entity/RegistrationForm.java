package com.ea.mailsender.entity;

public class RegistrationForm
{
    private String gender;
    private String nameSurname;
    private String title;
    private String institutionCity;
    private String email;
    private String phone;

    public String getGender()
    {
        return gender;
    }

    public void setGender(String gender)
    {
        this.gender = gender;
    }

    public String getNameSurname()
    {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname)
    {
        this.nameSurname = nameSurname;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public String getInstitutionCity()
    {
        return institutionCity;
    }

    public void setInstitutionCity(String institutionCity)
    {
        this.institutionCity = institutionCity;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    @Override
    public String toString()
    {
        return "RegistrationForm{" +
                "gender='" + gender + '\'' +
                ", nameSurname='" + nameSurname + '\'' +
                ", title='" + title + '\'' +
                ", institutionCity='" + institutionCity + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
