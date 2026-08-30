package defpackage;

import android.util.Range;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hj6  reason: default package */
/* loaded from: classes.dex */
public final class hj6 {
    public final int a;
    public final int b;
    public final boolean c;
    public final i97 d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final Range i;
    public final boolean j;

    public hj6(int i, int i2, boolean z, i97 i97Var, boolean z2, boolean z3, boolean z4, boolean z5, Range range, boolean z6) {
        i97Var.getClass();
        range.getClass();
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = i97Var;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = z5;
        this.i = range;
        this.j = z6;
    }

    public static hj6 a(hj6 hj6Var, boolean z, Range range, int i) {
        int i2 = hj6Var.a;
        int i3 = hj6Var.b;
        boolean z2 = hj6Var.c;
        i97 i97Var = hj6Var.d;
        boolean z3 = hj6Var.e;
        boolean z4 = hj6Var.f;
        boolean z5 = hj6Var.g;
        if ((i & 256) != 0) {
            range = hj6Var.i;
        }
        Range range2 = range;
        boolean z6 = hj6Var.j;
        i97Var.getClass();
        range2.getClass();
        return new hj6(i2, i3, z2, i97Var, z3, z4, z5, z, range2, z6);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof hj6) {
                hj6 hj6Var = (hj6) obj;
                if (this.a != hj6Var.a || this.b != hj6Var.b || this.c != hj6Var.c || this.d != hj6Var.d || this.e != hj6Var.e || this.f != hj6Var.f || this.g != hj6Var.g || this.h != hj6Var.h || !b53.x(this.i, hj6Var.i) || this.j != hj6Var.j) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int c = ej6.c(ej6.c(ej6.c(ej6.c((this.d.hashCode() + ej6.c(wh1.a(this.b, Integer.hashCode(this.a) * 31, 31), this.c, 31)) * 31, this.e, 31), this.f, 31), this.g, 31), this.h, 31);
        return Boolean.hashCode(this.j) + ((this.i.hashCode() + c) * 31);
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
        return ej6.h(sb, this.j, ')');
    }
}
