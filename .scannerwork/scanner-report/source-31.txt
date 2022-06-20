package com.example.progettoesame;

import java.util.List;

public class AlphabeticalSort {
    private AlphabeticalSort(){

    }
    /**
     * il metodo sort fa il sorting alfabetico nella maniera più generale possibile
     * essendo anche case sensitive la lista ["B", "A", "c", "a"] viene riordinata
     * nella lista ["A", "B", "a", "c"]
     */
    public static void sort(List<String> givenNamesList){
        String myTempString;
        for (int startPtr = 0; startPtr < givenNamesList.size(); startPtr++) {
            for (int endPtr = startPtr + 1; endPtr < givenNamesList.size(); endPtr++){
                if(givenNamesList.get(startPtr).compareTo(givenNamesList.get(endPtr)) > 0){
                    myTempString = givenNamesList.get(endPtr);
                    givenNamesList.set(endPtr,givenNamesList.get(startPtr));
                    givenNamesList.set(startPtr,myTempString);
                }
            }
        }
    }


}