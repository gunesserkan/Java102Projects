public abstract class Address {
    public int id;
    public String name;
    public String city;
    public String district;
    public String neighbouthood;
    public String postCode;
    public String exactAddress;
    public static int count=0;

    public Address(String name, String city, String district, String neighbouthood, String postCode, String exactAddress) {
        this.id=++count;
        this.name = name;
        this.city = city;
        this.district = district;
        this.neighbouthood = neighbouthood;
        this.postCode = postCode;
        this.exactAddress = exactAddress;
        count++;
    }
    public static void setCount(int count) {
        Address.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getNeighbouthood() {
        return neighbouthood;
    }

    public void setNeighbouthood(String neighbouthood) {
        this.neighbouthood = neighbouthood;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getExactAddress() {
        return exactAddress;
    }

    public void setExactAddress(String exactAddress) {
        this.exactAddress = exactAddress;
    }
}
