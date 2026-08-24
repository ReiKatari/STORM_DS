package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
@defpackage.cc6
/* renamed from: pv  reason: default package */
/* loaded from: classes.dex */
public final class pv {
    public static final defpackage.ov Companion = null;
    public final long a;
    public final java.lang.String b;
    public final java.lang.String c;
    public final long d;
    public final java.lang.String e;

    static {
            ov r0 = new ov
            r0.<init>()
            defpackage.pv.Companion = r0
            return
    }

    public /* synthetic */ pv(int r4, long r5, java.lang.String r7, java.lang.String r8, long r9, java.lang.String r11) {
            r3 = this;
            r3.<init>()
            r0 = r4 & 1
            r1 = 0
            if (r0 != 0) goto Lc
            r3.a = r1
            goto Le
        Lc:
            r3.a = r5
        Le:
            r5 = r4 & 2
            java.lang.String r6 = ""
            if (r5 != 0) goto L17
            r3.b = r6
            goto L19
        L17:
            r3.b = r7
        L19:
            r5 = r4 & 4
            if (r5 != 0) goto L20
            r3.c = r6
            goto L22
        L20:
            r3.c = r8
        L22:
            r5 = r4 & 8
            if (r5 != 0) goto L29
            r3.d = r1
            goto L2b
        L29:
            r3.d = r9
        L2b:
            r4 = r4 & 16
            if (r4 != 0) goto L32
            r3.e = r6
            return
        L32:
            r3.e = r11
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.pv
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            pv r8 = (defpackage.pv) r8
            long r3 = r7.a
            long r5 = r8.a
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            java.lang.String r1 = r7.b
            java.lang.String r3 = r8.b
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L20
            return r2
        L20:
            java.lang.String r1 = r7.c
            java.lang.String r3 = r8.c
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L2b
            return r2
        L2b:
            long r3 = r7.d
            long r5 = r8.d
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L34
            return r2
        L34:
            java.lang.String r7 = r7.e
            java.lang.String r8 = r8.e
            boolean r7 = defpackage.nb3.k(r7, r8)
            if (r7 != 0) goto L3f
            return r2
        L3f:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            long r0 = r4.a
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r4.b
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r2 = r4.c
            int r0 = defpackage.xg6.d(r0, r1, r2)
            long r2 = r4.d
            int r0 = defpackage.i61.c(r2, r0, r1)
            java.lang.String r4 = r4.e
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AssetDto(id="
            r0.<init>(r1)
            long r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", url="
            r0.append(r1)
            java.lang.String r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", name="
            r0.append(r1)
            java.lang.String r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", size="
            r0.append(r1)
            long r1 = r3.d
            r0.append(r1)
            java.lang.String r1 = ", contentType="
            r0.append(r1)
            java.lang.String r3 = r3.e
            r0.append(r3)
            java.lang.String r3 = ")"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
