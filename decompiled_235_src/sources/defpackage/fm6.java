package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fm6  reason: default package */
/* loaded from: classes.dex */
public final class fm6 extends hq6 {
    public long c;

    public fm6(long j, long j2) {
        super(j);
        this.c = j2;
    }

    @Override // defpackage.hq6
    public final void a(hq6 hq6Var) {
        hq6Var.getClass();
        this.c = ((fm6) hq6Var).c;
    }

    @Override // defpackage.hq6
    public final hq6 b(long j) {
        return new fm6(j, this.c);
    }
}
