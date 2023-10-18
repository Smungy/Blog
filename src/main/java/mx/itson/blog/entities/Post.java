/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.blog.entities;


import java.time.ZonedDateTime;



/**
 *
 * @author Jesus Alan
 */
public class Post {
    private String title;
    private User user;
    private ZonedDateTime date;
    private Category category;
    private String description;
    private Comments comments;
    private int Positive;
    private int Negative;
    private String image;

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param user the user to set
     */
    public void setUser(User user) {
        this.user = user;
    }
    

    /**
     * @return the date
     */
    public ZonedDateTime getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(ZonedDateTime date) {
        this.date = date;
    }

    /**
     * @return the category
     */
    public Category getCategory() {
        return category;
    }

    /**
     * @param category the category to set
     */
    public void setCategory(Category category) {
        this.category = category;
    }

    /**
     * @return the comments
     */
    public Comments getComments() {
        return comments;
    }

    /**
     * @param comments the comments to set
     */
    public void setComments(Comments comments) {
        this.comments = comments;
    }

    /**
     * @return the Positive
     */
    public int getPositive() {
        return Positive;
    }

    /**
     * @param Positive the Positive to set
     */
    public void setPositive(int Positive) {
        this.Positive = Positive;
    }

    /**
     * @return the Negative
     */
    public int getNegative() {
        return Negative;
    }

    /**
     * @param Negative the Negative to set
     */
    public void setNegative(int Negative) {
        this.Negative = Negative;
    }

    /**
     * @return the image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(String image) {
        this.image = image;
    }
    
    
    
    
    
}
