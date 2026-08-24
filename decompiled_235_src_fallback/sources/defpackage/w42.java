package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w42  reason: default package */
/* loaded from: classes.dex */
public final class w42 {
    public final defpackage.pe5 a;
    public final defpackage.jx6 b;
    public final defpackage.ap3 c;
    public final defpackage.s63 d;

    public w42(defpackage.pe5 r1, defpackage.jx6 r2, defpackage.ap3 r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            s63 r2 = new s63
            r2.<init>(r1, r3)
            r0.d = r2
            return
    }

    public static final java.lang.Object a(defpackage.w42 r17, defpackage.mn6 r18, defpackage.uv0 r19, defpackage.z23 r20, java.lang.Object r21, defpackage.fo4 r22, defpackage.k62 r23, defpackage.s41 r24) {
            r0 = r24
            r17.getClass()
            boolean r1 = r0 instanceof defpackage.r42
            if (r1 == 0) goto L1a
            r1 = r0
            r42 r1 = (defpackage.r42) r1
            int r2 = r1.j0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L1a
            int r2 = r2 - r3
            r1.j0 = r2
            r2 = r17
            goto L21
        L1a:
            r42 r1 = new r42
            r2 = r17
            r1.<init>(r2, r0)
        L21:
            java.lang.Object r0 = r1.h0
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r1.j0
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L59
            if (r4 != r6) goto L53
            int r2 = r1.g0
            k62 r4 = r1.f0
            fo4 r7 = r1.e0
            java.lang.Object r8 = r1.d0
            z23 r9 = r1.Z
            uv0 r10 = r1.Y
            mn6 r11 = r1.X
            w42 r12 = r1.R
            defpackage.oi2.Y(r0)
            r16 = r12
            r12 = r1
            r1 = r10
            r10 = r2
            r2 = r16
            r16 = r9
            r9 = r4
            r4 = r16
            r16 = r8
            r8 = r7
            r7 = r16
            goto Lc6
        L53:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r5
        L59:
            defpackage.oi2.Y(r0)
            r0 = 0
            r4 = r20
            r7 = r21
            r8 = r22
            r9 = r23
            r10 = r0
            r11 = r1
            r0 = r18
            r1 = r19
        L6b:
            pe5 r12 = r2.a
            java.util.List r12 = r1.e
            int r13 = r12.size()
            if (r10 >= r13) goto L93
            java.lang.Object r12 = r12.get(r10)
            q40 r12 = (defpackage.q40) r12
            r12.getClass()
            s40 r13 = new s40
            b33 r14 = r0.a
            lb6 r15 = r12.b
            u72 r12 = r12.a
            r13.<init>(r14, r8, r15, r12)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            vr4 r12 = new vr4
            r12.<init>(r13, r10)
            goto L94
        L93:
            r12 = r5
        L94:
            if (r12 == 0) goto Lea
            java.lang.Object r10 = r12.A
            s40 r10 = (defpackage.s40) r10
            java.lang.Object r12 = r12.B
            java.lang.Number r12 = (java.lang.Number) r12
            int r12 = r12.intValue()
            int r12 = r12 + r6
            r9.getClass()
            r11.R = r2
            r11.X = r0
            r11.Y = r1
            r11.Z = r4
            r11.d0 = r7
            r11.e0 = r8
            r11.f0 = r9
            r11.g0 = r12
            r11.j0 = r6
            java.lang.Object r10 = r10.a(r11)
            if (r10 != r3) goto Lbf
            return r3
        Lbf:
            r16 = r11
            r11 = r0
            r0 = r10
            r10 = r12
            r12 = r16
        Lc6:
            qc1 r0 = (defpackage.qc1) r0
            r9.getClass()
            if (r0 == 0) goto Le7
            q42 r1 = new q42
            android.graphics.drawable.BitmapDrawable r2 = r0.a
            boolean r0 = r0.b
            zb1 r3 = r11.c
            b33 r4 = r11.a
            boolean r6 = r4 instanceof defpackage.xa2
            if (r6 == 0) goto Lde
            xa2 r4 = (defpackage.xa2) r4
            goto Ldf
        Lde:
            r4 = r5
        Ldf:
            if (r4 == 0) goto Le3
            java.lang.String r5 = r4.L
        Le3:
            r1.<init>(r2, r0, r3, r5)
            return r1
        Le7:
            r0 = r11
            r11 = r12
            goto L6b
        Lea:
            java.lang.String r0 = "Unable to create a decoder that supports: "
            defpackage.u34.i(r7, r0)
            return r5
    }

