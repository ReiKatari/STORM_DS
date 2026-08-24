package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q87  reason: default package */
/* loaded from: classes.dex */
public final class q87 {
    public final int a;

    public /* synthetic */ q87(int r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.q87
            if (r0 != 0) goto L5
            goto Ld
        L5:
            q87 r2 = (defpackage.q87) r2
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
            r2 = this;
            java.lang.String r0 = "TorchMode(value="
            r1 = 41
            int r2 = r2.a
            java.lang.String r2 = defpackage.xg6.o(r0, r2, r1)
            return r2
    }
}
