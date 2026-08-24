package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l93  reason: default package */
/* loaded from: classes.dex */
public final class l93 extends defpackage.j93 {
    public static final defpackage.l93 R = null;

    static {
            l93 r0 = new l93
            r1 = 1
            r2 = 0
            r0.<init>(r1, r2, r1)
            defpackage.l93.R = r0
            return
    }

    @Override // defpackage.j93
    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.l93
            if (r0 == 0) goto L23
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L13
            r0 = r3
            l93 r0 = (defpackage.l93) r0
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L21
        L13:
            l93 r3 = (defpackage.l93) r3
            int r0 = r3.A
            int r1 = r2.A
            if (r1 != r0) goto L23
            int r2 = r2.B
            int r3 = r3.B
            if (r2 != r3) goto L23
        L21:
            r2 = 1
            return r2
        L23:
            r2 = 0
            return r2
    }

    @Override // defpackage.j93
    public final int hashCode() {
            r1 = this;
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L8
            r1 = -1
            return r1
        L8:
            int r0 = r1.A
            int r0 = r0 * 31
            int r1 = r1.B
            int r0 = r0 + r1
            return r0
    }

    @Override // defpackage.j93
    public final boolean isEmpty() {
            r1 = this;
            int r0 = r1.A
            int r1 = r1.B
            if (r0 <= r1) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    @Override // defpackage.j93
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r2.A
            r0.append(r1)
            java.lang.String r1 = ".."
            r0.append(r1)
            int r2 = r2.B
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
