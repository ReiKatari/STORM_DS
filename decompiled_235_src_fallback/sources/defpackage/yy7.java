package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yy7  reason: default package */
/* loaded from: classes.dex */
public abstract class yy7 {
    public static final byte[] a = null;
    public static final defpackage.eo4 b = null;

    static {
            r0 = 0
            byte[] r1 = new byte[r0]
            defpackage.yy7.a = r1
            da0 r1 = defpackage.da0.R
            java.lang.String r1 = "efbbbf"
            da0 r1 = defpackage.xd5.n(r1)
            java.lang.String r2 = "feff"
            da0 r2 = defpackage.xd5.n(r2)
            java.lang.String r3 = "fffe0000"
            da0 r3 = defpackage.xd5.n(r3)
            java.lang.String r4 = "fffe"
            da0 r4 = defpackage.xd5.n(r4)
            java.lang.String r5 = "0000feff"
            da0 r5 = defpackage.xd5.n(r5)
            da0[] r1 = new defpackage.da0[]{r1, r2, r3, r4, r5}
            java.util.ArrayList r6 = new java.util.ArrayList
            ku r2 = new ku
            r2.<init>(r1, r0)
            r6.<init>(r2)
            defpackage.jt0.w0(r6)
            int r2 = r6.size()
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>(r2)
            r3 = r0
        L40:
            if (r3 >= r2) goto L4d
            r4 = -1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r9.add(r4)
            int r3 = r3 + 1
            goto L40
        L4d:
            r2 = r0
            r3 = r2
        L4f:
            r10 = 5
            if (r2 >= r10) goto L65
            r4 = r1[r2]
            int r5 = r3 + 1
            int r4 = defpackage.hf.y(r6, r4)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r9.set(r4, r3)
            int r2 = r2 + 1
            r3 = r5
            goto L4f
        L65:
            java.lang.Object r2 = r6.get(r0)
            da0 r2 = (defpackage.da0) r2
            int r2 = r2.d()
            if (r2 <= 0) goto L106
            r2 = r0
        L72:
            int r3 = r6.size()
            if (r2 >= r3) goto Ld5
            java.lang.Object r3 = r6.get(r2)
            da0 r3 = (defpackage.da0) r3
            int r4 = r2 + 1
            r5 = r4
        L81:
            int r7 = r6.size()
            if (r5 >= r7) goto Ld3
            java.lang.Object r7 = r6.get(r5)
            da0 r7 = (defpackage.da0) r7
            r7.getClass()
            r3.getClass()
            int r8 = r3.d()
            boolean r8 = r7.l(r0, r3, r8)
            if (r8 == 0) goto Ld3
            int r8 = r7.d()
            int r11 = r3.d()
            if (r8 == r11) goto Lcd
            java.lang.Object r7 = r9.get(r5)
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            java.lang.Object r8 = r9.get(r2)
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r7 <= r8) goto Lca
            r6.remove(r5)
            java.lang.Object r7 = r9.remove(r5)
            java.lang.Number r7 = (java.lang.Number) r7
            r7.intValue()
            goto L81
        Lca:
            int r5 = r5 + 1
            goto L81
        Lcd:
            java.lang.String r0 = "duplicate option: "
            defpackage.u34.w(r7, r0)
            return
        Ld3:
            r2 = r4
            goto L72
        Ld5:
            k80 r4 = new k80
            r4.<init>()
            r7 = 0
            int r8 = r6.size()
            r2 = 0
            r5 = 0
            defpackage.ln2.h(r2, r4, r5, r6, r7, r8, r9)
            long r2 = r4.B
            r5 = 4
            long r2 = r2 / r5
            int r2 = (int) r2
            int[] r3 = new int[r2]
        Led:
            if (r0 >= r2) goto Lf8
            int r5 = r4.readInt()
            r3[r0] = r5
            int r0 = r0 + 1
            goto Led
        Lf8:
            eo4 r0 = new eo4
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r1, r10)
            da0[] r1 = (defpackage.da0[]) r1
            r0.<init>(r1, r3)
            defpackage.yy7.b = r0
            return
        L106:
            java.lang.String r0 = "the empty byte string is not a supported option"
            defpackage.i.h(r0)
            return
    }

    public static final void a(long r4, long r6, long r8) {
            long r0 = r6 | r8
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L13
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 > 0) goto L13
            long r0 = r4 - r6
            int r8 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r8 < 0) goto L13
            return
        L13:
            java.lang.ArrayIndexOutOfBoundsException r8 = new java.lang.ArrayIndexOutOfBoundsException
            java.lang.String r9 = "length="
            java.lang.String r0 = ", offset="
            java.lang.StringBuilder r4 = defpackage.xg6.s(r4, r9, r0)
            r4.append(r6)
            java.lang.String r5 = ", count="
            r4.append(r5)
            r4.append(r6)
            java.lang.String r4 = r4.toString()
            r8.<init>(r4)
            throw r8
    }

    public static final void b(java.io.Closeable r0) {
            r0.getClass()
            r0.close()     // Catch: java.lang.Exception -> L6 java.lang.RuntimeException -> L7
        L6:
            return
        L7:
            r0 = move-exception
            throw r0
    }

    public static final void c(defpackage.db2 r3, defpackage.lt4 r4) {
            r3.getClass()
            java.util.List r4 = r3.x(r4)     // Catch: java.io.FileNotFoundException -> L32
            java.util.Iterator r4 = r4.iterator()
            r0 = 0
        Lc:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L2e
            java.lang.Object r1 = r4.next()
            lt4 r1 = (defpackage.lt4) r1
            ai1 r2 = r3.A(r1)     // Catch: java.io.IOException -> L24
            boolean r2 = r2.c     // Catch: java.io.IOException -> L24
            if (r2 == 0) goto L26
            c(r3, r1)     // Catch: java.io.IOException -> L24
            goto L26
        L24:
            r1 = move-exception
            goto L2a
        L26:
            r3.r(r1)     // Catch: java.io.IOException -> L24
            goto Lc
        L2a:
            if (r0 != 0) goto Lc
            r0 = r1
            goto Lc
        L2e:
            if (r0 != 0) goto L31
            return
        L31:
            throw r0
        L32:
            return
    }

    public static final void d(defpackage.ik1 r0, defpackage.lt4 r1) {
            r0.getClass()
            r1.getClass()
            db2 r0 = r0.B     // Catch: java.io.FileNotFoundException -> Lb
            r0.r(r1)     // Catch: java.io.FileNotFoundException -> Lb
        Lb:
            return
    }

    public static final int e(java.lang.String r1, char r2, int r3, int r4) {
            r1.getClass()
        L3:
            if (r3 >= r4) goto Lf
            char r0 = r1.charAt(r3)
            if (r0 != r2) goto Lc
            return r3
        Lc:
            int r3 = r3 + 1
            goto L3
        Lf:
            return r4
    }

    public static final int f(java.lang.String r1, int r2, int r3, java.lang.String r4) {
            r1.getClass()
        L3:
            if (r2 >= r3) goto L13
            char r0 = r1.charAt(r2)
            boolean r0 = defpackage.qs6.k0(r4, r0)
            if (r0 == 0) goto L10
            return r2
        L10:
            int r2 = r2 + 1
            goto L3
        L13:
            return r3
    }

    public static /* synthetic */ int g(java.lang.String r1, char r2, int r3, int r4, int r5) {
            r0 = r5 & 2
            if (r0 == 0) goto L5
            r3 = 0
        L5:
            r5 = r5 & 4
            if (r5 == 0) goto Ld
            int r4 = r1.length()
        Ld:
            int r1 = e(r1, r2, r3, r4)
            return r1
    }

    public static final boolean h(java.lang.String[] r7, java.lang.String[] r8, java.util.Comparator r9) {
            r7.getClass()
            int r0 = r7.length
            r1 = 0
            if (r0 != 0) goto L8
            goto L28
        L8:
            if (r8 == 0) goto L28
            int r0 = r8.length
            if (r0 != 0) goto Le
            goto L28
        Le:
            int r0 = r7.length
            r2 = r1
        L10:
            if (r2 >= r0) goto L28
            r3 = r7[r2]
            int r4 = r8.length
            r5 = r1
        L16:
            if (r5 >= r4) goto L25
            r6 = r8[r5]
            int r6 = r9.compare(r3, r6)
            if (r6 != 0) goto L22
            r7 = 1
            return r7
        L22:
            int r5 = r5 + 1
            goto L16
        L25:
            int r2 = r2 + 1
            goto L10
        L28:
            return r1
    }

    public static final int i(java.lang.String r4) {
            int r0 = r4.length()
            r1 = 0
        L5:
            if (r1 >= r0) goto L20
            char r2 = r4.charAt(r1)
            r3 = 31
            int r3 = defpackage.nb3.p(r2, r3)
            if (r3 <= 0) goto L1f
            r3 = 127(0x7f, float:1.78E-43)
            int r2 = defpackage.nb3.p(r2, r3)
            if (r2 < 0) goto L1c
            goto L1f
        L1c:
            int r1 = r1 + 1
            goto L5
        L1f:
            return r1
        L20:
            r4 = -1
            return r4
    }

    public static final int j(int r2, int r3, java.lang.String r4) {
            r4.getClass()
        L3:
            if (r2 >= r3) goto L21
            char r0 = r4.charAt(r2)
            r1 = 9
            if (r0 == r1) goto L1e
            r1 = 10
            if (r0 == r1) goto L1e
            r1 = 12
            if (r0 == r1) goto L1e
            r1 = 13
            if (r0 == r1) goto L1e
            r1 = 32
            if (r0 == r1) goto L1e
            return r2
        L1e:
            int r2 = r2 + 1
            goto L3
        L21:
            return r3
    }

    public static final int k(int r2, int r3, java.lang.String r4) {
            r4.getClass()
            int r3 = r3 + (-1)
            if (r2 > r3) goto L27
        L7:
            char r0 = r4.charAt(r3)
            r1 = 9
            if (r0 == r1) goto L22
            r1 = 10
            if (r0 == r1) goto L22
            r1 = 12
            if (r0 == r1) goto L22
            r1 = 13
            if (r0 == r1) goto L22
            r1 = 32
            if (r0 == r1) goto L22
            int r3 = r3 + 1
            return r3
        L22:
            if (r3 == r2) goto L27
            int r3 = r3 + (-1)
            goto L7
        L27:
            return r2
    }

    public static final java.lang.String[] l(java.lang.String[] r8, java.lang.String[] r9, java.util.Comparator r10) {
            r8.getClass()
            r9.getClass()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r1 = r8.length
            r2 = 0
            r3 = r2
        Le:
            if (r3 >= r1) goto L28
            r4 = r8[r3]
            int r5 = r9.length
            r6 = r2
        L14:
            if (r6 >= r5) goto L25
            r7 = r9[r6]
            int r7 = r10.compare(r4, r7)
            if (r7 != 0) goto L22
            r0.add(r4)
            goto L25
        L22:
            int r6 = r6 + 1
            goto L14
        L25:
            int r3 = r3 + 1
            goto Le
        L28:
            java.lang.String[] r8 = new java.lang.String[r2]
            java.lang.Object[] r8 = r0.toArray(r8)
            java.lang.String[] r8 = (java.lang.String[]) r8
            return r8
    }

    public static final boolean m(java.lang.String r1) {
            r1.getClass()
            java.lang.String r0 = "Authorization"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L26
            java.lang.String r0 = "Cookie"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L26
            java.lang.String r0 = "Proxy-Authorization"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 != 0) goto L26
            java.lang.String r0 = "Set-Cookie"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto L24
            goto L26
        L24:
            r1 = 0
            return r1
        L26:
            r1 = 1
            return r1
    }

    public static final int n(char r2) {
            r0 = 48
            if (r0 > r2) goto La
            r1 = 58
            if (r2 >= r1) goto La
            int r2 = r2 - r0
            return r2
        La:
            r0 = 97
            if (r0 > r2) goto L15
            r0 = 103(0x67, float:1.44E-43)
            if (r2 >= r0) goto L15
            int r2 = r2 + (-87)
            return r2
        L15:
            r0 = 65
            if (r0 > r2) goto L20
            r0 = 71
            if (r2 >= r0) goto L20
            int r2 = r2 + (-55)
            return r2
        L20:
            r2 = -1
            return r2
    }

    public static final int o(defpackage.z80 r2) {
            r2.getClass()
            byte r0 = r2.readByte()
            r0 = r0 & 255(0xff, float:3.57E-43)
            int r0 = r0 << 16
            byte r1 = r2.readByte()
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r0 = r0 | r1
            byte r2 = r2.readByte()
            r2 = r2 & 255(0xff, float:3.57E-43)
            r2 = r2 | r0
            return r2
    }

    public static final int p(int r2, java.lang.String r3) {
            if (r3 == 0) goto L1a
            long r2 = java.lang.Long.parseLong(r3)     // Catch: java.lang.NumberFormatException -> L1a
            r0 = 2147483647(0x7fffffff, double:1.060997895E-314)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 <= 0) goto L11
            r2 = 2147483647(0x7fffffff, float:NaN)
            return r2
        L11:
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 >= 0) goto L19
            r2 = 0
            return r2
        L19:
            int r2 = (int) r2
        L1a:
            return r2
    }
}
