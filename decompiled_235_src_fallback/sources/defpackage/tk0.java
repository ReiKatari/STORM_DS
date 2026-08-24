package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tk0  reason: default package */
/* loaded from: classes.dex */
public final class tk0 {
    public final defpackage.me0 a;
    public final defpackage.dk0 b;
    public final defpackage.xc0 c;

    public tk0(defpackage.me0 r1, defpackage.dk0 r2, defpackage.xc0 r3) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.tk0
            r2 = 0
            if (r1 != 0) goto La
            goto L16
        La:
            tk0 r5 = (defpackage.tk0) r5
            me0 r1 = r4.a
            me0 r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
        L16:
            return r2
        L17:
            dk0 r1 = r4.b
            dk0 r3 = r5.b
            if (r1 == r3) goto L1e
            return r2
        L1e:
            xc0 r4 = r4.c
            xc0 r5 = r5.c
            if (r4 == r5) goto L25
            return r2
        L25:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            me0 r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            dk0 r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            xc0 r2 = r2.c
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ConfiguredCameraCaptureSession(session="
            r0.<init>(r1)
            me0 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", processor="
            r0.append(r1)
            dk0 r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", captureSequenceProcessor="
            r0.append(r1)
            xc0 r2 = r2.c
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
