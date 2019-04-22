package abstractfactory;

/**
 *
 * @author Krishna
 */
public class LightTheme extends ThemeFactory{
   
    @Override
    public iToolbar getToolbarColor(){
     
        return new LightToolbar();
    }
    
    @Override
    public iDialog getDialogcolor(){
        return new LightDialog();
    }

}

