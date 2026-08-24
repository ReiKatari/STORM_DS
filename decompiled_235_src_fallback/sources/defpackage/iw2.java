package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iw2  reason: default package */
/* loaded from: classes.dex */
public final class iw2 {
    public final defpackage.o12 a;
    public final defpackage.eo2 b;
    public final defpackage.eo2 c;
    public final defpackage.hb4 d;
    public final defpackage.hb4 e;
    public final java.util.LinkedHashMap f;
    public java.lang.String g;
    public defpackage.hb5 h;
    public boolean i;

    public iw2(defpackage.o12 r2, defpackage.p12 r3) {
            r1 = this;
            zv2 r0 = defpackage.zv2.d0
            r1.<init>()
            r1.a = r2
            r1.b = r3
            r1.c = r0
            hb4 r2 = new hb4
            r2.<init>()
            r1.d = r2
            hb4 r2 = new hb4
            r2.<init>()
            r1.e = r2
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r1.f = r2
            r2 = 1
            r1.i = r2
            return
    }

    public final java.lang.Object a(java.lang.String r18, defpackage.o75 r19, defpackage.hb5 r20, defpackage.s41 r21) {
            r17 = this;
            r0 = r17
            r1 = r21
            boolean r2 = r1 instanceof defpackage.cw2
            if (r2 == 0) goto L17
            r2 = r1
            cw2 r2 = (defpackage.cw2) r2
            int r3 = r2.l0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.l0 = r3
            goto L1c
        L17:
            cw2 r2 = new cw2
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.j0
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r2.l0
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = 0
            r9 = 0
            if (r4 == 0) goto L7b
            if (r4 == r7) goto L6b
            if (r4 == r6) goto L53
            if (r4 != r5) goto L4d
            int r7 = r2.h0
            boolean r0 = r2.i0
            java.lang.String r3 = r2.g0
            vr4[] r4 = r2.f0
            java.lang.String r5 = r2.e0
            java.lang.Object r6 = r2.d0
            iw2 r6 = (defpackage.iw2) r6
            java.lang.Object r2 = r2.Z
            vr4[] r2 = (defpackage.vr4[]) r2
            defpackage.oi2.Y(r1)
            r16 = r1
            r1 = r0
            r0 = r6
            r6 = r2
            r2 = r16
            goto L129
        L4d:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r9
        L53:
            java.lang.String r4 = r2.e0
            cw2 r4 = (defpackage.cw2) r4
            java.lang.Object r4 = r2.d0
            fb4 r4 = (defpackage.fb4) r4
            java.lang.Object r10 = r2.Z
            fb4 r10 = (defpackage.fb4) r10
            hb5 r11 = r2.Y
            o75 r12 = r2.X
            defpackage.oi2.Y(r1)     // Catch: java.lang.Throwable -> L68
            goto Lcf
        L68:
            r0 = move-exception
            goto L13e
        L6b:
            int r4 = r2.h0
            java.lang.Object r10 = r2.Z
            fb4 r10 = (defpackage.fb4) r10
            hb5 r11 = r2.Y
            o75 r12 = r2.X
            java.lang.String r13 = r2.R
            defpackage.oi2.Y(r1)
            goto La0
        L7b:
            defpackage.oi2.Y(r1)
            r1 = r18
            r2.R = r1
            r4 = r19
            r2.X = r4
            r10 = r20
            r2.Y = r10
            hb4 r11 = r0.d
            r2.Z = r11
            r2.h0 = r8
            r2.l0 = r7
            java.lang.Object r12 = r11.e(r2)
            if (r12 != r3) goto L9a
            goto L125
        L9a:
            r12 = r11
            r11 = r10
            r10 = r12
            r13 = r1
            r12 = r4
            r4 = r8
        La0:
            boolean r1 = r0.i     // Catch: java.lang.Throwable -> L68
            if (r1 != 0) goto Lea
            java.lang.String r1 = r0.g     // Catch: java.lang.Throwable -> L68
            boolean r1 = defpackage.nb3.k(r1, r13)     // Catch: java.lang.Throwable -> L68
            if (r1 == 0) goto Lea
            hb5 r1 = r0.h     // Catch: java.lang.Throwable -> L68
            boolean r1 = defpackage.nb3.k(r1, r11)     // Catch: java.lang.Throwable -> L68
            if (r1 != 0) goto Lb5
            goto Lea
        Lb5:
            hb4 r1 = r0.e     // Catch: java.lang.Throwable -> L68
            r2.R = r9     // Catch: java.lang.Throwable -> L68
            r2.X = r12     // Catch: java.lang.Throwable -> L68
            r2.Y = r11     // Catch: java.lang.Throwable -> L68
            r2.Z = r10     // Catch: java.lang.Throwable -> L68
            r2.d0 = r1     // Catch: java.lang.Throwable -> L68
            r2.e0 = r9     // Catch: java.lang.Throwable -> L68
            r2.h0 = r4     // Catch: java.lang.Throwable -> L68
            r2.l0 = r6     // Catch: java.lang.Throwable -> L68
            java.lang.Object r4 = r1.e(r2)     // Catch: java.lang.Throwable -> L68
            if (r4 != r3) goto Lce
            goto L125
        Lce:
            r4 = r1
        Lcf:
            java.util.LinkedHashMap r1 = r0.f     // Catch: java.lang.Throwable -> Le5
            long r13 = r12.a     // Catch: java.lang.Throwable -> Le5
            java.lang.Long r15 = new java.lang.Long     // Catch: java.lang.Throwable -> Le5
            r15.<init>(r13)     // Catch: java.lang.Throwable -> Le5
            bw2 r13 = new bw2     // Catch: java.lang.Throwable -> Le5
            r13.<init>(r12, r11)     // Catch: java.lang.Throwable -> Le5
            r1.put(r15, r13)     // Catch: java.lang.Throwable -> Le5
            r4.h(r9)     // Catch: java.lang.Throwable -> L68
            r1 = r7
            goto Leb
        Le5:
            r0 = move-exception
            r4.h(r9)     // Catch: java.lang.Throwable -> L68
            throw r0     // Catch: java.lang.Throwable -> L68
        Lea:
            r1 = r8
        Leb:
            r10.h(r9)
            if (r1 == 0) goto Lf3
            java.lang.String r4 = "hardcore_queue_add"
            goto Lf5
        Lf3:
            java.lang.String r4 = "hardcore_queue_add_rejected"
        Lf5:
            vr4[] r6 = new defpackage.vr4[r6]
            long r10 = r12.a
            java.lang.Long r12 = new java.lang.Long
            r12.<init>(r10)
            vr4 r10 = new vr4
            java.lang.String r11 = "achievement_id"
            r10.<init>(r11, r12)
            r6[r8] = r10
            r2.R = r9
            r2.X = r9
            r2.Y = r9
            r2.Z = r6
            r2.d0 = r0
            r2.e0 = r4
            r2.f0 = r6
            java.lang.String r8 = "size"
            r2.g0 = r8
            r2.i0 = r1
            r2.h0 = r7
            r2.l0 = r5
            java.lang.Object r2 = r0.c(r2)
            if (r2 != r3) goto L126
        L125:
            return r3
        L126:
            r5 = r4
            r4 = r6
            r3 = r8
        L129:
            vr4 r8 = new vr4
            r8.<init>(r3, r2)
            r4[r7] = r8
            eo2 r0 = r0.c
            java.util.List r2 = defpackage.fv.T0(r6)
            r0.o(r5, r2)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            return r0
        L13e:
            r10.h(r9)
            throw r0
    }

