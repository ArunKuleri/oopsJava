package builderPattern;

public class Main {
    public static void main(String[] args) {
        Student s = Student.builder()
                .universityName("IIIITTTT")
                .phoneNumber("12344235")
                .age(23)
                .gradYear(2021)
                .name("Prateek")
                .id(1)
                .build();

        System.out.println(s);

}
}
