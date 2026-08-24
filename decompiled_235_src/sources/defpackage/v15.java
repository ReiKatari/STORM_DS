package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.XmlResourceParser;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v15  reason: default package */
/* loaded from: classes.dex */
public final class v15 {
    public final Context a;
    public long b = 0;
    public SharedPreferences c = null;
    public SharedPreferences.Editor d;
    public boolean e;
    public final String f;
    public PreferenceScreen g;
    public k15 h;
    public k15 i;
    public k15 j;

    public v15(Context context) {
        this.a = context;
        this.f = b(context);
    }

    public static SharedPreferences a(Context context) {
        return context.getSharedPreferences(b(context), 0);
    }

    public static String b(Context context) {
        return context.getPackageName() + "_preferences";
    }

    public final SharedPreferences.Editor c() {
        if (this.e) {
            if (this.d == null) {
                this.d = d().edit();
            }
            return this.d;
        }
        return d().edit();
    }

    public final SharedPreferences d() {
        if (this.c == null) {
            this.c = this.a.getSharedPreferences(this.f, 0);
        }
        return this.c;
    }

    public final PreferenceScreen e(Context context, int i, PreferenceScreen preferenceScreen) {
        this.e = true;
        u15 u15Var = new u15(context, this);
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            PreferenceGroup c = u15Var.c(xml, preferenceScreen);
            xml.close();
            PreferenceScreen preferenceScreen2 = (PreferenceScreen) c;
            preferenceScreen2.onAttachedToHierarchy(this);
            SharedPreferences.Editor editor = this.d;
            if (editor != null) {
                editor.apply();
            }
            this.e = false;
            return preferenceScreen2;
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }
}
