package softagi.ss.retrofithti.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import softagi.ss.retrofithti.R;
import softagi.ss.retrofithti.database.RetrofitClient;
import softagi.ss.retrofithti.models.PostsModel;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initRetrofit();
    }

    private void initRetrofit()
    {
        Call<PostsModel> call = RetrofitClient.getInstance().getPosts("question");

        call.enqueue(new Callback<PostsModel>()
        {
            @Override
            public void onResponse(Call<PostsModel> call, Response<PostsModel> response)
            {
                if(response.isSuccessful() && response.code() == 200)
                {
                    PostsModel postsModel = response.body();
                    Toast.makeText(MainActivity.this, postsModel.getPosts().size() + "", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<PostsModel> call, Throwable t)
            {
                Toast.makeText(MainActivity.this, t.getMessage(), Toast.LENGTH_SHORT).show();
            }
        });
    }
}