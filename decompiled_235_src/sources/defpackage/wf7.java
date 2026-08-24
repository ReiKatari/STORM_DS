package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wf7  reason: default package */
/* loaded from: classes.dex */
public final class wf7 extends fd4 {
    public static final wf7 r = new wf7(false, 0);
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wf7(boolean z, int i) {
        super(z);
        this.q = i;
    }

    @Override // defpackage.fd4
    public final Object a(Bundle bundle, String str) {
        switch (this.q) {
            case 0:
                bundle.getClass();
                str.getClass();
                return null;
            case 1:
                bundle.getClass();
                str.getClass();
                return (g10) ((Parcelable) nc1.R(bundle, str, g10.class));
            case 2:
                if (!i61.C(bundle, str, str) || uj2.X(bundle, str)) {
                    return null;
                }
                boolean z = bundle.getBoolean(str, false);
                if (!z && bundle.getBoolean(str, true)) {
                    xk2.B(str);
                    throw null;
                }
                return Boolean.valueOf(z);
            case 3:
                if (!i61.C(bundle, str, str) || uj2.X(bundle, str)) {
                    return null;
                }
                double d = bundle.getDouble(str, Double.MIN_VALUE);
                if (d == Double.MIN_VALUE && bundle.getDouble(str, Double.MAX_VALUE) == Double.MAX_VALUE) {
                    xk2.B(str);
                    throw null;
                }
                return Double.valueOf(d);
            case 4:
                bundle.getClass();
                str.getClass();
                double d2 = bundle.getDouble(str, Double.MIN_VALUE);
                if (d2 == Double.MIN_VALUE && bundle.getDouble(str, Double.MAX_VALUE) == Double.MAX_VALUE) {
                    xk2.B(str);
                    throw null;
                }
                return Double.valueOf(d2);
            case 5:
                if (!i61.C(bundle, str, str) || uj2.X(bundle, str)) {
                    return null;
                }
                float f = bundle.getFloat(str, Float.MIN_VALUE);
                if (f == Float.MIN_VALUE && bundle.getFloat(str, Float.MAX_VALUE) == Float.MAX_VALUE) {
                    xk2.B(str);
                    throw null;
                }
                return Float.valueOf(f);
            case 6:
                if (!i61.C(bundle, str, str) || uj2.X(bundle, str)) {
                    return null;
                }
                return Integer.valueOf(uj2.I(bundle, str));
            case 7:
                if (!i61.C(bundle, str, str) || uj2.X(bundle, str)) {
                    return null;
                }
                long j = bundle.getLong(str, Long.MIN_VALUE);
                if (j == Long.MIN_VALUE && bundle.getLong(str, Long.MAX_VALUE) == Long.MAX_VALUE) {
                    xk2.B(str);
                    throw null;
                }
                return Long.valueOf(j);
            default:
                if (i61.C(bundle, str, str) && !uj2.X(bundle, str)) {
                    return uj2.P(bundle, str);
                }
                return "null";
        }
    }

    @Override // defpackage.fd4
    public String b() {
        switch (this.q) {
            case 0:
                return "unknown";
            case 1:
            default:
                return super.b();
            case 2:
                return "boolean_nullable";
            case 3:
                return "double_nullable";
            case 4:
                return "double";
            case 5:
                return "float_nullable";
            case 6:
                return "integer_nullable";
            case 7:
                return "long_nullable";
            case 8:
                return "string_non_nullable";
        }
    }

    @Override // defpackage.fd4
    public final Object d(String str) {
        switch (this.q) {
            case 0:
                return "null";
            case 1:
                hd3 hd3Var = id3.d;
                hd3Var.getClass();
                return (g10) hd3Var.a(g10.Companion.serializer(), str);
            case 2:
                if (str.equals("null")) {
                    return null;
                }
                return (Boolean) fd4.k.d(str);
            case 3:
                if (str.equals("null")) {
                    return null;
                }
                return Double.valueOf(Double.parseDouble(str));
            case 4:
                return Double.valueOf(Double.parseDouble(str));
            case 5:
                if (str.equals("null")) {
                    return null;
                }
                return Float.valueOf(Float.parseFloat(str));
            case 6:
                if (str.equals("null")) {
                    return null;
                }
                return (Integer) fd4.b.d(str);
            case 7:
                if (str.equals("null")) {
                    return null;
                }
                return (Long) fd4.e.d(str);
            default:
                return str;
        }
    }

    @Override // defpackage.fd4
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.q) {
            case 0:
                str.getClass();
                ((String) obj).getClass();
                return;
            case 1:
                g10 g10Var = (g10) obj;
                str.getClass();
                g10Var.getClass();
                bundle.putParcelable(str, g10Var);
                return;
            case 2:
                Boolean bool = (Boolean) obj;
                str.getClass();
                if (bool == null) {
                    bundle.putString(str, null);
                    return;
                } else {
                    fd4.k.e(bundle, str, bool);
                    return;
                }
            case 3:
                Double d = (Double) obj;
                str.getClass();
                if (d == null) {
                    bundle.putString(str, null);
                    return;
                } else {
                    bundle.putDouble(str, d.doubleValue());
                    return;
                }
            case 4:
                double doubleValue = ((Number) obj).doubleValue();
                str.getClass();
                bundle.putDouble(str, doubleValue);
                return;
            case 5:
                Float f = (Float) obj;
                str.getClass();
                if (f == null) {
                    bundle.putString(str, null);
                    return;
                } else {
                    fd4.h.e(bundle, str, f);
                    return;
                }
            case 6:
                Integer num = (Integer) obj;
                str.getClass();
                if (num == null) {
                    bundle.putString(str, null);
                    return;
                } else {
                    fd4.b.e(bundle, str, num);
                    return;
                }
            case 7:
                Long l = (Long) obj;
                str.getClass();
                if (l == null) {
                    bundle.putString(str, null);
                    return;
                } else {
                    fd4.e.e(bundle, str, l);
                    return;
                }
            default:
                String str2 = (String) obj;
                str.getClass();
                str2.getClass();
                bundle.putString(str, str2);
                return;
        }
    }

    @Override // defpackage.fd4
    public String f(Object obj) {
        switch (this.q) {
            case 1:
                g10 g10Var = (g10) obj;
                g10Var.getClass();
                hd3 hd3Var = id3.d;
                hd3Var.getClass();
                String encode = Uri.encode(hd3Var.b(g10.Companion.serializer(), g10Var));
                encode.getClass();
                return encode;
            case 8:
                String str = (String) obj;
                str.getClass();
                String encode2 = Uri.encode(str, null);
                encode2.getClass();
                return encode2;
            default:
                return super.f(obj);
        }
    }
}
