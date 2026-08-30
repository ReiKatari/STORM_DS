package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ey6  reason: default package */
/* loaded from: classes.dex */
public final class ey6 extends z0 {
    public int L;
    public Object[] R;
    public boolean X;

    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public ey6(Object[] objArr, int i, int i2, int i3) {
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
            objArr[i2] = objArr2[mj2.E(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    public final void c(int i) {
        int i2 = 0;
        while (mj2.E(this.A, i2) == i) {
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
        vd6.b();
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
        vd6.b();
        return null;
    }
}
