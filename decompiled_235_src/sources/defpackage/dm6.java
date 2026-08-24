package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dm6  reason: default package */
/* loaded from: classes.dex */
public final class dm6 extends hq6 {
    public float c;

    public dm6(float f, long j) {
        super(j);
        this.c = f;
    }

    @Override // defpackage.hq6
    public final void a(hq6 hq6Var) {
        hq6Var.getClass();
        this.c = ((dm6) hq6Var).c;
    }

    @Override // defpackage.hq6
    public final hq6 b(long j) {
        return new dm6(this.c, j);
    }
}
