package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z45  reason: default package */
/* loaded from: classes.dex */
public final class z45 extends j1 implements RandomAccess {
    public static final z45 R;
    public Object[] B;
    public int L;

    static {
        z45 z45Var = new z45(new Object[0], 0);
        R = z45Var;
        z45Var.A = false;
    }

    public z45(Object[] objArr, int i) {
        this.B = objArr;
        this.L = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        a();
        if (i >= 0 && i <= (i2 = this.L)) {
            Object[] objArr = this.B;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[xg6.c(i2, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.B, i, objArr2, i + 1, this.L - i);
                this.B = objArr2;
            }
            this.B[i] = obj;
            this.L++;
            ((AbstractList) this).modCount++;
            return;
        }
        u34.q(xg6.t("Index:", i, ", Size:"), this.L);
    }

    public final void b(int i) {
        if (i >= 0 && i < this.L) {
            return;
        }
        u34.q(xg6.t("Index:", i, ", Size:"), this.L);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        b(i);
        return this.B[i];
    }

    @Override // defpackage.z93
    public final z93 k(int i) {
        if (i >= this.L) {
            return new z45(Arrays.copyOf(this.B, i), this.L);
        }
        u34.t();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        a();
        b(i);
        Object[] objArr = this.B;
        Object obj = objArr[i];
        if (i < this.L - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.L--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        a();
        b(i);
        Object[] objArr = this.B;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.L;
    }

    @Override // defpackage.j1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a();
        int i = this.L;
        Object[] objArr = this.B;
        if (i == objArr.length) {
            this.B = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.B;
        int i2 = this.L;
        this.L = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
