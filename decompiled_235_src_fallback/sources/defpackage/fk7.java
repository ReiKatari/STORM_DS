package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fk7  reason: default package */
/* loaded from: classes.dex */
public final class fk7 implements defpackage.gg3 {
    public static final defpackage.fk7 a = null;
    public static final defpackage.x25 b = null;

    static {
            fk7 r0 = new fk7
            r0.<init>()
            defpackage.fk7.a = r0
            x25 r0 = new x25
            java.lang.String r1 = "kotlin.uuid.Uuid"
            v25 r2 = defpackage.v25.m
            r0.<init>(r1, r2)
            defpackage.fk7.b = r0
            return
    }

    @Override // defpackage.gg3
    public final java.lang.Object c(defpackage.sc1 r25) {
            r24 = this;
            java.lang.String r0 = r25.I()
            r0.getClass()
            int r1 = r0.length()
            r2 = 0
            r3 = 16
            r4 = 0
            java.lang.String r6 = "a hexadecimal digit"
            r7 = 4
            r8 = 0
            r9 = 32
            if (r1 == r9) goto L13b
            r10 = 36
            if (r1 == r10) goto L50
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Expected either a 36-char string in the standard hex-and-dash UUID format or a 32-char hexadecimal string, but was \""
            r2.<init>(r3)
            int r3 = r0.length()
            r4 = 64
            if (r3 > r4) goto L2f
            r3 = r0
            goto L39
        L2f:
            java.lang.String r3 = r0.substring(r8, r4)
            java.lang.String r4 = "..."
            java.lang.String r3 = r3.concat(r4)
        L39:
            r2.append(r3)
            java.lang.String r3 = "\" of length "
            r2.append(r3)
            int r0 = r0.length()
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r1.<init>(r0)
            throw r1
        L50:
            r11 = r4
        L51:
            r1 = 8
            if (r8 >= r1) goto L6e
            long r11 = r11 << r7
            char r1 = r0.charAt(r8)
            int r13 = r1 >>> 8
            if (r13 != 0) goto L6a
            long[] r13 = defpackage.hx2.b
            r14 = r13[r1]
            int r1 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r1 < 0) goto L6a
            long r11 = r11 | r14
            int r8 = r8 + 1
            goto L51
        L6a:
            defpackage.xk2.K(r0, r8, r6)
            throw r2
        L6e:
            char r8 = r0.charAt(r1)
            java.lang.String r13 = "'-' (hyphen)"
            r14 = 45
            if (r8 != r14) goto L137
            r1 = 9
            r15 = r4
        L7b:
            r8 = 13
            if (r1 >= r8) goto L99
            long r15 = r15 << r7
            char r8 = r0.charAt(r1)
            int r17 = r8 >>> 8
            if (r17 != 0) goto L95
            long[] r17 = defpackage.hx2.b
            r18 = r17[r8]
            int r8 = (r18 > r4 ? 1 : (r18 == r4 ? 0 : -1))
            if (r8 < 0) goto L95
            long r15 = r15 | r18
            int r1 = r1 + 1
            goto L7b
        L95:
            defpackage.xk2.K(r0, r1, r6)
            throw r2
        L99:
            char r1 = r0.charAt(r8)
            if (r1 != r14) goto L133
            r1 = 14
            r17 = r4
        La3:
            r8 = 18
            if (r1 >= r8) goto Lc2
            long r17 = r17 << r7
            char r8 = r0.charAt(r1)
            int r19 = r8 >>> 8
            if (r19 != 0) goto Lbe
            long[] r19 = defpackage.hx2.b
            r20 = r19[r8]
            int r8 = (r20 > r4 ? 1 : (r20 == r4 ? 0 : -1))
            if (r8 < 0) goto Lbe
            long r17 = r17 | r20
            int r1 = r1 + 1
            goto La3
        Lbe:
            defpackage.xk2.K(r0, r1, r6)
            throw r2
        Lc2:
            char r1 = r0.charAt(r8)
            if (r1 != r14) goto L12f
            r1 = 19
            r19 = r4
        Lcc:
            r8 = 23
            if (r1 >= r8) goto Leb
            long r19 = r19 << r7
            char r8 = r0.charAt(r1)
            int r21 = r8 >>> 8
            if (r21 != 0) goto Le7
            long[] r21 = defpackage.hx2.b
            r22 = r21[r8]
            int r8 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r8 < 0) goto Le7
            long r19 = r19 | r22
            int r1 = r1 + 1
            goto Lcc
        Le7:
            defpackage.xk2.K(r0, r1, r6)
            throw r2
        Leb:
            char r1 = r0.charAt(r8)
            if (r1 != r14) goto L12b
            r1 = 24
            r13 = r4
        Lf4:
            if (r1 >= r10) goto L110
            long r13 = r13 << r7
            char r8 = r0.charAt(r1)
            int r21 = r8 >>> 8
            if (r21 != 0) goto L10c
            long[] r21 = defpackage.hx2.b
            r22 = r21[r8]
            int r8 = (r22 > r4 ? 1 : (r22 == r4 ? 0 : -1))
            if (r8 < 0) goto L10c
            long r13 = r13 | r22
            int r1 = r1 + 1
            goto Lf4
        L10c:
            defpackage.xk2.K(r0, r1, r6)
            throw r2
        L110:
            long r0 = r11 << r9
            long r2 = r15 << r3
            long r0 = r0 | r2
            long r0 = r0 | r17
            r2 = 48
            long r2 = r19 << r2
            long r2 = r2 | r13
            int r6 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r6 != 0) goto L125
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 != 0) goto L125
            goto L17b
        L125:
            ek7 r4 = new ek7
            r4.<init>(r0, r2)
            return r4
        L12b:
            defpackage.xk2.K(r0, r8, r13)
            throw r2
        L12f:
            defpackage.xk2.K(r0, r8, r13)
            throw r2
        L133:
            defpackage.xk2.K(r0, r8, r13)
            throw r2
        L137:
            defpackage.xk2.K(r0, r1, r13)
            throw r2
        L13b:
            r10 = r4
        L13c:
            if (r8 >= r3) goto L157
            long r10 = r10 << r7
            char r1 = r0.charAt(r8)
            int r12 = r1 >>> 8
            if (r12 != 0) goto L153
            long[] r12 = defpackage.hx2.b
            r13 = r12[r1]
            int r1 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r1 < 0) goto L153
            long r10 = r10 | r13
            int r8 = r8 + 1
            goto L13c
        L153:
            defpackage.xk2.K(r0, r8, r6)
            throw r2
        L157:
            r12 = r4
        L158:
            if (r3 >= r9) goto L173
            long r12 = r12 << r7
            char r1 = r0.charAt(r3)
            int r8 = r1 >>> 8
            if (r8 != 0) goto L16f
            long[] r8 = defpackage.hx2.b
            r14 = r8[r1]
            int r1 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r1 < 0) goto L16f
            long r12 = r12 | r14
            int r3 = r3 + 1
            goto L158
        L16f:
            defpackage.xk2.K(r0, r3, r6)
            throw r2
        L173:
            int r0 = (r10 > r4 ? 1 : (r10 == r4 ? 0 : -1))
            if (r0 != 0) goto L17e
            int r0 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r0 != 0) goto L17e
        L17b:
            ek7 r0 = defpackage.ek7.L
            return r0
        L17e:
            ek7 r0 = new ek7
            r0.<init>(r10, r12)
            return r0
    }

    @Override // defpackage.gg3
    public final void d(defpackage.x32 r1, java.lang.Object r2) {
            r0 = this;
            ek7 r2 = (defpackage.ek7) r2
            r2.getClass()
            java.lang.String r0 = r2.toString()
            r1.d0(r0)
            return
    }

    @Override // defpackage.gg3
    public final defpackage.wb6 e() {
            r0 = this;
            x25 r0 = defpackage.fk7.b
            return r0
    }
}
