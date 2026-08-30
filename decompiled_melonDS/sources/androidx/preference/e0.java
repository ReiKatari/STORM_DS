package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e0 {

    /* renamed from: e  reason: collision with root package name */
    public static final Class[] f1545e = {Context.class, AttributeSet.class};

    /* renamed from: f  reason: collision with root package name */
    public static final HashMap f1546f = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public final Context f1547a;

    /* renamed from: c  reason: collision with root package name */
    public final f0 f1549c;

    /* renamed from: b  reason: collision with root package name */
    public final Object[] f1548b = new Object[2];

    /* renamed from: d  reason: collision with root package name */
    public final String[] f1550d = {Preference.class.getPackage().getName() + ".", SwitchPreference.class.getPackage().getName() + "."};

    public e0(Context context, f0 f0Var) {
        this.f1547a = context;
        this.f1549c = f0Var;
    }

    public final Preference a(String str, String[] strArr, AttributeSet attributeSet) {
        Class<?> cls;
        HashMap hashMap = f1546f;
        Constructor<?> constructor = (Constructor) hashMap.get(str);
        if (constructor == null) {
            try {
                try {
                    ClassLoader classLoader = this.f1547a.getClassLoader();
                    if (strArr != null && strArr.length != 0) {
                        cls = null;
                        ClassNotFoundException e6 = null;
                        for (String str2 : strArr) {
                            try {
                                cls = Class.forName(str2 + str, false, classLoader);
                                break;
                            } catch (ClassNotFoundException e10) {
                                e6 = e10;
                            }
                        }
                        if (cls == null) {
                            if (e6 == null) {
                                throw new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                            }
                            throw e6;
                        }
                        constructor = cls.getConstructor(f1545e);
                        constructor.setAccessible(true);
                        hashMap.put(str, constructor);
                    }
                    cls = Class.forName(str, false, classLoader);
                    constructor = cls.getConstructor(f1545e);
                    constructor.setAccessible(true);
                    hashMap.put(str, constructor);
                } catch (Exception e11) {
                    InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
                    inflateException.initCause(e11);
                    throw inflateException;
                }
            } catch (ClassNotFoundException e12) {
                throw e12;
            }
        }
        Object[] objArr = this.f1548b;
        objArr[1] = attributeSet;
        return (Preference) constructor.newInstance(objArr);
    }

    public final Preference b(String str, AttributeSet attributeSet) {
        try {
            if (-1 == str.indexOf(46)) {
                return a(str, this.f1550d, attributeSet);
            }
            return a(str, null, attributeSet);
        } catch (InflateException e6) {
            throw e6;
        } catch (ClassNotFoundException e10) {
            InflateException inflateException = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class (not found)" + str);
            inflateException.initCause(e10);
            throw inflateException;
        } catch (Exception e11) {
            InflateException inflateException2 = new InflateException(attributeSet.getPositionDescription() + ": Error inflating class " + str);
            inflateException2.initCause(e11);
            throw inflateException2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7, types: [androidx.preference.PreferenceGroup, androidx.preference.Preference] */
    public final PreferenceGroup c(XmlResourceParser xmlResourceParser, PreferenceScreen preferenceScreen) {
        int next;
        synchronized (this.f1548b) {
            AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
            this.f1548b[0] = this.f1547a;
            do {
                try {
                    try {
                        try {
                            next = xmlResourceParser.next();
                            if (next == 2) {
                                break;
                            }
                        } catch (IOException e6) {
                            InflateException inflateException = new InflateException(xmlResourceParser.getPositionDescription() + ": " + e6.getMessage());
                            inflateException.initCause(e6);
                            throw inflateException;
                        }
                    } catch (InflateException e10) {
                        throw e10;
                    }
                } catch (XmlPullParserException e11) {
                    InflateException inflateException2 = new InflateException(e11.getMessage());
                    inflateException2.initCause(e11);
                    throw inflateException2;
                }
            } while (next != 1);
            if (next == 2) {
                ?? r22 = (PreferenceGroup) b(xmlResourceParser.getName(), asAttributeSet);
                if (preferenceScreen == null) {
                    r22.onAttachedToHierarchy(this.f1549c);
                    preferenceScreen = r22;
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
                    Context context = this.f1547a;
                    if (equals) {
                        try {
                            preference.setIntent(Intent.parseIntent(context.getResources(), xmlPullParser, attributeSet));
                        } catch (IOException e6) {
                            XmlPullParserException xmlPullParserException = new XmlPullParserException("Error parsing preference");
                            xmlPullParserException.initCause(e6);
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
                        } catch (IOException e10) {
                            XmlPullParserException xmlPullParserException2 = new XmlPullParserException("Error parsing preference");
                            xmlPullParserException2.initCause(e10);
                            throw xmlPullParserException2;
                        }
                    } else {
                        Preference b10 = b(name, attributeSet);
                        ((PreferenceGroup) preference).e(b10);
                        d(xmlPullParser, b10, attributeSet);
                    }
                }
            } else {
                return;
            }
        }
    }
}
