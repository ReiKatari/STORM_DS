package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gh  reason: default package */
/* loaded from: classes.dex */
public final class gh implements so4 {
    public final int A;

    public gh(int i) {
        this.A = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof gh) && this.A == ((gh) obj).A) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.A);
    }

    public final String toString() {
        return ej6.g(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.A, ')');
    }
}
