package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gp4  reason: default package */
/* loaded from: classes.dex */
public final class gp4 {
    public final int a;

    public /* synthetic */ gp4(int r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.gp4
            if (r0 != 0) goto L5
            goto Ld
        L5:
            gp4 r2 = (defpackage.gp4) r2
            int r2 = r2.a
            int r1 = r1.a
            if (r1 == r2) goto Lf
        Ld:
            r1 = 0
            return r1
        Lf:
            r1 = 1
            return r1
    }

    public final int hashCode() {
            r0 = this;
            int r0 = r0.a
            int r0 = java.lang.Integer.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r1 = this;
            int r1 = r1.a
            java.lang.String r0 = "Output-"
            java.lang.String r1 = defpackage.lb1.g(r1, r0)
            return r1
    }
}
