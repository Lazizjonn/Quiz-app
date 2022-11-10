package uz.gita.quiz_app.controller;

import android.content.res.Resources;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import uz.gita.quiz_app.R;
import uz.gita.quiz_app.model.TestData;

public class AppController {

    private static AppController controller;

    public static AppController getInstance() {
        if (controller == null) {
            controller = new AppController();
        }
        return controller;
    }

    private AppController() {
    }

    public static List<TestData> get_1_C_Plus(Resources resources) {
        List<TestData> result = new ArrayList<>();
        String[] questions = resources.getStringArray(R.array.c_plus_plus_questions);
        String[] variant_1 = resources.getStringArray(R.array.c_plus_plus_variant_1);
        String[] variant_2 = resources.getStringArray(R.array.c_plus_plus_variant_2);
        String[] variant_3 = resources.getStringArray(R.array.c_plus_plus_variant_3);
        String[] variant_4 = resources.getStringArray(R.array.c_plus_plus_variant_4);
        String[] answers = resources.getStringArray(R.array.c_plus_plus_answers);
        for (int i = 0; i < questions.length; i++) {
            TestData temp = new TestData(i + 1, questions[i], variant_1[i], variant_2[i], variant_3[i], variant_4[i], answers[i]);
            result.add(temp);
        }
        Collections.shuffle(result);
        return result;
    }

    public static List<TestData> get_2_Computer_communication(Resources resources) {
        List<TestData> result = new ArrayList<>();
        String[] questions = resources.getStringArray(R.array.Computer_communication_questions);
        String[] variant_1 = resources.getStringArray(R.array.Computer_communication_variant_1);
        String[] variant_2 = resources.getStringArray(R.array.Computer_communication_variant_2);
        String[] variant_3 = resources.getStringArray(R.array.Computer_communication_variant_3);
        String[] variant_4 = resources.getStringArray(R.array.Computer_communication_variant_4);
        String[] answers = resources.getStringArray(R.array.Computer_communication_answers);
        for (int i = 0; i < questions.length; i++) {
            TestData temp = new TestData(i + 1, questions[i], variant_1[i], variant_2[i], variant_3[i], variant_4[i], answers[i]);
            result.add(temp);
        }
        Collections.shuffle(result);
        return result;
    }

    public static List<TestData> get_3_Computer_fundamental(Resources resources) {
        List<TestData> result = new ArrayList<>();
        String[] questions = resources.getStringArray(R.array.Computer_fundamental_questions);
        String[] variant_1 = resources.getStringArray(R.array.Computer_fundamental_variant_1);
        String[] variant_2 = resources.getStringArray(R.array.Computer_fundamental_variant_2);
        String[] variant_3 = resources.getStringArray(R.array.Computer_fundamental_variant_3);
        String[] variant_4 = resources.getStringArray(R.array.Computer_fundamental_variant_4);
        String[] answers = resources.getStringArray(R.array.Computer_fundamental_answers);
        for (int i = 0; i < questions.length; i++) {
            TestData temp = new TestData(i + 1, questions[i], variant_1[i], variant_2[i], variant_3[i], variant_4[i], answers[i]);
            result.add(temp);
        }
        Collections.shuffle(result);
        return result;
    }

    public static List<TestData> get_4_Computer_instructor(Resources resources) {
        List<TestData> result = new ArrayList<>();
        String[] questions = resources.getStringArray(R.array.Computer_instructor_questions);
        String[] variant_1 = resources.getStringArray(R.array.Computer_instructor_variant_1);
        String[] variant_2 = resources.getStringArray(R.array.Computer_instructor_variant_2);
        String[] variant_3 = resources.getStringArray(R.array.Computer_instructor_variant_3);
        String[] variant_4 = resources.getStringArray(R.array.Computer_instructor_variant_4);
        String[] answers = resources.getStringArray(R.array.Computer_instructor_answers);
        for (int i = 0; i < questions.length; i++) {
            TestData temp = new TestData(i + 1, questions[i], variant_1[i], variant_2[i], variant_3[i], variant_4[i], answers[i]);
            result.add(temp);
        }
        Collections.shuffle(result);
        return result;
    }

    public static List<TestData> get_5_Computer_internet(Resources resources) {
        List<TestData> result = new ArrayList<>();
        String[] questions = resources.getStringArray(R.array.Computer_internet_questions);
        String[] variant_1 = resources.getStringArray(R.array.Computer_internet_variant_1);
        String[] variant_2 = resources.getStringArray(R.array.Computer_internet_variant_2);
        String[] variant_3 = resources.getStringArray(R.array.Computer_internet_variant_3);
        String[] variant_4 = resources.getStringArray(R.array.Computer_internet_variant_4);
        String[] answers = resources.getStringArray(R.array.Computer_internet_answers);
        for (int i = 0; i < questions.length; i++) {
            TestData temp = new TestData(i + 1, questions[i], variant_1[i], variant_2[i], variant_3[i], variant_4[i], answers[i]);
            result.add(temp);
        }
        Collections.shuffle(result);
        return result;
    }

