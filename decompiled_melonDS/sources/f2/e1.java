package f2;

import android.os.Build;
import f1.q1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class e1 implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ x4.c B;
    public final /* synthetic */ n2.w0 L;

    public /* synthetic */ e1(x4.c cVar, n2.w0 w0Var, int i2) {
        this.A = i2;
        this.B = cVar;
        this.L = w0Var;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        q1 q1Var;
        switch (this.A) {
            case 0:
                g1 g1Var = new g1(0, (mc.a) obj);
                e1 e1Var = new e1(this.B, this.L, 1);
                if (f1.e1.a()) {
                    if (Build.VERSION.SDK_INT == 28) {
                        q1Var = q1.f4642b;
                    } else {
                        q1Var = q1.f4643c;
                    }
                    if (f1.e1.a()) {
                        return new f1.b1(g1Var, e1Var, q1Var);
                    }
                    return b3.m.f1770a;
                }
                m9.o.v("Magnifier is only supported on API level 28 and higher.");
                return null;
            default:
                x4.h hVar = (x4.h) obj;
                float b10 = x4.h.b(hVar.f14339a);
                x4.c cVar = this.B;
                this.L.setValue(new x4.l((cVar.O(b10) << 32) | (cVar.O(x4.h.a(hVar.f14339a)) & 4294967295L)));
                return yb.y.f14813a;
        }
    }
}
