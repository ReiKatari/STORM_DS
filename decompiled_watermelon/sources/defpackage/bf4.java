package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bf4  reason: default package */
/* loaded from: classes.dex */
public final class bf4 extends mj2 {
    public int d0;
    public int f0;
    public int h0;
    public ze4[] c0 = new ze4[16];
    public int[] e0 = new int[16];
    public Object[] g0 = new Object[16];

    public final void e0() {
        this.d0 = 0;
        this.f0 = 0;
        Arrays.fill(this.g0, 0, this.h0, (Object) null);
        this.h0 = 0;
    }

    public final void f0(xs xsVar, z86 z86Var, r8 r8Var, af4 af4Var) {
        if (this.d0 != 0) {
            yp0 yp0Var = new yp0(this);
            bf4 bf4Var = (bf4) yp0Var.e;
            while (true) {
                ze4 ze4Var = bf4Var.c0[yp0Var.b];
                mk2 d = ze4Var.d(yp0Var);
                xs xsVar2 = xsVar;
                z86 z86Var2 = z86Var;
                r8 r8Var2 = r8Var;
                af4 af4Var2 = af4Var;
                try {
                    ze4Var.c(yp0Var, xsVar2, z86Var2, r8Var2, af4Var2);
                    int i = yp0Var.b;
                    int i2 = bf4Var.d0;
                    if (i < i2) {
                        ze4 ze4Var2 = bf4Var.c0[i];
                        yp0Var.c += ze4Var2.b;
                        yp0Var.d += ze4Var2.c;
                        int i3 = i + 1;
                        yp0Var.b = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        xsVar = xsVar2;
                        z86Var = z86Var2;
                        r8Var = r8Var2;
                        af4Var = af4Var2;
                    } else {
                        break;
                    }
                } catch (Throwable th) {
                    if (af4Var2 != null) {
                        f34.U(th, new t6(d, z86Var2, af4Var2, 15));
                    }
                    throw th;
                }
            }
        }
        e0();
    }

    public final boolean g0() {
        if (this.d0 == 0) {
            return true;
        }
        return false;
    }

    public final void h0(ze4 ze4Var) {
        int i;
        int i2;
        int i3 = this.d0;
        ze4[] ze4VarArr = this.c0;
        int i4 = 1024;
        if (i3 == ze4VarArr.length) {
            if (i3 > 1024) {
                i2 = 1024;
            } else {
                i2 = i3;
            }
            ze4[] ze4VarArr2 = new ze4[i2 + i3];
            System.arraycopy(ze4VarArr, 0, ze4VarArr2, 0, i3);
            this.c0 = ze4VarArr2;
        }
        int i5 = this.f0;
        int i6 = ze4Var.b;
        int i7 = ze4Var.c;
        int i8 = i5 + i6;
        int[] iArr = this.e0;
        int length = iArr.length;
        if (i8 > length) {
            if (length > 1024) {
                i = 1024;
            } else {
                i = length;
            }
            int i9 = i + length;
            if (i9 >= i8) {
                i8 = i9;
            }
            int[] iArr2 = new int[i8];
            nu.d0(0, 0, length, iArr, iArr2);
            this.e0 = iArr2;
        }
        int i10 = this.h0 + i7;
        Object[] objArr = this.g0;
        int length2 = objArr.length;
        if (i10 > length2) {
            if (length2 <= 1024) {
                i4 = length2;
            }
            int i11 = i4 + length2;
            if (i11 >= i10) {
                i10 = i11;
            }
            Object[] objArr2 = new Object[i10];
            System.arraycopy(objArr, 0, objArr2, 0, length2);
            this.g0 = objArr2;
        }
        ze4[] ze4VarArr3 = this.c0;
        int i12 = this.d0;
        this.d0 = i12 + 1;
        ze4VarArr3[i12] = ze4Var;
        this.f0 += ze4Var.b;
        this.h0 += i7;
    }
}
