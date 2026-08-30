package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.XmlResourceParser;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ts4  reason: default package */
/* loaded from: classes.dex */
public final class ts4 {
    public final Context a;
    public long b = 0;
    public SharedPreferences c = null;
    public SharedPreferences.Editor d;
    public boolean e;
    public final String f;
    public PreferenceScreen g;
    public is4 h;
    public is4 i;
    public is4 j;

    public ts4(Context context) {
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
        ss4 ss4Var = new ss4(context, this);
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            PreferenceGroup c = ss4Var.c(xml, preferenceScreen);
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
