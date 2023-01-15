package com.revature;

import com.fasterxml.jackson.databind.ObjectMapper;

import io.javalin.Javalin;

/**
 * Background: A json string representing a song will be sent in this POST request with the following fields: 
 *      songName, artistName
 */
public class JavalinSingleton {

    public static Javalin getInstance(){
        Javalin app = Javalin.create();
        
        /**
         * problem1: retrieve the song object from the request body and return the artist name.
         * 
         * Note: Please refer to the "RequestBody.MD" file for more assistance if needed.
         */
        app.post("/problem1", ctx -> {
                String jsonString= ctx.body();
                ObjectMapper objMap = new ObjectMapper();
                Song problem1 = objMap.readValue(jsonString, Song.class);
                // ctx.contentType("application/Json");
                
                // String backToString=objMap.writeValueAsString(problem1);

                String getProblem1= problem1.getArtistName();

                ctx.result(getProblem1);

                

               
                
        });

        /**
         * problem2: retrieve the song object from the request body...
         *      1. update the artist in the song object to "Beatles"
         *      2. return the updated song object in the response body
         * 
         * Note: Please refer to the "RequestBody.MD" file for more assistance if needed.
         */
        app.post("/problem2", ctx -> {
            String jsonString2= ctx.body();
            ObjectMapper objMap2 = new ObjectMapper();
            Song problem2 = objMap2.readValue(jsonString2, Song.class);

            ctx.contentType("application/Json");

            problem2.setArtistName("Beatles");

            String convertString = objMap2.writeValueAsString(problem2);

            ctx.result(convertString);
        });


        return app;
    }
    
}
