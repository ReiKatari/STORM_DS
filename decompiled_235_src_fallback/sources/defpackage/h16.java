package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h16  reason: default package */
/* loaded from: classes.dex */
public final class h16 implements defpackage.hp0 {
    public final android.content.Context a;
    public final me.magnum.melonds.database.MelonDatabase b;
    public final defpackage.jd6 c;

    public h16(android.content.Context r1, me.magnum.melonds.database.MelonDatabase r2, defpackage.jd6 r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public final java.lang.Object a(defpackage.an0 r17, me.magnum.melonds.domain.model.Cheat r18, defpackage.s41 r19) {
            r16 = this;
            r0 = r16
            r1 = r19
            boolean r2 = r1 instanceof defpackage.r06
            if (r2 == 0) goto L17
            r2 = r1
            r06 r2 = (defpackage.r06) r2
            int r3 = r2.Y
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.Y = r3
            goto L1c
        L17:
            r06 r2 = new r06
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.R
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r2.Y
            r5 = 1
            if (r4 == 0) goto L32
            if (r4 != r5) goto L2b
            defpackage.oi2.Y(r1)
            goto L73
        L2b:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = 0
            return r0
        L32:
            defpackage.oi2.Y(r1)
            zm0 r6 = new zm0
            r1 = r17
            java.lang.Long r1 = r1.a
            r1.getClass()
            long r8 = r1.longValue()
            long r10 = r18.getCheatDatabaseId()
            java.lang.String r12 = r18.getName()
            java.lang.String r13 = r18.getDescription()
            java.lang.String r14 = r18.getCode()
            boolean r15 = r18.getEnabled()
            r7 = 0
            r6.<init>(r7, r8, r10, r12, r13, r14, r15)
            me.magnum.melonds.database.MelonDatabase r1 = r0.b
            vm0 r1 = r1.s()
            r2.Y = r5
            m16 r4 = r1.a
            y r7 = new y
            r8 = 10
            r7.<init>(r8, r1, r6)
            r1 = 0
            java.lang.Object r1 = defpackage.hv.S(r2, r4, r1, r5, r7)
            if (r1 != r3) goto L73
            return r3
        L73:
            jd6 r0 = r0.c
            r0.i()
            jg7 r0 = defpackage.jg7.a
            return r0
    }

    public final java.lang.Object b(java.lang.String r8, defpackage.s41 r9) {
            r7 = this;
            boolean r0 = r9 instanceof defpackage.s06
            if (r0 == 0) goto L13
            r0 = r9
            s06 r0 = (defpackage.s06) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            s06 r0 = new s06
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L2a
            java.lang.String r8 = r0.R
            defpackage.oi2.Y(r9)
            goto L53
        L2a:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            return r3
        L30:
            defpackage.oi2.Y(r9)
            ym0 r9 = new ym0
            r9.<init>(r8, r3)
            me.magnum.melonds.database.MelonDatabase r2 = r7.b
            xm0 r2 = r2.t()
            r0.R = r8
            r0.Z = r4
            m16 r3 = r2.a
            y r5 = new y
            r6 = 11
            r5.<init>(r6, r2, r9)
            r9 = 0
            java.lang.Object r9 = defpackage.hv.S(r0, r3, r9, r4, r5)
            if (r9 != r1) goto L53
            return r1
        L53:
            java.lang.Number r9 = (java.lang.Number) r9
            long r0 = r9.longValue()
            jd6 r7 = r7.c
            r7.i()
            wm0 r7 = new wm0
            java.lang.Long r9 = new java.lang.Long
            r9.<init>(r0)
            r7.<init>(r8, r9)
            return r7
    }

    public final java.lang.Object c(java.lang.String r11, defpackage.cp2 r12, defpackage.s41 r13) {
            r10 = this;
            boolean r0 = r13 instanceof defpackage.t06
            if (r0 == 0) goto L13
            r0 = r13
            t06 r0 = (defpackage.t06) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            t06 r0 = new t06
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            me.magnum.melonds.database.MelonDatabase r4 = r10.b
            r5 = 2
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L3a
            if (r2 == r6) goto L34
            if (r2 != r5) goto L2e
            defpackage.oi2.Y(r13)
            goto L8b
        L2e:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r10)
            return r7
        L34:
            java.lang.String r11 = r0.R
            defpackage.oi2.Y(r13)
            goto L63
        L3a:
            defpackage.oi2.Y(r13)
            java.lang.Long r13 = r12.a
            if (r13 != 0) goto L6a
            lp2 r13 = new lp2
            java.lang.String r2 = r12.b
            java.lang.String r8 = r12.c
            java.lang.String r12 = r12.d
            r13.<init>(r7, r2, r8, r12)
            ip2 r12 = r4.v()
            r0.R = r11
            r0.Z = r6
            m16 r2 = r12.a
            bi2 r8 = new bi2
            r9 = 3
            r8.<init>(r9, r12, r13)
            java.lang.Object r13 = defpackage.hv.S(r0, r2, r3, r6, r8)
            if (r13 != r1) goto L63
            goto L8a
        L63:
            java.lang.Number r13 = (java.lang.Number) r13
            long r12 = r13.longValue()
            goto L6e
        L6a:
            long r12 = r13.longValue()
        L6e:
            cn0 r2 = new cn0
            r2.<init>(r7, r12, r11)
            bn0 r11 = r4.u()
            r0.R = r7
            r0.Z = r5
            m16 r12 = r11.a
            y r13 = new y
            r4 = 13
            r13.<init>(r4, r11, r2)
            java.lang.Object r11 = defpackage.hv.S(r0, r12, r3, r6, r13)
            if (r11 != r1) goto L8b
        L8a:
            return r1
        L8b:
            jd6 r10 = r10.c
            r10.i()
            jg7 r10 = defpackage.jg7.a
            return r10
    }

