package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Locale;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: db1  reason: default package */
/* loaded from: classes.dex */
public final class db1 {
    public final Context a;
    public final ex6 b = new ex6(new a5(this, 23));

    public db1(Context context) {
        this.a = context;
    }

    public final String a(long j, String str) {
        str.getClass();
        g04.y(16);
        String l = Long.toString(j & 4294967295L, 16);
        l.getClass();
        String B0 = qs6.B0(8, l);
        Locale locale = Locale.ROOT;
        String lowerCase = B0.toLowerCase(locale);
        lowerCase.getClass();
        SharedPreferences c = c();
        String lowerCase2 = lowerCase.toLowerCase(locale);
        lowerCase2.getClass();
        String str2 = null;
        String string = c.getString("custom_name_".concat(lowerCase2), null);
        if (string != null && !qs6.v0(string)) {
            str2 = string;
        }
        if (str2 != null && !qs6.v0(str2)) {
            return str2;
        }
        String b = b(lowerCase);
        if (b != null && !qs6.v0(b)) {
            return b;
        }
        return str;
    }

    public final String b(String str) {
        SharedPreferences c = c();
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        String string = c.getString("file_name_".concat(lowerCase), null);
        if (string == null || qs6.v0(string)) {
            return null;
        }
        return string;
    }

    public final SharedPreferences c() {
        Object value = this.b.getValue();
        value.getClass();
        return (SharedPreferences) value;
    }

    public final void d(long j, String str) {
        g04.y(16);
        String l = Long.toString(j & 4294967295L, 16);
        l.getClass();
        String lowerCase = qs6.B0(8, l).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        SharedPreferences.Editor edit = c().edit();
        if (str != null && !qs6.v0(str)) {
            edit.putString("file_name_".concat(lowerCase), qs6.T0(str).toString());
        } else {
            edit.remove("file_name_".concat(lowerCase));
        }
        edit.apply();
    }

    public final void e(long j, String str) {
        g04.y(16);
        String l = Long.toString(j & 4294967295L, 16);
        l.getClass();
        String lowerCase = qs6.B0(8, l).toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        SharedPreferences.Editor edit = c().edit();
        if (str != null && !qs6.v0(str)) {
            edit.putString("ra_hash_".concat(lowerCase), qs6.T0(str).toString());
        } else {
            edit.remove("ra_hash_".concat(lowerCase));
        }
        edit.apply();
    }
}
