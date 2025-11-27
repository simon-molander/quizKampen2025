package Database;

import QuestionsAndAnswers.Answer;
import QuestionsAndAnswers.Question;
import Server.Server;

import java.util.ArrayList;
import java.util.Collections;

public class DAO {


    public static ArrayList<ArrayList> subjectList = new ArrayList<>();

    public static ArrayList<Question> History = new ArrayList<>();
    public static ArrayList<Question> Nature = new ArrayList<>();
    public static ArrayList<Question> Geography = new ArrayList<>();
    public static ArrayList<Question> Media = new ArrayList<>();
    public static ArrayList<Question> Science = new ArrayList<>();
    public static ArrayList<Question> Technology = new ArrayList<>();
    public static ArrayList<Question> GeneralKnowledge = new ArrayList<>();




    static public int index = 0;

    public DAO() {

        subjectList.add(History);
        subjectList.add(Nature);
        subjectList.add(Media);
        subjectList.add(Geography);
        subjectList.add(Science);
        subjectList.add(Technology);
        subjectList.add(GeneralKnowledge);


        Question q1h = new Question(History, "History", "What year did the Titanic sink?",
                new Answer("1912", true),
                new Answer("1943", false),
                new Answer("1903", false),
                new Answer("1891", false));

        Question q2h = new Question(History, "History", "Who is not on a currency on the US dollar?",
                new Answer("George Washington", false),
                new Answer("Richard Nixon", true),
                new Answer("Abraham Lincoln", false),
                new Answer("Benjamin Franklin", false));

        Question q3h = new Question(History, "History", "When did the Berlin wall fall?",
                new Answer("1975", false),
                new Answer("1945", false),
                new Answer("1989", true),
                new Answer("1994", false));

        Question q4h = new Question(History, "History", "Who was the first President of the United States?",
                new Answer("Thomas Jefferson", false),
                new Answer("John Adams", false),
                new Answer("James Madison", false),
                new Answer("George Washington", true));

        Question q5h = new Question(History, "History", "In which year did World War II end?",
                new Answer("1945", true),
                new Answer("1940", false),
                new Answer("1950", false),
                new Answer("1939", false));

        Question q6h = new Question(History, "History", "Which empire built the Colosseum?",
                new Answer("Greek Empire", false),
                new Answer("Roman Empire", true),
                new Answer("Ottoman Empire", false),
                new Answer("Persian Empire", false));

        Question q7h = new Question(History, "History", "Who discovered America in 1492?",
                new Answer("Marco Polo", false),
                new Answer("James Cook", false),
                new Answer("Christopher Columbus", true),
                new Answer("Vasco da Gama", false));

        Question q8h = new Question(History, "History", "What was the name of the ship on which the Pilgrims traveled to America?",
                new Answer("Santa Maria", false),
                new Answer("Victoria", false),
                new Answer("Endeavour", false),
                new Answer("Mayflower", true));

        Question q9h = new Question(History, "History", "Which ancient civilization built the pyramids?",
                new Answer("Egyptians", true),
                new Answer("Romans", false),
                new Answer("Aztecs", false),
                new Answer("Chinese", false));

        Question q10h = new Question(History, "History", "Who was the leader of Germany during World War II?",
                new Answer("Joseph Stalin", false),
                new Answer("Adolf Hitler", true),
                new Answer("Winston Churchill", false),
                new Answer("Franklin D. Roosevelt", false));


        Question q1m = new Question(Media, "Media", "Which director is known for 'Inception' and 'Interstellar'?",
                new Answer("Quentin Tarantino", false),
                new Answer("Steven Spielberg", false),
                new Answer("Christopher Nolan", true),
                new Answer("David Fincher", false));

        Question q2m = new Question(Media, "Media", "Which movie features a talking donkey?",
                new Answer("Madagascar", false),
                new Answer("Finding Nemo", false),
                new Answer("Cars", false),
                new Answer("Shrek", true));

        Question q3m = new Question(Media, "Media", "Which superhero uses a metal suit to fight crime?",
                new Answer("Iron Man", true),
                new Answer("Superman", false),
                new Answer("Batman", false),
                new Answer("Hulk", false));

        Question q4m = new Question(Media, "Media", "In which movie does the character Jack Sparrow appear?",
                new Answer("Hook", false),
                new Answer("Pirates of the Caribbean", true),
                new Answer("The Goonies", false),
                new Answer("Treasure Planet", false));

        Question q5m = new Question(Media, "Media", "Which movie features the quote 'May the Force be with you'?",
                new Answer("Star Trek", false),
                new Answer("Dune", false),
                new Answer("Star Wars", true),
                new Answer("Avatar", false));

        Question q6m = new Question(Media, "Media", "Which animated movie is about a clownfish searching for his son?",
                new Answer("Shark Tale", false),
                new Answer("Moana", false),
                new Answer("The Little Mermaid", false),
                new Answer("Finding Nemo", true));

        Question q7m = new Question(Media, "Media", "Which movie series features the character Gandalf?",
                new Answer("The Lord of the Rings", true),
                new Answer("Harry Potter", false),
                new Answer("Narnia", false),
                new Answer("Percy Jackson", false));

        Question q8m = new Question(Media, "Media", "What is the name of the toy cowboy in Toy Story?",
                new Answer("Buzz", false),
                new Answer("Woody", true),
                new Answer("Jessie", false),
                new Answer("Duke", false));

        Question q9m = new Question(Media, "Media", "Which movie is about a giant green ogre?",
                new Answer("Ice Age", false),
                new Answer("The Hulk", false),
                new Answer("Shrek", true),
                new Answer("Monsters Inc.", false));

        Question q10m = new Question(Media, "Media", "Which superhero movie features Wakanda?",
                new Answer("Wonder Woman", false),
                new Answer("Aquaman", false),
                new Answer("Thor", false),
                new Answer("Black Panther", true));


        Question q1n = new Question(Nature, "Nature", "What is the largest mammal on Earth?",
                new Answer("Blue Whale", true),
                new Answer("African Elephant", false),
                new Answer ("Giraffe", false),
                new Answer("Hippopotamus", false));

        Question q2n = new Question(Nature, "Nature", "Which gas do plants absorb from the air?",
                new Answer("Nitrogen", false),
                new Answer("Carbon Dioxide", true),
                new Answer("Oxygen", false),
                new Answer("Helium", false));

        Question q3n = new Question(Nature, "Nature", "What is the fastest land animal?",
                new Answer("Lion", false),
                new Answer("Horse", false),
                new Answer("Cheetah", true),
                new Answer("Greyhound", false));

        Question q4n = new Question(Nature, "Nature", "Which planet is known as the Red Planet?",
                new Answer("Venus", false),
                new Answer("Jupiter", false),
                new Answer("Saturn", false),
                new Answer("Mars", true));

        Question q5n = new Question(Nature, "Nature", "Which part of the plant carries out photosynthesis?",
                new Answer("Leaves", true),
                new Answer("Roots", false),
                new Answer("Flowers", false),
                new Answer("Stem", false));

        Question q6n = new Question(Nature, "Nature", "What do bees collect from flowers?",
                new Answer("Water", false),
                new Answer("Nectar", true),
                new Answer("Soil", false),
                new Answer("Bark", false));

        Question q7n = new Question(Nature, "Nature", "What type of animal is a frog?",
                new Answer("Reptile", false),
                new Answer("Bird", false),
                new Answer("Amphibian", true),
                new Answer("Mammal", false));

        Question q8n = new Question(Nature, "Nature", "Which ocean is the largest?",
                new Answer("Atlantic Ocean", false),
                new Answer("Indian Ocean", false),
                new Answer("Arctic Ocean", false),
                new Answer("Pacific Ocean", true));

        Question q9n = new Question(Nature, "Nature", "What do you call animals that only eat plants?",
                new Answer("Herbivores", true),
                new Answer("Carnivores", false),
                new Answer("Omnivores", false),
                new Answer("Insectivores", false));

        Question q10n = new Question(Nature, "Nature", "What is the main source of energy for Earth?",
                new Answer("The Moon", false),
                new Answer("The Sun", true),
                new Answer("Volcanoes", false),
                new Answer("The Wind", false));


        Question q1g = new Question(Geography, "Geography", "What is the capital of Japan?",
                new Answer("Seoul", false),
                new Answer("Beijing", false),
                new Answer("Tokyo", true),
                new Answer("Taipei", false));

        Question q2g = new Question(Geography, "Geography", "Which country is famous for the pyramids of Giza?",
                new Answer("Mexico", false),
                new Answer("Sudan", false),
                new Answer("Turkey", false),
                new Answer("Egypt", true));

        Question q3g = new Question(Geography, "Geography", "Which continent is the Sahara Desert located on?",
                new Answer("Africa", true),
                new Answer("Asia", false),
                new Answer("Australia", false),
                new Answer("South America", false));

        Question q4g = new Question(Geography, "Geography", "Which country is known for the festival 'La Tomatina'?",
                new Answer("Portugal", false),
                new Answer("Spain", true),
                new Answer("Italy", false),
                new Answer("France", false));

        Question q5g = new Question(Geography, "Geography", "Where is the Great Barrier Reef located?",
                new Answer("Indonesia", false),
                new Answer("Philippines", false),
                new Answer("Australia", true),
                new Answer("Thailand", false));

        Question q6g = new Question(Geography, "Geography", "Which language is spoken the most worldwide?",
                new Answer("English", false),
                new Answer("Spanish", false),
                new Answer("Arabic", false),
                new Answer("Mandarin Chinese", true));

        Question q7g = new Question(Geography, "Geography", "The Taj Mahal is located in which country?",
                new Answer("India", true),
                new Answer("Pakistan", false),
                new Answer("Bangladesh", false),
                new Answer("Sri Lanka", false));

        Question q8g = new Question(Geography, "Geography", "Which country is known for the traditional dance 'Tango'?",
                new Answer("Brazil", false),
                new Answer("Argentina", true),
                new Answer("Chile", false),
                new Answer("Peru", false));

        Question q9g = new Question(Geography, "Geography", "Mount Everest lies on the border of Nepal and which other country?",
                new Answer("India", false),
                new Answer("Bhutan", false),
                new Answer("China", true),
                new Answer("Myanmar", false));

        Question q10g = new Question(Geography, "Geography", "In which country would you find the ancient city of Petra?",
                new Answer("Greece", false),
                new Answer("Italy", false),
                new Answer("Israel", false),
                new Answer("Jordan", true));



        Question q1sci = new Question(Science, "Science", "What is the chemical symbol for water?",
                new Answer("H2O", true),
                new Answer("O2", false),
                new Answer("CO2", false),
                new Answer("H2", false));

        Question q2sci = new Question(Science, "Science", "What planet is known as the morning star?",
                new Answer("Mars", false),
                new Answer("Venus", true),
                new Answer("Jupiter", false),
                new Answer("Saturn", false));

        Question q3sci = new Question(Science, "Science", "Which particle has a negative charge?",
                new Answer("Proton", false),
                new Answer("Neutron", false),
                new Answer("Electron", true),
                new Answer("Ion", false));

        Question q4sci = new Question(Science, "Science", "Which gas makes up most of Earth's atmosphere?",
                new Answer("Oxygen", false),
                new Answer("Carbon Dioxide", false),
                new Answer("Argon", false),
                new Answer("Nitrogen", true));

        Question q5sci = new Question(Science, "Science", "What force pulls objects toward Earth?",
                new Answer("Gravity", true),
                new Answer("Magnetism", false),
                new Answer("Friction", false),
                new Answer("Momentum", false));

        Question q6sci = new Question(Science, "Science", "Which organ pumps blood through the body?",
                new Answer("Lungs", false),
                new Answer("Heart", true),
                new Answer("Kidneys", false),
                new Answer("Liver", false));

        Question q7sci = new Question(Science, "Science", "Which state of matter has a definite shape?",
                new Answer("Gas", false),
                new Answer("Liquid", false),
                new Answer("Solid", true),
                new Answer("Plasma", false));

        Question q8sci = new Question(Science, "Science", "What is the boiling point of water at sea level?",
                new Answer("50°C", false),
                new Answer("120°C", false),
                new Answer("10°C", false),
                new Answer("100°C", true));

        Question q9sci = new Question(Science, "Science", "What part of the cell contains DNA?",
                new Answer("Nucleus", true),
                new Answer("Ribosome", false),
                new Answer("Membrane", false),
                new Answer("Cytoplasm", false));

        Question q10sci = new Question(Science, "Science", "Which gas do humans exhale?",
                new Answer("Methane", false),
                new Answer("Carbon Dioxide", true),
                new Answer("Nitrogen", false),
                new Answer("Oxygen", false));



        Question q1t = new Question(Technology, "Technology", "What does CPU stand for?",
                new Answer("Central Processing Unit", true),
                new Answer("Computer Power Unit", false),
                new Answer("Central Performance Utility", false),
                new Answer("Control Processing Usage", false));

        Question q2t = new Question(Technology, "Technology", "Which company owns the Beat headphones brand?",
                new Answer("Samsung", false),
                new Answer("Apple", true),
                new Answer("Google", false),
                new Answer("Huawei", false));

        Question q3t = new Question(Technology, "Technology", "What does 'HTTP' stand for?",
                new Answer("Hyperlink Transfer Program", false),
                new Answer("High Transmission Protocol", false),
                new Answer("HyperText Transfer Protocol", true),
                new Answer("Host Text Transfer Package", false));

        Question q4t = new Question(Technology, "Technology", "Which device is used to store long-term data?",
                new Answer("RAM", false),
                new Answer("GPU", false),
                new Answer("CPU", false),
                new Answer("SSD/HDD", true));

        Question q5t = new Question(Technology, "Technology", "Which company developed Windows?",
                new Answer("Microsoft", true),
                new Answer("IBM", false),
                new Answer("Asus", false),
                new Answer("Dell", false));

        Question q6t = new Question(Technology, "Technology", "What does 'AI' stand for?",
                new Answer("Automated Interface", false),
                new Answer("Artificial Intelligence", true),
                new Answer("Authorized Input", false),
                new Answer("Active Integration", false));

        Question q7t = new Question(Technology, "Technology", "Which connector is reversible?",
                new Answer("HDMI", false),
                new Answer("Micro-USB", false),
                new Answer("USB-C", true),
                new Answer("VGA", false));

        Question q8t = new Question(Technology, "Technology", "Which company makes the PlayStation?",
                new Answer("Microsoft", false),
                new Answer("Nintendo", false),
                new Answer("Sega", false),
                new Answer("Sony", true));

        Question q9t = new Question(Technology, "Technology", "What does GPU primarily process?",
                new Answer("Graphics", true),
                new Answer("Audio", false),
                new Answer("Storage", false),
                new Answer("Networking", false));

        Question q10t = new Question(Technology, "Technology", "What does 'URL' stand for?",
                new Answer("Universal Resource Loader", false),
                new Answer("Uniform Resource Locator", true),
                new Answer("Unified Retrieval Link", false),
                new Answer("User-Region Locator", false));


        Question q1gk = new Question(GeneralKnowledge, "General Knowledge", "What is the largest planet in our solar system?",
                new Answer("Jupiter", true),
                new Answer("Saturn", false),
                new Answer("Earth", false),
                new Answer("Mars", false));

        Question q2gk = new Question(GeneralKnowledge, "General Knowledge", "Which gas do humans breathe in to survive?",
                new Answer("Carbon Dioxide", false),
                new Answer("Oxygen", true),
                new Answer("Nitrogen", false),
                new Answer("Hydrogen", false));

        Question q3gk = new Question(GeneralKnowledge, "General Knowledge", "What is the chemical symbol for gold?",
                new Answer("Go", false),
                new Answer("Ag", false),
                new Answer("Au", true),
                new Answer("Pb", false));

        Question q4k = new Question(GeneralKnowledge, "General Knowledge", "What is the main ingredient in guacamole?",
                new Answer("Tomato", false),
                new Answer("Potato", false),
                new Answer("Cucumber", false),
        new Answer("Avocado", true));


        Question q5gk = new Question(GeneralKnowledge, "General Knowledge", "What is the main ingredient in bread?",
                new Answer("Flour", true),
                new Answer("Sugar", false),
                new Answer("Salt", false),
                new Answer("Butter", false));

        Question q6gk = new Question(GeneralKnowledge, "General Knowledge", "Which organ pumps blood throughout the human body?",
                new Answer("Lungs", false),
                new Answer("Heart", true),
                new Answer("Kidneys", false),
                new Answer("Liver", false));

        Question q7gk = new Question(GeneralKnowledge, "General Knowledge", "Which planet is known as the Red Planet?",
                new Answer("Mercury", false),
                new Answer("Venus", false),
                new Answer("Mars", true),
                new Answer("Saturn", false));

        Question q8gk = new Question(GeneralKnowledge, "General Knowledge", "What is H2O more commonly known as?",
                new Answer("Hydrogen", false),
                new Answer("Oxygen", false),
                new Answer("Water", true),
                new Answer("Salt", false));

        Question q9gk = new Question(GeneralKnowledge, "General Knowledge", "Which device is used to measure temperature?",
                new Answer("Scale", false),
                new Answer("Ruler", false),
                new Answer("Thermometer", true),
                new Answer("Barometer", false));

        Question q10gk = new Question(GeneralKnowledge, "General Knowledge", "What is the largest desert in the world?",
                new Answer("Sahara", false),
                new Answer("Gobi", false),
                new Answer("Antarctic Desert", true),
                new Answer("Kalahari", false));








        //for (Question q : History){
        //    System.out.println(q.getQuestionText());
        //}
    }

    public Question getQuestion(ArrayList subject) {

        Question currentQuestion = (Question) subject.get(index);
        index++;
        if (index == subject.size()) {
            index = 0;
            System.out.println("\nReached end of subject, resetting...\n");
            return (Question) subject.get(index);
        } else {


            return currentQuestion;
        }
    }

    public void shuffleQuestions() {
        for (ArrayList l : subjectList) {
            Collections.shuffle(l);
        }
    }

    public void shuffleCategories(){
        Collections.shuffle(subjectList);
    }

    public void printNextQuestion(ArrayList subject) {
        System.out.println(getQuestion(subject).getQuestionText());

    }
    public void setCategory (int category){
        switch (category) {
            case 1 -> Server.category = subjectList.getFirst();
            case 2 -> Server.category = subjectList.get(1);
            case 3 -> Server.category = subjectList.get(2);
            case 4 -> Server.category = subjectList.get(3);
        }


    }

    public String getCategoryName(int index) {
        ArrayList<Question> category = subjectList.get(index);
        return category.get(0).getCatText();
    }


}
