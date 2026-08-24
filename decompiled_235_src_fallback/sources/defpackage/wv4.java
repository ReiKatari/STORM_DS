package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wv4  reason: default package */
/* loaded from: classes.dex */
public final class wv4 extends defpackage.aw4 {
    public defpackage.xv4 Z;

    @Override // defpackage.aw4
    public final /* bridge */ /* synthetic */ defpackage.yv4 a() {
            r0 = this;
            xv4 r0 = r0.d()
            return r0
    }

    @Override // defpackage.aw4
    public final /* bridge */ /* synthetic */ defpackage.yv4 b() {
            r0 = this;
            xv4 r0 = r0.d()
            return r0
    }

    @Override // defpackage.aw4, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.l55
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            l55 r2 = (defpackage.l55) r2
            boolean r1 = super.containsKey(r2)
            return r1
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.nk7
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            nk7 r2 = (defpackage.nk7) r2
            boolean r1 = super.containsValue(r2)
            return r1
    }

    public final defpackage.xv4 d() {
            r3 = this;
            ac7 r0 = r3.L
            xv4 r1 = r3.Z
            ac7 r2 = r1.A
            if (r0 != r2) goto L9
            goto L1b
        L9:
            jd1 r0 = new jd1
            r1 = 15
            r0.<init>(r1)
            r3.B = r0
            xv4 r1 = new xv4
            ac7 r0 = r3.L
            int r2 = r3.Y
            r1.<init>(r0, r2)
        L1b:
            r3.Z = r1
            return r1
    }

    @Override // defpackage.aw4, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object get(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.l55
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            l55 r2 = (defpackage.l55) r2
            java.lang.Object r1 = super.get(r2)
            nk7 r1 = (defpackage.nk7) r1
            return r1
    }

    @Override // java.util.Map
    public final /* bridge */ java.lang.Object getOrDefault(java.lang.Object r2, java.lang.Object r3) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.l55
            if (r0 != 0) goto L5
            return r3
        L5:
            l55 r2 = (defpackage.l55) r2
            nk7 r3 = (defpackage.nk7) r3
            java.lang.Object r1 = super.getOrDefault(r2, r3)
            nk7 r1 = (defpackage.nk7) r1
            return r1
    }

    @Override // defpackage.aw4, java.util.AbstractMap, java.util.Map
    public final /* bridge */ java.lang.Object remove(java.lang.Object r2) {
            r1 = this;
            boolean r0 = r2 instanceof defpackage.l55
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            l55 r2 = (defpackage.l55) r2
            java.lang.Object r1 = super.remove(r2)
            nk7 r1 = (defpackage.nk7) r1
            return r1
    }
}
