public class Calculator {

    public Calculator() {
    };

    public double getAverage(Markbook markbook) throws EmptyMarkbookException {
        int markbookSize = markbook.getSize();

        if (markbookSize == 0)
            throw new EmptyMarkbookException();

        return (markbookSize == 1) ? markbook.getMark(0) : calculateAverage(markbook);
    }

    public double getWorstMark(Markbook markbook) throws EmptyMarkbookException {
        int markbookSize = markbook.getSize();

        if (markbookSize == 0)
            throw new EmptyMarkbookException();

        return (markbookSize == 1) ? markbook.getMark(0) : calculateWorstMark(markbook);
    }

    public double getBestMark(Markbook markbook) throws EmptyMarkbookException {
        int markbookSize = markbook.getSize();

        if (markbookSize == 0)
            throw new EmptyMarkbookException();

        return (markbookSize == 1) ? markbook.getMark(0) : calculateBestMark(markbook);
    }

    private double calculateAverage(Markbook markbook) {
        double tmp = 0;
        int counter = 0;

        for (int i = 0; i < markbook.getSize(); i++) {
            tmp = tmp + markbook.getMark(i);
            counter++;
        }

        return (tmp / counter);
    }

    private double calculateWorstMark(Markbook markbook) throws EmptyMarkbookException {
        double worstMark = 6;

        for (int i = 0; i < markbook.getSize(); i++) {
            worstMark = markbook.getMark(i) < worstMark ? markbook.getMark(i) : worstMark;
        }

        return worstMark;
    }

    private double calculateBestMark(Markbook markbook) throws EmptyMarkbookException {
        double bestMark = 6;

        for (int i = 0; i < markbook.getSize(); i++) {
            bestMark = markbook.getMark(i) > bestMark ? markbook.getMark(i) : bestMark;
        }

        return bestMark;
    }

}
