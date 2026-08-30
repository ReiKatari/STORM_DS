package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b27  reason: default package */
/* loaded from: classes.dex */
public final class b27 extends z44 {
    public static final b27 r = new b27(0, false);
    public final /* synthetic */ int q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b27(int i, boolean z) {
        super(z);
        this.q = i;
    }

    @Override // defpackage.z44
    public final Object a(Bundle bundle, String str) {
        switch (this.q) {
            case 0:
                bundle.getClass();
                str.getClass();
                return null;
            case 1:
                bundle.getClass();
                str.getClass();
                return (pz) ((Parcelable) mh7.O(bundle, str, pz.class));
            case 2:
                if (!b31.C(bundle, str, str) || hk2.G(bundle, str)) {
                    return null;
                }
                boolean z = bundle.getBoolean(str, false);
                if (!z && bundle.getBoolean(str, true)) {
                    jk2.H(str);
                    throw null;
                }
                return Boolean.valueOf(z);
            case 3:
                if (!b31.C(bundle, str, str) || hk2.G(bundle, str)) {
                    return null;
                }
                double d = bundle.getDouble(str, Double.MIN_VALUE);
                if (d == Double.MIN_VALUE && bundle.getDouble(str, Double.MAX_VALUE) == Double.MAX_VALUE) {
                    jk2.H(str);
                    throw null;
                }
                return Double.valueOf(d);
            case 4:
                bundle.getClass();
                str.getClass();
                double d2 = bundle.getDouble(str, Double.MIN_VALUE);
                if (d2 == Double.MIN_VALUE && bundle.getDouble(str, Double.MAX_VALUE) == Double.MAX_VALUE) {
                    jk2.H(str);
                    throw null;
                }
                return Double.valueOf(d2);
            case 5:
                if (!b31.C(bundle, str, str) || hk2.G(bundle, str)) {
                    return null;
                }
                float f = bundle.getFloat(str, Float.MIN_VALUE);
                if (f == Float.MIN_VALUE && bundle.getFloat(str, Float.MAX_VALUE) == Float.MAX_VALUE) {
                    jk2.H(str);
                    throw null;
                }
                return Float.valueOf(f);
            case ig7.b /* 6 */:
                if (!b31.C(bundle, str, str) || hk2.G(bundle, str)) {
                    return null;
                }
                return Integer.valueOf(hk2.x(bundle, str));
            case 7:
                if (!b31.C(bundle, str, str) || hk2.G(bundle, str)) {
                    return null;
                }
                long j = bundle.getLong(str, Long.MIN_VALUE);
                if (j == Long.MIN_VALUE && bundle.getLong(str, Long.MAX_VALUE) == Long.MAX_VALUE) {
                    jk2.H(str);
                    throw null;
                }
                return Long.valueOf(j);
            default:
                if (b31.C(bundle, str, str) && !hk2.G(bundle, str)) {
                    return hk2.D(bundle, str);
                }
                return "null";
        }
    }

    @Override // defpackage.z44
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
            case ig7.b /* 6 */:
                return "integer_nullable";
            case 7:
                return "long_nullable";
            case 8:
                return "string_non_nullable";
        }
    }

    @Override // defpackage.z44
    public final Object d(String str) {
        switch (this.q) {
            case 0:
                return "null";
            case 1:
                s63 s63Var = t63.d;
                s63Var.getClass();
                return (pz) s63Var.a(pz.Companion.serializer(), str);
            case 2:
                if (str.equals("null")) {
                    return null;
                }
                return (Boolean) z44.k.d(str);
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
            case ig7.b /* 6 */:
                if (str.equals("null")) {
                    return null;
                }
                return (Integer) z44.b.d(str);
            case 7:
                if (str.equals("null")) {
                    return null;
                }
                return (Long) z44.e.d(str);
            default:
                return str;
        }
    }

    @Override // defpackage.z44
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.q) {
            case 0:
                str.getClass();
                ((String) obj).getClass();
                return;
            case 1:
                pz pzVar = (pz) obj;
                str.getClass();
                pzVar.getClass();
                bundle.putParcelable(str, pzVar);
                return;
            case 2:
                Boolean bool = (Boolean) obj;
                str.getClass();
                if (bool == null) {
                    bundle.putString(str, null);
                    return;
                } else {
                    z44.k.e(bundle, str, bool);
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
                    z44.h.e(bundle, str, f);
                    return;
                }
            case ig7.b /* 6 */:
                Integer num = (Integer) obj;
                str.getClass();
                if (num == null) {
                    bundle.putString(str, null);
                    return;
                } else {
                    z44.b.e(bundle, str, num);
                    return;
                }
            case 7:
                Long l = (Long) obj;
                str.getClass();
                if (l == null) {
                    bundle.putString(str, null);
                    return;
                } else {
                    z44.e.e(bundle, str, l);
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

    @Override // defpackage.z44
    public String f(Object obj) {
        switch (this.q) {
            case 1:
                pz pzVar = (pz) obj;
                pzVar.getClass();
                s63 s63Var = t63.d;
                s63Var.getClass();
                String encode = Uri.encode(s63Var.b(pz.Companion.serializer(), pzVar));
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
