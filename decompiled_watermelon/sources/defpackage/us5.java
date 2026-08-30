package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: us5  reason: default package */
/* loaded from: classes.dex */
public final class us5 extends vs5 implements Iterator {
    public ts5 A;
    public boolean B = true;
    public final /* synthetic */ ws5 L;

    public us5(ws5 ws5Var) {
        this.L = ws5Var;
    }

    @Override // defpackage.vs5
    public final void a(ts5 ts5Var) {
        boolean z;
        ts5 ts5Var2 = this.A;
        if (ts5Var == ts5Var2) {
            ts5 ts5Var3 = ts5Var2.R;
            this.A = ts5Var3;
            if (ts5Var3 == null) {
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
        ts5 ts5Var = this.A;
        if (ts5Var != null && ts5Var.L != null) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        ts5 ts5Var;
        if (this.B) {
            this.B = false;
            this.A = this.L.A;
        } else {
            ts5 ts5Var2 = this.A;
            if (ts5Var2 != null) {
                ts5Var = ts5Var2.L;
            } else {
                ts5Var = null;
            }
            this.A = ts5Var;
        }
        return this.A;
    }
}
