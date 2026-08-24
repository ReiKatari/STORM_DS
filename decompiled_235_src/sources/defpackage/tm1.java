package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tm1  reason: default package */
/* loaded from: classes.dex */
public final class tm1 {
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof tm1) && om1.b(10.0f, 10.0f) && om1.b(40.0f, 40.0f) && om1.b(10.0f, 10.0f) && om1.b(40.0f, 40.0f)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + xg6.a(40.0f, xg6.a(10.0f, xg6.a(40.0f, Float.hashCode(10.0f) * 31, 31), 31), 31);
    }

    public final String toString() {
        return "DpTouchBoundsExpansion(start=" + ((Object) om1.c(10.0f)) + ", top=" + ((Object) om1.c(40.0f)) + ", end=" + ((Object) om1.c(10.0f)) + ", bottom=" + ((Object) om1.c(40.0f)) + ", isLayoutDirectionAware=true)";
    }
}
