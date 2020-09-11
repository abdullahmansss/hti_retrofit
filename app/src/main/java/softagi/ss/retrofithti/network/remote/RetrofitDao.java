package softagi.ss.retrofithti.network.remote;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;
import softagi.ss.retrofithti.models.PostsModel;

public interface RetrofitDao
{
    @GET("demo/themes/Discy/Boxed/api/get_recent_posts")
    Call<PostsModel> getPosts(
            @Query("post_type") String post_type
    );
}