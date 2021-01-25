package squash.tfauto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.squashtest.ta.galaxia.tf.param.service.TFParamService;

public class CalculatorTest {

    int var1;
    int var2;
    int res;

    @Test
    @DisplayName("Addition")
    public void add(){
        var1 = Integer.parseInt(TFParamService.getInstance().getParam("DS_VAR1"));
        var2 = Integer.parseInt(TFParamService.getInstance().getParam("DS_VAR2"));
        res = Integer.parseInt(TFParamService.getInstance().getParam("DS_RES"));

        Assertions.assertTrue((var1+var2)==res, "Le résultat du calcul est incorrect.");
    }

    @Test
    public void mult(){
        var1 = Integer.parseInt(TFParamService.getInstance().getParam("DS_VAR1"));
        var2 = Integer.parseInt(TFParamService.getInstance().getParam("DS_VAR2"));
        res = Integer.parseInt(TFParamService.getInstance().getParam("DS_RES"));
        Assertions.assertTrue((var1*var2)==res, "Le résultat du calcul est incorrect.");
    }

}
