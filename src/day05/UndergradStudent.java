package day05;
import java.util.Date;
/**
 * @author wanfeng
 * @created 2022/3/4 22:52
 * @package day05
 */
public class UndergradStudent extends AlgomaStudent implements Decrementable{
    private Integer yearLeft;

    public void setYearLeft(Integer yearLeft) {
        this.yearLeft = yearLeft;
    }

    public UndergradStudent(Integer yearLeft) {
        this.yearLeft = yearLeft;
    }

    public Integer getYearLeft() {
        return yearLeft;
    }

    @Override
    public Integer decrement() {
        return this.yearLeft -1;
    }

    public Integer courseLeft(){
        return this.yearLeft * 10;
    }

}
