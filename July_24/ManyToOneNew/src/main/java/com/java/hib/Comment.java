package com.java.hib;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;


@Entity
@Table(name="comments")
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	  private Long id;

	  @Lob
	  private String content;

	//  @ManyToOne(fetch = FetchType.EAGER, optional = false)
	  @ManyToOne(fetch = FetchType.LAZY, optional = false)
	  @JoinColumn(name = "tutorial_id", nullable = false)
	  @OnDelete(action = OnDeleteAction.CASCADE)
	  private Tutorial tutorial;

	  public Long getId() {
	    return id;
	  }

	  public String getContent() {
	    return content;
	  }

	  public void setContent(String content) {
	    this.content = content;
	  }

	  public Tutorial getTutorial() {
	    return tutorial;
	  }

	  public void setTutorial(Tutorial tutorial) {
	    this.tutorial = tutorial;
	  }

}
