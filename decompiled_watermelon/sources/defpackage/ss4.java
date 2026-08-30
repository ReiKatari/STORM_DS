package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import androidx.preference.SwitchPreference;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ss4  reason: default package */
/* loaded from: classes.dex */
public final class ss4 {
    public static final Class[] e = {Context.class, AttributeSet.class};
    public static final HashMap f = new HashMap();
    public final Context a;
    public final ts4 c;
    public final Object[] b = new Object[2];
    public final String[] d = {Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."};

    public ss4(Context context, ts4 ts4Var) {
        this.a = context;
        this.c = ts4Var;
    }

    public final Preference a(String str, String[] strArr, AttributeSet attributeSet) {
        Class<?> cls;
        HashMap hashMap = f;
        Constructor<?> constructor = (Constructor) hashMap.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.a.getClassLoader();
                    if (strArr != null && strArr.length != 0) {
                        cls = null;
                        ClassNotFoundException e2 = null;
                        for (String str2 : strArr) {
                            try {
                                cls = Class.forName(str2 + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e3) {
                                e2 = e3;
                            }
                        }
                        if (cls == null) {
                            if (e2 == null) {
                                throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                            }
                            throw e2;
                        }
                        constructor = cls.getConstructor(e);
                        constructor.setAccessible(true);
                        hashMap.put(str, constructor);
                    }
                    cls = Class.forName(str, false, classLoader);
                    constructor = cls.getConstructor(e);
                    constructor.setAccessible(true);
                    hashMap.put(str, constructor);
                } catch (ClassNotFoundException e4) {
                    throw e4;
                }
            } catch (Exception e5) {
                InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                inflateException.initCause(e5);
                throw inflateException;
            }
        }
        Object[] objArr = this.b;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    public final Preference b(String str, AttributeSet attributeSet) {
        try {
            if (-1 == str.indexOf(46)) {
                return a(str, this.d, attributeSet);
            }
            return a(str, null, attributeSet);
        } catch (InflateException e2) {
            throw e2;
        } catch (ClassNotFoundException e3) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e3);
            throw inflateException;
        } catch (Exception e4) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e4);
            throw inflateException2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [androidx.preference.PreferenceGroup, androidx.preference.Preference] */
    public final PreferenceGroup c(XmlResourceParser xmlResourceParser, PreferenceScreen preferenceScreen) {
        int next;
        synchronized (this.b) {
            AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
            this.b[0] = this.a;
            do {
                try {
                    try {
                        try {
                            next = xmlResourceParser.next();
                            if (next == 2) {
                                break;
                            }
                        } catch (IOException e2) {
                            InflateException inflateException = new InflateException(xmlResourceParser.getPositionDescription() + ": " + e2.getMessage());
                            inflateException.initCause(e2);
                            throw inflateException;
                        }
                    } catch (InflateException e3) {
                        throw e3;
                    }
                } catch (XmlPullParserException e4) {
                    InflateException inflateException2 = new InflateException(e4.getMessage());
                    inflateException2.initCause(e4);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next == 2) {
                ?? r2 = (PreferenceGroup) b(xmlResourceParser.getName(), asAttributeSet);
                if (preferenceScreen == null) {
                    r2.onAttachedToHierarchy(this.c);
                    preferenceScreen = r2;
                }
                d(xmlResourceParser, preferenceScreen, asAttributeSet);
            } else {
                throw new InflateException(xmlResourceParser.getPositionDescription() + ": No start tag found!");
            }
        }
        return preferenceScreen;
    }

    public final void d(XmlPullParser xmlPullParser, Preference preference, AttributeSet attributeSet) {
        int depth = xmlPullParser.getDepth();
        while (true) {
            int next = xmlPullParser.next();
            if ((next != 3 || xmlPullParser.getDepth() > depth) && next != 1) {
                if (next == 2) {
                    String name = xmlPullParser.getName();
                    boolean equals = "intent".equals(name);
                    Context context = this.a;
                    if (equals) {
                        try {
                            preference.setIntent(Intent.parseIntent(context.getResources(), xmlPullParser, attributeSet));
                        } catch (IOException e2) {
                            XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                            xmlPullParserException.initCause(e2);
                            throw xmlPullParserException;
                        }
                    } else if ("extra".equals(name)) {
                        context.getResources().parseBundleExtra("extra", attributeSet, preference.getExtras());
                        try {
                            int depth2 = xmlPullParser.getDepth();
                            while (true) {
                                int next2 = xmlPullParser.next();
                                if (next2 != 1 && (next2 != 3 || xmlPullParser.getDepth() > depth2)) {
                                }
                            }
                        } catch (IOException e3) {
                            XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                            xmlPullParserException2.initCause(e3);
                            throw xmlPullParserException2;
                        }
                    } else {
                        Preference b = b(name, attributeSet);
                        ((PreferenceGroup) preference).e(b);
                        d(xmlPullParser, b, attributeSet);
                    }
                }
            } else {
                return;
            }
        }
    }
}
