package androidx.preference;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.XmlResourceParser;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f1551a;

    /* renamed from: b  reason: collision with root package name */
    public long f1552b = 0;

    /* renamed from: c  reason: collision with root package name */
    public SharedPreferences f1553c = null;

    /* renamed from: d  reason: collision with root package name */
    public SharedPreferences.Editor f1554d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f1555e;

    /* renamed from: f  reason: collision with root package name */
    public final String f1556f;

    /* renamed from: g  reason: collision with root package name */
    public PreferenceScreen f1557g;

    /* renamed from: h  reason: collision with root package name */
    public a0 f1558h;

    /* renamed from: i  reason: collision with root package name */
    public a0 f1559i;

    /* renamed from: j  reason: collision with root package name */
    public a0 f1560j;

    public f0(Context context) {
        this.f1551a = context;
        this.f1556f = a(context);
    }

    public static String a(Context context) {
        return context.getPackageName() + "_preferences";
    }

    public final SharedPreferences.Editor b() {
        if (this.f1555e) {
            if (this.f1554d == null) {
                this.f1554d = c().edit();
            }
            return this.f1554d;
        }
        return c().edit();
    }

    public final SharedPreferences c() {
        if (this.f1553c == null) {
            this.f1553c = this.f1551a.getSharedPreferences(this.f1556f, 0);
        }
        return this.f1553c;
    }

    public final PreferenceScreen d(Context context, int i2, PreferenceScreen preferenceScreen) {
        this.f1555e = true;
        e0 e0Var = new e0(context, this);
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            PreferenceGroup c4 = e0Var.c(xml, preferenceScreen);
            xml.close();
            PreferenceScreen preferenceScreen2 = (PreferenceScreen) c4;
            preferenceScreen2.onAttachedToHierarchy(this);
            SharedPreferences.Editor editor = this.f1554d;
            if (editor != null) {
                editor.apply();
            }
            this.f1555e = false;
            return preferenceScreen2;
        } catch (Throwable th2) {
            xml.close();
            throw th2;
        }
    }
}
