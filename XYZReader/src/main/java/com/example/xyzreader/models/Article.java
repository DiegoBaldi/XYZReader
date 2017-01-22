package com.example.xyzreader.models;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by diego on 21/01/2017.
 */

public class Article implements Parcelable {
    private String id, server_id, title, author, body, thumb_url, photo_url, aspect_ratio, published_rate;

    public Article(String id, String title, String author, String body, String thumb_url, String photo_url, String aspect_ratio, String published_rate){
        this.id = id;
        this.title = title;
        this.author = author;
        this.body = body;
        this.thumb_url = thumb_url;
        this.photo_url = photo_url;
        this.aspect_ratio = aspect_ratio;
        this.published_rate = published_rate;
    }

    protected Article(Parcel in) {
        id = in.readString();
        server_id = in.readString();
        title = in.readString();
        author = in.readString();
        body = in.readString();
        thumb_url = in.readString();
        photo_url = in.readString();
        aspect_ratio = in.readString();
        published_rate = in.readString();
    }

    public static final Creator<Article> CREATOR = new Creator<Article>() {
        @Override
        public Article createFromParcel(Parcel in) {
            return new Article(in);
        }

        @Override
        public Article[] newArray(int size) {
            return new Article[size];
        }
    };

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServer_id() {
        return server_id;
    }

    public void setServer_id(String server_id) {
        this.server_id = server_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getThumb_url() {
        return thumb_url;
    }

    public void setThumb_url(String thumb_url) {
        this.thumb_url = thumb_url;
    }

    public String getPhoto_url() {
        return photo_url;
    }

    public void setPhoto_url(String photo_url) {
        this.photo_url = photo_url;
    }

    public String getAspect_ratio() {
        return aspect_ratio;
    }

    public void setAspect_ratio(String aspect_ratio) {
        this.aspect_ratio = aspect_ratio;
    }

    public String getPublished_rate() {
        return published_rate;
    }

    public void setPublished_rate(String published_rate) {
        this.published_rate = published_rate;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(server_id);
        dest.writeString(title);
        dest.writeString(author);
        dest.writeString(body);
        dest.writeString(thumb_url);
        dest.writeString(photo_url);
        dest.writeString(aspect_ratio);
        dest.writeString(published_rate);
    }
}
