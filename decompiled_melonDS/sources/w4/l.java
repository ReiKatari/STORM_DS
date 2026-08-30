package w4;

import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l {

    /* renamed from: b  reason: collision with root package name */
    public static final l f14143b = new l(0);

    /* renamed from: c  reason: collision with root package name */
    public static final l f14144c = new l(1);

    /* renamed from: d  reason: collision with root package name */
    public static final l f14145d = new l(2);

    /* renamed from: a  reason: collision with root package name */
    public final int f14146a;

    public l(int i2) {
        this.f14146a = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        if (this.f14146a == ((l) obj).f14146a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f14146a;
    }

    public final String toString() {
        int i2 = this.f14146a;
        if (i2 == 0) {
            return "TextDecoration.None";
        }
        ArrayList arrayList = new ArrayList();
        if ((i2 & 1) != 0) {
            arrayList.add("Underline");
        }
        if ((i2 & 2) != 0) {
            arrayList.add("LineThrough");
        }
        if (arrayList.size() == 1) {
            return "TextDecoration." + ((String) arrayList.get(0));
        }
        return w.d.r(new StringBuilder("TextDecoration["), z4.a.a(arrayList, ", ", null, 62), ']');
    }
}
