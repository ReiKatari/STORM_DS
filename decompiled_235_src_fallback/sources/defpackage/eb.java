package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eb  reason: default package */
/* loaded from: classes.dex */
public final class eb implements defpackage.mr6, defpackage.gz, defpackage.f13, defpackage.rm6, defpackage.ll7 {
    public final /* synthetic */ int A;
    public java.lang.Object B;
    public java.lang.Object L;
    public java.lang.Object R;
    public java.lang.Object X;

    public eb(int r3) {
            r2 = this;
            r2.A = r3
            r0 = 0
            switch(r3) {
                case 8: goto L91;
                case 9: goto L78;
                case 14: goto L6b;
                case 15: goto L4e;
                case 17: goto L2b;
                case 24: goto La;
                default: goto L6;
            }
        L6:
            r2.<init>()
            return
        La:
            r2.<init>()
            wu r3 = new wu
            r3.<init>(r0)
            r2.B = r3
            android.util.SparseArray r3 = new android.util.SparseArray
            r3.<init>()
            r2.L = r3
            hz3 r3 = new hz3
            r1 = 0
            r3.<init>(r1)
            r2.R = r3
            wu r3 = new wu
            r3.<init>(r0)
            r2.X = r3
            return
        L2b:
            r2.<init>()
            java.lang.Object r3 = new java.lang.Object
            r3.<init>()
            r2.B = r3
            java.util.concurrent.atomic.AtomicLong r3 = new java.util.concurrent.atomic.AtomicLong
            r0 = 1
            r3.<init>(r0)
            r2.L = r3
            uc5 r3 = defpackage.uc5.a
            tp6 r3 = defpackage.up6.a(r3)
            r2.R = r3
            de5 r0 = new de5
            r0.<init>(r3)
            r2.X = r0
            return
        L4e:
            r2.<init>()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.B = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.L = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.R = r3
            java.util.LinkedHashSet r3 = defpackage.am1.p
            r2.X = r3
            return
        L6b:
            r2.<init>()
            pj r3 = new pj
            r0 = 13
            r3.<init>(r2, r0)
            r2.R = r3
            return
        L78:
            r2.<init>()
            java.util.ArrayDeque r3 = new java.util.ArrayDeque
            r3.<init>()
            r2.L = r3
            java.util.ArrayDeque r3 = new java.util.ArrayDeque
            r3.<init>()
            r2.R = r3
            java.util.ArrayDeque r3 = new java.util.ArrayDeque
            r3.<init>()
            r2.X = r3
            return
        L91:
            r2.<init>()
            tz4 r3 = new tz4
            r1 = 10
            r3.<init>(r1)
            r2.B = r3
            ci6 r3 = new ci6
            r3.<init>(r0)
            r2.L = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.R = r3
            java.util.HashSet r3 = new java.util.HashSet
            r3.<init>()
            r2.X = r3
            return
    }

    public eb(long r2, long r4, long r6) {
            r1 = this;
            r0 = 22
            r1.A = r0
            r1.<init>()
            xi6 r0 = new xi6
            r0.<init>(r2)
            vs4 r2 = defpackage.np2.Y(r0)
            r1.B = r2
            jk4 r2 = new jk4
            r2.<init>(r4)
            vs4 r2 = defpackage.np2.Y(r2)
            r1.L = r2
            jk4 r2 = new jk4
            r2.<init>(r6)
            vs4 r2 = defpackage.np2.Y(r2)
            r1.R = r2
            jk4 r2 = new jk4
            r2.<init>(r4)
            vs4 r2 = defpackage.np2.Y(r2)
            r1.X = r2
            return
    }

    public eb(android.content.Context r2, android.view.ActionMode.Callback r3) {
            r1 = this;
            r0 = 21
            r1.A = r0
            r1.<init>()
            r1.L = r2
            r1.B = r3
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r1.R = r2
            ci6 r2 = new ci6
            r3 = 0
            r2.<init>(r3)
            r1.X = r2
            return
    }

    public eb(android.graphics.Typeface r8, defpackage.q54 r9) {
            r7 = this;
            r0 = 12
            r7.A = r0
            r7.<init>()
            r7.X = r8
            r7.B = r9
            r54 r8 = new r54
            r0 = 1024(0x400, float:1.435E-42)
            r8.<init>(r0)
            r7.R = r8
            r8 = 6
            int r0 = r9.a(r8)
            r1 = 0
            if (r0 == 0) goto L31
            int r2 = r9.A
            int r0 = r0 + r2
            java.lang.Object r2 = r9.R
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            int r2 = r2.getInt(r0)
            int r2 = r2 + r0
            java.lang.Object r0 = r9.R
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r0 = r0.getInt(r2)
            goto L32
        L31:
            r0 = r1
        L32:
            int r0 = r0 * 2
            char[] r0 = new char[r0]
            r7.L = r0
            int r8 = r9.a(r8)
            if (r8 == 0) goto L53
            int r0 = r9.A
            int r8 = r8 + r0
            java.lang.Object r0 = r9.R
            java.nio.ByteBuffer r0 = (java.nio.ByteBuffer) r0
            int r0 = r0.getInt(r8)
            int r0 = r0 + r8
            java.lang.Object r8 = r9.R
            java.nio.ByteBuffer r8 = (java.nio.ByteBuffer) r8
            int r8 = r8.getInt(r0)
            goto L54
        L53:
            r8 = r1
        L54:
            r9 = r1
        L55:
            if (r9 >= r8) goto Ld5
            re7 r0 = new re7
            r0.<init>(r7, r9)
            p54 r2 = r0.b()
            r3 = 4
            int r3 = r2.a(r3)
            if (r3 == 0) goto L73
            java.lang.Object r4 = r2.R
            java.nio.ByteBuffer r4 = (java.nio.ByteBuffer) r4
            int r2 = r2.A
            int r3 = r3 + r2
            int r2 = r4.getInt(r3)
            goto L74
        L73:
            r2 = r1
        L74:
            java.lang.Object r3 = r7.L
            char[] r3 = (char[]) r3
            int r4 = r9 * 2
            java.lang.Character.toChars(r2, r3, r4)
            p54 r2 = r0.b()
            r3 = 16
            int r4 = r2.a(r3)
            if (r4 == 0) goto L9e
            int r5 = r2.A
            int r4 = r4 + r5
            java.lang.Object r5 = r2.R
            java.nio.ByteBuffer r5 = (java.nio.ByteBuffer) r5
            int r5 = r5.getInt(r4)
            int r5 = r5 + r4
            java.lang.Object r2 = r2.R
            java.nio.ByteBuffer r2 = (java.nio.ByteBuffer) r2
            int r2 = r2.getInt(r5)
            goto L9f
        L9e:
            r2 = r1
        L9f:
            r4 = 1
            if (r2 <= 0) goto La4
            r2 = r4
            goto La5
        La4:
            r2 = r1
        La5:
            java.lang.String r5 = "invalid metadata codepoint length"
            defpackage.np2.s(r5, r2)
            java.lang.Object r2 = r7.R
            r54 r2 = (defpackage.r54) r2
            p54 r5 = r0.b()
            int r3 = r5.a(r3)
            if (r3 == 0) goto Lcd
            int r6 = r5.A
            int r3 = r3 + r6
            java.lang.Object r6 = r5.R
            java.nio.ByteBuffer r6 = (java.nio.ByteBuffer) r6
            int r6 = r6.getInt(r3)
            int r6 = r6 + r3
            java.lang.Object r3 = r5.R
            java.nio.ByteBuffer r3 = (java.nio.ByteBuffer) r3
            int r3 = r3.getInt(r6)
            goto Lce
        Lcd:
            r3 = r1
        Lce:
            int r3 = r3 - r4
            r2.a(r0, r1, r3)
            int r9 = r9 + 1
            goto L55
        Ld5:
            return
    }

    public eb(defpackage.ap7 r2, defpackage.yo7 r3, defpackage.j71 r4) {
            r1 = this;
            r0 = 27
            r1.A = r0
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r1.<init>()
            r1.B = r2
            r1.L = r3
            r1.R = r4
            x31 r2 = new x31
            r3 = 26
            r2.<init>(r3)
            r1.X = r2
            return
    }

    public eb(defpackage.d14 r1, defpackage.ng3 r2, defpackage.sn6 r3, java.util.Map r4, defpackage.xd5 r5) {
            r0 = this;
            r5 = 11
            r0.A = r5
            r0.<init>()
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.X = r4
            return
    }

    public eb(defpackage.d51 r2, defpackage.rr6 r3) {
            r1 = this;
            r0 = 23
            r1.A = r0
            r2.getClass()
            r1.<init>()
            r1.B = r2
            r1.L = r3
            java.lang.Object r2 = new java.lang.Object
            r2.<init>()
            r1.R = r2
            java.util.LinkedHashMap r2 = new java.util.LinkedHashMap
            r2.<init>()
            r1.X = r2
            return
    }

