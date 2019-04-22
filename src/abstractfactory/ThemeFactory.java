package abstractfactory;

/**
 *
 * @author Krishna
 */
abstract class ThemeFactory {
    abstract iToolbar getToolbarColor();
    abstract iDialog getDialogcolor();
    
    public static ThemeFactory getTheme(int ch){
        
        if(ch==1){
            return new DarkTheme();
        }
        else{
            return new LightTheme();
        }
    }
}
