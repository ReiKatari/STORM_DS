package defpackage;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Iterator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: r97  reason: default package */
/* loaded from: classes.dex */
public final class r97 implements Iterator, zf3 {
    public final /* synthetic */ int A;
    public Iterator B;
    public final Object L;

    public r97(qd2 qd2Var) {
        this.A = 0;
        this.L = qd2Var;
        this.B = ((qb6) qd2Var.b).iterator();
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
                return ((qd2) obj).c.g(this.B.next());
            default:
                Object next = this.B.next();
                ArrayList arrayList = (ArrayList) obj;
                View view = (View) next;
                w0 w0Var = null;
                if (view instanceof ViewGroup) {
                    viewGroup = (ViewGroup) view;
                } else {
                    viewGroup = null;
                }
                if (viewGroup != null) {
                    w0Var = new w0(viewGroup, 10);
                }
                if (w0Var != null && w0Var.hasNext()) {
                    arrayList.add(this.B);
                    this.B = w0Var;
                } else {
                    while (!this.B.hasNext() && !arrayList.isEmpty()) {
                        this.B = (Iterator) gt0.Q0(arrayList);
                        gt0.Y0(arrayList);
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

    public r97(w0 w0Var) {
        this.A = 1;
        this.L = new ArrayList();
        this.B = w0Var;
    }
}
