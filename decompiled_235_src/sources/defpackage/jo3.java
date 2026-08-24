package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jo3  reason: default package */
/* loaded from: classes.dex */
public final class jo3 extends kg1 {
    public final r41 Y;

    public jo3(l61 l61Var, eo2 eo2Var) {
        super(l61Var, false);
        this.Y = np2.F(eo2Var, this, this);
    }

    @Override // defpackage.ed3
    public final void j0() {
        try {
            ok1.a(np2.V(this.Y), jg7.a);
        } catch (Throwable th) {
            th = th;
            if (th instanceof mk1) {
                th = ((mk1) th).A;
            }
            i(oi2.p(th));
            throw th;
        }
    }
}
