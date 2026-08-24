package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tk6  reason: default package */
/* loaded from: classes.dex */
public final class tk6 extends defpackage.hw6 implements defpackage.eo2 {
    public java.lang.String X;
    public defpackage.pj4 Y;
    public java.util.List Z;
    public defpackage.vj4 d0;
    public java.util.Map e0;
    public java.util.Map f0;
    public java.util.List g0;
    public java.util.Iterator h0;
    public defpackage.ek4 i0;
    public int j0;
    public int k0;
    public final /* synthetic */ defpackage.vk6 l0;
    public final /* synthetic */ java.util.Set m0;
    public final /* synthetic */ java.lang.String n0;
    public final /* synthetic */ java.lang.String o0;

    public tk6(defpackage.vk6 r1, java.util.Set r2, java.lang.String r3, java.lang.String r4, defpackage.r41 r5) {
            r0 = this;
            r0.l0 = r1
            r0.m0 = r2
            r0.n0 = r3
            r0.o0 = r4
            r1 = 2
            r0.<init>(r1, r5)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            w61 r1 = (defpackage.w61) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            tk6 r0 = (defpackage.tk6) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r7, java.lang.Object r8) {
            r6 = this;
            tk6 r0 = new tk6
            java.lang.String r3 = r6.n0
            java.lang.String r4 = r6.o0
            vk6 r1 = r6.l0
            java.util.Set r2 = r6.m0
            r5 = r7
            r0.<init>(r1, r2, r3, r4, r5)
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r42) {
            r41 = this;
            r6 = r41
            vk6 r0 = r6.l0
            oj4 r7 = r0.b
            x61 r13 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r6.k0
            java.lang.String r8 = "smart_sync_unlock_skipped"
            yt1 r3 = defpackage.yt1.A
            java.lang.String r4 = "pending"
            java.lang.String r5 = r6.o0
            java.lang.String r9 = "content_id"
            java.util.Set r10 = r6.m0
            r16 = 0
            java.lang.String r2 = "hardcore"
            java.lang.String r11 = "error"
            java.lang.String r12 = "achievement_id"
            java.lang.String r14 = r6.n0
            java.lang.String r15 = "smart_sync_failed"
            r23 = r11
            java.lang.String r11 = "reason"
            r25 = r8
            java.lang.String r8 = "filter"
            r26 = r2
            r2 = 1
            r27 = r12
            if (r1 == 0) goto Le8
            if (r1 == r2) goto Lde
            r12 = 2
            r28 = 0
            if (r1 == r12) goto Lcc
            r5 = 3
            if (r1 == r5) goto Lb3
            r4 = 4
            if (r1 == r4) goto L82
            r3 = 5
            if (r1 != r3) goto L7c
            int r1 = r6.j0
            ek4 r3 = r6.i0
            java.util.Iterator r4 = r6.h0
            java.util.List r5 = r6.g0
            java.util.Map r9 = r6.f0
            java.util.Map r10 = r6.e0
            java.util.List r12 = r6.Z
            java.lang.String r14 = r6.X
            defpackage.oi2.Y(r42)
            r2 = r42
            hm5 r2 = (defpackage.hm5) r2
            java.lang.Object r2 = r2.A
            r36 = r0
            r0 = r7
            r30 = r15
            r29 = r23
            r20 = r25
            r35 = r26
            r32 = r27
            r33 = r28
            r18 = 5
            r21 = 4
            r24 = 0
            r7 = r1
            r15 = r8
            r26 = r10
            r1 = r12
            r10 = r5
            r12 = r9
            r9 = r4
            r4 = r3
            r3 = r14
            r14 = r11
            goto L7a3
        L7c:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r28
        L82:
            int r1 = r6.j0
            ek4 r2 = r6.i0
            java.util.Iterator r3 = r6.h0
            java.util.List r4 = r6.g0
            java.util.Map r5 = r6.f0
            java.util.Map r9 = r6.e0
            java.util.List r10 = r6.Z
            java.lang.String r12 = r6.X
            defpackage.oi2.Y(r42)
            r14 = r42
            hm5 r14 = (defpackage.hm5) r14
            java.lang.Object r14 = r14.A
            r18 = r2
            r2 = r0
            r0 = r13
            r13 = r3
            r3 = r18
            r29 = r7
            r18 = r8
            r32 = r11
            r8 = r14
            r30 = r15
            r11 = r25
            r35 = r26
            r7 = 4
            r14 = 1
            goto L583
        Lb3:
            java.util.Map r1 = r6.e0
            vj4 r2 = r6.d0
            java.util.List r4 = r6.Z
            pj4 r5 = r6.Y
            java.lang.String r9 = r6.X
            defpackage.oi2.Y(r42)
            r10 = r42
            hm5 r10 = (defpackage.hm5) r10
            java.lang.Object r10 = r10.A
            r18 = r3
            r29 = r7
            goto L2e3
        Lcc:
            java.util.List r1 = r6.Z
            pj4 r2 = r6.Y
            java.lang.String r5 = r6.X
            defpackage.oi2.Y(r42)
            r9 = r5
            r29 = r7
            r30 = r15
            r5 = r42
            goto L24d
        Lde:
            r28 = 0
            java.lang.String r1 = r6.X
            defpackage.oi2.Y(r42)
            r2 = r42
            goto L14b
        Le8:
            r28 = 0
            defpackage.oi2.Y(r42)
            on2 r1 = r0.f
            java.lang.Object r1 = r1.c()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 != 0) goto L10d
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Built-in SmartSync is disabled for the effective RA backend"
            r0.<init>(r1)
            em5 r1 = new em5
            r1.<init>(r0)
            hm5 r0 = new hm5
            r0.<init>(r1)
            return r0
        L10d:
            if (r10 == 0) goto L129
            r29 = r10
            java.lang.Iterable r29 = (java.lang.Iterable) r29
            r76 r1 = new r76
            r2 = 10
            r1.<init>(r2)
            r34 = 30
            java.lang.String r30 = ","
            r31 = 0
            r32 = 0
            r33 = r1
            java.lang.String r1 = defpackage.gt0.P0(r29, r30, r31, r32, r33, r34)
            goto L12b
        L129:
            java.lang.String r1 = "ALL"
        L12b:
            vr4 r2 = new vr4
            r2.<init>(r8, r1)
            vr4 r12 = new vr4
            r12.<init>(r9, r14)
            vr4[] r2 = new defpackage.vr4[]{r2, r12}
            java.lang.String r12 = "smart_sync_started"
            r0.c(r12, r2)
            r6.X = r1
            r2 = 1
            r6.k0 = r2
            java.lang.Object r2 = r7.g(r5, r14, r6)
            if (r2 != r13) goto L14b
            goto L794
        L14b:
            pj4 r2 = (defpackage.pj4) r2
            ui4 r12 = r2.a
            r29 = r7
            ui4 r7 = defpackage.ui4.OK
            if (r12 == r7) goto L199
            vr4 r3 = new vr4
            r3.<init>(r8, r1)
            java.lang.String r1 = r12.name()
            java.util.Locale r4 = java.util.Locale.ROOT
            java.lang.String r1 = r1.toLowerCase(r4)
            r1.getClass()
            java.lang.String r4 = "ledger_integrity_"
            java.lang.String r1 = r4.concat(r1)
            vr4 r4 = new vr4
            r4.<init>(r11, r1)
            vr4[] r1 = new defpackage.vr4[]{r3, r4}
            r0.c(r15, r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            ui4 r1 = r2.a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Ledger integrity is "
            r2.<init>(r3)
            r2.append(r1)
            java.lang.String r1 = r2.toString()
            r0.<init>(r1)
            em5 r1 = new em5
            r1.<init>(r0)
            hm5 r0 = new hm5
            r0.<init>(r1)
            return r0
        L199:
            java.lang.Long r7 = r2.e
            if (r7 == 0) goto L1dd
            long r30 = r7.longValue()
            int r7 = (r30 > r16 ? 1 : (r30 == r16 ? 0 : -1))
            if (r7 > 0) goto L1dd
            vr4 r3 = new vr4
            r3.<init>(r8, r1)
            vr4 r1 = new vr4
            java.lang.String r5 = "ledger_expired"
            r1.<init>(r11, r5)
            vr4 r5 = new vr4
            r5.<init>(r9, r14)
            int r2 = r2.b()
            java.lang.Integer r6 = new java.lang.Integer
            r6.<init>(r2)
            vr4 r2 = new vr4
            r2.<init>(r4, r6)
            vr4[] r1 = new defpackage.vr4[]{r3, r1, r5, r2}
            r0.c(r15, r1)
            qi4 r0 = new qi4
            java.lang.String r1 = "Offline achievements ledger expired"
            r0.<init>(r1)
            em5 r1 = new em5
            r1.<init>(r0)
            hm5 r0 = new hm5
            r0.<init>(r1)
            return r0
        L1dd:
            java.util.List r7 = r2.b
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.Iterator r7 = r7.iterator()
        L1e8:
            boolean r12 = r7.hasNext()
            if (r12 == 0) goto L213
            java.lang.Object r12 = r7.next()
            r42 = r7
            r7 = r12
            ek4 r7 = (defpackage.ek4) r7
            r30 = r15
            if (r10 == 0) goto L202
            gk4 r15 = r7.k
            boolean r15 = r10.contains(r15)
            goto L203
        L202:
            r15 = 1
        L203:
            if (r15 == 0) goto L20e
            gk4 r7 = r7.k
            gk4 r15 = defpackage.gk4.SOFTCORE
            if (r7 != r15) goto L20e
            r9.add(r12)
        L20e:
            r7 = r42
            r15 = r30
            goto L1e8
        L213:
            r30 = r15
            boolean r7 = r9.isEmpty()
            if (r7 == 0) goto L235
            vr4 r2 = new vr4
            r2.<init>(r8, r1)
            vr4[] r1 = new defpackage.vr4[]{r2}
            java.lang.String r2 = "smart_sync_no_pending"
            r0.c(r2, r1)
            xk6 r0 = new xk6
            r1 = 0
            r0.<init>(r1, r3, r1)
            hm5 r1 = new hm5
            r1.<init>(r0)
            return r1
        L235:
            ck4 r7 = r0.c
            r6.X = r1
            r6.Y = r2
            r6.Z = r9
            r12 = 2
            r6.k0 = r12
            java.lang.Object r5 = r7.b(r5, r14, r6)
            if (r5 != r13) goto L248
            goto L794
        L248:
            r37 = r9
            r9 = r1
            r1 = r37
        L24d:
            vj4 r5 = (defpackage.vj4) r5
            if (r5 != 0) goto L286
            vr4 r2 = new vr4
            r2.<init>(r8, r9)
            vr4 r3 = new vr4
            java.lang.String r5 = "prefetch_cache_missing"
            r3.<init>(r11, r5)
            int r1 = r1.size()
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r1)
            vr4 r1 = new vr4
            r1.<init>(r4, r5)
            vr4[] r1 = new defpackage.vr4[]{r2, r3, r1}
            r15 = r30
            r0.c(r15, r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Prefetch cache missing"
            r0.<init>(r1)
            em5 r1 = new em5
            r1.<init>(r0)
            hm5 r0 = new hm5
            r0.<init>(r1)
            return r0
        L286:
            r15 = r30
            java.util.List r4 = r5.c
            r7 = 10
            int r7 = defpackage.ht0.v0(r4, r7)
            int r7 = defpackage.c14.k0(r7)
            r10 = 16
            if (r7 >= r10) goto L299
            r7 = r10
        L299:
            java.util.LinkedHashMap r10 = new java.util.LinkedHashMap
            r10.<init>(r7)
            java.util.Iterator r4 = r4.iterator()
        L2a2:
            boolean r7 = r4.hasNext()
            if (r7 == 0) goto L2c4
            java.lang.Object r7 = r4.next()
            sj4 r7 = (defpackage.sj4) r7
            r12 = r3
            r42 = r4
            long r3 = r7.a
            r18 = r12
            java.lang.Long r12 = new java.lang.Long
            r12.<init>(r3)
            java.lang.String r3 = r7.b
            r10.put(r12, r3)
            r4 = r42
            r3 = r18
            goto L2a2
        L2c4:
            r18 = r3
            s35 r3 = r0.a
            r6.X = r9
            r6.Y = r2
            r6.Z = r1
            r6.d0 = r5
            r6.e0 = r10
            r4 = 3
            r6.k0 = r4
            java.lang.Object r3 = r3.v(r14, r6)
            if (r3 != r13) goto L2dd
            goto L794
        L2dd:
            r4 = r5
            r5 = r2
            r2 = r4
            r4 = r1
            r1 = r10
            r10 = r3
        L2e3:
            java.lang.Throwable r3 = defpackage.hm5.a(r10)
            if (r3 != 0) goto L855
            da5 r10 = (defpackage.da5) r10
            r42 = r4
            long r3 = r10.a
            r7 = r1
            long r1 = r2.b
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 == 0) goto L335
            vr4 r3 = new vr4
            r3.<init>(r8, r9)
            vr4 r4 = new vr4
            java.lang.String r5 = "game_id_mismatch"
            r4.<init>(r11, r5)
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r1)
            vr4 r1 = new vr4
            java.lang.String r2 = "expected"
            r1.<init>(r2, r5)
            long r5 = r10.a
            java.lang.Long r2 = new java.lang.Long
            r2.<init>(r5)
            vr4 r5 = new vr4
            java.lang.String r6 = "actual"
            r5.<init>(r6, r2)
            vr4[] r1 = new defpackage.vr4[]{r3, r4, r1, r5}
            r0.c(r15, r1)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Game ID mismatch"
            r0.<init>(r1)
            em5 r1 = new em5
            r1.<init>(r0)
            hm5 r0 = new hm5
            r0.<init>(r1)
            return r0
        L335:
            java.util.List r1 = r10.e
            ev r2 = new ev
            r3 = 1
            r2.<init>(r1, r3)
            r76 r1 = new r76
            r3 = 11
            r1.<init>(r3)
            qd2 r3 = new qd2
            tb6 r4 = defpackage.tb6.d0
            r3.<init>(r2, r1)
            java.util.LinkedHashMap r1 = new java.util.LinkedHashMap
            r1.<init>()
            oc2 r2 = new oc2
            r2.<init>(r3)
        L355:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L36f
            java.lang.Object r3 = r2.next()
            r4 = r3
            o75 r4 = (defpackage.o75) r4
            r12 = r9
            long r9 = r4.a
            java.lang.Long r4 = new java.lang.Long
            r4.<init>(r9)
            r1.put(r4, r3)
            r9 = r12
            goto L355
        L36f:
            r12 = r9
            java.util.Map r2 = r5.c
            r42.getClass()
            r2.getClass()
            boolean r3 = r42.isEmpty()
            if (r3 == 0) goto L382
            r3 = r18
            goto L423
        L382:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap
            r3.<init>()
            java.util.Iterator r4 = r42.iterator()
        L38b:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L3b6
            java.lang.Object r5 = r4.next()
            r9 = r5
            ek4 r9 = (defpackage.ek4) r9
            java.lang.String r9 = r9.g
            boolean r10 = defpackage.qs6.v0(r9)
            if (r10 == 0) goto L3a2
            java.lang.String r9 = "__unknown__"
        L3a2:
            java.lang.Object r10 = r3.get(r9)
            if (r10 != 0) goto L3b0
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            r3.put(r9, r10)
        L3b0:
            java.util.List r10 = (java.util.List) r10
            r10.add(r5)
            goto L38b
        L3b6:
            java.util.Set r4 = r3.keySet()
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            ko5 r5 = new ko5
            r9 = 1
            r5.<init>(r9, r2)
            lv r10 = new lv
            r10.<init>(r5, r2)
            ix1 r2 = new ix1
            r5 = 5
            r2.<init>(r10, r5)
            java.util.List r2 = defpackage.gt0.d1(r4, r2)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r2.iterator()
        L3da:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L422
            java.lang.Object r5 = r2.next()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r5 = r3.get(r5)
            java.util.List r5 = (java.util.List) r5
            if (r5 != 0) goto L3f0
            r5 = r18
        L3f0:
            tp5 r10 = new tp5
            r14 = 9
            r10.<init>(r14)
            ix1 r14 = new ix1
            r9 = 6
            r14.<init>(r10, r9)
            ix1 r9 = new ix1
            r10 = 7
            r9.<init>(r14, r10)
            java.util.List r5 = defpackage.gt0.d1(r5, r9)
            java.util.Iterator r5 = r5.iterator()
        L40b:
            boolean r9 = r5.hasNext()
            if (r9 == 0) goto L420
            java.lang.Object r9 = r5.next()
            ek4 r9 = (defpackage.ek4) r9
            wk6 r10 = new wk6
            r10.<init>(r9)
            r4.add(r10)
            goto L40b
        L420:
            r9 = 1
            goto L3da
        L422:
            r3 = r4
        L423:
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            java.util.Iterator r3 = r3.iterator()
            r10 = r2
            r9 = r3
            r14 = r7
            r2 = r12
            r7 = 0
            r12 = r1
            r1 = r42
        L434:
            boolean r3 = r9.hasNext()
            if (r3 == 0) goto L807
            java.lang.Object r3 = r9.next()
            wk6 r3 = (defpackage.wk6) r3
            ek4 r3 = r3.a
            long r4 = r3.e
            r30 = r15
            gk4 r15 = r3.k
            r18 = r8
            java.lang.Long r8 = new java.lang.Long
            r8.<init>(r4)
            java.lang.Object r8 = r14.get(r8)
            java.lang.String r8 = (java.lang.String) r8
            r21 = r13
            java.lang.Long r13 = new java.lang.Long
            r13.<init>(r4)
            java.lang.Object r13 = r12.get(r13)
            o75 r13 = (defpackage.o75) r13
            r22 = r7
            if (r13 == 0) goto L469
            java.lang.String r7 = r13.l
            goto L46b
        L469:
            r7 = r28
        L46b:
            if (r8 != 0) goto L470
            yk6 r7 = defpackage.yk6.NOT_IN_PREFETCH_CACHE
            goto L489
        L470:
            if (r7 != 0) goto L475
            yk6 r7 = defpackage.yk6.MISSING_FROM_CURRENT_SET
            goto L489
        L475:
            boolean r7 = r7.equals(r8)
            if (r7 != 0) goto L47e
            yk6 r7 = defpackage.yk6.DEFINITION_CHANGED
            goto L489
        L47e:
            n75 r7 = r13.m
            n75 r8 = defpackage.n75.UNOFFICIAL
            if (r7 != r8) goto L487
            yk6 r7 = defpackage.yk6.SERVER_REJECTED
            goto L489
        L487:
            r7 = r28
        L489:
            if (r7 == 0) goto L4f2
            yk6 r8 = defpackage.yk6.SERVER_REJECTED
            if (r7 != r8) goto L492
            java.lang.String r8 = "unofficial achievement in current RA set"
            goto L494
        L492:
            r8 = r28
        L494:
            java.lang.Long r13 = new java.lang.Long
            r13.<init>(r4)
            r42 = r9
            vr4 r9 = new vr4
            r31 = r12
            r12 = r27
            r9.<init>(r12, r13)
            java.lang.String r13 = r7.name()
            vr4 r12 = new vr4
            r12.<init>(r11, r13)
            vr4 r13 = new vr4
            r32 = r11
            java.lang.String r11 = "detail"
            r13.<init>(r11, r8)
            gk4 r11 = defpackage.gk4.HARDCORE
            if (r15 != r11) goto L4bc
            r11 = 1
            goto L4bd
        L4bc:
            r11 = 0
        L4bd:
            java.lang.Boolean r11 = java.lang.Boolean.valueOf(r11)
            vr4 r15 = new vr4
            r33 = r14
            r14 = r26
            r15.<init>(r14, r11)
            vr4[] r9 = new defpackage.vr4[]{r9, r12, r13, r15}
            r11 = r25
            r0.c(r11, r9)
            zk6 r9 = new zk6
            r9.<init>(r4, r7, r8)
            r10.add(r9)
            r4 = r10
            r10 = r1
            r1 = r4
            r12 = r2
            r13 = r14
            r7 = r18
            r8 = r27
            r15 = r30
            r4 = r31
            r9 = r33
            r2 = r0
            r14 = r3
            r3 = r22
            r0 = r42
            goto L718
        L4f2:
            r42 = r9
            r32 = r11
            r31 = r12
            r33 = r14
            r11 = r25
            r14 = r26
            long r4 = r3.e
            gk4 r7 = defpackage.gk4.HARDCORE
            if (r15 != r7) goto L506
            r7 = 1
            goto L507
        L506:
            r7 = 0
        L507:
            long r8 = r3.h
            int r12 = (r8 > r16 ? 1 : (r8 == r16 ? 0 : -1))
            if (r12 > 0) goto L510
        L50d:
            r8 = r28
            goto L536
        L510:
            on2 r12 = r0.d
            java.lang.Object r12 = r12.c()
            java.lang.Number r12 = (java.lang.Number) r12
            long r12 = r12.longValue()
            long r12 = r12 - r8
            r8 = 1000(0x3e8, double:4.94E-321)
            long r12 = r12 / r8
            int r8 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r8 >= 0) goto L526
            r12 = r16
        L526:
            r8 = 1209600(0x127500, double:5.97622E-318)
            int r15 = (r12 > r8 ? 1 : (r12 == r8 ? 0 : -1))
            if (r15 <= 0) goto L52e
            r12 = r8
        L52e:
            java.lang.Long r8 = java.lang.Long.valueOf(r12)
            int r9 = (r12 > r16 ? 1 : (r12 == r16 ? 0 : -1))
            if (r9 <= 0) goto L50d
        L536:
            r6.X = r2
            r9 = r28
            r6.Y = r9
            r6.Z = r1
            r6.d0 = r9
            r9 = r33
            r6.e0 = r9
            r12 = r31
            r6.f0 = r12
            r6.g0 = r10
            r13 = r42
            r6.h0 = r13
            r6.i0 = r3
            r15 = r22
            r6.j0 = r15
            r42 = r7
            r7 = 4
            r6.k0 = r7
            r20 = r1
            r37 = r4
            r5 = r2
            r1 = r37
            java.lang.String r4 = r6.n0
            r22 = r8
            r8 = r5
            r5 = r22
            r22 = r3
            r35 = r14
            r14 = 1
            r3 = r42
            java.lang.Object r1 = defpackage.vk6.a(r0, r1, r3, r4, r5, r6)
            r2 = r0
            r0 = r21
            if (r1 != r0) goto L57a
            r13 = r0
            goto L794
        L57a:
            r4 = r10
            r5 = r12
            r10 = r20
            r3 = r22
            r12 = r8
            r8 = r1
            r1 = r15
        L583:
            boolean r15 = r8 instanceof defpackage.em5
            if (r15 == 0) goto L6c7
            java.lang.Throwable r8 = defpackage.hm5.a(r8)
            boolean r15 = defpackage.nj2.y(r8)
            java.lang.String r20 = "unknown"
            if (r15 == 0) goto L668
            boolean r15 = r8 instanceof defpackage.kh7
            if (r15 != 0) goto L59d
        L597:
            r21 = r0
            r42 = r8
        L59b:
            r15 = 0
            goto L5fc
        L59d:
            r15 = r8
            kh7 r15 = (defpackage.kh7) r15
            java.lang.String r15 = r15.getMessage()
            if (r15 != 0) goto L5a7
            goto L597
        L5a7:
            java.lang.String r21 = "\"Error\"\\s*:\\s*\"([^\"]+)\""
            java.util.regex.Pattern r7 = java.util.regex.Pattern.compile(r21)
            r7.getClass()
            java.util.regex.Matcher r7 = r7.matcher(r15)
            r7.getClass()
            r14 = 0
            n14 r7 = defpackage.kn2.k(r7, r14, r15)
            if (r7 == 0) goto L5eb
            java.util.List r7 = r7.a()
            r14 = 1
            java.lang.Object r7 = defpackage.gt0.K0(r14, r7)
            java.lang.String r7 = (java.lang.String) r7
            if (r7 == 0) goto L5eb
            r14 = 95
            r21 = r0
            r0 = 32
            java.lang.String r0 = r7.replace(r14, r0)
            r0.getClass()
            java.lang.CharSequence r0 = defpackage.qs6.T0(r0)
            java.lang.String r0 = r0.toString()
            if (r0 == 0) goto L5e9
            boolean r7 = defpackage.qs6.v0(r0)
            if (r7 != 0) goto L5e9
            goto L5ee
        L5e9:
            r0 = 0
            goto L5ee
        L5eb:
            r21 = r0
            goto L5e9
        L5ee:
            if (r0 != 0) goto L5f9
            boolean r0 = defpackage.nj2.y(r8)
            r42 = r8
            if (r0 == 0) goto L59b
            goto L5fc
        L5f9:
            r15 = r0
            r42 = r8
        L5fc:
            long r7 = r3.e
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r7)
            vr4 r7 = new vr4
            r8 = r27
            r7.<init>(r8, r0)
            vr4 r0 = new vr4
            java.lang.String r14 = "SERVER_REJECTED"
            r25 = r5
            r5 = r32
            r0.<init>(r5, r14)
            gk4 r14 = r3.k
            r26 = r9
            gk4 r9 = defpackage.gk4.HARDCORE
            if (r14 != r9) goto L61f
            r9 = 1
            goto L620
        L61f:
            r9 = 0
        L620:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r9)
            vr4 r14 = new vr4
            r27 = r13
            r13 = r35
            r14.<init>(r13, r9)
            if (r42 == 0) goto L637
            java.lang.Class r9 = r42.getClass()
            java.lang.String r20 = r9.getSimpleName()
        L637:
            r31 = r10
            r9 = r20
            vr4 r10 = new vr4
            r6 = r23
            r10.<init>(r6, r9)
            vr4[] r0 = new defpackage.vr4[]{r7, r0, r14, r10}
            r2.c(r11, r0)
            zk6 r0 = new zk6
            long r9 = r3.e
            yk6 r7 = defpackage.yk6.SERVER_REJECTED
            r0.<init>(r9, r7, r15)
            r4.add(r0)
            r14 = r3
            r32 = r5
            r7 = r18
            r9 = r26
            r0 = r27
            r15 = r30
            r10 = r31
            r3 = r1
            r1 = r4
            r4 = r25
            goto L718
        L668:
            r42 = r8
            r6 = r23
            r8 = r27
            r5 = r32
            vr4 r0 = new vr4
            r7 = r18
            r0.<init>(r7, r12)
            vr4 r4 = new vr4
            java.lang.String r7 = "award_failed"
            r4.<init>(r5, r7)
            long r9 = r3.e
            java.lang.Long r3 = new java.lang.Long
            r3.<init>(r9)
            vr4 r5 = new vr4
            r5.<init>(r8, r3)
            if (r42 == 0) goto L694
            java.lang.Class r3 = r42.getClass()
            java.lang.String r20 = r3.getSimpleName()
        L694:
            r3 = r20
            vr4 r7 = new vr4
            r7.<init>(r6, r3)
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r1)
            vr4 r1 = new vr4
            java.lang.String r6 = "submitted_so_far"
            r1.<init>(r6, r3)
            vr4[] r0 = new defpackage.vr4[]{r0, r4, r5, r7, r1}
            r15 = r30
            r2.c(r15, r0)
            if (r42 != 0) goto L6ba
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "Award failed"
            r8.<init>(r0)
            goto L6bc
        L6ba:
            r8 = r42
        L6bc:
            em5 r0 = new em5
            r0.<init>(r8)
            hm5 r1 = new hm5
            r1.<init>(r0)
            return r1
        L6c7:
            r21 = r0
            r25 = r5
            r26 = r9
            r31 = r10
            r7 = r18
            r6 = r23
            r8 = r27
            r15 = r30
            r5 = r32
            r27 = r13
            r13 = r35
            long r9 = r3.e
            java.lang.Long r0 = new java.lang.Long
            r0.<init>(r9)
            vr4 r9 = new vr4
            r9.<init>(r8, r0)
            gk4 r0 = r3.k
            gk4 r10 = defpackage.gk4.HARDCORE
            if (r0 != r10) goto L6f1
            r0 = 1
            goto L6f2
        L6f1:
            r0 = 0
        L6f2:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            vr4 r10 = new vr4
            r10.<init>(r13, r0)
            vr4[] r0 = new defpackage.vr4[]{r9, r10}
            java.lang.String r9 = "smart_sync_unlock_submitted"
            r2.c(r9, r0)
            int r0 = r1 + 1
            defpackage.vy7.P(r1)
            r14 = r3
            r1 = r4
            r32 = r5
            r23 = r6
            r4 = r25
            r9 = r26
            r10 = r31
            r3 = r0
            r0 = r27
        L718:
            long r5 = r14.d
            r25 = r5
            long r5 = r14.e
            r18 = r2
            gk4 r2 = r14.k
            r30 = r5
            gk4 r5 = defpackage.gk4.HARDCORE
            r42 = r7
            if (r2 != r5) goto L72c
            r7 = 1
            goto L72d
        L72c:
            r7 = 0
        L72d:
            long r5 = r14.a
            r20 = r11
            ik4 r11 = r14.l
            r27 = r2
            r2 = r41
            r2.X = r12
            r33 = r5
            r5 = 0
            r2.Y = r5
            r2.Z = r10
            r2.d0 = r5
            r2.e0 = r9
            r2.f0 = r4
            r2.g0 = r1
            r2.h0 = r0
            r2.i0 = r14
            r2.j0 = r3
            r6 = 5
            r2.k0 = r6
            r19 = r1
            java.lang.String r1 = r2.o0
            r28 = r12
            r12 = r2
            java.lang.String r2 = r12.n0
            r22 = r3
            r35 = r13
            r36 = r18
            r13 = r21
            r21 = 4
            r24 = 0
            r18 = r6
            r37 = r15
            r15 = r42
            r38 = r27
            r27 = r0
            r0 = r29
            r29 = r23
            r23 = r14
            r14 = r32
            r32 = r8
            r39 = r25
            r25 = r4
            r26 = r9
            r3 = r39
            r8 = r33
            r33 = r5
            r5 = r30
            r31 = r10
            r30 = r37
            r10 = r38
            java.lang.Object r2 = r0.a(r1, r2, r3, r5, r7, r8, r10, r11, r12)
            if (r2 != r13) goto L795
        L794:
            return r13
        L795:
            r10 = r19
            r7 = r22
            r4 = r23
            r12 = r25
            r9 = r27
            r3 = r28
            r1 = r31
        L7a3:
            java.lang.Throwable r2 = defpackage.hm5.a(r2)
            if (r2 != 0) goto L7c2
            r6 = r41
            r2 = r3
            r11 = r14
            r8 = r15
            r25 = r20
            r14 = r26
            r23 = r29
            r15 = r30
            r27 = r32
            r28 = r33
            r26 = r35
            r29 = r0
            r0 = r36
            goto L434
        L7c2:
            vr4 r0 = new vr4
            r0.<init>(r15, r3)
            vr4 r1 = new vr4
            java.lang.String r3 = "ledger_ack_failed"
            r1.<init>(r14, r3)
            long r3 = r4.e
            java.lang.Long r5 = new java.lang.Long
            r5.<init>(r3)
            vr4 r3 = new vr4
            r8 = r32
            r3.<init>(r8, r5)
            java.lang.String r4 = r2.getMessage()
            if (r4 != 0) goto L7ea
            java.lang.Class r4 = r2.getClass()
            java.lang.String r4 = r4.getSimpleName()
        L7ea:
            vr4 r5 = new vr4
            r6 = r29
            r5.<init>(r6, r4)
            vr4[] r0 = new defpackage.vr4[]{r0, r1, r3, r5}
            r1 = r30
            r4 = r36
            r4.c(r1, r0)
            em5 r0 = new em5
            r0.<init>(r2)
            hm5 r1 = new hm5
            r1.<init>(r0)
            return r1
        L807:
            r4 = r0
            r20 = r1
            r15 = r8
            r8 = r2
            vr4 r0 = new vr4
            r0.<init>(r15, r8)
            java.lang.Integer r1 = new java.lang.Integer
            r1.<init>(r7)
            vr4 r2 = new vr4
            java.lang.String r3 = "submitted"
            r2.<init>(r3, r1)
            int r1 = r10.size()
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r1)
            vr4 r1 = new vr4
            java.lang.String r5 = "skipped"
            r1.<init>(r5, r3)
            int r3 = r20.size()
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r3)
            vr4 r3 = new vr4
            java.lang.String r6 = "total"
            r3.<init>(r6, r5)
            vr4[] r0 = new defpackage.vr4[]{r0, r2, r1, r3}
            java.lang.String r1 = "smart_sync_completed"
            r4.c(r1, r0)
            xk6 r0 = new xk6
            int r1 = r20.size()
            r0.<init>(r7, r10, r1)
            hm5 r1 = new hm5
            r1.<init>(r0)
            return r1
        L855:
            r4 = r0
            r12 = r9
            r14 = r11
            r1 = r15
            r6 = r23
            r15 = r8
            vr4 r0 = new vr4
            r0.<init>(r15, r12)
            vr4 r2 = new vr4
            java.lang.String r5 = "fetch_current_set_failed"
            r2.<init>(r14, r5)
            java.lang.Class r5 = r3.getClass()
            java.lang.String r5 = r5.getSimpleName()
            vr4 r7 = new vr4
            r7.<init>(r6, r5)
            vr4[] r0 = new defpackage.vr4[]{r0, r2, r7}
            r4.c(r1, r0)
            em5 r0 = new em5
            r0.<init>(r3)
            hm5 r1 = new hm5
            r1.<init>(r0)
            return r1
    }
}
