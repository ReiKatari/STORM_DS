package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbug extends zbsl implements RandomAccess, zbul {
    private static final zbug zba = new zbug(new int[0], 0, false);
    private int[] zbb;
    private int zbc;

    public zbug() {
        this(new int[10], 0, true);
    }

    public static zbug zbf() {
        return zba;
    }

    private final String zbh(int i) {
        return lb1.j("Index:", i, this.zbc, ", Size:");
    }

    private final void zbi(int i) {
        if (i >= 0 && i < this.zbc) {
            return;
        }
        e41.q(zbh(i));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        int i2;
        int intValue = ((Integer) obj).intValue();
        zba();
        if (i >= 0 && i <= (i2 = this.zbc)) {
            int i3 = i + 1;
            int[] iArr = this.zbb;
            if (i2 < iArr.length) {
                System.arraycopy(iArr, i, iArr, i3, i2 - i);
            } else {
                int[] iArr2 = new int[xg6.c(i2, 3, 2, 1)];
                System.arraycopy(iArr, 0, iArr2, 0, i);
                System.arraycopy(this.zbb, i, iArr2, i3, this.zbc - i);
                this.zbb = iArr2;
            }
            this.zbb[i] = intValue;
            this.zbc++;
            ((AbstractList) this).modCount++;
            return;
        }
        e41.q(zbh(i));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        zba();
        byte[] bArr = zbuo.zbb;
        collection.getClass();
        if (!(collection instanceof zbug)) {
            return super.addAll(collection);
        }
        zbug zbugVar = (zbug) collection;
        int i = zbugVar.zbc;
        if (i == 0) {
            return false;
        }
        int i2 = this.zbc;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            int[] iArr = this.zbb;
            if (i3 > iArr.length) {
                this.zbb = Arrays.copyOf(iArr, i3);
            }
            System.arraycopy(zbugVar.zbb, 0, this.zbb, this.zbc, zbugVar.zbc);
            this.zbc = i3;
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
        if (!(obj instanceof zbug)) {
            return super.equals(obj);
        }
        zbug zbugVar = (zbug) obj;
        if (this.zbc != zbugVar.zbc) {
            return false;
        }
        int[] iArr = zbugVar.zbb;
        for (int i = 0; i < this.zbc; i++) {
            if (this.zbb[i] != iArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zbi(i);
        return Integer.valueOf(this.zbb[i]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zbc; i2++) {
            i = (i * 31) + this.zbb[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int intValue = ((Integer) obj).intValue();
        int i = this.zbc;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zbb[i2] == intValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        int i2;
        zba();
        zbi(i);
        int[] iArr = this.zbb;
        int i3 = iArr[i];
        if (i < this.zbc - 1) {
            System.arraycopy(iArr, i + 1, iArr, i, (i2 - i) - 1);
        }
        this.zbc--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zba();
        if (i2 >= i) {
            int[] iArr = this.zbb;
            System.arraycopy(iArr, i2, iArr, i, this.zbc - i2);
            this.zbc -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        e41.q("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int intValue = ((Integer) obj).intValue();
        zba();
        zbi(i);
        int[] iArr = this.zbb;
        int i2 = iArr[i];
        iArr[i] = intValue;
        return Integer.valueOf(i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zbc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun
    public final /* bridge */ /* synthetic */ zbun zbd(int i) {
        if (i >= this.zbc) {
            return new zbug(Arrays.copyOf(this.zbb, i), this.zbc, true);
        }
        u34.t();
        return null;
    }

    public final int zbe(int i) {
        zbi(i);
        return this.zbb[i];
    }

    public final void zbg(int i) {
        zba();
        int i2 = this.zbc;
        int[] iArr = this.zbb;
        if (i2 == iArr.length) {
            int[] iArr2 = new int[xg6.c(i2, 3, 2, 1)];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            this.zbb = iArr2;
        }
        int[] iArr3 = this.zbb;
        int i3 = this.zbc;
        this.zbc = i3 + 1;
        iArr3[i3] = i;
    }

    private zbug(int[] iArr, int i, boolean z) {
        super(z);
        this.zbb = iArr;
        this.zbc = i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zbg(((Integer) obj).intValue());
        return true;
    }
}
