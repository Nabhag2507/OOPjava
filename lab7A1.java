import java.util.Scanner;

class Student {
    int id_no;
    int no_of_subjects_registered;
    String[] subject_code;
    int[] subject_credits;
    String[] grade_obtained;
    double spi;

    public Student(int id_no, int no_of_subjects_registered, String[] subject_code, int[] subject_credits,
            String[] grade_obtained, double spi) {
        this.id_no = id_no;
        this.no_of_subjects_registered = no_of_subjects_registered;
        this.subject_code = subject_code;
        this.subject_credits = subject_credits;
        this.grade_obtained = grade_obtained;
        this.spi = spi;
    }

    public void print() {
        System.out.println("Student ID: " + id_no);
        System.out.println("Number of subjects registered: " + no_of_subjects_registered);

        for (int i=0;i<no_of_subjects_registered;i++){
            System.out.println("Subject Code: " + subject_code[i] + ", Credits: " +
            subject_credits[i] + ", Grade Obtained: " + grade_obtained[i]);
        }
        System.out.println("Your spi is : " + spi);
    }
}

public class lab7A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("How many Students data do you want to enter : ");
        int size = sc.nextInt();
        sc.nextLine();
        Student[] stu = new Student[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Enter Student ID : ");
            int id = sc.nextInt();

            System.out.print("how many subject are registered :");
            int no_of_subjects_registered = sc.nextInt();

            String[] subject_code = new String[no_of_subjects_registered];
            int[] subject_credits = new int[no_of_subjects_registered];
            String[] grade_obtained = new String[no_of_subjects_registered];

            int var = 0, sum = 0;
            for (int j = 0; j < no_of_subjects_registered; j++) {
                System.out.print("Enter Subject Code no" + (j + 1) + " :");
                subject_code[j] = sc.next();

                System.out.print("Enter Subject Credits no" + (j + 1) + " :");
                subject_credits[j] = sc.nextInt();
                System.out.print("Enter Grade Obtained no" + (j + 1) + " :");
                grade_obtained[j] = sc.next();

                int grade = 0;
                if (grade_obtained[j].equals("A")) {
                    grade = 10;
                }
                else if (grade_obtained[j].equals("B")) {
                    grade = 8;
                }
                else if (grade_obtained[j].equals("C")) {
                    grade = 6;
                }
                else if (grade_obtained[j].equals("D")) {
                    grade = 4;
                }
                else if (grade_obtained[j].equals("E")) {
                    grade = 2;
                }
                var = subject_credits[j] * grade;
                sum += subject_credits[j];
            }

            double spi = var / sum;

            stu[i] = new Student(id, no_of_subjects_registered, subject_code, subject_credits, grade_obtained, spi);

        }
        for (int i = 0; i < size; i++) {
            stu[i].print();
        }
        sc.close();
    }
}
