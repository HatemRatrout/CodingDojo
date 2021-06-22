
public class Calculator {

    private double OperandOne;
    private double OperandTwo;
    private String Operation;
    private double result;

    public void setOperandOne(double OperandOne)
    {
        this.OperandOne=OperandOne;
    }
    public void setOperandTwo(double OperandTwo)
    {
        this.OperandTwo=OperandTwo;
    }
    public void setOperation(String Operation)
    {
        this.Operation=Operation;
    }

    public void performOperation()
    {
        if(this.Operation=="+")
        {
            this.result=this.OperandOne+this.OperandTwo;
        }
        else if(this.Operation=="-")
        {
            this.result=this.OperandOne-this.OperandTwo;
        }
    }

    public double getResults(){
        return this.result;
    }
}