    public static List<TestData> get_6_Computer_memory(Resources resources) {
        List<TestData> result = new ArrayList<>();
        String[] questions = resources.getStringArray(R.array.Computer_memory_questions);
        String[] variant_1 = resources.getStringArray(R.array.Computer_memory_variant_1);
        String[] variant_2 = resources.getStringArray(R.array.Computer_memory_variant_2);
        String[] variant_3 = resources.getStringArray(R.array.Computer_memory_variant_3);
        String[] variant_4 = resources.getStringArray(R.array.Computer_memory_variant_4);
        String[] answers = resources.getStringArray(R.array.Computer_memory_answers);
        for (int i = 0; i < questions.length; i++) {
            TestData temp = new TestData(i + 1, questions[i], variant_1[i], variant_2[i], variant_3[i], variant_4[i], answers[i]);
            result.add(temp);
        }
        Collections.shuffle(result);
        return result;
    }

    public static List<TestData> get_7_Computer_msq(Resources resources) {
        List<TestData> result = new ArrayList<>();
        String[] questions = resources.getStringArray(R.array.Computer_msq_questions);
        String[] variant_1 = resources.getStringArray(R.array.Computer_msq_variant_1);
        String[] variant_2 = resources.getStringArray(R.array.Computer_msq_variant_2);
        String[] variant_3 = resources.getStringArray(R.array.Computer_msq_variant_3);
        String[] variant_4 = resources.getStringArray(R.array.Computer_msq_variant_4);
        String[] answers = resources.getStringArray(R.array.Computer_msq_answers);
        for (int i = 0; i < questions.length; i++) {
            TestData temp = new TestData(i + 1, questions[i], variant_1[i], variant_2[i], variant_3[i], variant_4[i], answers[i]);
            result.add(temp);
        }
        Collections.shuffle(result);
        return result;
    }

    public static List<TestData> get_8_Computer_networks(Resources resources) {
        List<TestData> result = new ArrayList<>();
        String[] questions = resources.getStringArray(R.array.Computer_networks_questions);
        String[] variant_1 = resources.getStringArray(R.array.Computer_networks_variant_1);
        String[] variant_2 = resources.getStringArray(R.array.Computer_networks_variant_2);
        String[] variant_3 = resources.getStringArray(R.array.Computer_networks_variant_3);
        String[] variant_4 = resources.getStringArray(R.array.Computer_networks_variant_4);
        String[] answers = resources.getStringArray(R.array.Computer_networks_answers);
        for (int i = 0; i < questions.length; i++) {
            TestData temp = new TestData(i + 1, questions[i], variant_1[i], variant_2[i], variant_3[i], variant_4[i], answers[i]);
            result.add(temp);
        }
        Collections.shuffle(result);
        return result;
    }

    public static List<TestData> get_9_Computer_organization(Resources resources) {
        List<TestData> result = new ArrayList<>();
        String[] questions = resources.getStringArray(R.array.Computer_organization_questions);
        String[] variant_1 = resources.getStringArray(R.array.Computer_organization_variant_1);
        String[] variant_2 = resources.getStringArray(R.array.Computer_organization_variant_2);
        String[] variant_3 = resources.getStringArray(R.array.Computer_organization_variant_3);
        String[] variant_4 = resources.getStringArray(R.array.Computer_organization_variant_4);
        String[] answers = resources.getStringArray(R.array.Computer_organization_answers);
        for (int i = 0; i < questions.length; i++) {
            TestData temp = new TestData(i + 1, questions[i], variant_1[i], variant_2[i], variant_3[i], variant_4[i], answers[i]);
            result.add(temp);
        }
        Collections.shuffle(result);
        return result;
    }

    public static List<TestData> get_10_data_communications(Resources resources) {
        List<TestData> result = new ArrayList<>();
        String[] questions = resources.getStringArray(R.array.data_communications_questions);
        String[] variant_1 = resources.getStringArray(R.array.data_communications_variant_1);
        String[] variant_2 = resources.getStringArray(R.array.data_communications_variant_2);
        String[] variant_3 = resources.getStringArray(R.array.data_communications_variant_3);
        String[] variant_4 = resources.getStringArray(R.array.data_communications_variant_4);
        String[] answers = resources.getStringArray(R.array.data_communications_answers);
        for (int i = 0; i < questions.length; i++) {
            TestData temp = new TestData(i + 1, questions[i], variant_1[i], variant_2[i], variant_3[i], variant_4[i], answers[i]);
            result.add(temp);
        }
        Collections.shuffle(result);
        return result;
    }

