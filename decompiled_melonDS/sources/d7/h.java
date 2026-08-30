package d7;

import a1.r;
import a1.x0;
import a7.x;
import d5.j;
import java.util.Iterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h implements Iterator, oc.a {
    public int A = -1;
    public boolean B;
    public final /* synthetic */ j L;

    public h(j jVar) {
        this.L = jVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.A + 1 < ((x0) this.L.f3862d).g()) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            this.B = true;
            int i2 = this.A + 1;
            this.A = i2;
            return (x) ((x0) this.L.f3862d).h(i2);
        }
        fj.j.l();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (this.B) {
            x0 x0Var = (x0) this.L.f3862d;
            ((x) x0Var.h(this.A)).L = null;
            int i2 = this.A;
            Object[] objArr = x0Var.L;
            Object obj = objArr[i2];
            Object obj2 = r.f91c;
            if (obj != obj2) {
                objArr[i2] = obj2;
                x0Var.A = true;
            }
            this.A = i2 - 1;
            this.B = false;
            return;
        }
        a0.j.p("You must call next() before you can remove an element");
    }
}
