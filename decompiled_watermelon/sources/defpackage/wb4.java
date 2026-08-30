package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wb4  reason: default package */
/* loaded from: classes.dex */
public final class wb4 extends gc5 {
    public final cw3 B;
    public final long L;

    public wb4(cw3 cw3Var, long j) {
        this.B = cw3Var;
        this.L = j;
    }

    @Override // defpackage.gc5
    public final long d() {
        return this.L;
    }

    @Override // defpackage.gc5
    public final cw3 i() {
        return this.B;
    }

    @Override // defpackage.gc5
    public final u60 p() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
