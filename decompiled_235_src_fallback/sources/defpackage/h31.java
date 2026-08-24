package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h31  reason: default package */
/* loaded from: classes.dex */
public final class h31 {
    public final int a;
    public final long b;
    public final defpackage.i31 c;
    public final defpackage.j97 d;

    public h31(int r1, long r2, defpackage.i31 r4, defpackage.j97 r5) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r4
            r0.d = r5
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.h31
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            h31 r8 = (defpackage.h31) r8
            int r1 = r7.a
            int r3 = r8.a
            if (r1 == r3) goto L13
            return r2
        L13:
            long r3 = r7.b
            long r5 = r8.b
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L1c
            return r2
        L1c:
            i31 r1 = r7.c
            i31 r3 = r8.c
            if (r1 == r3) goto L23
            return r2
        L23:
            j97 r7 = r7.d
            j97 r8 = r8.d
            boolean r7 = defpackage.nb3.k(r7, r8)
            if (r7 != 0) goto L2e
            return r2
        L2e:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            int r0 = r4.a
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.b
            int r0 = defpackage.i61.c(r2, r0, r1)
            i31 r2 = r4.c
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            int r2 = r2 * r1
            j97 r4 = r4.d
            if (r4 != 0) goto L1d
            r4 = 0
            goto L21
        L1d:
            int r4 = r4.hashCode()
        L21:
            int r2 = r2 + r4
            return r2
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ContentCaptureEvent(id="
            r0.<init>(r1)
            int r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", timestamp="
            r0.append(r1)
            long r1 = r3.b
            r0.append(r1)
            java.lang.String r1 = ", type="
            r0.append(r1)
            i31 r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", structureCompat="
            r0.append(r1)
            j97 r3 = r3.d
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
