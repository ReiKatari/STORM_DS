package a7;

import android.net.Uri;
import android.os.Bundle;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends k0 {

    /* renamed from: q  reason: collision with root package name */
    public final /* synthetic */ int f558q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(int i2, boolean z10) {
        super(z10);
        this.f558q = i2;
    }

    @Override // a7.k0
    public final Object a(Bundle bundle, String str) {
        switch (this.f558q) {
            case 0:
                if (!w.d.C(bundle, str, str) || p7.l.v(bundle, str)) {
                    return null;
                }
                boolean z10 = bundle.getBoolean(str, false);
                if (!z10 && bundle.getBoolean(str, true)) {
                    p7.m.z(str);
                    throw null;
                }
                return Boolean.valueOf(z10);
            case DSiCameraSource.FrontCamera /* 1 */:
                bundle.getClass();
                str.getClass();
                float f8 = bundle.getFloat(str, Float.MIN_VALUE);
                if (f8 == Float.MIN_VALUE && bundle.getFloat(str, Float.MAX_VALUE) == Float.MAX_VALUE) {
                    p7.m.z(str);
                    throw null;
                }
                return Float.valueOf(f8);
            case 2:
                bundle.getClass();
                str.getClass();
                return Integer.valueOf(p7.l.n(bundle, str));
            case 3:
                bundle.getClass();
                str.getClass();
                long j2 = bundle.getLong(str, Long.MIN_VALUE);
                if (j2 == Long.MIN_VALUE && bundle.getLong(str, Long.MAX_VALUE) == Long.MAX_VALUE) {
                    p7.m.z(str);
                    throw null;
                }
                return Long.valueOf(j2);
            default:
                if (w.d.C(bundle, str, str) && !p7.l.v(bundle, str)) {
                    return p7.l.s(bundle, str);
                }
                return null;
        }
    }

    @Override // a7.k0
    public final String b() {
        switch (this.f558q) {
            case 0:
                return "boolean";
            case DSiCameraSource.FrontCamera /* 1 */:
                return "float";
            case 2:
                return "integer";
            case 3:
                return "long";
            default:
                return "string";
        }
    }

    @Override // a7.k0
    public final Object d(String str) {
        boolean z10;
        int parseInt;
        String str2;
        long parseLong;
        switch (this.f558q) {
            case 0:
                if (str.equals("true")) {
                    z10 = true;
                } else if (str.equals("false")) {
                    z10 = false;
                } else {
                    a0.j.h("A boolean NavType only accepts \"true\" or \"false\" values.");
                    return null;
                }
                return Boolean.valueOf(z10);
            case DSiCameraSource.FrontCamera /* 1 */:
                return Float.valueOf(Float.parseFloat(str));
            case 2:
                if (vc.o.V(str, "0x", false)) {
                    String substring = str.substring(2);
                    p7.k.f(16);
                    parseInt = Integer.parseInt(substring, 16);
                } else {
                    parseInt = Integer.parseInt(str);
                }
                return Integer.valueOf(parseInt);
            case 3:
                if (vc.o.O(str, "L", false)) {
                    str2 = str.substring(0, str.length() - 1);
                } else {
                    str2 = str;
                }
                if (vc.o.V(str, "0x", false)) {
                    String substring2 = str2.substring(2);
                    p7.k.f(16);
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

    @Override // a7.k0
    public final void e(Bundle bundle, String str, Object obj) {
        switch (this.f558q) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                str.getClass();
                bundle.putBoolean(str, booleanValue);
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
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

    @Override // a7.k0
    public String f(Object obj) {
        switch (this.f558q) {
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
