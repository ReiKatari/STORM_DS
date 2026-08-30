package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ss5  reason: default package */
/* loaded from: classes.dex */
public final class ss5 extends vs5 implements Iterator {
    public ts5 A;
    public ts5 B;
    public final /* synthetic */ int L;

    public ss5(ts5 ts5Var, ts5 ts5Var2, int i) {
        this.L = i;
        this.A = ts5Var2;
        this.B = ts5Var;
    }

    @Override // defpackage.vs5
    public final void a(ts5 ts5Var) {
        ts5 ts5Var2;
        ts5 ts5Var3 = null;
        if (this.A == ts5Var && ts5Var == this.B) {
            this.B = null;
            this.A = null;
        }
        ts5 ts5Var4 = this.A;
        if (ts5Var4 == ts5Var) {
            switch (this.L) {
                case 0:
                    ts5Var2 = ts5Var4.R;
                    break;
                default:
                    ts5Var2 = ts5Var4.L;
                    break;
            }
            this.A = ts5Var2;
        }
        ts5 ts5Var5 = this.B;
        if (ts5Var5 == ts5Var) {
            ts5 ts5Var6 = this.A;
            if (ts5Var5 != ts5Var6 && ts5Var6 != null) {
                ts5Var3 = b(ts5Var5);
            }
            this.B = ts5Var3;
        }
    }

    public final ts5 b(ts5 ts5Var) {
        switch (this.L) {
            case 0:
                return ts5Var.L;
            default:
                return ts5Var.R;
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
        ts5 ts5Var;
        ts5 ts5Var2 = this.B;
        ts5 ts5Var3 = this.A;
        if (ts5Var2 != ts5Var3 && ts5Var3 != null) {
            ts5Var = b(ts5Var2);
        } else {
            ts5Var = null;
        }
        this.B = ts5Var;
        return ts5Var2;
    }
}
