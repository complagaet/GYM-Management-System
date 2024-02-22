<h1 align="center">GYM Management System</h1>
<p align="center">Authors: Lukoyanov Pavel, Amir Kairov, Aruzhan Zhuanysh, Maksat Sagyndyk, Dias Adilkhan</p>
<hr>

<style>
    .highlight {
        font-family: monospace;
        color: orange
    }
</style>

<h2>Menu.java</h2>
<h3>Menu handler, contains methods to manipulate the whole program by User.</h3>
<ul>
    <li><span class="highlight">public void start()</span> - method that starts the main menu of the program.</li>
</ul>

<h2>Service.java</h2>
<h3>Service class to manage coaches and clients in the gym.</h3>
<p>This class provides methods to add coaches and clients to the gym database.</p>
<ul>
    <li><span class="highlight">private final Database db</span> - instance of the database to interact with.</li>
    <li><span class="highlight">private final List&lt;Person&gt; people</span> - list to store people (coaches and clients).</li>
    <li><span class="highlight">public void addCoach(String fullName, String phoneNumber, int age, String gender, String field, String schedule) throws SQLException</span> - Adds a new coach to the gym database.</li>
    <li><span class="highlight">public void addClient(String fullName, String phoneNumber, int age, String gender, String coach, String tariff, String expirationDate, boolean isAllowed) throws SQLException</span> - Adds a new client to the gym database.</li>
</ul>

<h2>Person.java</h2>
<h3>Person class representing a person in the gym.</h3>
<p>This class stores information about a person including their full name, phone number, age, and gender.</p>
<ul>
    <li><span class="highlight">private String fullName</span> - full name of the person.</li>
    <li><span class="highlight">private String phoneNumber</span> - phone number of the person.</li>
    <li><span class="highlight">private int age</span> - age of the person.</li>
    <li><span class="highlight">private String gender</span> - gender of the person.</li>
    <li><span class="highlight">public Person(String fullName, String phoneNumber, int age, String gender)</span> - constructor to create a new person with the specified information.</li>
    <li><span class="highlight">public String getFullName()</span> - returns the full name of the person.</li>
    <li><span class="highlight">public void setFullName(String fullName)</span> - sets the full name of the person.</li>
    <li><span class="highlight">public String getPhoneNumber()</span> - returns the phone number of the person.</li>
    <li><span class="highlight">public void setPhoneNumber(String phoneNumber)</span> - sets the phone number of the person.</li>
    <li><span class="highlight">public int getAge()</span> - returns the age of the person.</li>
    <li><span class="highlight">public void setAge(int age)</span> - sets the age of the person.</li>
    <li><span class="highlight">public String getGender()</span> - returns the gender of the person.</li>
    <li><span class="highlight">public void setGender(String gender)</span> - sets the gender of the person.</li>
    <li><span class="highlight">public String toString()</span> - returns a string representation of the person.</li>
</ul>

<h2>Client.java</h2>
<h3>Client class representing a client in the gym.</h3>
<p>This class extends the Person class and adds additional fields specific to clients such as coach, tariff, expiration date, and permission status.</p>
<ul>
    <li><span class="highlight">private String coach</span> - coach assigned to the client.</li>
    <li><span class="highlight">private String tariff</span> - tariff plan of the client.</li>
    <li><span class="highlight">private String expirationDate</span> - expiration date of the client's membership.</li>
    <li><span class="highlight">private boolean isAllowed</span> - status indicating whether the client is allowed to access the gym.</li>
    <li><span class="highlight">public Client(String fullName, String phoneNumber, int age, String gender, String coach, String tariff, String expirationDate, boolean isAllowed)</span> - constructor to create a new client with the specified information.</li>
    <li><span class="highlight">public String getCoach()</span> - returns the coach assigned to the client.</li>
    <li><span class="highlight">public void setCoach(String coach)</span> - sets the coach assigned to the client.</li>
    <li><span class="highlight">public String getTariff()</span> - returns the tariff plan of the client.</li>
    <li><span class="highlight">public void setTariff(String tariff)</span> - sets the tariff plan of the client.</li>
    <li><span class="highlight">public String getExpirationDate()</span> - returns the expiration date of the client's membership.</li>
    <li><span class="highlight">public void setExpirationDate(String expirationDate)</span> - sets the expiration date of the client's membership.</li>
    <li><span class="highlight">public boolean isAllowed()</span> - returns true if the client is allowed to access the gym, false otherwise.</li>
    <li><span class="highlight">public void setAllowed(boolean allowed)</span> - sets the permission status of the client.</li>
    <li><span class="highlight">@Override<br>public String toString()</span> - returns a string representation of the client.</li>
