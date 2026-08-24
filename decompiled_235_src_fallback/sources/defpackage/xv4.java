package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xv4  reason: default package */
/* loaded from: classes.dex */
public final class xv4 extends defpackage.yv4 implements defpackage.hy0 {
    public static final defpackage.xv4 R = null;

    static {
            xv4 r0 = new xv4
            ac7 r1 = defpackage.ac7.e
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.xv4.R = r0
            return
    }

    @Override // defpackage.yv4
    public final defpackage.aw4 a() {
            r1 = this;
            wv4 r0 = new wv4
            r0.<init>(r1)
            r0.Z = r1
            return r0
    }

    @Override // defpackage.yv4
    public final defpackage.aw4 b() {
            r1 = this;
            wv4 r0 = new wv4
            r0.<init>(r1)
            r0.Z = r1
            return r0
    }

    @Override // defpackage.yv4, java.util.Map
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

    @Override // defpackage.yv4, java.util.Map
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

    public final defpackage.xv4 d(defpackage.l55 r4, defpackage.nk7 r5) {
            r3 = this;
            int r0 = r4.hashCode()
            r1 = 0
            ac7 r2 = r3.A
            zb r4 = r2.u(r4, r0, r1, r5)
            if (r4 != 0) goto Le
            return r3
        Le:
            xv4 r5 = new xv4
            java.lang.Object r0 = r4.L
            ac7 r0 = (defpackage.ac7) r0
            int r3 = r3.B
            int r4 = r4.B
            int r3 = r3 + r4
            r5.<init>(r0, r3)
            return r5
    }

    @Override // defpackage.yv4, java.util.Map
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
}
