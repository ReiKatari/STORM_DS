package j6;

import android.graphics.Rect;
import b6.g;
import java.util.Comparator;
import x8.e;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    public final Rect f7460a = new Rect();

    /* renamed from: b  reason: collision with root package name */
    public final Rect f7461b = new Rect();

    /* renamed from: c  reason: collision with root package name */
    public final boolean f7462c;

    /* renamed from: d  reason: collision with root package name */
    public final e f7463d;

    public b(boolean z10, e eVar) {
        this.f7462c = z10;
        this.f7463d = eVar;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.f7463d.getClass();
        Rect rect = this.f7460a;
        ((g) obj).f(rect);
        Rect rect2 = this.f7461b;
        ((g) obj2).f(rect2);
        int i2 = rect.top;
        int i10 = rect2.top;
        if (i2 >= i10) {
            if (i2 <= i10) {
                int i11 = rect.left;
                int i12 = rect2.left;
                boolean z10 = this.f7462c;
                if (i11 < i12) {
                    if (!z10) {
                        return -1;
                    }
                    return 1;
                } else if (i11 > i12) {
                    if (z10) {
                        return -1;
                    }
                    return 1;
                } else {
                    int i13 = rect.bottom;
                    int i14 = rect2.bottom;
                    if (i13 >= i14) {
                        if (i13 <= i14) {
                            int i15 = rect.right;
                            int i16 = rect2.right;
                            if (i15 < i16) {
                                if (!z10) {
                                    return -1;
                                }
                                return 1;
                            } else if (i15 > i16) {
                                if (z10) {
                                    return -1;
                                }
                                return 1;
                            } else {
                                return 0;
                            }
                        }
                        return 1;
                    }
                    return -1;
                }
            }
            return 1;
        }
        return -1;
    }
}
