package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pt3  reason: default package */
/* loaded from: classes.dex */
public final class pt3 {
    public final Map a;

    public pt3(Map map) {
        this.a = map;
    }

    public final Object a(float f) {
        Object next;
        Iterator it = this.a.entrySet().iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                float abs = Math.abs(f - ((Number) ((Map.Entry) next).getValue()).floatValue());
                do {
                    Object next2 = it.next();
                    float abs2 = Math.abs(f - ((Number) ((Map.Entry) next2).getValue()).floatValue());
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

    public final Object b(float f, boolean z) {
        Object next;
        float f2;
        float f3;
        Iterator it = this.a.entrySet().iterator();
        if (!it.hasNext()) {
            next = null;
        } else {
            next = it.next();
            if (it.hasNext()) {
                float floatValue = ((Number) ((Map.Entry) next).getValue()).floatValue();
                if (z) {
                    f2 = floatValue - f;
                } else {
                    f2 = f - floatValue;
                }
                if (f2 < RecyclerView.A1) {
                    f2 = Float.POSITIVE_INFINITY;
                }
                do {
                    Object next2 = it.next();
                    float floatValue2 = ((Number) ((Map.Entry) next2).getValue()).floatValue();
                    if (z) {
                        f3 = floatValue2 - f;
                    } else {
                        f3 = f - floatValue2;
                    }
                    if (f3 < RecyclerView.A1) {
                        f3 = Float.POSITIVE_INFINITY;
                    }
                    if (Float.compare(f2, f3) > 0) {
                        next = next2;
                        f2 = f3;
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
        Float f = (Float) this.a.get(obj);
        if (f != null) {
            return f.floatValue();
        }
        return Float.NaN;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pt3)) {
            return false;
        }
        return b53.x(this.a, ((pt3) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    public final String toString() {
        return "MapDraggableAnchors(" + this.a + ')';
    }
}
