package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nq7  reason: default package */
/* loaded from: classes.dex */
public final class nq7 extends defpackage.dk2 {
    public final java.lang.String B;
    public int L;

    public nq7(defpackage.cg0 r3) {
            r2 = this;
            r2.<init>(r3)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "virtual-"
            r0.<init>(r1)
            java.lang.String r3 = r3.d()
            r0.append(r3)
            java.lang.String r3 = "-"
            r0.append(r3)
            java.util.UUID r3 = java.util.UUID.randomUUID()
            java.lang.String r3 = r3.toString()
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.B = r3
            return
    }

    @Override // defpackage.dk2, defpackage.zf0
    public final int b() {
            r1 = this;
            r0 = 0
            int r1 = r1.p(r0)
            return r1
    }

    @Override // defpackage.dk2, defpackage.cg0
    public final java.lang.String d() {
            r0 = this;
            java.lang.String r0 = r0.B
            return r0
    }

    @Override // defpackage.dk2, defpackage.zf0
    public final int p(int r1) {
            r0 = this;
            int r1 = super.p(r1)
            int r0 = r0.L
            int r1 = r1 - r0
            int r0 = defpackage.k97.i(r1)
            return r0
    }
}
