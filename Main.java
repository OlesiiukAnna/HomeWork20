package home.Task_20;

import home.Task_20.models.*;

public class Main {

    public static void main(String[] args) {

        MyRepository myRepository = new RemoteRepository();
        MyApiService service = MyApiService.getInstance(myRepository);

        for (Post post : service.getPosts()) {
            System.out.println(post);
        }

        for (Comment comment : service.getComments()) {
            System.out.println(comment);
        }

        for (Album album : service.getAlbums()) {
            System.out.println(album);
        }

        for (Photo photo : service.getPhotos()) {
            System.out.println(photo);
        }

        for (User user : service.getUsers()) {
            System.out.println(user);
        }

        for (Todo todo : service.getTodos()) {
            System.out.println(todo);
        }

    }
}
