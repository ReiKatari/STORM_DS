package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s0  reason: default package */
/* loaded from: classes.dex */
public abstract class s0 implements Iterator, f93 {
    public int A;
    public Object B;

    public abstract void a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.A;
        if (i != 0) {
            if (i == 1) {
                return true;
            }
            if (i == 2) {
                return false;
            }
            i.i("hasNext called when the iterator is in the FAILED state.");
            return false;
        }
        this.A = 3;
        a();
        if (this.A != 1) {
            return false;
        }
        return true;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.A;
        if (i == 1) {
            this.A = 0;
            return this.B;
        }
        if (i != 2) {
            this.A = 3;
            a();
            if (this.A == 1) {
                this.A = 0;
                return this.B;
            }
        }
        vd6.b();
        return null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
