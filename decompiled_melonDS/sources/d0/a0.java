package d0;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a0 {

    /* renamed from: c  reason: collision with root package name */
    public static final a0 f3319c = new a0(0, 0);

    /* renamed from: d  reason: collision with root package name */
    public static final a0 f3320d = new a0(1, 8);

    /* renamed from: e  reason: collision with root package name */
    public static final a0 f3321e = new a0(3, 10);

    /* renamed from: f  reason: collision with root package name */
    public static final a0 f3322f = new a0(4, 10);

    /* renamed from: g  reason: collision with root package name */
    public static final a0 f3323g = new a0(5, 10);

    /* renamed from: h  reason: collision with root package name */
    public static final a0 f3324h = new a0(6, 10);

    /* renamed from: i  reason: collision with root package name */
    public static final a0 f3325i = new a0(6, 8);

    /* renamed from: a  reason: collision with root package name */
    public final int f3326a;

    /* renamed from: b  reason: collision with root package name */
    public final int f3327b;

    public a0(int i2, int i10) {
        this.f3326a = i2;
        this.f3327b = i10;
    }

    public final boolean a() {
        if (b() && this.f3326a != 1 && this.f3327b == 10) {
            return true;
        }
        return false;
    }

    public final boolean b() {
        int i2 = this.f3326a;
        if (i2 != 0 && i2 != 2 && this.f3327b != 0) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a0) {
            a0 a0Var = (a0) obj;
            if (this.f3326a == a0Var.f3326a && this.f3327b == a0Var.f3327b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.f3326a ^ 1000003) * 1000003) ^ this.f3327b;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("DynamicRange@");
        sb2.append(Integer.toHexString(System.identityHashCode(this)));
        sb2.append("{encoding=");
        switch (this.f3326a) {
            case 0:
                str = "UNSPECIFIED";
                break;
            case DSiCameraSource.FrontCamera /* 1 */:
                str = "SDR";
                break;
            case 2:
                str = "HDR_UNSPECIFIED";
                break;
            case 3:
                str = "HLG";
                break;
            case 4:
                str = "HDR10";
                break;
            case l1.c.f8511g /* 5 */:
                str = "HDR10_PLUS";
                break;
            case l1.c.f8509e /* 6 */:
                str = "DOLBY_VISION";
                break;
            default:
                str = "<Unknown>";
                break;
        }
        sb2.append(str);
        sb2.append(", bitDepth=");
        return w.d.q(sb2, this.f3327b, "}");
    }
}
