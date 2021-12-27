package com.Nisal;

public class Student {

   private final String name;
   private final String school;
   private final String location;
   private final Boolean attend;

    public Student(Builder builder) {
        this.name =builder.name;
        this.school = builder.school;
        this.location = builder.location;
        this.attend = builder.attend;
    }

    static class Builder
    {
        private String name;
        private String school;
        private String location;
        private Boolean attend;

        public Student build()
        {
            return new Student(this);
        }

        // we can use the constructors if we want to enforce the values
        public Builder(String name)
        {
            this.name= name;
        }

        public Builder school(String school)
        {
            this.school = school;
            return this;
        }

        public Builder location(String location)
        {
            this.location = location;
            return this;
        }

        public Builder attend(Boolean attend)
        {
            this.attend = attend;
            return this;
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", school='" + school + '\'' +
                ", location='" + location + '\'' +
                ", attend=" + attend +
                '}';
    }
}
