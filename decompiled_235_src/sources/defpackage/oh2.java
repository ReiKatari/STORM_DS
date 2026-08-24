package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: oh2  reason: default package */
/* loaded from: classes.dex */
public final class oh2 extends e74 {
    public final nh2 a;

    public oh2(nh2 nh2Var) {
        this.a = nh2Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z64, qh2] */
    @Override // defpackage.e74
    public final z64 e() {
        ?? z64Var = new z64();
        z64Var.k0 = this.a;
        return z64Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof oh2) && nb3.k(this.a, ((oh2) obj).a)) {
            return true;
        }
        return false;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        qh2 qh2Var = (qh2) z64Var;
        qh2Var.k0.a.j(qh2Var);
        nh2 nh2Var = this.a;
        qh2Var.k0 = nh2Var;
        nh2Var.a.b(qh2Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.a + ')';
    }
}
