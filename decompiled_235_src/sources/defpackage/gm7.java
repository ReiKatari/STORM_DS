package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gm7  reason: default package */
/* loaded from: classes.dex */
public final class gm7 extends e74 {
    /* JADX WARN: Type inference failed for: r1v1, types: [hm7, z64] */
    @Override // defpackage.e74
    public final z64 e() {
        d40 d40Var = d90.i0;
        ?? z64Var = new z64();
        z64Var.k0 = d40Var;
        return z64Var;
    }

    public final boolean equals(Object obj) {
        gm7 gm7Var;
        if (this == obj) {
            return true;
        }
        if (obj instanceof gm7) {
            gm7Var = (gm7) obj;
        } else {
            gm7Var = null;
        }
        if (gm7Var == null) {
            return false;
        }
        d40 d40Var = d90.i0;
        return d40Var.equals(d40Var);
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        ((hm7) z64Var).k0 = d90.i0;
    }

    public final int hashCode() {
        return Float.hashCode(RecyclerView.B1);
    }
}
