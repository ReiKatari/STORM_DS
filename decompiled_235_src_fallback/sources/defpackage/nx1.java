package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nx1  reason: default package */
/* loaded from: classes.dex */
public final class nx1 extends defpackage.no5 {
    public final defpackage.pn5 i;
    public final defpackage.oj4 j;
    public final defpackage.sx1 k;
    public final defpackage.jh l;
    public final defpackage.jf4 m;
    public final defpackage.ci0 n;
    public java.util.List o;
    public java.util.List p;

    public nx1(defpackage.kd6 r1, defpackage.pn5 r2, defpackage.oj4 r3, defpackage.sx1 r4, defpackage.jh r5, defpackage.jf4 r6, defpackage.ci0 r7) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r5.getClass()
            r6.getClass()
            r0.<init>(r2, r1)
            r0.i = r2
            r0.j = r3
            r0.k = r4
            r0.l = r5
            r0.m = r6
            r0.n = r7
            yt1 r1 = defpackage.yt1.A
            r0.o = r1
            r0.p = r1
            as0 r1 = defpackage.to7.a(r0)
            a6 r2 = new a6
            r3 = 16
            r4 = 0
            r2.<init>(r0, r4, r3)
            r0 = 3
            defpackage.hv.L(r1, r4, r4, r2, r0)
            return
    }

    @Override // defpackage.no5
    public final java.lang.Object e(java.util.ArrayList r18, java.util.Map r19, defpackage.s41 r20) {
            r17 = this;
            r0 = r17
            r1 = r20
            boolean r2 = r1 instanceof defpackage.hx1
            if (r2 == 0) goto L17
            r2 = r1
            hx1 r2 = (defpackage.hx1) r2
            int r3 = r2.f0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.f0 = r3
            goto L1c
        L17:
            hx1 r2 = new hx1
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.d0
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r2.f0
            r5 = 0
            r6 = 2
            r7 = 1
            if (r4 == 0) goto L4b
            if (r4 == r7) goto L3c
            if (r4 != r6) goto L36
            java.util.List r3 = r2.Z
            s83 r4 = r2.Y
            java.util.Map r2 = r2.X
            defpackage.oi2.Y(r1)
            goto La3
        L36:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r5
        L3c:
            s83 r4 = r2.Y
            java.util.Map r8 = r2.X
            java.util.ArrayList r9 = r2.R
            defpackage.oi2.Y(r1)
            r16 = r9
            r9 = r4
            r4 = r16
            goto L7a
        L4b:
            defpackage.oi2.Y(r1)
            vr0 r1 = defpackage.u83.a
            s83 r1 = r1.b()
            ci0 r4 = r0.n
            java.lang.Object r4 = r4.g
            tp6 r4 = (defpackage.tp6) r4
            b7 r8 = new b7
            r9 = 12
            r8.<init>(r4, r9)
            r4 = r18
            r2.R = r4
            r9 = r19
            r2.X = r9
            r2.Y = r1
            r2.f0 = r7
            java.lang.Object r8 = defpackage.f04.D(r8, r2)
            if (r8 != r3) goto L74
            goto L9e
        L74:
            r16 = r9
            r9 = r1
            r1 = r8
            r8 = r16
        L7a:
            java.util.List r1 = (java.util.List) r1
            if (r1 != 0) goto L80
            yt1 r1 = defpackage.yt1.A
        L80:
            r2.R = r5
            r2.X = r8
            r2.Y = r9
            r2.Z = r1
            r2.f0 = r6
            pn5 r6 = r0.i
            pl r6 = (defpackage.pl) r6
            r6.getClass()
            xe1 r6 = defpackage.xk1.a
            xg r10 = new xg
            r10.<init>(r4, r5, r7)
            java.lang.Object r2 = defpackage.hv.d0(r6, r10, r2)
            if (r2 != r3) goto L9f
        L9e:
            return r3
        L9f:
            r3 = r1
            r1 = r2
            r2 = r8
            r4 = r9
        La3:
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.util.Iterator r1 = r1.iterator()
        Lae:
            boolean r8 = r1.hasNext()
            r9 = 0
            if (r8 == 0) goto L1a6
            java.lang.Object r8 = r1.next()
            bb5 r8 = (defpackage.bb5) r8
            if (r3 == 0) goto Lc4
            boolean r10 = r3.isEmpty()
            if (r10 == 0) goto Lc4
            goto Le4
        Lc4:
            java.util.Iterator r10 = r3.iterator()
        Lc8:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto Le4
            java.lang.Object r11 = r10.next()
            o75 r11 = (defpackage.o75) r11
            long r11 = r11.a
            eb5 r13 = r8.a
            o75 r13 = r13.a
            long r13 = r13.a
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 != 0) goto Lc8
            g3 r10 = defpackage.g3.PendingSubmissions
            goto L183
        Le4:
            eb5 r10 = r8.a
            o75 r11 = r10.a
            o75 r12 = r10.a
            long r13 = r11.a
            java.lang.Long r11 = java.lang.Long.valueOf(r13)
            boolean r11 = r2.containsKey(r11)
            if (r11 == 0) goto L104
            long r10 = r12.a
            java.lang.Long r10 = java.lang.Long.valueOf(r10)
            java.lang.Object r10 = defpackage.c14.j0(r2, r10)
            g3 r10 = (defpackage.g3) r10
            goto L183
        L104:
            boolean r10 = r10.b
            long r11 = r12.a
            if (r10 == 0) goto L145
            java.util.List r10 = r0.p
            java.util.Iterator r10 = r10.iterator()
        L110:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L124
            java.lang.Object r13 = r10.next()
            r14 = r13
            gx1 r14 = (defpackage.gx1) r14
            long r14 = r14.a
            int r14 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
            if (r14 != 0) goto L110
            goto L125
        L124:
            r13 = r5
        L125:
            gx1 r13 = (defpackage.gx1) r13
            if (r13 == 0) goto L142
            s83 r10 = r13.b
            long r10 = r4.a(r10)
            jd1 r12 = defpackage.oq1.B
            r12 = 10
            uq1 r13 = defpackage.uq1.MINUTES
            long r12 = defpackage.n16.L(r12, r13)
            int r10 = defpackage.oq1.c(r10, r12)
            if (r10 >= 0) goto L142
            g3 r10 = defpackage.g3.RecentlyUnlocked
            goto L183
        L142:
            g3 r10 = defpackage.g3.Unlocked
            goto L183
        L145:
            java.util.List r10 = r0.o
            if (r10 == 0) goto L150
            boolean r13 = r10.isEmpty()
            if (r13 == 0) goto L150
            goto L16b
        L150:
            java.util.Iterator r10 = r10.iterator()
        L154:
            boolean r13 = r10.hasNext()
            if (r13 == 0) goto L16b
            java.lang.Object r13 = r10.next()
            java.lang.Number r13 = (java.lang.Number) r13
            long r13 = r13.longValue()
            int r13 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r13 != 0) goto L154
            g3 r10 = defpackage.g3.ActiveChallenges
            goto L183
        L16b:
            int r10 = r8.c
            if (r10 != 0) goto L171
            r10 = 0
            goto L177
        L171:
            int r11 = r8.b
            float r11 = (float) r11
            float r10 = (float) r10
            float r10 = r11 / r10
        L177:
            r11 = 1061997773(0x3f4ccccd, float:0.8)
            int r10 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r10 < 0) goto L181
            g3 r10 = defpackage.g3.AlmostThere
            goto L183
        L181:
            g3 r10 = defpackage.g3.Locked
        L183:
            java.lang.Object r11 = r6.get(r10)
            if (r11 != 0) goto L18c
            r6.containsKey(r10)
        L18c:
            java.util.List r11 = (java.util.List) r11
            m6 r12 = new m6
            r12.<init>(r8)
            if (r11 == 0) goto L199
            r11.add(r12)
            goto L1a1
        L199:
            o6[] r8 = new defpackage.o6[r7]
            r8[r9] = r12
            java.util.ArrayList r11 = defpackage.hf.d0(r8)
        L1a1:
            r6.put(r10, r11)
            goto Lae
        L1a6:
            java.util.ArrayList r1 = new java.util.ArrayList
            int r2 = r6.size()
            r1.<init>(r2)
            java.util.Set r2 = r6.entrySet()
            java.util.Iterator r2 = r2.iterator()
        L1b7:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L1f0
            java.lang.Object r3 = r2.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            java.lang.Object r4 = r3.getKey()
            g3 r5 = defpackage.g3.RecentlyUnlocked
            if (r4 != r5) goto L1db
            java.lang.Object r4 = r3.getValue()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            ix1 r5 = new ix1
            r5.<init>(r0, r9)
            java.util.List r4 = defpackage.gt0.d1(r4, r5)
            goto L1e1
        L1db:
            java.lang.Object r4 = r3.getValue()
            java.util.List r4 = (java.util.List) r4
        L1e1:
            h3 r5 = new h3
            java.lang.Object r3 = r3.getKey()
            g3 r3 = (defpackage.g3) r3
            r5.<init>(r3, r4)
            r1.add(r5)
            goto L1b7
        L1f0:
            zh2 r0 = new zh2
            r2 = 13
            r0.<init>(r2)
            java.util.List r0 = defpackage.gt0.d1(r1, r0)
            return r0
    }

    @Override // defpackage.no5
    public final java.lang.Object g(defpackage.pq5 r7, defpackage.s41 r8) {
            r6 = this;
            boolean r0 = r8 instanceof defpackage.jx1
            if (r0 == 0) goto L13
            r0 = r8
            jx1 r0 = (defpackage.jx1) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            jx1 r0 = new jx1
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
            r2 = this;
            sx1 r2 = r2.k
            lb4 r2 = r2.e
            boolean r0 = r2 instanceof defpackage.rx1
            r1 = 0
            if (r0 == 0) goto Lc
            rx1 r2 = (defpackage.rx1) r2
            goto Ld
        Lc:
            r2 = r1
        Ld:
            if (r2 == 0) goto L12
            pq5 r2 = r2.o
            return r2
        L12:
            java.lang.String r2 = "Emulator must be running a ROM session"
            defpackage.i.m(r2)
            return r1
    }

    @Override // defpackage.no5
    public final java.io.Serializable i(defpackage.s41 r6) {
            r5 = this;
            boolean r0 = r6 instanceof defpackage.kx1
            if (r0 == 0) goto L13
            r0 = r6
            kx1 r0 = (defpackage.kx1) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            kx1 r0 = new kx1
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
            boolean r0 = r6 instanceof defpackage.lx1
            if (r0 == 0) goto L13
            r0 = r6
            lx1 r0 = (defpackage.lx1) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            lx1 r0 = new lx1
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

    @Override // defpackage.no5
    public final java.lang.Object k(defpackage.pq5 r6, boolean r7, defpackage.r41 r8) {
            r5 = this;
            boolean r0 = r8 instanceof defpackage.mx1
            if (r0 == 0) goto L13
            r0 = r8
            mx1 r0 = (defpackage.mx1) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L1a
        L13:
            mx1 r0 = new mx1
            s41 r8 = (defpackage.s41) r8
            r0.<init>(r5, r8)
        L1a:
            java.lang.Object r8 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L30
            defpackage.oi2.Y(r8)
            hm5 r8 = (defpackage.hm5) r8
            java.lang.Object r5 = r8.A
            return r5
        L30:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            r5 = 0
            return r5
        L37:
            defpackage.oi2.Y(r8)
            hm5 r8 = (defpackage.hm5) r8
            java.lang.Object r5 = r8.A
            return r5
        L3f:
            defpackage.oi2.Y(r8)
            sx1 r8 = r5.k
            boolean r2 = r8.a()
            if (r2 == 0) goto L4f
            boolean r8 = r8.d
            if (r8 == 0) goto L4f
            goto L57
        L4f:
            jf4 r8 = r5.m
            boolean r8 = r8.a()
            if (r8 != 0) goto L67
        L57:
            java.lang.String r6 = r6.i
            r0.Y = r4
            pn5 r5 = r5.i
            pl r5 = (defpackage.pl) r5
            java.lang.Object r5 = r5.j(r6, r7, r0)
            if (r5 != r1) goto L66
            goto L6f
        L66:
            return r5
        L67:
            r0.Y = r3
            java.lang.Object r5 = defpackage.no5.l(r5, r6, r7, r0)
            if (r5 != r1) goto L70
        L6f:
            return r1
        L70:
            return r5
    }
}
