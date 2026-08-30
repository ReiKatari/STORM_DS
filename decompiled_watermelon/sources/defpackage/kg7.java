package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kg7  reason: default package */
/* loaded from: classes.dex */
public final class kg7 {
    public final List a;

    public kg7(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && kg7.class.equals(obj.getClass())) {
            return this.a.equals(((kg7) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return tq0.S0(this.a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", null, 56);
    }
}
