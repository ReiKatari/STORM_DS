package fj;

import java.util.RandomAccess;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class v extends zb.e implements RandomAccess {
    public final h[] A;
    public final int[] B;

    public v(h[] hVarArr, int[] iArr) {
        this.A = hVarArr;
        this.B = iArr;
    }

    @Override // zb.b
    public final int a() {
        return this.A.length;
    }

    @Override // zb.b, java.util.Collection, java.util.List
    public final /* bridge */ boolean contains(Object obj) {
        if (!(obj instanceof h)) {
            return false;
        }
        return super.contains((h) obj);
    }

    @Override // java.util.List
    public final Object get(int i2) {
        return this.A[i2];
    }

    @Override // zb.e, java.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (!(obj instanceof h)) {
            return -1;
        }
        return super.indexOf((h) obj);
    }

    @Override // zb.e, java.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (!(obj instanceof h)) {
            return -1;
        }
        return super.lastIndexOf((h) obj);
    }
}
