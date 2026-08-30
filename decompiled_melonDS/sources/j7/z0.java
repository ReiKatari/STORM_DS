package j7;

import android.util.SparseArray;
import java.util.Set;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z0 {

    /* renamed from: a  reason: collision with root package name */
    public SparseArray f7750a;

    /* renamed from: b  reason: collision with root package name */
    public int f7751b;

    /* renamed from: c  reason: collision with root package name */
    public Set f7752c;

    public final y0 a(int i2) {
        SparseArray sparseArray = this.f7750a;
        y0 y0Var = (y0) sparseArray.get(i2);
        if (y0Var == null) {
            y0 y0Var2 = new y0();
            sparseArray.put(i2, y0Var2);
            return y0Var2;
        }
        return y0Var;
    }
}
