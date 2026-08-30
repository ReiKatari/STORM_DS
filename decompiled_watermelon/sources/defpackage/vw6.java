package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vw6  reason: default package */
/* loaded from: classes.dex */
public final class vw6 implements Iterator, f93 {
    public final /* synthetic */ int A;
    public Iterator B;
    public final Object L;

    public vw6(y82 y82Var) {
        this.A = 0;
        this.L = y82Var;
        this.B = y82Var.b.iterator();
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
        int i = this.A;
        Object obj = this.L;
        switch (i) {
            case 0:
                return ((y82) obj).c.n(this.B.next());
            default:
                Object next = this.B.next();
                ArrayList arrayList = (ArrayList) obj;
                View view = (View) next;
                v0 v0Var = null;
                if (view instanceof ViewGroup) {
                    viewGroup = (ViewGroup) view;
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    v0Var = new v0(10, viewGroup);
                }
                if (v0Var != null && v0Var.hasNext()) {
                    arrayList.add(this.B);
                    this.B = v0Var;
                } else {
                    while (!this.B.hasNext() && !arrayList.isEmpty()) {
                        this.B = (Iterator) tq0.T0(arrayList);
                        tq0.b1(arrayList);
                    }
                }
                return next;
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

    public vw6(v0 v0Var) {
        this.A = 1;
        this.L = new ArrayList();
        this.B = v0Var;
    }
}
