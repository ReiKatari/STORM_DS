package y2;

import kf.s0;
import n2.x1;
import p1.c1;
import z2.n;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements x1 {
    public j A;
    public f B;
    public String L;
    public Object R;
    public Object[] X;
    public c1 Y;
    public final s0 Z = new s0(22, this);

    public c(j jVar, f fVar, String str, Object obj, Object[] objArr) {
        this.A = jVar;
        this.B = fVar;
        this.L = str;
        this.R = obj;
        this.X = objArr;
    }

    @Override // n2.x1
    public final void a() {
        d();
    }

    @Override // n2.x1
    public final void b() {
        c1 c1Var = this.Y;
        if (c1Var != null) {
            c1Var.s();
        }
    }

    @Override // n2.x1
    public final void c() {
        c1 c1Var = this.Y;
        if (c1Var != null) {
            c1Var.s();
        }
    }

    public final void d() {
        String a10;
        f fVar = this.B;
        if (this.Y == null) {
            if (fVar != null) {
                s0 s0Var = this.Z;
                Object b10 = s0Var.b();
                if (b10 != null && !fVar.b(b10)) {
                    if (b10 instanceof n) {
                        n nVar = (n) b10;
                        if (nVar.d() != n2.e.R && nVar.d() != n2.e.Z && nVar.d() != n2.e.X) {
                            a10 = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
                        } else {
                            a10 = "MutableState containing " + nVar.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
                        }
                    } else {
                        a10 = k.a(b10);
                    }
                    throw new IllegalArgumentException(a10);
                }
                this.Y = fVar.f(this.L, s0Var);
                return;
            }
            return;
        }
        fj.j.m(this.Y, ") is not null", "entry(");
    }
}
