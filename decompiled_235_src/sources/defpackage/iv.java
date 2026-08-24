package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: iv  reason: default package */
/* loaded from: classes.dex */
public final class iv extends e74 {
    public final float a;

    public iv(float f) {
        this.a = f;
        if (f > RecyclerView.B1) {
            return;
        }
        n53.a("aspectRatio " + f + " must be > 0");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [z64, kv] */
    @Override // defpackage.e74
    public final z64 e() {
        ?? z64Var = new z64();
        z64Var.k0 = this.a;
        return z64Var;
    }

    public final boolean equals(Object obj) {
        iv ivVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof iv) {
            ivVar = (iv) obj;
        } else {
            ivVar = null;
        }
        if (ivVar != null && this.a == ivVar.a) {
            ((iv) obj).getClass();
            return true;
        }
        return false;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        ((kv) z64Var).k0 = this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Float.hashCode(this.a) * 31);
    }
}
