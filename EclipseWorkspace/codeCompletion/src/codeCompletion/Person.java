package codeCompletion;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Person {
	private String fName, mName, lName;
	private Date dob;
	
	public Person() {
		super();
	}
	
	public void evaluateAge() throws Exception {
		try {
			if (null == this.dob) {
				throw new Exception("dob field is null");
			} else {
				GregorianCalendar oldAgeCalendar = new GregorianCalendar(1900, Calendar.JANUARY, 1);
				Date oldAgeDate = oldAgeCalendar.getTime();
				/*Figuring out if the person is old or not*/
				if (this.dob.before(oldAgeDate)) {
					System.out.println("Getting kind of old");
					
				} else {
					System.out.println("Still got plenty of time");
				}
			}
		} catch (Exception e) {
			//Handle exception
			System.out.println("An error occurred");
		}
	}

	/**
	 * @return the fName
	 */
	public String getfName() {
		return fName;
	}

	/**
	 * @param fName the fName to set
	 */
	public void setfName(String fName) {
		this.fName = fName;
	}

	/**
	 * @return the mName
	 */
	public String getmName() {
		return mName;
	}

	/**
	 * @param mName the mName to set
	 */
	public void setmName(String mName) {
		this.mName = mName;
	}

	/**
	 * @return the lName
	 */
	public String getlName() {
		return lName;
	}

	/**
	 * @param lName the lName to set
	 */
	public void setlName(String lName) {
		this.lName = lName;
	}

	/**
	 * @return the dob
	 */
	public Date getDob() {
		return dob;
	}

	/**
	 * @param dob the dob to set
	 */
	public void setDob(Date dob) {
		this.dob = dob;
	}	
}
