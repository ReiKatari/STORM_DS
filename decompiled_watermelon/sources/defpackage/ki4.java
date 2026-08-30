package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ki4 */
/* loaded from: classes.dex */
public abstract class ki4 implements sw5 {
    public final k24 A;
    public final tj4 B;
    public final tj4 C;
    public final tj4 D;
    public final tj4 E;
    public boolean a;
    public zh4 b;
    public final tj4 c;
    public final bi4 d;
    public int e;
    public int f;
    public long g;
    public long h;
    public float i;
    public float j;
    public final db1 k;
    public final boolean l;
    public final tj4 m;
    public od1 n;
    public int o;
    public final l14 p;
    public final qj4 q;
    public final qj4 r;
    public final qj3 s;
    public final rh4 t;
    public final l50 u;
    public final ay v;
    public final tj4 w;
    public final ii3 x;
    public final nj3 y;
    public final k24 z;

    /* JADX WARN: Type inference failed for: r6v4, types: [ay, java.lang.Object] */
    public ki4(int i, float f) {
        double d = f;
        if (-0.5d > d || d > 0.5d) {
            pz2.a("currentPageOffsetFraction " + f + " is not within the range -0.5 to 0.5");
        }
        this.c = me2.G(new mb4(0L));
        this.d = new bi4(i, f, this);
        this.e = i;
        this.g = Long.MAX_VALUE;
        this.k = new db1(new mi2(this) { // from class: fi4
            public final /* synthetic */ ki4 B;

            {
                this.B = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:40:0x00ab  */
            /* JADX WARN: Removed duplicated region for block: B:41:0x00b6  */
            /* JADX WARN: Removed duplicated region for block: B:49:0x00e2  */
            /* JADX WARN: Type inference failed for: r0v4 */
            /* JADX WARN: Type inference failed for: r0v5 */
            /* JADX WARN: Type inference failed for: r0v7 */
            /* JADX WARN: Type inference failed for: r15v1, types: [java.lang.Float] */
            /* JADX WARN: Type inference failed for: r15v2, types: [java.lang.Number] */
            /* JADX WARN: Type inference failed for: r15v3, types: [java.lang.Long] */
            @Override // defpackage.mi2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object n(java.lang.Object r15) {
                /*
                    Method dump skipped, instructions count: 246
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.fi4.n(java.lang.Object):java.lang.Object");
            }
        });
        this.l = true;
        this.m = new tj4(ni4.b, k45.f0);
        this.n = ni4.a;
        this.p = new l14();
        this.q = new qj4(-1);
        this.r = new qj4(i);
        k45 k45Var = k45.n0;
        me2.r(new gi4(this, 0), k45Var);
        me2.r(new gi4(this, 1), k45Var);
        qj3 qj3Var = new qj3(new mi2(this) { // from class: fi4
            public final /* synthetic */ ki4 B;

            {
                this.B = this;
            }

            @Override // defpackage.mi2
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object n(java.lang.Object r15) {
                /*
                    Method dump skipped, instructions count: 246
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.fi4.n(java.lang.Object):java.lang.Object");
            }
        });
        this.s = qj3Var;
        this.t = new rh4(new ka3(22, this), qj3Var, new gi4(this, 2));
        this.u = new l50(1);
        this.v = new Object();
        this.w = me2.G(null);
        this.x = new ii3(this, 2);
        nz0.b(0, 0, 0, 0, 15);
        this.y = new nj3();
        this.z = jk2.o();
        this.A = jk2.o();
        Boolean bool = Boolean.FALSE;
        this.B = me2.G(bool);
        this.C = me2.G(bool);
        this.D = me2.G(bool);
        this.E = me2.G(bool);
    }

    public static /* synthetic */ Object g(ya1 ya1Var, int i, nk6 nk6Var) {
        return ya1Var.f(i, ct3.P0(RecyclerView.A1, RecyclerView.A1, null, 7), nk6Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x0052, code lost:
        if (r6.i(r0) == r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0074, code lost:
        if (r9.e(r7, r8, r0) != r1) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0076, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object s(defpackage.ki4 r6, defpackage.r24 r7, defpackage.aj2 r8, defpackage.k11 r9) {
        /*
            boolean r0 = r9 instanceof defpackage.ji4
            if (r0 == 0) goto L13
            r0 = r9
            ji4 r0 = (defpackage.ji4) r0
            int r1 = r0.d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d0 = r1
            goto L18
        L13:
            ji4 r0 = new ji4
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.Z
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.d0
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L40
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            ki4 r6 = r0.R
            defpackage.me2.a0(r9)
            goto L77
        L2d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r6)
            return r3
        L33:
            nk6 r6 = r0.Y
            r8 = r6
            aj2 r8 = (defpackage.aj2) r8
            r24 r7 = r0.X
            ki4 r6 = r0.R
            defpackage.me2.a0(r9)
            goto L55
        L40:
            defpackage.me2.a0(r9)
            r0.R = r6
            r0.X = r7
            r9 = r8
            nk6 r9 = (defpackage.nk6) r9
            r0.Y = r9
            r0.d0 = r5
            java.lang.Object r9 = r6.i(r0)
            if (r9 != r1) goto L55
            goto L76
        L55:
            db1 r9 = r6.k
            boolean r9 = r9.b()
            if (r9 != 0) goto L66
            int r9 = r6.k()
            qj4 r2 = r6.r
            r2.i(r9)
        L66:
            db1 r9 = r6.k
            r0.R = r6
            r0.X = r3
            r0.Y = r3
            r0.d0 = r4
            java.lang.Object r7 = r9.e(r7, r8, r0)
            if (r7 != r1) goto L77
        L76:
            return r1
        L77:
            r7 = -1
            qj4 r6 = r6.q
            r6.i(r7)
            o27 r6 = defpackage.o27.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ki4.s(ki4, r24, aj2, k11):java.lang.Object");
    }

    @Override // defpackage.sw5
    public final boolean a() {
        return ((Boolean) this.C.getValue()).booleanValue();
    }

    @Override // defpackage.sw5
    public final boolean b() {
        return this.k.b();
    }

    @Override // defpackage.sw5
    public final boolean c() {
        return ((Boolean) this.B.getValue()).booleanValue();
    }

    @Override // defpackage.sw5
    public final float d(float f) {
        return this.k.d(f);
    }

    @Override // defpackage.sw5
    public final Object e(r24 r24Var, aj2 aj2Var, j11 j11Var) {
        return s(this, r24Var, aj2Var, (k11) j11Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0087 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0088 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object f(int r12, defpackage.sc6 r13, defpackage.k11 r14) {
        /*
            r11 = this;
            boolean r3 = r14 instanceof defpackage.hi4
            if (r3 == 0) goto L14
            r3 = r14
            hi4 r3 = (defpackage.hi4) r3
            int r4 = r3.c0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L14
            int r4 = r4 - r5
            r3.c0 = r4
        L12:
            r6 = r3
            goto L1a
        L14:
            hi4 r3 = new hi4
            r3.<init>(r11, r14)
            goto L12
        L1a:
            java.lang.Object r2 = r6.Y
            p31 r7 = defpackage.p31.COROUTINE_SUSPENDED
            int r3 = r6.c0
            r8 = 0
            r4 = 0
            o27 r9 = defpackage.o27.a
            r10 = 2
            r5 = 1
            if (r3 == 0) goto L40
            if (r3 == r5) goto L36
            if (r3 != r10) goto L30
            defpackage.me2.a0(r2)
            return r9
        L30:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r0)
            return r8
        L36:
            int r0 = r6.R
            sc6 r3 = r6.X
            defpackage.me2.a0(r2)
            r2 = r4
            r4 = r3
            goto L69
        L40:
            defpackage.me2.a0(r2)
            int r2 = r11.k()
            if (r12 != r2) goto L52
            float r2 = r11.l()
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 != 0) goto L52
            goto L88
        L52:
            int r2 = r11.n()
            if (r2 != 0) goto L59
            goto L88
        L59:
            r6.X = r13
            r6.R = r12
            r6.c0 = r5
            java.lang.Object r3 = r11.i(r6)
            if (r3 != r7) goto L66
            goto L87
        L66:
            r0 = r12
            r2 = r4
            r4 = r13
        L69:
            int r0 = r11.j(r0)
            int r3 = r11.p()
            float r3 = (float) r3
            float r3 = r3 * r2
            r2 = r0
            ii4 r0 = new ii4
            r5 = 0
            r1 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r6.X = r8
            r6.c0 = r10
            r24 r2 = defpackage.r24.Default
            java.lang.Object r0 = r11.e(r2, r0, r6)
            if (r0 != r7) goto L88
        L87:
            return r7
        L88:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ki4.f(int, sc6, k11):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:327:0x0330, code lost:
        if (r() == false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:267:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x020e  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x02a2  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:308:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:334:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:339:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:344:0x02da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:348:0x0222 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r15v12, types: [p80, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void h(defpackage.zh4 r20, boolean r21, boolean r22) {
        /*
            Method dump skipped, instructions count: 882
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ki4.h(zh4, boolean, boolean):void");
    }

    public final Object i(k11 k11Var) {
        Object h;
        if (this.m.getValue() == ni4.b && (h = this.v.h(k11Var)) == p31.COROUTINE_SUSPENDED) {
            return h;
        }
        return o27.a;
    }

    public final int j(int i) {
        if (n() <= 0) {
            return 0;
        }
        return io2.m(i, 0, n() - 1);
    }

    public final int k() {
        return this.d.b.h();
    }

    public final float l() {
        return this.d.c.h();
    }

    public final zh4 m() {
        return (zh4) this.m.getValue();
    }

    public abstract int n();

    public final int o() {
        return ((zh4) this.m.getValue()).b;
    }

    public final int p() {
        return ((zh4) this.m.getValue()).c + o();
    }

    public final long q() {
        return ((mb4) this.c.getValue()).a;
    }

    public final boolean r() {
        if (((int) Float.intBitsToFloat((int) (q() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (q() & 4294967295L))) == 0) {
            return true;
        }
        return false;
    }

    public final void t(int i, float f, boolean z) {
        bi4 bi4Var = this.d;
        qj4 qj4Var = bi4Var.b;
        pj4 pj4Var = bi4Var.c;
        if (qj4Var.h() != i || pj4Var.h() != f) {
            this.t.g();
        }
        bi4Var.b.i(i);
        bi4Var.f.b(i);
        pj4Var.i(f);
        bi4Var.e = null;
        if (z) {
            vf3 vf3Var = (vf3) this.w.getValue();
            if (vf3Var != null) {
                vf3Var.k();
                return;
            }
            return;
        }
        this.A.setValue(o27.a);
    }
}
