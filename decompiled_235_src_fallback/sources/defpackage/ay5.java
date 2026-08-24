package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ay5  reason: default package */
/* loaded from: classes.dex */
public final class ay5 extends defpackage.cy5 {
    public final defpackage.qo6 a;

    public ay5(defpackage.qo6 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.ay5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ay5 r4 = (defpackage.ay5) r4
            qo6 r3 = r3.a
            qo6 r4 = r4.a
            if (r3 == r4) goto L13
            return r2
        L13:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            qo6 r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "LaunchFailedSramProblem(reason="
            r0.<init>(r1)
            qo6 r2 = r2.a
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
