package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x66  reason: default package */
/* loaded from: classes.dex */
public final class x66 {
    public final defpackage.ko4 a;
    public final defpackage.w66 b;
    public final me.magnum.melonds.domain.model.Rect c;

    public x66(defpackage.ko4 r1, defpackage.w66 r2, me.magnum.melonds.domain.model.Rect r3) {
            r0 = this;
            r1.getClass()
            r2.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            r0.c = r3
            return
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L3
            goto L24
        L3:
            boolean r0 = r3 instanceof defpackage.x66
            if (r0 != 0) goto L8
            goto L22
        L8:
            x66 r3 = (defpackage.x66) r3
            ko4 r0 = r2.a
            ko4 r1 = r3.a
            if (r0 == r1) goto L11
            goto L22
        L11:
            w66 r0 = r2.b
            w66 r1 = r3.b
            if (r0 == r1) goto L18
            goto L22
        L18:
            me.magnum.melonds.domain.model.Rect r2 = r2.c
            me.magnum.melonds.domain.model.Rect r3 = r3.c
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L24
        L22:
            r2 = 0
            return r2
        L24:
            r2 = 1
            return r2
    }

    public final int hashCode() {
            r2 = this;
            ko4 r0 = r2.a
            int r0 = r0.hashCode()
            int r0 = r0 * 31
            w66 r1 = r2.b
            int r1 = r1.hashCode()
            int r1 = r1 + r0
            int r1 = r1 * 31
            me.magnum.melonds.domain.model.Rect r2 = r2.c
            int r2 = r2.hashCode()
            int r2 = r2 + r1
            return r2
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ScreenFold(orientation="
            r0.<init>(r1)
            ko4 r1 = r2.a
            r0.append(r1)
            java.lang.String r1 = ", type="
            r0.append(r1)
            w66 r1 = r2.b
            r0.append(r1)
            java.lang.String r1 = ", foldBounds="
            r0.append(r1)
            me.magnum.melonds.domain.model.Rect r2 = r2.c
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}
