package oe;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: b  reason: collision with root package name */
    public static final List f10965b = p7.t.y(new yb.p((byte) 0), new yb.p((byte) 9), new yb.p((byte) 191));

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f10966a;

    public z(ArrayList arrayList) {
        this.f10966a = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof z) || !this.f10966a.equals(((z) obj).f10966a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f10966a.hashCode();
    }

    public final String toString() {
        String upperCase = zb.l.Y(this.f10966a, ":", null, null, new od.x(1), 30).toUpperCase(Locale.ROOT);
        upperCase.getClass();
        return upperCase;
    }
}
