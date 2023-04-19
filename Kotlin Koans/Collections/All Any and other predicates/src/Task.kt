// Return true if all customers are from a given city
fun Shop.checkAllCustomersAreFrom(city: City): Boolean =
        this.customers
                .all { customer -> customer.city == city }

// Return true if there is at least one customer from a given city
fun Shop.hasCustomerFrom(city: City): Boolean =
        this.customers
                .any { customer -> customer.city == city }

// Return the number of customers from a given city
fun Shop.countCustomersFrom(city: City): Int =
        this.customers
                .filter { customer -> customer.city == city }
                .count()

// Return a customer who lives in a given city, or null if there is none
fun Shop.findCustomerFrom(city: City): Customer? =
        this.customers
                .find { customer -> customer.city == city }
