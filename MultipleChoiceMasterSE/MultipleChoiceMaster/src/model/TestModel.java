package model;

import java.lang.Boolean;

public class TestModel {
	public enum Language {
		DE,
		EN,
		FR;
		
		public String toString() 
		{
			String result="";
			switch(this) 
			{
		      case DE: return "DE";
		      case EN: return "EN";
		      case FR: return "FR";
			}
			return result; 
		}
	}
	
	private String Testname;
	private int Duration;
	private Language language;
	private String Author;
	private String Source;
    private Boolean Copyright;
    private String Description;
	public String getTestname() {
		return Testname;
	}
	public void setTestname(String testname) {
		Testname = testname;
	}
	public int getDuration() {
		return Duration;
	}
	public void setDuration(int duration) {
		Duration = duration;
	}
	public Language getLanguage() {
		return language;
	}
	public void setLanguage(Language language) {
		this.language = language;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public String getSource() {
		return Source;
	}
	public void setSource(String source) {
		Source = source;
	}
	public Boolean getCopyright() {
		return Copyright;
	}
	public void setCopyright(Boolean copyright) {
		Copyright = copyright;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	public void dump()
	{
		System.out.println("Testname="+Testname);
		
		System.out.print("Duration=");
		System.out.println(Duration);
		
		System.out.print("Language=");
		if (language.equals(Language.DE))
		{
			System.out.println("DE");
		}
		else if (language.equals(Language.EN))
		{
			System.out.println("EN");
		}
				
		System.out.println("Author="+Author);
		System.out.println("Source="+Source);
		System.out.println("Copyright="+Copyright);
	    System.out.println("Description="+Description);
	}
    
}
