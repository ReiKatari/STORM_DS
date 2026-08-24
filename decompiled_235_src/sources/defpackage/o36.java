package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o36  reason: default package */
/* loaded from: classes.dex */
public final class o36 extends r36 implements Iterator {
    public p36 A;
    public p36 B;
    public final /* synthetic */ int L;

    public o36(p36 p36Var, p36 p36Var2, int i) {
        this.L = i;
        this.A = p36Var2;
        this.B = p36Var;
    }

    @Override // defpackage.r36
    public final void a(p36 p36Var) {
        p36 p36Var2;
        p36 p36Var3 = null;
        if (this.A == p36Var && p36Var == this.B) {
            this.B = null;
            this.A = null;
        }
        p36 p36Var4 = this.A;
        if (p36Var4 == p36Var) {
            switch (this.L) {
                case 0:
                    p36Var2 = p36Var4.R;
                    break;
                default:
                    p36Var2 = p36Var4.L;
                    break;
            }
            this.A = p36Var2;
        }
        p36 p36Var5 = this.B;
        if (p36Var5 == p36Var) {
            p36 p36Var6 = this.A;
            if (p36Var5 != p36Var6 && p36Var6 != null) {
                p36Var3 = b(p36Var5);
            }
            this.B = p36Var3;
        }
    }

    public final p36 b(p36 p36Var) {
        switch (this.L) {
            case 0:
                return p36Var.L;
            default:
                return p36Var.R;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.B != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        p36 p36Var;
        p36 p36Var2 = this.B;
        p36 p36Var3 = this.A;
        if (p36Var2 != p36Var3 && p36Var3 != null) {
            p36Var = b(p36Var2);
        } else {
            p36Var = null;
        }
        this.B = p36Var;
        return p36Var2;
    }
}
