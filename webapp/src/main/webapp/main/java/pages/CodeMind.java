package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;


public class CodeMind extends basePage{

    public CodeMind(WebDriver driver) {
        super(driver);
    }

    private By login = new By.ByPartialLinkText("Login");

    private By Email = By.name("Email");

    private By Password = By.name("Password");

    private By submitButton = By.name("Login");

    private By dropDown = By.id("dropdownMenuButton");

    private By portfolio = new By.ByPartialLinkText("Portfolio");

    //private By aptlogic = By.xpath("/html/body/div[2]/header/div[1]/div/div/div[2]/nav/div[2]/ul/li[1]/ul/li/a");

    private By apttest = new By.ByClassName("count-name");

    private By code = new By.ByPartialLinkText("Code");

    private By ds = new By.ByPartialLinkText("Data Structures");

    private By sorting = new By.ByPartialLinkText("Sorting");

    private By intro = new By.ByPartialLinkText("Introduction");

    private By bubblesort = new By.ByPartialLinkText("Bubble sort");

    //private By play = By.xpath("//*[@id=\"player\"]/div[7]/div[6]/div[1]/button");

    //private By keyword = By.xpath("//*[@id=\"page-wrap\"]/main/div/div[2]/div[2]/section/div[1]/div/div/div/div[1]/div/h2/div/div/p/strong/span");

    private By galaxy = new By.ByPartialLinkText("Galaxy");

    //private By GVideo = By.xpath("/html/body/div[2]/section[2]/div/div[2]/div/div[2]/div/div/a/span/i");

    //private By GVPlay = By.className("PlayButton_module_playButtonWrapper__af9e9913");
    private By index = By.id("lang");

    private By indexNo = By.xpath("//*[@id=\"lang\"]/option[4]");

    private By compiler = By.className("ace_content");

    private By editor = By.className("ace_text-input");

    private By run = By.id("runCode");

    private By result = By.xpath("//*[@id=\"result\"]/div/table/tbody/tr/td[2]");

    private By C_lan = By.xpath("/html/body/div[2]/div[1]/div/div/div/div/div[2]/div[1]/div/div[2]/h5/a");

    private By Conditional_Statements = By.partialLinkText("Conditional Statements");

    private  By prgrm1 = By.partialLinkText("The Pandemic");

    private By Python_lan = By.partialLinkText("Python");

    private By Basics_python = By.tagName("h5");

    private By prgm2 = By.partialLinkText("Area of a circle");

    private By Java_lan = By.partialLinkText("Java");

    private By Control_Statements = By.partialLinkText("Control Statements");

    private By prgm3 = By.partialLinkText("Collatz Sequnce 2");

    private By logical = By.partialLinkText("Logical");

    private By logical_Ability = By.partialLinkText("Logical Ability");

    private By letter_Series = By.partialLinkText("Letter Series");

    private By continue_letter = By.xpath("//*[@id=\"page-wrap\"]/main/div/div[2]/div[2]/section/div[3]/div/div/div/div/div/div/div/div/button");

    private By next1 = By.xpath("//*[@id=\"section-uMrPaLuOBFVUqhBWGHtBJjmTIsvGWO92\"]/ol/li[2]/a");

    private By verbal_Ability = By.partialLinkText("Verbal Ability");

    private By articles = By.partialLinkText("Articles");

    private By takeTest = By.xpath("/html/body/div[2]/div[1]/div/div/div[1]/div/div[3]/div/div[2]/div/div/div[2]/div[3]/a");

    private By ques1 =  By.xpath("/html/body/div[2]/div[1]/div/div/div/div/section/div/div/div[1]/div/div/div/div/div[1]/div[3]/div[4]");

    private By nextques = By.id("nextBtn");

    private By ques2 = By.xpath("/html/body/div[2]/div[1]/div/div/div/div/section/div/div/div[1]/div/div/div/div/div[2]/div[3]/div[2]/label");

