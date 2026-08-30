package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o82  reason: default package */
/* loaded from: classes.dex */
public final class o82 implements re7 {
    @Override // defpackage.re7
    public final int a(od1 od1Var) {
        return od1Var.Y(RecyclerView.A1);
    }

    @Override // defpackage.re7
    public final int b(od1 od1Var) {
        return od1Var.Y(RecyclerView.A1);
    }

    @Override // defpackage.re7
    public final int c(od1 od1Var, sd3 sd3Var) {
        return od1Var.Y(RecyclerView.A1);
    }

    @Override // defpackage.re7
    public final int d(od1 od1Var, sd3 sd3Var) {
        return od1Var.Y(RecyclerView.A1);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if ((obj instanceof o82) && ji1.b(RecyclerView.A1, RecyclerView.A1) && ji1.b(RecyclerView.A1, RecyclerView.A1) && ji1.b(RecyclerView.A1, RecyclerView.A1) && ji1.b(RecyclerView.A1, RecyclerView.A1)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Float.hashCode(RecyclerView.A1) + ej6.a(RecyclerView.A1, ej6.a(RecyclerView.A1, Float.hashCode(RecyclerView.A1) * 31, 31), 31);
    }

    public final String toString() {
        return "Insets(left=" + ((Object) ji1.c(RecyclerView.A1)) + ", top=" + ((Object) ji1.c(RecyclerView.A1)) + ", right=" + ((Object) ji1.c(RecyclerView.A1)) + ", bottom=" + ((Object) ji1.c(RecyclerView.A1)) + ')';
    }
}
