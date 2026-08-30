package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: u86  reason: default package */
/* loaded from: classes.dex */
public final class u86 {
    public final Integer a;
    public final boolean b;
    public final int c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final float g;

    public u86(Integer num, boolean z, int i, int i2, boolean z2, boolean z3, float f) {
        this.a = num;
        this.b = z;
        this.c = i;
        this.d = i2;
        this.e = z2;
        this.f = z3;
        this.g = f;
    }

    public static u86 a(u86 u86Var, Integer num, boolean z, int i, int i2, boolean z2, boolean z3, float f, int i3) {
        if ((i3 & 1) != 0) {
            num = u86Var.a;
        }
        Integer num2 = num;
        if ((i3 & 2) != 0) {
            z = u86Var.b;
        }
        boolean z4 = z;
        if ((i3 & 4) != 0) {
            i = u86Var.c;
        }
        int i4 = i;
        if ((i3 & 8) != 0) {
            i2 = u86Var.d;
        }
        int i5 = i2;
        if ((i3 & 16) != 0) {
            z2 = u86Var.e;
        }
        boolean z5 = z2;
        if ((i3 & 32) != 0) {
            z3 = u86Var.f;
        }
        boolean z6 = z3;
        if ((i3 & 64) != 0) {
            f = u86Var.g;
        }
        u86Var.getClass();
        return new u86(num2, z4, i4, i5, z5, z6, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u86)) {
            return false;
        }
        u86 u86Var = (u86) obj;
        if (b53.x(this.a, u86Var.a) && this.b == u86Var.b && this.c == u86Var.c && this.d == u86Var.d && this.e == u86Var.e && this.f == u86Var.f && Float.compare(this.g, u86Var.g) == 0) {
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
        return Float.hashCode(this.g) + ej6.c(ej6.c(wh1.a(this.d, wh1.a(this.c, ej6.c(hashCode * 31, this.b, 31), 31), 31), this.e, 31), this.f, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Slot2AnalogMapping(deviceId=");
        sb.append(this.a);
        sb.append(", useDeviceFilter=");
        sb.append(this.b);
        sb.append(", axisXCode=");
        b31.A(sb, this.c, ", axisYCode=", this.d, ", invertX=");
        sb.append(this.e);
        sb.append(", invertY=");
        sb.append(this.f);
        sb.append(", deadzone=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }

    public /* synthetic */ u86() {
        this(null, false, 0, 1, false, false, 0.1f);
    }
}
