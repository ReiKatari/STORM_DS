package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pt6  reason: default package */
/* loaded from: classes.dex */
public final class pt6 {
    public final st6 a;
    public gn3 b;
    public final ot6 c = new ot6(this, 2);
    public final ot6 d = new ot6(this, 0);
    public final ot6 e = new ot6(this, 1);

    public pt6(st6 st6Var) {
        this.a = st6Var;
    }

    public final gn3 a() {
        gn3 gn3Var = this.b;
        if (gn3Var != null) {
            return gn3Var;
        }
        i.h("SubcomposeLayoutState is not attached to SubcomposeLayout");
        return null;
    }
}
