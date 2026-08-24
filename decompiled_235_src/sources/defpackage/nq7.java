package defpackage;

import java.util.UUID;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nq7  reason: default package */
/* loaded from: classes.dex */
public final class nq7 extends dk2 {
    public final String B;
    public int L;

    public nq7(cg0 cg0Var) {
        super(cg0Var);
        this.B = "virtual-" + cg0Var.d() + "-" + UUID.randomUUID().toString();
    }

    @Override // defpackage.dk2, defpackage.zf0
    public final int b() {
        return p(0);
    }

    @Override // defpackage.dk2, defpackage.cg0
    public final String d() {
        return this.B;
    }

    @Override // defpackage.dk2, defpackage.zf0
    public final int p(int i) {
        return k97.i(super.p(i) - this.L);
    }
}
