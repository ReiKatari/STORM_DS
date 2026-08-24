package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xv3  reason: default package */
/* loaded from: classes.dex */
public final class xv3 implements Iterator {
    public zv3 A;
    public zv3 B = null;
    public int L;
    public final /* synthetic */ aw3 R;
    public final /* synthetic */ int X;

    public xv3(aw3 aw3Var, int i) {
        this.X = i;
        this.R = aw3Var;
        this.A = aw3Var.Y.R;
        this.L = aw3Var.X;
    }

    public final Object a() {
        return b();
    }

    public final zv3 b() {
        zv3 zv3Var = this.A;
        aw3 aw3Var = this.R;
        if (zv3Var != aw3Var.Y) {
            if (aw3Var.X == this.L) {
                this.A = zv3Var.R;
                this.B = zv3Var;
                return zv3Var;
            }
            i.l();
            return null;
        }
        fa6.c();
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.A != this.R.Y) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.X) {
            case 1:
                return b().Y;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        zv3 zv3Var = this.B;
        if (zv3Var != null) {
            aw3 aw3Var = this.R;
            aw3Var.c(zv3Var, true);
            this.B = null;
            this.L = aw3Var.X;
            return;
        }
        e41.m();
    }
}
