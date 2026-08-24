package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: th0  reason: default package */
/* loaded from: classes.dex */
public final class th0 extends defpackage.oh0 {
    public final java.lang.String a;
    public final defpackage.ds0 b;
    public final java.lang.Integer c;
    public final defpackage.sq1 d;
    public final java.lang.Throwable e;
    public final defpackage.sq1 f;
    public final defpackage.sq1 g;
    public final defpackage.sq1 h;
    public final defpackage.df0 i;

    public th0(java.lang.String r1, defpackage.ds0 r2, java.lang.Integer r3, defpackage.sq1 r4, java.lang.Throwable r5, defpackage.sq1 r6, defpackage.sq1 r7, defpackage.sq1 r8, defpackage.df0 r9) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            r0.d = r4
            r0.e = r5
            r0.f = r6
            r0.g = r7
            r0.h = r8
            r0.i = r9
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.th0
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            th0 r5 = (defpackage.th0) r5
            java.lang.String r1 = r4.a
            java.lang.String r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            ds0 r1 = r4.b
            ds0 r3 = r5.b
            if (r1 == r3) goto L1e
            return r2
        L1e:
            java.lang.Integer r1 = r4.c
            java.lang.Integer r3 = r5.c
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L29
            return r2
        L29:
            sq1 r1 = r4.d
            sq1 r3 = r5.d
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L34
            return r2
        L34:
            java.lang.Throwable r1 = r4.e
            java.lang.Throwable r3 = r5.e
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L3f
            return r2
        L3f:
            sq1 r1 = r4.f
            sq1 r3 = r5.f
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L4a
            return r2
        L4a:
            sq1 r1 = r4.g
            sq1 r3 = r5.g
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L55
            return r2
        L55:
            sq1 r1 = r4.h
            sq1 r3 = r5.h
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L60
            return r2
        L60:
            df0 r4 = r4.i
            df0 r5 = r5.i
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L6b
            return r2
        L6b:
            return r0
    }

    public final int hashCode() {
            r4 = this;
            java.lang.String r0 = r4.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            ds0 r1 = r4.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            r0 = 0
            java.lang.Integer r2 = r4.c
            if (r2 != 0) goto L18
            r2 = r0
            goto L1c
        L18:
            int r2 = r2.hashCode()
        L1c:
            int r1 = r1 + r2
            int r1 = r1 * 31
            sq1 r2 = r4.d
            if (r2 != 0) goto L25
            r2 = r0
            goto L2b
        L25:
            long r2 = r2.a
            int r2 = java.lang.Long.hashCode(r2)
        L2b:
            int r1 = r1 + r2
            int r1 = r1 * 31
            java.lang.Throwable r2 = r4.e
            if (r2 != 0) goto L34
            r2 = r0
            goto L38
        L34:
            int r2 = r2.hashCode()
        L38:
            int r1 = r1 + r2
            int r1 = r1 * 31
            sq1 r2 = r4.f
            if (r2 != 0) goto L41
            r2 = r0
            goto L47
        L41:
            long r2 = r2.a
            int r2 = java.lang.Long.hashCode(r2)
        L47:
            int r1 = r1 + r2
            int r1 = r1 * 31
            sq1 r2 = r4.g
            if (r2 != 0) goto L50
            r2 = r0
            goto L56
        L50:
            long r2 = r2.a
            int r2 = java.lang.Long.hashCode(r2)
        L56:
            int r1 = r1 + r2
            int r1 = r1 * 31
            sq1 r2 = r4.h
            if (r2 != 0) goto L5f
            r2 = r0
            goto L65
        L5f:
            long r2 = r2.a
            int r2 = java.lang.Long.hashCode(r2)
        L65:
            int r1 = r1 + r2
            int r1 = r1 * 31
            df0 r4 = r4.i
            if (r4 != 0) goto L6d
            goto L73
        L6d:
            int r4 = r4.a
            int r0 = java.lang.Integer.hashCode(r4)
        L73:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "CameraStateClosed(cameraId="
            r0.<init>(r1)
            java.lang.String r1 = r2.a
            java.lang.String r1 = defpackage.xf0.b(r1)
            r0.append(r1)
            java.lang.String r1 = ", cameraClosedReason="
            r0.append(r1)
            ds0 r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", cameraRetryCount="
            r0.append(r1)
            java.lang.Integer r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", cameraRetryDurationNs="
            r0.append(r1)
            sq1 r1 = r2.d
            r0.append(r1)
            java.lang.String r1 = ", cameraException="
            r0.append(r1)
            java.lang.Throwable r1 = r2.e
            r0.append(r1)
            java.lang.String r1 = ", cameraOpenDurationNs="
            r0.append(r1)
            sq1 r1 = r2.f
            r0.append(r1)
            java.lang.String r1 = ", cameraActiveDurationNs="
            r0.append(r1)
            sq1 r1 = r2.g
            r0.append(r1)
            java.lang.String r1 = ", cameraClosingDurationNs="
            r0.append(r1)
            sq1 r1 = r2.h
            r0.append(r1)
            java.lang.String r1 = ", cameraErrorCode="
            r0.append(r1)
            df0 r2 = r2.i
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
