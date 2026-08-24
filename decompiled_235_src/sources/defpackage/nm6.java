package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nm6  reason: default package */
/* loaded from: classes.dex */
public final class nm6 extends hq6 {
    public yv4 c;
    public int d;

    public nm6(long j, yv4 yv4Var) {
        super(j);
        this.c = yv4Var;
    }

    @Override // defpackage.hq6
    public final void a(hq6 hq6Var) {
        hq6Var.getClass();
        nm6 nm6Var = (nm6) hq6Var;
        synchronized (ak7.g) {
            this.c = nm6Var.c;
            this.d = nm6Var.d;
        }
    }

    @Override // defpackage.hq6
    public final hq6 b(long j) {
        return new nm6(j, this.c);
    }
}
