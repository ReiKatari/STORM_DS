package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbss extends zbsl implements RandomAccess, zbun {
    private boolean[] zba;
    private int zbb;

    static {
        new zbss(new boolean[0], 0, false);
    }

    public zbss() {
        this(new boolean[10], 0, true);
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
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zba();
        if (i >= 0 && i <= (i2 = this.zbb)) {
            int i3 = i + 1;
            boolean[] zArr = this.zba;
            if (i2 < zArr.length) {
                System.arraycopy(zArr, i, zArr, i3, i2 - i);
            } else {
                boolean[] zArr2 = new boolean[xg6.c(i2, 3, 2, 1)];
                System.arraycopy(zArr, 0, zArr2, 0, i);
                System.arraycopy(this.zba, i, zArr2, i3, this.zbb - i);
                this.zba = zArr2;
            }
            this.zba[i] = booleanValue;
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
        if (!(collection instanceof zbss)) {
            return super.addAll(collection);
        }
        zbss zbssVar = (zbss) collection;
        int i = zbssVar.zbb;
        if (i == 0) {
            return false;
        }
        int i2 = this.zbb;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            boolean[] zArr = this.zba;
            if (i3 > zArr.length) {
                this.zba = Arrays.copyOf(zArr, i3);
            }
            System.arraycopy(zbssVar.zba, 0, this.zba, this.zbb, zbssVar.zbb);
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
        if (!(obj instanceof zbss)) {
            return super.equals(obj);
        }
        zbss zbssVar = (zbss) obj;
        if (this.zbb != zbssVar.zbb) {
            return false;
        }
        boolean[] zArr = zbssVar.zba;
        for (int i = 0; i < this.zbb; i++) {
            if (this.zba[i] != zArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zbh(i);
        return Boolean.valueOf(this.zba[i]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zbb; i2++) {
            i = (i * 31) + zbuo.zba(this.zba[i2]);
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        int i = this.zbb;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zba[i2] == booleanValue) {
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
        boolean[] zArr = this.zba;
        boolean z = zArr[i];
        if (i < this.zbb - 1) {
            System.arraycopy(zArr, i + 1, zArr, i, (i2 - i) - 1);
        }
        this.zbb--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zba();
        if (i2 >= i) {
            boolean[] zArr = this.zba;
            System.arraycopy(zArr, i2, zArr, i, this.zbb - i2);
            this.zbb -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        e41.q("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        boolean booleanValue = ((Boolean) obj).booleanValue();
        zba();
        zbh(i);
        boolean[] zArr = this.zba;
        boolean z = zArr[i];
        zArr[i] = booleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zbb;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun
    public final /* bridge */ /* synthetic */ zbun zbd(int i) {
        if (i >= this.zbb) {
            return new zbss(Arrays.copyOf(this.zba, i), this.zbb, true);
        }
        u34.t();
        return null;
    }

    public final void zbe(boolean z) {
        zba();
        int i = this.zbb;
        boolean[] zArr = this.zba;
        if (i == zArr.length) {
            boolean[] zArr2 = new boolean[xg6.c(i, 3, 2, 1)];
            System.arraycopy(zArr, 0, zArr2, 0, i);
            this.zba = zArr2;
        }
        boolean[] zArr3 = this.zba;
        int i2 = this.zbb;
        this.zbb = i2 + 1;
        zArr3[i2] = z;
    }

    public final boolean zbf(int i) {
        zbh(i);
        return this.zba[i];
    }

    private zbss(boolean[] zArr, int i, boolean z) {
        super(z);
        this.zba = zArr;
        this.zbb = i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zbe(((Boolean) obj).booleanValue());
        return true;
    }
}
