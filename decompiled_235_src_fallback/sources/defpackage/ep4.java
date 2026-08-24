package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ep4  reason: default package */
/* loaded from: classes.dex */
public final class ep4 {
    public final boolean a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final defpackage.dp4 f;
    public final defpackage.sw g;

    public ep4(boolean r1, long r2, long r4, long r6, long r8, defpackage.dp4 r10) {
            r0 = this;
            r10.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r4
            r0.d = r6
            r0.e = r8
            r0.f = r10
            r1 = 0
            sw r1 = defpackage.g04.s(r1)
            r0.g = r1
            return
    }

    public final void a(long r3, java.lang.Object r5) {
            r2 = this;
            sw r0 = r2.g
            boolean r0 = r0.a()
            if (r0 == 0) goto Le
            dp4 r2 = r2.f
            r2.b(r5)
            return
        Le:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r0 = "Output "
            r5.<init>(r0)
            long r0 = r2.d
            r5.append(r0)
            java.lang.String r0 = " at "
            r5.append(r0)
            long r0 = r2.b
            java.lang.String r2 = defpackage.nm2.a(r0)
            r5.append(r2)
            java.lang.String r2 = " for "
            r5.append(r2)
            java.lang.String r2 = " was completed multiple times!"
            java.lang.String r2 = defpackage.lb1.p(r5, r3, r2)
            defpackage.u34.f(r2)
            return
    }

    public final boolean equals(java.lang.Object r7) {
            r6 = this;
            if (r6 != r7) goto L3
            goto L3f
        L3:
            boolean r0 = r7 instanceof defpackage.ep4
            r1 = 0
            if (r0 != 0) goto L9
            goto L41
        L9:
            ep4 r7 = (defpackage.ep4) r7
            boolean r0 = r6.a
            boolean r2 = r7.a
            if (r0 == r2) goto L12
            goto L41
        L12:
            long r2 = r6.b
            long r4 = r7.b
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L41
            long r2 = r6.c
            long r4 = r7.c
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L41
            long r2 = r6.d
            long r4 = r7.d
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L2b
            goto L41
        L2b:
            long r2 = r6.e
            long r4 = r7.e
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L34
            goto L41
        L34:
            dp4 r6 = r6.f
            dp4 r7 = r7.f
            boolean r6 = defpackage.nb3.k(r6, r7)
            if (r6 != 0) goto L3f
            goto L41
        L3f:
            r6 = 1
            return r6
        L41:
            return r1
    }

    public final int hashCode() {
            r4 = this;
            boolean r0 = r4.a
            int r0 = java.lang.Boolean.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            long r2 = r4.b
            int r0 = defpackage.i61.c(r2, r0, r1)
            long r2 = r4.c
            int r0 = defpackage.i61.c(r2, r0, r1)
            long r2 = r4.d
            int r0 = defpackage.i61.c(r2, r0, r1)
            long r2 = r4.e
            int r0 = defpackage.i61.c(r2, r0, r1)
            dp4 r4 = r4.f
            int r4 = r4.hashCode()
            int r4 = r4 + r0
            return r4
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "StartedOutput(isOutOfOrder="
            r0.<init>(r1)
            boolean r1 = r5.a
            r0.append(r1)
            java.lang.String r1 = ", cameraFrameNumber="
            r0.append(r1)
            long r1 = r5.b
            java.lang.String r1 = defpackage.nm2.a(r1)
            r0.append(r1)
            java.lang.String r1 = ", cameraTimestamp="
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "CameraTimestamp(value="
            r1.<init>(r2)
            long r2 = r5.c
            r1.append(r2)
            r2 = 41
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = ", cameraOutputSequence="
            r0.append(r1)
            long r3 = r5.d
            r0.append(r3)
            java.lang.String r1 = ", cameraOutputNumber="
            r0.append(r1)
            long r3 = r5.e
            r0.append(r3)
            java.lang.String r1 = ", outputListener="
            r0.append(r1)
            dp4 r5 = r5.f
            r0.append(r5)
            r0.append(r2)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
