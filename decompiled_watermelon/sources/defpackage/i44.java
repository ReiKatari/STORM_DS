package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i44  reason: default package */
/* loaded from: classes.dex */
public final class i44 implements Iterator, f93 {
    public int A = -1;
    public boolean B;
    public final /* synthetic */ vh0 L;

    public i44(vh0 vh0Var) {
        this.L = vh0Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.A + 1 < ((ec6) this.L.e).g()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.B = true;
            int i = this.A + 1;
            this.A = i;
            return (b44) ((ec6) this.L.e).h(i);
        }
        vd6.b();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.B) {
            ec6 ec6Var = (ec6) this.L.e;
            ((b44) ec6Var.h(this.A)).L = null;
            int i = this.A;
            Object[] objArr = ec6Var.L;
            Object obj = objArr[i];
            Object obj2 = jv3.j;
            if (obj != obj2) {
                objArr[i] = obj2;
                ec6Var.A = true;
            }
            this.A = i - 1;
            this.B = false;
            return;
        }
        i.n("You must call next() before you can remove an element");
    }
}
