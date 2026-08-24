package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kk6  reason: default package */
/* loaded from: classes.dex */
public final class kk6 {
    public final Integer a;
    public final boolean b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final float g;

    public kk6(Integer num, boolean z, int i, int i2, boolean z2, boolean z3, float f) {
        this.a = num;
        this.b = z;
        this.c = i;
        this.d = i2;
        this.e = z2;
        this.f = z3;
        this.g = f;
    }

    public static kk6 a(kk6 kk6Var, Integer num, boolean z, int i, int i2, boolean z2, boolean z3, float f, int i3) {
        if ((i3 & 1) != 0) {
            num = kk6Var.a;
        }
        Integer num2 = num;
        if ((i3 & 2) != 0) {
            z = kk6Var.b;
        }
        boolean z4 = z;
        if ((i3 & 4) != 0) {
            i = kk6Var.c;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = kk6Var.d;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            z2 = kk6Var.e;
        }
        boolean z5 = z2;
        if ((i3 & 32) != 0) {
            z3 = kk6Var.f;
        }
        boolean z6 = z3;
        if ((i3 & 64) != 0) {
            f = kk6Var.g;
        }
        kk6Var.getClass();
        return new kk6(num2, z4, i4, i5, z5, z6, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kk6)) {
            return false;
        }
        kk6 kk6Var = (kk6) obj;
        if (nb3.k(this.a, kk6Var.a) && this.b == kk6Var.b && this.c == kk6Var.c && this.d == kk6Var.d && this.e == kk6Var.e && this.f == kk6Var.f && Float.compare(this.g, kk6Var.g) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        Integer num = this.a;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        return Float.hashCode(this.g) + xg6.e(xg6.e(lb1.a(this.d, lb1.a(this.c, xg6.e(hashCode * 31, this.b, 31), 31), 31), this.e, 31), this.f, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Slot2AnalogMapping(deviceId=");
        sb.append(this.a);
        sb.append(", useDeviceFilter=");
        sb.append(this.b);
        sb.append(", axisXCode=");
        lb1.x(sb, this.c, ", axisYCode=", this.d, ", invertX=");
        sb.append(this.e);
        sb.append(", invertY=");
        sb.append(this.f);
        sb.append(", deadzone=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ kk6() {
        this(null, false, 0, 1, false, false, 0.1f);
    }
}
