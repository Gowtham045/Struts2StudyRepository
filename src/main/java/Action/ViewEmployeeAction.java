package Action;

import Model.Employee;
import java.util.*;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.chain.Catalog;
import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;

public class ViewEmployeeAction extends ActionSupport {

    Context context=null;
    private List<Employee>  employeeList=null;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private String name;
    private float price;
    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }


    public Context getContext() {
        if(context==null)
        return new AtmRequestContext();
        else return context;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    public String execute() throws Exception {
        System.out.println(this.getId()+"--"+this.getName());
        context = this.getContext();
        context.put("totalAmountToBeWithdrawn", 460);
        context.put("amountLeftToBeWithdrawn", 460);

        Catalog catalog = new AtmCatalog();
        Command atmWithdrawalChain = catalog.getCommand("atmWithdrawalChain");

        atmWithdrawalChain.execute(context);
        System.out.println(context.get("totalAmountToBeWithdrawn"));
        System.out.println(context.get("amountLeftToBeWithdrawn"));
        System.out.println(context.get("noOfHundredsDispensed"));
        System.out.println(context.get("noOfFiftiesDispensed"));
        System.out.println(context.get("noOfTensDispensed"));
//        assertEquals(460, (int) context.get("totalAmountToBeWithdrawn"));
//        assertEquals(0, (int) context.get("amountLeftToBeWithdrawn"));
//        assertEquals(4, (int) context.get("noOfHundredsDispensed"));
//        assertEquals(1, (int) context.get("noOfFiftiesDispensed"));
//        assertEquals(1, (int) context.get("noOfTensDispensed"));

       return "success";
    }
}
