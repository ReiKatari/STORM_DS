package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: li0  reason: default package */
/* loaded from: classes.dex */
public final class li0 {
    public final dc0 a;
    public final vh0 b;
    public final pa0 c;

    public li0(dc0 dc0Var, vh0 vh0Var, pa0 pa0Var) {
        dc0Var.getClass();
        this.a = dc0Var;
        this.b = vh0Var;
        this.c = pa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof li0) {
            li0 li0Var = (li0) obj;
            if (b53.x(this.a, li0Var.a) && this.b == li0Var.b && this.c == li0Var.c) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.b.hashCode();
        return this.c.hashCode() + ((hashCode + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "ConfiguredCameraCaptureSession(session=" + this.a + ", processor=" + this.b + ", captureSequenceProcessor=" + this.c + ')';
    }
}
