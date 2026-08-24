package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mj2  reason: default package */
/* loaded from: classes.dex */
public final class mj2 {
    public final java.util.List a;

    public mj2(defpackage.lj2... r11) {
            r10 = this;
            r10.<init>()
            int r0 = r11.length
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L5d
            r3 = r11[r2]
            java.lang.String r3 = r3.a()
            int r4 = r11.length
            r5 = r1
            r6 = r5
        L11:
            if (r5 >= r4) goto L24
            r7 = r11[r5]
            java.lang.String r7 = r7.a()
            boolean r7 = defpackage.nb3.k(r7, r3)
            if (r7 == 0) goto L21
            int r6 = r6 + 1
        L21:
            int r5 = r5 + 1
            goto L11
        L24:
            r4 = 1
            if (r6 != r4) goto L28
            goto L5a
        L28:
            java.lang.String r4 = "'"
            java.lang.String r5 = "' must be unique. Actual ["
            java.lang.StringBuilder r4 = defpackage.i61.t(r4, r3, r5)
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            int r6 = r11.length
            r7 = r1
        L37:
            if (r7 >= r6) goto L4b
            r8 = r11[r7]
            java.lang.String r9 = r8.a()
            boolean r9 = defpackage.nb3.k(r9, r3)
            if (r9 == 0) goto L48
            r5.add(r8)
        L48:
            int r7 = r7 + 1
            goto L37
        L4b:
            r4.append(r5)
            r3 = 93
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            defpackage.q53.a(r3)
        L5a:
            int r2 = r2 + 1
            goto L6
        L5d:
            java.util.List r11 = defpackage.fv.T0(r11)
            r10.a = r11
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.mj2
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            mj2 r4 = (defpackage.mj2) r4
            java.util.List r4 = r4.a
            java.util.List r3 = r3.a
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 != 0) goto L17
            return r2
        L17:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            java.util.List r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }
}
