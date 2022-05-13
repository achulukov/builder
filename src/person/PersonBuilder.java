package person;

public class PersonBuilder {

    protected  String name;
    protected  String surname;
    private Integer age;
    private String address;

    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    };

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    };

    public PersonBuilder setAge(int age) {
        if (age < 0) throw new  IllegalArgumentException("������������ �������");
        this.age = age;
        return this;
    };

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    };

    public Person build() {
        if (this.name == null || this.surname == null) throw new  IllegalArgumentException("�� ��� ������������ ������ ���������");


        return new Person(this.name, this.surname,this.age, this.address);
    };
}