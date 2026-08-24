package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ll5  reason: default package */
/* loaded from: classes.dex */
public final class ll5 {
    public final int a;
    public final defpackage.oj2 b;
    public final defpackage.mj2 c;

    public ll5(int r1, defpackage.oj2 r2, defpackage.mj2 r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.ll5
            if (r1 != 0) goto L9
            goto L27
        L9:
            ll5 r4 = (defpackage.ll5) r4
            int r1 = r4.a
            int r2 = r3.a
            if (r2 == r1) goto L12
            goto L27
        L12:
            oj2 r1 = r3.b
            oj2 r2 = r4.b
            boolean r1 = defpackage.nb3.k(r1, r2)
            if (r1 != 0) goto L1d
            goto L27
        L1d:
            mj2 r3 = r3.c
            mj2 r4 = r4.c
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L29
        L27:
            r3 = 0
            return r3
        L29:
            return r0
    }

    public final int hashCode() {
            r3 = this;
            int r0 = r3.a
            r1 = 31
            int r0 = r0 * r1
            oj2 r2 = r3.b
            int r2 = r2.A
            int r0 = r0 + r2
            int r0 = r0 * r1
            r2 = 0
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r0 = defpackage.lb1.a(r2, r0, r1)
            mj2 r3 = r3.c
            java.util.List r3 = r3.a
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ResourceFont(resId="
            r0.<init>(r1)
            int r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", weight="
            r0.append(r1)
            oj2 r2 = r2.b
            r0.append(r2)
            java.lang.String r2 = ", style="
            r0.append(r2)
            java.lang.String r2 = "Normal"
            r0.append(r2)
            java.lang.String r2 = ", loadingStrategy=Blocking)"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
