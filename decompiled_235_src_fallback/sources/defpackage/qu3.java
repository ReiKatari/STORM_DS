package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qu3  reason: default package */
/* loaded from: classes.dex */
public final class qu3 implements defpackage.tt7 {
    public final defpackage.tt7 a;
    public final int b;

    public qu3(defpackage.tt7 r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // defpackage.tt7
    public final int a(defpackage.qh1 r2) {
            r1 = this;
            int r0 = r1.b
            r0 = r0 & 16
            if (r0 == 0) goto Ld
            tt7 r1 = r1.a
            int r1 = r1.a(r2)
            return r1
        Ld:
            r1 = 0
            return r1
    }

    @Override // defpackage.tt7
    public final int b(defpackage.qh1 r3, defpackage.kk3 r4) {
            r2 = this;
            kk3 r0 = defpackage.kk3.Ltr
            if (r4 != r0) goto L6
            r0 = 4
            goto L7
        L6:
            r0 = 1
        L7:
            int r1 = r2.b
            r0 = r0 & r1
            if (r0 == 0) goto L13
            tt7 r2 = r2.a
            int r2 = r2.b(r3, r4)
            return r2
        L13:
            r2 = 0
            return r2
    }

    @Override // defpackage.tt7
    public final int c(defpackage.qh1 r2) {
            r1 = this;
            int r0 = r1.b
            r0 = r0 & 32
            if (r0 == 0) goto Ld
            tt7 r1 = r1.a
            int r1 = r1.c(r2)
            return r1
        Ld:
            r1 = 0
            return r1
    }

    @Override // defpackage.tt7
    public final int d(defpackage.qh1 r3, defpackage.kk3 r4) {
            r2 = this;
            kk3 r0 = defpackage.kk3.Ltr
            if (r4 != r0) goto L7
            r0 = 8
            goto L8
        L7:
            r0 = 2
        L8:
            int r1 = r2.b
            r0 = r0 & r1
            if (r0 == 0) goto L14
            tt7 r2 = r2.a
            int r2 = r2.d(r3, r4)
            return r2
        L14:
            r2 = 0
            return r2
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof defpackage.qu3
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            qu3 r5 = (defpackage.qu3) r5
            tt7 r1 = r5.a
            tt7 r3 = r4.a
            boolean r1 = defpackage.nb3.k(r3, r1)
            if (r1 == 0) goto L1d
            int r4 = r4.b
            int r5 = r5.b
            if (r4 != r5) goto L1d
            return r0
        L1d:
            return r2
    }

    public final int hashCode() {
            r1 = this;
            tt7 r0 = r1.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            int r1 = r1.b
            int r1 = java.lang.Integer.hashCode(r1)
            int r1 = r1 + r0
            return r1
    }

    public final java.lang.String toString() {
            r5 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "("
            r0.<init>(r1)
            tt7 r1 = r5.a
            r0.append(r1)
            java.lang.String r1 = " only "
            r0.append(r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "WindowInsetsSides("
            r1.<init>(r2)
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            int r5 = r5.b
            int r3 = defpackage.iv7.a
            r4 = r5 & r3
            if (r4 != r3) goto L2a
            java.lang.String r3 = "Start"
            defpackage.iv7.b(r2, r3)
        L2a:
            int r3 = defpackage.iv7.c
            r4 = r5 & r3
            if (r4 != r3) goto L35
            java.lang.String r3 = "Left"
            defpackage.iv7.b(r2, r3)
        L35:
            r3 = r5 & 16
            r4 = 16
            if (r3 != r4) goto L40
            java.lang.String r3 = "Top"
            defpackage.iv7.b(r2, r3)
        L40:
            int r3 = defpackage.iv7.b
            r4 = r5 & r3
            if (r4 != r3) goto L4b
            java.lang.String r3 = "End"
            defpackage.iv7.b(r2, r3)
        L4b:
            int r3 = defpackage.iv7.d
            r4 = r5 & r3
            if (r4 != r3) goto L56
            java.lang.String r3 = "Right"
            defpackage.iv7.b(r2, r3)
        L56:
            r3 = 32
            r5 = r5 & r3
            if (r5 != r3) goto L60
            java.lang.String r5 = "Bottom"
            defpackage.iv7.b(r2, r5)
        L60:
            java.lang.String r5 = r2.toString()
            r1.append(r5)
            r5 = 41
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            return r5
    }
}
