package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xj7  reason: default package */
/* loaded from: classes.dex */
public abstract class xj7 {
    public static final defpackage.nj2 a = null;

    static {
            boolean r0 = defpackage.gh7.f
            if (r0 == 0) goto L15
            boolean r0 = defpackage.gh7.e
            if (r0 == 0) goto L15
            boolean r0 = defpackage.hd.a()
            if (r0 != 0) goto L15
            vj7 r0 = new vj7
            r1 = 1
            r0.<init>(r1)
            goto L1b
        L15:
            vj7 r0 = new vj7
            r1 = 0
            r0.<init>(r1)
        L1b:
            defpackage.xj7.a = r0
            return
    }

    public static int a(byte[] r3, int r4, int r5) {
            int r0 = r4 + (-1)
            r0 = r3[r0]
            int r5 = r5 - r4
            if (r5 == 0) goto L24
            r1 = 1
            if (r5 == r1) goto L1d
            r2 = 2
            if (r5 != r2) goto L17
            r5 = r3[r4]
            int r4 = r4 + r1
            r3 = r3[r4]
            int r3 = d(r0, r5, r3)
            return r3
        L17:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
        L1d:
            r3 = r3[r4]
            int r3 = c(r0, r3)
            return r3
        L24:
            r3 = -12
            if (r0 <= r3) goto L2a
            r3 = -1
            return r3
        L2a:
            return r0
    }

    public static int b(java.lang.String r8) {
            int r0 = r8.length()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L13
            char r3 = r8.charAt(r2)
            r4 = 128(0x80, float:1.8E-43)
            if (r3 >= r4) goto L13
            int r2 = r2 + 1
            goto L6
        L13:
            r3 = r0
        L14:
            if (r2 >= r0) goto L59
            char r4 = r8.charAt(r2)
            r5 = 2048(0x800, float:2.87E-42)
            if (r4 >= r5) goto L26
            int r4 = 127 - r4
            int r4 = r4 >>> 31
            int r3 = r3 + r4
            int r2 = r2 + 1
            goto L14
        L26:
            int r4 = r8.length()
        L2a:
            if (r2 >= r4) goto L58
            char r6 = r8.charAt(r2)
            if (r6 >= r5) goto L38
            int r6 = 127 - r6
            int r6 = r6 >>> 31
            int r1 = r1 + r6
            goto L55
        L38:
            int r1 = r1 + 2
            r7 = 55296(0xd800, float:7.7486E-41)
            if (r7 > r6) goto L55
            r7 = 57343(0xdfff, float:8.0355E-41)
            if (r6 > r7) goto L55
            int r6 = java.lang.Character.codePointAt(r8, r2)
            r7 = 65536(0x10000, float:9.1835E-41)
            if (r6 < r7) goto L4f
            int r2 = r2 + 1
            goto L55
        L4f:
            wj7 r8 = new wj7
            r8.<init>(r2, r4)
            throw r8
        L55:
            int r2 = r2 + 1
            goto L2a
        L58:
            int r3 = r3 + r1
        L59:
            if (r3 < r0) goto L5c
            return r3
        L5c:
            java.lang.IllegalArgumentException r8 = new java.lang.IllegalArgumentException
            long r0 = (long) r3
            r2 = 4294967296(0x100000000, double:2.121995791E-314)
            long r0 = r0 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "UTF-8 length does not fit in int: "
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            r8.<init>(r0)
            throw r8
    }

    public static int c(int r1, int r2) {
            r0 = -12
            if (r1 > r0) goto Ld
            r0 = -65
            if (r2 <= r0) goto L9
            goto Ld
        L9:
            int r2 = r2 << 8
            r1 = r1 ^ r2
            return r1
        Ld:
            r1 = -1
            return r1
    }

    public static int d(int r1, int r2, int r3) {
            r0 = -12
            if (r1 > r0) goto L12
            r0 = -65
            if (r2 > r0) goto L12
            if (r3 <= r0) goto Lb
            goto L12
        Lb:
            int r2 = r2 << 8
            r1 = r1 ^ r2
            int r2 = r3 << 16
            r1 = r1 ^ r2
            return r1
        L12:
            r1 = -1
            return r1
    }
}
