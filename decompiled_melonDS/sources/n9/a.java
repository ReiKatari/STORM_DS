package n9;

import a0.j;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends ij.a {

    /* renamed from: e  reason: collision with root package name */
    public final int f10110e;

    public a(int i2) {
        this.f10110e = i2;
        if (i2 > 0) {
            return;
        }
        j.h("px must be > 0.");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            if (this.f10110e == ((a) obj).f10110e) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10110e;
    }

    public final String toString() {
        return String.valueOf(this.f10110e);
    }
}
