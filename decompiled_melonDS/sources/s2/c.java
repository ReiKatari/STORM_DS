package s2;

import java.util.Iterator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class c implements Iterator, oc.a {
    public final l[] A;
    public int B;
    public boolean L = true;

    public c(k kVar, l[] lVarArr) {
        this.A = lVarArr;
        lVarArr[0].a(kVar.f12821d, Integer.bitCount(kVar.f12818a) * 2, 0);
        this.B = 0;
        a();
    }

    public final void a() {
        int i2 = this.B;
        l[] lVarArr = this.A;
        l lVar = lVarArr[i2];
        if (lVar.L < lVar.B) {
            return;
        }
        while (-1 < i2) {
            int b10 = b(i2);
            if (b10 == -1) {
                l lVar2 = lVarArr[i2];
                int i10 = lVar2.L;
                Object[] objArr = lVar2.A;
                if (i10 < objArr.length) {
                    int length = objArr.length;
                    lVar2.L = i10 + 1;
                    b10 = b(i2);
                }
            }
            if (b10 != -1) {
                this.B = b10;
                return;
            }
            if (i2 > 0) {
                l lVar3 = lVarArr[i2 - 1];
                int i11 = lVar3.L;
                int length2 = lVar3.A.length;
                lVar3.L = i11 + 1;
            }
            lVarArr[i2].a(k.f12817e.f12821d, 0, 0);
            i2--;
        }
        this.L = false;
    }

    public final int b(int i2) {
        l[] lVarArr = this.A;
        l lVar = lVarArr[i2];
        int i10 = lVar.L;
        if (i10 < lVar.B) {
            return i2;
        }
        Object[] objArr = lVar.A;
        if (i10 < objArr.length) {
            int length = objArr.length;
            Object obj = objArr[i10];
            obj.getClass();
            k kVar = (k) obj;
            if (i2 == 6) {
                l lVar2 = lVarArr[i2 + 1];
                Object[] objArr2 = kVar.f12821d;
                lVar2.a(objArr2, objArr2.length, 0);
            } else {
                lVarArr[i2 + 1].a(kVar.f12821d, Integer.bitCount(kVar.f12818a) * 2, 0);
            }
            return b(i2 + 1);
        }
        return -1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.L;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (this.L) {
            Object next = this.A[this.B].next();
            a();
            return next;
        }
        fj.j.l();
        return null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
