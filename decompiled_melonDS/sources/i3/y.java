package i3;

import a4.j1;
import a4.r1;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y extends j1 {

    /* renamed from: a  reason: collision with root package name */
    public final float f6693a;

    /* renamed from: b  reason: collision with root package name */
    public final float f6694b;

    /* renamed from: c  reason: collision with root package name */
    public final float f6695c;

    /* renamed from: d  reason: collision with root package name */
    public final float f6696d;

    /* renamed from: e  reason: collision with root package name */
    public final long f6697e;

    /* renamed from: f  reason: collision with root package name */
    public final n0 f6698f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f6699g;

    /* renamed from: h  reason: collision with root package name */
    public final long f6700h;

    /* renamed from: i  reason: collision with root package name */
    public final long f6701i;

    public y(float f8, float f10, float f11, float f12, long j2, n0 n0Var, boolean z10, long j10, long j11) {
        this.f6693a = f8;
        this.f6694b = f10;
        this.f6695c = f11;
        this.f6696d = f12;
        this.f6697e = j2;
        this.f6698f = n0Var;
        this.f6699g = z10;
        this.f6700h = j10;
        this.f6701i = j11;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [i3.o0, java.lang.Object, b3.o] */
    @Override // a4.j1
    public final b3.o e() {
        ?? oVar = new b3.o();
        oVar.f6664i0 = this.f6693a;
        oVar.f6665j0 = this.f6694b;
        oVar.f6666k0 = this.f6695c;
        oVar.f6667l0 = this.f6696d;
        oVar.f6668m0 = 8.0f;
        oVar.f6669n0 = this.f6697e;
        oVar.f6670o0 = this.f6698f;
        oVar.p0 = this.f6699g;
        oVar.f6671q0 = this.f6700h;
        oVar.f6672r0 = this.f6701i;
        oVar.f6673s0 = 3;
        oVar.f6674t0 = new a4.a(15, oVar);
        return oVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof y) {
                y yVar = (y) obj;
                if (Float.compare(this.f6693a, yVar.f6693a) != 0 || Float.compare(this.f6694b, yVar.f6694b) != 0 || Float.compare(this.f6695c, yVar.f6695c) != 0 || Float.compare(0.0f, 0.0f) != 0 || Float.compare(0.0f, 0.0f) != 0 || Float.compare(0.0f, 0.0f) != 0 || Float.compare(0.0f, 0.0f) != 0 || Float.compare(0.0f, 0.0f) != 0 || Float.compare(this.f6696d, yVar.f6696d) != 0 || Float.compare(8.0f, 8.0f) != 0 || !q0.a(this.f6697e, yVar.f6697e) || !nc.k.a(this.f6698f, yVar.f6698f) || this.f6699g != yVar.f6699g || !s.c(this.f6700h, yVar.f6700h) || !s.c(this.f6701i, yVar.f6701i)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // a4.j1
    public final void g(b3.o oVar) {
        r1 r1Var;
        o0 o0Var = (o0) oVar;
        o0Var.f6664i0 = this.f6693a;
        o0Var.f6665j0 = this.f6694b;
        o0Var.f6666k0 = this.f6695c;
        o0Var.f6667l0 = this.f6696d;
        o0Var.f6668m0 = 8.0f;
        o0Var.f6669n0 = this.f6697e;
        o0Var.f6670o0 = this.f6698f;
        o0Var.p0 = this.f6699g;
        o0Var.f6671q0 = this.f6700h;
        o0Var.f6672r0 = this.f6701i;
        o0Var.f6673s0 = 3;
        a4.a aVar = o0Var.f6674t0;
        if (o0Var.A.f1777h0 && (r1Var = a4.l.r(o0Var, 2).f318l0) != null) {
            r1Var.v1(aVar, true);
        }
    }

    public final int hashCode() {
        int b10 = w.d.b(8.0f, w.d.b(this.f6696d, w.d.b(0.0f, w.d.b(0.0f, w.d.b(0.0f, w.d.b(0.0f, w.d.b(0.0f, w.d.b(this.f6695c, w.d.b(this.f6694b, Float.hashCode(this.f6693a) * 31, 31), 31), 31), 31), 31), 31), 31), 31), 31);
        int i2 = q0.f6678c;
        int e6 = w.d.e((this.f6698f.hashCode() + w.d.f(this.f6697e, b10, 31)) * 31, this.f6699g, 961);
        int i10 = s.f6688i;
        return w.d.c(3, w.d.c(0, w.d.f(this.f6701i, w.d.f(this.f6700h, e6, 31), 31), 31), 31);
    }

    public final String toString() {
        return "GraphicsLayerElement(scaleX=" + this.f6693a + ", scaleY=" + this.f6694b + ", alpha=" + this.f6695c + ", translationX=0.0, translationY=0.0, shadowElevation=0.0, rotationX=0.0, rotationY=0.0, rotationZ=" + this.f6696d + ", cameraDistance=8.0, transformOrigin=" + ((Object) q0.b(this.f6697e)) + ", shape=" + this.f6698f + ", clip=" + this.f6699g + ", renderEffect=null, ambientShadowColor=" + ((Object) s.i(this.f6700h)) + ", spotShadowColor=" + ((Object) s.i(this.f6701i)) + ", compositingStrategy=CompositingStrategy(value=0), blendMode=" + ((Object) z.D(3)) + ", colorFilter=null)";
    }
}