    private By ques3 = By.xpath("/html/body/div[2]/div[1]/div/div/div/div/section/div/div/div[1]/div/div/div/div/div[3]/div[3]/div[1]/label");
    private By ques4 = By.xpath("/html/body/div[2]/div[1]/div/div/div/div/section/div/div/div[1]/div/div/div/div/div[4]/div[3]/div[3]/label");
    private By ques5 = By.xpath("/html/body/div[2]/div[1]/div/div/div/div/section/div/div/div[1]/div/div/div/div/div[5]/div[3]/div[4]/label");
    private By ques6 = By.xpath("/html/body/div[2]/div[1]/div/div/div/div/section/div/div/div[1]/div/div/div/div/div[6]/div[3]/div[1]/label");
    private By ques7 = By.xpath("/html/body/div[2]/div[1]/div/div/div/div/section/div/div/div[1]/div/div/div/div/div[7]/div[3]/div[2]/label");
    private By ques8 = By.xpath("/html/body/div[2]/div[1]/div/div/div/div/section/div/div/div[1]/div/div/div/div/div[8]/div[3]/div[4]/label");
    private By ques9 = By.xpath("/html/body/div[2]/div[1]/div/div/div/div/section/div/div/div[1]/div/div/div/div/div[9]/div[3]/div[1]/label");
    private By ques10 = By.xpath("/html/body/div[2]/div[1]/div/div/div/div/section/div/div/div[1]/div/div/div/div/div[10]/div[3]/div[3]/label");
    private By ques11 = By.xpath("/html/body/div[2]/div[1]/div/div/div/div/section/div/div/div[1]/div/div/div/div/div[11]/div[3]/div[2]/label");
    private By ques12 = By.xpath("/html/body/div[2]/div[1]/div/div/div/div/section/div/div/div[1]/div/div/div/div/div[12]/div[3]/div[3]/label");
    private By ques13 = By.xpath("/html/body/div[2]/div[1]/div/div/div/div/section/div/div/div[1]/div/div/div/div/div[13]/div[3]/div[1]/label");
    private By ques14 = By.xpath("/html/body/div[2]/div[1]/div/div/div/div/section/div/div/div[1]/div/div/div/div/div[14]/div[3]/div[4]/label");
    private By ques15 = By.xpath("/html/body/div[2]/div[1]/div/div/div/div/section/div/div/div[1]/div/div/div/div/div[15]/div[3]/div[2]/label");
    private By ques16 = By.xpath("/html/body/div[2]/div[1]/div/div/div/div/section/div/div/div[1]/div/div/div/div/div[16]/div[3]/div[4]/label");
    private By ques17 = By.xpath("/html/body/div[2]/div[1]/div/div/div/div/section/div/div/div[1]/div/div/div/div/div[17]/div[3]/div[3]/label");
    private By ques18 = By.xpath("/html/body/div[2]/div[1]/div/div/div/div/section/div/div/div[1]/div/div/div/div/div[18]/div[3]/div[1]/label");
    private By ques19 = By.xpath("/html/body/div[2]/div[1]/div/div/div/div/section/div/div/div[1]/div/div/div/div/div[19]/div[3]/div[2]/label");
    private By ques20 = By.xpath("/html/body/div[2]/div[1]/div/div/div/div/section/div/div/div[1]/div/div/div/div/div[20]/div[3]/div[1]/label");

    private By submitques = By.xpath("//*[@id=\"submitbtn\"]");

    private By subques = By.xpath("//*[@id=\"confirm_sel\"]/button[2]");

    //private By proceedbutton = By.xpath("/html/body/div[5]/div/div/div/a");
    private By proceedbutton = By.partialLinkText("Proceed");

    private By TechnicalAbility = By.partialLinkText("Technical Ability");
    private By level1 = By.partialLinkText("Level-1 Technical Ability");
    private By c_ControlStatements = By.partialLinkText("C Control Statements");
    private By test = By.xpath("/html/body/div[2]/div[1]/div/div/div[1]/div/div[2]/div/div[2]/div/div/div[2]/div[3]/a");

    private By technical = By.partialLinkText("Technical");