    public static final java.lang.Object b(defpackage.w42 r24, defpackage.z23 r25, java.lang.Object r26, defpackage.fo4 r27, defpackage.k62 r28, defpackage.s41 r29) {
            r0 = r24
            r1 = r29
            boolean r2 = r1 instanceof defpackage.s42
            if (r2 == 0) goto L18
            r2 = r1
            s42 r2 = (defpackage.s42) r2
            int r3 = r2.j0
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L18
            int r3 = r3 - r4
            r2.j0 = r3
        L16:
            r6 = r2
            goto L1e
        L18:
            s42 r2 = new s42
            r2.<init>(r0, r1)
            goto L16
        L1e:
            java.lang.Object r1 = r6.h0
            x61 r7 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r6.j0
            r8 = 3
            r9 = 2
            r3 = 1
            r10 = 0
            if (r2 == 0) goto L70
            if (r2 == r3) goto L51
            if (r2 == r9) goto L3b
            if (r2 != r8) goto L35
            defpackage.oi2.Y(r1)
            goto L196
        L35:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r10
        L3b:
            dh5 r2 = r6.d0
            java.lang.Object r0 = r6.Z
            dh5 r0 = (defpackage.dh5) r0
            java.lang.Object r3 = r6.Y
            k62 r3 = (defpackage.k62) r3
            z23 r4 = r6.X
            w42 r5 = r6.R
            defpackage.oi2.Y(r1)     // Catch: java.lang.Throwable -> L4e
            goto L110
        L4e:
            r0 = move-exception
            goto L1b5
        L51:
            dh5 r0 = r6.g0
            dh5 r2 = r6.f0
            dh5 r3 = r6.e0
            dh5 r4 = r6.d0
            java.lang.Object r5 = r6.Z
            k62 r5 = (defpackage.k62) r5
            java.lang.Object r11 = r6.Y
            z23 r12 = r6.X
            w42 r13 = r6.R
            defpackage.oi2.Y(r1)     // Catch: java.lang.Throwable -> L4e
            r17 = r3
            r20 = r4
            r21 = r5
            r19 = r11
            r15 = r13
            goto Ld4
        L70:
            defpackage.oi2.Y(r1)
            dh5 r11 = new dh5
            r11.<init>()
            r1 = r27
            r11.A = r1
            dh5 r12 = new dh5
            r12.<init>()
            pe5 r1 = r0.a
            uv0 r1 = r1.g
            r12.A = r1
            dh5 r13 = new dh5
            r13.<init>()
            ap3 r1 = r0.c     // Catch: java.lang.Throwable -> L1b3
            java.lang.Object r2 = r11.A     // Catch: java.lang.Throwable -> L1b3
            fo4 r2 = (defpackage.fo4) r2     // Catch: java.lang.Throwable -> L1b3
            fo4 r1 = r1.x(r2)     // Catch: java.lang.Throwable -> L1b3
            r11.A = r1     // Catch: java.lang.Throwable -> L1b3
            r25.getClass()     // Catch: java.lang.Throwable -> L1b3
            java.lang.Object r1 = r12.A     // Catch: java.lang.Throwable -> L1b3
            uv0 r1 = (defpackage.uv0) r1     // Catch: java.lang.Throwable -> L1b3
            java.lang.Object r2 = r11.A     // Catch: java.lang.Throwable -> L1b3
            r4 = r2
            fo4 r4 = (defpackage.fo4) r4     // Catch: java.lang.Throwable -> L1b3
            r6.R = r0     // Catch: java.lang.Throwable -> L1b3
            r2 = r25
            r6.X = r2     // Catch: java.lang.Throwable -> L1b3
            r5 = r26
            r6.Y = r5     // Catch: java.lang.Throwable -> L1b3
            r14 = r28
            r6.Z = r14     // Catch: java.lang.Throwable -> L1b3
            r6.d0 = r11     // Catch: java.lang.Throwable -> L1b3
            r6.e0 = r12     // Catch: java.lang.Throwable -> L1b3
            r6.f0 = r13     // Catch: java.lang.Throwable -> L1b3
            r6.g0 = r13     // Catch: java.lang.Throwable -> L1b3
            r6.j0 = r3     // Catch: java.lang.Throwable -> L1b3
            r3 = r5
            r5 = r14
            java.lang.Object r1 = r0.c(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L1b3
            if (r1 != r7) goto Lc6
            goto L195
        Lc6:
            r15 = r24
            r19 = r26
            r21 = r28
            r20 = r11
            r17 = r12
            r0 = r13
            r2 = r0
            r12 = r25
        Ld4:
            r0.A = r1     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r0 = r2.A     // Catch: java.lang.Throwable -> L4e
            r1 = r0
            ja2 r1 = (defpackage.ja2) r1     // Catch: java.lang.Throwable -> L4e
            boolean r3 = r1 instanceof defpackage.mn6     // Catch: java.lang.Throwable -> L4e
            if (r3 == 0) goto L11e
            n61 r0 = r12.u     // Catch: java.lang.Throwable -> L4e
            ja1 r14 = new ja1     // Catch: java.lang.Throwable -> L4e
            r22 = 0
            r23 = 3
            r16 = r2
            r18 = r12
            r14.<init>(r15, r16, r17, r18, r19, r20, r21, r22, r23)     // Catch: java.lang.Throwable -> L119
            r4 = r18
            r11 = r20
            r3 = r21
            r6.R = r15     // Catch: java.lang.Throwable -> L4e
            r6.X = r4     // Catch: java.lang.Throwable -> L4e
            r6.Y = r3     // Catch: java.lang.Throwable -> L4e
            r6.Z = r11     // Catch: java.lang.Throwable -> L4e
            r6.d0 = r2     // Catch: java.lang.Throwable -> L4e
            r6.e0 = r10     // Catch: java.lang.Throwable -> L4e
            r6.f0 = r10     // Catch: java.lang.Throwable -> L4e
            r6.g0 = r10     // Catch: java.lang.Throwable -> L4e
            r6.j0 = r9     // Catch: java.lang.Throwable -> L4e
            java.lang.Object r1 = defpackage.hv.d0(r0, r14, r6)     // Catch: java.lang.Throwable -> L4e
            if (r1 != r7) goto L10e
            goto L195
        L10e:
            r0 = r11
            r5 = r15
        L110:
            q42 r1 = (defpackage.q42) r1     // Catch: java.lang.Throwable -> L4e
            r11 = r0
            r17 = r5
        L115:
            r21 = r3
            r12 = r4
            goto L13d
        L119:
            r0 = move-exception
            r2 = r16
            goto L1b5
        L11e:
            r4 = r12
            r11 = r20
            r3 = r21
            boolean r1 = r1 instanceof defpackage.wo1     // Catch: java.lang.Throwable -> L4e
            if (r1 == 0) goto L1ad
            q42 r1 = new q42     // Catch: java.lang.Throwable -> L4e
            r5 = r0
            wo1 r5 = (defpackage.wo1) r5     // Catch: java.lang.Throwable -> L4e
            android.graphics.drawable.Drawable r5 = r5.a     // Catch: java.lang.Throwable -> L4e
            r9 = r0
            wo1 r9 = (defpackage.wo1) r9     // Catch: java.lang.Throwable -> L4e
            boolean r9 = r9.b     // Catch: java.lang.Throwable -> L4e
            wo1 r0 = (defpackage.wo1) r0     // Catch: java.lang.Throwable -> L4e
            zb1 r0 = r0.c     // Catch: java.lang.Throwable -> L4e
            r1.<init>(r5, r9, r0, r10)     // Catch: java.lang.Throwable -> L4e
            r17 = r15
            goto L115
        L13d:
            java.lang.Object r0 = r2.A
            boolean r2 = r0 instanceof defpackage.mn6
            if (r2 == 0) goto L146
            mn6 r0 = (defpackage.mn6) r0
            goto L147
        L146:
            r0 = r10
        L147:
            if (r0 == 0) goto L14e
            b33 r0 = r0.a
            defpackage.k.a(r0)
        L14e:
            java.lang.Object r0 = r11.A
            r19 = r0
            fo4 r19 = (defpackage.fo4) r19
            r6.R = r10
            r6.X = r10
            r6.Y = r10
            r6.Z = r10
            r6.d0 = r10
            r6.e0 = r10
            r6.f0 = r10
            r6.g0 = r10
            r6.j0 = r8
            r17.getClass()
            java.util.List r0 = r12.h
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L172
            goto L193
        L172:
            android.graphics.drawable.Drawable r2 = r1.a
            boolean r2 = r2 instanceof android.graphics.drawable.BitmapDrawable
            if (r2 != 0) goto L17d
            boolean r2 = r12.l
            if (r2 != 0) goto L17d
            goto L193
        L17d:
            n61 r2 = r12.v
            v42 r16 = new v42
            r23 = 0
            r20 = r0
            r18 = r1
            r22 = r12
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r0 = r16
            java.lang.Object r0 = defpackage.hv.d0(r2, r0, r6)
            r1 = r0
        L193:
            if (r1 != r7) goto L196
        L195:
            return r7
        L196:
            q42 r1 = (defpackage.q42) r1
            android.graphics.drawable.Drawable r0 = r1.a
            boolean r2 = r0 instanceof android.graphics.drawable.BitmapDrawable
            if (r2 == 0) goto L1a1
            r10 = r0
            android.graphics.drawable.BitmapDrawable r10 = (android.graphics.drawable.BitmapDrawable) r10
        L1a1:
            if (r10 == 0) goto L1ac
            android.graphics.Bitmap r0 = r10.getBitmap()
            if (r0 == 0) goto L1ac
            r0.prepareToDraw()
        L1ac:
            return r1
        L1ad:
            ug r0 = new ug     // Catch: java.lang.Throwable -> L4e
            r0.<init>()     // Catch: java.lang.Throwable -> L4e
            throw r0     // Catch: java.lang.Throwable -> L4e
        L1b3:
            r0 = move-exception
            r2 = r13
        L1b5:
            java.lang.Object r1 = r2.A
            boolean r2 = r1 instanceof defpackage.mn6
            if (r2 == 0) goto L1be
            r10 = r1
            mn6 r10 = (defpackage.mn6) r10
        L1be:
            if (r10 == 0) goto L1c5
            b33 r1 = r10.a
            defpackage.k.a(r1)
        L1c5:
            throw r0
    }

    public final java.lang.Object c(defpackage.uv0 r18, defpackage.z23 r19, java.lang.Object r20, defpackage.fo4 r21, defpackage.k62 r22, defpackage.s41 r23) {
            r17 = this;
            r0 = r23
            boolean r1 = r0 instanceof defpackage.t42
            if (r1 == 0) goto L17
            r1 = r0
            t42 r1 = (defpackage.t42) r1
            int r2 = r1.i0
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L17
            int r2 = r2 - r3
            r1.i0 = r2
            r2 = r17
            goto L1e
        L17:
            t42 r1 = new t42
            r2 = r17
            r1.<init>(r2, r0)
        L1e:
            java.lang.Object r0 = r1.g0
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            int r4 = r1.i0
            r5 = 0
            r6 = 1
            if (r4 == 0) goto L4e
            if (r4 != r6) goto L48
            int r2 = r1.f0
            k62 r4 = r1.e0
            fo4 r7 = r1.d0
            java.lang.Object r8 = r1.Z
            z23 r9 = r1.Y
            uv0 r10 = r1.X
            w42 r11 = r1.R
            defpackage.oi2.Y(r0)
            r23 = r8
            r8 = r4
            r4 = r23
            r23 = r5
            r5 = r1
            r1 = r9
            r9 = r2
            r2 = r11
            goto Lcd
        L48:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r5
        L4e:
            defpackage.oi2.Y(r0)
            r0 = 0
            r4 = r20
            r7 = r21
            r8 = r22
            r9 = r0
            r10 = r1
            r0 = r18
            r1 = r19
        L5e:
            pe5 r11 = r2.a
            java.util.List r12 = r0.d
            int r13 = r12.size()
        L66:
            if (r9 >= r13) goto L9a
            java.lang.Object r14 = r12.get(r9)
            vr4 r14 = (defpackage.vr4) r14
            java.lang.Object r15 = r14.A
            ka2 r15 = (defpackage.ka2) r15
            java.lang.Object r14 = r14.B
            java.lang.Class r14 = (java.lang.Class) r14
            r23 = r5
            java.lang.Class r5 = r4.getClass()
            boolean r5 = r14.isAssignableFrom(r5)
            if (r5 == 0) goto L95
            r15.getClass()
            la2 r5 = r15.a(r4, r7, r11)
            if (r5 == 0) goto L95
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            vr4 r11 = new vr4
            r11.<init>(r5, r9)
            goto L9e
        L95:
            int r9 = r9 + 1
            r5 = r23
            goto L66
        L9a:
            r23 = r5
            r11 = r23
        L9e:
            if (r11 == 0) goto Lee
            java.lang.Object r5 = r11.A
            la2 r5 = (defpackage.la2) r5
            java.lang.Object r9 = r11.B
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            int r9 = r9 + r6
            r8.getClass()
            r10.R = r2
            r10.X = r0
            r10.Y = r1
            r10.Z = r4
            r10.d0 = r7
            r10.e0 = r8
            r10.f0 = r9
            r10.i0 = r6
            java.lang.Object r5 = r5.a(r10)
            if (r5 != r3) goto Lc7
            return r3
        Lc7:
            r16 = r10
            r10 = r0
            r0 = r5
            r5 = r16
        Lcd:
            r11 = r0
            ja2 r11 = (defpackage.ja2) r11
            r8.getClass()     // Catch: java.lang.Throwable -> Ldb
            if (r11 == 0) goto Ld6
            return r11
        Ld6:
            r0 = r10
            r10 = r5
            r5 = r23
            goto L5e
        Ldb:
            r0 = move-exception
            boolean r1 = r11 instanceof defpackage.mn6
            if (r1 == 0) goto Le4
            r5 = r11
            mn6 r5 = (defpackage.mn6) r5
            goto Le6
        Le4:
            r5 = r23
        Le6:
            if (r5 == 0) goto Led
            b33 r1 = r5.a
            defpackage.k.a(r1)
        Led:
            throw r0
        Lee:
            java.lang.String r0 = "Unable to create a fetcher that supports: "
            defpackage.u34.i(r4, r0)
            return r23
    }

    public final java.lang.Object d(defpackage.re5 r18, defpackage.s41 r19) {
            r17 = this;
            r1 = r17
            r7 = r18
            r0 = r19
            s63 r2 = r1.d
            boolean r3 = r0 instanceof defpackage.u42
            if (r3 == 0) goto L1c
            r3 = r0
            u42 r3 = (defpackage.u42) r3
            int r4 = r3.d0
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            r6 = r4 & r5
            if (r6 == 0) goto L1c
            int r4 = r4 - r5
            r3.d0 = r4
        L1a:
            r10 = r3
            goto L22
        L1c:
            u42 r3 = new u42
            r3.<init>(r1, r0)
            goto L1a
        L22:
            java.lang.Object r0 = r10.Y
            x61 r11 = defpackage.x61.COROUTINE_SUSPENDED
            int r3 = r10.d0
            r4 = 0
            r12 = 1
            if (r3 == 0) goto L41
            if (r3 != r12) goto L3b
            re5 r1 = r10.X
            w42 r2 = r10.R
            defpackage.oi2.Y(r0)     // Catch: java.lang.Throwable -> L36
            return r0
        L36:
            r0 = move-exception
            r7 = r1
            r1 = r2
            goto Lca
        L3b:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r0)
            return r4
        L41:
            defpackage.oi2.Y(r0)
            java.lang.Object r0 = r7.X     // Catch: java.lang.Throwable -> Lc9
            z23 r0 = (defpackage.z23) r0     // Catch: java.lang.Throwable -> Lc9
            java.lang.Object r3 = r0.b     // Catch: java.lang.Throwable -> Lc9
            java.lang.Object r5 = r7.Y     // Catch: java.lang.Throwable -> Lc9
            wi6 r5 = (defpackage.wi6) r5     // Catch: java.lang.Throwable -> Lc9
            android.graphics.Bitmap$Config[] r6 = defpackage.k.a     // Catch: java.lang.Throwable -> Lc9
            java.lang.Object r6 = r7.Z     // Catch: java.lang.Throwable -> Lc9
            k62 r6 = (defpackage.k62) r6     // Catch: java.lang.Throwable -> Lc9
            ap3 r8 = r1.c     // Catch: java.lang.Throwable -> Lc9
            fo4 r8 = r8.v(r0, r5)     // Catch: java.lang.Throwable -> Lc9
            y56 r9 = r8.e     // Catch: java.lang.Throwable -> Lc9
            pe5 r13 = r1.a     // Catch: java.lang.Throwable -> Lc9
            uv0 r13 = r13.g     // Catch: java.lang.Throwable -> Lc9
            java.util.List r13 = r13.b     // Catch: java.lang.Throwable -> Lc9
            int r14 = r13.size()     // Catch: java.lang.Throwable -> Lc9
            r15 = 0
        L67:
            if (r15 >= r14) goto L94
            java.lang.Object r16 = r13.get(r15)     // Catch: java.lang.Throwable -> La0
            r4 = r16
            vr4 r4 = (defpackage.vr4) r4     // Catch: java.lang.Throwable -> La0
            java.lang.Object r12 = r4.A     // Catch: java.lang.Throwable -> La0
            s90 r12 = (defpackage.s90) r12     // Catch: java.lang.Throwable -> La0
            java.lang.Object r4 = r4.B     // Catch: java.lang.Throwable -> La0
            java.lang.Class r4 = (java.lang.Class) r4     // Catch: java.lang.Throwable -> La0
            java.lang.Class r1 = r3.getClass()     // Catch: java.lang.Throwable -> La0
            boolean r1 = r4.isAssignableFrom(r1)     // Catch: java.lang.Throwable -> La0
            if (r1 == 0) goto L8d
            r12.getClass()     // Catch: java.lang.Throwable -> La0
            java.lang.Object r1 = r12.a(r3, r8)     // Catch: java.lang.Throwable -> La0
            if (r1 == 0) goto L8d
            r3 = r1
        L8d:
            int r15 = r15 + 1
            r4 = 0
            r12 = 1
            r1 = r17
            goto L67
        L94:
            r1 = r6
            c44 r6 = r2.q(r0, r3, r8, r1)     // Catch: java.lang.Throwable -> La0
            if (r6 == 0) goto La4
            d44 r4 = r2.n(r0, r6, r5, r9)     // Catch: java.lang.Throwable -> La0
            goto La5
        La0:
            r0 = move-exception
            r1 = r17
            goto Lca
        La4:
            r4 = 0
        La5:
            if (r4 == 0) goto Lac
            bu6 r0 = defpackage.s63.u(r7, r0, r6, r4)     // Catch: java.lang.Throwable -> La0
            return r0
        Lac:
            n61 r12 = r0.t     // Catch: java.lang.Throwable -> La0
            r2 = r0
            ja1 r0 = new ja1     // Catch: java.lang.Throwable -> La0
            r4 = r8
            r8 = 0
            r9 = 4
            r5 = r1
            r1 = r17
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Throwable -> Lc9
            r10.R = r1     // Catch: java.lang.Throwable -> Lc9
            r10.X = r7     // Catch: java.lang.Throwable -> Lc9
            r2 = 1
            r10.d0 = r2     // Catch: java.lang.Throwable -> Lc9
            java.lang.Object r0 = defpackage.hv.d0(r12, r0, r10)     // Catch: java.lang.Throwable -> Lc9
            if (r0 != r11) goto Lc8
            return r11
        Lc8:
            return r0
        Lc9:
            r0 = move-exception
        Lca:
            boolean r2 = r0 instanceof java.util.concurrent.CancellationException
            if (r2 != 0) goto Ld9
            ap3 r1 = r1.c
            java.lang.Object r1 = r7.X
            z23 r1 = (defpackage.z23) r1
            b62 r0 = defpackage.ap3.r(r1, r0)
            return r0
        Ld9:
            throw r0
    }
}
