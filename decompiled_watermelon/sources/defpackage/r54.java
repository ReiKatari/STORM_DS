package defpackage;

import java.util.Arrays;
import java.util.HashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r54  reason: default package */
/* loaded from: classes.dex */
public final class r54 extends i24 {
    public final i24 o;
    public boolean p;

    public r54(long j, ka6 ka6Var, mi2 mi2Var, mi2 mi2Var2, i24 i24Var) {
        super(j, ka6Var, mi2Var, mi2Var2);
        this.o = i24Var;
        i24Var.k();
    }

    @Override // defpackage.i24, defpackage.ga6
    public final void c() {
        if (!this.c) {
            super.c();
            if (!this.p) {
                this.p = true;
                this.o.l();
            }
        }
    }

    @Override // defpackage.i24
    public final oo2 w() {
        HashMap hashMap;
        r54 r54Var;
        i24 i24Var = this.o;
        if (!i24Var.m && !i24Var.c) {
            e24 e24Var = this.h;
            long j = this.b;
            if (e24Var != null) {
                hashMap = ma6.b(i24Var.g(), this, this.o.d());
            } else {
                hashMap = null;
            }
            Object obj = ma6.c;
            synchronized (obj) {
                try {
                    ma6.c(this);
                    if (e24Var == null || e24Var.d == 0) {
                        r54Var = this;
                        r54Var.a();
                    } else {
                        r54Var = this;
                        oo2 z = r54Var.z(this.o.g(), e24Var, hashMap, this.o.d());
                        if (!z.equals(ia6.m)) {
                            return z;
                        }
                        e24 x = r54Var.o.x();
                        if (x != null) {
                            x.j(e24Var);
                        } else {
                            r54Var.o.B(e24Var);
                            r54Var.h = null;
                        }
                    }
                    if (b53.F(r54Var.o.g(), j) < 0) {
                        r54Var.o.v();
                    }
                    i24 i24Var2 = r54Var.o;
                    i24Var2.r(i24Var2.d().c(j).b(r54Var.j));
                    r54Var.o.A(j);
                    i24 i24Var3 = r54Var.o;
                    int i = r54Var.d;
                    r54Var.d = -1;
                    if (i >= 0) {
                        int[] iArr = i24Var3.k;
                        iArr.getClass();
                        int length = iArr.length;
                        int[] copyOf = Arrays.copyOf(iArr, length + 1);
                        copyOf[length] = i;
                        i24Var3.k = copyOf;
                    } else {
                        i24Var3.getClass();
                    }
                    i24 i24Var4 = r54Var.o;
                    ka6 ka6Var = r54Var.j;
                    i24Var4.getClass();
                    synchronized (obj) {
                        i24Var4.j = i24Var4.j.i(ka6Var);
                        i24 i24Var5 = r54Var.o;
                        int[] iArr2 = r54Var.k;
                        i24Var5.getClass();
                        if (iArr2.length != 0) {
                            int[] iArr3 = i24Var5.k;
                            if (iArr3.length != 0) {
                                int length2 = iArr3.length;
                                int length3 = iArr2.length;
                                int[] copyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                                System.arraycopy(iArr2, 0, copyOf2, length2, length3);
                                iArr2 = copyOf2;
                            }
                            i24Var5.k = iArr2;
                        }
                    }
                    r54Var.m = true;
                    if (!r54Var.p) {
                        r54Var.p = true;
                        r54Var.o.l();
                    }
                    return ia6.m;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return new ha6(this);
    }
}
