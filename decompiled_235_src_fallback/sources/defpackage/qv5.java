package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qv5  reason: default package */
/* loaded from: classes.dex */
public final class qv5 extends defpackage.no5 {
    public final defpackage.pn5 i;
    public final defpackage.oj4 j;
    public final defpackage.ck4 k;
    public final defpackage.vk6 l;
    public final defpackage.jf4 m;
    public final defpackage.v46 n;
    public final defpackage.tp6 o;
    public final defpackage.de5 p;
    public final defpackage.of6 q;
    public final defpackage.be5 r;

    public qv5(defpackage.pn5 r1, defpackage.kd6 r2, defpackage.oj4 r3, defpackage.ck4 r4, defpackage.vk6 r5, defpackage.jf4 r6, defpackage.v46 r7) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r5.getClass()
            r6.getClass()
            r7.getClass()
            r0.<init>(r1, r2)
            r0.i = r1
            r0.j = r3
            r0.k = r4
            r0.l = r5
            r0.m = r6
            r0.n = r7
            oi4 r1 = new oi4
            r5 = 0
            r6 = 127(0x7f, float:1.78E-43)
            r2 = 0
            r3 = 0
            r4 = 0
            r1.<init>(r2, r3, r4, r5, r6)
            tp6 r1 = defpackage.up6.a(r1)
            r0.o = r1
            de5 r2 = new de5
            r2.<init>(r1)
            r0.p = r2
            of6 r1 = defpackage.bl2.a()
            r0.q = r1
            be5 r2 = new be5
            r2.<init>(r1)
            r0.r = r2
            r0.p()
            return
    }

    public static final java.lang.Object n(defpackage.qv5 r19, boolean r20, defpackage.s41 r21) {
            r1 = r19
            r0 = r21
            boolean r2 = r0 instanceof defpackage.lv5
            if (r2 == 0) goto L18
            r2 = r0
            lv5 r2 = (defpackage.lv5) r2
            int r3 = r2.g0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.g0 = r3
        L16:
            r6 = r2
            goto L1e
        L18:
            lv5 r2 = new lv5
            r2.<init>(r1, r0)
            goto L16
        L1e:
            java.lang.Object r0 = r6.e0
            x61 r7 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r6.g0
            r8 = 3
            r9 = 2
            r10 = 1
            r4 = 0
            if (r2 == 0) goto L61
            if (r2 == r10) goto L57
            if (r2 == r9) goto L47
            if (r2 != r8) goto L40
            boolean r1 = r6.X
            boolean r2 = r6.R
            ni4 r3 = r6.d0
            defpackage.oi2.Y(r0)
            r17 = r1
            r18 = r2
            r12 = r3
            goto Le7
        L40:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = 0
            return r0
        L47:
            boolean r2 = r6.X
            boolean r3 = r6.R
            java.lang.String r5 = r6.Z
            java.lang.String r9 = r6.Y
            defpackage.oi2.Y(r0)
            r14 = r2
            r15 = r3
            r3 = r5
            r2 = r9
            goto Lb4
        L57:
            boolean r2 = r6.X
            boolean r3 = r6.R
            defpackage.oi2.Y(r0)
        L5e:
            r14 = r2
            r15 = r3
            goto L7f
        L61:
            defpackage.oi2.Y(r0)
            jf4 r0 = r1.m
            boolean r2 = r0.a()
            pn5 r0 = r1.i
            r3 = r20
            r6.R = r3
            r6.X = r2
            r6.g0 = r10
            pl r0 = (defpackage.pl) r0
            hk r0 = r0.c
            java.lang.Object r0 = r0.b(r6)
            if (r0 != r7) goto L5e
            goto Le1
        L7f:
            jb5 r0 = (defpackage.jb5) r0
            if (r0 != 0) goto L8f
            oi4 r11 = new oi4
            ni4 r12 = defpackage.ni4.DISABLED_NOT_LOGGED_IN
            ui4 r13 = defpackage.ui4.EMPTY
            r16 = 16
            r11.<init>(r12, r13, r14, r15, r16)
            return r11
        L8f:
            java.lang.String r2 = r0.a()
            pq5 r0 = r1.h()
            java.lang.String r3 = r0.i
            xe1 r0 = defpackage.xk1.a
            de1 r11 = defpackage.de1.L
            mo5 r0 = new mo5
            r5 = 1
            r0.<init>(r1, r2, r3, r4, r5)
            r6.Y = r2
            r6.Z = r3
            r6.R = r15
            r6.X = r14
            r6.g0 = r9
            java.lang.Object r0 = defpackage.hv.d0(r11, r0, r6)
            if (r0 != r7) goto Lb4
            goto Le1
        Lb4:
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto Lc0
            ni4 r0 = defpackage.ni4.ENABLED
        Lbe:
            r9 = r0
            goto Lc3
        Lc0:
            ni4 r0 = defpackage.ni4.DISABLED_NO_CACHE
            goto Lbe
        Lc3:
            xe1 r0 = defpackage.xk1.a
            de1 r11 = defpackage.de1.L
            mo5 r0 = new mo5
            r5 = 2
            r1 = r19
            r0.<init>(r1, r2, r3, r4, r5)
            r6.Y = r4
            r6.Z = r4
            r6.d0 = r9
            r6.R = r15
            r6.X = r14
            r6.g0 = r8
            java.lang.Object r0 = defpackage.hv.d0(r11, r0, r6)
            if (r0 != r7) goto Le2
        Le1:
            return r7
        Le2:
            r12 = r9
            r17 = r14
            r18 = r15
        Le7:
            pj4 r0 = (defpackage.pj4) r0
            ui4 r1 = r0.a
            ui4 r2 = defpackage.ui4.OK
            r3 = 0
            if (r1 != r2) goto Lf1
            goto Lf2
        Lf1:
            r10 = r3
        Lf2:
            oi4 r11 = new oi4
            if (r10 == 0) goto Lfc
            int r1 = r0.b()
            r13 = r1
            goto Lfd
        Lfc:
            r13 = r3
        Lfd:
            if (r10 == 0) goto L103
            int r3 = r0.b()
        L103:
            r14 = r3
            ui4 r15 = r0.a
            if (r10 == 0) goto L10a
            java.lang.Long r4 = r0.e
        L10a:
            r16 = r4
            r11.<init>(r12, r13, r14, r15, r16, r17, r18)
            return r11
    }

    public static final java.lang.Object o(defpackage.qv5 r16, java.util.List r17, defpackage.s41 r18) {
            r0 = r16
            r1 = r18
            of6 r2 = r0.q
            boolean r3 = r1 instanceof defpackage.mv5
            if (r3 == 0) goto L19
            r3 = r1
            mv5 r3 = (defpackage.mv5) r3
            int r4 = r3.h0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.h0 = r4
            goto L1e
        L19:
            mv5 r3 = new mv5
            r3.<init>(r0, r1)
        L1e:
            java.lang.Object r1 = r3.f0
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r3.h0
            r6 = 3
            jg7 r7 = defpackage.jg7.a
            r8 = 0
            r9 = 1
            if (r5 == 0) goto L48
            if (r5 != r9) goto L42
            int r5 = r3.e0
            int r10 = r3.d0
            zk6 r11 = r3.Z
            java.util.Iterator r12 = r3.Y
            java.util.List r13 = r3.X
            java.util.List r14 = r3.R
            defpackage.oi2.Y(r1)
            hm5 r1 = (defpackage.hm5) r1
            java.lang.Object r1 = r1.A
            r15 = r7
            goto L8d
        L42:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r8
        L48:
            defpackage.oi2.Y(r1)
            boolean r1 = r17.isEmpty()
            if (r1 == 0) goto L54
            r15 = r7
            goto Leb
        L54:
            r1 = r17
            java.util.List r5 = defpackage.gt0.e1(r1, r6)
            java.util.Iterator r10 = r5.iterator()
            r11 = 0
            r13 = r5
            r12 = r10
            r5 = r11
            r10 = r6
        L63:
            boolean r11 = r12.hasNext()
            if (r11 == 0) goto Ld7
            java.lang.Object r11 = r12.next()
            zk6 r11 = (defpackage.zk6) r11
            pn5 r14 = r0.i
            r15 = r7
            long r6 = r11.a
            r3.R = r1
            r3.X = r13
            r3.Y = r12
            r3.Z = r11
            r3.d0 = r10
            r3.e0 = r5
            r3.h0 = r9
            pl r14 = (defpackage.pl) r14
            java.lang.Object r6 = r14.h(r6, r3)
            if (r6 != r4) goto L8b
            return r4
        L8b:
            r14 = r1
            r1 = r6
        L8d:
            boolean r6 = r1 instanceof defpackage.em5
            if (r6 == 0) goto L93
            r1 = r8
        L93:
            o75 r1 = (defpackage.o75) r1
            if (r1 == 0) goto L9d
            java.lang.String r1 = r1.a()
            if (r1 != 0) goto La5
        L9d:
            long r6 = r11.a
            java.lang.String r1 = "#"
            java.lang.String r1 = defpackage.lb1.h(r6, r1)
        La5:
            yk6 r6 = r11.b
            int[] r7 = defpackage.jv5.a
            int r6 = r6.ordinal()
            r6 = r7[r6]
            if (r6 == r9) goto Lc7
            r7 = 2
            if (r6 == r7) goto Lc4
            r7 = 3
            if (r6 == r7) goto Lc1
            r7 = 4
            if (r6 != r7) goto Lbd
            xv5 r6 = defpackage.xv5.SERVER_REJECTED
            goto Lc9
        Lbd:
            defpackage.i.d()
            return r8
        Lc1:
            xv5 r6 = defpackage.xv5.NOT_IN_PREFETCH_CACHE
            goto Lc9
        Lc4:
            xv5 r6 = defpackage.xv5.DEFINITION_CHANGED
            goto Lc9
        Lc7:
            xv5 r6 = defpackage.xv5.MISSING_FROM_CURRENT_SET
        Lc9:
            wv5 r7 = new wv5
            java.lang.String r11 = r11.c
            r7.<init>(r1, r6, r11)
            r2.k(r7)
            r1 = r14
            r7 = r15
            r6 = 3
            goto L63
        Ld7:
            r15 = r7
            int r0 = r1.size()
            int r1 = r13.size()
            int r0 = r0 - r1
            if (r0 <= 0) goto Leb
            yv5 r1 = new yv5
            r1.<init>(r0)
            r2.k(r1)
        Leb:
            return r15
    }

    @Override // defpackage.no5
    public final java.lang.Object e(java.util.ArrayList r6, java.util.Map r7, defpackage.s41 r8) {
            r5 = this;
            boolean r0 = r8 instanceof defpackage.kv5
            if (r0 == 0) goto L13
            r0 = r8
            kv5 r0 = (defpackage.kv5) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            kv5 r0 = new kv5
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            java.util.Map r7 = r0.R
            defpackage.oi2.Y(r8)
            goto L4c
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            return r3
        L30:
            defpackage.oi2.Y(r8)
            r0.R = r7
            r0.Z = r4
            pn5 r5 = r5.i
            pl r5 = (defpackage.pl) r5
            r5.getClass()
            xe1 r5 = defpackage.xk1.a
            xg r8 = new xg
            r8.<init>(r6, r3, r4)
            java.lang.Object r8 = defpackage.hv.d0(r5, r8, r0)
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
            bb5 r8 = (defpackage.bb5) r8
            eb5 r0 = r8.a
            o75 r0 = r0.a
            long r0 = r0.a
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            java.lang.Object r0 = r7.get(r0)
            g3 r0 = (defpackage.g3) r0
            if (r0 != 0) goto L80
            eb5 r0 = r8.a
            boolean r0 = r0.b
            if (r0 == 0) goto L7e
            g3 r0 = defpackage.g3.Unlocked
            goto L80
        L7e:
            g3 r0 = defpackage.g3.Locked
        L80:
            java.lang.Object r1 = r5.get(r0)
            if (r1 != 0) goto L89
            r5.containsKey(r0)
        L89:
            java.util.List r1 = (java.util.List) r1
            m6 r2 = new m6
            r2.<init>(r8)
            if (r1 == 0) goto L96
            r1.add(r2)
            goto L9f
        L96:
            o6[] r8 = new defpackage.o6[r4]
            r1 = 0
            r8[r1] = r2
            java.util.ArrayList r1 = defpackage.hf.d0(r8)
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
            h3 r8 = new h3
            java.lang.Object r0 = r7.getKey()
            g3 r0 = (defpackage.g3) r0
            java.lang.Object r7 = r7.getValue()
            java.util.List r7 = (java.util.List) r7
            r8.<init>(r0, r7)
            r6.add(r8)
            goto Lb4
        Ld5:
            tp5 r5 = new tp5
            r5.<init>(r4)
            java.util.List r5 = defpackage.gt0.d1(r6, r5)
            return r5
    }

    @Override // defpackage.no5
    public final java.lang.Object g(defpackage.pq5 r7, defpackage.s41 r8) {
            r6 = this;
            boolean r0 = r8 instanceof defpackage.nv5
            if (r0 == 0) goto L13
            r0 = r8
            nv5 r0 = (defpackage.nv5) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            nv5 r0 = new nv5
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L31
            if (r2 != r4) goto L2b
            defpackage.oi2.Y(r8)
            goto L63
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            return r3
        L31:
            pq5 r7 = r0.R
            defpackage.oi2.Y(r8)
            goto L4b
        L37:
            defpackage.oi2.Y(r8)
            r0.R = r7
            r0.Z = r5
            pn5 r8 = r6.i
            pl r8 = (defpackage.pl) r8
            hk r8 = r8.c
            java.lang.Object r8 = r8.b(r0)
            if (r8 != r1) goto L4b
            goto L62
        L4b:
            jb5 r8 = (defpackage.jb5) r8
            if (r8 != 0) goto L50
            goto L6b
        L50:
            java.lang.String r8 = r8.a()
            java.lang.String r7 = r7.i
            r0.R = r3
            r0.Z = r4
            oj4 r6 = r6.j
            java.lang.Object r8 = r6.g(r8, r7, r0)
            if (r8 != r1) goto L63
        L62:
            return r1
        L63:
            pj4 r8 = (defpackage.pj4) r8
            ui4 r6 = r8.a
            ui4 r7 = defpackage.ui4.OK
            if (r6 == r7) goto L6e
        L6b:
            du1 r6 = defpackage.du1.A
            return r6
        L6e:
            java.util.List r6 = r8.b
            java.util.ArrayList r7 = new java.util.ArrayList
            r8 = 10
            int r8 = defpackage.ht0.v0(r6, r8)
            r7.<init>(r8)
            java.util.Iterator r6 = r6.iterator()
        L7f:
            boolean r8 = r6.hasNext()
            if (r8 == 0) goto L96
            java.lang.Object r8 = r6.next()
            ek4 r8 = (defpackage.ek4) r8
            long r0 = r8.e
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r0)
            r7.add(r8)
            goto L7f
        L96:
            java.util.Set r6 = defpackage.gt0.p1(r7)
            return r6
    }

    @Override // defpackage.no5
    public final defpackage.pq5 h() {
            r1 = this;
            v46 r1 = r1.n
            java.lang.String r0 = "rom"
            java.lang.Object r1 = r1.a(r0)
            r1.getClass()
            wz5 r1 = (defpackage.wz5) r1
            pq5 r1 = r1.A
            return r1
    }

    @Override // defpackage.no5
    public final java.io.Serializable i(defpackage.s41 r6) {
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ov5
            if (r0 == 0) goto L13
            r0 = r6
            ov5 r0 = (defpackage.ov5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            ov5 r0 = new ov5
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.oi2.Y(r6)
            goto L49
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            return r3
        L2e:
            defpackage.oi2.Y(r6)
            r0.Y = r4
            pn5 r5 = r5.i
            pl r5 = (defpackage.pl) r5
            r5.getClass()
            xe1 r6 = defpackage.xk1.a
            zk r2 = new zk
            r4 = 0
            r2.<init>(r5, r3, r4)
            java.lang.Object r6 = defpackage.hv.d0(r6, r2, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r5 = 10
            int r5 = defpackage.ht0.v0(r6, r5)
            int r5 = defpackage.c14.k0(r5)
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
            g3 r6 = defpackage.g3.Locked
            goto L99
        L82:
            g3 r6 = defpackage.g3.Unsynced
            goto L99
        L85:
            g3 r6 = defpackage.g3.AlmostThere
            goto L99
        L88:
            g3 r6 = defpackage.g3.ActiveChallenges
            goto L99
        L8b:
            g3 r6 = defpackage.g3.RecentlyUnlocked
            goto L99
        L8e:
            g3 r6 = defpackage.g3.Unofficial
            goto L99
        L91:
            g3 r6 = defpackage.g3.Unsupported
            goto L99
        L94:
            g3 r6 = defpackage.g3.Unlocked
            goto L99
        L97:
            g3 r6 = defpackage.g3.Locked
        L99:
            r0.put(r3, r6)
            goto L63
        L9d:
            return r0
    }

    @Override // defpackage.no5
    public final java.io.Serializable j(defpackage.s41 r6) {
            r5 = this;
            boolean r0 = r6 instanceof defpackage.pv5
            if (r0 == 0) goto L13
            r0 = r6
            pv5 r0 = (defpackage.pv5) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            pv5 r0 = new pv5
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.oi2.Y(r6)
            goto L48
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            return r3
        L2e:
            defpackage.oi2.Y(r6)
            r0.Y = r4
            pn5 r5 = r5.i
            pl r5 = (defpackage.pl) r5
            r5.getClass()
            xe1 r6 = defpackage.xk1.a
            zk r2 = new zk
            r2.<init>(r5, r3, r4)
            java.lang.Object r6 = defpackage.hv.d0(r6, r2, r0)
            if (r6 != r1) goto L48
            return r1
        L48:
            java.lang.Iterable r6 = (java.lang.Iterable) r6
            r6.getClass()
            dv r5 = new dv
            a5 r0 = new a5
            r1 = 16
            r0.<init>(r6, r1)
            r6 = 2
            r5.<init>(r0, r6)
            r6 = 10
            int r6 = defpackage.ht0.v0(r5, r6)
            int r6 = defpackage.c14.k0(r6)
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
            op1 r0 = (defpackage.op1) r0
            java.util.Iterator r1 = r0.B
            boolean r1 = r1.hasNext()
            if (r1 == 0) goto L8f
            java.lang.Object r0 = r0.next()
            j43 r0 = (defpackage.j43) r0
            java.lang.Object r1 = r0.b
            int r0 = r0.a
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r0)
            r6.put(r1, r2)
            goto L71
        L8f:
            return r6
    }

    public final void p() {
            r4 = this;
            as0 r0 = defpackage.to7.a(r4)
            bf4 r1 = new bf4
            r2 = 12
            r3 = 0
            r1.<init>(r4, r3, r2)
            r4 = 3
            defpackage.hv.L(r0, r3, r3, r1, r4)
            return
    }
}
