package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pk3  reason: default package */
/* loaded from: classes.dex */
public final class pk3 implements sw5 {
    public static final ci3 y = io2.X(new qt0(16), new gi3(3));
    public final sa1 a;
    public boolean b;
    public jk3 c;
    public boolean d;
    public final bi3 e;
    public final tj4 f;
    public final l14 g;
    public float h;
    public boolean i;
    public final db1 j;
    public final boolean k;
    public vf3 l;
    public final ii3 m;
    public final ay n;
    public final bj3 o;
    public final l50 p;
    public final qj3 q;
    public final ka3 r;
    public final nj3 s;
    public final k24 t;
    public final tj4 u;
    public final tj4 v;
    public final k24 w;
    public final ci3 x;

    /* JADX WARN: Type inference failed for: r0v0, types: [sa1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v5, types: [ay, java.lang.Object] */
    public pk3(int i, int i2) {
        ?? obj = new Object();
        obj.a = -1;
        obj.c = -1;
        this.a = obj;
        this.e = new bi3(i, i2, 1);
        this.f = new tj4(qk3.a, k45.f0);
        this.g = new l14();
        this.j = new db1(new kb2(8, this));
        this.k = true;
        this.m = new ii3(this, 1);
        this.n = new Object();
        this.o = new bj3();
        this.p = new l50(1);
        this.q = new qj3(new mk3(this, i));
        this.r = new ka3(5, this);
        this.s = new nj3();
        this.t = jk2.o();
        Boolean bool = Boolean.FALSE;
        this.u = me2.G(bool);
        this.v = me2.G(bool);
        this.w = jk2.o();
        this.x = new ci3(2);
    }

    public static Object l(pk3 pk3Var, int i, nk6 nk6Var) {
        pk3Var.getClass();
        Object e = pk3Var.e(r24.Default, new a6(pk3Var, i, null, 27), nk6Var);
        if (e == p31.COROUTINE_SUSPENDED) {
            return e;
        }
        return o27.a;
    }

    @Override // defpackage.sw5
    public final boolean a() {
        return ((Boolean) this.v.getValue()).booleanValue();
    }

    @Override // defpackage.sw5
    public final boolean b() {
        return this.j.b();
    }

