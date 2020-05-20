public class StudentRecord {

    private int[] scores; // contains scores.length values. scores.length > 1

    public StudentRecord(int[] scores) {
        this.scores = scores;
    }

    /** Returns the average (arithmetic mean) of the values in scores
     * whose subscripts are between first and last, inclusive
     * precondition: 0 <= first <= last < scores.length
     * Method is marked public for testing purposes.
     */
    public double average(int first, int last) {
        double average = 0;
        double length = 0;
        double result = 0;
        for(int i = first; i <= last; i++){
            average += scores[i];
            length++;
        }
        result = average / length;
        return result;
    }

    /** Returns true if each successive value in scores is greater
     * than or equal to the previous value;
     * otherwise, returns false
     * Method marked public for testing purposes.
     */
    public boolean hasImproved() {
        boolean improve = false;

        for(int i = 0; i < scores.length - 1; i++){
            if(scores[i] < scores[i + 1]){
                improve = true;
                break;
            }
        }
        return improve;
    }

    /** If the values in scores have improved, returns the average of the elements in scores
     * with indexes greater than or equal to scores.length/2;
     * otherwise, returns the average of all the values in scores
     */
    public double finalAverage() {
        double average;

        if(hasImproved() == true){
            int i = (scores.length)/ 2;
            average = average(i, scores.length - 1);
        }
        else{
            average = average(0, scores.length - 1);
        }
        return average;
    }
}
