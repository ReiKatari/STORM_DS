package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eo4  reason: default package */
/* loaded from: classes.dex */
public final class eo4 extends defpackage.z0 implements java.util.RandomAccess {
    public final defpackage.da0[] A;
    public final int[] B;

    public eo4(defpackage.da0[] r1, int[] r2) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            return
    }

    @Override // defpackage.l0
    public final int a() {
            r0 = this;
            da0[] r0 = r0.A
            int r0 = r0.length
            return r0
    }

    @Override // defpackage.l0, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.da0
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            da0 r2 = (defpackage.da0) r2
            boolean r1 = super.contains(r2)
            return r1
    }

    @Override // java.util.List
    public final java.lang.Object get(int r1) {
            r0 = this;
            da0[] r0 = r0.A
            r0 = r0[r1]
            return r0
    }

    @Override // defpackage.z0, java.util.List
    public final /* bridge */ int indexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.da0
            if (r0 != 0) goto L6
            r1 = -1
            return r1
        L6:
            da0 r2 = (defpackage.da0) r2
            int r1 = super.indexOf(r2)
            return r1
    }

    @Override // defpackage.z0, java.util.List
    public final /* bridge */ int lastIndexOf(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.da0
            if (r0 != 0) goto L6
            r1 = -1
            return r1
        L6:
            da0 r2 = (defpackage.da0) r2
            int r1 = super.lastIndexOf(r2)
            return r1
    }
}
