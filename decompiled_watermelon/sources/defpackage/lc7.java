package defpackage;

import java.util.UUID;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lc7  reason: default package */
/* loaded from: classes.dex */
public final class lc7 extends ef2 {
    public final String B;
    public int L;

    public lc7(td0 td0Var) {
        super(td0Var);
        this.B = "virtual-" + td0Var.f() + "-" + UUID.randomUUID().toString();
    }

    @Override // defpackage.ef2, defpackage.qd0
    public final int b() {
        return g(0);
    }

    @Override // defpackage.ef2, defpackage.td0
    public final String f() {
        return this.B;
    }

    @Override // defpackage.ef2, defpackage.qd0
    public final int g(int i) {
        return tw6.i(super.g(i) - this.L);
    }
}
