package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbtm extends zbsl implements RandomAccess, zbun {
    private double[] zba;
    private int zbb;

    static {
        new zbtm(new double[0], 0, false);
    }

    public zbtm() {
        this(new double[10], 0, true);
    }

    private final String zbg(int i) {
        return lb1.j("Index:", i, this.zbb, ", Size:");
    }

    private final void zbh(int i) {
        if (i >= 0 && i < this.zbb) {
            return;
        }
        e41.q(zbg(i));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        double doubleValue = ((Double) obj).doubleValue();
        zba();
        if (i >= 0 && i <= (i2 = this.zbb)) {
            int i3 = i + 1;
            double[] dArr = this.zba;
            if (i2 < dArr.length) {
                System.arraycopy(dArr, i, dArr, i3, i2 - i);
            } else {
                double[] dArr2 = new double[xg6.c(i2, 3, 2, 1)];
                System.arraycopy(dArr, 0, dArr2, 0, i);
                System.arraycopy(this.zba, i, dArr2, i3, this.zbb - i);
                this.zba = dArr2;
            }
            this.zba[i] = doubleValue;
            this.zbb++;
            ((AbstractList) this).modCount++;
            return;
        }
        e41.q(zbg(i));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zba();
        byte[] bArr = zbuo.zbb;
        collection.getClass();
        if (!(collection instanceof zbtm)) {
            return super.addAll(collection);
        }
        zbtm zbtmVar = (zbtm) collection;
        int i = zbtmVar.zbb;
        if (i == 0) {
            return false;
        }
        int i2 = this.zbb;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            double[] dArr = this.zba;
            if (i3 > dArr.length) {
                this.zba = Arrays.copyOf(dArr, i3);
            }
            System.arraycopy(zbtmVar.zba, 0, this.zba, this.zbb, zbtmVar.zbb);
            this.zbb = i3;
            ((AbstractList) this).modCount++;
            return true;
        }
        throw new OutOfMemoryError();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (indexOf(obj) != -1) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zbtm)) {
            return super.equals(obj);
        }
        zbtm zbtmVar = (zbtm) obj;
        if (this.zbb != zbtmVar.zbb) {
            return false;
        }
        double[] dArr = zbtmVar.zba;
        for (int i = 0; i < this.zbb; i++) {
            if (Double.doubleToLongBits(this.zba[i]) != Double.doubleToLongBits(dArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zbh(i);
        return Double.valueOf(this.zba[i]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zbb; i2++) {
            long doubleToLongBits = Double.doubleToLongBits(this.zba[i2]);
            byte[] bArr = zbuo.zbb;
            i = (i * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double doubleValue = ((Double) obj).doubleValue();
        int i = this.zbb;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zba[i2] == doubleValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        zba();
        zbh(i);
        double[] dArr = this.zba;
        double d = dArr[i];
        if (i < this.zbb - 1) {
            System.arraycopy(dArr, i + 1, dArr, i, (i2 - i) - 1);
        }
        this.zbb--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zba();
        if (i2 >= i) {
            double[] dArr = this.zba;
            System.arraycopy(dArr, i2, dArr, i, this.zbb - i2);
            this.zbb -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        e41.q("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        double doubleValue = ((Double) obj).doubleValue();
        zba();
        zbh(i);
        double[] dArr = this.zba;
        double d = dArr[i];
        dArr[i] = doubleValue;
        return Double.valueOf(d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zbb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun
    public final /* bridge */ /* synthetic */ zbun zbd(int i) {
        if (i >= this.zbb) {
            return new zbtm(Arrays.copyOf(this.zba, i), this.zbb, true);
        }
        u34.t();
        return null;
    }

    public final double zbe(int i) {
        zbh(i);
        return this.zba[i];
    }

    public final void zbf(double d) {
        zba();
        int i = this.zbb;
        double[] dArr = this.zba;
        if (i == dArr.length) {
            double[] dArr2 = new double[xg6.c(i, 3, 2, 1)];
            System.arraycopy(dArr, 0, dArr2, 0, i);
            this.zba = dArr2;
        }
        double[] dArr3 = this.zba;
        int i2 = this.zbb;
        this.zbb = i2 + 1;
        dArr3[i2] = d;
    }

    private zbtm(double[] dArr, int i, boolean z) {
        super(z);
        this.zba = dArr;
        this.zbb = i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zbf(((Double) obj).doubleValue());
        return true;
    }
}
