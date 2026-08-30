package i8;

import java.util.ArrayList;
import java.util.List;
import m9.o;
import p7.t;
import w.d;
import x8.e;
import zb.l;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f7027c = 0;

    /* renamed from: a  reason: collision with root package name */
    public final int f7028a;

    /* renamed from: b  reason: collision with root package name */
    public final int f7029b;

    static {
        e eVar = new e(26);
        List y10 = t.y(0, 600, 840);
        ArrayList e02 = l.e0(y10, t.y(1200, 1600));
        List y11 = t.y(0, 480, 900);
        e.e(eVar, y10, y11);
        e.e(eVar, e02, y11);
    }

    public a(int i2, int i10) {
        this.f7028a = i2;
        this.f7029b = i10;
        if (i2 >= 0) {
            if (i10 >= 0) {
                return;
            }
            o.p(i10, "Expected minHeightDp to be at least 0, minHeightDp: ");
            throw null;
        }
        o.p(i2, "Expected minWidthDp to be at least 0, minWidthDp: ");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f7028a == aVar.f7028a && this.f7029b == aVar.f7029b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (this.f7028a * 31) + this.f7029b;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WindowSizeClass(minWidthDp=");
        sb2.append(this.f7028a);
        sb2.append(", minHeightDp=");
        return d.p(sb2, this.f7029b, ')');
    }
}
