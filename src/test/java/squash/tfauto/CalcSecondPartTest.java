package squash.tfauto;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.squashtest.ta.galaxia.tf.param.service.TFParamService;

public class CalcSecondPartTest {

    int var1;
    int var2;
    int var3;
    int var4;
    int var5;
    int res;

    @Test
    @DisplayName("Substraction")
    public void sub(){

        var1 = Integer.parseInt(TFParamService.getInstance().getParam("DS_VAR1"));
        var2 = Integer.parseInt(TFParamService.getInstance().getParam("DS_VAR2"));
        res = Integer.parseInt(TFParamService.getInstance().getParam("DS_RES"));
        Assertions.assertTrue((var1-var2)==res, "Le résultat du calcul est incorrect.");
    }

    @Test
    @DisplayName("CheckTestCase")
    public void checkTCCUF(){
        var1 = Integer.parseInt(TFParamService.getInstance().getParam("TC_CUF_number"));
        var2 = 2;
        res = 5;
        Assertions.assertTrue((var1-var2)==res, "Le résultat du calcul est incorrect.");
    }

    @Test
    @DisplayName("CheckPremiumCUF")
    public void checkPremiumCUF(){
        var1 = Integer.parseInt(TFParamService.getInstance().getParam("TC_CUF_number"));
        var2 = Integer.parseInt(TFParamService.getInstance().getParam("CPG_CUF_number2"));
        var3 = Integer.parseInt(TFParamService.getInstance().getParam("IT_CUF_number3"));
        var4 = Integer.parseInt(TFParamService.getInstance().getParam("TS_CUF_number4"));
        var5 = Integer.parseInt(TFParamService.getInstance().getParam("DSNAME"));
        res = Integer.parseInt(TFParamService.getInstance().getParam("DS_expectedResult"));
        Assertions.assertTrue((var1+var2+var3+var4+var5)==res, "Le résultat du calcul est incorrect.");
    }
}
