package a6;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f0 implements Iterator, oc.a {
    public final /* synthetic */ int A;
    public Iterator B;
    public final Object L;

    public f0(uc.j jVar) {
        this.A = 1;
        this.L = jVar;
        this.B = jVar.f13547b.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.A) {
            case 0:
                return this.B.hasNext();
            default:
                return this.B.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        ViewGroup viewGroup;
        switch (this.A) {
            case 0:
                Object next = this.B.next();
                ArrayList arrayList = (ArrayList) this.L;
                View view = (View) next;
                a1.z0 z0Var = null;
                if (view instanceof ViewGroup) {
                    viewGroup = (ViewGroup) view;
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    z0Var = new a1.z0(1, viewGroup);
                }
                if (z0Var != null && z0Var.hasNext()) {
                    arrayList.add(this.B);
                    this.B = z0Var;
                } else {
                    while (!this.B.hasNext() && !arrayList.isEmpty()) {
                        this.B = (Iterator) zb.l.Z(arrayList);
                        zb.l.h0(arrayList);
                    }
                }
                return next;
            default:
                return ((uc.j) this.L).f13548c.k(this.B.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public f0(a1.z0 z0Var) {
        this.A = 0;
        this.L = new ArrayList();
        this.B = z0Var;
    }
}
