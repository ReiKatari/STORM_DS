package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hr5  reason: default package */
/* loaded from: classes.dex */
public final class hr5 extends dk7 {
    @Override // defpackage.dk7
    public final void w(k36 k36Var, float f, float f2) {
        float f3 = f2 * f;
        k36Var.d(f3, 180.0f, 90.0f);
        float f4 = f3 * 2.0f;
        g36 g36Var = new g36(RecyclerView.A1, RecyclerView.A1, f4, f4);
        g36Var.f = 180.0f;
        g36Var.g = 90.0f;
        k36Var.f.add(g36Var);
        e36 e36Var = new e36(g36Var);
        k36Var.a(180.0f);
        k36Var.g.add(e36Var);
        k36Var.d = 270.0f;
        float f5 = (RecyclerView.A1 + f4) * 0.5f;
        float f6 = (f4 - RecyclerView.A1) / 2.0f;
        k36Var.b = (((float) Math.cos(Math.toRadians(270.0d))) * f6) + f5;
        k36Var.c = (f6 * ((float) Math.sin(Math.toRadians(270.0d)))) + f5;
    }
}
