package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p32  reason: default package */
/* loaded from: classes.dex */
public final class p32 implements eb5 {
    public final gb5 A;
    public final long B;

    public p32(gb5 gb5Var, long j) {
        gb5Var.getClass();
        this.A = gb5Var;
        this.B = j;
    }

    @Override // defpackage.eb5
    public final boolean I() {
        return false;
    }

    @Override // defpackage.eb5
    public final int K() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p32) {
            p32 p32Var = (p32) obj;
            if (b53.x(this.A, p32Var.A) && this.B == p32Var.B) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + b31.c(this.B, ej6.c(this.A.hashCode() * 31, false, 31), 31);
    }

    @Override // defpackage.m37
    public final Object p(qo0 qo0Var) {
        return null;
    }

    public final String toString() {
        return "ExtensionRequestFailure(requestMetadata=" + this.A + ", wasImageCaptured=false, frameNumber=" + ((Object) nh2.a(this.B)) + ", reason=0)";
    }
}
