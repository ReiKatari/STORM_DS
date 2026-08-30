package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ki3  reason: default package */
/* loaded from: classes.dex */
public final class ki3 implements sw5 {
    public static final ci3 w = io2.X(new qt0(15), new gi3(0));
    public final sa1 a;
    public boolean b;
    public yh3 c;
    public final bi3 d;
    public final tj4 e;
    public final l14 f;
    public float g;
    public final db1 h;
    public final boolean i;
    public vf3 j;
    public final ii3 k;
    public final ay l;
    public final bj3 m;
    public final l50 n;
    public final qj3 o;
    public final ka3 p;
    public final nj3 q;
    public final k24 r;
    public final k24 s;
    public final tj4 t;
    public final tj4 u;
    public final ci3 v;

    /* JADX WARN: Type inference failed for: r0v0, types: [sa1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v4, types: [ay, java.lang.Object] */
    public ki3(int i, int i2) {
        ?? obj = new Object();
        obj.a = -1;
        obj.e = new o24(new pj3[16]);
        obj.c = -1;
        this.a = obj;
        this.d = new bi3(i, i2, 0);
        this.e = new tj4(mi3.a, k45.f0);
        this.f = new l14();
        this.h = new db1(new kb2(4, this));
        this.i = true;
        this.k = new ii3(this, 0);
        this.l = new Object();
        this.m = new bj3();
        this.n = new l50(1);
        this.o = new qj3(new hi3(i, 0, this));
        this.p = new ka3(4, this);
        this.q = new nj3();
        this.r = jk2.o();
        this.s = jk2.o();
        Boolean bool = Boolean.FALSE;
        this.t = me2.G(bool);
        this.u = me2.G(bool);
        this.v = new ci3(2);
    }

    public static Object j(ki3 ki3Var, int i, nk6 nk6Var) {
        ki3Var.getClass();
        Object e = ki3Var.e(r24.Default, new a6(ki3Var, i, null, 25), nk6Var);
        if (e == p31.COROUTINE_SUSPENDED) {
            return e;
        }
        return o27.a;
    }

    @Override // defpackage.sw5
    public final boolean a() {
        return ((Boolean) this.u.getValue()).booleanValue();
    }

    @Override // defpackage.sw5
    public final boolean b() {
        return this.h.b();
    }

    @Override // defpackage.sw5
    public final boolean c() {
        return ((Boolean) this.t.getValue()).booleanValue();
    }

    @Override // defpackage.sw5
    public final float d(float f) {
        return this.h.d(f);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0058, code lost:
        if (r6.l.h(r0) == r1) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0067, code lost:
        if (r6.h.e(r7, r8, r0) != r1) goto L11;
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
            boolean r0 = r9 instanceof defpackage.ji3
            if (r0 == 0) goto L13
            r0 = r9
            ji3 r0 = (defpackage.ji3) r0
            int r1 = r0.c0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c0 = r1
            goto L18
        L13:
            ji3 r0 = new ji3
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
            tj4 r9 = r6.e
            java.lang.Object r9 = r9.getValue()
            yh3 r2 = defpackage.mi3.a
            if (r9 != r2) goto L5b
            r0.R = r7
            r9 = r8
            nk6 r9 = (defpackage.nk6) r9
            r0.X = r9
            r0.c0 = r5
            ay r9 = r6.l
            java.lang.Object r9 = r9.h(r0)
            if (r9 != r1) goto L5b
            goto L69
        L5b:
            r0.R = r3
            r0.X = r3
            r0.c0 = r4
            db1 r6 = r6.h
            java.lang.Object r6 = r6.e(r7, r8, r0)
            if (r6 != r1) goto L6a
        L69:
            return r1
        L6a:
            o27 r6 = defpackage.o27.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ki3.e(r24, aj2, j11):java.lang.Object");
    }

