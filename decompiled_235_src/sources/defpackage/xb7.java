package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xb7  reason: default package */
/* loaded from: classes.dex */
public final class xb7 implements zc7 {
    public final ie7 A;
    public final boolean B;
    public final Class L;
    public final if3 R;
    public final be3 X;

    public xb7(Object obj, ie7 ie7Var, boolean z, Class cls) {
        this.R = (if3) obj;
        this.X = (be3) obj;
        this.A = ie7Var;
        this.B = z;
        this.L = cls;
    }

    @Override // defpackage.zc7
    public final yc7 a(su2 su2Var, ie7 ie7Var) {
        boolean isAssignableFrom;
        ie7 ie7Var2 = this.A;
        if (ie7Var2 != null) {
            if (!ie7Var2.equals(ie7Var) && (!this.B || ie7Var2.b != ie7Var.a)) {
                isAssignableFrom = false;
            } else {
                isAssignableFrom = true;
            }
        } else {
            isAssignableFrom = this.L.isAssignableFrom(ie7Var.a);
        }
        if (isAssignableFrom) {
            return new yb7(this.R, this.X, su2Var, ie7Var, this, true);
        }
        return null;
    }
}
