package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ud  reason: default package */
/* loaded from: classes.dex */
public final class ud {
    public final defpackage.ds0 a;
    public final long b;
    public final defpackage.df0 c;
    public final java.lang.Throwable d;

    public ud(defpackage.ds0 r5, defpackage.df0 r6, java.lang.Exception r7, int r8) {
            r4 = this;
            long r0 = android.os.SystemClock.elapsedRealtimeNanos()
            r2 = r8 & 4
            r3 = 0
            if (r2 == 0) goto La
            r6 = r3
        La:
            r8 = r8 & 8
            if (r8 == 0) goto Lf
            r7 = r3
        Lf:
            r5.getClass()
            r4.<init>()
            r4.a = r5
            r4.b = r0
            r4.c = r6
            r4.d = r7
            return
    }

    public final boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof defpackage.ud
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ud r8 = (defpackage.ud) r8
            ds0 r1 = r7.a
            ds0 r3 = r8.a
            if (r1 == r3) goto L13
            return r2
        L13:
            long r3 = r7.b
            long r5 = r8.b
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L32
            df0 r1 = r7.c
            df0 r3 = r8.c
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L26
            return r2
        L26:
            java.lang.Throwable r7 = r7.d
            java.lang.Throwable r8 = r8.d
            boolean r7 = defpackage.nb3.k(r7, r8)
            if (r7 != 0) goto L31
            return r2
        L31:
            return r0
        L32:
            return r2
    }

    public final int hashCode() {
            r4 = this;
            ds0 r0 = r4.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.b
            int r0 = defpackage.i61.c(r2, r0, r1)
            r2 = 0
            df0 r3 = r4.c
            if (r3 != 0) goto L16
            r3 = r2
            goto L1c
        L16:
            int r3 = r3.a
            int r3 = java.lang.Integer.hashCode(r3)
        L1c:
            int r0 = r0 + r3
            int r0 = r0 * r1
            java.lang.Throwable r4 = r4.d
            if (r4 != 0) goto L23
            goto L27
        L23:
            int r2 = r4.hashCode()
        L27:
            int r0 = r0 + r2
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ClosingInfo(reason="
            r0.<init>(r1)
            ds0 r1 = r3.a
            r0.append(r1)
            java.lang.String r1 = ", closingTimestamp="
            r0.append(r1)
            long r1 = r3.b
            java.lang.String r1 = defpackage.g67.a(r1)
            r0.append(r1)
            java.lang.String r1 = ", errorCode="
            r0.append(r1)
            df0 r1 = r3.c
            r0.append(r1)
            java.lang.String r1 = ", exception="
            r0.append(r1)
            java.lang.Throwable r3 = r3.d
            r0.append(r3)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
