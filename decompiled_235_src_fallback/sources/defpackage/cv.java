package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cv  reason: default package */
/* loaded from: classes.dex */
public final class cv extends defpackage.z0 implements java.util.RandomAccess {
    public final /* synthetic */ int[] A;

    public cv(int[] r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // defpackage.l0
    public final int a() {
            r0 = this;
            int[] r0 = r0.A
            int r0 = r0.length
            return r0
    }

    @Override // defpackage.l0, java.util.Collection, java.util.List
    public final boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof java.lang.Integer
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            int[] r1 = r1.A
            boolean r1 = defpackage.fv.m0(r1, r2)
            return r1
    }

    @Override // java.util.List
    public final java.lang.Object get(int r1) {
            r0 = this;
            int[] r0 = r0.A
            r0 = r0[r1]
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            return r0
    }

    @Override // defpackage.z0, java.util.List
    public final int indexOf(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof java.lang.Integer
            r1 = -1
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            int[] r4 = r4.A
            int r0 = r4.length
            r2 = 0
        L10:
            if (r2 >= r0) goto L1a
            r3 = r4[r2]
            if (r5 != r3) goto L17
            return r2
        L17:
            int r2 = r2 + 1
            goto L10
        L1a:
            return r1
    }

    @Override // defpackage.l0, java.util.Collection, java.util.List
    public final boolean isEmpty() {
            r0 = this;
            int[] r0 = r0.A
            int r0 = r0.length
            if (r0 != 0) goto L7
            r0 = 1
            return r0
        L7:
            r0 = 0
            return r0
    }

    @Override // defpackage.z0, java.util.List
    public final int lastIndexOf(java.lang.Object r5) {
            r4 = this;
            boolean r0 = r5 instanceof java.lang.Integer
            r1 = -1
            if (r0 != 0) goto L6
            goto L1e
        L6:
            java.lang.Number r5 = (java.lang.Number) r5
            int r5 = r5.intValue()
            int[] r4 = r4.A
            int r0 = r4.length
            int r0 = r0 + r1
            if (r0 < 0) goto L1e
        L12:
            int r2 = r0 + (-1)
            r3 = r4[r0]
            if (r5 != r3) goto L19
            return r0
        L19:
            if (r2 >= 0) goto L1c
            goto L1e
        L1c:
            r0 = r2
            goto L12
        L1e:
            return r1
    }
}
