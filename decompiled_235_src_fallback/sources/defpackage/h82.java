package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h82  reason: default package */
/* loaded from: classes.dex */
public final class h82 implements defpackage.wk5 {
    public final defpackage.yk5 A;
    public final long B;

    public h82(defpackage.yk5 r1, long r2) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.A = r1
            r0.B = r2
            return
    }

    @Override // defpackage.hh7
    public final java.lang.Object e(defpackage.ar0 r1) {
            r0 = this;
            r0 = 0
            return r0
    }

    public final boolean equals(java.lang.Object r6) {
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            boolean r1 = r6 instanceof defpackage.h82
            r2 = 0
            if (r1 != 0) goto La
            goto L16
        La:
            h82 r6 = (defpackage.h82) r6
            yk5 r1 = r5.A
            yk5 r3 = r6.A
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
        L16:
            return r2
        L17:
            long r3 = r5.B
            long r5 = r6.B
            int r5 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r5 != 0) goto L20
            return r0
        L20:
            return r2
    }

    public final int hashCode() {
            r5 = this;
            yk5 r0 = r5.A
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            r2 = 0
            int r0 = defpackage.xg6.e(r0, r2, r1)
            long r3 = r5.B
            int r5 = defpackage.i61.c(r3, r0, r1)
            int r0 = java.lang.Integer.hashCode(r2)
            int r0 = r0 + r5
            return r0
    }

    @Override // defpackage.wk5
    public final boolean r() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ExtensionRequestFailure(requestMetadata="
            r0.<init>(r1)
            yk5 r1 = r3.A
            r0.append(r1)
            java.lang.String r1 = ", wasImageCaptured=false, frameNumber="
            r0.append(r1)
            long r1 = r3.B
            java.lang.String r3 = defpackage.nm2.a(r1)
            r0.append(r3)
            java.lang.String r3 = ", reason=0)"
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Override // defpackage.wk5
    public final int v() {
            r0 = this;
            r0 = 0
            return r0
    }
}
