public class StudentService {

    public boolean checkAverageScore(int score) {
        if (score < 50) {
            return false;
        } else {
            return true;
        }
    }
}
