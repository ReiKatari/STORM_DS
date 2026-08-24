package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u52  reason: default package */
/* loaded from: classes.dex */
public final class u52 extends defpackage.z0 implements defpackage.t52, java.util.RandomAccess, java.io.Serializable {
    public final java.lang.Enum[] A;

    public u52(java.lang.Enum[] r1) {
            r0 = this;
            r1.getClass()
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // defpackage.l0
    public final int a() {
            r0 = this;
            java.lang.Enum[] r0 = r0.A
            int r0 = r0.length
            return r0
    }

    @Override // defpackage.l0, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.lang.Enum
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Enum r3 = (java.lang.Enum) r3
            java.lang.Enum[] r2 = r2.A
            int r0 = r3.ordinal()
            java.lang.Object r2 = defpackage.fv.J0(r0, r2)
            java.lang.Enum r2 = (java.lang.Enum) r2
            if (r2 != r3) goto L18
            r2 = 1
            return r2
        L18:
            return r1
    }

    @Override // java.util.List
    public final java.lang.Object get(int r3) {
            r2 = this;
            java.lang.Enum[] r2 = r2.A
            int r0 = r2.length
            if (r3 < 0) goto La
            if (r3 >= r0) goto La
            r2 = r2[r3]
            return r2
        La:
            java.lang.String r2 = "index: "
            java.lang.String r1 = ", size: "
            java.lang.String r2 = defpackage.lb1.j(r2, r3, r0, r1)
            defpackage.e41.q(r2)
            r2 = 0
            return r2
    }

    @Override // defpackage.z0, java.util.List
    public final int indexOf(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.lang.Enum
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Enum r3 = (java.lang.Enum) r3
            int r0 = r3.ordinal()
            java.lang.Enum[] r2 = r2.A
            java.lang.Object r2 = defpackage.fv.J0(r0, r2)
            java.lang.Enum r2 = (java.lang.Enum) r2
            if (r2 != r3) goto L17
            return r0
        L17:
            return r1
    }

    @Override // defpackage.z0, java.util.List
    public final int lastIndexOf(java.lang.Object r3) {
            r2 = this;
            boolean r0 = r3 instanceof java.lang.Enum
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Enum r3 = (java.lang.Enum) r3
            int r0 = r3.ordinal()
            java.lang.Enum[] r2 = r2.A
            java.lang.Object r2 = defpackage.fv.J0(r0, r2)
            java.lang.Enum r2 = (java.lang.Enum) r2
            if (r2 != r3) goto L17
            return r0
        L17:
            return r1
    }
}
