package defpackage;

import android.graphics.Rect;
import java.util.Comparator;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: th2  reason: default package */
/* loaded from: classes.dex */
public final class th2 implements Comparator {
    public final Rect a = new Rect();
    public final Rect b = new Rect();
    public final boolean c;
    public final jd1 d;

    public th2(boolean z, jd1 jd1Var) {
        this.c = z;
        this.d = jd1Var;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.d.getClass();
        Rect rect = this.a;
        ((v2) obj).f(rect);
        Rect rect2 = this.b;
        ((v2) obj2).f(rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i >= i2) {
            if (i <= i2) {
                int i3 = rect.left;
                int i4 = rect2.left;
                boolean z = this.c;
                if (i3 < i4) {
                    if (!z) {
                        return -1;
                    }
                    return 1;
                } else if (i3 > i4) {
                    if (z) {
                        return -1;
                    }
                    return 1;
                } else {
                    int i5 = rect.bottom;
                    int i6 = rect2.bottom;
                    if (i5 >= i6) {
                        if (i5 <= i6) {
                            int i7 = rect.right;
                            int i8 = rect2.right;
                            if (i7 < i8) {
                                if (!z) {
                                    return -1;
                                }
                                return 1;
                            } else if (i7 > i8) {
                                if (z) {
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
