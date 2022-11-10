package uz.gita.quiz_app.model;

public class TestData {
    private int id;
    private String question;
    private String variant_1;
    private String variant_2;
    private String variant_3;
    private String variant_4;
    private String answer;

    public TestData(int id, String question, String variant_1, String variant_2, String variant_3, String variant_4, String answer) {
        this.id = id;
        this.question = question;
        this.variant_1 = variant_1;
        this.variant_2 = variant_2;
        this.variant_3 = variant_3;
        this.variant_4 = variant_4;
        this.answer = answer;
    }

    public int getId() {
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public String getVariant_1() {
        return variant_1;
    }

    public String getVariant_2() {
        return variant_2;
    }

    public String getVariant_3() {
        return variant_3;
    }

    public String getVariant_4() {
        return variant_4;
    }

    public String getAnswer() {
        return answer;
    }
}
