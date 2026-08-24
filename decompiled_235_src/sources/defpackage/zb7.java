package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zb7  reason: default package */
/* loaded from: classes.dex */
public final class zb7 extends a1 {
    public int L;
    public Object[] R;
    public boolean X;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [int, boolean] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public zb7(Object[] objArr, int i, int i2, int i3) {
        super(i, i2);
        ?? r5;
        this.L = i3;
        Object[] objArr2 = new Object[i3];
        this.R = objArr2;
        if (i == i2) {
            r5 = 1;
        } else {
            r5 = 0;
        }
        this.X = r5;
        objArr2[0] = objArr;
        b(i - r5, 1);
    }

    public final Object a() {
        Object obj = this.R[this.L - 1];
        obj.getClass();
        return ((Object[]) obj)[this.A & 31];
    }

    public final void b(int i, int i2) {
        int i3 = (this.L - i2) * 5;
        while (i2 < this.L) {
            Object[] objArr = this.R;
            Object[] objArr2 = objArr[i2 - 1];
            objArr2.getClass();
            objArr[i2] = objArr2[uj2.R(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    public final void c(int i) {
        int i2 = 0;
        while (uj2.R(this.A, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            b(this.A, ((this.L - 1) - (i2 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Object a = a();
            int i = this.A + 1;
            this.A = i;
            if (i == this.B) {
                this.X = true;
                return a;
            }
            c(0);
            return a;
        }
        fa6.c();
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
        fa6.c();
        return null;
    }
}
