package defpackage;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qk2  reason: default package */
/* loaded from: classes.dex */
public final class qk2 extends dv0 {
    public final long a;
    public final boolean b;
    public final boolean c;
    public HashSet d;
    public final e24 e;
    public final tj4 f;
    public final /* synthetic */ sk2 g;

    public qk2(sk2 sk2Var, long j, boolean z, boolean z2, bq0 bq0Var) {
        this.g = sk2Var;
        this.a = j;
        this.b = z;
        this.c = z2;
        e24 e24Var = xu5.a;
        this.e = new e24();
        this.f = new tj4(sm4.R, sn1.q0);
    }

    @Override // defpackage.dv0
    public final void a(iv0 iv0Var, aj2 aj2Var) {
        this.g.b.a(iv0Var, aj2Var);
    }

    @Override // defpackage.dv0
    public final e24 b(iv0 iv0Var, x56 x56Var, aj2 aj2Var) {
        return this.g.b.b(iv0Var, x56Var, aj2Var);
    }

    @Override // defpackage.dv0
    public final void c() {
        sk2 sk2Var = this.g;
        sk2Var.A--;
    }

    @Override // defpackage.dv0
    public final boolean d() {
        return this.g.b.d();
    }

    @Override // defpackage.dv0
    public final boolean e() {
        return this.b;
    }

    @Override // defpackage.dv0
    public final boolean f() {
        return this.c;
    }

    @Override // defpackage.dv0
    public final long g() {
        return this.a;
    }

    @Override // defpackage.dv0
    public final cv0 h() {
        return this.g.h;
    }

    @Override // defpackage.dv0
    public final sm4 i() {
        return (sm4) this.f.getValue();
    }

    @Override // defpackage.dv0
    public final e31 j() {
        return this.g.b.j();
    }

    @Override // defpackage.dv0
    public final boolean k() {
        return this.g.b.k();
    }

    @Override // defpackage.dv0
    public final void l(iv0 iv0Var) {
        sk2 sk2Var = this.g;
        sk2Var.b.l(sk2Var.h);
        sk2Var.b.l(iv0Var);
    }

    @Override // defpackage.dv0
    public final i04 m(j04 j04Var) {
        return this.g.b.m(j04Var);
    }

    @Override // defpackage.dv0
    public final e24 n(iv0 iv0Var, x56 x56Var, e24 e24Var) {
        return this.g.b.n(iv0Var, x56Var, e24Var);
    }

    @Override // defpackage.dv0
    public final void o(Set set) {
        HashSet hashSet = this.d;
        if (hashSet == null) {
            hashSet = new HashSet();
            this.d = hashSet;
        }
        hashSet.add(set);
    }

    @Override // defpackage.dv0
    public final void p(sk2 sk2Var) {
        this.e.a(sk2Var);
    }

    @Override // defpackage.dv0
    public final void q(m55 m55Var) {
        this.g.b.q(m55Var);
    }

    @Override // defpackage.dv0
    public final void r(iv0 iv0Var) {
        this.g.b.r(iv0Var);
    }

    @Override // defpackage.dv0
    public final kh0 s(dj djVar) {
        return this.g.b.s(djVar);
    }

    @Override // defpackage.dv0
    public final void t() {
        this.g.A++;
    }

    @Override // defpackage.dv0
    public final void u(sk2 sk2Var) {
        HashSet hashSet = this.d;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                sk2Var.getClass();
                ((Set) it.next()).remove(sk2Var.w());
            }
        }
        if (sk2Var != null) {
            this.e.l(sk2Var);
        }
    }

    @Override // defpackage.dv0
    public final void v(iv0 iv0Var) {
        this.g.b.v(iv0Var);
    }

    public final void w() {
        e24 e24Var = this.e;
        if (e24Var.h()) {
            HashSet hashSet = this.d;
            if (hashSet != null) {
                Object[] objArr = e24Var.b;
                long[] jArr = e24Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i = 0;
                    while (true) {
                        long j = jArr[i];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i2 = 8 - ((~(i - length)) >>> 31);
                            for (int i3 = 0; i3 < i2; i3++) {
                                if ((255 & j) < 128) {
                                    sk2 sk2Var = (sk2) objArr[(i << 3) + i3];
                                    Iterator it = hashSet.iterator();
                                    while (it.hasNext()) {
                                        ((Set) it.next()).remove(sk2Var.w());
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
            e24Var.b();
        }
    }
}
