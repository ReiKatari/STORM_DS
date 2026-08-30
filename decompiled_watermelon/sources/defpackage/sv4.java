package defpackage;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sv4  reason: default package */
/* loaded from: classes.dex */
public final class sv4 extends i1 implements RandomAccess {
    public static final sv4 R;
    public Object[] B;
    public int L;

    static {
        sv4 sv4Var = new sv4(0, new Object[0]);
        R = sv4Var;
        sv4Var.A = false;
    }

    public sv4(int i, Object[] objArr) {
        this.B = objArr;
        this.L = i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        b();
        if (i >= 0 && i <= (i2 = this.L)) {
            Object[] objArr = this.B;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
            } else {
                Object[] objArr2 = new Object[((i2 * 3) / 2) + 1];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.B, i, objArr2, i + 1, this.L - i);
                this.B = objArr2;
            }
            this.B[i] = obj;
            this.L++;
            ((AbstractList) this).modCount++;
            return;
        }
        c44.p(wh1.s("Index:", i, ", Size:"), this.L);
    }

    public final void c(int i) {
        if (i >= 0 && i < this.L) {
            return;
        }
        c44.p(wh1.s("Index:", i, ", Size:"), this.L);
    }

    @Override // defpackage.r33
    public final r33 e(int i) {
        if (i >= this.L) {
            return new sv4(this.L, Arrays.copyOf(this.B, i));
        }
        c44.r();
        return null;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        c(i);
        return this.B[i];
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        b();
        c(i);
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
        b();
        c(i);
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

    @Override // defpackage.i1, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        b();
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