    public final java.lang.Object d(defpackage.an0 r18, defpackage.jo0 r19, defpackage.s41 r20) {
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = r20
            boolean r3 = r2 instanceof defpackage.u06
            if (r3 == 0) goto L19
            r3 = r2
            u06 r3 = (defpackage.u06) r3
            int r4 = r3.Y
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.Y = r4
            goto L1e
        L19:
            u06 r3 = new u06
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.R
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r3.Y
            r6 = 1
            if (r5 == 0) goto L34
            if (r5 != r6) goto L2d
            defpackage.oi2.Y(r2)
            goto L6b
        L2d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            r0 = 0
            return r0
        L34:
            defpackage.oi2.Y(r2)
            zm0 r7 = new zm0
            r2 = r18
            java.lang.Long r2 = r2.a
            r2.getClass()
            long r9 = r2.longValue()
            java.lang.String r13 = r1.a
            java.lang.String r14 = r1.b
            java.lang.String r15 = r1.c
            r16 = 0
            r8 = 0
            r11 = 0
            r7.<init>(r8, r9, r11, r13, r14, r15, r16)
            me.magnum.melonds.database.MelonDatabase r1 = r0.b
            vm0 r1 = r1.s()
            r3.Y = r6
            m16 r2 = r1.a
            y r5 = new y
            r8 = 10
            r5.<init>(r8, r1, r7)
            r1 = 0
            java.lang.Object r1 = defpackage.hv.S(r3, r2, r1, r6, r5)
            if (r1 != r4) goto L6b
            return r4
        L6b:
            jd6 r0 = r0.c
            r0.i()
            jg7 r0 = defpackage.jg7.a
            return r0
    }

