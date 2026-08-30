package l4;

import java.util.Comparator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f8794a;

    public /* synthetic */ g(int i2) {
        this.f8794a = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f8794a) {
            case 0:
                return d0.d.M(Integer.valueOf(((f) obj).f8791b), Integer.valueOf(((f) obj2).f8791b));
            default:
                return d0.d.M(Integer.valueOf(((f) obj).f8791b), Integer.valueOf(((f) obj2).f8791b));
        }
    }
}
