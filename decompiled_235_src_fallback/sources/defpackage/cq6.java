package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cq6  reason: default package */
/* loaded from: classes.dex */
public final class cq6 implements java.util.Map.Entry, defpackage.bg3 {
    public final java.lang.Object A;
    public java.lang.Object B;
    public final /* synthetic */ defpackage.dq6 L;

    public cq6(defpackage.dq6 r2) {
            r1 = this;
            r1.<init>()
            r1.L = r2
            java.lang.Object r0 = r2.X
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0
            r0.getClass()
            java.lang.Object r0 = r0.getKey()
            r1.A = r0
            java.lang.Object r2 = r2.X
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            r2.getClass()
            java.lang.Object r2 = r2.getValue()
            r1.B = r2
            return
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getKey() {
            r0 = this;
            java.lang.Object r0 = r0.A
            return r0
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object getValue() {
            r0 = this;
            java.lang.Object r0 = r0.B
            return r0
    }

    @Override // java.util.Map.Entry
    public final java.lang.Object setValue(java.lang.Object r4) {
            r3 = this;
            dq6 r0 = r3.L
            java.lang.Object r1 = r0.L
            om6 r1 = (defpackage.om6) r1
            nm6 r2 = r1.d()
            int r2 = r2.d
            int r0 = r0.B
            if (r2 != r0) goto L1a
            java.lang.Object r0 = r3.B
            java.lang.Object r2 = r3.A
            r1.put(r2, r4)
            r3.B = r4
            return r0
        L1a:
            defpackage.i.l()
            r3 = 0
            return r3
    }
}
