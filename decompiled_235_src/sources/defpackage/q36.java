package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q36  reason: default package */
/* loaded from: classes.dex */
public final class q36 extends r36 implements Iterator {
    public p36 A;
    public boolean B = true;
    public final /* synthetic */ s36 L;

    public q36(s36 s36Var) {
        this.L = s36Var;
    }

    @Override // defpackage.r36
    public final void a(p36 p36Var) {
        boolean z;
        p36 p36Var2 = this.A;
        if (p36Var == p36Var2) {
            p36 p36Var3 = p36Var2.R;
            this.A = p36Var3;
            if (p36Var3 == null) {
                z = true;
            } else {
                z = false;
            }
            this.B = z;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.B) {
            if (this.L.A != null) {
                return true;
            }
            return false;
        }
        p36 p36Var = this.A;
        if (p36Var != null && p36Var.L != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        p36 p36Var;
        if (this.B) {
            this.B = false;
            this.A = this.L.A;
        } else {
            p36 p36Var2 = this.A;
            if (p36Var2 != null) {
                p36Var = p36Var2.L;
            } else {
                p36Var = null;
            }
            this.A = p36Var;
        }
        return this.A;
    }
}