    private By OS = By.xpath("//*[@id=\"prod-curriculum\"]/div/ul/li[1]/div[1]");
    private By OS1 = By.xpath("/html/body/div[2]/section[2]/div/div/div/div/div/div/div/div/div/div/ul/li[1]/div[2]/div/div/div/div[1]/div[1]/a");
    private By OS2 = By.xpath("/html/body/div[2]/section[2]/div/div/div/div/div/div/div/div/div/div/ul/li[1]/div[2]/div/div/div/div[2]/div[1]/a");
    private By OS3 = By.xpath("/html/body/div[2]/section[2]/div/div/div/div/div/div/div/div/div/div/ul/li[1]/div[2]/div/div/div/div[3]/div[1]/a");
    private By OS4 = By.xpath("/html/body/div[2]/section[2]/div/div/div/div/div/div/div/div/div/div/ul/li[1]/div[2]/div/div/div/div[4]/div[1]/a");
    private By OS5 = By.xpath("/html/body/div[2]/section[2]/div/div/div/div/div/div/div/div/div/div/ul/li[1]/div[2]/div/div/div/div[5]/div[1]/a");
    private By OS6 = By.xpath("/html/body/div[2]/section[2]/div/div/div/div/div/div/div/div/div/div/ul/li[1]/div[2]/div/div/div/div[6]/div[1]/a");

    private By RPA = By.partialLinkText("RPA");
    private By rpa1 = By.xpath("/html/body/div[2]/section[2]/div/div[2]/div/div[1]/div/div/div/ul/li[2]");
    private By rpa1_1 = By.xpath("//*[@id=\"prod-curriculum\"]/div/ul/li[1]/div[1]");
    private By rpa1_2 = By.xpath("//*[@id=\"prod-curriculum\"]/div/ul/li[2]/div[1]");
    private By rpa1_3 = By.xpath("//*[@id=\"prod-curriculum\"]/div/ul/li[3]/div[1]");
    private By rpa1_4 = By.xpath("//*[@id=\"prod-curriculum\"]/div/ul/li[4]/div[1]");
    private By rpa1_5 = By.xpath("//*[@id=\"prod-curriculum\"]/div/ul/li[5]/div[1]");
    private By rpa1_6 = By.xpath("//*[@id=\"prod-curriculum\"]/div/ul/li[6]/div[1]");

    private By rpa2 = By.xpath("/html/body/div[2]/section[2]/div/div[2]/div/div[1]/div/div/div/ul/li[3]");

    private By rpa3 = By.xpath("/html/body/div[2]/section[2]/div/div[2]/div/div[1]/div/div/div/ul/li[4]");
    private By rpa3_1 = By.xpath("//*[@id=\"prod-faq\"]/div/ul/li[1]/div[1]");
    private By rpa3_2 = By.xpath("//*[@id=\"prod-faq\"]/div/ul/li[2]/div[1]");
    private By rpa3_3 = By.xpath("//*[@id=\"prod-faq\"]/div/ul/li[3]/div[1]");
    private By rpa4 = By.xpath("/html/body/div[2]/section[2]/div/div[2]/div/div[1]/div/div/div/ul/li[5]");

    private By cc_AWS = By.partialLinkText("Cloud Computing(AWS)");
    private By vpc = By.xpath("/html/body/div[2]/section[2]/div/div[2]/div[3]/div/a/center/div/img");

    private By networking = By.partialLinkText("Networking");
    private By what_is_the_Network = By.partialLinkText("What is the Network");

    public void codemind() {
        driver.get("https://thecodemind.io/app/");
    }

    public void Login() throws InterruptedException {
        Thread.sleep(Long.parseLong("2000"));
        driver.findElement(login).click();
        driver.findElement(Email).sendKeys("2935");
        driver.findElement(Password).sendKeys("1234");
        driver.findElement(submitButton).click();
        String ActualValue = driver.findElement(dropDown).getText();
        String ExpectedValue = "R.SUDHIR";
        System.out.println(ActualValue);
        //System.out.println(ExpectedValue);
        //Assert.assertEquals(ActualValue,ExpectedValue);
        /*if (ActualValue == ExpectedValue) {
            System.out.println("Test Passed");
        }
        else {
            System.out.println("Invalid Credentials");
        }*/
    }

    public void  Portfolio() throws InterruptedException {
        driver.findElement(portfolio).click();
        driver.get("https://thecodemind.io/app/aptlogic.php");
        //driver.findElement(aptlogic).click();
        Thread.sleep(Long.parseLong("2000"));
        String aptt = driver.findElement(apttest).getText();
        System.out.println(aptt);
        //driver.navigate().back();
    }

