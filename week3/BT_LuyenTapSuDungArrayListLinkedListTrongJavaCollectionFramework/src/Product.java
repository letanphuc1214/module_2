public class Product {
    public String name;
    public int id;
    public int gia;

    public Product(String name, int id, int gia){
        this.name = name;
        this.id = id;
        this.gia = gia;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "Product: id = " + id +
                ", name = " + name +
                ", gia = " + gia;
    }
}
