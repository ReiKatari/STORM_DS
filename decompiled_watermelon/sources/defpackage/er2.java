package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: er2  reason: default package */
/* loaded from: classes.dex */
public final class er2 extends be7 {
    @Override // defpackage.ud1
    public final void a(ud1 ud1Var) {
        j00 j00Var = (j00) this.b;
        int i = j00Var.v0;
        yd1 yd1Var = this.h;
        ArrayList arrayList = yd1Var.l;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = -1;
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            int i5 = ((yd1) obj).g;
            if (i3 == -1 || i5 < i3) {
                i3 = i5;
            }
            if (i2 < i5) {
                i2 = i5;
            }
        }
        if (i != 0 && i != 2) {
            yd1Var.d(i2 + j00Var.x0);
        } else {
            yd1Var.d(i3 + j00Var.x0);
        }
    }

    @Override // defpackage.be7
    public final void d() {
        gz0 gz0Var = this.b;
        if (gz0Var instanceof j00) {
            yd1 yd1Var = this.h;
            yd1Var.b = true;
            ArrayList arrayList = yd1Var.l;
            j00 j00Var = (j00) gz0Var;
            int i = j00Var.v0;
            boolean z = j00Var.w0;
            int i2 = 0;
            if (i != 0) {
                if (i != 1) {
                    if (i != 2) {
                        if (i == 3) {
                            yd1Var.e = xd1.BOTTOM;
                            while (i2 < j00Var.u0) {
                                gz0 gz0Var2 = j00Var.t0[i2];
                                if (z || gz0Var2.h0 != 8) {
                                    yd1 yd1Var2 = gz0Var2.e.i;
                                    yd1Var2.k.add(yd1Var);
                                    arrayList.add(yd1Var2);
                                }
                                i2++;
                            }
                            m(this.b.e.h);
                            m(this.b.e.i);
                            return;
                        }
                        return;
                    }
                    yd1Var.e = xd1.TOP;
                    while (i2 < j00Var.u0) {
                        gz0 gz0Var3 = j00Var.t0[i2];
                        if (z || gz0Var3.h0 != 8) {
                            yd1 yd1Var3 = gz0Var3.e.h;
                            yd1Var3.k.add(yd1Var);
                            arrayList.add(yd1Var3);
                        }
                        i2++;
                    }
                    m(this.b.e.h);
                    m(this.b.e.i);
                    return;
                }
                yd1Var.e = xd1.RIGHT;
                while (i2 < j00Var.u0) {
                    gz0 gz0Var4 = j00Var.t0[i2];
                    if (z || gz0Var4.h0 != 8) {
                        yd1 yd1Var4 = gz0Var4.d.i;
                        yd1Var4.k.add(yd1Var);
                        arrayList.add(yd1Var4);
                    }
                    i2++;
                }
                m(this.b.d.h);
                m(this.b.d.i);
                return;
            }
            yd1Var.e = xd1.LEFT;
            while (i2 < j00Var.u0) {
                gz0 gz0Var5 = j00Var.t0[i2];
                if (z || gz0Var5.h0 != 8) {
                    yd1 yd1Var5 = gz0Var5.d.h;
                    yd1Var5.k.add(yd1Var);
                    arrayList.add(yd1Var5);
                }
                i2++;
            }
            m(this.b.d.h);
            m(this.b.d.i);
        }
    }

    @Override // defpackage.be7
    public final void e() {
        gz0 gz0Var = this.b;
        if (gz0Var instanceof j00) {
            int i = ((j00) gz0Var).v0;
            yd1 yd1Var = this.h;
            if (i != 0 && i != 1) {
                gz0Var.a0 = yd1Var.g;
            } else {
                gz0Var.Z = yd1Var.g;
            }
        }
    }

    @Override // defpackage.be7
    public final void f() {
        this.c = null;
        this.h.c();
    }

    @Override // defpackage.be7
    public final boolean k() {
        return false;
    }

    public final void m(yd1 yd1Var) {
        yd1 yd1Var2 = this.h;
        yd1Var2.k.add(yd1Var);
        yd1Var.l.add(yd1Var2);
    }
}