    public static List<TestData> get_11_data_processing(Resources resources) {
        List<TestData> result = new ArrayList<>();
        String[] questions = resources.getStringArray(R.array.data_processing_questions);
        String[] variant_1 = resources.getStringArray(R.array.data_processing_variant_1);
        String[] variant_2 = resources.getStringArray(R.array.data_processing_variant_2);
        String[] variant_3 = resources.getStringArray(R.array.data_processing_variant_3);
        String[] variant_4 = resources.getStringArray(R.array.data_processing_variant_4);
        String[] answers = resources.getStringArray(R.array.data_processing_answers);
        for (int i = 0; i < questions.length; i++) {
            TestData temp = new TestData(i + 1, questions[i], variant_1[i], variant_2[i], variant_3[i], variant_4[i], answers[i]);
            result.add(temp);
        }
        Collections.shuffle(result);
        return result;
    }

    public static List<TestData> get_12_data_structure(Resources resources) {
        List<TestData> result = new ArrayList<>();
        String[] questions = resources.getStringArray(R.array.data_structure_questions);
        String[] variant_1 = resources.getStringArray(R.array.data_structure_variant_1);
        String[] variant_2 = resources.getStringArray(R.array.data_structure_variant_2);
        String[] variant_3 = resources.getStringArray(R.array.data_structure_variant_3);
        String[] variant_4 = resources.getStringArray(R.array.data_structure_variant_4);
        String[] answers = resources.getStringArray(R.array.data_structure_answers);
        for (int i = 0; i < questions.length; i++) {
            TestData temp = new TestData(i + 1, questions[i], variant_1[i], variant_2[i], variant_3[i], variant_4[i], answers[i]);
            result.add(temp);
        }
        Collections.shuffle(result);
        return result;
    }

    public static List<TestData> get_13_internet_technology(Resources resources) {
        List<TestData> result = new ArrayList<>();
        String[] questions = resources.getStringArray(R.array.internet_technology_questions);
        String[] variant_1 = resources.getStringArray(R.array.internet_technology_variant_1);
        String[] variant_2 = resources.getStringArray(R.array.internet_technology_variant_2);
        String[] variant_3 = resources.getStringArray(R.array.internet_technology_variant_3);
        String[] variant_4 = resources.getStringArray(R.array.internet_technology_variant_4);
        String[] answers = resources.getStringArray(R.array.internet_technology_answers);
        for (int i = 0; i < questions.length; i++) {
            TestData temp = new TestData(i + 1, questions[i], variant_1[i], variant_2[i], variant_3[i], variant_4[i], answers[i]);
            result.add(temp);
        }
        Collections.shuffle(result);
        return result;
    }

    public static List<TestData> get_14_IT(Resources resources) {
        List<TestData> result = new ArrayList<>();
        String[] questions = resources.getStringArray(R.array.IT_questions);
        String[] variant_1 = resources.getStringArray(R.array.IT_variant_1);
        String[] variant_2 = resources.getStringArray(R.array.IT_variant_2);
        String[] variant_3 = resources.getStringArray(R.array.IT_variant_3);
        String[] variant_4 = resources.getStringArray(R.array.IT_variant_4);
        String[] answers = resources.getStringArray(R.array.IT_answers);
        for (int i = 0; i < questions.length; i++) {
            TestData temp = new TestData(i + 1, questions[i], variant_1[i], variant_2[i], variant_3[i], variant_4[i], answers[i]);
            result.add(temp);
        }
        Collections.shuffle(result);
        return result;
    }

    public static List<TestData> get_15_operating_system(Resources resources) {
        List<TestData> result = new ArrayList<>();
        String[] questions = resources.getStringArray(R.array.operating_system_questions);
        String[] variant_1 = resources.getStringArray(R.array.operating_system_variant_1);
        String[] variant_2 = resources.getStringArray(R.array.operating_system_variant_2);
        String[] variant_3 = resources.getStringArray(R.array.operating_system_variant_3);
        String[] variant_4 = resources.getStringArray(R.array.operating_system_variant_4);
        String[] answers = resources.getStringArray(R.array.operating_system_answers);
        for (int i = 0; i < questions.length; i++) {
            TestData temp = new TestData(i + 1, questions[i], variant_1[i], variant_2[i], variant_3[i], variant_4[i], answers[i]);
            result.add(temp);
        }
        Collections.shuffle(result);
        return result;
    }

    public static List<TestData> get_16_artificial_intelligence(Resources resources) {
        List<TestData> result = new ArrayList<>();
        String[] questions = resources.getStringArray(R.array.artificial_intelligence_questions);
        String[] variant_1 = resources.getStringArray(R.array.artificial_intelligence_variant_1);
        String[] variant_2 = resources.getStringArray(R.array.artificial_intelligence_variant_2);
        String[] variant_3 = resources.getStringArray(R.array.artificial_intelligence_variant_3);
        String[] variant_4 = resources.getStringArray(R.array.artificial_intelligence_variant_4);
        String[] answers = resources.getStringArray(R.array.artificial_intelligence_answers);
        for (int i = 0; i < questions.length; i++) {
            TestData temp = new TestData(i + 1, questions[i], variant_1[i], variant_2[i], variant_3[i], variant_4[i], answers[i]);
            result.add(temp);
        }
        Collections.shuffle(result);
        return result;
    }

}
