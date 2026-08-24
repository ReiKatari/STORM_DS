package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cy2  reason: default package */
/* loaded from: classes.dex */
public final class cy2 extends defpackage.e74 {
    public final defpackage.c40 a;

    public cy2(defpackage.c40 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r1 = this;
            dy2 r0 = new dy2
            r0.<init>()
            c40 r1 = r1.a
            r0.k0 = r1
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L4
            r1 = 1
            return r1
        L4:
            boolean r0 = r2 instanceof defpackage.cy2
            if (r0 == 0) goto Lb
            cy2 r2 = (defpackage.cy2) r2
            goto Lc
        Lb:
            r2 = 0
        Lc:
            if (r2 != 0) goto L10
            r1 = 0
            return r1
        L10:
            c40 r1 = r1.a
            c40 r2 = r2.a
            boolean r1 = r1.equals(r2)
            return r1
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r1) {
            r0 = this;
            dy2 r1 = (defpackage.dy2) r1
            c40 r0 = r0.a
            r1.k0 = r0
            return
    }

    public final int hashCode() {
            r0 = this;
            c40 r0 = r0.a
            float r0 = r0.a
            int r0 = java.lang.Float.hashCode(r0)
            return r0
    }
}
