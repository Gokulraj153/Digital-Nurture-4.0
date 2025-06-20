public class CustomerService {
    private CustomerRepository customerRepository;


    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void displayCustomer(String customerId) {
        Customer customer = customerRepository.findCustomerById(customerId);
        System.out.println("Customer ID: " + customer.getId());
        System.out.println("Customer Name: " + customer.getName());
    }
}