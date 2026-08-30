package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: al5  reason: default package */
/* loaded from: classes.dex */
public final class al5 extends se5 {
    public final ud5 i;
    public final ra4 j;
    public final fb4 k;
    public final g96 l;
    public final u64 m;
    public final pt5 n;
    public final ee6 o;
    public final q45 p;
    public final c46 q;
    public final o45 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al5(ud5 ud5Var, w16 w16Var, ra4 ra4Var, fb4 fb4Var, g96 g96Var, u64 u64Var, pt5 pt5Var) {
        super(ud5Var, w16Var);
        ud5Var.getClass();
        w16Var.getClass();
        ra4Var.getClass();
        fb4Var.getClass();
        g96Var.getClass();
        u64Var.getClass();
        pt5Var.getClass();
        this.i = ud5Var;
        this.j = ra4Var;
        this.k = fb4Var;
        this.l = g96Var;
        this.m = u64Var;
        this.n = pt5Var;
        ee6 a = fe6.a(new r94(null, null, false, false, 127));
        this.o = a;
        this.p = new q45(a);
        c46 f = ln2.f();
        this.q = f;
        this.r = new o45(f);
        p();
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007c, code lost:
        if (r0 == r7) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00b1, code lost:
        if (r0 == r7) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object n(defpackage.al5 r19, boolean r20, defpackage.k11 r21) {
        /*
            Method dump skipped, instructions count: 272
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.al5.n(al5, boolean, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00d7  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x008b -> B:24:0x008d). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object o(defpackage.al5 r16, java.util.List r17, defpackage.k11 r18) {
        /*
            Method dump skipped, instructions count: 236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.al5.o(al5, java.util.List, k11):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ba A[LOOP:1: B:35:0x00b4->B:37:0x00ba, LOOP_END] */
    @Override // defpackage.se5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(java.util.ArrayList r6, java.util.Map r7, defpackage.k11 r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof defpackage.uk5
            if (r0 == 0) goto L13
            r0 = r8
            uk5 r0 = (defpackage.uk5) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            uk5 r0 = new uk5
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.X
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            java.util.Map r7 = r0.R
            defpackage.me2.a0(r8)
            goto L4c
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r5)
            return r3
        L30:
            defpackage.me2.a0(r8)
            r0.R = r7
            r0.Z = r4
            ud5 r5 = r5.i
            dl r5 = (defpackage.dl) r5
            r5.getClass()
            bb1 r5 = defpackage.tg1.a
            kg r8 = new kg
            r8.<init>(r6, r3, r4)
            java.lang.Object r8 = defpackage.tq5.G(r5, r8, r0)
            if (r8 != r1) goto L4c
            return r1
        L4c:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            r5.<init>()
            java.util.Iterator r6 = r8.iterator()
        L57:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto La3
            java.lang.Object r8 = r6.next()
            r15 r8 = (defpackage.r15) r8
            u15 r0 = r8.a
            dy4 r0 = r0.a
            long r0 = r0.a
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r7.get(r0)
            e3 r0 = (defpackage.e3) r0
            if (r0 != 0) goto L80
            u15 r0 = r8.a
            boolean r0 = r0.b
            if (r0 == 0) goto L7e
            e3 r0 = defpackage.e3.Unlocked
            goto L80
        L7e:
            e3 r0 = defpackage.e3.Locked
        L80:
            java.lang.Object r1 = r5.get(r0)
            if (r1 != 0) goto L89
            r5.containsKey(r0)
        L89:
            java.util.List r1 = (java.util.List) r1
            l6 r2 = new l6
            r2.<init>(r8)
            if (r1 == 0) goto L96
            r1.add(r2)
            goto L9f
        L96:
            n6[] r8 = new defpackage.n6[r4]
            r1 = 0
            r8[r1] = r2
            java.util.ArrayList r1 = defpackage.l07.f0(r8)
        L9f:
            r5.put(r0, r1)
            goto L57
        La3:
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = r5.size()
            r6.<init>(r7)
            java.util.Set r5 = r5.entrySet()
            java.util.Iterator r5 = r5.iterator()
        Lb4:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto Ld5
            java.lang.Object r7 = r5.next()
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7
            f3 r8 = new f3
            java.lang.Object r0 = r7.getKey()
            e3 r0 = (defpackage.e3) r0
            java.lang.Object r7 = r7.getValue()
            java.util.List r7 = (java.util.List) r7
            r8.<init>(r0, r7)
            r6.add(r8)
            goto Lb4
        Ld5:
            hd2 r5 = new hd2
            r7 = 28
            r5.<init>(r7)
            java.util.List r5 = defpackage.tq0.g1(r6, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.al5.e(java.util.ArrayList, java.util.Map, k11):java.lang.Object");
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
            boolean r0 = r8 instanceof defpackage.xk5
            if (r0 == 0) goto L13
            r0 = r8
            xk5 r0 = (defpackage.xk5) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            xk5 r0 = new xk5
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.al5.g(rg5, k11):java.lang.Object");
    }

    @Override // defpackage.se5
    public final rg5 h() {
        Object a = this.n.a("rom");
        a.getClass();
        return ((bp5) a).A;
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
            boolean r0 = r6 instanceof defpackage.yk5
            if (r0 == 0) goto L13
            r0 = r6
            yk5 r0 = (defpackage.yk5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            yk5 r0 = new yk5
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.al5.i(k11):java.io.Serializable");
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
            boolean r0 = r6 instanceof defpackage.zk5
            if (r0 == 0) goto L13
            r0 = r6
            zk5 r0 = (defpackage.zk5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            zk5 r0 = new zk5
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.al5.j(k11):java.io.Serializable");
    }

    public final void p() {
        tq5.w(ua7.a(this), null, null, new v74(this, (j11) null, 11), 3);
    }
}
