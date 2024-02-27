package com.lms.library.models;

import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

/**
 * @author Ba'Hith BENON
 *
 */
@Entity
public class ModelLoan {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @ManyToOne
    private ModelBook book;
    
    @ManyToOne
    private ModelUser user;
    
    private Date loanDate;
    private Date returnDate;
    
	public ModelLoan(Long id, ModelBook book, ModelUser user, Date loanDate, Date returnDate) {
		super();
		this.id = id;
		this.book = book;
		this.user = user;
		this.loanDate = loanDate;
		this.returnDate = returnDate;
	}

	public ModelLoan() {
		super();
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the book
	 */
	public ModelBook getBook() {
		return book;
	}

	/**
	 * @param book the book to set
	 */
	public void setBook(ModelBook book) {
		this.book = book;
	}

	/**
	 * @return the user
	 */
	public ModelUser getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(ModelUser user) {
		this.user = user;
	}

	/**
	 * @return the loanDate
	 */
	public Date getLoanDate() {
		return loanDate;
	}

	/**
	 * @param loanDate the loanDate to set
	 */
	public void setLoanDate(Date loanDate) {
		this.loanDate = loanDate;
	}

	/**
	 * @return the returnDate
	 */
	public Date getReturnDate() {
		return returnDate;
	}

	/**
	 * @param returnDate the returnDate to set
	 */
	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(book, id, loanDate, returnDate, user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof ModelLoan)) {
			return false;
		}
		ModelLoan other = (ModelLoan) obj;
		return Objects.equals(book, other.book) && Objects.equals(id, other.id)
				&& Objects.equals(loanDate, other.loanDate) && Objects.equals(returnDate, other.returnDate)
				&& Objects.equals(user, other.user);
	}
	
}