</ul>

<h2>Coach.java</h2>
<h3>Coach class representing a coach in the gym.</h3>
<p>This class extends the Person class and adds additional fields specific to coaches such as field of expertise and schedule. It also contains a list of clients assigned to the coach.</p>
<ul>
    <li><span class="highlight">private String field</span> - field of expertise of the coach.</li>
    <li><span class="highlight">private String schedule</span> - schedule of the coach.</li>
    <li><span class="highlight">private List&lt;Client&gt; clients</span> - list of clients assigned to the coach.</li>
    <li><span class="highlight">public Coach(String fullName, String phoneNumber, int age, String gender, String field, String schedule)</span> - constructor to create a new coach with the specified information.</li>
    <li><span class="highlight">public String getField()</span> - returns the field of expertise of the coach.</li>
    <li><span class="highlight">public void setField(String field)</span> - sets the field of expertise of the coach.</li>
    <li><span class="highlight">public String getSchedule()</span> - returns the schedule of the coach.</li>
    <li><span class="highlight">public void setSchedule(String schedule)</span> - sets the schedule of the coach.</li>
    <li><span class="highlight">public List&lt;Client&gt; getClients()</span> - returns the list of clients assigned to the coach.</li>
    <li><span class="highlight">public void addClient(Client client)</span> - adds a client to the list of clients assigned to the coach.</li>
    <li><span class="highlight">public void removeClient(Client client)</span> - removes a client from the list of clients assigned to the coach.</li>
    <li><span class="highlight">@Override<br>public String toString()</span> - returns a string representation of the coach.</li>
</ul>

<h2>Expenses.java</h2>
<h3>Expenses class representing the expenses of the gym.</h3>
<p>This class stores information about the various expenses incurred by the gym, including salary, utilities, rent, and equipment costs.</p>
<ul>
    <li><span class="highlight">private double salary</span> - salary expenses of the gym.</li>
    <li><span class="highlight">private double utilities</span> - utilities expenses of the gym.</li>
    <li><span class="highlight">private double rent</span> - rent expenses of the gym.</li>
    <li><span class="highlight">private double equipment</span> - equipment expenses of the gym.</li>
    <li><span class="highlight">public Expenses(double salary, double utilities, double rent, double equipment)</span> - constructor to create a new instance of expenses with the specified information.</li>
    <li><span class="highlight">public double getSalary()</span> - returns the salary expenses of the gym.</li>
    <li><span class="highlight">public void setSalary(double salary)</span> - sets the salary expenses of the gym.</li>
    <li><span class="highlight">public double getUtilities()</span> - returns the utilities expenses of the gym.</li>
    <li><span class="highlight">public void setUtilities(double utilities)</span> - sets the utilities expenses of the gym.</li>
    <li><span class="highlight">public double getRent()</span> - returns the rent expenses of the gym.</li>
    <li><span class="highlight">public void setRent(double rent)</span> - sets the rent expenses of the gym.</li>
    <li><span class="highlight">public double getEquipment()</span> - returns the equipment expenses of the gym.</li>
    <li><span class="highlight">public void setEquipment(double equipment)</span> - sets the equipment expenses of the gym.</li>
    <li><span class="highlight">@Override<br>public String toString()</span> - returns a string representation of the expenses.</li>
</ul>

<h2>Database.java</h2>
<h3>Database class for interacting with a SQL database.</h3>
<p>This class provides methods for initializing a connection to a database, saving data, loading data, displaying result sets, and closing the connection.</p>
<ul>
    <li><span class="highlight">private Connection connection</span> - connection object for the database.</li>
    <li><span class="highlight">private final String url</span> - URL of the database.</li>
    <li><span class="highlight">private final String user</span> - username for accessing the database.</li>
    <li><span class="highlight">private final String password</span> - password for accessing the database.</li>
    <li><span class="highlight">public Database(String url, String user, String password)</span> - constructor to create a new instance of the Database class with the specified connection details.</li>
    <li><span class="highlight">public void init()</span> - initializes the database connection.</li>
    <li><span class="highlight">public void save(String tableName, String[] columns, String[] values)</span> - saves data to the specified table in the database.</li>
    <li><span class="highlight">public ResultSet load(String tableName, String[] columns)</span> - loads data from the specified table in the database and returns a ResultSet.</li>
    <li><span class="highlight">public void displayResultSet(ResultSet resultSet)</span> - displays the contents of a ResultSet.</li>
    <li><span class="highlight">public void close()</span> - closes the database connection.</li>
</ul>

