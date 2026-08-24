package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: kq5  reason: default package */
/* loaded from: classes.dex */
public final class kq5 implements defpackage.n43 {
    public final boolean a;
    public final float b;
    public final long c;

    public kq5(float r1, long r2, boolean r4) {
            r0 = this;
            r0.<init>()
            r0.a = r4
            r0.b = r1
            r0.c = r2
            return
    }

    @Override // defpackage.n43
    public final defpackage.xg1 a(defpackage.r94 r4) {
            r3 = this;
            dh1 r0 = new dh1
            r1 = 1
            r0.<init>(r3, r1)
            eh1 r1 = new eh1
            boolean r2 = r3.a
            float r3 = r3.b
            r1.<init>(r4, r2, r3, r0)
            return r1
    }

    public final boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r3 instanceof defpackage.kq5
            if (r0 != 0) goto L9
            goto L1c
        L9:
            kq5 r3 = (defpackage.kq5) r3
            boolean r0 = r3.a
            boolean r1 = r2.a
            if (r1 == r0) goto L12
            goto L1c
        L12:
            float r0 = r2.b
            float r1 = r3.b
            boolean r0 = defpackage.om1.b(r0, r1)
            if (r0 != 0) goto L1e
        L1c:
            r2 = 0
            return r2
        L1e:
            long r0 = r2.c
            long r2 = r3.c
            boolean r2 = defpackage.kt0.d(r0, r2)
            return r2
    }

    @Override // defpackage.n43
    public final int hashCode() {
            r3 = this;
            boolean r0 = r3.a
            int r0 = java.lang.Boolean.hashCode(r0)
            int r0 = r0 * 31
            float r1 = r3.b
            r2 = 961(0x3c1, float:1.347E-42)
            int r0 = defpackage.xg6.a(r1, r0, r2)
            int r1 = defpackage.kt0.i
            long r1 = r3.c
            int r3 = java.lang.Long.hashCode(r1)
            int r3 = r3 + r0
            return r3
    }
}