    public void Code_portfolio () throws InterruptedException {
        driver.findElement(code).click();
        driver.get("https://thecodemind.io/app/course.php?pageCategory=Y3dyUmpiOFlpY0FWdmE1UVBFMzlLdz09");
        driver.findElement(ds).click();
        driver.findElement(sorting).click();
        driver.get("https://thecodemind.io/app/articulates/Common_topics/Sorting/#/lessons/bNjICkNji8qD0uNLcyO8oSMldI45v7uC");
        driver.findElement(intro).click();
        Thread.sleep(Long.parseLong("2000"));
        driver.findElement(bubblesort).click();
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy(0,2000)","");
        Thread.sleep(Long.parseLong("2000"));
        jsExecutor.executeScript("window.scrollTo(0,2000)");
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
    }

    public void Code_experimenter() throws InterruptedException{
        driver.findElement(code).click();
        driver.get("https://thecodemind.io/app/stories.php");
        driver.findElement(galaxy).click();
        Thread.sleep(Long.parseLong("3000"));
        driver.findElement(index).click();
        driver.findElement(indexNo).click();
        driver.findElement(compiler).click();
        driver.findElement(editor).sendKeys("Hello");
        /*driver.findElement(run).click();
        Thread.sleep(Long.parseLong("2000"));
        String res = driver.findElement(result).getText();
        System.out.println(res);*/
    }

    public void Code_competitor_C() throws InterruptedException {
        driver.findElement(code).click();
        Thread.sleep(Long.parseLong("2000"));
        driver.get("https://thecodemind.io/app/course.php?pageCategory=c3pzTm1NaHFsYWVCeFpGMVpkTDloZz09");
        driver.findElement(C_lan).click();
        driver.findElement(Conditional_Statements).click();
        driver.findElement(prgrm1).click();
        driver.findElement(editor).sendKeys("Hello");
        Thread.sleep(Long.parseLong("2000"));
        driver.findElement(run).click();
        Thread.sleep(Long.parseLong("2000"));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy(0,2000)","");
        String result1 = driver.findElement(result).getText();
        System.out.println(result1);
        driver.navigate().back();
        driver.navigate().back();
    }

    public void Code_competitor_Python() throws InterruptedException {
        driver.get("https://thecodemind.io/app/course.php?pageCategory=c3pzTm1NaHFsYWVCeFpGMVpkTDloZz09");
        driver.findElement(Python_lan).click();
        driver.findElement(Basics_python).click();
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy(0,2000)","");
        driver.findElement(prgm2).click();
        driver.findElement(editor).sendKeys("pi=3.14\n" +
                "r=int(input())\n" +
                "a=pi*r*r\n" +
                "print(\"{0:.2f}\".format(a))");
        jsExecutor.executeScript("window.scrollBy(0,2000)","");
        Thread.sleep(Long.parseLong("2000"));
        driver.findElement(run).click();
        Thread.sleep(Long.parseLong("7000"));
        String result2 = driver.findElement(result).getText();
        System.out.println(result2);
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
    }

    public void Code_competitor_Java() throws InterruptedException {
        driver.findElement(Java_lan).click();
        driver.findElement(Control_Statements).click();
        driver.findElement(prgm3).click();
        driver.findElement(editor).sendKeys("Hello");
        Thread.sleep(Long.parseLong("2000"));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy(0,2000)","");
        driver.findElement(run).click();
        Thread.sleep(Long.parseLong("2000"));
        String result3 = driver.findElement(result).getText();
        System.out.println(result3);
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
    }

    public void Logical_Explorer() throws InterruptedException {
        driver.findElement(logical).click();
        driver.get("https://thecodemind.io/app/course.php?pageCategory=TmR3enNySFZBeVhIQy9nd0NrTHFjS3QrUHNkYjJUdkFManBqQ3dBS251cz0=");
        driver.findElement(logical_Ability).click();
        //driver.findElement(letter_Series).click();
        driver.get("https://thecodemind.io/app/articulates/Common_topics/Letter%20Series/#/lessons/Tj9Wz--osgMevBVv_EsnAqmd-xrPuW5B");
        //driver.findElement(intro).click();
        Thread.sleep(Long.parseLong("2000"));
        driver.findElement(continue_letter).click();
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy(0,2000)","");
        Thread.sleep(Long.parseLong("2000"));
        driver.findElement(next1).click();
        jsExecutor.executeScript("window.scrollTo(0,2000)");


    }

