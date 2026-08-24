package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vq2  reason: default package */
/* loaded from: classes.dex */
public final class vq2 extends zx0 {
    public final long a;
    public final boolean b;
    public final boolean c;
    public HashSet d;
    public final ka4 e;
    public final vs4 f;
    public final /* synthetic */ xq2 g;

    public vq2(xq2 xq2Var, long j, boolean z, boolean z2, os0 os0Var) {
        this.g = xq2Var;
        this.a = j;
        this.b = z;
        this.c = z2;
        ka4 ka4Var = c66.a;
        this.e = new ka4();
        this.f = new vs4(xv4.R, vs0.s0);
    }

    @Override // defpackage.zx0
    public final void a(ey0 ey0Var, eo2 eo2Var) {
        this.g.b.a(ey0Var, eo2Var);
    }

    @Override // defpackage.zx0
    public final ka4 b(ey0 ey0Var, kh6 kh6Var, eo2 eo2Var) {
        return this.g.b.b(ey0Var, kh6Var, eo2Var);
    }

    @Override // defpackage.zx0
    public final void c() {
        xq2 xq2Var = this.g;
        xq2Var.A--;
    }

    @Override // defpackage.zx0
    public final boolean d() {
        return this.g.b.d();
    }

    @Override // defpackage.zx0
    public final boolean e() {
        return this.b;
    }

    @Override // defpackage.zx0
    public final boolean f() {
        return this.c;
    }

    @Override // defpackage.zx0
    public final long g() {
        return this.a;
    }

    @Override // defpackage.zx0
    public final yx0 h() {
        return this.g.h;
    }

    @Override // defpackage.zx0
    public final xv4 i() {
        return (xv4) this.f.getValue();
    }

    @Override // defpackage.zx0
    public final l61 j() {
        return this.g.b.j();
    }

    @Override // defpackage.zx0
    public final boolean k() {
        return this.g.b.k();
    }

    @Override // defpackage.zx0
    public final void l(ey0 ey0Var) {
        xq2 xq2Var = this.g;
        xq2Var.b.l(xq2Var.h);
        xq2Var.b.l(ey0Var);
    }

    @Override // defpackage.zx0
    public final n84 m(o84 o84Var) {
        return this.g.b.m(o84Var);
    }

    @Override // defpackage.zx0
    public final ka4 n(ey0 ey0Var, kh6 kh6Var, ka4 ka4Var) {
        return this.g.b.n(ey0Var, kh6Var, ka4Var);
    }

    @Override // defpackage.zx0
    public final void o(Set set) {
        HashSet hashSet = this.d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // defpackage.zx0
    public final void p(xq2 xq2Var) {
        this.e.a(xq2Var);
    }

    @Override // defpackage.zx0
    public final void q(cf5 cf5Var) {
        this.g.b.q(cf5Var);
    }

    @Override // defpackage.zx0
    public final void r(ey0 ey0Var) {
        this.g.b.r(ey0Var);
    }

    @Override // defpackage.zx0
    public final tj0 s(pj pjVar) {
        return this.g.b.s(pjVar);
    }

    @Override // defpackage.zx0
    public final void t() {
        this.g.A++;
    }

    @Override // defpackage.zx0
    public final void u(xq2 xq2Var) {
        HashSet hashSet = this.d;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                xq2Var.getClass();
                ((Set) it.next()).remove(xq2Var.y());
            }
        }
        if (xq2Var != null) {
            this.e.l(xq2Var);
        }
    }

    @Override // defpackage.zx0
    public final void v(ey0 ey0Var) {
        this.g.b.v(ey0Var);
    }

    public final void w() {
        ka4 ka4Var = this.e;
        if (ka4Var.h()) {
            HashSet hashSet = this.d;
            if (hashSet != null) {
                Object[] objArr = ka4Var.b;
                long[] jArr = ka4Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    xq2 xq2Var = (xq2) objArr[(i << 3) + i3];
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        ((Set) it.next()).remove(xq2Var.y());
                                    }
                                }
                                j >>= 8;
                            }
                            if (i2 != 8) {
                                break;
                            }
                        }
                        if (i == length) {
                            break;
                        }
                        i++;
                    }
                }
            }
            ka4Var.b();
        }
    }
}
