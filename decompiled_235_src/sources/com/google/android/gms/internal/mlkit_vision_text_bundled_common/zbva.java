package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbva extends zbsl implements RandomAccess, zbum {
    private static final zbva zba = new zbva(new long[0], 0, false);
    private long[] zbb;
    private int zbc;

    public zbva() {
        this(new long[10], 0, true);
    }

    public static zbva zbf() {
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
        long longValue = ((Long) obj).longValue();
        zba();
        if (i >= 0 && i <= (i2 = this.zbc)) {
            int i3 = i + 1;
            long[] jArr = this.zbb;
            if (i2 < jArr.length) {
                System.arraycopy(jArr, i, jArr, i3, i2 - i);
            } else {
                long[] jArr2 = new long[xg6.c(i2, 3, 2, 1)];
                System.arraycopy(jArr, 0, jArr2, 0, i);
                System.arraycopy(this.zbb, i, jArr2, i3, this.zbc - i);
                this.zbb = jArr2;
            }
            this.zbb[i] = longValue;
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
        if (!(collection instanceof zbva)) {
            return super.addAll(collection);
        }
        zbva zbvaVar = (zbva) collection;
        int i = zbvaVar.zbc;
        if (i == 0) {
            return false;
        }
        int i2 = this.zbc;
        if (Integer.MAX_VALUE - i2 >= i) {
            int i3 = i2 + i;
            long[] jArr = this.zbb;
            if (i3 > jArr.length) {
                this.zbb = Arrays.copyOf(jArr, i3);
            }
            System.arraycopy(zbvaVar.zbb, 0, this.zbb, this.zbc, zbvaVar.zbc);
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
        if (!(obj instanceof zbva)) {
            return super.equals(obj);
        }
        zbva zbvaVar = (zbva) obj;
        if (this.zbc != zbvaVar.zbc) {
            return false;
        }
        long[] jArr = zbvaVar.zbb;
        for (int i = 0; i < this.zbc; i++) {
            if (this.zbb[i] != jArr[i]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        zbi(i);
        return Long.valueOf(this.zbb[i]);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = 0; i2 < this.zbc; i2++) {
            long j = this.zbb[i2];
            byte[] bArr = zbuo.zbb;
            i = (i * 31) + ((int) (j ^ (j >>> 32)));
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long longValue = ((Long) obj).longValue();
        int i = this.zbc;
        for (int i2 = 0; i2 < i; i2++) {
            if (this.zbb[i2] == longValue) {
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
        long[] jArr = this.zbb;
        long j = jArr[i];
        if (i < this.zbc - 1) {
            System.arraycopy(jArr, i + 1, jArr, i, (i2 - i) - 1);
        }
        this.zbc--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i, int i2) {
        zba();
        if (i2 >= i) {
            long[] jArr = this.zbb;
            System.arraycopy(jArr, i2, jArr, i, this.zbc - i2);
            this.zbc -= i2 - i;
            ((AbstractList) this).modCount++;
            return;
        }
        e41.q("toIndex < fromIndex");
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        long longValue = ((Long) obj).longValue();
        zba();
        zbi(i);
        long[] jArr = this.zbb;
        long j = jArr[i];
        jArr[i] = longValue;
        return Long.valueOf(j);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zbc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun
    public final /* bridge */ /* synthetic */ zbun zbd(int i) {
        if (i >= this.zbc) {
            return new zbva(Arrays.copyOf(this.zbb, i), this.zbc, true);
        }
        u34.t();
        return null;
    }

    public final long zbe(int i) {
        zbi(i);
        return this.zbb[i];
    }

    public final void zbg(long j) {
        zba();
        int i = this.zbc;
        long[] jArr = this.zbb;
        if (i == jArr.length) {
            long[] jArr2 = new long[xg6.c(i, 3, 2, 1)];
            System.arraycopy(jArr, 0, jArr2, 0, i);
            this.zbb = jArr2;
        }
        long[] jArr3 = this.zbb;
        int i2 = this.zbc;
        this.zbc = i2 + 1;
        jArr3[i2] = j;
    }

    private zbva(long[] jArr, int i, boolean z) {
        super(z);
        this.zbb = jArr;
        this.zbc = i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        zbg(((Long) obj).longValue());
        return true;
    }
}
