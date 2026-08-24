package defpackage;

import java.util.Arrays;
import java.util.HashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xd4  reason: default package */
/* loaded from: classes.dex */
public final class xd4 extends oa4 {
    public final oa4 o;
    public boolean p;

    public xd4(long j, zl6 zl6Var, qn2 qn2Var, qn2 qn2Var2, oa4 oa4Var) {
        super(j, zl6Var, qn2Var, qn2Var2);
        this.o = oa4Var;
        oa4Var.k();
    }

    @Override // defpackage.oa4, defpackage.vl6
    public final void c() {
        if (!this.c) {
            super.c();
            if (!this.p) {
                this.p = true;
                this.o.l();
            }
        }
    }

    @Override // defpackage.oa4
    public final qo2 w() {
        HashMap hashMap;
        xd4 xd4Var;
        oa4 oa4Var = this.o;
        if (!oa4Var.m && !oa4Var.c) {
            ka4 ka4Var = this.h;
            long j = this.b;
            if (ka4Var != null) {
                hashMap = bm6.b(oa4Var.g(), this, this.o.d());
            } else {
                hashMap = null;
            }
            Object obj = bm6.c;
            synchronized (obj) {
                try {
                    bm6.c(this);
                    if (ka4Var == null || ka4Var.d == 0) {
                        xd4Var = this;
                        xd4Var.a();
                    } else {
                        xd4Var = this;
                        qo2 z = xd4Var.z(this.o.g(), ka4Var, hashMap, this.o.d());
                        if (!z.equals(xl6.b)) {
                            return z;
                        }
                        ka4 x = xd4Var.o.x();
                        if (x != null) {
                            x.j(ka4Var);
                        } else {
                            xd4Var.o.B(ka4Var);
                            xd4Var.h = null;
                        }
                    }
                    if (nb3.q(xd4Var.o.g(), j) < 0) {
                        xd4Var.o.v();
                    }
                    oa4 oa4Var2 = xd4Var.o;
                    oa4Var2.r(oa4Var2.d().b(j).a(xd4Var.j));
                    xd4Var.o.A(j);
                    oa4 oa4Var3 = xd4Var.o;
                    int i = xd4Var.d;
                    xd4Var.d = -1;
                    if (i >= 0) {
                        int[] iArr = oa4Var3.k;
                        iArr.getClass();
                        int length = iArr.length;
                        int[] copyOf = Arrays.copyOf(iArr, length + 1);
                        copyOf[length] = i;
                        oa4Var3.k = copyOf;
                    } else {
                        oa4Var3.getClass();
                    }
                    oa4 oa4Var4 = xd4Var.o;
                    zl6 zl6Var = xd4Var.j;
                    oa4Var4.getClass();
                    synchronized (obj) {
                        oa4Var4.j = oa4Var4.j.d(zl6Var);
                        oa4 oa4Var5 = xd4Var.o;
                        int[] iArr2 = xd4Var.k;
                        oa4Var5.getClass();
                        if (iArr2.length != 0) {
                            int[] iArr3 = oa4Var5.k;
                            if (iArr3.length != 0) {
                                int length2 = iArr3.length;
                                int length3 = iArr2.length;
                                int[] copyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                                System.arraycopy(iArr2, 0, copyOf2, length2, length3);
                                iArr2 = copyOf2;
                            }
                            oa4Var5.k = iArr2;
                        }
                    }
                    xd4Var.m = true;
                    if (!xd4Var.p) {
                        xd4Var.p = true;
                        xd4Var.o.l();
                    }
                    return xl6.b;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return new wl6(this);
    }
}
