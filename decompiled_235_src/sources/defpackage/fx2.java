package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fx2  reason: default package */
/* loaded from: classes.dex */
public final class fx2 extends ct7 {
    @Override // defpackage.xh1
    public final void a(xh1 xh1Var) {
        a20 a20Var = (a20) this.b;
        int i = a20Var.v0;
        ci1 ci1Var = this.h;
        ArrayList arrayList = ci1Var.l;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            int i5 = ((ci1) obj).g;
            if (i3 == -1 || i5 < i3) {
                i3 = i5;
            }
            if (i2 < i5) {
                i2 = i5;
            }
        }
        if (i != 0 && i != 2) {
            ci1Var.d(i2 + a20Var.x0);
        } else {
            ci1Var.d(i3 + a20Var.x0);
        }
    }

    @Override // defpackage.ct7
    public final void d() {
        l21 l21Var = this.b;
        if (l21Var instanceof a20) {
            ci1 ci1Var = this.h;
            ci1Var.b = true;
            ArrayList arrayList = ci1Var.l;
            a20 a20Var = (a20) l21Var;
            int i = a20Var.v0;
            boolean z = a20Var.w0;
            int i2 = 0;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            ci1Var.e = bi1.BOTTOM;
                            while (i2 < a20Var.u0) {
                                l21 l21Var2 = a20Var.t0[i2];
                                if (z || l21Var2.h0 != 8) {
                                    ci1 ci1Var2 = l21Var2.e.i;
                                    ci1Var2.k.add(ci1Var);
                                    arrayList.add(ci1Var2);
                                }
                                i2++;
                            }
                            m(this.b.e.h);
                            m(this.b.e.i);
                            return;
                        }
                        return;
                    }
                    ci1Var.e = bi1.TOP;
                    while (i2 < a20Var.u0) {
                        l21 l21Var3 = a20Var.t0[i2];
                        if (z || l21Var3.h0 != 8) {
                            ci1 ci1Var3 = l21Var3.e.h;
                            ci1Var3.k.add(ci1Var);
                            arrayList.add(ci1Var3);
                        }
                        i2++;
                    }
                    m(this.b.e.h);
                    m(this.b.e.i);
                    return;
                }
                ci1Var.e = bi1.RIGHT;
                while (i2 < a20Var.u0) {
                    l21 l21Var4 = a20Var.t0[i2];
                    if (z || l21Var4.h0 != 8) {
                        ci1 ci1Var4 = l21Var4.d.i;
                        ci1Var4.k.add(ci1Var);
                        arrayList.add(ci1Var4);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            ci1Var.e = bi1.LEFT;
            while (i2 < a20Var.u0) {
                l21 l21Var5 = a20Var.t0[i2];
                if (z || l21Var5.h0 != 8) {
                    ci1 ci1Var5 = l21Var5.d.h;
                    ci1Var5.k.add(ci1Var);
                    arrayList.add(ci1Var5);
                }
                i2++;
            }
            m(this.b.d.h);
            m(this.b.d.i);
        }
    }

    @Override // defpackage.ct7
    public final void e() {
        l21 l21Var = this.b;
        if (l21Var instanceof a20) {
            int i = ((a20) l21Var).v0;
            ci1 ci1Var = this.h;
            if (i != 0 && i != 1) {
                l21Var.a0 = ci1Var.g;
            } else {
                l21Var.Z = ci1Var.g;
            }
        }
    }

    @Override // defpackage.ct7
    public final void f() {
        this.c = null;
        this.h.c();
    }

    @Override // defpackage.ct7
    public final boolean k() {
        return false;
    }

    public final void m(ci1 ci1Var) {
        ci1 ci1Var2 = this.h;
        ci1Var2.k.add(ci1Var);
        ci1Var.l.add(ci1Var2);
    }
}
