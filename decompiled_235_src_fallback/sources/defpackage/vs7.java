package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vs7  reason: default package */
/* loaded from: classes.dex */
public abstract class vs7 {
    public static final java.util.LinkedHashMap a(java.util.ArrayList r22) {
            java.lang.String r0 = defpackage.lt4.B
            java.lang.String r0 = "/"
            lt4 r2 = defpackage.w31.p(r0)
            jy7 r1 = new jy7
            r18 = 0
            r19 = 65532(0xfffc, float:9.183E-41)
            r3 = 1
            r4 = 0
            r5 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r1.<init>(r2, r3, r4, r5, r7, r9, r11, r12, r14, r15, r16, r17, r18, r19)
            vr4 r0 = new vr4
            r0.<init>(r2, r1)
            vr4[] r0 = new defpackage.vr4[]{r0}
            java.util.LinkedHashMap r0 = defpackage.c14.n0(r0)
            tp5 r1 = new tp5
            r2 = 15
            r1.<init>(r2)
            r2 = r22
            java.util.List r1 = defpackage.gt0.d1(r2, r1)
            java.util.Iterator r1 = r1.iterator()
        L41:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L95
            java.lang.Object r2 = r1.next()
            jy7 r2 = (defpackage.jy7) r2
            lt4 r3 = r2.a
            java.lang.Object r3 = r0.put(r3, r2)
            jy7 r3 = (defpackage.jy7) r3
            if (r3 != 0) goto L41
        L57:
            lt4 r2 = r2.a
            lt4 r4 = r2.b()
            if (r4 != 0) goto L60
            goto L41
        L60:
            java.lang.Object r3 = r0.get(r4)
            jy7 r3 = (defpackage.jy7) r3
            if (r3 == 0) goto L6e
            java.util.ArrayList r3 = r3.q
            r3.add(r2)
            goto L41
        L6e:
            jy7 r3 = new jy7
            r20 = 0
            r21 = 65532(0xfffc, float:9.183E-41)
            r5 = 1
            r6 = 0
            r7 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r3.<init>(r4, r5, r6, r7, r9, r11, r13, r14, r16, r17, r18, r19, r20, r21)
            r0.put(r4, r3)
            java.util.ArrayList r4 = r3.q
            r4.add(r2)
            r2 = r3
            goto L57
        L95:
            return r0
    }

    public static final java.lang.String b(int r1) {
            r0 = 16
            defpackage.g04.y(r0)
            java.lang.String r1 = java.lang.Integer.toString(r1, r0)
            r1.getClass()
            java.lang.String r0 = "0x"
            java.lang.String r1 = r0.concat(r1)
            return r1
    }

