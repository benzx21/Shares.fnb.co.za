package pages;

import base.FrameworkConfig;
import com.microsoft.playwright.Page;

public class CreateUserPage {

    Page page = FrameworkConfig.LocalPage;

    String txtName = "#first_name";
    String textTitle = "text='Title'";

    String btnopenaccount = "#openaccount2";



    public void clickOpenAccount(){
        page.click(btnopenaccount);
    }
    public void enterTitle(String title){
        page.fill(textTitle,title);
    }
    public void enterFname(String name){
        page.fill(txtName,name);
    }
}
