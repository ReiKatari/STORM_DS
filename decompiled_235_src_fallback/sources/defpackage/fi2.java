package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fi2  reason: default package */
/* loaded from: classes.dex */
public final class fi2 {
    public static final defpackage.fi2[] j = null;
    public defpackage.ps0[] a;
    public long b;
    public long c;
    public defpackage.h40[] d;
    public long[] e;
    public long[] f;
    public boolean g;
    public long h;
    public int i;

    static {
            r0 = 0
            fi2[] r0 = new defpackage.fi2[r0]
            defpackage.fi2.j = r0
            return
    }

    public final java.util.List a() {
            r9 = this;
            long[] r0 = r9.e
            if (r0 == 0) goto L5c
            ps0[] r1 = r9.a
            if (r1 == 0) goto L5c
            int r0 = r0.length
            if (r0 == 0) goto L5c
            int r0 = r1.length
            if (r0 != 0) goto Lf
            goto L5c
        Lf:
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            long[] r1 = r9.e
            r2 = 0
            r3 = r1[r2]
        L19:
            int r1 = (int) r3
        L1a:
            if (r1 < 0) goto L5b
            ps0[] r3 = r9.a
            int r4 = r3.length
            if (r1 >= r4) goto L5b
            r3 = r3[r1]
            boolean r3 = r0.contains(r3)
            if (r3 != 0) goto L54
            ps0[] r3 = r9.a
            r3 = r3[r1]
            r0.addLast(r3)
            h40[] r3 = r9.d
            r4 = -1
            if (r3 == 0) goto L48
            r3 = r2
        L36:
            h40[] r5 = r9.d
            int r6 = r5.length
            if (r3 >= r6) goto L48
            r5 = r5[r3]
            long r5 = r5.c
            long r7 = (long) r1
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L45
            goto L49
        L45:
            int r3 = r3 + 1
            goto L36
        L48:
            r3 = r4
        L49:
            if (r3 == r4) goto L52
            h40[] r1 = r9.d
            r1 = r1[r3]
            long r3 = r1.b
            goto L19
        L52:
            r1 = r4
            goto L1a
        L54:
            java.lang.String r9 = "folder uses the same coder more than once in coder chain"
            defpackage.e41.i(r9)
            r9 = 0
            return r9
        L5b:
            return r0
        L5c:
            java.util.List r9 = java.util.Collections.EMPTY_LIST
            return r9
    }

    public final long b() {
            r8 = this;
            long r0 = r8.c
            r2 = 0
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L9
            goto L30
        L9:
            int r0 = (int) r0
            int r0 = r0 + (-1)
        Lc:
            if (r0 < 0) goto L30
            h40[] r1 = r8.d
            if (r1 == 0) goto L25
            r1 = 0
        L13:
            h40[] r4 = r8.d
            int r5 = r4.length
            if (r1 >= r5) goto L25
            r4 = r4[r1]
            long r4 = r4.c
            long r6 = (long) r0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 != 0) goto L22
            goto L26
        L22:
            int r1 = r1 + 1
            goto L13
        L25:
            r1 = -1
        L26:
            if (r1 >= 0) goto L2d
            long[] r8 = r8.f
            r0 = r8[r0]
            return r0
        L2d:
            int r0 = r0 + (-1)
            goto Lc
        L30:
            return r2
    }

    public final java.lang.String toString() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Folder with "
            r0.<init>(r1)
            ps0[] r1 = r4.a
            int r1 = r1.length
            r0.append(r1)
            java.lang.String r1 = " coders, "
            r0.append(r1)
            long r1 = r4.b
            r0.append(r1)
            java.lang.String r1 = " input streams, "
            r0.append(r1)
            long r1 = r4.c
            r0.append(r1)
            java.lang.String r1 = " output streams, "
            r0.append(r1)
            h40[] r1 = r4.d
            int r1 = r1.length
            r0.append(r1)
            java.lang.String r1 = " bind pairs, "
            r0.append(r1)
            long[] r1 = r4.e
            int r1 = r1.length
            r0.append(r1)
            java.lang.String r1 = " packed streams, "
            r0.append(r1)
            long[] r1 = r4.f
            int r1 = r1.length
            r0.append(r1)
            java.lang.String r1 = " unpack sizes, "
            r0.append(r1)
            boolean r1 = r4.g
            if (r1 == 0) goto L5c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "with CRC "
            r1.<init>(r2)
            long r2 = r4.h
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L5e
        L5c:
            java.lang.String r1 = "without CRC"
        L5e:
            r0.append(r1)
            java.lang.String r1 = " and "
            r0.append(r1)
            int r4 = r4.i
            java.lang.String r1 = " unpack streams"
            java.lang.String r4 = defpackage.lb1.o(r0, r4, r1)
            return r4
    }
}
