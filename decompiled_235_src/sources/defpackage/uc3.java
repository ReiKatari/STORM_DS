package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uc3  reason: default package */
/* loaded from: classes.dex */
public abstract class uc3 extends ky3 implements il1, e43 {
    public ed3 Z;

    @Override // defpackage.il1
    public final void dispose() {
        p().m0(this);
    }

    @Override // defpackage.e43
    public final boolean e() {
        return true;
    }

    @Override // defpackage.e43
    public final gg4 f() {
        return null;
    }

    public rc3 getParent() {
        return p();
    }

    public final ed3 p() {
        ed3 ed3Var = this.Z;
        if (ed3Var != null) {
            return ed3Var;
        }
        nb3.a0("job");
        throw null;
    }

    public abstract boolean q();

    public abstract void r(Throwable th);

    @Override // defpackage.ky3
    public final String toString() {
        return getClass().getSimpleName() + '@' + nc1.P(this) + "[job@" + nc1.P(p()) + ']';
    }
}
