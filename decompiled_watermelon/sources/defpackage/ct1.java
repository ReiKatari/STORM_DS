package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ct1  reason: default package */
/* loaded from: classes.dex */
public final class ct1 extends se5 {
    public final ud5 i;
    public final ra4 j;
    public final ht1 k;
    public final rs1 l;
    public final u64 m;
    public final tf0 n;
    public List o;
    public List p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ct1(w16 w16Var, ud5 ud5Var, ra4 ra4Var, ht1 ht1Var, rs1 rs1Var, u64 u64Var, tf0 tf0Var) {
        super(ud5Var, w16Var);
        w16Var.getClass();
        ud5Var.getClass();
        ra4Var.getClass();
        ht1Var.getClass();
        rs1Var.getClass();
        u64Var.getClass();
        this.i = ud5Var;
        this.j = ra4Var;
        this.k = ht1Var;
        this.l = rs1Var;
        this.m = u64Var;
        this.n = tf0Var;
        pp1 pp1Var = pp1.A;
        this.o = pp1Var;
        this.p = pp1Var;
        tq5.w(ua7.a(this), null, null, new a6(this, null, 15), 3);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01bd  */
    @Override // defpackage.se5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.util.ArrayList r18, java.util.Map r19, defpackage.k11 r20) {
        /*
            Method dump skipped, instructions count: 508
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ct1.e(java.util.ArrayList, java.util.Map, k11):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0048, code lost:
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0060, code lost:
        if (r8 == r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0062, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0050  */
    @Override // defpackage.se5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object g(defpackage.rg5 r7, defpackage.k11 r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof defpackage.ys1
            if (r0 == 0) goto L13
            r0 = r8
            ys1 r0 = (defpackage.ys1) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            ys1 r0 = new ys1
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.me2.a0(r8)
            goto L63
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r6)
            return r3
        L31:
            rg5 r7 = r0.R
            defpackage.me2.a0(r8)
            goto L4b
        L37:
            defpackage.me2.a0(r8)
            r0.R = r7
            r0.Z = r5
            ud5 r8 = r6.i
            dl r8 = (defpackage.dl) r8
            vj r8 = r8.c
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L4b
            goto L62
        L4b:
            z15 r8 = (defpackage.z15) r8
            if (r8 != 0) goto L50
            goto L6b
        L50:
            java.lang.String r8 = r8.a()
            java.lang.String r7 = r7.i
            r0.R = r3
            r0.Z = r4
            ra4 r6 = r6.j
            java.lang.Object r8 = r6.g(r8, r7, r0)
            if (r8 != r1) goto L63
        L62:
            return r1
        L63:
            sa4 r8 = (defpackage.sa4) r8
            x94 r6 = r8.a
            x94 r7 = defpackage.x94.OK
            if (r6 == r7) goto L6e
        L6b:
            up1 r6 = defpackage.up1.A
            return r6
        L6e:
            java.util.List r6 = r8.b
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = defpackage.uq0.y0(r6, r8)
            r7.<init>(r8)
            java.util.Iterator r6 = r6.iterator()
        L7f:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L96
            java.lang.Object r8 = r6.next()
            hb4 r8 = (defpackage.hb4) r8
            long r0 = r8.e
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r0)
            r7.add(r8)
            goto L7f
        L96:
            java.util.Set r6 = defpackage.tq0.s1(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ct1.g(rg5, k11):java.lang.Object");
    }

    @Override // defpackage.se5
    public final rg5 h() {
        gt1 gt1Var;
        a53 a53Var = this.k.e;
        if (a53Var instanceof gt1) {
            gt1Var = (gt1) a53Var;
        } else {
            gt1Var = null;
        }
        if (gt1Var != null) {
            return gt1Var.r;
        }
        i.n("Emulator must be running a ROM session");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0069  */
    @Override // defpackage.se5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable i(defpackage.k11 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.zs1
            if (r0 == 0) goto L13
            r0 = r6
            zs1 r0 = (defpackage.zs1) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            zs1 r0 = new zs1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.me2.a0(r6)
            goto L49
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r5)
            return r3
        L2e:
            defpackage.me2.a0(r6)
            r0.Y = r4
            ud5 r5 = r5.i
            dl r5 = (defpackage.dl) r5
            r5.getClass()
            bb1 r6 = defpackage.tg1.a
            nk r2 = new nk
            r4 = 0
            r2.<init>(r5, r3, r4)
            java.lang.Object r6 = defpackage.tq5.G(r6, r2, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r5 = 10
            int r5 = defpackage.uq0.y0(r6, r5)
            int r5 = defpackage.zt3.j0(r5)
            r0 = 16
            if (r5 >= r0) goto L5a
            r5 = r0
        L5a:
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>(r5)
            java.util.Iterator r5 = r6.iterator()
        L63:
            boolean r6 = r5.hasNext()
            if (r6 == 0) goto L9d
            java.lang.Object r6 = r5.next()
            me.magnum.melonds.domain.model.retroachievements.RASimpleRuntimeAchievementBucketEntry r6 = (me.magnum.melonds.domain.model.retroachievements.RASimpleRuntimeAchievementBucketEntry) r6
            long r1 = r6.getAchievementId()
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r1)
            int r6 = r6.getBucketType()
            switch(r6) {
                case 1: goto L97;
                case 2: goto L94;
                case 3: goto L91;
                case 4: goto L8e;
                case 5: goto L8b;
                case 6: goto L88;
                case 7: goto L85;
                case 8: goto L82;
                default: goto L7f;
            }
        L7f:
            e3 r6 = defpackage.e3.Locked
            goto L99
        L82:
            e3 r6 = defpackage.e3.Unsynced
            goto L99
        L85:
            e3 r6 = defpackage.e3.AlmostThere
            goto L99
        L88:
            e3 r6 = defpackage.e3.ActiveChallenges
            goto L99
        L8b:
            e3 r6 = defpackage.e3.RecentlyUnlocked
            goto L99
        L8e:
            e3 r6 = defpackage.e3.Unofficial
            goto L99
        L91:
            e3 r6 = defpackage.e3.Unsupported
            goto L99
        L94:
            e3 r6 = defpackage.e3.Unlocked
            goto L99
        L97:
            e3 r6 = defpackage.e3.Locked
        L99:
            r0.put(r3, r6)
            goto L63
        L9d:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ct1.i(k11):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x007c A[LOOP:0: B:22:0x0071->B:24:0x007c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008f A[SYNTHETIC] */
    @Override // defpackage.se5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.io.Serializable j(defpackage.k11 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof defpackage.at1
            if (r0 == 0) goto L13
            r0 = r6
            at1 r0 = (defpackage.at1) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            at1 r0 = new at1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.me2.a0(r6)
            goto L48
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r5)
            return r3
        L2e:
            defpackage.me2.a0(r6)
            r0.Y = r4
            ud5 r5 = r5.i
            dl r5 = (defpackage.dl) r5
            r5.getClass()
            bb1 r6 = defpackage.tg1.a
            nk r2 = new nk
            r2.<init>(r5, r3, r4)
            java.lang.Object r6 = defpackage.tq5.G(r6, r2, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r6.getClass()
            lu r5 = new lu
            b5 r0 = new b5
            r1 = 16
            r0.<init>(r1, r6)
            r6 = 2
            r5.<init>(r6, r0)
            r6 = 10
            int r6 = defpackage.uq0.y0(r5, r6)
            int r6 = defpackage.zt3.j0(r6)
            if (r6 >= r1) goto L67
            goto L68
        L67:
            r1 = r6
        L68:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>(r1)
            java.util.Iterator r5 = r5.iterator()
        L71:
            r0 = r5
            hl1 r0 = (defpackage.hl1) r0
            java.util.Iterator r1 = r0.B
            boolean r1 = r1.hasNext()
            if (r1 == 0) goto L8f
            java.lang.Object r0 = r0.next()
            fy2 r0 = (defpackage.fy2) r0
            java.lang.Object r1 = r0.b
            int r0 = r0.a
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r0)
            r6.put(r1, r2)
            goto L71
        L8f:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ct1.j(k11):java.io.Serializable");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x003f  */
    @Override // defpackage.se5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object k(defpackage.rg5 r6, boolean r7, defpackage.j11 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.bt1
            if (r0 == 0) goto L13
            r0 = r8
            bt1 r0 = (defpackage.bt1) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L1a
        L13:
            bt1 r0 = new bt1
            k11 r8 = (defpackage.k11) r8
            r0.<init>(r5, r8)
        L1a:
            java.lang.Object r8 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L30
            defpackage.me2.a0(r8)
            nc5 r8 = (defpackage.nc5) r8
            java.lang.Object r5 = r8.A
            return r5
        L30:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r5)
            r5 = 0
            return r5
        L37:
            defpackage.me2.a0(r8)
            nc5 r8 = (defpackage.nc5) r8
            java.lang.Object r5 = r8.A
            return r5
        L3f:
            defpackage.me2.a0(r8)
            ht1 r8 = r5.k
            boolean r2 = r8.a()
            if (r2 == 0) goto L4f
            boolean r8 = r8.d
            if (r8 == 0) goto L4f
            goto L57
        L4f:
            u64 r8 = r5.m
            boolean r8 = r8.a()
            if (r8 != 0) goto L67
        L57:
            java.lang.String r6 = r6.i
            r0.Y = r4
            ud5 r5 = r5.i
            dl r5 = (defpackage.dl) r5
            java.lang.Object r5 = r5.j(r6, r7, r0)
            if (r5 != r1) goto L66
            goto L6f
        L66:
            return r5
        L67:
            r0.Y = r3
            java.lang.Object r5 = defpackage.se5.l(r5, r6, r7, r0)
            if (r5 != r1) goto L70
        L6f:
            return r1
        L70:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ct1.k(rg5, boolean, j11):java.lang.Object");
    }
}
