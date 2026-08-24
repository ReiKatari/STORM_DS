package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rz4  reason: default package */
/* loaded from: classes.dex */
public final class rz4 implements defpackage.d97, defpackage.ud5 {
    public final defpackage.d90 a;
    public final defpackage.b01 b;
    public final boolean c;
    public final defpackage.pu d;
    public volatile boolean e;

    public rz4(defpackage.d90 r1, defpackage.b01 r2, boolean r3) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            pu r1 = new pu
            r1.<init>()
            r0.d = r1
            return
    }

    @Override // defpackage.d97
    public final java.lang.Object a(defpackage.c97 r5, defpackage.eo2 r6, defpackage.hw6 r7) {
            r4 = this;
            boolean r0 = r4.e
            r1 = 0
            r2 = 21
            if (r0 != 0) goto L25
            l61 r0 = r7.B
            r0.getClass()
            d90 r3 = r4.a
            j61 r0 = r0.Z(r3)
            pz0 r0 = (defpackage.pz0) r0
            if (r0 == 0) goto L1f
            rz4 r0 = r0.B
            if (r0 != r4) goto L1f
            java.lang.Object r4 = r4.g(r5, r6, r7)
            return r4
        L1f:
            java.lang.String r4 = "Attempted to use connection on a different coroutine"
            defpackage.ii2.T(r2, r4)
            throw r1
        L25:
            java.lang.String r4 = "Connection is recycled"
            defpackage.ii2.T(r2, r4)
            throw r1
    }

    @Override // defpackage.jz4
    public final java.lang.Object b(java.lang.String r7, defpackage.qn2 r8, defpackage.s41 r9) {
            r6 = this;
            boolean r0 = r9 instanceof defpackage.qz4
            if (r0 == 0) goto L13
            r0 = r9
            qz4 r0 = (defpackage.qz4) r0
            int r1 = r0.e0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e0 = r1
            goto L18
        L13:
            qz4 r0 = new qz4
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.Z
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.e0
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L36
            if (r2 != r3) goto L30
            b01 r7 = r0.Y
            qn2 r8 = r0.X
            java.lang.String r0 = r0.R
            defpackage.oi2.Y(r9)
            r9 = r7
            r7 = r0
            goto L65
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            return r4
        L36:
            defpackage.oi2.Y(r9)
            boolean r9 = r6.e
            r2 = 21
            if (r9 != 0) goto L8e
            l61 r9 = r0.B
            r9.getClass()
            d90 r5 = r6.a
            j61 r9 = r9.Z(r5)
            pz0 r9 = (defpackage.pz0) r9
            if (r9 == 0) goto L88
            rz4 r9 = r9.B
            if (r9 != r6) goto L88
            b01 r9 = r6.b
            r0.R = r7
            r0.X = r8
            r0.Y = r9
            r0.e0 = r3
            fb4 r2 = r9.B
            java.lang.Object r0 = r2.e(r0)
            if (r0 != r1) goto L65
            return r1
        L65:
            kz4 r0 = new kz4     // Catch: java.lang.Throwable -> L7b
            b01 r1 = r6.b     // Catch: java.lang.Throwable -> L7b
            j36 r7 = r1.i0(r7)     // Catch: java.lang.Throwable -> L7b
            r0.<init>(r6, r7)     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r6 = r8.g(r0)     // Catch: java.lang.Throwable -> L7d
            defpackage.lb4.p(r0, r4)     // Catch: java.lang.Throwable -> L7b
            r9.h(r4)
            return r6
        L7b:
            r6 = move-exception
            goto L84
        L7d:
            r6 = move-exception
            throw r6     // Catch: java.lang.Throwable -> L7f
        L7f:
            r7 = move-exception
            defpackage.lb4.p(r0, r6)     // Catch: java.lang.Throwable -> L7b
            throw r7     // Catch: java.lang.Throwable -> L7b
        L84:
            r9.h(r4)
            throw r6
        L88:
            java.lang.String r6 = "Attempted to use connection on a different coroutine"
            defpackage.ii2.T(r2, r6)
            throw r4
        L8e:
            java.lang.String r6 = "Connection is recycled"
            defpackage.ii2.T(r2, r6)
            throw r4
    }

    @Override // defpackage.d97
    public final java.lang.Boolean c(defpackage.r41 r4) {
            r3 = this;
            boolean r0 = r3.e
            r1 = 0
            r2 = 21
            if (r0 != 0) goto L3d
            s41 r4 = (defpackage.s41) r4
            l61 r4 = r4.B
            r4.getClass()
            d90 r0 = r3.a
            j61 r4 = r4.Z(r0)
            pz0 r4 = (defpackage.pz0) r4
            if (r4 == 0) goto L37
            rz4 r4 = r4.B
            if (r4 != r3) goto L37
            pu r4 = r3.d
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L31
            b01 r3 = r3.b
            e36 r3 = r3.A
            boolean r3 = r3.Y()
            if (r3 == 0) goto L2f
            goto L31
        L2f:
            r3 = 0
            goto L32
        L31:
            r3 = 1
        L32:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            return r3
        L37:
            java.lang.String r3 = "Attempted to use connection on a different coroutine"
            defpackage.ii2.T(r2, r3)
            throw r1
        L3d:
            java.lang.String r3 = "Connection is recycled"
            defpackage.ii2.T(r2, r3)
            throw r1
    }

    @Override // defpackage.ud5
    public final defpackage.e36 d() {
            r0 = this;
            b01 r0 = r0.b
            return r0
    }

    public final java.lang.Object e(defpackage.c97 r8, defpackage.s41 r9) {
            r7 = this;
            pu r0 = r7.d
            java.lang.String r1 = "SAVEPOINT '"
            boolean r2 = r9 instanceof defpackage.nz4
            if (r2 == 0) goto L17
            r2 = r9
            nz4 r2 = (defpackage.nz4) r2
            int r3 = r2.d0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L17
            int r3 = r3 - r4
            r2.d0 = r3
            goto L1c
        L17:
            nz4 r2 = new nz4
            r2.<init>(r7, r9)
        L1c:
            java.lang.Object r9 = r2.Y
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r2.d0
            r5 = 1
            b01 r7 = r7.b
            r6 = 0
            if (r4 == 0) goto L3a
            if (r4 != r5) goto L34
            b01 r8 = r2.X
            c97 r2 = r2.R
            defpackage.oi2.Y(r9)
            r9 = r8
            r8 = r2
            goto L4d
        L34:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r7)
            return r6
        L3a:
            defpackage.oi2.Y(r9)
            r2.R = r8
            r2.X = r7
            r2.d0 = r5
            fb4 r9 = r7.B
            java.lang.Object r9 = r9.e(r2)
            if (r9 != r3) goto L4c
            return r3
        L4c:
            r9 = r7
        L4d:
            int r2 = r0.L     // Catch: java.lang.Throwable -> L6b
            boolean r3 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6b
            if (r3 == 0) goto L7f
            int[] r1 = defpackage.mz4.a     // Catch: java.lang.Throwable -> L6b
            int r8 = r8.ordinal()     // Catch: java.lang.Throwable -> L6b
            r8 = r1[r8]     // Catch: java.lang.Throwable -> L6b
            if (r8 == r5) goto L79
            r1 = 2
            if (r8 == r1) goto L73
            r1 = 3
            if (r8 != r1) goto L6d
            java.lang.String r8 = "BEGIN EXCLUSIVE TRANSACTION"
            defpackage.ii2.s(r7, r8)     // Catch: java.lang.Throwable -> L6b
            goto L93
        L6b:
            r7 = move-exception
            goto La1
        L6d:
            ug r7 = new ug     // Catch: java.lang.Throwable -> L6b
            r7.<init>()     // Catch: java.lang.Throwable -> L6b
            throw r7     // Catch: java.lang.Throwable -> L6b
        L73:
            java.lang.String r8 = "BEGIN IMMEDIATE TRANSACTION"
            defpackage.ii2.s(r7, r8)     // Catch: java.lang.Throwable -> L6b
            goto L93
        L79:
            java.lang.String r8 = "BEGIN DEFERRED TRANSACTION"
            defpackage.ii2.s(r7, r8)     // Catch: java.lang.Throwable -> L6b
            goto L93
        L7f:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6b
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L6b
            r8.append(r2)     // Catch: java.lang.Throwable -> L6b
            r1 = 39
            r8.append(r1)     // Catch: java.lang.Throwable -> L6b
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L6b
            defpackage.ii2.s(r7, r8)     // Catch: java.lang.Throwable -> L6b
        L93:
            lz4 r7 = new lz4     // Catch: java.lang.Throwable -> L6b
            r7.<init>(r2)     // Catch: java.lang.Throwable -> L6b
            r0.addLast(r7)     // Catch: java.lang.Throwable -> L6b
            jg7 r7 = defpackage.jg7.a     // Catch: java.lang.Throwable -> L6b
            r9.h(r6)
            return r7
        La1:
            r9.h(r6)
            throw r7
    }

    public final java.lang.Object f(boolean r9, defpackage.s41 r10) {
            r8 = this;
            pu r0 = r8.d
            java.lang.String r1 = "ROLLBACK TRANSACTION TO SAVEPOINT '"
            java.lang.String r2 = "RELEASE SAVEPOINT '"
            boolean r3 = r10 instanceof defpackage.oz4
            if (r3 == 0) goto L19
            r3 = r10
            oz4 r3 = (defpackage.oz4) r3
            int r4 = r3.d0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L19
            int r4 = r4 - r5
            r3.d0 = r4
            goto L1e
        L19:
            oz4 r3 = new oz4
            r3.<init>(r8, r10)
        L1e:
            java.lang.Object r10 = r3.Y
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            int r5 = r3.d0
            r6 = 1
            b01 r8 = r8.b
            r7 = 0
            if (r5 == 0) goto L3a
            if (r5 != r6) goto L34
            boolean r9 = r3.R
            b01 r3 = r3.X
            defpackage.oi2.Y(r10)
            goto L4d
        L34:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r8)
            return r7
        L3a:
            defpackage.oi2.Y(r10)
            r3.X = r8
            r3.R = r9
            r3.d0 = r6
            fb4 r10 = r8.B
            java.lang.Object r10 = r10.e(r3)
            if (r10 != r4) goto L4c
            return r4
        L4c:
            r3 = r8
        L4d:
            boolean r10 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6c
            if (r10 != 0) goto La9
            java.lang.Object r10 = defpackage.gt0.Y0(r0)     // Catch: java.lang.Throwable -> L6c
            lz4 r10 = (defpackage.lz4) r10     // Catch: java.lang.Throwable -> L6c
            r4 = 39
            if (r9 == 0) goto L83
            r10.getClass()     // Catch: java.lang.Throwable -> L6c
            boolean r9 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6c
            if (r9 == 0) goto L6e
            java.lang.String r9 = "END TRANSACTION"
            defpackage.ii2.s(r8, r9)     // Catch: java.lang.Throwable -> L6c
            goto La3
        L6c:
            r8 = move-exception
            goto Lb1
        L6e:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r9.<init>(r2)     // Catch: java.lang.Throwable -> L6c
            int r10 = r10.a     // Catch: java.lang.Throwable -> L6c
            r9.append(r10)     // Catch: java.lang.Throwable -> L6c
            r9.append(r4)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L6c
            defpackage.ii2.s(r8, r9)     // Catch: java.lang.Throwable -> L6c
            goto La3
        L83:
            boolean r9 = r0.isEmpty()     // Catch: java.lang.Throwable -> L6c
            if (r9 == 0) goto L8f
            java.lang.String r9 = "ROLLBACK TRANSACTION"
            defpackage.ii2.s(r8, r9)     // Catch: java.lang.Throwable -> L6c
            goto La3
        L8f:
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L6c
            r9.<init>(r1)     // Catch: java.lang.Throwable -> L6c
            int r10 = r10.a     // Catch: java.lang.Throwable -> L6c
            r9.append(r10)     // Catch: java.lang.Throwable -> L6c
            r9.append(r4)     // Catch: java.lang.Throwable -> L6c
            java.lang.String r9 = r9.toString()     // Catch: java.lang.Throwable -> L6c
            defpackage.ii2.s(r8, r9)     // Catch: java.lang.Throwable -> L6c
        La3:
            jg7 r8 = defpackage.jg7.a     // Catch: java.lang.Throwable -> L6c
            r3.h(r7)
            return r8
        La9:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L6c
            java.lang.String r9 = "Not in a transaction"
            r8.<init>(r9)     // Catch: java.lang.Throwable -> L6c
            throw r8     // Catch: java.lang.Throwable -> L6c
        Lb1:
            r3.h(r7)
            throw r8
    }

    public final java.lang.Object g(defpackage.c97 r11, defpackage.eo2 r12, defpackage.s41 r13) {
            r10 = this;
            boolean r0 = r13 instanceof defpackage.pz4
            if (r0 == 0) goto L13
            r0 = r13
            pz4 r0 = (defpackage.pz4) r0
            int r1 = r0.e0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.e0 = r1
            goto L18
        L13:
            pz4 r0 = new pz4
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.Z
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.e0
            r3 = 0
            r4 = 0
            r5 = 5
            r6 = 3
            r7 = 2
            r8 = 1
            if (r2 == 0) goto L5c
            if (r2 == r8) goto L53
            if (r2 == r7) goto L4b
            if (r2 == r6) goto L45
            r10 = 4
            if (r2 == r10) goto L45
            if (r2 == r5) goto L37
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r10)
            return r3
        L37:
            java.lang.Throwable r10 = r0.X
            java.lang.Object r11 = r0.R
            java.lang.Throwable r11 = (java.lang.Throwable) r11
            defpackage.oi2.Y(r13)     // Catch: android.database.SQLException -> L42
            goto Laa
        L42:
            r12 = move-exception
            goto La5
        L45:
            java.lang.Object r10 = r0.R
            defpackage.oi2.Y(r13)
            return r10
        L4b:
            int r11 = r0.Y
            defpackage.oi2.Y(r13)     // Catch: java.lang.Throwable -> L51
            goto L81
        L51:
            r11 = move-exception
            goto L90
        L53:
            java.lang.Object r11 = r0.R
            r12 = r11
            eo2 r12 = (defpackage.eo2) r12
            defpackage.oi2.Y(r13)
            goto L6e
        L5c:
            defpackage.oi2.Y(r13)
            if (r11 != 0) goto L63
            c97 r11 = defpackage.c97.DEFERRED
        L63:
            r0.R = r12
            r0.e0 = r8
            java.lang.Object r11 = r10.e(r11, r0)
            if (r11 != r1) goto L6e
            goto L9e
        L6e:
            bt4 r11 = new bt4     // Catch: java.lang.Throwable -> L51
            r11.<init>(r10, r8)     // Catch: java.lang.Throwable -> L51
            r0.R = r3     // Catch: java.lang.Throwable -> L51
            r0.Y = r8     // Catch: java.lang.Throwable -> L51
            r0.e0 = r7     // Catch: java.lang.Throwable -> L51
            java.lang.Object r13 = r12.o(r11, r0)     // Catch: java.lang.Throwable -> L51
            if (r13 != r1) goto L80
            goto L9e
        L80:
            r11 = r8
        L81:
            if (r11 == 0) goto L84
            r4 = r8
        L84:
            r0.R = r13
            r0.e0 = r6
            java.lang.Object r10 = r10.f(r4, r0)
            if (r10 != r1) goto L8f
            goto L9e
        L8f:
            return r13
        L90:
            throw r11     // Catch: java.lang.Throwable -> L91
        L91:
            r12 = move-exception
            r0.R = r11     // Catch: android.database.SQLException -> La1
            r0.X = r12     // Catch: android.database.SQLException -> La1
            r0.e0 = r5     // Catch: android.database.SQLException -> La1
            java.lang.Object r10 = r10.f(r4, r0)     // Catch: android.database.SQLException -> La1
            if (r10 != r1) goto L9f
        L9e:
            return r1
        L9f:
            r10 = r12
            goto Laa
        La1:
            r10 = move-exception
            r9 = r12
            r12 = r10
            r10 = r9
        La5:
            if (r11 == 0) goto Lab
            defpackage.mb3.q(r11, r12)
        Laa:
            throw r10
        Lab:
            throw r12
    }
}
