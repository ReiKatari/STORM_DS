package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mv1  reason: default package */
/* loaded from: classes.dex */
public final class mv1 implements defpackage.ov1 {
    public final java.lang.String a;
    public final java.util.List b;
    public final int c;
    public final defpackage.qn2 d;

    public mv1(int r1, defpackage.qn2 r2, java.lang.String r3, java.util.List r4) {
            r0 = this;
            r0.<init>()
            r0.a = r3
            r0.b = r4
            r0.c = r1
            r0.d = r2
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L33
        L3:
            boolean r0 = r3 instanceof defpackage.mv1
            if (r0 != 0) goto L8
            goto L31
        L8:
            mv1 r3 = (defpackage.mv1) r3
            java.lang.String r0 = r2.a
            java.lang.String r1 = r3.a
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L15
            goto L31
        L15:
            java.util.List r0 = r2.b
            java.util.List r1 = r3.b
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L20
            goto L31
        L20:
            int r0 = r2.c
            int r1 = r3.c
            if (r0 == r1) goto L27
            goto L31
        L27:
            qn2 r2 = r2.d
            qn2 r3 = r3.d
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L33
        L31:
            r2 = 0
            return r2
        L33:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.a
            int r0 = r0.hashCode()
            r1 = 31
            int r0 = r0 * r1
            java.util.List r2 = r3.b
            int r0 = defpackage.i61.b(r0, r2, r1)
            int r2 = r3.c
            int r0 = defpackage.lb1.a(r2, r0, r1)
            qn2 r3 = r3.d
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Choice(title="
            r0.<init>(r1)
            java.lang.String r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", labels="
            r0.append(r1)
            java.util.List r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", selectedIndex="
            r0.append(r1)
            int r1 = r2.c
            r0.append(r1)
            java.lang.String r1 = ", onSelect="
            r0.append(r1)
            qn2 r2 = r2.d
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
