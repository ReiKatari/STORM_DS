package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bq6  reason: default package */
/* loaded from: classes.dex */
public final class bq6 extends hq6 {
    public h1 c;
    public int d;
    public int e;

    public bq6(long j, h1 h1Var) {
        super(j);
        this.c = h1Var;
    }

    @Override // defpackage.hq6
    public final void a(hq6 hq6Var) {
        synchronized (ge7.i) {
            hq6Var.getClass();
            this.c = ((bq6) hq6Var).c;
            this.d = ((bq6) hq6Var).d;
            this.e = ((bq6) hq6Var).e;
        }
    }

    @Override // defpackage.hq6
    public final hq6 b(long j) {
        return new bq6(j, this.c);
    }
}
