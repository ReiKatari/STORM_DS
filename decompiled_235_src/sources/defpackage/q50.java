package defpackage;

import android.net.Uri;
import android.os.Bundle;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q50  reason: default package */
/* loaded from: classes.dex */
public final class q50 extends fd4 {
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q50(boolean z, int i) {
        super(z);
        this.q = i;
    }

    @Override // defpackage.fd4
    public final Object a(Bundle bundle, String str) {
        switch (this.q) {
            case 0:
                if (!i61.C(bundle, str, str) || uj2.X(bundle, str)) {
                    return null;
                }
                boolean z = bundle.getBoolean(str, false);
                if (!z && bundle.getBoolean(str, true)) {
                    xk2.B(str);
                    throw null;
                }
                return Boolean.valueOf(z);
            case 1:
                bundle.getClass();
                str.getClass();
                float f = bundle.getFloat(str, Float.MIN_VALUE);
                if (f == Float.MIN_VALUE && bundle.getFloat(str, Float.MAX_VALUE) == Float.MAX_VALUE) {
                    xk2.B(str);
                    throw null;
                }
                return Float.valueOf(f);
            case 2:
                bundle.getClass();
                str.getClass();
                return Integer.valueOf(uj2.I(bundle, str));
            case 3:
                bundle.getClass();
                str.getClass();
                long j = bundle.getLong(str, Long.MIN_VALUE);
                if (j == Long.MIN_VALUE && bundle.getLong(str, Long.MAX_VALUE) == Long.MAX_VALUE) {
                    xk2.B(str);
                    throw null;
                }
                return Long.valueOf(j);
            default:
                if (!i61.C(bundle, str, str) || uj2.X(bundle, str)) {
                    return null;
                }
                return uj2.P(bundle, str);
        }
    }

    @Override // defpackage.fd4
    public final String b() {
        switch (this.q) {
            case 0:
                return "boolean";
            case 1:
                return "float";
            case 2:
                return "integer";
            case 3:
                return "long";
            default:
                return "string";
        }
    }

    @Override // defpackage.fd4
    public final Object d(String str) {
        int parseInt;
        String str2;
        long parseLong;
        boolean z = true;
        switch (this.q) {
            case 0:
                if (!str.equals("true")) {
                    if (str.equals("false")) {
                        z = false;
                    } else {
                        i.h("A boolean NavType only accepts \"true\" or \"false\" values.");
                        return null;
                    }
                }
                return Boolean.valueOf(z);
            case 1:
                return Float.valueOf(Float.parseFloat(str));
            case 2:
                if (xs6.g0(str, "0x", false)) {
                    String substring = str.substring(2);
                    g04.y(16);
                    parseInt = Integer.parseInt(substring, 16);
                } else {
                    parseInt = Integer.parseInt(str);
                }
                return Integer.valueOf(parseInt);
            case 3:
                if (xs6.Y(str, "L", false)) {
                    str2 = str.substring(0, str.length() - 1);
                } else {
                    str2 = str;
                }
                if (xs6.g0(str, "0x", false)) {
                    String substring2 = str2.substring(2);
                    g04.y(16);
                    parseLong = Long.parseLong(substring2, 16);
                } else {
                    parseLong = Long.parseLong(str2);
                }
                return Long.valueOf(parseLong);
            default:
                str.getClass();
                if (str.equals("null")) {
                    return null;
                }
                return str;
        }
    }

    @Override // defpackage.fd4
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.q) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                str.getClass();
                bundle.putBoolean(str, booleanValue);
                return;
            case 1:
                float floatValue = ((Number) obj).floatValue();
                str.getClass();
                bundle.putFloat(str, floatValue);
                return;
            case 2:
                int intValue = ((Number) obj).intValue();
                str.getClass();
                bundle.putInt(str, intValue);
                return;
            case 3:
                long longValue = ((Number) obj).longValue();
                str.getClass();
                bundle.putLong(str, longValue);
                return;
            default:
                String str2 = (String) obj;
                str.getClass();
                if (str2 != null) {
                    bundle.putString(str, str2);
                    return;
                } else {
                    bundle.putString(str, null);
                    return;
                }
        }
    }

    @Override // defpackage.fd4
    public String f(Object obj) {
        switch (this.q) {
            case 4:
                String str = (String) obj;
                if (str != null) {
                    String encode = Uri.encode(str, null);
                    encode.getClass();
                    return encode;
                }
                return "null";
            default:
                return super.f(obj);
        }
    }
}
