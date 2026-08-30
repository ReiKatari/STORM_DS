package r2;

import p7.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j extends a {
    public int L;
    public Object[] R;
    public boolean X;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public j(Object[] objArr, int i2, int i10, int i11) {
        super(i2, i10);
        ?? r5;
        this.L = i11;
        Object[] objArr2 = new Object[i11];
        this.R = objArr2;
        if (i2 == i10) {
            r5 = 1;
        } else {
            r5 = 0;
        }
        this.X = r5;
        objArr2[0] = objArr;
        b(i2 - r5, 1);
    }

    public final Object a() {
        Object obj = this.R[this.L - 1];
        obj.getClass();
        return ((Object[]) obj)[this.A & 31];
    }

    public final void b(int i2, int i10) {
        int i11 = (this.L - i10) * 5;
        while (i10 < this.L) {
            Object[] objArr = this.R;
            Object[] objArr2 = objArr[i10 - 1];
            objArr2.getClass();
            objArr[i10] = objArr2[k.q(i2, i11)];
            i11 -= 5;
            i10++;
        }
    }

    public final void c(int i2) {
        int i10 = 0;
        while (k.q(this.A, i10) == i2) {
            i10 += 5;
        }
        if (i10 > 0) {
            b(this.A, ((this.L - 1) - (i10 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Object a10 = a();
            int i2 = this.A + 1;
            this.A = i2;
            if (i2 == this.B) {
                this.X = true;
                return a10;
            }
            c(0);
            return a10;
        }
        fj.j.l();
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (hasPrevious()) {
            this.A--;
            if (this.X) {
                this.X = false;
                return a();
            }
            c(31);
            return a();
        }
        fj.j.l();
        return null;
    }
}
