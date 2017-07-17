package com.csing1s.wonders.model;

import com.csing1s.wonders.R;

/**
 * Created by Csing1s on 6/24/2016.
 */
public class Story {
    private Page[] mPages= new Page[15];
   public  Story()
    {
        mPages[0]= new Page(R.drawable.page0," This statue of Jesus stands some 38 meters tall, atop the Corcovado mountain overlooking Rio de Janeiro. Designed by Brazilian Heitor da Silva Costa and created by French sculptor Paul Landowski, it is one of the world’s best-known monuments.It has become a symbol of the city and of the warmth of the Brazil.",
                new Choice("Explore Brazil",7),new Choice("Next wonder",1));
        mPages[1]= new Page(R.drawable.page1,"The Great Wall of China was built to link existing fortifications into a united defense system and better keep invading Mongol tribes out of China. It is the largest man-made monument ever to have been built and it is disputed that it is the only one visible from space.",
                new Choice("Explore China",8),new Choice("Next wonder",2));
        mPages[2]= new Page(R.drawable.page2,"In the 15th century, the Incan Emperor Pachacútec built a city in the clouds on the mountain known as Machu Picchu (“old mountain”). This extraordinary settlement lies halfway up the Andes Plateau, deep in the Amazon jungle and above the Urubamba River. It was probably abandoned by the Incas because of a smallpox. ",
                new Choice("Explore Peru",9),new Choice("Next wonder",3));
        mPages[3]= new Page(R.drawable.page3,"On the edge of the Arabian Desert, Petra was the glittering capital of the Nabataean empire of King Aretas .Masters of water technology, the Nabataeans provided their city with great tunnel constructions and water chambers. A theater, modelled on Greek-Roman prototypes, had space for an audience of 4,000.",
                new Choice("Explore Jordan",10),new Choice("Next wonder",4));
        mPages[4]= new Page(R.drawable.page4,"Chichén Itzá, the most famous Mayan temple city, served as the political and economic center of the Mayan civilization.The pyramid of Kukulkan, the Temple of Chac Mool, the Hall of the Thousand Pillars, and the Playing Field of the Prisoners can still be seen today and are demonstrative of an extraordinary commitment to architectural space. ",
                new Choice("Explore Mexico",11),new Choice("Next wonder",5));
        mPages[5]= new Page(R.drawable.page5,"This great amphitheater in the centre of Rome was built to give favors to successful legionnaires and to celebrate the glory of the Roman Empire. Its design concept still stands to this very day, and virtually every modern sports stadium some 2,000 years later still bears the irresistible imprint of the Colosseum’s original design.\n" +
                "\n",
                new Choice("Explore Itly",12),new Choice("Next wonder",6));
        mPages[6]= new Page(R.drawable.page6,"This immense mausoleum was built on the orders of Shah Jahan, the fifth Muslim Mogul emperor, to honor the memory of his beloved late wife. Built out of white marble and standing in formally laid-out walled gardens, the Taj Mahal is regarded as the most perfect jewel of Muslim art in India. ",
                new Choice("Explore India",13), new Choice("New Start",0));



        mPages[7]= new Page(R.drawable.page7,"Brazil, a vast South American country, stretches from the Amazon Basin in the north to vineyards and massive Iguaçu Falls in the south. The population of Brazil is 200.4 million (2013).The Official language is Portuguese and Currency is Brazilian rea. Brazil is the 5th largest country in the world by both land area and population",new Choice("Return",0),new Choice("Next wonders",1));
        mPages[8]=  new Page(R.drawable.page8,"China, a communist nation in East Asia, is the world’s most populous country. Its vast landscape encompasses grassland, desert, mountain ranges, lakes, rivers and 14,500km of coastline. The capital of China is Beijing. Xi jinping is the president of China. The population of China is 1.357 billion and currency is Renminbi",new Choice("Return",1),new Choice("Next wonders",2));
        mPages[9]=  new Page(R.drawable.page9,"Peru is a country in South America that's home to a section of Amazon rainforest and Machu Picchu, an ancient Incan city set high in the Andes mountains. The capital of Peru is Lima. Ollanta Humalais the president of Peru. The population of Peru is 1.357 billion and currency is Peruvian. The official languages are Spanish, Quechua and Aymara.",new Choice("Return",2),new Choice("Next wonders",3));
        mPages[10]=  new Page(R.drawable.page10,"Jordan, an Arab nation on the east bank of the Jordan River, is defined by ancient monuments, nature reserves and seaside resorts. . The capital of Jordan is Amman. Abdullah II of Jordan is king of Jordan. The population of Jordan is 6.459 million and currency is Dinar. The official language is Arabic."
                            ,new Choice("Return",3),new Choice("Next wonders",4));
        mPages[11]=  new Page(R.drawable.page11,"Mexico is a country between the U.S. and Central America that's known for its Pacific and Gulf of Mexico beaches and its diverse landscape of mountains, deserts and jungles. The capital of Mexico is Mexico city. Enrique Peña Nieto is the president of Mexico. The population of Mexico is 122.3 million and currency is Mexican peso.",new Choice("Return",4),new Choice("Next wonders",5));
        mPages[12]=  new Page(R.drawable.page12,"Italy, commanding a long Mediterranean coastline, has left a powerful mark on Western culture and cuisine. Its capital, Rome, is home to the Vatican as well as landmark art and ancient ruins.The official language is Italian.The president of Italy is Sergio Mattarella. Italy is said to have more masterpieces per square mile than any other country in the world. ",new Choice("Return",5),new Choice("Next wonders",6));
        mPages[13]=  new Page(R.drawable.page13,"India is a vast South Asian country with diverse terrain from Himalayan peaks to Indian Ocean coastline and history reaching back 5 millennia. New Delhi is the capital of India. The official language is Hindi and English. The prime minister of India is Narendra Modi.The population of India is 1.252 billion.");

    }

    public Page getPages(int numPages) {
        return mPages[numPages];
    }


}
