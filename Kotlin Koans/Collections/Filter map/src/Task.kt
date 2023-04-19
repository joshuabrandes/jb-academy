// Find all the different cities the customers are from
fun Shop.getCustomerCities(): Set<City> =
        this.customers
                .map { customer -> customer.city }
                .distinct()
                .toSet()

// Find the customers living in a given city
fun Shop.getCustomersFrom(city: City): List<Customer> =
        this.customers
                .filter { customer -> customer.city == city }
