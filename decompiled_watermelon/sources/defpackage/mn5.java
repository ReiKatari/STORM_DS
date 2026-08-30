package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mn5  reason: default package */
/* loaded from: classes.dex */
public final class mn5 extends nn5 {
    public final boolean a;

    public mn5(boolean z) {
        this.a = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof mn5) && this.a == ((mn5) obj).a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a);
    }

    public final String toString() {
        return "LaunchSuccessful(isGbaLoadSuccessful=" + this.a + ")";
    }
}
