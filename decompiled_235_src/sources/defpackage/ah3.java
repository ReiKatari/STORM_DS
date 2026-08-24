package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ah3  reason: default package */
/* loaded from: classes.dex */
public final class ah3 extends e74 {
    public final qn2 a;
    public final qn2 b;

    public ah3(qn2 qn2Var, qn2 qn2Var2) {
        this.a = qn2Var;
        this.b = qn2Var2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z64, ch3] */
    @Override // defpackage.e74
    public final z64 e() {
        ?? z64Var = new z64();
        z64Var.k0 = this.a;
        z64Var.l0 = this.b;
        return z64Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ah3)) {
            return false;
        }
        ah3 ah3Var = (ah3) obj;
        if (this.a == ah3Var.a && this.b == ah3Var.b) {
            return true;
        }
        return false;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        ch3 ch3Var = (ch3) z64Var;
        ch3Var.k0 = this.a;
        ch3Var.l0 = this.b;
    }

    public final int hashCode() {
        int i;
        int i2 = 0;
        qn2 qn2Var = this.a;
        if (qn2Var != null) {
            i = qn2Var.hashCode();
        } else {
            i = 0;
        }
        int i3 = i * 31;
        qn2 qn2Var2 = this.b;
        if (qn2Var2 != null) {
            i2 = qn2Var2.hashCode();
        }
        return i3 + i2;
    }
}
