package r2;

import java.util.ConcurrentModificationException;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h extends a {
    public final f L;
    public int R;
    public j X;
    public int Y;

    public h(f fVar, int i2) {
        super(i2, fVar.f12614b0);
        this.L = fVar;
        this.R = fVar.e();
        this.Y = -1;
        b();
    }

    public final void a() {
        if (this.R == this.L.e()) {
            return;
        }
        throw new ConcurrentModificationException();
    }

    @Override // r2.a, java.util.ListIterator
    public final void add(Object obj) {
        a();
        int i2 = this.A;
        f fVar = this.L;
        fVar.add(i2, obj);
        this.A++;
        this.B = fVar.a();
        this.R = fVar.e();
        this.Y = -1;
        b();
    }

    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r6v4 */
    public final void b() {
        f fVar = this.L;
        Object[] objArr = fVar.Y;
        if (objArr == null) {
            this.X = null;
            return;
        }
        int i2 = (fVar.f12614b0 - 1) & (-32);
        int i10 = this.A;
        if (i10 > i2) {
            i10 = i2;
        }
        int i11 = (fVar.R / 5) + 1;
        j jVar = this.X;
        if (jVar == null) {
            this.X = new j(objArr, i10, i2, i11);
            return;
        }
        jVar.A = i10;
        jVar.B = i2;
        jVar.L = i11;
        if (jVar.R.length < i11) {
            jVar.R = new Object[i11];
        }
        ?? r62 = 0;
        jVar.R[0] = objArr;
        if (i10 == i2) {
            r62 = 1;
        }
        jVar.X = r62;
        jVar.b(i10 - r62, 1);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        a();
        if (hasNext()) {
            int i2 = this.A;
            this.Y = i2;
            j jVar = this.X;
            f fVar = this.L;
            if (jVar == null) {
                Object[] objArr = fVar.Z;
                this.A = i2 + 1;
                return objArr[i2];
            } else if (jVar.hasNext()) {
                this.A++;
                return jVar.next();
            } else {
                Object[] objArr2 = fVar.Z;
                int i10 = this.A;
                this.A = i10 + 1;
                return objArr2[i10 - jVar.B];
            }
        }
        fj.j.l();
        return null;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        a();
        if (hasPrevious()) {
            int i2 = this.A;
            this.Y = i2 - 1;
            j jVar = this.X;
            f fVar = this.L;
            if (jVar == null) {
                Object[] objArr = fVar.Z;
                int i10 = i2 - 1;
                this.A = i10;
                return objArr[i10];
            }
            int i11 = jVar.B;
            if (i2 > i11) {
                Object[] objArr2 = fVar.Z;
                int i12 = i2 - 1;
                this.A = i12;
                return objArr2[i12 - i11];
            }
            this.A = i2 - 1;
            return jVar.previous();
        }
        fj.j.l();
        return null;
    }

    @Override // r2.a, java.util.ListIterator, java.util.Iterator
    public final void remove() {
        a();
        int i2 = this.Y;
        if (i2 != -1) {
            f fVar = this.L;
            fVar.b(i2);
            int i10 = this.Y;
            if (i10 < this.A) {
                this.A = i10;
            }
            this.B = fVar.a();
            this.R = fVar.e();
            this.Y = -1;
            b();
            return;
        }
        throw new IllegalStateException();
    }

    @Override // r2.a, java.util.ListIterator
    public final void set(Object obj) {
        a();
        int i2 = this.Y;
        if (i2 != -1) {
            f fVar = this.L;
            fVar.set(i2, obj);
            this.R = fVar.e();
            b();
            return;
        }
        throw new IllegalStateException();
    }
}
