package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h52  reason: default package */
/* loaded from: classes.dex */
public final class h52 implements j52 {
    public final f47 a;

    public h52(f47 f47Var) {
        this.a = f47Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof h52) || !this.a.equals(((h52) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "UnsupportedUseCase(unsupportedUseCase=" + this.a + ')';
    }
}
