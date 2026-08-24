package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: co4  reason: default package */
/* loaded from: classes.dex */
public final class co4 extends kn2 {
    public int d;
    public int f;
    public int h;
    public ao4[] c = new ao4[16];
    public int[] e = new int[16];
    public Object[] g = new Object[16];

    public final void e0() {
        this.d = 0;
        this.f = 0;
        Arrays.fill(this.g, 0, this.h, (Object) null);
        this.h = 0;
    }

    public final void f0(nt ntVar, pk6 pk6Var, jb1 jb1Var, bo4 bo4Var) {
        if (this.d != 0) {
            ls0 ls0Var = new ls0(this);
            co4 co4Var = (co4) ls0Var.e;
            while (true) {
                ao4 ao4Var = co4Var.c[ls0Var.b];
                sq2 d = ao4Var.d(ls0Var);
                nt ntVar2 = ntVar;
                pk6 pk6Var2 = pk6Var;
                jb1 jb1Var2 = jb1Var;
                bo4 bo4Var2 = bo4Var;
                try {
                    ao4Var.c(ls0Var, ntVar2, pk6Var2, jb1Var2, bo4Var2);
                    int i = ls0Var.b;
                    int i2 = co4Var.d;
                    if (i < i2) {
                        ao4 ao4Var2 = co4Var.c[i];
                        ls0Var.c += ao4Var2.b;
                        ls0Var.d += ao4Var2.c;
                        int i3 = i + 1;
                        ls0Var.b = i3;
                        if (i3 >= i2) {
                            break;
                        }
                        ntVar = ntVar2;
                        pk6Var = pk6Var2;
                        jb1Var = jb1Var2;
                        bo4Var = bo4Var2;
                    } else {
                        break;
                    }
                } catch (Throwable th) {
                    if (bo4Var2 != null) {
                        nw7.s0(th, new u6(d, pk6Var2, bo4Var2, 15));
                    }
                    throw th;
                }
            }
        }
        e0();
    }

    public final boolean g0() {
        if (this.d == 0) {
            return true;
        }
        return false;
    }

    public final void h0(ao4 ao4Var) {
        int i;
        int i2;
        int i3 = this.d;
        ao4[] ao4VarArr = this.c;
        int i4 = 1024;
        if (i3 == ao4VarArr.length) {
            if (i3 > 1024) {
                i2 = 1024;
            } else {
                i2 = i3;
            }
            ao4[] ao4VarArr2 = new ao4[i2 + i3];
            System.arraycopy(ao4VarArr, 0, ao4VarArr2, 0, i3);
            this.c = ao4VarArr2;
        }
        int i5 = this.f;
        int i6 = ao4Var.b;
        int i7 = ao4Var.c;
        int i8 = i5 + i6;
        int[] iArr = this.e;
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
            fv.r0(0, 0, length, iArr, iArr2);
            this.e = iArr2;
        }
        int i10 = this.h + i7;
        Object[] objArr = this.g;
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
            this.g = objArr2;
        }
        ao4[] ao4VarArr3 = this.c;
        int i12 = this.d;
        this.d = i12 + 1;
        ao4VarArr3[i12] = ao4Var;
        this.f += ao4Var.b;
        this.h += i7;
    }
}