    public eb(defpackage.e23 r19, android.util.Size r20, android.hardware.camera2.CameraCharacteristics r21, boolean r22) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = 10
            r0.A = r2
            r0.<init>()
            defpackage.nj2.h()
            r0.B = r1
            xx r3 = defpackage.zi7.J
            r8 = 0
            java.lang.Object r3 = r1.b(r3, r8)
            vi0 r3 = (defpackage.vi0) r3
            if (r3 == 0) goto L1e8
            dk0 r4 = new dk0
            r9 = 0
            r4.<init>(r9)
            r3.a(r1, r4)
            r4.i()
            bt r10 = new bt
            r10.<init>(r2, r9)
            r0.L = r10
            ci r11 = new ci
            ec3 r2 = defpackage.u24.u()
            xx r3 = defpackage.dc3.y
            java.lang.Object r2 = r1.b(r3, r2)
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            java.util.Objects.requireNonNull(r2)
            r3 = r21
            r11.<init>(r2, r3)
            r0.R = r11
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            xx r2 = defpackage.j23.m
            java.lang.Integer r3 = java.lang.Integer.valueOf(r9)
            java.lang.Object r2 = r1.b(r2, r3)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r2 = r2.intValue()
            r12 = 256(0x100, float:3.59E-43)
            r13 = 32
            if (r2 == 0) goto L70
            java.lang.Integer r2 = java.lang.Integer.valueOf(r13)
            r4.add(r2)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            r4.add(r2)
            goto La5
        L70:
            xx r2 = defpackage.e23.R
            java.lang.Object r2 = r1.b(r2, r8)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L7f
            int r2 = r2.intValue()
            goto L9e
        L7f:
            xx r2 = defpackage.j23.l
            java.lang.Object r2 = r1.b(r2, r8)
            java.lang.Integer r2 = (java.lang.Integer) r2
            if (r2 == 0) goto L93
            int r3 = r2.intValue()
            r5 = 4101(0x1005, float:5.747E-42)
            if (r3 != r5) goto L93
            r2 = r5
            goto L9e
        L93:
            if (r2 == 0) goto L9d
            int r2 = r2.intValue()
            if (r2 != r13) goto L9d
            r2 = r13
            goto L9e
        L9d:
            r2 = r12
        L9e:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r4.add(r2)
        La5:
            int r3 = r1.q()
            xx r2 = defpackage.e23.Y
            java.lang.Object r1 = r1.b(r2, r8)
            if (r1 != 0) goto L1e4
            vx r1 = new vx
            jr1 r6 = new jr1
            r6.<init>()
            jr1 r7 = new jr1
            r7.<init>()
            r2 = r20
            r5 = r22
            r1.<init>(r2, r3, r4, r5, r6, r7)
            r0.X = r1
            java.lang.Object r0 = r10.R
            vx r0 = (defpackage.vx) r0
            r5 = 1
            if (r0 != 0) goto Ld5
            java.lang.Object r0 = r10.B
            re5 r0 = (defpackage.re5) r0
            if (r0 != 0) goto Ld5
            r0 = r5
            goto Ld6
        Ld5:
            r0 = r9
        Ld6:
            java.lang.String r14 = "CaptureNode does not support recreation yet."
            defpackage.np2.A(r14, r0)
            r10.R = r1
            jk0 r0 = new jk0
            r0.<init>()
            int r4 = r4.size()
            if (r4 <= r5) goto Lea
            r4 = r5
            goto Leb
        Lea:
            r4 = r9
        Leb:
            r14 = 2
            r15 = 4
            if (r22 != 0) goto L151
            if (r4 == 0) goto L126
            o54 r8 = new o54
            r18 = r5
            int r5 = r2.getWidth()
            r16 = r9
            int r9 = r2.getHeight()
            r8.<init>(r5, r9, r12, r15)
            be0[] r5 = new defpackage.be0[r14]
            r5[r16] = r0
            ce0 r9 = r8.B
            r5[r18] = r9
            defpackage.vy7.Y(r5)
            o54 r5 = new o54
            int r9 = r2.getWidth()
            int r12 = r2.getHeight()
            r5.<init>(r9, r12, r13, r15)
            be0[] r9 = new defpackage.be0[r14]
            r9[r16] = r0
            ce0 r0 = r5.B
            r9[r18] = r0
            defpackage.vy7.Y(r9)
            goto L147
        L126:
            r18 = r5
            r16 = r9
            o54 r5 = new o54
            int r9 = r2.getWidth()
            int r12 = r2.getHeight()
            r5.<init>(r9, r12, r3, r15)
            be0[] r9 = new defpackage.be0[r14]
            r9[r16] = r0
            ce0 r0 = r5.B
            r9[r18] = r0
            defpackage.vy7.Y(r9)
            r17 = r8
            r8 = r5
            r5 = r17
        L147:
            hk0 r0 = new hk0
            r9 = r16
            r0.<init>(r10, r9)
            r12 = r18
            goto L173
        L151:
            r18 = r5
            s63 r0 = new s63
            int r5 = r2.getWidth()
            int r12 = r2.getHeight()
            ci r5 = defpackage.ln2.l(r5, r12, r3, r15)
            r12 = 21
            r0.<init>(r5, r12)
            hk0 r5 = new hk0
            r12 = r18
            r5.<init>(r10, r12)
            r17 = r8
            r8 = r0
            r0 = r5
            r5 = r17
        L173:
            android.view.Surface r13 = r8.getSurface()
            java.util.Objects.requireNonNull(r13)
            o33 r15 = r1.a
            if (r15 != 0) goto L180
            r15 = r12
            goto L181
        L180:
            r15 = r9
        L181:
            java.lang.String r9 = "The surface is already set."
            defpackage.np2.A(r9, r15)
            o33 r9 = new o33
            r9.<init>(r13, r2, r3)
            r1.a = r9
            re5 r9 = new re5
            r9.<init>(r8)
            r10.B = r9
            i r9 = new i
            r9.<init>(r10)
            ov2 r13 = defpackage.u24.x()
            r8.e(r9, r13)
            if (r4 == 0) goto L1ce
            if (r5 == 0) goto L1ce
            android.view.Surface r4 = r5.getSurface()
            o33 r8 = r1.b
            if (r8 != 0) goto L1ae
            r9 = r12
            goto L1af
        L1ae:
            r9 = 0
        L1af:
            java.lang.String r8 = "The secondary surface is already set."
            defpackage.np2.A(r8, r9)
            o33 r8 = new o33
            r8.<init>(r4, r2, r3)
            r1.b = r8
            re5 r1 = new re5
            r1.<init>(r5)
            r10.L = r1
            i r1 = new i
            r1.<init>(r10)
            ov2 r2 = defpackage.u24.x()
            r5.e(r1, r2)
        L1ce:
            r6.b = r0
            hk0 r0 = new hk0
            r0.<init>(r10, r14)
            r7.b = r0
            java.lang.Object r0 = r11.R
            y65 r0 = (defpackage.y65) r0
            java.lang.Class<androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk> r1 = androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk.class
            u65 r0 = r0.b(r1)
            androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk r0 = (androidx.camera.core.internal.compat.quirk.IncorrectJpegMetadataQuirk) r0
            return
        L1e4:
            defpackage.u34.a()
            throw r8
        L1e8:
            java.lang.String r0 = r1.toString()
            xx r2 = defpackage.kz6.C
            java.lang.Object r0 = r1.b(r2, r0)
            java.lang.String r0 = (java.lang.String) r0
            java.lang.String r1 = "Implementation is missing option unpacker for "
            defpackage.e41.z(r0, r1)
            throw r8
    }

    public eb(defpackage.eb r5) {
            r4 = this;
            r0 = 16
            r4.A = r0
            r4.<init>()
            java.lang.Object r0 = r5.B
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r1 = r5.X
            java.util.LinkedHashSet r1 = (java.util.LinkedHashSet) r1
            java.util.LinkedHashSet r2 = defpackage.am1.p
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r2.addAll(r0)
            java.util.Iterator r0 = r1.iterator()
        L1d:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L33
            java.lang.Object r1 = r0.next()
            java.lang.Class r1 = (java.lang.Class) r1
            java.util.Map r3 = defpackage.am1.q
            java.lang.Object r1 = r3.get(r1)
            r2.add(r1)
            goto L1d
        L33:
            r4.B = r2
            q61 r0 = new q61
            r0.<init>()
            r4.R = r0
            java.lang.Object r0 = r5.R
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            r4.X = r0
            java.lang.Object r5 = r5.L
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            r4.L = r5
            yc1 r4 = new yc1
            java.util.Map r0 = java.util.Collections.EMPTY_MAP
            r4.<init>(r5, r0)
            v53 r5 = new v53
            r5.<init>(r4)
            return
    }

    public eb(defpackage.gb r2) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.X = r2
            return
    }

    public eb(defpackage.gg3 r2) {
            r1 = this;
            r0 = 18
            r1.A = r0
            r1.<init>()
            java.lang.String r0 = ""
            r1.R = r0
            r1.X = r0
            r1.B = r2
            wb6 r2 = r2.e()
            java.lang.String r2 = r2.a()
            r1.L = r2
            return
    }

    public eb(defpackage.h61 r2) {
            r1 = this;
            r0 = 13
            r1.A = r0
            r1.<init>()
            r1.B = r2
            md4 r2 = new md4
            r2.<init>()
            r1.L = r2
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            r1.R = r2
            java.util.LinkedHashSet r2 = new java.util.LinkedHashSet
            r2.<init>()
            r1.X = r2
            return
    }

    public /* synthetic */ eb(java.lang.Object r1, int r2) {
            r0 = this;
            r0.A = r2
            r0.B = r1
            r0.<init>()
            return
    }

    public /* synthetic */ eb(java.lang.Object r1, java.lang.Object r2, java.lang.Object r3, java.lang.Object r4, int r5) {
            r0 = this;
            r0.A = r5
            r0.B = r1
            r0.L = r2
            r0.R = r3
            r0.X = r4
            r0.<init>()
            return
    }

    public eb(java.net.Socket r2) {
            r1 = this;
            r0 = 7
            r1.A = r0
            r1.<init>()
            r1.B = r2
            java.util.concurrent.atomic.AtomicInteger r2 = new java.util.concurrent.atomic.AtomicInteger
            r2.<init>()
            r1.L = r2
            ef1 r2 = new ef1
            r2.<init>(r1)
            r1.R = r2
            df1 r2 = new df1
            r2.<init>(r1)
            r1.X = r2
            return
    }

    public eb(defpackage.kh0 r2, defpackage.ze0 r3, defpackage.aj0 r4, defpackage.rr6 r5) {
            r1 = this;
            r0 = 4
            r1.A = r0
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r5.getClass()
            r1.<init>()
            r1.B = r2
            r1.L = r3
            r1.R = r4
            r1.X = r5
            return
    }

    public eb(defpackage.n55 r2, defpackage.t57 r3, defpackage.rc3 r4) {
            r1 = this;
            r0 = 3
            r1.A = r0
            r2.getClass()
            r3.getClass()
            r4.getClass()
            r1.<init>()
            r1.B = r2
            r1.L = r3
            r1.R = r4
            z r2 = new z
            r3 = 0
            r4 = 10
            r2.<init>(r1, r3, r4)
            pb0 r2 = defpackage.f04.p(r2)
            r1.X = r2
            return
    }

    public eb(defpackage.te r2, defpackage.mz r3) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r1.B = r2
            r1.L = r3
            android.content.Context r3 = r2.getContext()
            java.lang.Class r0 = defpackage.k2.l()
            java.lang.Object r3 = r3.getSystemService(r0)
            android.view.autofill.AutofillManager r3 = defpackage.k2.i(r3)
            r0 = 0
            if (r3 == 0) goto L3a
            r1.R = r3
            defpackage.k2.m(r2)
            u2 r2 = defpackage.hi2.z(r2)
            if (r2 == 0) goto L2e
            java.lang.Object r2 = r2.b
            android.view.autofill.AutofillId r0 = defpackage.au.b(r2)
        L2e:
            if (r0 == 0) goto L33
            r1.X = r0
            return
        L33:
            java.lang.String r1 = "Required value was null."
            ug r1 = defpackage.i61.e(r1)
            throw r1
        L3a:
            java.lang.String r1 = "Autofill service could not be located."
            defpackage.i.m(r1)
            throw r0
    }

    public eb(defpackage.xd2 r4) {
            r3 = this;
            r0 = 25
            r3.A = r0
            j97 r1 = new j97
            r2 = 7
            r1.<init>(r4, r2)
            r3.<init>(r1, r0)
            return
    }

    public eb(defpackage.xk4 r2, defpackage.xp2 r3, defpackage.xp2 r4, defpackage.xp2 r5) {
            r1 = this;
            r0 = 6
            r1.A = r0
            r2.getClass()
            r1.<init>()
            r1.B = r2
            r1.L = r3
            r1.R = r4
            r1.X = r5
            return
    }

    public static void L(defpackage.eb r8, defpackage.ge5 r9, defpackage.je5 r10, defpackage.ge5 r11, int r12) {
            r0 = r12 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r9 = r1
        L6:
            r0 = r12 & 2
            if (r0 == 0) goto Lb
            r10 = r1
        Lb:
            r12 = r12 & 4
            if (r12 == 0) goto L10
            r11 = r1
        L10:
            r8.getClass()
            java.util.TimeZone r12 = defpackage.az7.a
            java.util.concurrent.ExecutorService r12 = r8.A()
            java.util.concurrent.ThreadPoolExecutor r12 = (java.util.concurrent.ThreadPoolExecutor) r12
            boolean r12 = r12.isShutdown()
            monitor-enter(r8)
            if (r10 == 0) goto L38
            java.lang.Object r0 = r8.X     // Catch: java.lang.Throwable -> L35
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch: java.lang.Throwable -> L35
            boolean r0 = r0.remove(r10)     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L2d
            goto L38
        L2d:
            java.lang.String r9 = "Call wasn't in-flight!"
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L35
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L35
            throw r10     // Catch: java.lang.Throwable -> L35
        L35:
            r9 = move-exception
            goto L168
        L38:
            if (r11 == 0) goto L52
            java.util.concurrent.atomic.AtomicInteger r0 = r11.B     // Catch: java.lang.Throwable -> L35
            r0.decrementAndGet()     // Catch: java.lang.Throwable -> L35
            java.lang.Object r0 = r8.R     // Catch: java.lang.Throwable -> L35
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch: java.lang.Throwable -> L35
            boolean r0 = r0.remove(r11)     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L4a
            goto L52
        L4a:
            java.lang.String r9 = "Call wasn't in-flight!"
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L35
            r10.<init>(r9)     // Catch: java.lang.Throwable -> L35
            throw r10     // Catch: java.lang.Throwable -> L35
        L52:
            if (r9 == 0) goto L73
            java.lang.Object r0 = r8.L     // Catch: java.lang.Throwable -> L35
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch: java.lang.Throwable -> L35
            r0.add(r9)     // Catch: java.lang.Throwable -> L35
            je5 r0 = r9.L     // Catch: java.lang.Throwable -> L35
            boolean r2 = r0.L     // Catch: java.lang.Throwable -> L35
            if (r2 != 0) goto L73
            pa r0 = r0.B     // Catch: java.lang.Throwable -> L35
            java.lang.Object r0 = r0.B     // Catch: java.lang.Throwable -> L35
            i03 r0 = (defpackage.i03) r0     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = r0.d     // Catch: java.lang.Throwable -> L35
            ge5 r0 = r8.B(r0)     // Catch: java.lang.Throwable -> L35
            if (r0 == 0) goto L73
            java.util.concurrent.atomic.AtomicInteger r0 = r0.B     // Catch: java.lang.Throwable -> L35
            r9.B = r0     // Catch: java.lang.Throwable -> L35
        L73:
            if (r10 != 0) goto L77
            if (r11 == 0) goto L8a
        L77:
            if (r12 != 0) goto L83
            java.lang.Object r10 = r8.R     // Catch: java.lang.Throwable -> L35
            java.util.ArrayDeque r10 = (java.util.ArrayDeque) r10     // Catch: java.lang.Throwable -> L35
            boolean r10 = r10.isEmpty()     // Catch: java.lang.Throwable -> L35
            if (r10 == 0) goto L8a
        L83:
            java.lang.Object r10 = r8.X     // Catch: java.lang.Throwable -> L35
            java.util.ArrayDeque r10 = (java.util.ArrayDeque) r10     // Catch: java.lang.Throwable -> L35
            r10.isEmpty()     // Catch: java.lang.Throwable -> L35
        L8a:
            r10 = 9
            if (r12 == 0) goto La3
            java.lang.Object r11 = r8.L     // Catch: java.lang.Throwable -> L35
            java.util.ArrayDeque r11 = (java.util.ArrayDeque) r11     // Catch: java.lang.Throwable -> L35
            java.util.List r11 = defpackage.gt0.k1(r11)     // Catch: java.lang.Throwable -> L35
            java.lang.Object r0 = r8.L     // Catch: java.lang.Throwable -> L35
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch: java.lang.Throwable -> L35
            r0.clear()     // Catch: java.lang.Throwable -> L35
            d51 r0 = new d51     // Catch: java.lang.Throwable -> L35
            r0.<init>(r11, r10)     // Catch: java.lang.Throwable -> L35
            goto Lec
        La3:
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L35
            r11.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.Object r0 = r8.L     // Catch: java.lang.Throwable -> L35
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0     // Catch: java.lang.Throwable -> L35
            java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> L35
            r0.getClass()     // Catch: java.lang.Throwable -> L35
        Lb3:
            boolean r2 = r0.hasNext()     // Catch: java.lang.Throwable -> L35
            if (r2 == 0) goto Le7
            java.lang.Object r2 = r0.next()     // Catch: java.lang.Throwable -> L35
            ge5 r2 = (defpackage.ge5) r2     // Catch: java.lang.Throwable -> L35
            java.lang.Object r3 = r8.R     // Catch: java.lang.Throwable -> L35
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3     // Catch: java.lang.Throwable -> L35
            int r3 = r3.size()     // Catch: java.lang.Throwable -> L35
            r4 = 64
            if (r3 >= r4) goto Le7
            java.util.concurrent.atomic.AtomicInteger r3 = r2.B     // Catch: java.lang.Throwable -> L35
            int r3 = r3.get()     // Catch: java.lang.Throwable -> L35
            r4 = 5
            if (r3 >= r4) goto Lb3
            r0.remove()     // Catch: java.lang.Throwable -> L35
            java.util.concurrent.atomic.AtomicInteger r3 = r2.B     // Catch: java.lang.Throwable -> L35
            r3.incrementAndGet()     // Catch: java.lang.Throwable -> L35
            r11.add(r2)     // Catch: java.lang.Throwable -> L35
            java.lang.Object r3 = r8.R     // Catch: java.lang.Throwable -> L35
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3     // Catch: java.lang.Throwable -> L35
            r3.add(r2)     // Catch: java.lang.Throwable -> L35
            goto Lb3
        Le7:
            d51 r0 = new d51     // Catch: java.lang.Throwable -> L35
            r0.<init>(r11, r10)     // Catch: java.lang.Throwable -> L35
        Lec:
            monitor-exit(r8)
            java.lang.Object r10 = r0.B
            java.util.List r10 = (java.util.List) r10
            int r10 = r10.size()
            r11 = 0
        Lf6:
            if (r11 >= r10) goto L167
            java.lang.Object r2 = r0.B
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r2 = r2.get(r11)
            ge5 r2 = (defpackage.ge5) r2
            if (r2 != r9) goto L105
            goto L107
        L105:
            je5 r3 = r2.L
        L107:
            if (r12 == 0) goto L121
            r2.getClass()
            java.io.InterruptedIOException r3 = new java.io.InterruptedIOException
            java.lang.String r4 = "executor rejected"
            r3.<init>(r4)
            r3.initCause(r1)
            je5 r4 = r2.L
            r4.j(r3)
            nb0 r2 = r2.A
            r2.k(r4, r3)
            goto L159
        L121:
            java.util.concurrent.ExecutorService r3 = r8.A()
            r2.getClass()
            je5 r4 = r2.L
            xk4 r5 = r4.A
            eb r5 = r5.a
            r5.getClass()
            r5 = 3
            java.util.concurrent.ThreadPoolExecutor r3 = (java.util.concurrent.ThreadPoolExecutor) r3     // Catch: java.lang.Throwable -> L138 java.util.concurrent.RejectedExecutionException -> L13a
            r3.execute(r2)     // Catch: java.lang.Throwable -> L138 java.util.concurrent.RejectedExecutionException -> L13a
            goto L159
        L138:
            r8 = move-exception
            goto L15c
        L13a:
            r3 = move-exception
            java.io.InterruptedIOException r6 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L138
            java.lang.String r7 = "executor rejected"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L138
            r6.initCause(r3)     // Catch: java.lang.Throwable -> L138
            je5 r3 = r2.L     // Catch: java.lang.Throwable -> L138
            r3.j(r6)     // Catch: java.lang.Throwable -> L138
            nb0 r7 = r2.A     // Catch: java.lang.Throwable -> L138
            r7.k(r3, r6)     // Catch: java.lang.Throwable -> L138
            xk4 r3 = r4.A
            eb r3 = r3.a
            r3.getClass()
            L(r3, r1, r1, r2, r5)
        L159:
            int r11 = r11 + 1
            goto Lf6
        L15c:
            xk4 r9 = r4.A
            eb r9 = r9.a
            r9.getClass()
            L(r9, r1, r1, r2, r5)
            throw r8
        L167:
            return
        L168:
            monitor-exit(r8)
            throw r9
    }

    public static void e(defpackage.eb r2, defpackage.jd4 r3) {
            r2.getClass()
            r3.getClass()
            java.lang.Object r0 = r2.R
            java.util.LinkedHashSet r0 = (java.util.LinkedHashSet) r0
            boolean r0 = r0.add(r3)
            if (r0 == 0) goto L2d
            java.lang.Object r0 = r2.L
            md4 r0 = (defpackage.md4) r0
            r0.getClass()
            eb r1 = r3.c
            if (r1 != 0) goto L26
            pu r1 = r0.e
            r1.addFirst(r3)
            r3.c = r2
            r0.b()
            return
        L26:
            java.lang.String r2 = "Handler '"
            java.lang.String r0 = "' is already registered with a dispatcher"
            defpackage.u34.A(r3, r0, r2)
        L2d:
            return
    }

    public synchronized java.util.concurrent.ExecutorService A() {
            r9 = this;
            monitor-enter(r9)
            java.lang.Object r0 = r9.B     // Catch: java.lang.Throwable -> L35
            java.util.concurrent.ThreadPoolExecutor r0 = (java.util.concurrent.ThreadPoolExecutor) r0     // Catch: java.lang.Throwable -> L35
            if (r0 != 0) goto L37
            java.util.concurrent.ThreadPoolExecutor r1 = new java.util.concurrent.ThreadPoolExecutor     // Catch: java.lang.Throwable -> L35
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L35
            java.util.concurrent.SynchronousQueue r7 = new java.util.concurrent.SynchronousQueue     // Catch: java.lang.Throwable -> L35
            r7.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L35
            r0.<init>()     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = defpackage.az7.b     // Catch: java.lang.Throwable -> L35
            r0.append(r2)     // Catch: java.lang.Throwable -> L35
            java.lang.String r2 = " Dispatcher"
            r0.append(r2)     // Catch: java.lang.Throwable -> L35
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L35
            zy7 r8 = new zy7     // Catch: java.lang.Throwable -> L35
            r2 = 0
            r8.<init>(r0, r2)     // Catch: java.lang.Throwable -> L35
            r2 = 0
            r3 = 2147483647(0x7fffffff, float:NaN)
            r4 = 60
            r1.<init>(r2, r3, r4, r6, r7, r8)     // Catch: java.lang.Throwable -> L35
            r9.B = r1     // Catch: java.lang.Throwable -> L35
            goto L37
        L35:
            r0 = move-exception
            goto L40
        L37:
            java.lang.Object r0 = r9.B     // Catch: java.lang.Throwable -> L35
            java.util.concurrent.ThreadPoolExecutor r0 = (java.util.concurrent.ThreadPoolExecutor) r0     // Catch: java.lang.Throwable -> L35
            r0.getClass()     // Catch: java.lang.Throwable -> L35
            monitor-exit(r9)
            return r0
        L40:
            monitor-exit(r9)     // Catch: java.lang.Throwable -> L35
            throw r0
    }

    public defpackage.ge5 B(java.lang.String r4) {
            r3 = this;
            java.lang.Object r0 = r3.R
            java.util.ArrayDeque r0 = (java.util.ArrayDeque) r0
            java.util.Iterator r0 = r0.iterator()
            r0.getClass()
        Lb:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L28
            java.lang.Object r1 = r0.next()
            ge5 r1 = (defpackage.ge5) r1
            je5 r2 = r1.L
            pa r2 = r2.B
            java.lang.Object r2 = r2.B
            i03 r2 = (defpackage.i03) r2
            java.lang.String r2 = r2.d
            boolean r2 = defpackage.nb3.k(r2, r4)
            if (r2 == 0) goto Lb
            return r1
        L28:
            java.lang.Object r3 = r3.L
            java.util.ArrayDeque r3 = (java.util.ArrayDeque) r3
            java.util.Iterator r3 = r3.iterator()
            r3.getClass()
        L33:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L50
            java.lang.Object r0 = r3.next()
            ge5 r0 = (defpackage.ge5) r0
            je5 r1 = r0.L
            pa r1 = r1.B
            java.lang.Object r1 = r1.B
            i03 r1 = (defpackage.i03) r1
            java.lang.String r1 = r1.d
            boolean r1 = defpackage.nb3.k(r1, r4)
            if (r1 == 0) goto L33
            return r0
        L50:
            r3 = 0
            return r3
    }

    public defpackage.hu6 C(defpackage.k8 r6) {
            r5 = this;
            java.lang.Object r0 = r5.R
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            r2 = 0
        L9:
            if (r2 >= r1) goto L1b
            java.lang.Object r3 = r0.get(r2)
            hu6 r3 = (defpackage.hu6) r3
            if (r3 == 0) goto L18
            k8 r4 = r3.b
            if (r4 != r6) goto L18
            return r3
        L18:
            int r2 = r2 + 1
            goto L9
        L1b:
            hu6 r1 = new hu6
            java.lang.Object r5 = r5.L
            android.content.Context r5 = (android.content.Context) r5
            r1.<init>(r5, r6)
            r0.add(r1)
            return r1
    }

    public defpackage.w61 D() {
            r0 = this;
            java.lang.Object r0 = r0.R
            on2 r0 = (defpackage.on2) r0
            java.lang.Object r0 = r0.c()
            w61 r0 = (defpackage.w61) r0
            if (r0 == 0) goto Ld
            return r0
        Ld:
            java.lang.String r0 = "in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first."
            defpackage.i.m(r0)
            r0 = 0
            return r0
    }

    public defpackage.ap E(defpackage.ap r19, defpackage.ap r20) {
            r18 = this;
            r0 = r18
            java.lang.Object r1 = r0.X
            ap r1 = (defpackage.ap) r1
            if (r1 != 0) goto Le
            ap r1 = r19.c()
            r0.X = r1
        Le:
            java.lang.Object r1 = r0.X
            ap r1 = (defpackage.ap) r1
            java.lang.String r3 = "targetVector"
            if (r1 == 0) goto L71
            int r1 = r1.b()
            r4 = 0
        L1b:
            java.lang.Object r5 = r0.X
            ap r5 = (defpackage.ap) r5
            if (r4 >= r1) goto L68
            if (r5 == 0) goto L62
            java.lang.Object r6 = r0.B
            s35 r6 = (defpackage.s35) r6
            r7 = r19
            float r8 = r7.a(r4)
            r9 = r20
            float r10 = r9.a(r4)
            java.lang.Object r6 = r6.A
            gv r6 = (defpackage.gv) r6
            double r11 = r6.b(r10)
            float r13 = defpackage.ud2.a
            double r13 = (double) r13
            r15 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r15 = r13 - r15
            r17 = 0
            float r2 = r6.a
            float r6 = r6.b
            float r2 = r2 * r6
            r6 = r1
            double r0 = (double) r2
            double r13 = r13 / r15
            double r13 = r13 * r11
            double r11 = java.lang.Math.exp(r13)
            double r11 = r11 * r0
            float r0 = (float) r11
            float r1 = java.lang.Math.signum(r10)
            float r1 = r1 * r0
            float r1 = r1 + r8
            r5.e(r4, r1)
            int r4 = r4 + 1
            r0 = r18
            r1 = r6
            goto L1b
        L62:
            r17 = 0
            defpackage.nb3.a0(r3)
            throw r17
        L68:
            r17 = 0
            if (r5 == 0) goto L6d
            return r5
        L6d:
            defpackage.nb3.a0(r3)
            throw r17
        L71:
            r17 = 0
            defpackage.nb3.a0(r3)
            throw r17
    }

    public defpackage.ap F(long r15, defpackage.ap r17, defpackage.ap r18) {
            r14 = this;
            java.lang.Object r0 = r14.R
            ap r0 = (defpackage.ap) r0
            if (r0 != 0) goto Lc
            ap r0 = r17.c()
            r14.R = r0
        Lc:
            java.lang.Object r0 = r14.R
            ap r0 = (defpackage.ap) r0
            r1 = 0
            java.lang.String r2 = "velocityVector"
            if (r0 == 0) goto L70
            int r0 = r0.b()
            r3 = 0
        L1a:
            java.lang.Object r4 = r14.R
            ap r4 = (defpackage.ap) r4
            if (r3 >= r0) goto L69
            if (r4 == 0) goto L65
            java.lang.Object r5 = r14.B
            s35 r5 = (defpackage.s35) r5
            r17.getClass()
            r6 = r18
            float r7 = r6.a(r3)
            r8 = 1000000(0xf4240, double:4.940656E-318)
            long r8 = r15 / r8
            java.lang.Object r5 = r5.A
            gv r5 = (defpackage.gv) r5
            td2 r5 = r5.a(r7)
            long r10 = r5.c
            r12 = 0
            int r7 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r7 <= 0) goto L48
            float r7 = (float) r8
            float r8 = (float) r10
            float r7 = r7 / r8
            goto L4a
        L48:
            r7 = 1065353216(0x3f800000, float:1.0)
        L4a:
            ph r7 = defpackage.qh.a(r7)
            float r7 = r7.b
            float r8 = r5.a
            float r8 = java.lang.Math.signum(r8)
            float r8 = r8 * r7
            float r5 = r5.b
            float r8 = r8 * r5
            float r5 = (float) r10
            float r8 = r8 / r5
            r5 = 1148846080(0x447a0000, float:1000.0)
            float r8 = r8 * r5
            r4.e(r3, r8)
            int r3 = r3 + 1
            goto L1a
        L65:
            defpackage.nb3.a0(r2)
            throw r1
        L69:
            if (r4 == 0) goto L6c
            return r4
        L6c:
            defpackage.nb3.a0(r2)
            throw r1
        L70:
            defpackage.nb3.a0(r2)
            throw r1
    }

    public defpackage.qo7 G(defpackage.ar0 r5, java.lang.String r6) {
            r4 = this;
            java.lang.Object r0 = r4.X
            x31 r0 = (defpackage.x31) r0
            monitor-enter(r0)
            java.lang.Object r1 = r4.B     // Catch: java.lang.Throwable -> L34
            ap7 r1 = (defpackage.ap7) r1     // Catch: java.lang.Throwable -> L34
            r1.getClass()     // Catch: java.lang.Throwable -> L34
            java.util.LinkedHashMap r1 = r1.a     // Catch: java.lang.Throwable -> L34
            java.lang.Object r1 = r1.get(r6)     // Catch: java.lang.Throwable -> L34
            qo7 r1 = (defpackage.qo7) r1     // Catch: java.lang.Throwable -> L34
            boolean r2 = r5.d(r1)     // Catch: java.lang.Throwable -> L34
            if (r2 == 0) goto L3a
            java.lang.Object r4 = r4.L     // Catch: java.lang.Throwable -> L34
            yo7 r4 = (defpackage.yo7) r4     // Catch: java.lang.Throwable -> L34
            boolean r5 = r4 instanceof defpackage.h56     // Catch: java.lang.Throwable -> L34
            if (r5 == 0) goto L36
            h56 r4 = (defpackage.h56) r4     // Catch: java.lang.Throwable -> L34
            r1.getClass()     // Catch: java.lang.Throwable -> L34
            ut3 r5 = r4.d     // Catch: java.lang.Throwable -> L34
            if (r5 == 0) goto L36
            d56 r4 = r4.e     // Catch: java.lang.Throwable -> L34
            r4.getClass()     // Catch: java.lang.Throwable -> L34
            defpackage.uj2.m(r1, r4, r5)     // Catch: java.lang.Throwable -> L34
            goto L36
        L34:
            r4 = move-exception
            goto L84
        L36:
            r1.getClass()     // Catch: java.lang.Throwable -> L34
            goto L82
        L3a:
            m94 r1 = new m94     // Catch: java.lang.Throwable -> L34
            java.lang.Object r2 = r4.R     // Catch: java.lang.Throwable -> L34
            j71 r2 = (defpackage.j71) r2     // Catch: java.lang.Throwable -> L34
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L34
            th7 r2 = defpackage.os0.X     // Catch: java.lang.Throwable -> L34
            java.util.LinkedHashMap r3 = r1.a     // Catch: java.lang.Throwable -> L34
            r3.put(r2, r6)     // Catch: java.lang.Throwable -> L34
            java.lang.Object r2 = r4.L     // Catch: java.lang.Throwable -> L34
            yo7 r2 = (defpackage.yo7) r2     // Catch: java.lang.Throwable -> L34
            r2.getClass()     // Catch: java.lang.Throwable -> L34
            qo7 r5 = r2.c(r5, r1)     // Catch: java.lang.Throwable -> L34 java.lang.AbstractMethodError -> L57
        L55:
            r1 = r5
            goto L6b
        L57:
            java.lang.Class r3 = r5.a     // Catch: java.lang.Throwable -> L34 java.lang.AbstractMethodError -> L61
            r3.getClass()     // Catch: java.lang.Throwable -> L34 java.lang.AbstractMethodError -> L61
            qo7 r5 = r2.b(r3, r1)     // Catch: java.lang.Throwable -> L34 java.lang.AbstractMethodError -> L61
            goto L55
        L61:
            java.lang.Class r5 = r5.a     // Catch: java.lang.Throwable -> L34
            r5.getClass()     // Catch: java.lang.Throwable -> L34
            qo7 r5 = r2.a(r5)     // Catch: java.lang.Throwable -> L34
            goto L55
        L6b:
            java.lang.Object r4 = r4.B     // Catch: java.lang.Throwable -> L34
            ap7 r4 = (defpackage.ap7) r4     // Catch: java.lang.Throwable -> L34
            r4.getClass()     // Catch: java.lang.Throwable -> L34
            r1.getClass()     // Catch: java.lang.Throwable -> L34
            java.util.LinkedHashMap r4 = r4.a     // Catch: java.lang.Throwable -> L34
            java.lang.Object r4 = r4.put(r6, r1)     // Catch: java.lang.Throwable -> L34
            qo7 r4 = (defpackage.qo7) r4     // Catch: java.lang.Throwable -> L34
            if (r4 == 0) goto L82
            r4.b()     // Catch: java.lang.Throwable -> L34
        L82:
            monitor-exit(r0)
            return r1
        L84:
            monitor-exit(r0)
            throw r4
    }

    public int H() {
            r0 = this;
            java.lang.Object r0 = r0.R
            sn6 r0 = (defpackage.sn6) r0
            java.lang.StringBuilder r0 = r0.A
            int r0 = r0.length()
            return r0
    }

    public long I() {
            r9 = this;
            java.lang.Object r9 = r9.L
            java.util.concurrent.atomic.AtomicLong r9 = (java.util.concurrent.atomic.AtomicLong) r9
        L4:
            long r0 = r9.get()
            java.lang.Long r2 = java.lang.Long.valueOf(r0)
            long r3 = r2.longValue()
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 <= 0) goto L17
            goto L18
        L17:
            r2 = 0
        L18:
            r3 = 1
            if (r2 == 0) goto L21
            long r5 = r2.longValue()
            goto L22
        L21:
            r5 = r3
        L22:
            r7 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 != 0) goto L2c
            goto L2d
        L2c:
            long r3 = r3 + r5
        L2d:
            boolean r0 = r9.compareAndSet(r0, r3)
            if (r0 == 0) goto L4
            return r5
    }

    public boolean J(defpackage.k8 r3, android.view.MenuItem r4) {
            r2 = this;
            java.lang.Object r0 = r2.B
            android.view.ActionMode$Callback r0 = (android.view.ActionMode.Callback) r0
            hu6 r3 = r2.C(r3)
            s44 r1 = new s44
            java.lang.Object r2 = r2.L
            android.content.Context r2 = (android.content.Context) r2
            lu6 r4 = (defpackage.lu6) r4
            r1.<init>(r2, r4)
            boolean r2 = r0.onActionItemClicked(r3, r1)
            return r2
    }

    public boolean K(defpackage.k8 r5, android.view.Menu r6) {
            r4 = this;
            java.lang.Object r0 = r4.B
            android.view.ActionMode$Callback r0 = (android.view.ActionMode.Callback) r0
            hu6 r5 = r4.C(r5)
            java.lang.Object r1 = r4.X
            ci6 r1 = (defpackage.ci6) r1
            java.lang.Object r2 = r1.get(r6)
            android.view.Menu r2 = (android.view.Menu) r2
            if (r2 != 0) goto L23
            e54 r2 = new e54
            java.lang.Object r4 = r4.L
            android.content.Context r4 = (android.content.Context) r4
            r3 = r6
            i44 r3 = (defpackage.i44) r3
            r2.<init>(r4, r3)
            r1.put(r6, r2)
        L23:
            boolean r4 = r0.onCreateActionMode(r5, r2)
            return r4
    }

    public void M(defpackage.a21 r3, int r4) {
            r2 = this;
            java.lang.Class r3 = r3.getClass()
            java.lang.Object r0 = r2.B
            d14 r0 = (defpackage.d14) r0
            ng0 r1 = r0.g
            java.util.Map r1 = r1.A
            java.lang.Object r3 = r1.get(r3)
            i50 r3 = (defpackage.i50) r3
            if (r3 == 0) goto L33
            java.lang.Object r1 = r2.L
            ng3 r1 = (defpackage.ng3) r1
            java.lang.Object r3 = r3.a(r0, r1)
            java.lang.Object r2 = r2.R
            sn6 r2 = (defpackage.sn6) r2
            java.lang.StringBuilder r0 = r2.A
            int r1 = r0.length()
            int r0 = r0.length()
            if (r1 <= r4) goto L33
            if (r4 < 0) goto L33
            if (r1 > r0) goto L33
            defpackage.sn6.c(r2, r3, r4, r1)
        L33:
            return
    }

    public void N(long r11, defpackage.dd5 r13, defpackage.ed5 r14) {
            r10 = this;
            r13.getClass()
            r14.getClass()
            java.lang.Object r1 = r10.B
            monitor-enter(r1)
            java.lang.Object r0 = r10.R     // Catch: java.lang.Throwable -> L19
            tp6 r0 = (defpackage.tp6) r0     // Catch: java.lang.Throwable -> L19
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L19
            boolean r2 = r0 instanceof defpackage.wc5     // Catch: java.lang.Throwable -> L19
            r3 = 0
            if (r2 == 0) goto L1c
            wc5 r0 = (defpackage.wc5) r0     // Catch: java.lang.Throwable -> L19
            goto L1d
        L19:
            r0 = move-exception
            r10 = r0
            goto L3d
        L1c:
            r0 = r3
        L1d:
            if (r0 != 0) goto L20
            goto L3b
        L20:
            long r4 = r0.a     // Catch: java.lang.Throwable -> L19
            int r2 = (r4 > r11 ? 1 : (r4 == r11 ? 0 : -1))
            if (r2 == 0) goto L27
            goto L3b
        L27:
            java.lang.Object r10 = r10.R     // Catch: java.lang.Throwable -> L19
            tp6 r10 = (defpackage.tp6) r10     // Catch: java.lang.Throwable -> L19
            vc5 r4 = new vc5     // Catch: java.lang.Throwable -> L19
            sc5 r9 = r0.c     // Catch: java.lang.Throwable -> L19
            r5 = r11
            r7 = r13
            r8 = r14
            r4.<init>(r5, r7, r8, r9)     // Catch: java.lang.Throwable -> L19
            r10.getClass()     // Catch: java.lang.Throwable -> L19
            r10.m(r3, r4)     // Catch: java.lang.Throwable -> L19
        L3b:
            monitor-exit(r1)
            return
        L3d:
            monitor-exit(r1)
            throw r10
    }

    public void O(defpackage.jp6 r4) {
            r3 = this;
            r4.getClass()
            q64 r0 = new q64
            r1 = 10
            r0.<init>(r1, r3, r4)
            java.lang.Object r1 = r3.R
            monitor-enter(r1)
            java.lang.Object r2 = r3.X     // Catch: java.lang.Throwable -> L27
            java.util.LinkedHashMap r2 = (java.util.LinkedHashMap) r2     // Catch: java.lang.Throwable -> L27
            java.lang.Object r4 = r2.put(r4, r0)     // Catch: java.lang.Throwable -> L27
            java.lang.Runnable r4 = (java.lang.Runnable) r4     // Catch: java.lang.Throwable -> L27
            monitor-exit(r1)
            java.lang.Object r3 = r3.B
            d51 r3 = (defpackage.d51) r3
            java.lang.Object r3 = r3.B
            android.os.Handler r3 = (android.os.Handler) r3
            r1 = 5400000(0x5265c0, double:2.6679545E-317)
            r3.postDelayed(r0, r1)
            return
        L27:
            r3 = move-exception
            monitor-exit(r1)
            throw r3
    }

    public void P(defpackage.a21 r3) {
            r2 = this;
            java.lang.Object r0 = r2.X
            java.util.Map r0 = (java.util.Map) r0
            java.lang.Class r1 = r3.getClass()
            java.lang.Object r0 = r0.get(r1)
            g14 r0 = (defpackage.g14) r0
            if (r0 == 0) goto L14
            r0.a(r2, r3)
            return
        L14:
            r2.Q(r3)
            return
    }

    public void Q(defpackage.a21 r2) {
            r1 = this;
            java.lang.Object r2 = r2.c
            a21 r2 = (defpackage.a21) r2
        L4:
            if (r2 == 0) goto Lf
            java.lang.Object r0 = r2.f
            a21 r0 = (defpackage.a21) r0
            r2.a(r1)
            r2 = r0
            goto L4
        Lf:
            return
    }

    @Override // defpackage.il7
    public long b(defpackage.ap r9, defpackage.ap r10, defpackage.ap r11) {
            r8 = this;
            int r0 = r9.b()
            r1 = 0
            r3 = 0
        L7:
            if (r3 >= r0) goto L28
            java.lang.Object r4 = r8.B
            j97 r4 = (defpackage.j97) r4
            xd2 r4 = r4.e(r3)
            float r5 = r9.a(r3)
            float r6 = r10.a(r3)
            float r7 = r11.a(r3)
            long r4 = r4.c(r5, r6, r7)
            long r1 = java.lang.Math.max(r1, r4)
            int r3 = r3 + 1
            goto L7
        L28:
            return r1
    }

    @Override // defpackage.mr6
    public synchronized void c(java.nio.ByteBuffer r4, byte[] r5) {
            r3 = this;
            monitor-enter(r3)
            int r0 = r4.remaining()     // Catch: java.lang.Throwable -> L59
            java.lang.Object r1 = r3.X     // Catch: java.lang.Throwable -> L59
            gb r1 = (defpackage.gb) r1     // Catch: java.lang.Throwable -> L59
            int r1 = r1.e()     // Catch: java.lang.Throwable -> L59
            if (r0 != r1) goto L63
            byte r0 = r4.get()     // Catch: java.lang.Throwable -> L59
            java.lang.Object r1 = r3.X     // Catch: java.lang.Throwable -> L59
            gb r1 = (defpackage.gb) r1     // Catch: java.lang.Throwable -> L59
            int r1 = r1.e()     // Catch: java.lang.Throwable -> L59
            if (r0 != r1) goto L5b
            r0 = 7
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L59
            r3.R = r0     // Catch: java.lang.Throwable -> L59
            java.lang.Object r0 = r3.X     // Catch: java.lang.Throwable -> L59
            gb r0 = (defpackage.gb) r0     // Catch: java.lang.Throwable -> L59
            int r0 = r0.a     // Catch: java.lang.Throwable -> L59
            byte[] r0 = new byte[r0]     // Catch: java.lang.Throwable -> L59
            r4.get(r0)     // Catch: java.lang.Throwable -> L59
            java.lang.Object r1 = r3.R     // Catch: java.lang.Throwable -> L59
            byte[] r1 = (byte[]) r1     // Catch: java.lang.Throwable -> L59
            r4.get(r1)     // Catch: java.lang.Throwable -> L59
            java.lang.Object r4 = r3.X     // Catch: java.lang.Throwable -> L59
            gb r4 = (defpackage.gb) r4     // Catch: java.lang.Throwable -> L59
            java.lang.String r1 = r4.d     // Catch: java.lang.Throwable -> L59
            byte[] r2 = r4.e     // Catch: java.lang.Throwable -> L59
            int r4 = r4.a     // Catch: java.lang.Throwable -> L59
            byte[] r4 = defpackage.gi2.v(r1, r2, r0, r5, r4)     // Catch: java.lang.Throwable -> L59
            javax.crypto.spec.SecretKeySpec r5 = new javax.crypto.spec.SecretKeySpec     // Catch: java.lang.Throwable -> L59
            java.lang.String r0 = "AES"
            r5.<init>(r4, r0)     // Catch: java.lang.Throwable -> L59
            r3.B = r5     // Catch: java.lang.Throwable -> L59
            p42 r4 = defpackage.p42.e     // Catch: java.lang.Throwable -> L59
            java.lang.String r5 = "AES/GCM/NoPadding"
            java.lang.Object r4 = r4.a(r5)     // Catch: java.lang.Throwable -> L59
            javax.crypto.Cipher r4 = (javax.crypto.Cipher) r4     // Catch: java.lang.Throwable -> L59
            r3.L = r4     // Catch: java.lang.Throwable -> L59
            monitor-exit(r3)
            return
        L59:
            r4 = move-exception
            goto L6b
        L5b:
            java.security.GeneralSecurityException r4 = new java.security.GeneralSecurityException     // Catch: java.lang.Throwable -> L59
            java.lang.String r5 = "Invalid ciphertext"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L59
            throw r4     // Catch: java.lang.Throwable -> L59
        L63:
            java.security.InvalidAlgorithmParameterException r4 = new java.security.InvalidAlgorithmParameterException     // Catch: java.lang.Throwable -> L59
            java.lang.String r5 = "Invalid header length"
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L59
            throw r4     // Catch: java.lang.Throwable -> L59
        L6b:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L59
            throw r4
    }

    @Override // defpackage.rm6
    public void cancel() {
            r0 = this;
            java.lang.Object r0 = r0.B
            java.net.Socket r0 = (java.net.Socket) r0
            r0.close()
            return
    }

    @Override // defpackage.mr6
    public synchronized void d(java.nio.ByteBuffer r4, int r5, boolean r6, java.nio.ByteBuffer r7) {
            r3 = this;
            monitor-enter(r3)
            java.lang.Object r0 = r3.R     // Catch: java.lang.Throwable -> L1f
            byte[] r0 = (byte[]) r0     // Catch: java.lang.Throwable -> L1f
            long r1 = (long) r5     // Catch: java.lang.Throwable -> L1f
            javax.crypto.spec.GCMParameterSpec r5 = defpackage.gb.i(r0, r1, r6)     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r6 = r3.L     // Catch: java.lang.Throwable -> L1f
            javax.crypto.Cipher r6 = (javax.crypto.Cipher) r6     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r0 = r3.B     // Catch: java.lang.Throwable -> L1f
            javax.crypto.spec.SecretKeySpec r0 = (javax.crypto.spec.SecretKeySpec) r0     // Catch: java.lang.Throwable -> L1f
            r1 = 2
            r6.init(r1, r0, r5)     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r5 = r3.L     // Catch: java.lang.Throwable -> L1f
            javax.crypto.Cipher r5 = (javax.crypto.Cipher) r5     // Catch: java.lang.Throwable -> L1f
            r5.doFinal(r4, r7)     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r3)
            return
        L1f:
            r4 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1f
            throw r4
    }

    public void f(defpackage.ld4 r3) {
            r2 = this;
            java.lang.Object r0 = r2.X
            java.util.LinkedHashSet r0 = (java.util.LinkedHashSet) r0
            boolean r0 = r0.add(r3)
            if (r0 == 0) goto L12
            java.lang.Object r0 = r2.L
            md4 r0 = (defpackage.md4) r0
            r1 = -1
            r0.a(r2, r3, r1)
        L12:
            return
    }

    public void g(defpackage.al4 r2, int r3) {
            r1 = this;
            r0 = 1
            if (r3 == r0) goto L10
            if (r3 != 0) goto L6
            goto L10
        L6:
            java.lang.String r1 = "Unsupported priority value: "
            java.lang.String r1 = defpackage.lb1.g(r3, r1)
            defpackage.i.f(r1)
            return
        L10:
            java.lang.Object r0 = r1.X
            java.util.LinkedHashSet r0 = (java.util.LinkedHashSet) r0
            boolean r0 = r0.add(r2)
            if (r0 == 0) goto L21
            java.lang.Object r0 = r1.L
            md4 r0 = (defpackage.md4) r0
            r0.a(r1, r2, r3)
        L21:
            return
    }

    @Override // defpackage.il7
    public defpackage.ap h(long r15, defpackage.ap r17, defpackage.ap r18, defpackage.ap r19) {
            r14 = this;
            java.lang.Object r0 = r14.R
            ap r0 = (defpackage.ap) r0
            if (r0 != 0) goto Lc
            ap r0 = r19.c()
            r14.R = r0
        Lc:
            java.lang.Object r0 = r14.R
            ap r0 = (defpackage.ap) r0
            r1 = 0
            java.lang.String r2 = "velocityVector"
            if (r0 == 0) goto L52
            int r0 = r0.b()
            r3 = 0
        L1a:
            java.lang.Object r4 = r14.R
            ap r4 = (defpackage.ap) r4
            if (r3 >= r0) goto L4b
            if (r4 == 0) goto L47
            java.lang.Object r5 = r14.B
            j97 r5 = (defpackage.j97) r5
            xd2 r6 = r5.e(r3)
            r5 = r17
            float r9 = r5.a(r3)
            r12 = r18
            float r10 = r12.a(r3)
            r13 = r19
            float r11 = r13.a(r3)
            r7 = r15
            float r6 = r6.b(r7, r9, r10, r11)
            r4.e(r3, r6)
            int r3 = r3 + 1
            goto L1a
        L47:
            defpackage.nb3.a0(r2)
            throw r1
        L4b:
            if (r4 == 0) goto L4e
            return r4
        L4e:
            defpackage.nb3.a0(r2)
            throw r1
        L52:
            defpackage.nb3.a0(r2)
            throw r1
    }

    public void i(java.lang.String r4, java.lang.String r5) {
            r3 = this;
            java.lang.Object r0 = r3.X
            java.lang.String r0 = (java.lang.String) r0
            int r0 = r0.length()
            if (r0 != 0) goto Ld
            java.lang.String r0 = "?"
            goto Lf
        Ld:
            java.lang.String r0 = "&"
        Lf:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.Object r2 = r3.X
            java.lang.String r2 = (java.lang.String) r2
            r1.append(r2)
            r1.append(r0)
            r1.append(r4)
            r4 = 61
            r1.append(r4)
            r1.append(r5)
            java.lang.String r4 = r1.toString()
            r3.X = r4
            return
    }

    @Override // defpackage.f13
    public java.lang.Object j(java.lang.String r7, java.lang.String r8, java.lang.String r9, defpackage.s41 r10) {
            r6 = this;
            xe1 r8 = defpackage.xk1.a
            de1 r8 = defpackage.de1.L
            ag r0 = new ag
            r4 = 0
            r5 = 4
            r1 = r6
            r2 = r7
            r3 = r9
            r0.<init>(r1, r2, r3, r4, r5)
            java.lang.Object r6 = defpackage.hv.d0(r8, r0, r10)
            return r6
    }

    @Override // defpackage.rm6
    public defpackage.in6 k() {
            r0 = this;
            java.lang.Object r0 = r0.R
            ef1 r0 = (defpackage.ef1) r0
            return r0
    }

    public void l(defpackage.a21 r1) {
            r0 = this;
            java.lang.Object r1 = r1.f
            a21 r1 = (defpackage.a21) r1
            if (r1 == 0) goto L12
            r0.z()
            java.lang.Object r0 = r0.R
            sn6 r0 = (defpackage.sn6) r0
            r1 = 10
            r0.a(r1)
        L12:
            return
    }

    public void m(defpackage.jp6 r3) {
            r2 = this;
            r3.getClass()
            java.lang.Object r0 = r2.R
            monitor-enter(r0)
            java.lang.Object r1 = r2.X     // Catch: java.lang.Throwable -> L1f
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L1f
            java.lang.Object r3 = r1.remove(r3)     // Catch: java.lang.Throwable -> L1f
            java.lang.Runnable r3 = (java.lang.Runnable) r3     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r0)
            if (r3 == 0) goto L1e
            java.lang.Object r2 = r2.B
            d51 r2 = (defpackage.d51) r2
            java.lang.Object r2 = r2.B
            android.os.Handler r2 = (android.os.Handler) r2
            r2.removeCallbacks(r3)
        L1e:
            return
        L1f:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
    }

    public void n(long r4) {
            r3 = this;
            java.lang.Object r0 = r3.B
            monitor-enter(r0)
            java.lang.Object r1 = r3.R     // Catch: java.lang.Throwable -> L2c
            tp6 r1 = (defpackage.tp6) r1     // Catch: java.lang.Throwable -> L2c
            java.lang.Object r1 = r1.getValue()     // Catch: java.lang.Throwable -> L2c
            xc5 r1 = (defpackage.xc5) r1     // Catch: java.lang.Throwable -> L2c
            java.lang.Long r1 = defpackage.np2.j(r1)     // Catch: java.lang.Throwable -> L2c
            if (r1 != 0) goto L14
            goto L2a
        L14:
            long r1 = r1.longValue()     // Catch: java.lang.Throwable -> L2c
            int r4 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r4 == 0) goto L1d
            goto L2a
        L1d:
            java.lang.Object r3 = r3.R     // Catch: java.lang.Throwable -> L2c
            tp6 r3 = (defpackage.tp6) r3     // Catch: java.lang.Throwable -> L2c
            uc5 r4 = defpackage.uc5.a     // Catch: java.lang.Throwable -> L2c
            r3.getClass()     // Catch: java.lang.Throwable -> L2c
            r5 = 0
            r3.m(r5, r4)     // Catch: java.lang.Throwable -> L2c
        L2a:
            monitor-exit(r0)
            return
        L2c:
            r3 = move-exception
            monitor-exit(r0)
            throw r3
    }

    @Override // defpackage.il7
    public defpackage.ap q(long r15, defpackage.ap r17, defpackage.ap r18, defpackage.ap r19) {
            r14 = this;
            java.lang.Object r0 = r14.L
            ap r0 = (defpackage.ap) r0
            if (r0 != 0) goto Lc
            ap r0 = r17.c()
            r14.L = r0
        Lc:
            java.lang.Object r0 = r14.L
            ap r0 = (defpackage.ap) r0
            r1 = 0
            java.lang.String r2 = "valueVector"
            if (r0 == 0) goto L52
            int r0 = r0.b()
            r3 = 0
        L1a:
            java.lang.Object r4 = r14.L
            ap r4 = (defpackage.ap) r4
            if (r3 >= r0) goto L4b
            if (r4 == 0) goto L47
            java.lang.Object r5 = r14.B
            j97 r5 = (defpackage.j97) r5
            xd2 r6 = r5.e(r3)
            r5 = r17
            float r9 = r5.a(r3)
            r12 = r18
            float r10 = r12.a(r3)
            r13 = r19
            float r11 = r13.a(r3)
            r7 = r15
            float r6 = r6.e(r7, r9, r10, r11)
            r4.e(r3, r6)
            int r3 = r3 + 1
            goto L1a
        L47:
            defpackage.nb3.a0(r2)
            throw r1
        L4b:
            if (r4 == 0) goto L4e
            return r4
        L4e:
            defpackage.nb3.a0(r2)
            throw r1
        L52:
            defpackage.nb3.a0(r2)
            throw r1
    }

    @Override // defpackage.il7
    public defpackage.ap r(defpackage.ap r10, defpackage.ap r11, defpackage.ap r12) {
            r9 = this;
            java.lang.Object r0 = r9.X
            ap r0 = (defpackage.ap) r0
            if (r0 != 0) goto Lc
            ap r0 = r12.c()
            r9.X = r0
        Lc:
            java.lang.Object r0 = r9.X
            ap r0 = (defpackage.ap) r0
            r1 = 0
            java.lang.String r2 = "endVelocityVector"
            if (r0 == 0) goto L4b
            int r0 = r0.b()
            r3 = 0
        L1a:
            java.lang.Object r4 = r9.X
            ap r4 = (defpackage.ap) r4
            if (r3 >= r0) goto L44
            if (r4 == 0) goto L40
            java.lang.Object r5 = r9.B
            j97 r5 = (defpackage.j97) r5
            xd2 r5 = r5.e(r3)
            float r6 = r10.a(r3)
            float r7 = r11.a(r3)
            float r8 = r12.a(r3)
            float r5 = r5.d(r6, r7, r8)
            r4.e(r3, r5)
            int r3 = r3 + 1
            goto L1a
        L40:
            defpackage.nb3.a0(r2)
            throw r1
        L44:
            if (r4 == 0) goto L47
            return r4
        L47:
            defpackage.nb3.a0(r2)
            throw r1
        L4b:
            defpackage.nb3.a0(r2)
            throw r1
    }

    public void s() {
            r6 = this;
            defpackage.nj2.h()
            java.lang.Object r0 = r6.L
            bt r0 = (defpackage.bt) r0
            r0.getClass()
            defpackage.nj2.h()
            java.lang.Object r1 = r0.R
            vx r1 = (defpackage.vx) r1
            java.util.Objects.requireNonNull(r1)
            java.lang.Object r2 = r0.B
            re5 r2 = (defpackage.re5) r2
            java.util.Objects.requireNonNull(r2)
            java.lang.Object r0 = r0.L
            re5 r0 = (defpackage.re5) r0
            o33 r3 = r1.a
            java.util.Objects.requireNonNull(r3)
            r3.a()
            o33 r3 = r1.a
            java.util.Objects.requireNonNull(r3)
            tb0 r3 = r3.e
            gx3 r3 = defpackage.l.F(r3)
            ik0 r4 = new ik0
            r5 = 0
            r4.<init>(r2, r5)
            ov2 r2 = defpackage.u24.x()
            r3.a(r2, r4)
            o33 r2 = r1.c
            r3 = 1
            if (r2 == 0) goto L5c
            r2.a()
            o33 r2 = r1.c
            tb0 r2 = r2.e
            gx3 r2 = defpackage.l.F(r2)
            ik0 r4 = new ik0
            r5 = 0
            r4.<init>(r5, r3)
            ov2 r5 = defpackage.u24.x()
            r2.a(r5, r4)
        L5c:
            java.util.ArrayList r2 = r1.f
            int r2 = r2.size()
            if (r2 <= r3) goto L80
            o33 r2 = r1.b
            if (r2 == 0) goto L80
            r2.a()
            o33 r1 = r1.b
            tb0 r1 = r1.e
            gx3 r1 = defpackage.l.F(r1)
            ik0 r2 = new ik0
            r3 = 2
            r2.<init>(r0, r3)
            ov2 r0 = defpackage.u24.x()
            r1.a(r0, r2)
        L80:
            java.lang.Object r6 = r6.R
            ci r6 = (defpackage.ci) r6
            r6.getClass()
            return
    }

    public defpackage.sc5 t() {
            r2 = this;
            java.lang.Object r2 = r2.R
            tp6 r2 = (defpackage.tp6) r2
            java.lang.Object r2 = r2.getValue()
            xc5 r2 = (defpackage.xc5) r2
            uc5 r0 = defpackage.uc5.a
            boolean r0 = defpackage.nb3.k(r2, r0)
            r1 = 0
            if (r0 == 0) goto L14
            return r1
        L14:
            boolean r0 = r2 instanceof defpackage.tc5
            if (r0 == 0) goto L21
            tc5 r2 = (defpackage.tc5) r2
            mc5 r2 = r2.c
            sc5 r2 = defpackage.np2.k(r2)
            return r2
        L21:
            boolean r0 = r2 instanceof defpackage.wc5
            if (r0 == 0) goto L2a
            wc5 r2 = (defpackage.wc5) r2
            sc5 r2 = r2.c
            return r2
        L2a:
            boolean r0 = r2 instanceof defpackage.vc5
            if (r0 == 0) goto L33
            vc5 r2 = (defpackage.vc5) r2
            sc5 r2 = r2.d
            return r2
        L33:
            defpackage.i.d()
            return r1
    }

    public java.lang.String toString() {
            r2 = this;
            int r0 = r2.A
            switch(r0) {
                case 7: goto L44;
                case 20: goto La;
                default: goto L5;
            }
        L5:
            java.lang.String r2 = super.toString()
            return r2
        La:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "StreamMap with indices of "
            r0.<init>(r1)
            java.lang.Object r1 = r2.B
            int[] r1 = (int[]) r1
            int r1 = r1.length
            r0.append(r1)
            java.lang.String r1 = " folders, offsets of "
            r0.append(r1)
            java.lang.Object r1 = r2.L
            long[] r1 = (long[]) r1
            int r1 = r1.length
            r0.append(r1)
            java.lang.String r1 = " packed streams, first files of "
            r0.append(r1)
            java.lang.Object r1 = r2.R
            int[] r1 = (int[]) r1
            int r1 = r1.length
            r0.append(r1)
            java.lang.String r1 = " folders and folder indices for "
            r0.append(r1)
            java.lang.Object r2 = r2.X
            int[] r2 = (int[]) r2
            int r2 = r2.length
            java.lang.String r1 = " files"
            java.lang.String r2 = defpackage.lb1.o(r0, r2, r1)
            return r2
        L44:
            java.lang.Object r2 = r2.B
            java.net.Socket r2 = (java.net.Socket) r2
            java.lang.String r2 = r2.toString()
            r2.getClass()
            return r2
    }

    public void u(java.lang.Object r5, java.util.ArrayList r6, java.util.HashSet r7) {
            r4 = this;
            boolean r0 = r6.contains(r5)
            if (r0 == 0) goto L7
            return
        L7:
            boolean r0 = r7.contains(r5)
            if (r0 != 0) goto L34
            r7.add(r5)
            java.lang.Object r0 = r4.L
            ci6 r0 = (defpackage.ci6) r0
            java.lang.Object r0 = r0.get(r5)
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L2d
            int r1 = r0.size()
            r2 = 0
        L21:
            if (r2 >= r1) goto L2d
            java.lang.Object r3 = r0.get(r2)
            r4.u(r3, r6, r7)
            int r2 = r2 + 1
            goto L21
        L2d:
            r7.remove(r5)
            r6.add(r5)
            return
        L34:
            java.lang.String r4 = "This graph contains cyclic dependencies"
            defpackage.u34.j(r4)
            return
    }

    public void v(defpackage.ld4 r3, defpackage.hd4 r4) {
            r2 = this;
            java.lang.Object r2 = r2.L
            md4 r2 = (defpackage.md4) r2
            r2.getClass()
            int r0 = r2.g
            if (r0 == 0) goto Lc
            goto L2c
        Lc:
            r0 = -1
            jd4 r1 = r2.c(r0)
            r2.f = r1
            r2.g = r0
            r2.h = r3
            if (r4 == 0) goto L2c
            if (r1 == 0) goto L1e
            r1.d(r4)
        L1e:
            tp6 r2 = r2.a
            od4 r3 = new od4
            r3.<init>(r4)
            r2.getClass()
            r4 = 0
            r2.m(r4, r3)
        L2c:
            return
    }

    @Override // defpackage.rm6
    public defpackage.ui6 w() {
            r0 = this;
            java.lang.Object r0 = r0.X
            df1 r0 = (defpackage.df1) r0
            return r0
    }

    public java.lang.Object x(long r9, long r11, defpackage.s41 r13) {
            r8 = this;
            boolean r0 = r13 instanceof defpackage.be4
            if (r0 == 0) goto L14
            r0 = r13
            be4 r0 = (defpackage.be4) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.Y = r1
        L12:
            r13 = r0
            goto L1a
        L14:
            be4 r0 = new be4
            r0.<init>(r8, r13)
            goto L12
        L1a:
            java.lang.Object r0 = r13.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r13.Y
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L37
            if (r2 == r5) goto L33
            if (r2 != r4) goto L2d
            defpackage.oi2.Y(r0)
            goto L74
        L2d:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r8)
            return r3
        L33:
            defpackage.oi2.Y(r0)
            goto L59
        L37:
            defpackage.oi2.Y(r0)
            java.lang.Object r0 = r8.B
            ge4 r0 = (defpackage.ge4) r0
            if (r0 == 0) goto L45
            ge4 r0 = r0.S0()
            goto L46
        L45:
            r0 = r3
        L46:
            r6 = 0
            if (r0 != 0) goto L5e
            java.lang.Object r8 = r8.L
            ge4 r8 = (defpackage.ge4) r8
            if (r8 == 0) goto L78
            r13.Y = r5
            java.lang.Object r0 = r8.z0(r9, r11, r13)
            if (r0 != r1) goto L59
            goto L73
        L59:
            ol7 r0 = (defpackage.ol7) r0
            long r6 = r0.a
            goto L78
        L5e:
            java.lang.Object r8 = r8.B
            ge4 r8 = (defpackage.ge4) r8
            if (r8 == 0) goto L68
            ge4 r3 = r8.S0()
        L68:
            r8 = r3
            if (r8 == 0) goto L78
            r13.Y = r4
            java.lang.Object r0 = r8.z0(r9, r11, r13)
            if (r0 != r1) goto L74
        L73:
            return r1
        L74:
            ol7 r0 = (defpackage.ol7) r0
            long r6 = r0.a
        L78:
            ol7 r8 = new ol7
            r8.<init>(r6)
            return r8
    }

    public java.lang.Object y(long r6, defpackage.s41 r8) {
            r5 = this;
            boolean r0 = r8 instanceof defpackage.ce4
            if (r0 == 0) goto L13
            r0 = r8
            ce4 r0 = (defpackage.ce4) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            ce4 r0 = new ce4
            r0.<init>(r5, r8)
        L18:
            java.lang.Object r8 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.oi2.Y(r8)
            goto L46
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            return r3
        L2e:
            defpackage.oi2.Y(r8)
            java.lang.Object r5 = r5.B
            ge4 r5 = (defpackage.ge4) r5
            if (r5 == 0) goto L3b
            ge4 r3 = r5.S0()
        L3b:
            if (r3 == 0) goto L4b
            r0.Y = r4
            java.lang.Object r8 = r3.H(r6, r0)
            if (r8 != r1) goto L46
            return r1
        L46:
            ol7 r8 = (defpackage.ol7) r8
            long r5 = r8.a
            goto L4d
        L4b:
            r5 = 0
        L4d:
            ol7 r7 = new ol7
            r7.<init>(r5)
            return r7
    }

    public void z() {
            r2 = this;
            java.lang.Object r2 = r2.R
            sn6 r2 = (defpackage.sn6) r2
            java.lang.StringBuilder r0 = r2.A
            int r1 = r0.length()
            if (r1 <= 0) goto L1d
            int r1 = r0.length()
            int r1 = r1 + (-1)
            char r0 = r0.charAt(r1)
            r1 = 10
            if (r1 == r0) goto L1d
            r2.a(r1)
        L1d:
            return
    }
}
