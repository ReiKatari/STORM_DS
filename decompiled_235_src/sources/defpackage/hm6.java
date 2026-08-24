package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hm6  reason: default package */
/* loaded from: classes.dex */
public final class hm6 extends hq6 {
    public Object c;

    public hm6(long j, Object obj) {
        super(j);
        this.c = obj;
    }

    @Override // defpackage.hq6
    public final void a(hq6 hq6Var) {
        hq6Var.getClass();
        this.c = ((hm6) hq6Var).c;
    }

    @Override // defpackage.hq6
    public final hq6 b(long j) {
        return new hm6(bm6.j().g(), this.c);
    }
}
