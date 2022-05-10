package com.rakuten.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

enum CATEGORY {
	CYCLING, AEROBICS, YOGA, DANCING
}

@Entity
public class Workout {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer workid;
	private String worknote;
	private String worktitle;
	private float caloriesBurntPerMinute;

	@Enumerated(EnumType.STRING)
	private CATEGORY category;

	public Integer getId() {
		return workid;
	}

	public void setId(Integer id) {
		this.workid = id;
	}

	public String getNote() {
		return worknote;
	}

	public void setNote(String note) {
		this.worknote = note;
	}

	public String getTitle() {
		return worktitle;
	}

	public void setTitle(String title) {
		this.worktitle = title;
	}

	public float getCaloriesBurntPerMinute() {
		return caloriesBurntPerMinute;
	}

	public void setCaloriesBurntPerMinute(float caloriesBurntPerMinute) {
		this.caloriesBurntPerMinute = caloriesBurntPerMinute;
	}

	public CATEGORY getCategory() {
		return category;
	}

	public void setCategory(CATEGORY category) {
		this.category = category;
	}

}