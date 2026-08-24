package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sz  reason: default package */
/* loaded from: classes.dex */
public final class sz extends defpackage.e74 {
    public defpackage.rz a;
    public defpackage.tu0 b;

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r1 = this;
            rz r0 = new rz
            r0.<init>(r1)
            return r0
    }

    public final boolean equals(java.lang.Object r1) {
            r0 = this;
            if (r1 != r0) goto L4
            r0 = 1
            return r0
        L4:
            r0 = 0
            return r0
    }

    @Override // defpackage.e74
    public final /* bridge */ /* synthetic */ void g(defpackage.z64 r1) {
            r0 = this;
            rz r1 = (defpackage.rz) r1
            return
    }

    public final java.lang.Object h(defpackage.s41 r3) {
            r2 = this;
            tu0 r0 = r2.b
            if (r0 != 0) goto L16
            tu0 r0 = new tu0
            r0.<init>()
            r2.b = r0
            rz r2 = r2.a
            if (r2 == 0) goto L16
            boolean r1 = r2.j0
            if (r1 == 0) goto L16
            r2.R0()
        L16:
            java.lang.Object r2 = r0.q(r3)
            x61 r3 = defpackage.x61.COROUTINE_SUSPENDED
            if (r2 != r3) goto L1f
            return r2
        L1f:
            jg7 r2 = defpackage.jg7.a
            return r2
    }

    public final int hashCode() {
            r0 = this;
            r0 = 234(0xea, float:3.28E-43)
            return r0
    }
}