    public final void f(yh3 yh3Var, boolean z, boolean z2) {
        int i;
        boolean z3;
        int i2;
        zh3 zh3Var;
        boolean z4;
        int i3;
        zh3 zh3Var2;
        zh3 zh3Var3;
        List list = yh3Var.m;
        int i4 = yh3Var.p;
        ai3 ai3Var = yh3Var.a;
        int i5 = yh3Var.b;
        this.o.e = list.size();
        Object obj = null;
        mi2 mi2Var = null;
        obj = null;
        boolean z5 = false;
        bi3 bi3Var = this.d;
        ci3 ci3Var = this.v;
        if (!z && this.b) {
            this.c = yh3Var;
            ga6 z6 = io2.z();
            if (z6 != null) {
                mi2Var = z6.e();
            }
            ga6 Y = io2.Y(z6);
            try {
                if (((Number) ((io) ci3Var.L).B.getValue()).floatValue() == RecyclerView.A1) {
                    z5 = true;
                }
                if (!z5 && i5 == bi3Var.c.h() && ai3Var != null && (zh3Var3 = (zh3) nu.q0(ai3Var.b)) != null && zh3Var3.a == bi3Var.b.h()) {
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
        this.g -= yh3Var.d;
        this.e.setValue(yh3Var);
        if (ai3Var != null) {
            i = ai3Var.a;
        } else {
            i = 0;
        }
        if (i == 0 && i5 == 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        this.u.setValue(Boolean.valueOf(z3));
        this.t.setValue(Boolean.valueOf(yh3Var.c));
        if (z2) {
            bi3Var.getClass();
            if (i5 < RecyclerView.A1) {
                pz2.c("scrollOffset should be non-negative");
            }
            bi3Var.c.i(i5);
        } else {
            bi3Var.getClass();
            if (ai3Var != null && (zh3Var2 = (zh3) nu.q0(ai3Var.b)) != null) {
                obj = zh3Var2.b;
            }
            bi3Var.e = obj;
            if (bi3Var.d || i4 > 0) {
                bi3Var.d = true;
                if (i5 < RecyclerView.A1) {
                    pz2.c("scrollOffset should be non-negative (" + i5 + ')');
                }
                if (ai3Var != null && (zh3Var = (zh3) nu.q0(ai3Var.b)) != null) {
                    i2 = zh3Var.a;
                } else {
                    i2 = 0;
                }
                bi3Var.a(i2, i5);
            }
            if (this.i) {
                sa1 sa1Var = this.a;
                o24 o24Var = (o24) sa1Var.e;
                int i6 = sa1Var.a;
                boolean z7 = sa1Var.b;
                if (i6 != -1 && !list.isEmpty() && i6 != sa1.b(yh3Var, z7)) {
                    sa1Var.a = -1;
                    Object[] objArr = o24Var.A;
                    int i7 = o24Var.L;
                    for (int i8 = 0; i8 < i7; i8++) {
                        ((pj3) objArr[i8]).cancel();
                    }
                    o24Var.h();
                }
                int i9 = sa1Var.c;
                if (i9 != -1 && sa1Var.d != RecyclerView.A1 && i9 != i4 && !list.isEmpty()) {
                    if (sa1Var.d < RecyclerView.A1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    int b = sa1.b(yh3Var, z4);
                    if (sa1Var.d < RecyclerView.A1) {
                        z5 = true;
                    }
                    if (z5) {
                        i3 = ((zh3) tq0.T0(list)).a + 1;
                    } else {
                        i3 = ((zh3) tq0.K0(list)).a - 1;
                    }
                    if (i3 >= 0 && i3 < i4 && b != sa1Var.a && b >= 0) {
                        sa1Var.a = b;
                        o24Var.h();
                        o24Var.d(o24Var.L, this.p.H(b));
                    }
                }
                sa1Var.c = i4;
            }
        }
        if (z) {
            ci3Var.C(yh3Var.f, yh3Var.i, yh3Var.h);
        }
    }

    public final int g() {
        return this.d.b.h();
    }

    public final yh3 h() {
        return (yh3) this.e.getValue();
    }

    public final void i(float f, yh3 yh3Var) {
        boolean z;
        int i;
        long j;
        if (this.i) {
            sa1 sa1Var = this.a;
            o24 o24Var = (o24) sa1Var.e;
            List list = yh3Var.m;
            List list2 = yh3Var.m;
            jf4 jf4Var = yh3Var.q;
            if (!list.isEmpty()) {
                int i2 = 0;
                if (f < RecyclerView.A1) {
                    z = true;
                } else {
                    z = false;
                }
                int b = sa1.b(yh3Var, z);
                if (z) {
                    i = ((zh3) tq0.T0(list2)).a + 1;
                } else {
                    i = ((zh3) tq0.K0(list2)).a - 1;
                }
                if (i >= 0 && i < yh3Var.p) {
                    if (b != sa1Var.a && b >= 0) {
                        if (sa1Var.b != z) {
                            Object[] objArr = o24Var.A;
                            int i3 = o24Var.L;
                            for (int i4 = 0; i4 < i3; i4++) {
                                ((pj3) objArr[i4]).cancel();
                            }
                        }
                        sa1Var.b = z;
                        sa1Var.a = b;
                        o24Var.h();
                        o24Var.d(o24Var.L, this.p.H(b));
                    }
                    if (z) {
                        zh3 zh3Var = (zh3) tq0.T0(list2);
                        if (jf4Var == jf4.Vertical) {
                            j = zh3Var.n & 4294967295L;
                        } else {
                            j = zh3Var.n >> 32;
                        }
                        int i5 = (int) j;
                        if (((me2.H(zh3Var, jf4Var) + i5) + yh3Var.s) - yh3Var.o < (-f)) {
                            Object[] objArr2 = o24Var.A;
                            int i6 = o24Var.L;
                            while (i2 < i6) {
                                ((pj3) objArr2[i2]).a();
                                i2++;
                            }
                        }
                    } else if (yh3Var.n - me2.H((zh3) tq0.K0(list2), jf4Var) < f) {
                        Object[] objArr3 = o24Var.A;
                        int i7 = o24Var.L;
                        while (i2 < i7) {
                            ((pj3) objArr3[i2]).a();
                            i2++;
                        }
                    }
                }
            }
            sa1Var.d = f;
        }
    }
}
