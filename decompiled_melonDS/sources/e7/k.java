package e7;

import a7.k0;
import android.net.Uri;
import android.os.Bundle;
import me.magnum.melonds.common.camera.DSiCameraSource;
import p7.l;
import p7.m;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k extends k0 {

    /* renamed from: r  reason: collision with root package name */
    public static final k f4401r = new k(0, false);

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f4402q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k(int i2, boolean z10) {
        super(z10);
        this.f4402q = i2;
    }

    @Override // a7.k0
    public final Object a(Bundle bundle, String str) {
        switch (this.f4402q) {
            case 0:
                bundle.getClass();
                str.getClass();
                return null;
            case DSiCameraSource.FrontCamera /* 1 */:
                if (!w.d.C(bundle, str, str) || l.v(bundle, str)) {
                    return null;
                }
                boolean z10 = bundle.getBoolean(str, false);
                if (!z10 && bundle.getBoolean(str, true)) {
                    m.z(str);
                    throw null;
                }
                return Boolean.valueOf(z10);
            case 2:
                if (!w.d.C(bundle, str, str) || l.v(bundle, str)) {
                    return null;
                }
                double d4 = bundle.getDouble(str, Double.MIN_VALUE);
                if (d4 == Double.MIN_VALUE && bundle.getDouble(str, Double.MAX_VALUE) == Double.MAX_VALUE) {
                    m.z(str);
                    throw null;
                }
                return Double.valueOf(d4);
            case 3:
                bundle.getClass();
                str.getClass();
                double d10 = bundle.getDouble(str, Double.MIN_VALUE);
                if (d10 == Double.MIN_VALUE && bundle.getDouble(str, Double.MAX_VALUE) == Double.MAX_VALUE) {
                    m.z(str);
                    throw null;
                }
                return Double.valueOf(d10);
            case 4:
                if (!w.d.C(bundle, str, str) || l.v(bundle, str)) {
                    return null;
                }
                float f8 = bundle.getFloat(str, Float.MIN_VALUE);
                if (f8 == Float.MIN_VALUE && bundle.getFloat(str, Float.MAX_VALUE) == Float.MAX_VALUE) {
                    m.z(str);
                    throw null;
                }
                return Float.valueOf(f8);
            case l1.c.f8511g /* 5 */:
                if (w.d.C(bundle, str, str) && !l.v(bundle, str)) {
                    return Integer.valueOf(l.n(bundle, str));
                }
                return null;
            case l1.c.f8509e /* 6 */:
                if (!w.d.C(bundle, str, str) || l.v(bundle, str)) {
                    return null;
                }
                long j2 = bundle.getLong(str, Long.MIN_VALUE);
                if (j2 == Long.MIN_VALUE && bundle.getLong(str, Long.MAX_VALUE) == Long.MAX_VALUE) {
                    m.z(str);
                    throw null;
                }
                return Long.valueOf(j2);
            default:
                if (w.d.C(bundle, str, str) && !l.v(bundle, str)) {
                    return l.s(bundle, str);
                }
                return "null";
        }
    }

    @Override // a7.k0
    public final String b() {
        switch (this.f4402q) {
            case 0:
                return "unknown";
            case DSiCameraSource.FrontCamera /* 1 */:
                return "boolean_nullable";
            case 2:
                return "double_nullable";
            case 3:
                return "double";
            case 4:
                return "float_nullable";
            case l1.c.f8511g /* 5 */:
                return "integer_nullable";
            case l1.c.f8509e /* 6 */:
                return "long_nullable";
            default:
                return "string_non_nullable";
        }
    }

    @Override // a7.k0
    public final Object d(String str) {
        switch (this.f4402q) {
            case 0:
                return "null";
            case DSiCameraSource.FrontCamera /* 1 */:
                if (str.equals("null")) {
                    return null;
                }
                return (Boolean) k0.f589k.d(str);
            case 2:
                if (str.equals("null")) {
                    return null;
                }
                return Double.valueOf(Double.parseDouble(str));
            case 3:
                return Double.valueOf(Double.parseDouble(str));
            case 4:
                if (str.equals("null")) {
                    return null;
                }
                return Float.valueOf(Float.parseFloat(str));
            case l1.c.f8511g /* 5 */:
                if (str.equals("null")) {
                    return null;
                }
                return (Integer) k0.f580b.d(str);
            case l1.c.f8509e /* 6 */:
                if (str.equals("null")) {
                    return null;
                }
                return (Long) k0.f583e.d(str);
            default:
                return str;
        }
    }

    @Override // a7.k0
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.f4402q) {
            case 0:
                str.getClass();
                ((String) obj).getClass();
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                Boolean bool = (Boolean) obj;
                str.getClass();
                if (bool == null) {
                    bundle.putString(str, null);
                    return;
                } else {
                    k0.f589k.e(bundle, str, bool);
                    return;
                }
            case 2:
                Double d4 = (Double) obj;
                str.getClass();
                if (d4 == null) {
                    bundle.putString(str, null);
                    return;
                } else {
                    bundle.putDouble(str, d4.doubleValue());
                    return;
                }
            case 3:
                double doubleValue = ((Number) obj).doubleValue();
                str.getClass();
                bundle.putDouble(str, doubleValue);
                return;
            case 4:
                Float f8 = (Float) obj;
                str.getClass();
                if (f8 == null) {
                    bundle.putString(str, null);
                    return;
                } else {
                    k0.f586h.e(bundle, str, f8);
                    return;
                }
            case l1.c.f8511g /* 5 */:
                Integer num = (Integer) obj;
                str.getClass();
                if (num == null) {
                    bundle.putString(str, null);
                    return;
                } else {
                    k0.f580b.e(bundle, str, num);
                    return;
                }
            case l1.c.f8509e /* 6 */:
                Long l10 = (Long) obj;
                str.getClass();
                if (l10 == null) {
                    bundle.putString(str, null);
                    return;
                } else {
                    k0.f583e.e(bundle, str, l10);
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

    @Override // a7.k0
    public String f(Object obj) {
        switch (this.f4402q) {
            case 7:
                String str = (String) obj;
                str.getClass();
                String encode = Uri.encode(str, null);
                encode.getClass();
                return encode;
            default:
                return super.f(obj);
        }
    }
}
