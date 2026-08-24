package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o07  reason: default package */
/* loaded from: classes.dex */
final class o07 extends defpackage.e74 {
    public final defpackage.j27 a;

    public o07(defpackage.j27 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r1 = this;
            q07 r0 = new q07
            j27 r1 = r1.a
            r0.<init>(r1)
            return r0
    }

    public final boolean equals(java.lang.Object r2) {
            r1 = this;
            if (r1 != r2) goto L3
            goto L12
        L3:
            boolean r0 = r2 instanceof defpackage.o07
            if (r0 != 0) goto L8
            goto L10
        L8:
            o07 r2 = (defpackage.o07) r2
            j27 r2 = r2.a
            j27 r1 = r1.a
            if (r1 == r2) goto L12
        L10:
            r1 = 0
            return r1
        L12:
            r1 = 1
            return r1
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r1) {
            r0 = this;
            q07 r1 = (defpackage.q07) r1
            j27 r0 = r0.a
            r1.m0 = r0
            return
    }

    public final int hashCode() {
            r0 = this;
            j27 r0 = r0.a
            int r0 = r0.hashCode()
            return r0
    }
}
