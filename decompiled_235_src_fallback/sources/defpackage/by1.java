package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: by1  reason: default package */
/* loaded from: classes.dex */
public final class by1 extends defpackage.hy1 {
    public final java.lang.String a;

    public by1(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L16
        L3:
            boolean r0 = r2 instanceof defpackage.by1
            if (r0 != 0) goto L8
            goto L14
        L8:
            by1 r2 = (defpackage.by1) r2
            java.lang.String r1 = r1.a
            java.lang.String r2 = r2.a
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L16
        L14:
            r1 = 0
            return r1
        L16:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            java.lang.String r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.String r0 = "RomNotFoundError(romPath="
            java.lang.String r1 = ")"
            java.lang.String r2 = r2.a
            java.lang.String r2 = defpackage.lb1.A(r0, r2, r1)
            return r2
    }
}
