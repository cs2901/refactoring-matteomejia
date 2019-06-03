void renderBanner(){
        final boolean p = platform.toUpperCase().indexOf("MAC") > -1;
        final boolean q = browser.toUpperCase().indexOf("IE") > -1;
        final boolean r = wasInitialized();
        final boolean s = resize > 0;


        if(p && q && r && s)
        {
            // do something
        }
}