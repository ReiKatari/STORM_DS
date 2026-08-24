package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lm4  reason: default package */
/* loaded from: classes.dex */
public final class lm4 {
    public final defpackage.vd a;
    public final defpackage.df0 b;

    public lm4(defpackage.vd r3, defpackage.df0 r4, int r5) {
            r2 = this;
            r0 = r5 & 1
            r1 = 0
            if (r0 == 0) goto L6
            r3 = r1
        L6:
            r5 = r5 & 2
            if (r5 == 0) goto Lb
            r4 = r1
        Lb:
            r2.<init>()
            r2.a = r3
            r2.b = r4
            return
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.lm4
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            lm4 r5 = (defpackage.lm4) r5
            vd r1 = r4.a
            vd r3 = r5.a
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            df0 r4 = r4.b
            df0 r5 = r5.b
            boolean r4 = defpackage.nb3.k(r4, r5)
            if (r4 != 0) goto L22
            return r2
        L22:
            return r0
    }

    public final int hashCode() {
            r2 = this;
            r0 = 0
            vd r1 = r2.a
            if (r1 != 0) goto L7
            r1 = r0
            goto Lb
        L7:
            int r1 = r1.hashCode()
        Lb:
            int r1 = r1 * 31
            df0 r2 = r2.b
            if (r2 != 0) goto L12
            goto L18
        L12:
            int r2 = r2.a
            int r0 = java.lang.Integer.hashCode(r2)
        L18:
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "OpenCameraResult(cameraState="
            r0.<init>(r1)
            vd r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", errorCode="
            r0.append(r1)
            df0 r2 = r2.b
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
