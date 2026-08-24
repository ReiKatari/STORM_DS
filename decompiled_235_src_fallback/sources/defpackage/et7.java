package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: et7  reason: default package */
/* loaded from: classes.dex */
public final class et7 {
    public final defpackage.vv7 a;
    public final defpackage.l05 b;

    public et7(defpackage.vv7 r1, defpackage.l05 r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L21
        L3:
            boolean r0 = r3 instanceof defpackage.et7
            if (r0 != 0) goto L8
            goto L1f
        L8:
            et7 r3 = (defpackage.et7) r3
            vv7 r0 = r3.a
            vv7 r1 = r2.a
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L15
            goto L1f
        L15:
            l05 r2 = r2.b
            l05 r3 = r3.b
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
            vv7 r0 = r1.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            l05 r1 = r1.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "WindowAdaptiveInfo(windowSizeClass="
            r0.<init>(r1)
            vv7 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", windowPosture="
            r0.append(r1)
            l05 r2 = r2.b
            r0.append(r2)
            r2 = 41
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
