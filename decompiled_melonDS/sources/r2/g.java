package r2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g extends a {
    public final Object[] L;
    public final j R;

    public g(Object[] objArr, Object[] objArr2, int i2, int i10, int i11) {
        super(i2, i10);
        this.L = objArr2;
        int i12 = (i10 - 1) & (-32);
        this.R = new j(objArr, i2 > i12 ? i12 : i2, i12, i11);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            j jVar = this.R;
            if (jVar.hasNext()) {
                this.A++;
                return jVar.next();
            }
            int i2 = this.A;
            this.A = i2 + 1;
            return this.L[i2 - jVar.B];
        }
        fj.j.l();
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            int i2 = this.A;
            j jVar = this.R;
            int i10 = jVar.B;
            if (i2 > i10) {
                int i11 = i2 - 1;
                this.A = i11;
                return this.L[i11 - i10];
            }
            this.A = i2 - 1;
            return jVar.previous();
        }
        fj.j.l();
        return null;
    }
}
