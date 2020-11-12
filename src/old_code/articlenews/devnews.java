package se.novare.article.news.articles;

import javax.persistence.*;
import java.util.Objects;

public class devnews {
  @Id
  @Column(name = "id")
  private Long id;

  @Column(name = "title")
  private String title;
  @Column(name = "body")
  private String body;
  @Column(name = "authorName")
  private String authorName;

  public devnews(Long id, String title, String body, String authorName) {
    this.id = id;
    this.title = title;
    this.body = body;
    this.authorName = authorName;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public String getAuthorName() {
    return authorName;
  }

  public void setAuthorName(String authorName) {
    this.authorName = authorName;
  }

  @Override
  public String toString() {
    return "devnews{" +
            "id=" + id +
            ", title='" + title + '\'' +
            ", body='" + body + '\'' +
            ", authorName='" + authorName + '\'' +
            '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof devnews)) return false;
    devnews devnews = (devnews) o;
    return Objects.equals(id, devnews.id) &&
            Objects.equals(title, devnews.title) &&
            Objects.equals(body, devnews.body) &&
            Objects.equals(authorName, devnews.authorName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, title, body, authorName);
  }
}
