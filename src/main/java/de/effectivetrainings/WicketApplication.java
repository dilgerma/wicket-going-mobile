package de.effectivetrainings;

import org.apache.wicket.ajax.WicketEventJQueryResourceReference;
import org.apache.wicket.bootstrap.Bootstrap;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.protocol.http.WebApplication;
import org.apache.wicket.request.resource.JavaScriptPackageResource;
import org.apache.wicket.request.resource.JavaScriptResourceReference;
import org.apache.wicket.resource.JQueryResourceReference;

/**
 * Application object for your web application. If you want to run this application without deploying, run the Start class.
 * 
 * @see de.effectivetrainings.Start#main(String[])
 */
public class WicketApplication extends WebApplication
{    	
	/**
	 * @see org.apache.wicket.Application#getHomePage()
	 */
	@Override
	public Class<? extends WebPage> getHomePage()
	{
		return HomePage.class;
	}

	/**
	 * @see org.apache.wicket.Application#init()
	 */
	@Override
	public void init()
	{
		super.init();
        getResourceBundles().addCssBundle(WicketApplication.class,"app.css", Bootstrap.BOOTSTRAP_CSS, Bootstrap.BOOTSTRAP_RESPONSIVE_CSS);
		getResourceBundles().addJavaScriptBundle(WicketApplication.class, "app.js",
            JQueryResourceReference.get(),
            WicketEventJQueryResourceReference.get(),
            Bootstrap.responsive(),
            new JavaScriptResourceReference(HomePage.class, "file1.js"),
            new JavaScriptResourceReference(HomePage.class, "file2.js"),
            new JavaScriptResourceReference(HomePage.class, "file3.js"),
            new JavaScriptResourceReference(HomePage.class, "file4.js"),
            new JavaScriptResourceReference(HomePage.class, "file5.js"),
            new JavaScriptResourceReference(HomePage.class, "file6.js")
        );
	}
}
