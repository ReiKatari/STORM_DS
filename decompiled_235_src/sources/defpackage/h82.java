package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h82  reason: default package */
/* loaded from: classes.dex */
public final class h82 implements wk5 {
    public final yk5 A;
    public final long B;

    public h82(yk5 yk5Var, long j) {
        yk5Var.getClass();
        this.A = yk5Var;
        this.B = j;
    }

    @Override // defpackage.hh7
    public final Object e(ar0 ar0Var) {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof h82) {
            h82 h82Var = (h82) obj;
            if (nb3.k(this.A, h82Var.A) && this.B == h82Var.B) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + i61.c(this.B, xg6.e(this.A.hashCode() * 31, false, 31), 31);
    }

    @Override // defpackage.wk5
    public final boolean r() {
        return false;
    }

    public final String toString() {
        return "ExtensionRequestFailure(requestMetadata=" + this.A + ", wasImageCaptured=false, frameNumber=" + ((Object) nm2.a(this.B)) + ", reason=0)";
    }

    @Override // defpackage.wk5
    public final int v() {
        return 0;
    }
}
