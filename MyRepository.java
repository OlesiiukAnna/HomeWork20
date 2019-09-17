package home.Task_20;

import home.Task_20.models.*;

import java.util.List;

public interface MyRepository {
    List<Post> getPosts();

    List<Comment> getComments();

    List<Album> getAlbums();

    List<Photo> getPhotos();

    List<User> getUsers();

    List<Todo> getTodos();
}
