package abstractfactory;
/**
 *
 * @author Krishna
 */
public class DarkTheme extends ThemeFactory{

    @Override
    public iToolbar getToolbarColor(){
        
            return new DarkToolbar();
        
    }
    
    @Override
    public iDialog getDialogcolor(){
        
        return new DarkDialog();
        
    }
    
        
}
