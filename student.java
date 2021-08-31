class student {
  double score;
  String subjectName;
  void displayScore(String n, double s) {
	subjectName = n;
	score = s;
    System.out.println(subjectName + ": " + score);
  }
  public static void main(String[] args) {
    student subject1 = new student();
    student subject2 = new student();
    student subject3 = new student();
    subject1.displayScore("Art", 73);
    subject2.displayScore("Maths", 92);
    subject3.displayScore("Spanish", 87);
	System.out.println("Average score:" + avr(subject1.score, subject2.score, subject3.score) );
  }
  public static double avr(double a, double b, double c) {
    return (a + b + c) / 3;
  }
}