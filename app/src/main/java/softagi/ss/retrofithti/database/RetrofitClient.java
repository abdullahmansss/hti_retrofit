package softagi.ss.retrofithti.database;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import softagi.ss.retrofithti.models.PostsModel;
import softagi.ss.retrofithti.network.remote.RetrofitDao;

public class RetrofitClient
{
    private final static String BASE_URL = "https://2code.info/";
    private RetrofitDao retrofitDao;


    private static RetrofitClient retrofitClient;

    private RetrofitClient()
    {
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        retrofitDao = retrofit.create(RetrofitDao.class);
    }

    public static RetrofitClient getInstance()
    {
        if (retrofitClient == null)
        {
            retrofitClient = new RetrofitClient();
        }

        return retrofitClient;
    }

    public Call<PostsModel> getPosts(String post_type)
    {
        return retrofitDao.getPosts(post_type);
    }
}