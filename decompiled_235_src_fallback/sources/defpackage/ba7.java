package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ba7  reason: default package */
/* loaded from: classes.dex */
public final class ba7 implements defpackage.aa7 {
    public final java.lang.Object a;
    public final java.lang.Object b;

    public ba7(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    @Override // defpackage.aa7
    public final java.lang.Object a() {
            r0 = this;
            java.lang.Object r0 = r0.a
            return r0
    }

    @Override // defpackage.aa7
    public final java.lang.Object c() {
            r0 = this;
            java.lang.Object r0 = r0.b
            return r0
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof defpackage.aa7
            if (r0 == 0) goto L20
            aa7 r3 = (defpackage.aa7) r3
            java.lang.Object r0 = r3.a()
            java.lang.Object r1 = r2.a
            boolean r0 = defpackage.nb3.k(r1, r0)
            if (r0 == 0) goto L20
            java.lang.Object r2 = r2.b
            java.lang.Object r3 = r3.c()
            boolean r2 = defpackage.nb3.k(r2, r3)
            if (r2 == 0) goto L20
            r2 = 1
            return r2
        L20:
            r2 = 0
            return r2
    }

    public final int hashCode() {
            r2 = this;
            r0 = 0
            java.lang.Object r1 = r2.a
            if (r1 == 0) goto La
            int r1 = r1.hashCode()
            goto Lb
        La:
            r1 = r0
        Lb:
            int r1 = r1 * 31
            java.lang.Object r2 = r2.b
            if (r2 == 0) goto L15
            int r0 = r2.hashCode()
        L15:
            int r1 = r1 + r0
            return r1
    }
}
