package decorator;

public class DataSourceDecorator implements DataSource{
    protected DataSource dataSource;

    public DataSourceDecorator(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    
    public void writeData(String data) {}
    public String readData() {return "";}
}
