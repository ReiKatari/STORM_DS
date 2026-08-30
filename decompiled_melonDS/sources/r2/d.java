package r2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends a {
    public final /* synthetic */ int L = 1;
    public final Object R;

    public d(Object[] objArr, int i2, int i10) {
        super(i2, i10);
        this.R = objArr;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        switch (this.L) {
            case 0:
                if (hasNext()) {
                    int i2 = this.A;
                    this.A = i2 + 1;
                    return ((Object[]) this.R)[i2];
                }
                fj.j.l();
                return null;
            default:
                if (hasNext()) {
                    this.A++;
                    return this.R;
                }
                fj.j.l();
                return null;
        }
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        switch (this.L) {
            case 0:
                if (hasPrevious()) {
                    int i2 = this.A - 1;
                    this.A = i2;
                    return ((Object[]) this.R)[i2];
                }
                fj.j.l();
                return null;
            default:
                if (hasPrevious()) {
                    this.A--;
                    return this.R;
                }
                fj.j.l();
                return null;
        }
    }

    public d(int i2, Object obj) {
        super(i2, 1);
        this.R = obj;
    }
}
