package bc;

import java.util.Comparator;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements Comparator {

    /* renamed from: b  reason: collision with root package name */
    public static final b f2160b = new b(0);

    /* renamed from: c  reason: collision with root package name */
    public static final b f2161c = new b(1);

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2162a;

    public /* synthetic */ b(int i2) {
        this.f2162a = i2;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f2162a) {
            case 0:
                Comparable comparable = (Comparable) obj;
                Comparable comparable2 = (Comparable) obj2;
                comparable.getClass();
                comparable2.getClass();
                return comparable.compareTo(comparable2);
            default:
                Comparable comparable3 = (Comparable) obj;
                Comparable comparable4 = (Comparable) obj2;
                comparable3.getClass();
                comparable4.getClass();
                return comparable4.compareTo(comparable3);
        }
    }

    @Override // java.util.Comparator
    public final Comparator reversed() {
        switch (this.f2162a) {
            case 0:
                return f2161c;
            default:
                return f2160b;
        }
    }
}
