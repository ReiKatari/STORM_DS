package defpackage;

import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ym4  reason: default package */
/* loaded from: classes.dex */
public final class ym4 implements Iterator, f93 {
    public final /* synthetic */ int A = 1;
    public final Iterator B;

    public ym4(vm4 vm4Var) {
        gy6[] gy6VarArr = new gy6[8];
        for (int i = 0; i < 8; i++) {
            gy6VarArr[i] = new iy6(this);
        }
        this.B = new wm4(vm4Var, gy6VarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.A) {
            case 0:
                return ((wm4) this.B).L;
            default:
                return this.B.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.A) {
            case 0:
                return (Map.Entry) ((wm4) this.B).next();
            default:
                return (g77) this.B.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.A) {
            case 0:
                ((wm4) this.B).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public ym4(e77 e77Var) {
        this.B = e77Var.e0.iterator();
    }
}