    public static final defpackage.jy7 c(defpackage.fe5 r31) {
            r5 = r31
            int r0 = r5.n()
            r11 = 0
            r1 = 33639248(0x2014b50, float:9.499037E-38)
            if (r0 != r1) goto L121
            r0 = 4
            r5.skip(r0)
            short r0 = r5.u()
            r1 = 65535(0xffff, float:9.1834E-41)
            r2 = r0 & r1
            r0 = r0 & 1
            if (r0 != 0) goto L113
            short r0 = r5.u()
            r22 = r0 & r1
            short r0 = r5.u()
            r26 = r0 & r1
            short r0 = r5.u()
            r25 = r0 & r1
            int r0 = r5.n()
            long r2 = (long) r0
            r6 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r16 = r2 & r6
            r2 = r6
            ch5 r6 = new ch5
            r6.<init>()
            int r0 = r5.n()
            long r7 = (long) r0
            long r7 = r7 & r2
            r6.A = r7
            ch5 r4 = new ch5
            r4.<init>()
            int r0 = r5.n()
            long r7 = (long) r0
            long r7 = r7 & r2
            r4.A = r7
            short r0 = r5.u()
            r0 = r0 & r1
            short r7 = r5.u()
            r12 = r7 & r1
            short r7 = r5.u()
            r13 = r7 & r1
            r7 = 8
            r5.skip(r7)
            r8 = r7
            ch5 r7 = new ch5
            r7.<init>()
            int r1 = r5.n()
            long r14 = (long) r1
            long r14 = r14 & r2
            r7.A = r14
            long r0 = (long) r0
            java.lang.String r14 = r5.v(r0)
            r15 = 0
            boolean r0 = defpackage.qs6.k0(r14, r15)
            if (r0 != 0) goto L10d
            long r0 = r4.A
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            r18 = 0
            if (r0 != 0) goto L93
            r0 = r8
        L90:
            r20 = r2
            goto L96
        L93:
            r0 = r18
            goto L90
        L96:
            long r2 = r6.A
            int r2 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r2 != 0) goto L9d
            long r0 = r0 + r8
        L9d:
            long r2 = r7.A
            int r2 = (r2 > r20 ? 1 : (r2 == r20 ? 0 : -1))
            if (r2 != 0) goto La4
            long r0 = r0 + r8
        La4:
            r2 = r0
            dh5 r8 = new dh5
            r8.<init>()
            dh5 r9 = new dh5
            r9.<init>()
            dh5 r10 = new dh5
            r10.<init>()
            zg5 r1 = new zg5
            r1.<init>()
            my7 r0 = new my7
            r0.<init>(r1, r2, r4, r5, r6, r7, r8, r9, r10)
            d(r5, r12, r0)
            int r0 = (r2 > r18 ? 1 : (r2 == r18 ? 0 : -1))
            if (r0 <= 0) goto Ld0
            boolean r0 = r1.A
            if (r0 == 0) goto Lca
            goto Ld0
        Lca:
            java.lang.String r0 = "bad zip: zip64 extra required but absent"
            defpackage.e41.i(r0)
            return r11
        Ld0:
            long r0 = (long) r13
            java.lang.String r0 = r5.v(r0)
            java.lang.String r1 = defpackage.lt4.B
            java.lang.String r1 = "/"
            lt4 r2 = defpackage.w31.p(r1)
            lt4 r13 = r2.d(r14)
            boolean r14 = defpackage.xs6.Y(r14, r1, r15)
            jy7 r12 = new jy7
            long r1 = r6.A
            long r3 = r4.A
            long r5 = r7.A
            java.lang.Object r7 = r8.A
            r27 = r7
            java.lang.Long r27 = (java.lang.Long) r27
            java.lang.Object r7 = r9.A
            r28 = r7
            java.lang.Long r28 = (java.lang.Long) r28
            java.lang.Object r7 = r10.A
            r29 = r7
            java.lang.Long r29 = (java.lang.Long) r29
            r30 = 57344(0xe000, float:8.0356E-41)
            r15 = r0
            r18 = r1
            r20 = r3
            r23 = r5
            r12.<init>(r13, r14, r15, r16, r18, r20, r22, r23, r25, r26, r27, r28, r29, r30)
            return r12
        L10d:
            java.lang.String r0 = "bad zip: filename contains 0x00"
            defpackage.e41.i(r0)
            return r11
        L113:
            java.lang.String r0 = b(r2)
            java.lang.String r1 = "unsupported zip: general purpose bit flag="
            java.lang.String r0 = r1.concat(r0)
            defpackage.e41.i(r0)
            return r11
        L121:
            java.lang.String r1 = b(r1)
            java.lang.String r2 = " but was "
            java.lang.String r0 = b(r0)
            java.lang.String r3 = "bad zip: expected "
            defpackage.fa6.i(r3, r1, r2, r0)
            return r11
    }

    public static final void d(defpackage.fe5 r11, int r12, defpackage.eo2 r13) {
            k80 r0 = r11.B
            long r1 = (long) r12
        L3:
            r3 = 0
            int r12 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r12 == 0) goto L59
            r5 = 4
            int r12 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r12 < 0) goto L54
            short r12 = r11.u()
            r7 = 65535(0xffff, float:9.1834E-41)
            r12 = r12 & r7
            short r7 = r11.u()
            long r7 = (long) r7
            r9 = 65535(0xffff, double:3.23786E-319)
            long r7 = r7 & r9
            long r1 = r1 - r5
            int r5 = (r1 > r7 ? 1 : (r1 == r7 ? 0 : -1))
            if (r5 < 0) goto L4e
            r11.g0(r7)
            long r5 = r0.B
            java.lang.Integer r9 = java.lang.Integer.valueOf(r12)
            java.lang.Long r10 = java.lang.Long.valueOf(r7)
            r13.o(r9, r10)
            long r9 = r0.B
            long r9 = r9 + r7
            long r9 = r9 - r5
            int r3 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r3 < 0) goto L44
            if (r3 <= 0) goto L42
            r0.skip(r9)
        L42:
            long r1 = r1 - r7
            goto L3
        L44:
            java.lang.String r11 = "unsupported zip: too many bytes processed for "
            java.lang.String r11 = defpackage.lb1.g(r12, r11)
            defpackage.e41.i(r11)
            return
        L4e:
            java.lang.String r11 = "bad zip: truncated value in extra field"
            defpackage.e41.i(r11)
            return
        L54:
            java.lang.String r11 = "bad zip: truncated header in extra field"
            defpackage.e41.i(r11)
        L59:
            return
    }

    public static final defpackage.jy7 e(defpackage.fe5 r27, defpackage.jy7 r28) {
            r0 = r27
            r1 = r28
            int r2 = r0.n()
            r3 = 0
            r4 = 67324752(0x4034b50, float:1.5433558E-36)
            if (r2 != r4) goto La2
            r4 = 2
            r0.skip(r4)
            short r2 = r0.u()
            r4 = 65535(0xffff, float:9.1834E-41)
            r5 = r2 & r4
            r2 = r2 & 1
            if (r2 != 0) goto L94
            r5 = 18
            r0.skip(r5)
            short r2 = r0.u()
            long r5 = (long) r2
            r7 = 65535(0xffff, double:3.23786E-319)
            long r5 = r5 & r7
            short r2 = r0.u()
            r2 = r2 & r4
            r0.skip(r5)
            if (r1 != 0) goto L3d
            long r1 = (long) r2
            r0.skip(r1)
            return r3
        L3d:
            dh5 r3 = new dh5
            r3.<init>()
            dh5 r4 = new dh5
            r4.<init>()
            dh5 r5 = new dh5
            r5.<init>()
            ly7 r6 = new ly7
            r6.<init>(r0, r3, r4, r5)
            d(r0, r2, r6)
            java.lang.Object r0 = r3.A
            r24 = r0
            java.lang.Integer r24 = (java.lang.Integer) r24
            java.lang.Object r0 = r4.A
            r25 = r0
            java.lang.Integer r25 = (java.lang.Integer) r25
            java.lang.Object r0 = r5.A
            r26 = r0
            java.lang.Integer r26 = (java.lang.Integer) r26
            jy7 r6 = new jy7
            lt4 r7 = r1.a
            boolean r8 = r1.b
            java.lang.String r9 = r1.c
            long r10 = r1.d
            long r12 = r1.e
            long r14 = r1.f
            int r0 = r1.g
            long r2 = r1.h
            int r4 = r1.i
            int r5 = r1.j
            r16 = r0
            java.lang.Long r0 = r1.k
            r21 = r0
            java.lang.Long r0 = r1.l
            java.lang.Long r1 = r1.m
            r22 = r0
            r23 = r1
            r17 = r2
            r19 = r4
            r20 = r5
            r6.<init>(r7, r8, r9, r10, r12, r14, r16, r17, r19, r20, r21, r22, r23, r24, r25, r26)
            return r6
        L94:
            java.lang.String r0 = b(r5)
            java.lang.String r1 = "unsupported zip: general purpose bit flag="
            java.lang.String r0 = r1.concat(r0)
            defpackage.e41.i(r0)
            return r3
        La2:
            java.lang.String r0 = b(r4)
            java.lang.String r1 = " but was "
            java.lang.String r2 = b(r2)
            java.lang.String r4 = "bad zip: expected "
            defpackage.fa6.i(r4, r0, r1, r2)
            return r3
    }

    public static void f(defpackage.i80 r7, byte[] r8) {
            r7.getClass()
            r8.getClass()
            int r0 = r8.length
            r1 = 0
        L8:
            byte[] r2 = r7.X
            int r3 = r7.Y
            int r4 = r7.Z
            if (r2 == 0) goto L20
        L10:
            if (r3 >= r4) goto L20
            int r1 = r1 % r0
            r5 = r2[r3]
            r6 = r8[r1]
            r5 = r5 ^ r6
            byte r5 = (byte) r5
            r2[r3] = r5
            int r3 = r3 + 1
            int r1 = r1 + 1
            goto L10
        L20:
            long r2 = r7.R
            k80 r4 = r7.A
            r4.getClass()
            long r4 = r4.B
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 == 0) goto L48
            long r2 = r7.R
            r4 = -1
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 != 0) goto L3c
            r2 = 0
        L37:
            int r2 = r7.h(r2)
            goto L44
        L3c:
            int r4 = r7.Z
            int r5 = r7.Y
            int r4 = r4 - r5
            long r4 = (long) r4
            long r2 = r2 + r4
            goto L37
        L44:
            r3 = -1
            if (r2 != r3) goto L8
            return
        L48:
            java.lang.String r7 = "no more bytes"
            defpackage.i.m(r7)
            return
    }
}
