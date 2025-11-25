package ClientServerRelation;

import java.util.ArrayList;
import java.util.Collections;

public class DAO {


    public static ArrayList<ArrayList> subjectList = new ArrayList<>();

    public static ArrayList<Question> History = new ArrayList<>();
    public static ArrayList<Question> Nature = new ArrayList<>();
    public static ArrayList<Question> Geography = new ArrayList<>();
    public static ArrayList<Question> Media = new ArrayList<>();

    int index = 0;

    public DAO() {


        Question q1h = new Question(History, "What year did the Titanic sink?",
                new Answer("1912", true),
                new Answer("1943", false),
                new Answer("1903", false),
                new Answer("1891", false));

        Question q2h = new Question(History, "Who is not on a currency on the US dollar?",
                new Answer("George Washington", false),
                new Answer("Richard Nixon", true),
                new Answer("Abraham Lincoln", false),
                new Answer("Benjamin Franklin", false));

        Question q3h = new Question(History, "When did the Berlin wall fall?",
                new Answer("1975", false),
                new Answer("1945", false),
                new Answer("1989", true),
                new Answer("1994", false));

        Question q4h = new Question(History, "Who was the first President of the United States?",
                new Answer("Thomas Jefferson", false),
                new Answer("John Adams", false),
                new Answer("James Madison", false),
                new Answer("George Washington", true));

        Question q5h = new Question(History, "In which year did World War II end?",
                new Answer("1945", true),
                new Answer("1940", false),
                new Answer("1950", false),
                new Answer("1939", false));

        Question q6h = new Question(History, "Which empire built the Colosseum?",
                new Answer("Greek Empire", false),
                new Answer("Roman Empire", true),
                new Answer("Ottoman Empire", false),
                new Answer("Persian Empire", false));

        Question q7h = new Question(History, "Who discovered America in 1492?",
                new Answer("Marco Polo", false),
                new Answer("James Cook", false),
                new Answer("Christopher Columbus", true),
                new Answer("Vasco da Gama", false));

        Question q8h = new Question(History, "What was the name of the ship on which the Pilgrims traveled to America?",
                new Answer("Santa Maria", false),
                new Answer("Victoria", false),
                new Answer("Endeavour", false),
                new Answer("Mayflower", true));

        Question q9h = new Question(History, "Which ancient civilization built the pyramids?",
                new Answer("Egyptians", true),
                new Answer("Romans", false),
                new Answer("Aztecs", false),
                new Answer("Chinese", false));

        Question q10h = new Question(History, "Who was the leader of Germany during World War II?",
                new Answer("Joseph Stalin", false),
                new Answer("Adolf Hitler", true),
                new Answer("Winston Churchill", false),
                new Answer("Franklin D. Roosevelt", false));

        Question q1m = new Question(Media, "Which director is known for 'Inception' and 'Interstellar'?",
                new Answer("Quentin Tarantino", false),
                new Answer("Steven Spielberg", false),
                new Answer("Christopher Nolan", true),
                new Answer("David Fincher", false));


        Question q2m = new Question(Media, "Which movie features a talking donkey?",
                new Answer("Madagascar", false),
                new Answer("Finding Nemo", false),
                new Answer("Cars", false),
                new Answer("Shrek", true));

        Question q3m = new Question(Media, "Which superhero uses a metal suit to fight crime?",
                new Answer("Iron Man", true),
                new Answer("Superman", false),
                new Answer("Batman", false),
                new Answer("Hulk", false));

        Question q4m = new Question(Media, "In which movie does the character Jack Sparrow appear?",
                new Answer("Hook", false),
                new Answer("Pirates of the Caribbean", true),
                new Answer("The Goonies", false),
                new Answer("Treasure Planet", false));

        Question q5m = new Question(Media, "Which movie features the quote 'May the Force be with you'?",
                new Answer("Star Trek", false),
                new Answer("Dune", false),
                new Answer("Star Wars", true),
                new Answer("Avatar", false));

        Question q6m = new Question(Media, "Which animated movie is about a clownfish searching for his son?",
                new Answer("Shark Tale", false),
                new Answer("Moana", false),
                new Answer("The Little Mermaid", false),
                new Answer("Finding Nemo", true));

        Question q7m = new Question(Media, "Which movie series features the character Gandalf?",
                new Answer("The Lord of the Rings", true),
                new Answer("Harry Potter", false),
                new Answer("Narnia", false),
                new Answer("Percy Jackson", false));

        Question q8m = new Question(Media, "What is the name of the toy cowboy in Toy Story?",
                new Answer("Buzz", false),
                new Answer("Woody", true),
                new Answer("Jessie", false),
                new Answer("Duke", false));

        Question q9m = new Question(Media, "Which movie is about a giant green ogre?",
                new Answer("Ice Age", false),
                new Answer("The Hulk", false),
                new Answer("Shrek", true),
                new Answer("Monsters Inc.", false));

        Question q10m = new Question(Media, "Which superhero movie features Wakanda?",
                new Answer("Wonder Woman", false),
                new Answer("Aquaman", false),
                new Answer("Thor", false),
                new Answer("Black Panther", true));

        Question q1n = new Question(Nature, "What is the largest mammal on Earth?",
                new Answer("Blue Whale", true),
                new Answer("African Elephant", false),
                new Answer("Giraffe", false),
                new Answer("Hippopotamus", false));

        Question q2n = new Question(Nature, "Which gas do plants absorb from the air?",
                new Answer("Nitrogen", false),
                new Answer("Carbon Dioxide", true),
                new Answer("Oxygen", false),
                new Answer("Helium", false));

        Question q3n = new Question(Nature, "What is the fastest land animal?",
                new Answer("Lion", false),
                new Answer("Horse", false),
                new Answer("Cheetah", true),
                new Answer("Greyhound", false));

        Question q4n = new Question(Nature, "Which planet is known as the Red Planet?",
                new Answer("Venus", false),
                new Answer("Jupiter", false),
                new Answer("Saturn", false),
                new Answer("Mars", true));

        Question q5n = new Question(Nature, "Which part of the plant carries out photosynthesis?",
                new Answer("Leaves", true),
                new Answer("Roots", false),
                new Answer("Flowers", false),
                new Answer("Stem", false));

        Question q6n = new Question(Nature, "What do bees collect from flowers?",
                new Answer("Water", false),
                new Answer("Nectar", true),
                new Answer("Soil", false),
                new Answer("Bark", false));

        Question q7n = new Question(Nature, "What type of animal is a frog?",
                new Answer("Reptile", false),
                new Answer("Bird", false),
                new Answer("Amphibian", true),
                new Answer("Mammal", false));

        Question q8n = new Question(Nature, "Which ocean is the largest?",
                new Answer("Atlantic Ocean", false),
                new Answer("Indian Ocean", false),
                new Answer("Arctic Ocean", false),
                new Answer("Pacific Ocean", true));

        Question q9n = new Question(Nature, "What do you call animals that only eat plants?",
                new Answer("Herbivores", true),
                new Answer("Carnivores", false),
                new Answer("Omnivores", false),
                new Answer("Insectivores", false));

        Question q10n = new Question(Nature, "What is the main source of energy for Earth?",
                new Answer("The Moon", false),
                new Answer("The Sun", true),
                new Answer("Volcanoes", false),
                new Answer("The Wind", false));

        Question q1g = new Question(Geography, "What is the capital of Japan?",
                new Answer("Seoul", false),
                new Answer("Beijing", false),
                new Answer("Tokyo", true),
                new Answer("Taipei", false));

        Question q2g = new Question(Geography, "Which country is famous for the pyramids of Giza?",
                new Answer("Mexico", false),
                new Answer("Sudan", false),
                new Answer("Turkey", false),
                new Answer("Egypt", true));

        Question q3g = new Question(Geography, "Which continent is the Sahara Desert located on?",
                new Answer("Africa", true),
                new Answer("Asia", false),
                new Answer("Australia", false),
                new Answer("South America", false));

        Question q4g = new Question(Geography, "Which country is known for the festival 'La Tomatina'?",
                new Answer("Portugal", false),
                new Answer("Spain", true),
                new Answer("Italy", false),
                new Answer("France", false));

        Question q5g = new Question(Geography, "Where is the Great Barrier Reef located?",
                new Answer("Indonesia", false),
                new Answer("Philippines", false),
                new Answer("Australia", true),
                new Answer("Thailand", false));

        Question q6g = new Question(Geography, "Which language is spoken the most worldwide?",
                new Answer("English", false),
                new Answer("Spanish", false),
                new Answer("Arabic", false),
                new Answer("Mandarin Chinese", true));

        Question q7g = new Question(Geography, "The Taj Mahal is located in which country?",
                new Answer("India", true),
                new Answer("Pakistan", false),
                new Answer("Bangladesh", false),
                new Answer("Sri Lanka", false));

        Question q8g = new Question(Geography, "Which country is known for the traditional dance 'Tango'?",
                new Answer("Brazil", false),
                new Answer("Argentina", true),
                new Answer("Chile", false),
                new Answer("Peru", false));

        Question q9g = new Question(Geography, "Mount Everest lies on the border of Nepal and which other country?",
                new Answer("India", false),
                new Answer("Bhutan", false),
                new Answer("China", true),
                new Answer("Myanmar", false));

        Question q10g = new Question(Geography, "In which country would you find the ancient city of Petra?",
                new Answer("Greece", false),
                new Answer("Italy", false),
                new Answer("Israel", false),
                new Answer("Jordan", true));


        //for (Question q : History){
        //    System.out.println(q.getQuestionText());
        //}
    }

    public Question getQuestion(ArrayList subject) {
        //Collections.shuffle(subject); //MÅSTE FLYTTAS SENARE TILL STARTEN AV SPELET, INTE HÄR
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

    public void printNextQuestion(ArrayList subject) {
        System.out.println(getQuestion(subject).getQuestionText());
    }

}