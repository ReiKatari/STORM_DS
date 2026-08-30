package i3;

import android.graphics.Paint;
import android.graphics.Shader;
import cd.h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class l0 extends o {

    /* renamed from: a  reason: collision with root package name */
    public d2.t f6656a;

    /* renamed from: b  reason: collision with root package name */
    public long f6657b = 9205357640488583168L;

    @Override // i3.o
    public final void a(float f8, long j2, h1 h1Var) {
        Shader shader;
        Paint paint = (Paint) h1Var.B;
        d2.t tVar = this.f6656a;
        Shader shader2 = null;
        if (tVar == null || !h3.e.b(this.f6657b, j2)) {
            if (h3.e.f(j2)) {
                this.f6656a = null;
                this.f6657b = 9205357640488583168L;
                tVar = null;
            } else {
                tVar = this.f6656a;
                if (tVar == null) {
                    tVar = new d2.t((char) 0, 18);
                    this.f6656a = tVar;
                }
                tVar.B = b(j2);
                this.f6656a = tVar;
                this.f6657b = j2;
            }
        }
        long c4 = z.c(paint.getColor());
        long j10 = s.f6681b;
        if (!s.c(c4, j10)) {
            h1Var.j(j10);
        }
        Shader shader3 = (Shader) h1Var.L;
        if (tVar != null) {
            shader = (Shader) tVar.B;
        } else {
            shader = null;
        }
        if (!nc.k.a(shader3, shader)) {
            if (tVar != null) {
                shader2 = (Shader) tVar.B;
            }
            h1Var.m(shader2);
        }
        if (paint.getAlpha() / 255.0f == f8) {
            return;
        }
        h1Var.h(f8);
    }

    public abstract Shader b(long j2);
}
