/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package mx.itson.blog.ui;

import java.time.ZonedDateTime;
import mx.itson.blog.entities.Category;
import mx.itson.blog.entities.Comments;
import mx.itson.blog.entities.Post;
import mx.itson.blog.entities.User;

/**
 *
 * @author Jesus Alan
 */
public class MainBlog {

    public static void main(String[] args) {
        
        User user= new User();
        user.setName("Jesus Alan");
        user.setEmail("jesus.alan@gmail.com");
        user.setPassword("12345678@");
        
        User user2= new User();
        user2.setName("Juanito");
        user2.setEmail("juanito777@gmail.com");
        user2.setPassword("12345678@");
        
        User user3= new User();
        user3.setName("Pablito");
        user3.setEmail("pablitopro@gmail.com");
        user3.setPassword("12345678@");
        
        Category category= new Category();
        category.setCategory("Tecnolgía");
        
        Comments c2 = new Comments();
        c2.setUser(user2);
        c2.setDescription("Muy buen post");
        ZonedDateTime datec2 = ZonedDateTime.now();
        c2.setDate(datec2);
        
        Comments c3 = new Comments();
        c3.setUser(user3);
        c3.setDescription("Creo que le falto mas inforamción");
        ZonedDateTime datec3 = ZonedDateTime.now();
        c3.setDate(datec3);
        
                
        
        Post post = new Post();
        post.setTitle("La IA");
        post.setUser(user);
        post.setCategory(category);
        ZonedDateTime date = ZonedDateTime.now();
        post.setDate(date);
        post.setDescription("La Inteligencia Artificial (IA) es la combinación de algoritmos planteados con el propósito de crear\n" 
                + "máquinas que presenten las mismas capacidades que el ser humano. Una tecnología que todavía nos resulta \n"
                + " lejana y misteriosa, pero que desde hace unos años está presente en nuestro día a día a todas horas.\n");
        post.setImage("https://www.mundodeportivo.com/urbantecno/hero/2023/03/imagen-creada-por-ia-de-un-robot-con-un-cerebro-digital.jpg?width=1200");
        post.setUser(user2);
        post.setComments(c2);
        post.setPositive(1);
        post.setUser(user3);
        post.setComments(c3);
        post.setNegative(1);
        
        
        System.out.println("\t\t\t\t\t Título: " + post.getTitle());
        System.out.println("\t\t\t\t\t Usuario: " + user.getName());
        System.out.println("\t\t\t\t\t Categoria: " + category.getCategory());
        System.out.println("--------------------------------------------------------------------------------------------------------\n");
        System.out.println("\t\t\t\t\t Que es la IA?: \n" + post.getDescription());
        System.out.println("--------------------------------------------------------------------------------------------------------\n");
        System.out.println("Comentarios: \n");
        System.out.println(user2.getName() + ": " + c2.getDescription());
        System.out.println("Correo: " + user2.getEmail());
        System.out.println("Fecha: " + c2.getDate());
        System.out.println("--------------------------------------------------------------------------------------------------------");
        System.out.println(user3.getName() + ": " + c3.getDescription());
        System.out.println("Correo: " + user3.getEmail());
        System.out.println("Fecha: " + c3.getDate());
        System.out.println("--------------------------------------------------------------------------------------------------------\n");
        System.out.println("Likes: " + post.getPositive() + " Dislikes: " + post.getNegative());
        System.out.println("--------------------------------------------------------------------------------------------------------\n");
        System.out.println("\t\t\t\t\t Fecha de publicación: ");
        System.out.println("\t\t\t" + post.getDate());
        System.out.println("\t\t\t\t\t Correo de contacto: ");
        System.out.println("\t\t\t\t\t" + user.getEmail());
        System.out.println("Imagen URL: " + post.getImage());
        
        
    }
}
