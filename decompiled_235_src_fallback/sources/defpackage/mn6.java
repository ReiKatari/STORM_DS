package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mn6  reason: default package */
/* loaded from: classes.dex */
public final class mn6 extends defpackage.ja2 {
    public final defpackage.b33 a;
    public final java.lang.String b;
    public final defpackage.zb1 c;

    public mn6(defpackage.b33 r1, java.lang.String r2, defpackage.zb1 r3) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L23
        L3:
            boolean r0 = r3 instanceof defpackage.mn6
            if (r0 == 0) goto L25
            mn6 r3 = (defpackage.mn6) r3
            b33 r0 = r3.a
            b33 r1 = r2.a
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L25
            java.lang.String r0 = r2.b
            java.lang.String r1 = r3.b
            boolean r0 = defpackage.nb3.k(r0, r1)
            if (r0 == 0) goto L25
            zb1 r2 = r2.c
            zb1 r3 = r3.c
            if (r2 != r3) goto L25
        L23:
            r2 = 1
            return r2
        L25:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r2 = this;
            b33 r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            java.lang.String r1 = r2.b
            if (r1 == 0) goto L11
            int r1 = r1.hashCode()
            goto L12
        L11:
            r1 = 0
        L12:
            int r0 = r0 + r1
            int r0 = r0 * 31
            zb1 r2 = r2.c
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            return r2
    }
}
