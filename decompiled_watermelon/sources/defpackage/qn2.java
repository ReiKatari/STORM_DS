package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qn2  reason: default package */
/* loaded from: classes.dex */
public final class qn2 extends dz3 {
    public final float a;
    public final float b;
    public final float c;
    public final long d;
    public final y26 e;
    public final boolean f;
    public final long g;
    public final long h;

    public qn2(float f, float f2, float f3, long j, y26 y26Var, boolean z, long j2, long j3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = j;
        this.e = y26Var;
        this.f = z;
        this.g = j2;
        this.h = j3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [yy3, java.lang.Object, o66] */
    @Override // defpackage.dz3
    public final yy3 c() {
        ?? yy3Var = new yy3();
        yy3Var.j0 = this.a;
        yy3Var.k0 = this.b;
        yy3Var.l0 = this.c;
        yy3Var.m0 = 8.0f;
        yy3Var.n0 = this.d;
        yy3Var.o0 = this.e;
        yy3Var.p0 = this.f;
        yy3Var.q0 = this.g;
        yy3Var.r0 = this.h;
        yy3Var.s0 = 3;
        yy3Var.t0 = new yb(27, yy3Var);
        return yy3Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof qn2) {
                qn2 qn2Var = (qn2) obj;
                if (Float.compare(this.a, qn2Var.a) != 0 || Float.compare(this.b, qn2Var.b) != 0 || Float.compare(this.c, qn2Var.c) != 0 || Float.compare(RecyclerView.A1, RecyclerView.A1) != 0 || Float.compare(RecyclerView.A1, RecyclerView.A1) != 0 || Float.compare(RecyclerView.A1, RecyclerView.A1) != 0 || Float.compare(RecyclerView.A1, RecyclerView.A1) != 0 || Float.compare(RecyclerView.A1, RecyclerView.A1) != 0 || Float.compare(RecyclerView.A1, RecyclerView.A1) != 0 || Float.compare(8.0f, 8.0f) != 0 || !sw6.a(this.d, qn2Var.d) || !b53.x(this.e, qn2Var.e) || this.f != qn2Var.f || !xq0.c(this.g, qn2Var.g) || !xq0.c(this.h, qn2Var.h)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.dz3
    public final void g(yy3 yy3Var) {
        m74 m74Var;
        o66 o66Var = (o66) yy3Var;
        o66Var.j0 = this.a;
        o66Var.k0 = this.b;
        o66Var.l0 = this.c;
        o66Var.m0 = 8.0f;
        o66Var.n0 = this.d;
        o66Var.o0 = this.e;
        o66Var.p0 = this.f;
        o66Var.q0 = this.g;
        o66Var.r0 = this.h;
        o66Var.s0 = 3;
        yb ybVar = o66Var.t0;
        if (o66Var.A.i0 && (m74Var = l.N(o66Var, 2).m0) != null) {
            m74Var.x1(ybVar, true);
        }
    }

    public final int hashCode() {
        int a = ej6.a(8.0f, ej6.a(RecyclerView.A1, ej6.a(RecyclerView.A1, ej6.a(RecyclerView.A1, ej6.a(RecyclerView.A1, ej6.a(RecyclerView.A1, ej6.a(RecyclerView.A1, ej6.a(this.c, ej6.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = sw6.c;
        int c = ej6.c((this.e.hashCode() + b31.c(this.d, a, 31)) * 31, this.f, 961);
        int i2 = xq0.i;
        return wh1.a(3, wh1.a(0, b31.c(this.h, b31.c(this.g, c, 31), 31), 31), 31);
    }

    public final String toString() {
        return "GraphicsLayerElement(scaleX=" + this.a + ", scaleY=" + this.b + ", alpha=" + this.c + ", translationX=0.0, translationY=0.0, shadowElevation=0.0, rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin=" + ((Object) sw6.b(this.d)) + ", shape=" + this.e + ", clip=" + this.f + ", renderEffect=null, ambientShadowColor=" + ((Object) xq0.i(this.g)) + ", spotShadowColor=" + ((Object) xq0.i(this.h)) + ", compositingStrategy=CompositingStrategy(value=0), blendMode=" + ((Object) iq2.D(3)) + ", colorFilter=null)";
    }
}