    public final java.lang.Object e(defpackage.cp2 r29, defpackage.s41 r30) {
            r28 = this;
            r0 = r28
            r1 = r29
            r2 = r30
            boolean r3 = r2 instanceof defpackage.v06
            if (r3 == 0) goto L19
            r3 = r2
            v06 r3 = (defpackage.v06) r3
            int r4 = r3.e0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.e0 = r4
            goto L1e
        L19:
            v06 r3 = new v06
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.Z
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r3.e0
            r6 = 0
            r7 = 10
            r8 = 4
            r9 = 3
            r10 = 2
            r11 = 1
            me.magnum.melonds.database.MelonDatabase r12 = r0.b
            r13 = 0
            if (r5 == 0) goto L5d
            if (r5 == r11) goto L57
            if (r5 == r10) goto L50
            if (r5 == r9) goto L45
            if (r5 != r8) goto L3f
            lp2 r1 = r3.X
            defpackage.oi2.Y(r2)
            goto L182
        L3f:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r13
        L45:
            long r9 = r3.Y
            lp2 r1 = r3.X
            cp2 r5 = r3.R
            defpackage.oi2.Y(r2)
            goto Lf4
        L50:
            cp2 r1 = r3.R
            defpackage.oi2.Y(r2)
        L55:
            r5 = r1
            goto L9d
        L57:
            cp2 r1 = r3.R
            defpackage.oi2.Y(r2)
            goto L82
        L5d:
            defpackage.oi2.Y(r2)
            lp2 r2 = new lp2
            java.lang.String r5 = r1.b
            java.lang.String r14 = r1.c
            java.lang.String r15 = r1.d
            r2.<init>(r13, r5, r14, r15)
            ip2 r5 = r12.v()
            r3.R = r1
            r3.e0 = r11
            m16 r14 = r5.a
            bi2 r15 = new bi2
            r15.<init>(r9, r5, r2)
            java.lang.Object r2 = defpackage.hv.S(r3, r14, r6, r11, r15)
            if (r2 != r4) goto L82
            goto L181
        L82:
            ip2 r2 = r12.v()
            java.lang.String r5 = r1.c
            java.lang.String r14 = r1.d
            r3.R = r1
            r3.e0 = r10
            m16 r2 = r2.a
            sm0 r10 = new sm0
            r10.<init>(r5, r11, r14)
            java.lang.Object r2 = defpackage.hv.S(r3, r2, r11, r6, r10)
            if (r2 != r4) goto L55
            goto L181
        L9d:
            r2.getClass()
            lp2 r2 = (defpackage.lp2) r2
            java.lang.Long r1 = r2.a
            r1.getClass()
            long r14 = r1.longValue()
            java.util.List r1 = r5.e
            java.util.ArrayList r10 = new java.util.ArrayList
            int r8 = defpackage.ht0.v0(r1, r7)
            r10.<init>(r8)
            java.util.Iterator r1 = r1.iterator()
        Lba:
            boolean r8 = r1.hasNext()
            if (r8 == 0) goto Ld3
            java.lang.Object r8 = r1.next()
            an0 r8 = (defpackage.an0) r8
            cn0 r7 = new cn0
            java.lang.String r8 = r8.b
            r7.<init>(r13, r14, r8)
            r10.add(r7)
            r7 = 10
            goto Lba
        Ld3:
            bn0 r1 = r12.u()
            r3.R = r5
            r3.X = r2
            r3.Y = r14
            r3.e0 = r9
            m16 r7 = r1.a
            y r8 = new y
            r9 = 12
            r8.<init>(r9, r1, r10)
            java.lang.Object r1 = defpackage.hv.S(r3, r7, r6, r11, r8)
            if (r1 != r4) goto Lf0
            goto L181
        Lf0:
            r9 = r2
            r2 = r1
            r1 = r9
            r9 = r14
        Lf4:
            java.util.List r2 = (java.util.List) r2
            java.util.List r5 = r5.e
            java.util.ArrayList r2 = defpackage.gt0.q1(r5, r2)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r7 = r2.size()
            r8 = r6
        L106:
            if (r8 >= r7) goto L164
            java.lang.Object r14 = r2.get(r8)
            int r8 = r8 + 1
            vr4 r14 = (defpackage.vr4) r14
            java.lang.Object r15 = r14.A
            an0 r15 = (defpackage.an0) r15
            java.util.ArrayList r15 = r15.c
            java.util.ArrayList r11 = new java.util.ArrayList
            r6 = 10
            int r13 = defpackage.ht0.v0(r15, r6)
            r11.<init>(r13)
            int r13 = r15.size()
            r6 = 0
        L126:
            if (r6 >= r13) goto L15b
            java.lang.Object r16 = r15.get(r6)
            int r6 = r6 + 1
            me.magnum.melonds.domain.model.Cheat r16 = (me.magnum.melonds.domain.model.Cheat) r16
            zm0 r17 = new zm0
            r27 = r2
            java.lang.Object r2 = r14.B
            java.lang.Number r2 = (java.lang.Number) r2
            long r19 = r2.longValue()
            long r21 = r16.getCheatDatabaseId()
            java.lang.String r23 = r16.getName()
            java.lang.String r24 = r16.getDescription()
            java.lang.String r25 = r16.getCode()
            r26 = 0
            r18 = 0
            r17.<init>(r18, r19, r21, r23, r24, r25, r26)
            r2 = r17
            r11.add(r2)
            r2 = r27
            goto L126
        L15b:
            r27 = r2
            defpackage.gt0.A0(r5, r11)
            r6 = 0
            r11 = 1
            r13 = 0
            goto L106
        L164:
            vm0 r2 = r12.s()
            r6 = 0
            r3.R = r6
            r3.X = r1
            r3.Y = r9
            r6 = 4
            r3.e0 = r6
            m16 r6 = r2.a
            rm0 r7 = new rm0
            r8 = 0
            r7.<init>(r2, r5, r8)
            r2 = 1
            java.lang.Object r2 = defpackage.hv.S(r3, r6, r8, r2, r7)
            if (r2 != r4) goto L182
        L181:
            return r4
        L182:
            jd6 r0 = r0.c
            r0.i()
            cp2 r2 = new cp2
            java.lang.Long r3 = r1.a
            java.lang.String r4 = r1.b
            java.lang.String r5 = r1.c
            java.lang.String r6 = r1.d
            yt1 r7 = defpackage.yt1.A
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
    }

    public final java.lang.Object f(me.magnum.melonds.domain.model.Cheat r8, defpackage.s41 r9) {
            r7 = this;
            boolean r0 = r9 instanceof defpackage.w06
            if (r0 == 0) goto L13
            r0 = r9
            w06 r0 = (defpackage.w06) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            w06 r0 = new w06
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            jg7 r3 = defpackage.jg7.a
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L29
            defpackage.oi2.Y(r9)
            goto L59
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            r7 = 0
            return r7
        L30:
            defpackage.oi2.Y(r9)
            java.lang.Long r8 = r8.getId()
            if (r8 == 0) goto L5e
            long r8 = r8.longValue()
            me.magnum.melonds.database.MelonDatabase r2 = r7.b
            vm0 r2 = r2.s()
            r0.Y = r4
            m16 r2 = r2.a
            t4 r5 = new t4
            r6 = 3
            r5.<init>(r6, r8)
            r8 = 0
            java.lang.Object r8 = defpackage.hv.S(r0, r2, r8, r4, r5)
            if (r8 != r1) goto L55
            goto L56
        L55:
            r8 = r3
        L56:
            if (r8 != r1) goto L59
            return r1
        L59:
            jd6 r7 = r7.c
            r7.i()
        L5e:
            return r3
    }

