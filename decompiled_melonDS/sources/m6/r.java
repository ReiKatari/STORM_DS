package m6;

import android.util.SparseArray;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final SparseArray f9302a;

    /* renamed from: b  reason: collision with root package name */
    public u f9303b;

    public r(int i2) {
        this.f9302a = new SparseArray(i2);
    }

    public final void a(u uVar, int i2, int i10) {
        r rVar;
        int a10 = uVar.a(i2);
        SparseArray sparseArray = this.f9302a;
        if (sparseArray == null) {
            rVar = null;
        } else {
            rVar = (r) sparseArray.get(a10);
        }
        if (rVar == null) {
            rVar = new r(1);
            sparseArray.put(uVar.a(i2), rVar);
        }
        if (i10 > i2) {
            rVar.a(uVar, i2 + 1, i10);
        } else {
            rVar.f9303b = uVar;
        }
    }
}
