package org.academiadecodigo.javabank.controller;

public class testes {

    /*Spring Command Objects
    Command objects (or form objects, form-backing objects) allow binding of form request parameters to bean properties using setters

    The th:object attribute inside a <form> tag tells thymeleaf which command object to bind to the form
    The th:field attribute attached to an html input field binds the specific field to the command object property*/


    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/

    /*<form th:object="${customer}" th:action="@{/customer}" method="post">
    <input type="text" th:field="*{firstName}"/>
    </form>*/


    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/

    /*Thymeleaf Expressions
    Thymeleaf attributes have their values set by using
    one of the following expression syntax:

    ${…} Variable Expressions - Access to model data
    *{…} Selection Variable Expressions - Access properties of previously selected objects
    @{…} Link URL Expressions - Absolute or relative URLs
    #{…} Message Expressions - Access messages from resource bundles (eg: properties files with multiple langs)*/


    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/


    /*Spring Redirects
    To implement PRG the controller handling the request
    needs to redirect the browser to another URL:*/

    /*@Controller
    @RequestMapping("/customer")
    public class CustomerController {

        @RequestMapping(method = RequestMethod.GET, path = "/{id}")
        public String showCustomer(@PathVariable Integer id, Model model) {
            model.addAttribute("customer", customerService.get(id));
            return "customer/show";
        }

        @RequestMapping(method = RequestMethod.POST, value = "/add")
        public String addCustomer(@ModelAttribute Customer customer) {

            Customer savedCustomer = customerService.save(customer);

            // Instead of returning a rendered view to the browser,
            // a 302 redirect is sent to the browser, forcing showCustomer()
            // to execute after adding a new customer
            return "redirect:/customer/" + savedCustomer.getId();
        }
    }*/


    /*<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<*/

   /* Flash Attributes
    When redirecting a request, data stored in the original request is lost, making it impossible to the controller handling the
    redirected request to access the parameters contained in the original one

    PRG solves multiple form submissions but prevents retrieving request parameters and attributes
    Flash attributes provide a way for one request to store attributes intended for use in another request*/

    /*@Controller
    @RequestMapping("customer")
    public class CustomerController {

        @RequestMapping(method = RequestMethod.GET, path = {"/list", "/", ""})
        public String listCustomers(Model model) {
            model.addAttribute("customers", customerService.list());
            return "customer/list";
        }

        @RequestMapping(method = RequestMethod.POST, path = {"/", ""})
        public String saveCustomer(@ModelAttribute CustomerDto customerDto, RedirectAttributes redirectAttributes) {

            Customer savedCustomer = customerService.save(customer);
            redirectAttributes.addFlashAttribute("lastAction", "Added customer successfully!");
            return "redirect:/customer/list";

        }
    }*/


}
