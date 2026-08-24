package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lm4  reason: default package */
/* loaded from: classes.dex */
public final class lm4 {
    public final vd a;
    public final df0 b;

    public lm4(vd vdVar, df0 df0Var, int i) {
        vdVar = (i & 1) != 0 ? null : vdVar;
        df0Var = (i & 2) != 0 ? null : df0Var;
        this.a = vdVar;
        this.b = df0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lm4)) {
            return false;
        }
        lm4 lm4Var = (lm4) obj;
        if (nb3.k(this.a, lm4Var.a) && nb3.k(this.b, lm4Var.b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        vd vdVar = this.a;
        if (vdVar == null) {
            hashCode = 0;
        } else {
            hashCode = vdVar.hashCode();
        }
        int i2 = hashCode * 31;
        df0 df0Var = this.b;
        if (df0Var != null) {
            i = Integer.hashCode(df0Var.a);
        }
        return i2 + i;
    }

    public final String toString() {
        return "OpenCameraResult(cameraState=" + this.a + ", errorCode=" + this.b + ')';
    }
}
