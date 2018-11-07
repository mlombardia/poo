package ar.edu.itba.poo.ej3;

import java.util.*;

public class CategoryRace extends Race {

    private Map<String, Category> categories = new HashMap<>();

    public void addCategory(String name, int from, int to) {
        categories.put(name, new Category(name, from, to));
    }

    public void printCategoryRanking(String categoryName) {
        Category category = categories.get(categoryName);
        List<Participant> categoryParticipants = new ArrayList<>();
        for(Participant participant : participants.values()) {
            if(participant.hasTime() && category.between(participant.getAge())) {
                categoryParticipants.add(participant);
            }
        }
        categoryParticipants.sort(Comparator.comparingInt(Participant::getTotalTime));
        printParticipants(categoryParticipants);
    }

    private class Category {

        private String name;
        private int from;
        private int to;

        public Category(String name, int from, int to) {
            this.name = name;
            this.from = from;
            this.to = to;
        }

        public boolean between(int age) {
            return age >= from && age <= to;
        }

    }

}
