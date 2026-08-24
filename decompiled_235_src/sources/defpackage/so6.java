package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: so6  reason: default package */
/* loaded from: classes.dex */
public final class so6 implements r41, y61 {
    public final r41 A;
    public final l61 B;

    public so6(r41 r41Var, l61 l61Var) {
        this.A = r41Var;
        this.B = l61Var;
    }

    @Override // defpackage.r41
    public final l61 b() {
        return this.B;
    }

    @Override // defpackage.y61
    public final y61 f() {
        r41 r41Var = this.A;
        if (r41Var instanceof y61) {
            return (y61) r41Var;
        }
        return null;
    }

    @Override // defpackage.r41
    public final void i(Object obj) {
        this.A.i(obj);
    }
}