    public final java.lang.Object b(java.lang.String r9, defpackage.hb5 r10, defpackage.s41 r11) {
            r8 = this;
            boolean r0 = r11 instanceof defpackage.dw2
            if (r0 == 0) goto L13
            r0 = r11
            dw2 r0 = (defpackage.dw2) r0
            int r1 = r0.g0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.g0 = r1
            goto L18
        L13:
            dw2 r0 = new dw2
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.e0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.g0
            r3 = 2
            r4 = 1
            r5 = 0
            r6 = 0
            if (r2 == 0) goto L4d
            if (r2 == r4) goto L3e
            if (r2 != r3) goto L38
            hb4 r9 = r0.Z
            fb4 r10 = r0.Y
            hb5 r1 = r0.X
            java.lang.String r0 = r0.R
            defpackage.oi2.Y(r11)     // Catch: java.lang.Throwable -> L35
            goto La0
        L35:
            r8 = move-exception
            goto Lc0
        L38:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r8)
            return r6
        L3e:
            int r9 = r0.d0
            fb4 r10 = r0.Y
            hb5 r2 = r0.X
            java.lang.String r7 = r0.R
            defpackage.oi2.Y(r11)
            r11 = r10
            r10 = r9
            r9 = r7
            goto L6e
        L4d:
            defpackage.oi2.Y(r11)
            boolean r11 = defpackage.qs6.v0(r9)
            if (r11 == 0) goto L59
            java.lang.Boolean r8 = java.lang.Boolean.FALSE
            return r8
        L59:
            r0.R = r9
            r0.X = r10
            hb4 r11 = r8.d
            r0.Y = r11
            r0.d0 = r5
            r0.g0 = r4
            java.lang.Object r2 = r11.e(r0)
            if (r2 != r1) goto L6c
            goto L9b
        L6c:
            r2 = r10
            r10 = r5
        L6e:
            boolean r7 = r8.i     // Catch: java.lang.Throwable -> L84
            if (r7 != 0) goto L87
            java.lang.String r7 = r8.g     // Catch: java.lang.Throwable -> L84
            boolean r7 = defpackage.nb3.k(r7, r9)     // Catch: java.lang.Throwable -> L84
            if (r7 == 0) goto L87
            hb5 r7 = r8.h     // Catch: java.lang.Throwable -> L84
            boolean r7 = defpackage.nb3.k(r7, r2)     // Catch: java.lang.Throwable -> L84
            if (r7 == 0) goto L87
            r10 = r11
            goto Lb3
        L84:
            r8 = move-exception
            r10 = r11
            goto Lc0
        L87:
            hb4 r7 = r8.e     // Catch: java.lang.Throwable -> L84
            r0.R = r9     // Catch: java.lang.Throwable -> L84
            r0.X = r2     // Catch: java.lang.Throwable -> L84
            r0.Y = r11     // Catch: java.lang.Throwable -> L84
            r0.Z = r7     // Catch: java.lang.Throwable -> L84
            r0.d0 = r10     // Catch: java.lang.Throwable -> L84
            r0.g0 = r3     // Catch: java.lang.Throwable -> L84
            java.lang.Object r10 = r7.e(r0)     // Catch: java.lang.Throwable -> L84
            if (r10 != r1) goto L9c
        L9b:
            return r1
        L9c:
            r0 = r9
            r10 = r11
            r1 = r2
            r9 = r7
        La0:
            java.util.LinkedHashMap r11 = r8.f     // Catch: java.lang.Throwable -> Lbb
            boolean r11 = r11.isEmpty()     // Catch: java.lang.Throwable -> Lbb
            if (r11 != 0) goto Laa
            r4 = r5
            goto Lb0
        Laa:
            r8.g = r0     // Catch: java.lang.Throwable -> Lbb
            r8.h = r1     // Catch: java.lang.Throwable -> Lbb
            r8.i = r5     // Catch: java.lang.Throwable -> Lbb
        Lb0:
            r9.h(r6)     // Catch: java.lang.Throwable -> L35
        Lb3:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.Throwable -> L35
            r10.h(r6)
            return r8
        Lbb:
            r8 = move-exception
            r9.h(r6)     // Catch: java.lang.Throwable -> L35
            throw r8     // Catch: java.lang.Throwable -> L35
        Lc0:
            r10.h(r6)
            throw r8
    }

    public final java.lang.Object c(defpackage.s41 r6) {
            r5 = this;
            boolean r0 = r6 instanceof defpackage.ew2
            if (r0 == 0) goto L13
            r0 = r6
            ew2 r0 = (defpackage.ew2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            ew2 r0 = new ew2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L2a
            hb4 r0 = r0.R
            defpackage.oi2.Y(r6)
            goto L41
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            return r4
        L30:
            defpackage.oi2.Y(r6)
            hb4 r6 = r5.e
            r0.R = r6
            r0.Z = r3
            java.lang.Object r0 = r6.e(r0)
            if (r0 != r1) goto L40
            return r1
        L40:
            r0 = r6
        L41:
            java.util.LinkedHashMap r5 = r5.f     // Catch: java.lang.Throwable -> L50
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L50
            java.lang.Integer r6 = new java.lang.Integer     // Catch: java.lang.Throwable -> L50
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L50
            r0.h(r4)
            return r6
        L50:
            r5 = move-exception
            r0.h(r4)
            throw r5
    }

    public final java.lang.Object d(java.lang.String r10, defpackage.s41 r11) {
            r9 = this;
            java.util.LinkedHashMap r0 = r9.f
            boolean r1 = r11 instanceof defpackage.fw2
            if (r1 == 0) goto L15
            r1 = r11
            fw2 r1 = (defpackage.fw2) r1
            int r2 = r1.f0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L15
            int r2 = r2 - r3
            r1.f0 = r2
            goto L1a
        L15:
            fw2 r1 = new fw2
            r1.<init>(r9, r11)
        L1a:
            java.lang.Object r11 = r1.d0
            x61 r2 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r1.f0
            r4 = 2
            r5 = 1
            r6 = 0
            r7 = 0
            if (r3 == 0) goto L47
            if (r3 == r5) goto L3b
            if (r3 != r4) goto L35
            hb4 r10 = r1.Y
            fb4 r1 = r1.X
            defpackage.oi2.Y(r11)     // Catch: java.lang.Throwable -> L32
            goto L81
        L32:
            r9 = move-exception
            goto Lba
        L35:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r9)
            return r7
        L3b:
            int r10 = r1.Z
            fb4 r3 = r1.X
            java.lang.String r8 = r1.R
            defpackage.oi2.Y(r11)
            r11 = r10
            r10 = r8
            goto L5d
        L47:
            defpackage.oi2.Y(r11)
            r1.R = r10
            hb4 r11 = r9.d
            r1.X = r11
            r1.Z = r6
            r1.f0 = r5
            java.lang.Object r3 = r11.e(r1)
            if (r3 != r2) goto L5b
            goto L7f
        L5b:
            r3 = r11
            r11 = r6
        L5d:
            java.lang.String r8 = r9.g     // Catch: java.lang.Throwable -> Lb8
            boolean r10 = defpackage.nb3.k(r8, r10)     // Catch: java.lang.Throwable -> Lb8
            if (r10 != 0) goto L67
            r1 = r3
            goto L8b
        L67:
            r9.i = r5     // Catch: java.lang.Throwable -> Lb8
            r9.g = r7     // Catch: java.lang.Throwable -> Lb8
            r9.h = r7     // Catch: java.lang.Throwable -> Lb8
            hb4 r10 = r9.e     // Catch: java.lang.Throwable -> Lb8
            r1.R = r7     // Catch: java.lang.Throwable -> Lb8
            r1.X = r3     // Catch: java.lang.Throwable -> Lb8
            r1.Y = r10     // Catch: java.lang.Throwable -> Lb8
            r1.Z = r11     // Catch: java.lang.Throwable -> Lb8
            r1.f0 = r4     // Catch: java.lang.Throwable -> Lb8
            java.lang.Object r11 = r10.e(r1)     // Catch: java.lang.Throwable -> Lb8
            if (r11 != r2) goto L80
        L7f:
            return r2
        L80:
            r1 = r3
        L81:
            int r6 = r0.size()     // Catch: java.lang.Throwable -> Lb3
            r0.clear()     // Catch: java.lang.Throwable -> Lb3
            r10.h(r7)     // Catch: java.lang.Throwable -> L32
        L8b:
            java.lang.Integer r10 = new java.lang.Integer     // Catch: java.lang.Throwable -> L32
            r10.<init>(r6)     // Catch: java.lang.Throwable -> L32
            r1.h(r7)
            int r11 = r10.intValue()
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r11)
            vr4 r11 = new vr4
            java.lang.String r1 = "count"
            r11.<init>(r1, r0)
            vr4[] r11 = new defpackage.vr4[]{r11}
            eo2 r9 = r9.c
            java.util.List r11 = defpackage.fv.T0(r11)
            java.lang.String r0 = "hardcore_queue_discarded"
            r9.o(r0, r11)
            return r10
        Lb3:
            r9 = move-exception
            r10.h(r7)     // Catch: java.lang.Throwable -> L32
            throw r9     // Catch: java.lang.Throwable -> L32
        Lb8:
            r9 = move-exception
            r1 = r3
        Lba:
            r1.h(r7)
            throw r9
    }

    public final java.lang.Object e(java.lang.String r21, defpackage.s41 r22) {
            r20 = this;
            r0 = r20
            r1 = r22
            boolean r2 = r1 instanceof defpackage.gw2
            if (r2 == 0) goto L17
            r2 = r1
            gw2 r2 = (defpackage.gw2) r2
            int r3 = r2.n0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.n0 = r3
            goto L1c
        L17:
            gw2 r2 = new gw2
            r2.<init>(r0, r1)
        L1c:
            java.lang.Object r1 = r2.l0
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r2.n0
            java.lang.String r5 = "remaining"
            java.lang.String r7 = "achievement_id"
            java.util.LinkedHashMap r8 = r0.f
            hb4 r9 = r0.e
            eo2 r11 = r0.c
            r13 = 0
            switch(r4) {
                case 0: goto L109;
                case 1: goto Lfb;
                case 2: goto Lef;
                case 3: goto Ldb;
                case 4: goto Lc0;
                case 5: goto L90;
                case 6: goto L6e;
                case 7: goto L47;
                case 8: goto L36;
                default: goto L30;
            }
        L30:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r13
        L36:
            int r0 = r2.j0
            java.lang.Object r3 = r2.Y
            java.util.List r3 = (java.util.List) r3
            fb4 r2 = r2.X
            defpackage.oi2.Y(r1)     // Catch: java.lang.Throwable -> L44
            r13 = r11
            goto L354
        L44:
            r0 = move-exception
            goto L3b7
        L47:
            int r4 = r2.j0
            int r14 = r2.i0
            int r15 = r2.h0
            vr4[] r6 = r2.f0
            java.util.List r6 = (java.util.List) r6
            hb4 r6 = r2.e0
            java.lang.Object r13 = r2.Z
            java.util.Iterator r13 = (java.util.Iterator) r13
            java.lang.Object r10 = r2.Y
            bw2 r10 = (defpackage.bw2) r10
            fb4 r12 = r2.X
            defpackage.oi2.Y(r1)     // Catch: java.lang.Throwable -> L69
            r1 = r2
            r18 = r5
            r19 = r11
            r2 = r12
            r12 = r13
            goto L23a
        L69:
            r0 = move-exception
            r2 = r12
        L6b:
            r13 = 0
            goto L3b7
        L6e:
            int r4 = r2.j0
            int r6 = r2.i0
            int r10 = r2.h0
            iw2 r12 = r2.d0
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r12 = r2.Z
            java.util.Iterator r12 = (java.util.Iterator) r12
            java.lang.Object r13 = r2.Y
            bw2 r13 = (defpackage.bw2) r13
            fb4 r14 = r2.X
            defpackage.oi2.Y(r1)     // Catch: java.lang.Throwable -> L8d
            r18 = r5
            r19 = r11
        L89:
            r5 = r10
            r10 = r13
            goto L20a
        L8d:
            r0 = move-exception
            r2 = r14
            goto L6b
        L90:
            int r4 = r2.k0
            int r10 = r2.j0
            int r6 = r2.i0
            int r7 = r2.h0
            java.lang.String r8 = r2.g0
            vr4[] r9 = r2.f0
            hb4 r12 = r2.e0
            bw2 r12 = (defpackage.bw2) r12
            iw2 r12 = r2.d0
            java.lang.Object r13 = r2.Z
            java.lang.String r13 = (java.lang.String) r13
            java.lang.Object r14 = r2.Y
            vr4[] r14 = (defpackage.vr4[]) r14
            fb4 r15 = r2.X
            defpackage.oi2.Y(r1)     // Catch: java.lang.Throwable -> Lbd
            r21 = r15
            r15 = r14
            r14 = r13
            r13 = r11
            r11 = r10
            r10 = r9
            r9 = r8
        Lb7:
            r8 = r7
            r7 = r6
            r6 = r4
            r4 = r2
            goto L312
        Lbd:
            r0 = move-exception
            r2 = r15
            goto L6b
        Lc0:
            int r4 = r2.j0
            int r6 = r2.i0
            int r10 = r2.h0
            iw2 r12 = r2.d0
            java.util.List r12 = (java.util.List) r12
            java.lang.Object r12 = r2.Z
            java.util.Iterator r12 = (java.util.Iterator) r12
            java.lang.Object r13 = r2.Y
            bw2 r13 = (defpackage.bw2) r13
            fb4 r14 = r2.X
            defpackage.oi2.Y(r1)     // Catch: java.lang.Throwable -> L8d
            r18 = r5
            goto L1da
        Ldb:
            int r4 = r2.i0
            int r6 = r2.h0
            java.lang.Object r10 = r2.Z
            gw2 r10 = (defpackage.gw2) r10
            java.lang.Object r10 = r2.Y
            fb4 r10 = (defpackage.fb4) r10
            fb4 r12 = r2.X
            defpackage.oi2.Y(r1)     // Catch: java.lang.Throwable -> L69
            r1 = r4
            r4 = r12
            goto L14f
        Lef:
            int r12 = r2.j0
            fb4 r2 = r2.X
            defpackage.oi2.Y(r1)     // Catch: java.lang.Throwable -> Lf8
            goto L3a4
        Lf8:
            r0 = move-exception
            goto L6b
        Lfb:
            int r4 = r2.h0
            fb4 r6 = r2.X
            java.lang.String r10 = r2.R
            defpackage.oi2.Y(r1)
            r1 = r6
            r6 = r4
            r4 = r1
            r1 = r10
            goto L123
        L109:
            defpackage.oi2.Y(r1)
            r1 = r21
            r2.R = r1
            hb4 r4 = r0.d
            r2.X = r4
            r6 = 0
            r2.h0 = r6
            r6 = 1
            r2.n0 = r6
            java.lang.Object r6 = r4.e(r2)
            if (r6 != r3) goto L122
            goto L3a0
        L122:
            r6 = 0
        L123:
            boolean r10 = r0.i     // Catch: java.lang.Throwable -> L16f
            if (r10 != 0) goto L12f
            java.lang.String r10 = r0.g     // Catch: java.lang.Throwable -> L16f
            boolean r1 = defpackage.nb3.k(r10, r1)     // Catch: java.lang.Throwable -> L16f
            if (r1 != 0) goto L132
        L12f:
            r13 = 0
            goto L38c
        L132:
            r1 = 0
            r2.R = r1     // Catch: java.lang.Throwable -> L16f
            r2.X = r4     // Catch: java.lang.Throwable -> L16f
            r2.Y = r9     // Catch: java.lang.Throwable -> L16f
            r2.Z = r1     // Catch: java.lang.Throwable -> L16f
            r2.h0 = r6     // Catch: java.lang.Throwable -> L16f
            r1 = 0
            r2.i0 = r1     // Catch: java.lang.Throwable -> L16f
            r2.j0 = r1     // Catch: java.lang.Throwable -> L16f
            r1 = 3
            r2.n0 = r1     // Catch: java.lang.Throwable -> L16f
            java.lang.Object r1 = r9.e(r2)     // Catch: java.lang.Throwable -> L16f
            if (r1 != r3) goto L14d
            goto L3a0
        L14d:
            r10 = r9
            r1 = 0
        L14f:
            java.util.Collection r12 = r8.values()     // Catch: java.lang.Throwable -> L386
            r12.getClass()     // Catch: java.lang.Throwable -> L386
            java.lang.Iterable r12 = (java.lang.Iterable) r12     // Catch: java.lang.Throwable -> L386
            java.util.List r12 = defpackage.gt0.k1(r12)     // Catch: java.lang.Throwable -> L386
            r13 = 0
            r10.h(r13)     // Catch: java.lang.Throwable -> L16f
            boolean r10 = r12.isEmpty()     // Catch: java.lang.Throwable -> L16f
            if (r10 == 0) goto L173
            aw2 r0 = new aw2     // Catch: java.lang.Throwable -> L16f
            r1 = 0
            r0.<init>(r1, r1)     // Catch: java.lang.Throwable -> L16f
        L16c:
            r13 = 0
            goto L3b3
        L16f:
            r0 = move-exception
            r2 = r4
            goto L6b
        L173:
            java.lang.String r10 = "hardcore_queue_drain_start"
            java.lang.String r13 = "size"
            int r14 = r12.size()     // Catch: java.lang.Throwable -> L16f
            java.lang.Integer r15 = new java.lang.Integer     // Catch: java.lang.Throwable -> L16f
            r15.<init>(r14)     // Catch: java.lang.Throwable -> L16f
            vr4 r14 = new vr4     // Catch: java.lang.Throwable -> L16f
            r14.<init>(r13, r15)     // Catch: java.lang.Throwable -> L16f
            vr4[] r13 = new defpackage.vr4[]{r14}     // Catch: java.lang.Throwable -> L16f
            java.util.List r13 = defpackage.fv.T0(r13)     // Catch: java.lang.Throwable -> L16f
            r11.o(r10, r13)     // Catch: java.lang.Throwable -> L16f
            java.util.Iterator r10 = r12.iterator()     // Catch: java.lang.Throwable -> L16f
            r12 = r10
            r10 = r6
            r6 = r1
            r1 = r2
            r2 = r4
            r4 = 0
        L19a:
            boolean r13 = r12.hasNext()     // Catch: java.lang.Throwable -> Lf8
            if (r13 == 0) goto L330
            java.lang.Object r13 = r12.next()     // Catch: java.lang.Throwable -> Lf8
            r13.getClass()     // Catch: java.lang.Throwable -> Lf8
            bw2 r13 = (defpackage.bw2) r13     // Catch: java.lang.Throwable -> Lf8
            hb5 r14 = r13.b     // Catch: java.lang.Throwable -> Lf8
            hb5 r15 = r0.h     // Catch: java.lang.Throwable -> Lf8
            boolean r15 = defpackage.nb3.k(r14, r15)     // Catch: java.lang.Throwable -> Lf8
            if (r15 == 0) goto L2c8
            eo2 r15 = r0.b     // Catch: java.lang.Throwable -> Lf8
            r18 = r5
            r5 = 0
            r1.R = r5     // Catch: java.lang.Throwable -> Lf8
            r1.X = r2     // Catch: java.lang.Throwable -> Lf8
            r1.Y = r13     // Catch: java.lang.Throwable -> Lf8
            r1.Z = r12     // Catch: java.lang.Throwable -> Lf8
            r1.d0 = r5     // Catch: java.lang.Throwable -> Lf8
            r1.e0 = r5     // Catch: java.lang.Throwable -> Lf8
            r1.f0 = r5     // Catch: java.lang.Throwable -> Lf8
            r1.h0 = r10     // Catch: java.lang.Throwable -> Lf8
            r1.i0 = r6     // Catch: java.lang.Throwable -> Lf8
            r1.j0 = r4     // Catch: java.lang.Throwable -> Lf8
            r5 = 4
            r1.n0 = r5     // Catch: java.lang.Throwable -> Lf8
            java.lang.Object r5 = r15.o(r14, r1)     // Catch: java.lang.Throwable -> Lf8
            if (r5 != r3) goto L1d7
            goto L3a0
        L1d7:
            r14 = r2
            r2 = r1
            r1 = r5
        L1da:
            java.lang.Boolean r1 = (java.lang.Boolean) r1     // Catch: java.lang.Throwable -> L8d
            boolean r1 = r1.booleanValue()     // Catch: java.lang.Throwable -> L8d
            if (r1 != 0) goto L1e6
            r7 = r10
            r13 = r11
            goto L2ce
        L1e6:
            o12 r1 = r0.a     // Catch: java.lang.Throwable -> L8d
            o75 r5 = r13.a     // Catch: java.lang.Throwable -> L8d
            hb5 r15 = r13.b     // Catch: java.lang.Throwable -> L8d
            r19 = r11
            r11 = 0
            r2.R = r11     // Catch: java.lang.Throwable -> L8d
            r2.X = r14     // Catch: java.lang.Throwable -> L8d
            r2.Y = r13     // Catch: java.lang.Throwable -> L8d
            r2.Z = r12     // Catch: java.lang.Throwable -> L8d
            r2.d0 = r11     // Catch: java.lang.Throwable -> L8d
            r2.h0 = r10     // Catch: java.lang.Throwable -> L8d
            r2.i0 = r6     // Catch: java.lang.Throwable -> L8d
            r2.j0 = r4     // Catch: java.lang.Throwable -> L8d
            r11 = 6
            r2.n0 = r11     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r1 = r1.e(r5, r15, r2)     // Catch: java.lang.Throwable -> L8d
            if (r1 != r3) goto L89
            goto L3a0
        L20a:
            hm5 r1 = (defpackage.hm5) r1     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r1 = r1.A     // Catch: java.lang.Throwable -> L8d
            boolean r11 = r1 instanceof defpackage.em5     // Catch: java.lang.Throwable -> L8d
            if (r11 != 0) goto L287
            r13 = 0
            r2.R = r13     // Catch: java.lang.Throwable -> L8d
            r2.X = r14     // Catch: java.lang.Throwable -> L8d
            r2.Y = r10     // Catch: java.lang.Throwable -> L8d
            r2.Z = r12     // Catch: java.lang.Throwable -> L8d
            r2.d0 = r13     // Catch: java.lang.Throwable -> L8d
            r2.e0 = r9     // Catch: java.lang.Throwable -> L8d
            r2.f0 = r13     // Catch: java.lang.Throwable -> L8d
            r2.h0 = r5     // Catch: java.lang.Throwable -> L8d
            r2.i0 = r6     // Catch: java.lang.Throwable -> L8d
            r2.j0 = r4     // Catch: java.lang.Throwable -> L8d
            r1 = 0
            r2.k0 = r1     // Catch: java.lang.Throwable -> L8d
            r1 = 7
            r2.n0 = r1     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r1 = r9.e(r2)     // Catch: java.lang.Throwable -> L8d
            if (r1 != r3) goto L235
            goto L3a0
        L235:
            r1 = r2
            r15 = r5
            r2 = r14
            r14 = r6
            r6 = r9
        L23a:
            o75 r5 = r10.a     // Catch: java.lang.Throwable -> L280
            r21 = r1
            r11 = r2
            long r1 = r5.a     // Catch: java.lang.Throwable -> L27d
            java.lang.Long r5 = new java.lang.Long     // Catch: java.lang.Throwable -> L27d
            r5.<init>(r1)     // Catch: java.lang.Throwable -> L27d
            r8.remove(r5, r10)     // Catch: java.lang.Throwable -> L27d
            r13 = 0
            r6.h(r13)     // Catch: java.lang.Throwable -> L27b
            r16 = 1
            int r4 = r4 + 1
            java.lang.String r1 = "hardcore_queue_drain_submitted"
            o75 r2 = r10.a     // Catch: java.lang.Throwable -> L27b
            long r5 = r2.a     // Catch: java.lang.Throwable -> L27b
            java.lang.Long r2 = new java.lang.Long     // Catch: java.lang.Throwable -> L27b
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L27b
            vr4 r5 = new vr4     // Catch: java.lang.Throwable -> L27b
            r5.<init>(r7, r2)     // Catch: java.lang.Throwable -> L27b
            vr4[] r2 = new defpackage.vr4[]{r5}     // Catch: java.lang.Throwable -> L27b
            java.util.List r2 = defpackage.fv.T0(r2)     // Catch: java.lang.Throwable -> L27b
            r13 = r19
            r13.o(r1, r2)     // Catch: java.lang.Throwable -> L27b
            r1 = r21
            r2 = r11
            r11 = r13
            r6 = r14
            r10 = r15
            r5 = r18
            goto L19a
        L278:
            r2 = r11
            goto L6b
        L27b:
            r0 = move-exception
            goto L278
        L27d:
            r0 = move-exception
        L27e:
            r13 = 0
            goto L283
        L280:
            r0 = move-exception
            r11 = r2
            goto L27e
        L283:
            r6.h(r13)     // Catch: java.lang.Throwable -> L27b
            throw r0     // Catch: java.lang.Throwable -> L27b
        L287:
            r13 = r19
            java.lang.String r11 = "hardcore_queue_drain_failed"
            o75 r10 = r10.a     // Catch: java.lang.Throwable -> L8d
            r15 = r1
            r19 = r2
            long r1 = r10.a     // Catch: java.lang.Throwable -> L8d
            java.lang.Long r10 = new java.lang.Long     // Catch: java.lang.Throwable -> L8d
            r10.<init>(r1)     // Catch: java.lang.Throwable -> L8d
            vr4 r1 = new vr4     // Catch: java.lang.Throwable -> L8d
            r1.<init>(r7, r10)     // Catch: java.lang.Throwable -> L8d
            java.lang.String r2 = "error"
            java.lang.Throwable r10 = defpackage.hm5.a(r15)     // Catch: java.lang.Throwable -> L8d
            if (r10 == 0) goto L2ad
            java.lang.Class r10 = r10.getClass()     // Catch: java.lang.Throwable -> L8d
            java.lang.String r10 = r10.getSimpleName()     // Catch: java.lang.Throwable -> L8d
            goto L2af
        L2ad:
            java.lang.String r10 = "unknown"
        L2af:
            vr4 r15 = new vr4     // Catch: java.lang.Throwable -> L8d
            r15.<init>(r2, r10)     // Catch: java.lang.Throwable -> L8d
            vr4[] r1 = new defpackage.vr4[]{r1, r15}     // Catch: java.lang.Throwable -> L8d
            java.util.List r1 = defpackage.fv.T0(r1)     // Catch: java.lang.Throwable -> L8d
            r13.o(r11, r1)     // Catch: java.lang.Throwable -> L8d
            r10 = r5
            r11 = r13
            r2 = r14
            r5 = r18
            r1 = r19
            goto L19a
        L2c8:
            r18 = r5
            r14 = r2
            r2 = r1
            r13 = r11
            r7 = r10
        L2ce:
            java.lang.String r1 = "hardcore_queue_drain_blocked"
            r5 = 2
            vr4[] r9 = new defpackage.vr4[r5]     // Catch: java.lang.Throwable -> L8d
            java.lang.String r5 = "reason"
            java.lang.String r8 = "identity_mismatch"
            vr4 r10 = new vr4     // Catch: java.lang.Throwable -> L8d
            r10.<init>(r5, r8)     // Catch: java.lang.Throwable -> L8d
            r17 = 0
            r9[r17] = r10     // Catch: java.lang.Throwable -> L8d
            r5 = 0
            r2.R = r5     // Catch: java.lang.Throwable -> L8d
            r2.X = r14     // Catch: java.lang.Throwable -> L8d
            r2.Y = r9     // Catch: java.lang.Throwable -> L8d
            r2.Z = r1     // Catch: java.lang.Throwable -> L8d
            r2.d0 = r0     // Catch: java.lang.Throwable -> L8d
            r2.e0 = r5     // Catch: java.lang.Throwable -> L8d
            r2.f0 = r9     // Catch: java.lang.Throwable -> L8d
            r5 = r18
            r2.g0 = r5     // Catch: java.lang.Throwable -> L8d
            r2.h0 = r7     // Catch: java.lang.Throwable -> L8d
            r2.i0 = r6     // Catch: java.lang.Throwable -> L8d
            r8 = 1
            r2.j0 = r8     // Catch: java.lang.Throwable -> L8d
            r2.k0 = r4     // Catch: java.lang.Throwable -> L8d
            r10 = 5
            r2.n0 = r10     // Catch: java.lang.Throwable -> L8d
            java.lang.Object r10 = r0.c(r2)     // Catch: java.lang.Throwable -> L8d
            if (r10 != r3) goto L307
            goto L3a0
        L307:
            r12 = r0
            r11 = r8
            r15 = r9
            r21 = r14
            r14 = r1
            r9 = r5
            r1 = r10
            r10 = r15
            goto Lb7
        L312:
            vr4 r2 = new vr4     // Catch: java.lang.Throwable -> L32e
            r2.<init>(r9, r1)     // Catch: java.lang.Throwable -> L32e
            r15[r11] = r2     // Catch: java.lang.Throwable -> L32e
            eo2 r1 = r12.c     // Catch: java.lang.Throwable -> L32e
            java.util.List r2 = defpackage.fv.T0(r10)     // Catch: java.lang.Throwable -> L32e
            r1.o(r14, r2)     // Catch: java.lang.Throwable -> L32e
            r2 = r21
            r1 = r4
            r4 = r6
            r6 = r7
            r10 = r8
        L328:
            r11 = 0
            goto L332
        L32a:
            r2 = r21
            goto L6b
        L32e:
            r0 = move-exception
            goto L32a
        L330:
            r13 = r11
            goto L328
        L332:
            r1.R = r11     // Catch: java.lang.Throwable -> Lf8
            r1.X = r2     // Catch: java.lang.Throwable -> Lf8
            r1.Y = r11     // Catch: java.lang.Throwable -> Lf8
            r1.Z = r11     // Catch: java.lang.Throwable -> Lf8
            r1.d0 = r11     // Catch: java.lang.Throwable -> Lf8
            r1.e0 = r11     // Catch: java.lang.Throwable -> Lf8
            r1.f0 = r11     // Catch: java.lang.Throwable -> Lf8
            r1.g0 = r11     // Catch: java.lang.Throwable -> Lf8
            r1.h0 = r10     // Catch: java.lang.Throwable -> Lf8
            r1.i0 = r6     // Catch: java.lang.Throwable -> Lf8
            r1.j0 = r4     // Catch: java.lang.Throwable -> Lf8
            r6 = 8
            r1.n0 = r6     // Catch: java.lang.Throwable -> Lf8
            java.lang.Object r1 = r0.c(r1)     // Catch: java.lang.Throwable -> Lf8
            if (r1 != r3) goto L353
            goto L3a0
        L353:
            r0 = r4
        L354:
            java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.lang.Throwable -> Lf8
            int r1 = r1.intValue()     // Catch: java.lang.Throwable -> Lf8
            java.lang.String r3 = "hardcore_queue_drain_complete"
            java.lang.String r4 = "submitted"
            java.lang.Integer r6 = new java.lang.Integer     // Catch: java.lang.Throwable -> Lf8
            r6.<init>(r0)     // Catch: java.lang.Throwable -> Lf8
            vr4 r7 = new vr4     // Catch: java.lang.Throwable -> Lf8
            r7.<init>(r4, r6)     // Catch: java.lang.Throwable -> Lf8
            java.lang.Integer r4 = new java.lang.Integer     // Catch: java.lang.Throwable -> Lf8
            r4.<init>(r1)     // Catch: java.lang.Throwable -> Lf8
            vr4 r6 = new vr4     // Catch: java.lang.Throwable -> Lf8
            r6.<init>(r5, r4)     // Catch: java.lang.Throwable -> Lf8
            vr4[] r4 = new defpackage.vr4[]{r7, r6}     // Catch: java.lang.Throwable -> Lf8
            java.util.List r4 = defpackage.fv.T0(r4)     // Catch: java.lang.Throwable -> Lf8
            r13.o(r3, r4)     // Catch: java.lang.Throwable -> Lf8
            aw2 r3 = new aw2     // Catch: java.lang.Throwable -> Lf8
            r3.<init>(r0, r1)     // Catch: java.lang.Throwable -> Lf8
            r4 = r2
            r0 = r3
            goto L16c
        L386:
            r0 = move-exception
            r13 = 0
            r10.h(r13)     // Catch: java.lang.Throwable -> L16f
            throw r0     // Catch: java.lang.Throwable -> L16f
        L38c:
            r2.R = r13     // Catch: java.lang.Throwable -> L16f
            r2.X = r4     // Catch: java.lang.Throwable -> L16f
            r2.h0 = r6     // Catch: java.lang.Throwable -> L16f
            r1 = 0
            r2.i0 = r1     // Catch: java.lang.Throwable -> L16f
            r2.j0 = r1     // Catch: java.lang.Throwable -> L16f
            r5 = 2
            r2.n0 = r5     // Catch: java.lang.Throwable -> L16f
            java.lang.Object r0 = r0.c(r2)     // Catch: java.lang.Throwable -> L16f
            if (r0 != r3) goto L3a1
        L3a0:
            return r3
        L3a1:
            r12 = r1
            r2 = r4
            r1 = r0
        L3a4:
            java.lang.Number r1 = (java.lang.Number) r1     // Catch: java.lang.Throwable -> Lf8
            int r0 = r1.intValue()     // Catch: java.lang.Throwable -> Lf8
            aw2 r1 = new aw2     // Catch: java.lang.Throwable -> Lf8
            r1.<init>(r12, r0)     // Catch: java.lang.Throwable -> Lf8
            r0 = r1
            r4 = r2
            goto L16c
        L3b3:
            r4.h(r13)
            return r0
        L3b7:
            r2.h(r13)
            throw r0
    }

    public final java.lang.Object f(defpackage.s41 r6) {
            r5 = this;
            boolean r0 = r6 instanceof defpackage.hw2
            if (r0 == 0) goto L13
            r0 = r6
            hw2 r0 = (defpackage.hw2) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            hw2 r0 = new hw2
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L30
            if (r2 != r3) goto L2a
            hb4 r0 = r0.R
            defpackage.oi2.Y(r6)
            goto L41
        L2a:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            return r4
        L30:
            defpackage.oi2.Y(r6)
            hb4 r6 = r5.e
            r0.R = r6
            r0.Z = r3
            java.lang.Object r0 = r6.e(r0)
            if (r0 != r1) goto L40
            return r1
        L40:
            r0 = r6
        L41:
            java.util.LinkedHashMap r5 = r5.f     // Catch: java.lang.Throwable -> L50
            int r5 = r5.size()     // Catch: java.lang.Throwable -> L50
            java.lang.Integer r6 = new java.lang.Integer     // Catch: java.lang.Throwable -> L50
            r6.<init>(r5)     // Catch: java.lang.Throwable -> L50
            r0.h(r4)
            return r6
        L50:
            r5 = move-exception
            r0.h(r4)
            throw r5
    }
}
