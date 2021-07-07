package case_study.serivce.interface_all;

import case_study.model.people.Customer;

import java.util.List;

public interface CustomerService extends Service {
    List<Customer> getAll();
}
