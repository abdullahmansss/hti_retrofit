package softagi.ss.retrofithti.models;

import java.util.List;

public class PostsModel
{
    private boolean status;
    private int count;
    private int count_total;
    private int pages;
    private List<PostsDetailsModel> posts;

    public PostsModel(boolean status, int count, int count_total, int pages, List<PostsDetailsModel> posts) {
        this.status = status;
        this.count = count;
        this.count_total = count_total;
        this.pages = pages;
        this.posts = posts;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCount_total() {
        return count_total;
    }

    public void setCount_total(int count_total) {
        this.count_total = count_total;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public List<PostsDetailsModel> getPosts() {
        return posts;
    }

    public void setPosts(List<PostsDetailsModel> posts) {
        this.posts = posts;
    }

    public class PostsDetailsModel
    {
        private int id;
        private String title;
        private String content;
        private String date;

        public PostsDetailsModel(int id, String title, String content, String date) {
            this.id = id;
            this.title = title;
            this.content = content;
            this.date = date;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }
    }
}