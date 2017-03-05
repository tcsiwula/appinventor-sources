package com.google.appinventor.components.runtime;/*
 =============================================================================
 Created:      =        3/4/17
 Project:      =        appinventor-sources
 Package:      =        com.google.appinventor.components.runtime
 ==============================================================================
 Liscense:     =        GPLv2
 Version:      =        0.00x 
 ==============================================================================
 Production:   =        http://abc.com
 Source:       =        https://github.com/repo
 ==============================================================================
 Description   =        Awesome tool for server.
 ==============================================================================
 Author:       =        Tim Siwula <@tcsiwula> <tcsiwula@gmail.com>
 Class:        =        Computer Science xxx: Name
 School:       =        University of San Francisco
 ==============================================================================
 */

public class OAuth
{

}



// -*- mode: java; c-basic-offset: 2; -*-
// Copyright 2009-2011 Google, All Rights reserved
// Copyright 2011-2012 MIT, All rights reserved
// Released under the Apache License, Version 2.0
// http://www.apache.org/licenses/LICENSE-2.0



//
//	use Twitter.java as a specific instance of a this class OAuth.java module
//
//package com.google.appinventor.components.runtime;
//
//		import java.util.ArrayList;
//		import java.util.Collections;
//		import java.util.List;
//		import java.io.File;
//
//		import twitter4j.DirectMessage;
//		import twitter4j.IDs;
//		import twitter4j.Query;
//		import twitter4j.Status;
//		import twitter4j.StatusUpdate;
//		import twitter4j.TwitterException;
//		import twitter4j.TwitterFactory;
//		import twitter4j.User;
//		import twitter4j.auth.AccessToken;
//		import twitter4j.auth.RequestToken;
//		import android.content.Context;
//		import android.content.Intent;
//		import android.content.SharedPreferences;
//		import android.net.Uri;
//		import android.os.Handler;
//		import android.util.Log;
//
//		import com.google.appinventor.components.annotations.DesignerComponent;
//		import com.google.appinventor.components.annotations.DesignerProperty;
//		import com.google.appinventor.components.annotations.PropertyCategory;
//		import com.google.appinventor.components.annotations.SimpleEvent;
//		import com.google.appinventor.components.annotations.SimpleFunction;
//		import com.google.appinventor.components.annotations.SimpleObject;
//		import com.google.appinventor.components.annotations.SimpleProperty;
//		import com.google.appinventor.components.annotations.UsesLibraries;
//		import com.google.appinventor.components.annotations.UsesPermissions;
//		import com.google.appinventor.components.common.ComponentCategory;
//		import com.google.appinventor.components.common.PropertyTypeConstants;
//		import com.google.appinventor.components.common.YaVersion;
//		import com.google.appinventor.components.runtime.util.AsynchUtil;
//		import com.google.appinventor.components.runtime.util.ErrorMessages;
//
///**
// * Component for accessing Twitter.
// *
// * @author sharon@google.com (Sharon Perl) - added OAuth support
// * @author ajcolter@gmail.com (Aubrey Colter) - added the twitter4j 2.2.6 jars
// * @author josmasflores@gmail.com (Jose Dominguez) - added the twitter4j 3.0.3 jars and fixed auth bug 2413
// * @author edwinhzhang@gmail.com (Edwin Zhang) - added twitter4j-media-support-3.03 jar, status + image upload
// */