    public final java.lang.Object g(java.lang.String r10, defpackage.s41 r11) {
            r9 = this;
            boolean r0 = r11 instanceof defpackage.x06
            if (r0 == 0) goto L13
            r0 = r11
            x06 r0 = (defpackage.x06) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            x06 r0 = new x06
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 3
            r4 = 2
            r5 = 0
            me.magnum.melonds.database.MelonDatabase r6 = r9.b
            jg7 r7 = defpackage.jg7.a
            r8 = 1
            if (r2 == 0) goto L42
            if (r2 == r8) goto L3e
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L33
            defpackage.oi2.Y(r11)
            goto L99
        L33:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r9)
            r9 = 0
            return r9
        L3a:
            defpackage.oi2.Y(r11)
            goto L80
        L3e:
            defpackage.oi2.Y(r11)
            goto L66
        L42:
            defpackage.oi2.Y(r11)
            java.lang.String r11 = "__custom_cheat_database"
            boolean r11 = defpackage.nb3.k(r10, r11)
            if (r11 == 0) goto L4e
            return r7
        L4e:
            xm0 r11 = r6.t()
            r0.Y = r8
            m16 r11 = r11.a
            c70 r2 = new c70
            r2.<init>(r10, r8)
            java.lang.Object r10 = defpackage.hv.S(r0, r11, r5, r8, r2)
            if (r10 != r1) goto L62
            goto L63
        L62:
            r10 = r7
        L63:
            if (r10 != r1) goto L66
            goto L98
        L66:
            bn0 r10 = r6.u()
            r0.Y = r4
            m16 r10 = r10.a
            k4 r11 = new k4
            r2 = 28
            r11.<init>(r2)
            java.lang.Object r10 = defpackage.hv.S(r0, r10, r5, r8, r11)
            if (r10 != r1) goto L7c
            goto L7d
        L7c:
            r10 = r7
        L7d:
            if (r10 != r1) goto L80
            goto L98
        L80:
            ip2 r10 = r6.v()
            r0.Y = r3
            m16 r10 = r10.a
            bz1 r11 = new bz1
            r2 = 7
            r11.<init>(r2)
            java.lang.Object r10 = defpackage.hv.S(r0, r10, r5, r8, r11)
            if (r10 != r1) goto L95
            goto L96
        L95:
            r10 = r7
        L96:
            if (r10 != r1) goto L99
        L98:
            return r1
        L99:
            jd6 r9 = r9.c
            r9.i()
            return r7
    }

    public final java.lang.Object h(defpackage.lx5 r19, defpackage.s41 r20) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r2 instanceof defpackage.y06
            if (r3 == 0) goto L19
            r3 = r2
            y06 r3 = (defpackage.y06) r3
            int r4 = r3.h0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.h0 = r4
            goto L1e
        L19:
            y06 r3 = new y06
            r3.<init>(r0, r2)
        L1e:
            java.lang.Object r2 = r3.f0
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r3.h0
            r6 = 9
            r7 = 0
            r8 = 1
            r9 = 4
            r10 = 3
            me.magnum.melonds.database.MelonDatabase r14 = r0.b
            r0 = 0
            switch(r5) {
                case 0: goto Lcf;
                case 1: goto Lbd;
                case 2: goto Lb0;
                case 3: goto La3;
                case 4: goto L96;
                case 5: goto L89;
                case 6: goto L7a;
                case 7: goto L6b;
                case 8: goto L5c;
                case 9: goto L4f;
                case 10: goto L44;
                case 11: goto L3b;
                case 12: goto L36;
                default: goto L30;
            }
        L30:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r1)
            return r0
        L36:
            defpackage.oi2.Y(r2)
            goto L30a
        L3b:
            boolean r1 = r3.e0
            java.lang.String r5 = r3.Y
            defpackage.oi2.Y(r2)
            goto L2d5
        L44:
            boolean r1 = r3.e0
            java.lang.String r5 = r3.Y
            lx5 r11 = r3.R
            defpackage.oi2.Y(r2)
            goto L2ab
        L4f:
            boolean r1 = r3.e0
            java.lang.String r5 = r3.Y
            java.lang.String r11 = r3.X
            lx5 r12 = r3.R
            defpackage.oi2.Y(r2)
            goto L283
        L5c:
            boolean r1 = r3.e0
            java.lang.String r5 = r3.Z
            java.lang.String r11 = r3.Y
            java.lang.String r12 = r3.X
            lx5 r13 = r3.R
            defpackage.oi2.Y(r2)
            goto L25a
        L6b:
            lp2 r1 = r3.d0
            java.lang.String r5 = r3.Z
            java.lang.String r11 = r3.Y
            java.lang.String r12 = r3.X
            lx5 r13 = r3.R
            defpackage.oi2.Y(r2)
            goto L22a
        L7a:
            lp2 r1 = r3.d0
            java.lang.String r5 = r3.Z
            java.lang.String r11 = r3.Y
            java.lang.String r12 = r3.X
            lx5 r13 = r3.R
            defpackage.oi2.Y(r2)
            goto L1ee
        L89:
            java.lang.String r1 = r3.Z
            java.lang.String r5 = r3.Y
            java.lang.String r11 = r3.X
            lx5 r12 = r3.R
            defpackage.oi2.Y(r2)
            goto L1ac
        L96:
            java.lang.String r1 = r3.Z
            java.lang.String r5 = r3.Y
            java.lang.String r11 = r3.X
            lx5 r12 = r3.R
            defpackage.oi2.Y(r2)
            goto L17e
        La3:
            java.lang.String r1 = r3.Z
            java.lang.String r5 = r3.Y
            java.lang.String r11 = r3.X
            lx5 r12 = r3.R
            defpackage.oi2.Y(r2)
            goto L15a
        Lb0:
            java.lang.String r1 = r3.Z
            java.lang.String r5 = r3.Y
            java.lang.String r11 = r3.X
            lx5 r12 = r3.R
            defpackage.oi2.Y(r2)
            goto L132
        Lbd:
            java.lang.String r1 = r3.Z
            java.lang.String r5 = r3.Y
            java.lang.String r11 = r3.X
            lx5 r12 = r3.R
            defpackage.oi2.Y(r2)
            r17 = r11
            r11 = r1
            r1 = r12
            r12 = r17
            goto L10b
        Lcf:
            defpackage.oi2.Y(r2)
            java.lang.String r2 = r1.a()
            java.lang.String r5 = r1.a
            java.lang.String r5 = defpackage.qs6.S0(r9, r5)
            java.util.Locale r11 = java.util.Locale.ROOT
            java.lang.String r5 = r5.toUpperCase(r11)
            r5.getClass()
            java.lang.String r11 = r1.b()
            ip2 r12 = r14.v()
            r3.R = r1
            r3.X = r2
            r3.Y = r5
            r3.Z = r11
            r3.h0 = r8
            m16 r12 = r12.a
            sm0 r13 = new sm0
            r13.<init>(r2, r8, r11)
            java.lang.Object r12 = defpackage.hv.S(r3, r12, r8, r7, r13)
            if (r12 != r4) goto L106
            goto L309
        L106:
            r17 = r12
            r12 = r2
            r2 = r17
        L10b:
            lp2 r2 = (defpackage.lp2) r2
            if (r2 != 0) goto L1ba
            boolean r2 = defpackage.qs6.v0(r11)
            if (r2 != 0) goto L13b
            ip2 r2 = r14.v()
            r3.R = r1
            r3.X = r12
            r3.Y = r5
            r3.Z = r11
            r13 = 2
            r3.h0 = r13
            java.lang.Object r2 = r2.b(r11, r3)
            if (r2 != r4) goto L12c
            goto L309
        L12c:
            r17 = r12
            r12 = r1
            r1 = r11
            r11 = r17
        L132:
            lp2 r2 = (defpackage.lp2) r2
            r17 = r11
            r11 = r1
            r1 = r12
            r12 = r17
            goto L13c
        L13b:
            r2 = r0
        L13c:
            if (r2 != 0) goto L1ba
            ip2 r2 = r14.v()
            r3.R = r1
            r3.X = r12
            r3.Y = r5
            r3.Z = r11
            r3.h0 = r10
            java.lang.Object r2 = r2.c(r12, r3)
            if (r2 != r4) goto L154
            goto L309
        L154:
            r17 = r12
            r12 = r1
            r1 = r11
            r11 = r17
        L15a:
            lp2 r2 = (defpackage.lp2) r2
            if (r2 != 0) goto L1ae
            boolean r2 = r12.e
            if (r2 != 0) goto L181
            int r2 = r5.length()
            if (r2 != r9) goto L181
            ip2 r2 = r14.v()
            r3.R = r12
            r3.X = r11
            r3.Y = r5
            r3.Z = r1
            r3.h0 = r9
            java.lang.Object r2 = r2.c(r5, r3)
            if (r2 != r4) goto L17e
            goto L309
        L17e:
            lp2 r2 = (defpackage.lp2) r2
            goto L182
        L181:
            r2 = r0
        L182:
            if (r2 != 0) goto L1ae
            int r2 = r5.length()
            if (r2 < r10) goto L1b4
            ip2 r2 = r14.v()
            java.lang.String r13 = defpackage.qs6.S0(r10, r5)
            r3.R = r12
            r3.X = r11
            r3.Y = r5
            r3.Z = r1
            r15 = 5
            r3.h0 = r15
            m16 r2 = r2.a
            c70 r15 = new c70
            r15.<init>(r13, r6)
            java.lang.Object r2 = defpackage.hv.S(r3, r2, r8, r7, r15)
            if (r2 != r4) goto L1ac
            goto L309
        L1ac:
            lp2 r2 = (defpackage.lp2) r2
        L1ae:
            r13 = r12
            r12 = r11
            r11 = r5
            r5 = r1
        L1b2:
            r1 = r2
            goto L1bf
        L1b4:
            r13 = r12
            r12 = r11
            r11 = r5
            r5 = r1
            r1 = r0
            goto L1bf
        L1ba:
            r13 = r11
            r11 = r5
            r5 = r13
            r13 = r1
            goto L1b2
        L1bf:
            if (r1 == 0) goto L1f6
            bn0 r2 = r14.u()
            java.lang.Long r15 = r1.a
            if (r15 == 0) goto L1cf
            long r15 = r15.longValue()
        L1cd:
            r9 = r15
            goto L1d2
        L1cf:
            r15 = -1
            goto L1cd
        L1d2:
            r3.R = r13
            r3.X = r12
            r3.Y = r11
            r3.Z = r5
            r3.d0 = r1
            r15 = 6
            r3.h0 = r15
            m16 r2 = r2.a
            t4 r6 = new t4
            r6.<init>(r15, r9)
            java.lang.Object r2 = defpackage.hv.S(r3, r2, r8, r7, r6)
            if (r2 != r4) goto L1ee
            goto L309
        L1ee:
            java.util.List r2 = (java.util.List) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L30f
        L1f6:
            r2 = r13
            r13 = r5
            r5 = r2
            r2 = r11
            java.lang.String r6 = r5.c
            boolean r9 = defpackage.qs6.v0(r6)
            if (r9 == 0) goto L204
            java.lang.String r6 = r5.d
        L204:
            r15 = r6
            r3.R = r5
            r3.X = r12
            r3.Y = r2
            r3.Z = r13
            r3.d0 = r1
            r6 = 7
            r3.h0 = r6
            xe1 r6 = defpackage.xk1.a
            de1 r6 = defpackage.de1.L
            ja1 r11 = new ja1
            r16 = 0
            r11.<init>(r12, r13, r14, r15, r16)
            java.lang.Object r6 = defpackage.hv.d0(r6, r11, r3)
            if (r6 != r4) goto L225
            goto L309
        L225:
            r11 = r13
            r13 = r5
            r5 = r11
            r11 = r2
            r2 = r6
        L22a:
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L30f
            ip2 r1 = r14.v()
            r3.R = r13
            r3.X = r12
            r3.Y = r11
            r3.Z = r5
            r3.d0 = r0
            r3.e0 = r2
            r6 = 8
            r3.h0 = r6
            m16 r1 = r1.a
            sm0 r6 = new sm0
            r6.<init>(r12, r8, r5)
            java.lang.Object r1 = defpackage.hv.S(r3, r1, r8, r7, r6)
            if (r1 != r4) goto L255
            goto L309
        L255:
            r17 = r2
            r2 = r1
            r1 = r17
        L25a:
            lp2 r2 = (defpackage.lp2) r2
            if (r2 != 0) goto L30c
            boolean r2 = defpackage.qs6.v0(r5)
            if (r2 != 0) goto L28b
            ip2 r2 = r14.v()
            r3.R = r13
            r3.X = r12
            r3.Y = r11
            r3.Z = r0
            r3.d0 = r0
            r3.e0 = r1
            r6 = 9
            r3.h0 = r6
            java.lang.Object r2 = r2.b(r5, r3)
            if (r2 != r4) goto L280
            goto L309
        L280:
            r5 = r11
            r11 = r12
            r12 = r13
        L283:
            lp2 r2 = (defpackage.lp2) r2
            r17 = r12
            r12 = r11
            r11 = r17
            goto L28e
        L28b:
            r2 = r0
            r5 = r11
            r11 = r13
        L28e:
            if (r2 != 0) goto L30c
            ip2 r2 = r14.v()
            r3.R = r11
            r3.X = r0
            r3.Y = r5
            r3.Z = r0
            r3.d0 = r0
            r3.e0 = r1
            r6 = 10
            r3.h0 = r6
            java.lang.Object r2 = r2.c(r12, r3)
            if (r2 != r4) goto L2ab
            goto L309
        L2ab:
            lp2 r2 = (defpackage.lp2) r2
            if (r2 != 0) goto L30c
            boolean r2 = r11.e
            if (r2 != 0) goto L2d8
            int r2 = r5.length()
            r6 = 4
            if (r2 != r6) goto L2d8
            ip2 r2 = r14.v()
            r3.R = r0
            r3.X = r0
            r3.Y = r5
            r3.Z = r0
            r3.d0 = r0
            r3.e0 = r1
            r6 = 11
            r3.h0 = r6
            java.lang.Object r2 = r2.c(r5, r3)
            if (r2 != r4) goto L2d5
            goto L309
        L2d5:
            lp2 r2 = (defpackage.lp2) r2
            goto L2d9
        L2d8:
            r2 = r0
        L2d9:
            if (r2 != 0) goto L30c
            int r2 = r5.length()
            r6 = 3
            if (r2 < r6) goto L30e
            ip2 r2 = r14.v()
            java.lang.String r5 = defpackage.qs6.S0(r6, r5)
            r3.R = r0
            r3.X = r0
            r3.Y = r0
            r3.Z = r0
            r3.d0 = r0
            r3.e0 = r1
            r1 = 12
            r3.h0 = r1
            m16 r1 = r2.a
            c70 r2 = new c70
            r6 = 9
            r2.<init>(r5, r6)
            java.lang.Object r2 = defpackage.hv.S(r3, r1, r8, r7, r2)
            if (r2 != r4) goto L30a
        L309:
            return r4
        L30a:
            lp2 r2 = (defpackage.lp2) r2
        L30c:
            r1 = r2
            goto L30f
        L30e:
            r1 = r0
        L30f:
            if (r1 == 0) goto L321
            cp2 r2 = new cp2
            java.lang.Long r3 = r1.a
            java.lang.String r4 = r1.b
            java.lang.String r5 = r1.c
            java.lang.String r6 = r1.d
            yt1 r7 = defpackage.yt1.A
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L321:
            return r0
    }

    public final defpackage.le2 i(defpackage.cp2 r6) {
            r5 = this;
            r6.getClass()
            java.lang.Long r6 = r6.a
            if (r6 == 0) goto L2c
            long r0 = r6.longValue()
            me.magnum.melonds.database.MelonDatabase r5 = r5.b
            ip2 r5 = r5.v()
            m16 r6 = r5.a
            java.lang.String r2 = "cheat"
            java.lang.String r3 = "cheat_folder"
            java.lang.String[] r2 = new java.lang.String[]{r2, r3}
            hp2 r3 = new hp2
            r4 = 0
            r3.<init>(r5, r0, r4)
            r5 = 1
            ng2 r5 = defpackage.yv7.a(r6, r5, r2, r3)
            a16 r6 = new a16
            r6.<init>(r5, r4)
            return r6
        L2c:
            wt1 r5 = defpackage.wt1.A
            return r5
    }

    public final java.io.Serializable j(defpackage.s41 r8) {
            r7 = this;
            boolean r0 = r8 instanceof defpackage.d16
            if (r0 == 0) goto L13
            r0 = r8
            d16 r0 = (defpackage.d16) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            d16 r0 = new d16
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L2e
            if (r2 != r3) goto L27
            defpackage.oi2.Y(r8)
            goto L4a
        L27:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            r7 = 0
            return r7
        L2e:
            defpackage.oi2.Y(r8)
            me.magnum.melonds.database.MelonDatabase r7 = r7.b
            ip2 r7 = r7.v()
            r0.Y = r3
            m16 r7 = r7.a
            bz1 r8 = new bz1
            r2 = 8
            r8.<init>(r2)
            r2 = 0
            java.lang.Object r8 = defpackage.hv.S(r0, r7, r3, r2, r8)
            if (r8 != r1) goto L4a
            return r1
        L4a:
            java.lang.Iterable r8 = (java.lang.Iterable) r8
            java.util.ArrayList r7 = new java.util.ArrayList
            r0 = 10
            int r0 = defpackage.ht0.v0(r8, r0)
            r7.<init>(r0)
            java.util.Iterator r8 = r8.iterator()
        L5b:
            boolean r0 = r8.hasNext()
            if (r0 == 0) goto L7a
            java.lang.Object r0 = r8.next()
            lp2 r0 = (defpackage.lp2) r0
            cp2 r1 = new cp2
            java.lang.Long r2 = r0.a
            java.lang.String r3 = r0.b
            java.lang.String r4 = r0.c
            java.lang.String r5 = r0.d
            yt1 r6 = defpackage.yt1.A
            r1.<init>(r2, r3, r4, r5, r6)
            r7.add(r1)
            goto L5b
        L7a:
            return r7
    }

    public final java.io.Serializable k(defpackage.lx5 r10, defpackage.s41 r11) {
            r9 = this;
            boolean r0 = r11 instanceof defpackage.e16
            if (r0 == 0) goto L13
            r0 = r11
            e16 r0 = (defpackage.e16) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            e16 r0 = new e16
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r11 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 0
            me.magnum.melonds.database.MelonDatabase r9 = r9.b
            r4 = 2
            r5 = 1
            r6 = 0
            if (r2 == 0) goto L3a
            if (r2 == r5) goto L34
            if (r2 != r4) goto L2e
            defpackage.oi2.Y(r11)
            goto L80
        L2e:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r9)
            return r6
        L34:
            lx5 r10 = r0.R
            defpackage.oi2.Y(r11)
            goto L5b
        L3a:
            defpackage.oi2.Y(r11)
            java.lang.String r11 = r10.a()
            vm0 r2 = r9.s()
            java.lang.String r7 = r10.b()
            r0.R = r10
            r0.Z = r5
            m16 r2 = r2.a
            sm0 r8 = new sm0
            r8.<init>(r11, r3, r7)
            java.lang.Object r11 = defpackage.hv.S(r0, r2, r5, r3, r8)
            if (r11 != r1) goto L5b
            goto L7f
        L5b:
            java.util.List r11 = (java.util.List) r11
            boolean r2 = r11.isEmpty()
            if (r2 != 0) goto L64
            goto L82
        L64:
            vm0 r9 = r9.s()
            java.lang.String r11 = r10.a
            java.lang.String r10 = r10.b()
            r0.R = r6
            r0.Z = r4
            m16 r9 = r9.a
            sm0 r2 = new sm0
            r2.<init>(r11, r3, r10)
            java.lang.Object r11 = defpackage.hv.S(r0, r9, r5, r3, r2)
            if (r11 != r1) goto L80
        L7f:
            return r1
        L80:
            java.util.List r11 = (java.util.List) r11
        L82:
            java.util.ArrayList r9 = new java.util.ArrayList
            r10 = 10
            int r10 = defpackage.ht0.v0(r11, r10)
            r9.<init>(r10)
            java.util.Iterator r10 = r11.iterator()
        L91:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto Lb2
            java.lang.Object r11 = r10.next()
            zm0 r11 = (defpackage.zm0) r11
            me.magnum.melonds.domain.model.Cheat r0 = new me.magnum.melonds.domain.model.Cheat
            java.lang.Long r1 = r11.a
            long r2 = r11.c
            java.lang.String r4 = r11.d
            java.lang.String r5 = r11.e
            java.lang.String r6 = r11.f
            boolean r7 = r11.g
            r0.<init>(r1, r2, r4, r5, r6, r7)
            r9.add(r0)
            goto L91
        Lb2:
            return r9
    }

    public final void l(android.net.Uri r4) {
            r3 = this;
            r4.getClass()
            bk1 r0 = new bk1
            java.lang.Class<me.magnum.melonds.common.workers.CheatImportWorker> r1 = me.magnum.melonds.common.workers.CheatImportWorker.class
            r0.<init>(r1)
            java.lang.String r4 = r4.toString()
            vr4 r1 = new vr4
            java.lang.String r2 = "uri"
            r1.<init>(r2, r4)
            vr4[] r4 = new defpackage.vr4[]{r1}
            wb1 r1 = new wb1
            r2 = 0
            r1.<init>(r2, r2)
            r4 = r4[r2]
            java.lang.Object r2 = r4.A
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r4 = r4.B
            r1.h(r4, r2)
            xb1 r4 = r1.e()
            java.lang.Object r1 = r0.B
            yw7 r1 = (defpackage.yw7) r1
            r1.e = r4
            gm4 r4 = r0.c()
            android.content.Context r3 = r3.a
            lw7 r3 = defpackage.lw7.b(r3)
            r3.getClass()
            java.lang.String r0 = "cheat_import_worker"
            y72 r1 = defpackage.y72.KEEP
            r3.a(r0, r1, r4)
            return
    }

    public final java.lang.Object m(me.magnum.melonds.domain.model.Cheat r23, defpackage.s41 r24) {
            r22 = this;
            r0 = r22
            r1 = r24
            boolean r2 = r1 instanceof defpackage.f16
            if (r2 == 0) goto L17
            r2 = r1
            f16 r2 = (defpackage.f16) r2
            int r3 = r2.Z
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.Z = r3
            goto L1c
        L17:
            f16 r2 = new f16
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.X
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r2.Z
            r5 = 0
            jg7 r6 = defpackage.jg7.a
            me.magnum.melonds.database.MelonDatabase r7 = r0.b
            r8 = 2
            r9 = 0
            r10 = 1
            if (r4 == 0) goto L42
            if (r4 == r10) goto L3c
            if (r4 != r8) goto L36
            defpackage.oi2.Y(r1)
            r21 = r6
            goto La7
        L36:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r9
        L3c:
            me.magnum.melonds.domain.model.Cheat r4 = r2.R
            defpackage.oi2.Y(r1)
            goto L69
        L42:
            defpackage.oi2.Y(r1)
            vm0 r1 = r7.s()
            java.lang.Long r4 = r23.getId()
            r4.getClass()
            long r11 = r4.longValue()
            r4 = r23
            r2.R = r4
            r2.Z = r10
            m16 r1 = r1.a
            t4 r13 = new t4
            r14 = 4
            r13.<init>(r14, r11)
            java.lang.Object r1 = defpackage.hv.S(r2, r1, r10, r5, r13)
            if (r1 != r3) goto L69
            goto La6
        L69:
            zm0 r1 = (defpackage.zm0) r1
            if (r1 != 0) goto L6e
            return r6
        L6e:
            zm0 r11 = new zm0
            java.lang.Long r12 = r4.getId()
            long r13 = r1.b
            r21 = r6
            long r5 = r1.c
            java.lang.String r17 = r4.getName()
            java.lang.String r18 = r4.getDescription()
            java.lang.String r19 = r4.getCode()
            boolean r20 = r4.getEnabled()
            r15 = r5
            r11.<init>(r12, r13, r15, r17, r18, r19, r20)
            vm0 r1 = r7.s()
            r2.R = r9
            r2.Z = r8
            m16 r4 = r1.a
            y r5 = new y
            r6 = 10
            r5.<init>(r6, r1, r11)
            r1 = 0
            java.lang.Object r1 = defpackage.hv.S(r2, r4, r1, r10, r5)
            if (r1 != r3) goto La7
        La6:
            return r3
        La7:
            jd6 r0 = r0.c
            r0.i()
            return r21
    }

    public final java.lang.Object n(java.util.List r9, defpackage.s41 r10) {
            r8 = this;
            boolean r0 = r10 instanceof defpackage.g16
            if (r0 == 0) goto L13
            r0 = r10
            g16 r0 = (defpackage.g16) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            g16 r0 = new g16
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            jg7 r3 = defpackage.jg7.a
            r4 = 1
            if (r2 == 0) goto L30
            if (r2 != r4) goto L29
            defpackage.oi2.Y(r10)
            goto L83
        L29:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r8)
            r8 = 0
            return r8
        L30:
            defpackage.oi2.Y(r10)
            java.util.ArrayList r10 = new java.util.ArrayList
            r2 = 10
            int r2 = defpackage.ht0.v0(r9, r2)
            r10.<init>(r2)
            java.util.Iterator r9 = r9.iterator()
        L42:
            boolean r2 = r9.hasNext()
            if (r2 == 0) goto L66
            java.lang.Object r2 = r9.next()
            me.magnum.melonds.domain.model.Cheat r2 = (me.magnum.melonds.domain.model.Cheat) r2
            io0 r5 = new io0
            java.lang.Long r6 = r2.getId()
            r6.getClass()
            long r6 = r6.longValue()
            boolean r2 = r2.getEnabled()
            r5.<init>(r6, r2)
            r10.add(r5)
            goto L42
        L66:
            me.magnum.melonds.database.MelonDatabase r9 = r8.b
            vm0 r9 = r9.s()
            r0.Y = r4
            m16 r2 = r9.a
            rm0 r5 = new rm0
            r5.<init>(r9, r10, r4)
            r9 = 0
            java.lang.Object r9 = defpackage.hv.S(r0, r2, r9, r4, r5)
            x61 r10 = defpackage.x61.COROUTINE_SUSPENDED
            if (r9 != r10) goto L7f
            goto L80
        L7f:
            r9 = r3
        L80:
            if (r9 != r1) goto L83
            return r1
        L83:
            jd6 r8 = r8.c
            r8.i()
            return r3
    }
}
