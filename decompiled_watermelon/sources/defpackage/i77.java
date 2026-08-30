package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i77  reason: default package */
/* loaded from: classes.dex */
public final class i77 extends g77 {
    public final String A;
    public final List B;
    public final int L;
    public final b60 R;
    public final float X;
    public final b60 Y;
    public final float Z;
    public final float c0;
    public final int d0;
    public final int e0;
    public final float f0;
    public final float g0;
    public final float h0;
    public final float i0;

    public i77(String str, List list, int i, b60 b60Var, float f, b60 b60Var2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.A = str;
        this.B = list;
        this.L = i;
        this.R = b60Var;
        this.X = f;
        this.Y = b60Var2;
        this.Z = f2;
        this.c0 = f3;
        this.d0 = i2;
        this.e0 = i3;
        this.f0 = f4;
        this.g0 = f5;
        this.h0 = f6;
        this.i0 = f7;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj != null && i77.class == obj.getClass()) {
                i77 i77Var = (i77) obj;
                if (this.A.equals(i77Var.A) && b53.x(this.R, i77Var.R) && this.X == i77Var.X && b53.x(this.Y, i77Var.Y) && this.Z == i77Var.Z && this.c0 == i77Var.c0 && this.d0 == i77Var.d0 && this.e0 == i77Var.e0 && this.f0 == i77Var.f0 && this.g0 == i77Var.g0 && this.h0 == i77Var.h0 && this.i0 == i77Var.i0 && this.L == i77Var.L && b53.x(this.B, i77Var.B)) {
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
        int b = b31.b(this.A.hashCode() * 31, 31, this.B);
        int i2 = 0;
        b60 b60Var = this.R;
        if (b60Var != null) {
            i = b60Var.hashCode();
        } else {
            i = 0;
        }
        int a = ej6.a(this.X, (b + i) * 31, 31);
        b60 b60Var2 = this.Y;
        if (b60Var2 != null) {
            i2 = b60Var2.hashCode();
        }
        return Integer.hashCode(this.L) + ej6.a(this.i0, ej6.a(this.h0, ej6.a(this.g0, ej6.a(this.f0, wh1.a(this.e0, wh1.a(this.d0, ej6.a(this.c0, ej6.a(this.Z, (a + i2) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
