package g2;

import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g2 {

    /* renamed from: a  reason: collision with root package name */
    public final Map f5159a;

    public g2(Map map) {
        this.f5159a = map;
    }

    public final Object a(float f8) {
        Object next;
        Iterator it = this.f5159a.entrySet().iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                float abs = Math.abs(f8 - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    Object next2 = it.next();
                    float abs2 = Math.abs(f8 - ((Number) ((Map.Entry) next2).getValue()).floatValue());
                    if (Float.compare(abs, abs2) > 0) {
                        next = next2;
                        abs = abs2;
                    }
                } while (it.hasNext());
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public final Object b(float f8, boolean z10) {
        Object next;
        float f10;
        float f11;
        Iterator it = this.f5159a.entrySet().iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                float floatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                if (z10) {
                    f10 = floatValue - f8;
                } else {
                    f10 = f8 - floatValue;
                }
                if (f10 < 0.0f) {
                    f10 = Float.POSITIVE_INFINITY;
                }
                do {
                    Object next2 = it.next();
                    float floatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    if (z10) {
                        f11 = floatValue2 - f8;
                    } else {
                        f11 = f8 - floatValue2;
                    }
                    if (f11 < 0.0f) {
                        f11 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f10, f11) > 0) {
                        next = next2;
                        f10 = f11;
                    }
                } while (it.hasNext());
            }
        }
        Map.Entry entry = (Map.Entry) next;
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    public final float c(Object obj) {
        Float f8 = (Float) this.f5159a.get(obj);
        if (f8 != null) {
            return f8.floatValue();
        }
        return Float.NaN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g2)) {
            return false;
        }
        return nc.k.a(this.f5159a, ((g2) obj).f5159a);
    }

    public final int hashCode() {
        return this.f5159a.hashCode() * 31;
    }

    public final String toString() {
        return "MapDraggableAnchors(" + this.f5159a + ')';
    }
}
