
public class Address
{
    private String name;
    private String street;
    private String city;
    private String state;
    private String zip;
    
    public Address(String aName, String aStreet, String aCity, String aState, String aZip)
    {
        name = aName;
        street = aStreet;
        city = aCity;
        state = aState;
        zip = aZip;
    }

    public String format()
    {
        return name + street + city + state + zip;
    }
}
