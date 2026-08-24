package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j45  reason: default package */
/* loaded from: classes.dex */
public abstract class j45 extends defpackage.lb0 implements defpackage.fg3 {
    public final boolean Z;

    public j45(java.lang.Object r9, java.lang.Class r10, java.lang.String r11, java.lang.String r12, int r13) {
            r8 = this;
            r0 = 1
            r13 = r13 & r0
            r1 = 0
            if (r13 != r0) goto Lc
            r7 = r0
        L6:
            r2 = r8
            r3 = r9
            r4 = r10
            r5 = r11
            r6 = r12
            goto Le
        Lc:
            r7 = r1
            goto L6
        Le:
            r2.<init>(r3, r4, r5, r6, r7)
            r2.Z = r1
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r3 != r2) goto L3
            goto L35
        L3:
            boolean r0 = r3 instanceof defpackage.j45
            if (r0 == 0) goto L37
            j45 r3 = (defpackage.j45) r3
            yq0 r0 = r2.b()
            yq0 r1 = r3.b()
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L44
            java.lang.String r0 = r2.R
            java.lang.String r1 = r3.R
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L44
            java.lang.String r0 = r2.X
            java.lang.String r1 = r3.X
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L44
            java.lang.Object r2 = r2.B
            java.lang.Object r3 = r3.B
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 == 0) goto L44
        L35:
            r2 = 1
            return r2
        L37:
            boolean r0 = r3 instanceof defpackage.fg3
            if (r0 == 0) goto L44
            yf3 r2 = r2.f()
            boolean r2 = r3.equals(r2)
            return r2
        L44:
            r2 = 0
            return r2
    }

    public final defpackage.yf3 f() {
            r1 = this;
            boolean r0 = r1.Z
            if (r0 == 0) goto L5
            return r1
        L5:
            yf3 r0 = r1.A
            if (r0 != 0) goto Lf
            yf3 r0 = r1.a()
            r1.A = r0
        Lf:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            yq0 r0 = r3.b()
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.R
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r3 = r3.X
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            yf3 r0 = r2.f()
            if (r0 == r2) goto Lb
            java.lang.String r2 = r0.toString()
            return r2
        Lb:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "property "
            r0.<init>(r1)
            java.lang.String r2 = r2.R
            java.lang.String r1 = " (Kotlin reflection is not available)"
            java.lang.String r2 = defpackage.i61.n(r0, r2, r1)
            return r2
    }
}
