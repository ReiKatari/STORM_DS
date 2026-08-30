package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hl1  reason: default package */
/* loaded from: classes.dex */
public final class hl1 implements Iterator, f93 {
    public final /* synthetic */ int A;
    public final Iterator B;
    public int L;

    public hl1(nm6 nm6Var) {
        this.A = 2;
        this.L = 50;
        this.B = nm6Var.a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i = this.A;
        Iterator it = this.B;
        switch (i) {
            case 0:
                break;
            case 1:
                return it.hasNext();
            default:
                if (this.L > 0 && it.hasNext()) {
                    return true;
                }
                return false;
        }
        while (this.L > 0 && it.hasNext()) {
            it.next();
            this.L--;
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.A;
        Iterator it = this.B;
        switch (i) {
            case 0:
                break;
            case 1:
                int i2 = this.L;
                this.L = i2 + 1;
                if (i2 >= 0) {
                    return new fy2(i2, it.next());
                }
                l07.v0();
                throw null;
            default:
                int i3 = this.L;
                if (i3 != 0) {
                    this.L = i3 - 1;
                    return it.next();
                }
                vd6.b();
                return null;
        }
        while (this.L > 0 && it.hasNext()) {
            it.next();
            this.L--;
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.A) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public hl1(Iterator it) {
        this.A = 1;
        it.getClass();
        this.B = it;
    }

    public hl1(il1 il1Var) {
        this.A = 0;
        this.B = il1Var.a.iterator();
        this.L = il1Var.b;
    }
}