    public void Logical_Experimenter() throws InterruptedException {
        //driver.findElement(logical).click();
        driver.get("https://thecodemind.io/app/course.php?pageCategory=Y1d1M0t4YnZsYkM0MjNmUkNmUGVTSVdzaXhoRC9aN0tEM0cwZy9jZFVSUT0=");
        driver.findElement(verbal_Ability).click();
        driver.findElement(articles).click();
        driver.findElement(takeTest).click();
        driver.findElement(ques1).click();
        driver.findElement(nextques).click();
        driver.findElement(ques2).click();
        driver.findElement(nextques).click();
        driver.findElement(ques3).click();
        driver.findElement(nextques).click();
        driver.findElement(ques4).click();
        driver.findElement(nextques).click();
        driver.findElement(ques5).click();
        driver.findElement(nextques).click();
        driver.findElement(ques6).click();
        driver.findElement(nextques).click();
        driver.findElement(ques7).click();
        driver.findElement(nextques).click();
        driver.findElement(ques8).click();
        driver.findElement(nextques).click();
        driver.findElement(ques9).click();
        driver.findElement(nextques).click();
        driver.findElement(ques10).click();
        driver.findElement(nextques).click();
        driver.findElement(ques11).click();
        driver.findElement(nextques).click();
        driver.findElement(ques12).click();
        driver.findElement(nextques).click();
        driver.findElement(ques13).click();
        driver.findElement(nextques).click();
        driver.findElement(ques14).click();
        driver.findElement(nextques).click();
        driver.findElement(ques15).click();
        driver.findElement(nextques).click();
        driver.findElement(ques16).click();
        driver.findElement(nextques).click();
        driver.findElement(ques17).click();
        driver.findElement(nextques).click();
        driver.findElement(ques18).click();
        driver.findElement(nextques).click();
        driver.findElement(ques19).click();
        driver.findElement(nextques).click();
        driver.findElement(ques20).click();
        driver.findElement(nextques).click();
        driver.findElement(submitques).click();
        driver.findElement(subques).click();
        Thread.sleep(Long.parseLong("1000"));
        driver.findElement(proceedbutton).click();

    }

    public void Logical_Compititor() throws InterruptedException {
        driver.findElement(logical).click();
        driver.get("https://thecodemind.io/app/course.php?pageCategory=YmFsZWFyaytDSTBlOGRpVjNPVE4rN1I3WFAxMHk1U3lEOXFoSCtrejNzZz0=");
        driver.findElement(TechnicalAbility).click();
        driver.findElement(level1).click();
        driver.findElement(c_ControlStatements).click();
        driver.findElement(test).click();
        driver.findElement(ques1).click();
        driver.findElement(nextques).click();
        driver.findElement(ques2).click();
        driver.findElement(nextques).click();
        driver.findElement(ques3).click();
        driver.findElement(nextques).click();
        driver.findElement(ques4).click();
        driver.findElement(nextques).click();
        driver.findElement(ques5).click();
        driver.findElement(nextques).click();
        driver.findElement(ques6).click();
        driver.findElement(nextques).click();
        driver.findElement(ques7).click();
        driver.findElement(nextques).click();
        driver.findElement(ques8).click();
        driver.findElement(nextques).click();
        driver.findElement(ques9).click();
        driver.findElement(nextques).click();
        driver.findElement(ques10).click();
        driver.findElement(nextques).click();
        driver.findElement(ques11).click();
        driver.findElement(nextques).click();
        driver.findElement(ques12).click();
        driver.findElement(nextques).click();
        driver.findElement(ques13).click();
        driver.findElement(nextques).click();
        driver.findElement(ques14).click();
        driver.findElement(nextques).click();
        driver.findElement(ques15).click();
        driver.findElement(nextques).click();
        driver.findElement(ques16).click();
        driver.findElement(nextques).click();
        driver.findElement(ques17).click();
        driver.findElement(nextques).click();
        driver.findElement(ques18).click();
        driver.findElement(nextques).click();
        driver.findElement(ques19).click();
        driver.findElement(nextques).click();
        driver.findElement(ques20).click();
        driver.findElement(nextques).click();
        driver.findElement(submitques).click();
        driver.findElement(subques).click();
        Thread.sleep(Long.parseLong("1000"));
        driver.findElement(proceedbutton).click();

    }

