package defpackage;

import android.util.Range;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bv6  reason: default package */
/* loaded from: classes.dex */
public final class bv6 {
    public final int a;
    public final int b;
    public final boolean c;
    public final in7 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final Range i;
    public final boolean j;

    public bv6(int i, int i2, boolean z, in7 in7Var, boolean z2, boolean z3, boolean z4, boolean z5, Range range, boolean z6) {
        in7Var.getClass();
        range.getClass();
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = in7Var;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = range;
        this.j = z6;
    }

    public static bv6 a(bv6 bv6Var, boolean z, Range range, int i) {
        int i2 = bv6Var.a;
        int i3 = bv6Var.b;
        boolean z2 = bv6Var.c;
        in7 in7Var = bv6Var.d;
        boolean z3 = bv6Var.e;
        boolean z4 = bv6Var.f;
        boolean z5 = bv6Var.g;
        if ((i & 256) != 0) {
            range = bv6Var.i;
        }
        Range range2 = range;
        boolean z6 = bv6Var.j;
        in7Var.getClass();
        range2.getClass();
        return new bv6(i2, i3, z2, in7Var, z3, z4, z5, z, range2, z6);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof bv6) {
                bv6 bv6Var = (bv6) obj;
                if (this.a != bv6Var.a || this.b != bv6Var.b || this.c != bv6Var.c || this.d != bv6Var.d || this.e != bv6Var.e || this.f != bv6Var.f || this.g != bv6Var.g || this.h != bv6Var.h || !nb3.k(this.i, bv6Var.i) || this.j != bv6Var.j) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int e = xg6.e(xg6.e(xg6.e(xg6.e((this.d.hashCode() + xg6.e(lb1.a(this.b, Integer.hashCode(this.a) * 31, 31), this.c, 31)) * 31, this.e, 31), this.f, 31), this.g, 31), this.h, 31);
        return Boolean.hashCode(this.j) + ((this.i.hashCode() + e) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FeatureSettings(cameraMode=");
        sb.append(this.a);
        sb.append(", requiredMaxBitDepth=");
        sb.append(this.b);
        sb.append(", hasVideoCapture=");
        sb.append(this.c);
        sb.append(", videoStabilization=");
        sb.append(this.d);
        sb.append(", isUltraHdrOn=");
        sb.append(this.e);
        sb.append(", isHighSpeedOn=");
        sb.append(this.f);
        sb.append(", isFeatureComboInvocation=");
        sb.append(this.g);
        sb.append(", requiresFeatureComboQuery=");
        sb.append(this.h);
        sb.append(", targetFpsRange=");
        sb.append(this.i);
        sb.append(", isStrictFpsRequired=");
        return xg6.r(sb, this.j, ')');
    }
}
