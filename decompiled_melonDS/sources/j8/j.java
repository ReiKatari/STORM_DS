package j8;

import android.graphics.Rect;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j {

    /* renamed from: a  reason: collision with root package name */
    public final h8.b f7777a;

    /* renamed from: b  reason: collision with root package name */
    public final float f7778b;

    public j(Rect rect, float f8) {
        this.f7777a = new h8.b(rect);
        this.f7778b = f8;
    }

    public final boolean equals(Object obj) {
        Class<?> cls;
        if (this == obj) {
            return true;
        }
        if (obj != null) {
            cls = obj.getClass();
        } else {
            cls = null;
        }
        if (!j.class.equals(cls)) {
            return false;
        }
        obj.getClass();
        j jVar = (j) obj;
        if (nc.k.a(this.f7777a, jVar.f7777a) && this.f7778b == jVar.f7778b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(this.f7778b) + (this.f7777a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WindowMetrics(_bounds=");
        sb2.append(this.f7777a);
        sb2.append(", density=");
        return w.d.o(sb2, this.f7778b, ')');
    }

    public j(h8.b bVar, float f8) {
        this.f7777a = bVar;
        this.f7778b = f8;
    }
}
