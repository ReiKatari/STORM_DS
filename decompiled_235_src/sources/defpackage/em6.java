package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: em6  reason: default package */
/* loaded from: classes.dex */
public final class em6 extends hq6 {
    public int c;

    public em6(int i, long j) {
        super(j);
        this.c = i;
    }

    @Override // defpackage.hq6
    public final void a(hq6 hq6Var) {
        hq6Var.getClass();
        this.c = ((em6) hq6Var).c;
    }

    @Override // defpackage.hq6
    public final hq6 b(long j) {
        return new em6(this.c, j);
    }
}