    @Override // defpackage.sw5
    public final boolean c() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    @Override // defpackage.sw5
    public final float d(float f) {
        return this.j.d(f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
        if (r6.n.h(r0) == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
        if (r6.j.e(r7, r8, r0) != r1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0069, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003c  */
    @Override // defpackage.sw5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(defpackage.r24 r7, defpackage.aj2 r8, defpackage.j11 r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof defpackage.ok3
            if (r0 == 0) goto L13
            r0 = r9
            ok3 r0 = (defpackage.ok3) r0
            int r1 = r0.c0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c0 = r1
            goto L18
        L13:
            ok3 r0 = new ok3
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.Y
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.c0
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L3c
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.me2.a0(r9)
            goto L6a
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r6)
            return r3
        L31:
            nk6 r7 = r0.X
            r8 = r7
            aj2 r8 = (defpackage.aj2) r8
            r24 r7 = r0.R
            defpackage.me2.a0(r9)
            goto L5b
        L3c:
            defpackage.me2.a0(r9)
            tj4 r9 = r6.f
            java.lang.Object r9 = r9.getValue()
            jk3 r2 = defpackage.qk3.a
            if (r9 != r2) goto L5b
            r0.R = r7
            r9 = r8
            nk6 r9 = (defpackage.nk6) r9
            r0.X = r9
            r0.c0 = r5
            ay r9 = r6.n
            java.lang.Object r9 = r9.h(r0)
            if (r9 != r1) goto L5b
            goto L69
        L5b:
            r0.R = r3
            r0.X = r3
            r0.c0 = r4
            db1 r6 = r6.j
            java.lang.Object r6 = r6.e(r7, r8, r0)
            if (r6 != r1) goto L6a
        L69:
            return r1
        L6a:
            o27 r6 = defpackage.o27.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pk3.e(r24, aj2, j11):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Type inference failed for: r6v2, types: [o27, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(int r7, defpackage.k11 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.nk3
            if (r0 == 0) goto L13
            r0 = r8
            nk3 r0 = (defpackage.nk3) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            nk3 r0 = new nk3
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L31
            if (r2 != r5) goto L2b
            defpackage.me2.a0(r8)     // Catch: java.lang.Throwable -> L29
            goto L46
        L29:
            r7 = move-exception
            goto L4b
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r6)
            return r3
        L31:
            defpackage.me2.a0(r8)
            r6.i = r5     // Catch: java.lang.Throwable -> L29
            pr1 r8 = new pr1     // Catch: java.lang.Throwable -> L29
            r8.<init>(r6, r7, r3)     // Catch: java.lang.Throwable -> L29
            r0.Y = r5     // Catch: java.lang.Throwable -> L29
            r24 r7 = defpackage.r24.Default     // Catch: java.lang.Throwable -> L29
            java.lang.Object r7 = r6.e(r7, r8, r0)     // Catch: java.lang.Throwable -> L29
            if (r7 != r1) goto L46
            return r1
        L46:
            r6.i = r4
            o27 r6 = defpackage.o27.a
            return r6
        L4b:
            r6.i = r4
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pk3.f(int, k11):java.lang.Object");
    }

    public final void g(jk3 jk3Var, boolean z, boolean z2) {
        int i;
        boolean z3;
        float f;
        long j;
        long j2;
        Object obj;
        int i2;
        boolean z4;
        boolean z5;
        List list = jk3Var.k;
        int i3 = jk3Var.n;
        int i4 = jk3Var.b;
        kk3 kk3Var = jk3Var.a;
        this.q.e = list.size();
        ci3 ci3Var = this.x;
        mi2 mi2Var = null;
        bi3 bi3Var = this.e;
        if (!z && this.b) {
            this.c = jk3Var;
            ga6 z6 = io2.z();
            if (z6 != null) {
                mi2Var = z6.e();
            }
            ga6 Y = io2.Y(z6);
            try {
                if (((Number) ((io) ci3Var.L).B.getValue()).floatValue() == RecyclerView.A1) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (!z5 && kk3Var != null && kk3Var.a == bi3Var.b.h() && i4 == bi3Var.c.h()) {
                    ci3Var.z();
                }
                return;
            } finally {
                io2.l0(z6, Y, mi2Var);
            }
        }
        if (z) {
            this.b = true;
        }
        if (kk3Var != null) {
            i = kk3Var.a;
        } else {
            i = 0;
        }
        if (i == 0 && i4 == 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.v.setValue(Boolean.valueOf(z3));
        this.u.setValue(Boolean.valueOf(jk3Var.c));
        this.h -= jk3Var.d;
        this.f.setValue(jk3Var);
        if (z2) {
            bi3Var.getClass();
            if (i4 < RecyclerView.A1) {
                pz2.c("scrollOffset should be non-negative");
            }
            bi3Var.c.i(i4);
        } else {
            kk3 kk3Var2 = (kk3) tq0.M0(list);
            kk3 kk3Var3 = (kk3) tq0.U0(list);
            if (kk3Var2 != null) {
                f = 0.0f;
                j = kk3Var2.a;
            } else {
                f = 0.0f;
                j = -1;
            }
            a53.U(j, "firstVisibleItem:index");
            if (kk3Var3 != null) {
                j2 = kk3Var3.a;
            } else {
                j2 = -1;
            }
            a53.U(j2, "lastVisibleItem:index");
            bi3Var.getClass();
            if (kk3Var != null) {
                obj = kk3Var.i;
            } else {
                obj = null;
            }
            bi3Var.e = obj;
            if (bi3Var.d || i3 > 0) {
                bi3Var.d = true;
                if (i4 < f) {
                    pz2.c("scrollOffset should be non-negative");
                }
                if (kk3Var != null) {
                    i2 = kk3Var.a;
                } else {
                    i2 = 0;
                }
                bi3Var.a(i2, i4);
            }
            if (this.k) {
                sa1 sa1Var = this.a;
                int i5 = sa1Var.a;
                boolean z7 = sa1Var.b;
                if (i5 != -1 && !list.isEmpty() && i5 != sa1.a(jk3Var, z7)) {
                    sa1Var.a = -1;
                    pj3 pj3Var = (pj3) sa1Var.e;
                    if (pj3Var != null) {
                        pj3Var.cancel();
                    }
                    sa1Var.e = null;
                }
                int i6 = sa1Var.c;
                if (i6 != -1 && sa1Var.d != f && i6 != i3 && !list.isEmpty()) {
                    if (sa1Var.d < f) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    int a = sa1.a(jk3Var, z4);
                    if (a >= 0 && a < i3) {
                        sa1Var.a = a;
                        sa1Var.e = ka3.I(this.r, a);
                    }
                }
                sa1Var.c = i3;
            }
        }
        if (z) {
            ci3Var.C(jk3Var.f, jk3Var.i, jk3Var.h);
        }
    }

    public final int h() {
        return this.e.b.h();
    }

    public final int i() {
        return this.e.c.h();
    }

    public final jk3 j() {
        return (jk3) this.f.getValue();
    }

    public final void k(float f, jk3 jk3Var) {
        boolean z;
        pj3 pj3Var;
        pj3 pj3Var2;
        if (this.k) {
            boolean isEmpty = jk3Var.k.isEmpty();
            sa1 sa1Var = this.a;
            if (!isEmpty) {
                if (f < RecyclerView.A1) {
                    z = true;
                } else {
                    z = false;
                }
                int a = sa1.a(jk3Var, z);
                if (a >= 0 && a < jk3Var.n) {
                    if (a != sa1Var.a) {
                        if (sa1Var.b != z) {
                            sa1Var.a = -1;
                            pj3 pj3Var3 = (pj3) sa1Var.e;
                            if (pj3Var3 != null) {
                                pj3Var3.cancel();
                            }
                            sa1Var.e = null;
                        }
                        sa1Var.b = z;
                        sa1Var.a = a;
                        sa1Var.e = ka3.I(this.r, a);
                    }
                    List list = jk3Var.k;
                    if (z) {
                        kk3 kk3Var = (kk3) tq0.T0(list);
                        if (((kk3Var.l + kk3Var.m) + jk3Var.q) - jk3Var.m < (-f) && (pj3Var2 = (pj3) sa1Var.e) != null) {
                            pj3Var2.a();
                        }
                    } else if (jk3Var.l - ((kk3) tq0.K0(list)).l < f && (pj3Var = (pj3) sa1Var.e) != null) {
                        pj3Var.a();
                    }
                }
            }
            sa1Var.d = f;
        }
    }

    public final void m(int i) {
        bi3 bi3Var = this.e;
        if (bi3Var.b.h() != i || bi3Var.c.h() != 0) {
            bj3 bj3Var = this.o;
            bj3Var.e();
            bj3Var.b = null;
        }
        bi3Var.a(i, 0);
        bi3Var.e = null;
        vf3 vf3Var = this.l;
        if (vf3Var != null) {
            vf3Var.k();
        }
    }
}
