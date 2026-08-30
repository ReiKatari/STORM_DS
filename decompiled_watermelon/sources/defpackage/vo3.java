package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vo3  reason: default package */
/* loaded from: classes.dex */
public final class vo3 implements Iterator {
    public xo3 A;
    public xo3 B = null;
    public int L;
    public final /* synthetic */ yo3 R;
    public final /* synthetic */ int X;

    public vo3(yo3 yo3Var, int i) {
        this.X = i;
        this.R = yo3Var;
        this.A = yo3Var.Y.R;
        this.L = yo3Var.X;
    }

    public final Object a() {
        return b();
    }

    public final xo3 b() {
        xo3 xo3Var = this.A;
        yo3 yo3Var = this.R;
        if (xo3Var != yo3Var.Y) {
            if (yo3Var.X == this.L) {
                this.A = xo3Var.R;
                this.B = xo3Var;
                return xo3Var;
            }
            throw new ConcurrentModificationException();
        }
        vd6.b();
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
        xo3 xo3Var = this.B;
        if (xo3Var != null) {
            yo3 yo3Var = this.R;
            yo3Var.c(xo3Var, true);
            this.B = null;
            this.L = yo3Var.X;
            return;
        }
        f81.o();
    }
}
