package defpackage;

import android.graphics.Paint;
import android.graphics.Shader;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xd6  reason: default package */
/* loaded from: classes.dex */
public abstract class xd6 extends f80 {
    public j97 a;
    public long b = 9205357640488583168L;

    @Override // defpackage.f80
    public final void a(float f, long j, aj ajVar) {
        Shader shader;
        Paint paint = (Paint) ajVar.L;
        j97 j97Var = this.a;
        Shader shader2 = null;
        if (j97Var == null || !xi6.b(this.b, j)) {
            if (xi6.f(j)) {
                this.a = null;
                this.b = 9205357640488583168L;
                j97Var = null;
            } else {
                j97Var = this.a;
                if (j97Var == null) {
                    j97Var = new j97(0);
                    this.a = j97Var;
                }
                j97Var.B = b(j);
                this.a = j97Var;
                this.b = j;
            }
        }
        long b = hv.b(paint.getColor());
        long j2 = kt0.b;
        if (!kt0.d(b, j2)) {
            ajVar.l(j2);
        }
        Shader shader3 = (Shader) ajVar.R;
        if (j97Var != null) {
            shader = (Shader) j97Var.B;
        } else {
            shader = null;
        }
        if (!nb3.k(shader3, shader)) {
            if (j97Var != null) {
                shader2 = (Shader) j97Var.B;
            }
            ajVar.p(shader2);
        }
        if (paint.getAlpha() / 255.0f == f) {
            return;
        }
        ajVar.j(f);
    }

    public abstract Shader b(long j);
}
