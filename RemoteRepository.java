package home.Task_20;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import home.Task_20.models.*;

import java.lang.reflect.Type;
import java.util.List;

public class RemoteRepository implements MyRepository {

    private Gson gson = new Gson();

    @Override
    public List<Post> getPosts() {
        String jsonOutput = sendRequest("posts");
        Type listType = new TypeToken<List<Post>>(){}.getType();
        return gson.fromJson(jsonOutput, listType);
    }

    @Override
    public List<Comment> getComments() {
        String jsonOutput = sendRequest("comments");
        Type listType = new TypeToken<List<Comment>>(){}.getType();
        return gson.fromJson(jsonOutput, listType);
    }

    @Override
    public List<Album> getAlbums() {
        String jsonOutput = sendRequest("albums");
        Type listType = new TypeToken<List<Album>>(){}.getType();
        return gson.fromJson(jsonOutput, listType);
    }

    @Override
    public List<Photo> getPhotos() {
        String jsonOutput = sendRequest("photos");
        Type listType = new TypeToken<List<Photo>>(){}.getType();
        return gson.fromJson(jsonOutput, listType);
    }

    @Override
    public List<User> getUsers() {
        String jsonOutput = sendRequest("users");
        Type listType = new TypeToken<List<User>>(){}.getType();
        return gson.fromJson(jsonOutput, listType);
    }

    @Override
    public List<Todo> getTodos() {
        String jsonOutput = sendRequest("todos");
        Type listType = new TypeToken<List<Todo>>(){}.getType();
        return gson.fromJson(jsonOutput, listType);
    }

    private String sendRequest(String urlSuffix) {
        String url = "https://jsonplaceholder.typicode.com/" + urlSuffix;
        return HttpUtil.sendRequest(url, null, null);
    }
}
