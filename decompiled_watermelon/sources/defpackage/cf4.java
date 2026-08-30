package defpackage;

import java.util.RandomAccess;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cf4  reason: default package */
/* loaded from: classes.dex */
public final class cf4 extends y0 implements RandomAccess {
    public final w70[] A;
    public final int[] B;

    public cf4(w70[] w70VarArr, int[] iArr) {
        this.A = w70VarArr;
        this.B = iArr;
    }

    @Override // defpackage.k0
    public final int b() {
        return this.A.length;
    }

    @Override // defpackage.k0, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof w70)) {
            return false;
        }
        return super.contains((w70) obj);
    }

    @Override // java.util.List
    public final Object get(int i) {
        return this.A[i];
    }

    @Override // defpackage.y0, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof w70)) {
            return -1;
        }
        return super.indexOf((w70) obj);
    }

    @Override // defpackage.y0, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof w70)) {
            return -1;
        }
        return super.lastIndexOf((w70) obj);
    }
}
