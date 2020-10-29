/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema;

/**
 *
 * @author User
 */
public class Film {
       private String title;
       private String id_film;
       private int duration;
       
       public Film(String title, String id_film, int duration){
           this.title = title;
           this.id_film = id_film;
           this.duration = duration;
       }

    public String getTitle() {
        return title;
    }

    public String getId_film() {
        return id_film;
    }

    public int getDuration() {
        return duration;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId_film(String id_film) {
        this.id_film = id_film;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
       
       
}
