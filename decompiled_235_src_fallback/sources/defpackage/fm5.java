package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fm5  reason: default package */
/* loaded from: classes.dex */
public final class fm5 {
    public final int a;
    public final defpackage.uh b;

    public fm5(int r1, defpackage.uh r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L1b
        L3:
            boolean r0 = r3 instanceof defpackage.fm5
            if (r0 != 0) goto L8
            goto L1d
        L8:
            fm5 r3 = (defpackage.fm5) r3
            int r0 = r2.a
            int r1 = r3.a
            if (r0 != r1) goto L1d
            uh r2 = r2.b
            uh r3 = r3.b
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 != 0) goto L1b
            goto L1d
        L1b:
            r2 = 1
            return r2
        L1d:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.a
            int r0 = java.lang.Integer.hashCode(r0)
            int r0 = r0 * 31
            uh r1 = r1.b
            if (r1 != 0) goto Le
            r1 = 0
            goto L12
        Le:
            int r1 = r1.hashCode()
        L12:
            int r0 = r0 + r1
            return r0
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Result3A(status="
            r0.<init>(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Status(value="
            r1.<init>(r2)
            int r2 = r3.a
            r1.append(r2)
            r2 = 41
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            java.lang.String r1 = ", frameMetadata="
            r0.append(r1)
            uh r3 = r3.b
            r0.append(r3)
            r0.append(r2)
            java.lang.String r3 = r0.toString()
            return r3
    }
}
