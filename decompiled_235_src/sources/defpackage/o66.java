package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o66  reason: default package */
/* loaded from: classes.dex */
public class o66 extends q0 implements y61 {
    public final r41 Y;

    public o66(r41 r41Var, l61 l61Var) {
        super(l61Var, true);
        this.Y = r41Var;
    }

    @Override // defpackage.ed3
    public final boolean Y() {
        return true;
    }

    @Override // defpackage.ed3
    public void d(Object obj) {
        ok1.a(np2.V(this.Y), lb4.H(obj));
    }

    @Override // defpackage.y61
    public final y61 f() {
        r41 r41Var = this.Y;
        if (r41Var instanceof y61) {
            return (y61) r41Var;
        }
        return null;
    }

    @Override // defpackage.ed3
    public void g(Object obj) {
        this.Y.i(lb4.H(obj));
    }

    public void w0() {
    }
}
