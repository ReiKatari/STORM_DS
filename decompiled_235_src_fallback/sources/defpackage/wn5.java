package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wn5  reason: default package */
/* loaded from: classes.dex */
public final class wn5 extends defpackage.yn5 {
    public final defpackage.vn5 b;
    public final java.util.List c;

    public wn5(defpackage.vn5 r1, java.util.List r2) {
            r0 = this;
            r0.<init>(r2)
            r0.b = r1
            r0.c = r2
            return
    }

    @Override // defpackage.yn5
    public final java.util.List a() {
            r0 = this;
            java.util.List r0 = r0.c
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof defpackage.wn5
            if (r0 != 0) goto L8
            goto L1f
        L8:
            wn5 r3 = (defpackage.wn5) r3
            vn5 r0 = r2.b
            vn5 r1 = r3.b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            java.util.List r2 = r2.c
            java.util.List r3 = r3.c
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L21
        L1f:
            r2 = 0
            return r2
        L21:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r1 = this;
            vn5 r0 = r1.b
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.util.List r1 = r1.c
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Failure(nextSubmissionAttempt="
            r0.<init>(r1)
            vn5 r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", uiEvents="
            r0.append(r1)
            java.util.List r2 = r2.c
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
