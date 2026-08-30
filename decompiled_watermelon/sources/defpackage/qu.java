package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qu  reason: default package */
/* loaded from: classes.dex */
public final class qu extends dz3 {
    public final float a;

    public qu(float f) {
        this.a = f;
        if (f > RecyclerView.A1) {
            return;
        }
        kz2.a("aspectRatio " + f + " must be > 0");
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, su] */
    @Override // defpackage.dz3
    public final yy3 c() {
        ?? yy3Var = new yy3();
        yy3Var.j0 = this.a;
        return yy3Var;
    }

    public final boolean equals(Object obj) {
        qu quVar;
        if (this == obj) {
            return true;
        }
        if (obj instanceof qu) {
            quVar = (qu) obj;
        } else {
            quVar = null;
        }
        if (quVar != null && this.a == quVar.a) {
            ((qu) obj).getClass();
            return true;
        }
        return false;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        ((su) yy3Var).j0 = this.a;
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (Float.hashCode(this.a) * 31);
    }
}
