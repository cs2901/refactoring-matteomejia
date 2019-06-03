package composing;

public class renderBanner{
    public renderBanner(){
        final boolean isMacOS = platform.toUpperCase().indexOf("MAC") > -1;
        final boolean isIE = browser.toUpperCase().indexOf("IE") > -1;
        final boolean wasResised = resize > 0;


        if(isMacOS && isIE && wasInitialized() && wasResised)
        {
            // do something
        }
    }
}