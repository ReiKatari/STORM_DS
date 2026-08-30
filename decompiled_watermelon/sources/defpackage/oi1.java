package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oi1  reason: default package */
/* loaded from: classes.dex */
public final class oi1 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof oi1) && ji1.b(10.0f, 10.0f) && ji1.b(40.0f, 40.0f) && ji1.b(10.0f, 10.0f) && ji1.b(40.0f, 40.0f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + ej6.a(40.0f, ej6.a(10.0f, ej6.a(40.0f, Float.hashCode(10.0f) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) ji1.c(10.0f)) + ", top=" + ((Object) ji1.c(40.0f)) + ", end=" + ((Object) ji1.c(10.0f)) + ", bottom=" + ((Object) ji1.c(40.0f)) + ", isLayoutDirectionAware=true)";
    }
}
