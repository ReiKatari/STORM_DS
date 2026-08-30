package a1;

import java.util.List;
import java.util.ListIterator;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e0 implements ListIterator, oc.a {
    public final /* synthetic */ int A;
    public final Object B;
    public int L;

    public e0(List list, int i2, int i10) {
        this.A = i10;
        switch (i10) {
            case DSiCameraSource.FrontCamera /* 1 */:
                this.B = list;
                this.L = i2;
                return;
            default:
                this.B = list;
                this.L = i2 - 1;
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator
    public final void add(Object obj) {
        switch (this.A) {
            case 0:
                int i2 = this.L + 1;
                this.L = i2;
                this.B.add(i2, obj);
                return;
            default:
                this.B.add(this.L, obj);
                this.L++;
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final boolean hasNext() {
        switch (this.A) {
            case 0:
                if (this.L < this.B.size() - 1) {
                    return true;
                }
                return false;
            default:
                if (this.L < this.B.size()) {
                    return true;
                }
                return false;
        }
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        switch (this.A) {
            case 0:
                if (this.L >= 0) {
                    return true;
                }
                return false;
            default:
                if (this.L > 0) {
                    return true;
                }
                return false;
        }
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.A) {
            case 0:
                int i2 = this.L + 1;
                this.L = i2;
                return this.B.get(i2);
            default:
                int i10 = this.L;
                this.L = i10 + 1;
                return this.B.get(i10);
        }
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        switch (this.A) {
            case 0:
                return this.L + 1;
            default:
                return this.L;
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.A) {
            case 0:
                int i2 = this.L;
                this.L = i2 - 1;
                return this.B.get(i2);
            default:
                int i10 = this.L - 1;
                this.L = i10;
                return this.B.get(i10);
        }
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        switch (this.A) {
            case 0:
                return this.L;
            default:
                return this.L - 1;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator, java.util.Iterator
    public final void remove() {
        switch (this.A) {
            case 0:
                this.B.remove(this.L);
                this.L--;
                return;
            default:
                int i2 = this.L - 1;
                this.L = i2;
                this.B.remove(i2);
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.List, java.lang.Object] */
    @Override // java.util.ListIterator
    public final void set(Object obj) {
        switch (this.A) {
            case 0:
                this.B.set(this.L, obj);
                return;
            default:
                this.B.set(this.L, obj);
                return;
        }
    }
}
