package defpackage;

import androidx.recyclerview.widget.RecyclerView;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vt2  reason: default package */
/* loaded from: classes.dex */
public final class vt2 extends e74 {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final long f;
    public final ke6 g;
    public final boolean h;
    public final long i;
    public final long j;

    public vt2(float f, float f2, float f3, float f4, float f5, long j, ke6 ke6Var, boolean z, long j2, long j3) {
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
        this.e = f5;
        this.f = j;
        this.g = ke6Var;
        this.h = z;
        this.i = j2;
        this.j = j3;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ei6, z64, java.lang.Object] */
    @Override // defpackage.e74
    public final z64 e() {
        ?? z64Var = new z64();
        z64Var.k0 = this.a;
        z64Var.l0 = this.b;
        z64Var.m0 = this.c;
        z64Var.n0 = this.d;
        z64Var.o0 = this.e;
        z64Var.p0 = 8.0f;
        z64Var.q0 = this.f;
        z64Var.r0 = this.g;
        z64Var.s0 = this.h;
        z64Var.t0 = this.i;
        z64Var.u0 = this.j;
        z64Var.v0 = 3;
        z64Var.w0 = new mc(z64Var, 26);
        return z64Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof vt2) {
                vt2 vt2Var = (vt2) obj;
                if (Float.compare(this.a, vt2Var.a) != 0 || Float.compare(this.b, vt2Var.b) != 0 || Float.compare(this.c, vt2Var.c) != 0 || Float.compare(this.d, vt2Var.d) != 0 || Float.compare(this.e, vt2Var.e) != 0 || Float.compare(RecyclerView.B1, RecyclerView.B1) != 0 || Float.compare(RecyclerView.B1, RecyclerView.B1) != 0 || Float.compare(RecyclerView.B1, RecyclerView.B1) != 0 || Float.compare(RecyclerView.B1, RecyclerView.B1) != 0 || Float.compare(8.0f, 8.0f) != 0 || !i97.a(this.f, vt2Var.f) || !nb3.k(this.g, vt2Var.g) || this.h != vt2Var.h || !kt0.d(this.i, vt2Var.i) || !kt0.d(this.j, vt2Var.j)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // defpackage.e74
    public final void g(z64 z64Var) {
        eg4 eg4Var;
        ei6 ei6Var = (ei6) z64Var;
        ei6Var.k0 = this.a;
        ei6Var.l0 = this.b;
        ei6Var.m0 = this.c;
        ei6Var.n0 = this.d;
        ei6Var.o0 = this.e;
        ei6Var.p0 = 8.0f;
        ei6Var.q0 = this.f;
        ei6Var.r0 = this.g;
        ei6Var.s0 = this.h;
        ei6Var.t0 = this.i;
        ei6Var.u0 = this.j;
        ei6Var.v0 = 3;
        mc mcVar = ei6Var.w0;
        if (ei6Var.A.j0 && (eg4Var = nc1.d0(ei6Var, 2).n0) != null) {
            eg4Var.x1(mcVar, true);
        }
    }

    public final int hashCode() {
        int a = xg6.a(8.0f, xg6.a(RecyclerView.B1, xg6.a(RecyclerView.B1, xg6.a(RecyclerView.B1, xg6.a(RecyclerView.B1, xg6.a(this.e, xg6.a(this.d, xg6.a(this.c, xg6.a(this.b, Float.hashCode(this.a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i = i97.c;
        int e = xg6.e((this.g.hashCode() + i61.c(this.f, a, 31)) * 31, this.h, 961);
        int i2 = kt0.i;
        return lb1.a(3, lb1.a(0, i61.c(this.j, i61.c(this.i, e, 31), 31), 31), 31);
    }

    public final String toString() {
        return "GraphicsLayerElement(scaleX=" + this.a + ", scaleY=" + this.b + ", alpha=" + this.c + ", translationX=" + this.d + ", translationY=" + this.e + ", shadowElevation=0.0, rotationX=0.0, rotationY=0.0, rotationZ=0.0, cameraDistance=8.0, transformOrigin=" + ((Object) i97.b(this.f)) + ", shape=" + this.g + ", clip=" + this.h + ", renderEffect=null, ambientShadowColor=" + ((Object) kt0.j(this.i)) + ", spotShadowColor=" + ((Object) kt0.j(this.j)) + ", compositingStrategy=CompositingStrategy(value=0), blendMode=" + ((Object) u24.J(3)) + ", colorFilter=null)";
    }
}
