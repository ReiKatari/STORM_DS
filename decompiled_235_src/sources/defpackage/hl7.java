package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hl7  reason: default package */
/* loaded from: classes.dex */
public final class hl7 extends fl7 {
    public final String A;
    public final List B;
    public final int L;
    public final f80 R;
    public final float X;
    public final f80 Y;
    public final float Z;
    public final float d0;
    public final int e0;
    public final int f0;
    public final float g0;
    public final float h0;
    public final float i0;
    public final float j0;

    public hl7(String str, List list, int i, f80 f80Var, float f, f80 f80Var2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.A = str;
        this.B = list;
        this.L = i;
        this.R = f80Var;
        this.X = f;
        this.Y = f80Var2;
        this.Z = f2;
        this.d0 = f3;
        this.e0 = i2;
        this.f0 = i3;
        this.g0 = f4;
        this.h0 = f5;
        this.i0 = f6;
        this.j0 = f7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && hl7.class == obj.getClass()) {
                hl7 hl7Var = (hl7) obj;
                if (this.A.equals(hl7Var.A) && nb3.k(this.R, hl7Var.R) && this.X == hl7Var.X && nb3.k(this.Y, hl7Var.Y) && this.Z == hl7Var.Z && this.d0 == hl7Var.d0 && this.e0 == hl7Var.e0 && this.f0 == hl7Var.f0 && this.g0 == hl7Var.g0 && this.h0 == hl7Var.h0 && this.i0 == hl7Var.i0 && this.j0 == hl7Var.j0 && this.L == hl7Var.L && nb3.k(this.B, hl7Var.B)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int b = i61.b(this.A.hashCode() * 31, this.B, 31);
        int i2 = 0;
        f80 f80Var = this.R;
        if (f80Var != null) {
            i = f80Var.hashCode();
        } else {
            i = 0;
        }
        int a = xg6.a(this.X, (b + i) * 31, 31);
        f80 f80Var2 = this.Y;
        if (f80Var2 != null) {
            i2 = f80Var2.hashCode();
        }
        return Integer.hashCode(this.L) + xg6.a(this.j0, xg6.a(this.i0, xg6.a(this.h0, xg6.a(this.g0, lb1.a(this.f0, lb1.a(this.e0, xg6.a(this.d0, xg6.a(this.Z, (a + i2) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
