package home.Task_20;

import home.Task_20.models.*;

import java.util.List;

public class MyApiService {

    private static MyApiService instance;
    private MyRepository myRepository;

    private MyApiService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public static MyApiService getInstance(MyRepository myRepository) {
        if (instance == null) {
            instance = new MyApiService(myRepository);
        }
        return instance;
    }

    public List<Post> getPosts() {
        return myRepository.getPosts();
    }

    public List<Comment> getComments() {
        return myRepository.getComments();
    }

    public List<Album> getAlbums() {
        return myRepository.getAlbums();
    }

    public List<Photo> getPhotos() {
        return myRepository.getPhotos();
    }

    public List<User> getUsers() {
        return myRepository.getUsers();
    }

    public List<Todo> getTodos() {
        return myRepository.getTodos();
    }
}
