package model;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.ObservableMap;

public class PersonModel
{
	StringProperty  name = new SimpleStringProperty();
	StringProperty  email = new SimpleStringProperty();
	StringProperty  pronouns = new SimpleStringProperty();
	StringProperty phone = new SimpleStringProperty();
	StringProperty  id = new SimpleStringProperty();
	StringProperty  description= new SimpleStringProperty();
	ObservableList<String> external_links= FXCollections.observableArrayList();
	ObservableMap<String, ObservableList<String>> page_links = FXCollections.observableHashMap();
	/**
	 * @param name
	 * @param email
	 * @param pronoun
	 * @param phone
	 * @param id
	 * @param description
	 * @param external_links
	 * @param page_links
	 */
	public PersonModel(StringProperty name, StringProperty email, StringProperty pronouns, StringProperty phone,
			StringProperty id, StringProperty description, ObservableList<String> external_links,
			ObservableMap<String, ObservableList<String>> page_links)
	{
		super();
		this.name = name;
		this.email = email;
		this.pronouns = pronouns;
		this.phone = phone;
		this.id = id;
		this.description = description;
		this.external_links = external_links;
		this.page_links = page_links;
	}
	public PersonModel() {
		this.name = new SimpleStringProperty();
		this.description.set("John Doe");
		
		this.email = new SimpleStringProperty();
		this.email.set("johndoent@gmail.com");
		
		this.pronouns = new SimpleStringProperty();
		this.pronouns.set("he/him");
		
		this.phone = new SimpleStringProperty();
		this.phone.set("333-333-4444");

		this.id = new SimpleStringProperty();
		this.description.set("25");
		
		this.description = new SimpleStringProperty();
		this.description.set("Hi yes this is a John Doe description");
		
		this.external_links = FXCollections.observableArrayList();
		this.external_links.add("github.com");
		this.external_links.add("linkedin.com");
		
		this.page_links = FXCollections.emptyObservableMap();
	}
	/**
	 * @return the name
	 */
	public StringProperty getName()
	{
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(StringProperty name)
	{
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public StringProperty getEmail()
	{
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(StringProperty email)
	{
		this.email = email;
	}
	/**
	 * @return the pronoun
	 */
	public StringProperty getPronouns()
	{
		return pronouns;
	}
	/**
	 * @param pronoun the pronoun to set
	 */
	public void setPronouns(StringProperty pronouns)
	{
		this.pronouns = pronouns;
	}
	/**
	 * @return the phone
	 */
	public StringProperty getPhone()
	{
		return phone;
	}
	/**
	 * @param phone the phone to set
	 */
	public void setPhone(StringProperty phone)
	{
		this.phone = phone;
	}
	/**
	 * @return the id
	 */
	public StringProperty getId()
	{
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(StringProperty id)
	{
		this.id = id;
	}
	/**
	 * @return the description
	 */
	public StringProperty getDescription()
	{
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(StringProperty description)
	{
		this.description = description;
	}
	/**
	 * @return the external_links
	 */
	public ObservableList<String> getExternal_links()
	{
		return external_links;
	}
	
	
	/**
	 * @return the page_links
	 */
	public ObservableMap<String, ObservableList<String>> getPage_links()
	{
		return page_links;
	}
	
	
	
	
}
