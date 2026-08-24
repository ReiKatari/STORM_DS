package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tk0  reason: default package */
/* loaded from: classes.dex */
public final class tk0 {
    public final me0 a;
    public final dk0 b;
    public final xc0 c;

    public tk0(me0 me0Var, dk0 dk0Var, xc0 xc0Var) {
        me0Var.getClass();
        this.a = me0Var;
        this.b = dk0Var;
        this.c = xc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tk0) {
            tk0 tk0Var = (tk0) obj;
            if (nb3.k(this.a, tk0Var.a) && this.b == tk0Var.b && this.c == tk0Var.c) {
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
