package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbvv extends zbsl implements RandomAccess {
    private static final zbvv zba = new zbvv(new Object[0], 0, false);
    private Object[] zbb;
    private int zbc;

    public zbvv() {
        this(new Object[10], 0, true);
    }

    public static zbvv zbe() {
        return zba;
    }

    private final String zbf(int i) {
        return lb1.j("Index:", i, this.zbc, ", Size:");
    }

    private final void zbg(int i) {
        if (i >= 0 && i < this.zbc) {
            return;
        }
        e41.q(zbf(i));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        zba();
        if (i >= 0 && i <= (i2 = this.zbc)) {
            int i3 = i + 1;
            Object[] objArr = this.zbb;
            if (i2 < objArr.length) {
                System.arraycopy(objArr, i, objArr, i3, i2 - i);
            } else {
                Object[] objArr2 = new Object[xg6.c(i2, 3, 2, 1)];
                System.arraycopy(objArr, 0, objArr2, 0, i);
                System.arraycopy(this.zbb, i, objArr2, i3, this.zbc - i);
                this.zbb = objArr2;
            }
            this.zbb[i] = obj;
            this.zbc++;
            ((AbstractList) this).modCount++;
            return;
        }
        e41.q(zbf(i));
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        zbg(i);
        return this.zbb[i];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        zba();
        zbg(i);
        Object[] objArr = this.zbb;
        Object obj = objArr[i];
        if (i < this.zbc - 1) {
            System.arraycopy(objArr, i + 1, objArr, i, (i2 - i) - 1);
        }
        this.zbc--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        zba();
        zbg(i);
        Object[] objArr = this.zbb;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        ((AbstractList) this).modCount++;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zbc;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbun
    public final /* bridge */ /* synthetic */ zbun zbd(int i) {
        if (i >= this.zbc) {
            return new zbvv(Arrays.copyOf(this.zbb, i), this.zbc, true);
        }
        u34.t();
        return null;
    }

    private zbvv(Object[] objArr, int i, boolean z) {
        super(z);
        this.zbb = objArr;
        this.zbc = i;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbsl, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        zba();
        int i = this.zbc;
        Object[] objArr = this.zbb;
        if (i == objArr.length) {
            this.zbb = Arrays.copyOf(objArr, ((i * 3) / 2) + 1);
        }
        Object[] objArr2 = this.zbb;
        int i2 = this.zbc;
        this.zbc = i2 + 1;
        objArr2[i2] = obj;
        ((AbstractList) this).modCount++;
        return true;
    }
}
