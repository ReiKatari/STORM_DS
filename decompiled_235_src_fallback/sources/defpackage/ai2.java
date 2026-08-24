package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ai2  reason: default package */
/* loaded from: classes.dex */
final class ai2 extends defpackage.e74 {
    public final defpackage.r94 a;

    public ai2(defpackage.r94 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.e74
    public final defpackage.z64 e() {
            r3 = this;
            di2 r0 = new di2
            r94 r3 = r3.a
            r1 = 1
            r2 = 0
            r0.<init>(r3, r1, r2)
            return r0
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            r0 = 1
            if (r3 != r4) goto L4
            return r0
        L4:
            boolean r1 = r4 instanceof defpackage.ai2
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            ai2 r4 = (defpackage.ai2) r4
            r94 r4 = r4.a
            r94 r3 = r3.a
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 != 0) goto L17
            return r2
        L17:
            return r0
    }

    @Override // defpackage.e74
    public final void g(defpackage.z64 r1) {
            r0 = this;
            di2 r1 = (defpackage.di2) r1
            r94 r0 = r0.a
            r1.V0(r0)
            return
    }

    public final int hashCode() {
            r0 = this;
            r94 r0 = r0.a
            if (r0 == 0) goto L9
            int r0 = r0.hashCode()
            return r0
        L9:
            r0 = 0
            return r0
    }
}