    public void technical_Learningpath() throws InterruptedException {
        driver.findElement(technical).click();
        driver.get("https://thecodemind.io/app/learningpath.php");
        driver.findElement(OS).click();
        driver.findElement(OS1).click();
        Thread.sleep(Long.parseLong("500"));
        driver.findElement(OS2).click();
        Thread.sleep(Long.parseLong("500"));
        driver.findElement(OS3).click();
        Thread.sleep(Long.parseLong("500"));
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("window.scrollBy(0,500)","");
        driver.findElement(OS4).click();
        Thread.sleep(Long.parseLong("500"));
        driver.findElement(OS5).click();
        Thread.sleep(Long.parseLong("500"));
        driver.findElement(OS6).click();
        Thread.sleep(Long.parseLong("500"));
        jsExecutor.executeScript("window.scrollBy(0,500)","");

    }

    public void technical_Technologies() throws InterruptedException {
        driver.findElement(technical).click();
        driver.get("https://thecodemind.io/app/technologies.php");
        driver.findElement(RPA).click();
        Thread.sleep(Long.parseLong("500"));
        driver.findElement(rpa1).click();
        Thread.sleep(Long.parseLong("1000"));
        driver.findElement(rpa1_1).click();
        Thread.sleep(Long.parseLong("500"));
        driver.findElement(rpa1_2).click();
        Thread.sleep(Long.parseLong("500"));
        driver.findElement(rpa1_3).click();
        Thread.sleep(Long.parseLong("500"));
        driver.findElement(rpa1_4).click();
        Thread.sleep(Long.parseLong("500"));
        driver.findElement(rpa1_5).click();
        Thread.sleep(Long.parseLong("500"));
        driver.findElement(rpa1_6).click();
        Thread.sleep(Long.parseLong("500"));
        driver.findElement(rpa2).click();
        Thread.sleep(Long.parseLong("500"));
        driver.findElement(rpa3).click();
        Thread.sleep(Long.parseLong("1000"));
        driver.findElement(rpa3_1).click();
        Thread.sleep(Long.parseLong("500"));
        driver.findElement(rpa3_2).click();
        Thread.sleep(Long.parseLong("500"));
        driver.findElement(rpa4).click();
        Thread.sleep(Long.parseLong("1000"));
    }

    public void technical_Explorer() throws InterruptedException {
        driver.findElement(technical).click();
        driver.get("https://thecodemind.io/app/course.php?pageCategory=K0xsVjRHbTZ1dFdsa1JSK3FEc0RNU1M4TExpaHRLdU1TR1pNWjJtSzVPVT0=");
        driver.findElement(cc_AWS).click();
        driver.findElement(vpc).click();
        driver.get("https://thecodemind.io/app/articulates/Cloud%20Computing(AWS)/VPC/#/lessons/Q4rsZPemJcOsy0YOYp7A6Llxeup6kJgO");
        driver.navigate().back();
        driver.navigate().back();
    }

    public void technical_Experimenter() throws InterruptedException {
        driver.findElement(technical).click();
        driver.get("https://thecodemind.io/app/course.php?pageCategory=MGdneU9vUGFjZHEyUXV1RXRQQTY5bnBCcG9nT0xQNWs4NkRKVmNZaTViMD0=");
        driver.findElement(networking).click();
        driver.findElement(what_is_the_Network).click();
        driver.findElement(test).click();
        driver.findElement(ques1).click();
        driver.findElement(nextques).click();
        driver.findElement(ques2).click();
        driver.findElement(nextques).click();
        driver.findElement(ques3).click();
        driver.findElement(nextques).click();
        driver.findElement(ques4).click();
        driver.findElement(nextques).click();
        driver.findElement(ques5).click();
        driver.findElement(nextques).click();
        driver.findElement(ques6).click();
        driver.findElement(nextques).click();
        driver.findElement(ques7).click();
        driver.findElement(nextques).click();
        driver.findElement(ques8).click();
        driver.findElement(nextques).click();
        driver.findElement(ques9).click();
        driver.findElement(nextques).click();
        driver.findElement(ques10).click();
        driver.findElement(nextques).click();
        driver.findElement(submitques).click();
        driver.findElement(subques).click();
        Thread.sleep(Long.parseLong("1000"));
        driver.findElement(proceedbutton).click();
    }

    public void close() {
        driver.close();
    }
    /*public void Code_OnlineCompiler() throws InterruptedException{
        driver.findElement(code).click();
        driver.findElement(editor).sendKeys("Hello");
        driver.findElement(run).click();
    }*/
}