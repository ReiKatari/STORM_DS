package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uk4  reason: default package */
/* loaded from: classes.dex */
public final class uk4 extends yl5 {
    public final n34 B;
    public final long L;

    public uk4(n34 n34Var, long j) {
        this.B = n34Var;
        this.L = j;
    }

    @Override // defpackage.yl5
    public final long h() {
        return this.L;
    }

    @Override // defpackage.yl5
    public final n34 k() {
        return this.B;
    }

    @Override // defpackage.yl5
    public final z80 n() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
