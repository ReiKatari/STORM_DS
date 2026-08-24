package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rj5  reason: default package */
/* loaded from: classes.dex */
public final class rj5 {
    public int a;

    public /* synthetic */ rj5() {
            r1 = this;
            r0 = 524287(0x7ffff, float:7.34683E-40)
            r1.<init>(r0)
            return
    }

    public rj5(int r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.rj5
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            rj5 r4 = (defpackage.rj5) r4
            int r3 = r3.a
            int r4 = r4.a
            if (r3 == r4) goto L13
            return r2
        L13:
            return r0
    }

    public final int hashCode() {
            r0 = this;
            int r0 = r0.a
            int r0 = java.lang.Integer.hashCode(r0)
            return r0
    }

    public final java.lang.String toString() {
            r2 = this;
            int r2 = r2.a
            java.lang.String r0 = "Renderer3DDebugControlState(featureMask="
            java.lang.String r1 = ")"
            java.lang.String r2 = defpackage.lb1.k(r0, r2, r1)
            return r2
    }
}
