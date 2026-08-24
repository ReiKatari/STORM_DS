package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pm0  reason: default package */
/* loaded from: classes.dex */
public final class pm0 {
    public final java.io.FileInputStream a;
    public final java.nio.charset.CharsetDecoder b;
    public final java.nio.ByteBuffer c;
    public boolean d;
    public char e;

    public pm0(java.io.FileInputStream r1, java.nio.charset.Charset r2) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.a = r1
            java.nio.charset.CharsetDecoder r1 = r2.newDecoder()
            java.nio.charset.CodingErrorAction r2 = java.nio.charset.CodingErrorAction.REPLACE
            java.nio.charset.CharsetDecoder r1 = r1.onMalformedInput(r2)
            java.nio.charset.CharsetDecoder r1 = r1.onUnmappableCharacter(r2)
            r1.getClass()
            r0.b = r1
            u90 r1 = defpackage.u90.c
            r2 = 8196(0x2004, float:1.1485E-41)
            byte[] r1 = r1.c(r2)
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r1)
            r1.getClass()
            r0.c = r1
            r1.flip()
            return
    }

    public final int a(char[] r11, int r12, int r13) {
            r10 = this;
            r0 = 0
            if (r13 != 0) goto L4
            return r0
        L4:
            if (r12 < 0) goto Lea
            int r1 = r11.length
            if (r12 >= r1) goto Lea
            if (r13 < 0) goto Lea
            int r1 = r12 + r13
            int r2 = r11.length
            if (r1 > r2) goto Lea
            boolean r1 = r10.d
            r2 = 1
            if (r1 == 0) goto L24
            char r1 = r10.e
            r11[r12] = r1
            int r12 = r12 + 1
            int r13 = r13 + (-1)
            r10.d = r0
            if (r13 != 0) goto L22
            return r2
        L22:
            r1 = r2
            goto L25
        L24:
            r1 = r0
        L25:
            r3 = -1
            if (r13 != r2) goto L5c
            boolean r13 = r10.d
            if (r13 == 0) goto L31
            r10.d = r0
            char r10 = r10.e
            goto L51
        L31:
            r13 = 2
            char[] r4 = new char[r13]
            int r5 = r10.a(r4, r0, r13)
            if (r5 == r3) goto L50
            if (r5 == r2) goto L4d
            if (r5 != r13) goto L47
            char r13 = r4[r2]
            r10.e = r13
            r10.d = r2
            char r10 = r4[r0]
            goto L51
        L47:
            java.lang.String r10 = "Unreachable state: "
            defpackage.u34.e(r5, r10)
            return r0
        L4d:
            char r10 = r4[r0]
            goto L51
        L50:
            r10 = r3
        L51:
            if (r10 != r3) goto L57
            if (r1 != 0) goto L56
            return r3
        L56:
            return r1
        L57:
            char r10 = (char) r10
            r11[r12] = r10
            int r1 = r1 + r2
            return r1
        L5c:
            java.nio.CharBuffer r11 = java.nio.CharBuffer.wrap(r11, r12, r13)
            int r12 = r11.position()
            if (r12 == 0) goto L6a
            java.nio.CharBuffer r11 = r11.slice()
        L6a:
            r4 = r11
            r11 = r0
        L6c:
            java.nio.charset.CharsetDecoder r12 = r10.b
            java.nio.ByteBuffer r13 = r10.c
            java.nio.charset.CoderResult r5 = r12.decode(r13, r4, r11)
            boolean r6 = r5.isUnderflow()
            if (r6 == 0) goto Lca
            if (r11 != 0) goto Ld3
            boolean r5 = r4.hasRemaining()
            if (r5 == 0) goto Ld3
            r13.compact()
            int r5 = r13.limit()     // Catch: java.lang.Throwable -> Lc5
            int r6 = r13.position()     // Catch: java.lang.Throwable -> Lc5
            if (r6 > r5) goto L91
            int r5 = r5 - r6
            goto L92
        L91:
            r5 = r0
        L92:
            java.io.FileInputStream r7 = r10.a     // Catch: java.lang.Throwable -> Lc5
            byte[] r8 = r13.array()     // Catch: java.lang.Throwable -> Lc5
            int r9 = r13.arrayOffset()     // Catch: java.lang.Throwable -> Lc5
            int r9 = r9 + r6
            int r5 = r7.read(r8, r9, r5)     // Catch: java.lang.Throwable -> Lc5
            if (r5 >= 0) goto La7
            r13.flip()
            goto Lb2
        La7:
            int r6 = r6 + r5
            r13.position(r6)     // Catch: java.lang.Throwable -> Lc5
            r13.flip()
            int r5 = r13.remaining()
        Lb2:
            if (r5 >= 0) goto L6c
            int r11 = r4.position()
            if (r11 != 0) goto Lc0
            boolean r11 = r13.hasRemaining()
            if (r11 == 0) goto Ld4
        Lc0:
            r12.reset()
            r11 = r2
            goto L6c
        Lc5:
            r10 = move-exception
            r13.flip()
            throw r10
        Lca:
            boolean r13 = r5.isOverflow()
            if (r13 == 0) goto Le6
            r4.position()
        Ld3:
            r2 = r11
        Ld4:
            if (r2 == 0) goto Ld9
            r12.reset()
        Ld9:
            int r10 = r4.position()
            if (r10 != 0) goto Le0
            goto Le4
        Le0:
            int r3 = r4.position()
        Le4:
            int r3 = r3 + r1
            return r3
        Le6:
            r5.throwException()
            goto L6c
        Lea:
            java.lang.String r10 = "Unexpected arguments: "
            java.lang.String r0 = ", "
            java.lang.StringBuilder r10 = defpackage.i61.q(r12, r13, r10, r0, r0)
            int r11 = r11.length
            r10.append(r11)
            java.lang.String r10 = r10.toString()
            java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
            java.lang.String r10 = r10.toString()
            r11.<init>(r10)
            throw r11
    }
}
