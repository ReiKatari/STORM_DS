package l1;

import androidx.preference.Preference;
import java.util.List;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class n1 implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    public /* synthetic */ n1(y3.i1[] i1VarArr, o1 o1Var, int i2, int[] iArr) {
        this.A = 0;
        this.L = i1VarArr;
        this.R = o1Var;
        this.B = i2;
        this.X = iArr;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        l1 l1Var;
        int a10;
        int i2;
        l4.o0 o0Var;
        boolean z10;
        switch (this.A) {
            case 0:
                y3.i1[] i1VarArr = (y3.i1[]) this.L;
                o1 o1Var = (o1) this.R;
                int[] iArr = (int[]) this.X;
                y3.h1 h1Var = (y3.h1) obj;
                int length = i1VarArr.length;
                int i10 = 0;
                int i11 = 0;
                while (i10 < length) {
                    y3.i1 i1Var = i1VarArr[i10];
                    int i12 = i11 + 1;
                    i1Var.getClass();
                    Object n10 = i1Var.n();
                    c cVar = null;
                    if (n10 instanceof l1) {
                        l1Var = (l1) n10;
                    } else {
                        l1Var = null;
                    }
                    if (l1Var != null) {
                        cVar = l1Var.f8585c;
                    }
                    int i13 = this.B;
                    if (cVar != null) {
                        a10 = cVar.g(i13, x4.m.Ltr, i1Var);
                    } else {
                        a10 = o1Var.f8594b.a(i1Var.B, i13);
                    }
                    y3.h1.k(h1Var, i1Var, iArr[i11], a10);
                    i10++;
                    i11 = i12;
                }
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                n2.e0 e0Var = (n2.e0) this.L;
                v2.d dVar = (v2.d) this.R;
                a1.d0 d0Var = (a1.d0) this.X;
                if (obj != e0Var) {
                    if (obj instanceof z2.y) {
                        int i14 = dVar.f13611a - this.B;
                        int d4 = d0Var.d(obj);
                        if (d4 >= 0) {
                            i2 = d0Var.f34c[d4];
                        } else {
                            i2 = Preference.DEFAULT_ORDER;
                        }
                        d0Var.g(Math.min(i14, i2), obj);
                    }
                    return yb.y.f14813a;
                }
                a0.j.p("A derived state calculation cannot read itself");
                return null;
            case 2:
                u1.f0 f0Var = (u1.f0) this.L;
                y3.x0 x0Var = (y3.x0) this.R;
                y3.i1 i1Var2 = (y3.i1) this.X;
                y3.h1 h1Var2 = (y3.h1) obj;
                int i15 = f0Var.f13306b;
                u1.i1 i1Var3 = f0Var.f13305a;
                q4.e0 e0Var2 = f0Var.f13307c;
                u1.k1 k1Var = (u1.k1) f0Var.f13308d.b();
                if (k1Var != null) {
                    o0Var = k1Var.f13358a;
                } else {
                    o0Var = null;
                }
                l4.o0 o0Var2 = o0Var;
                if (x0Var.getLayoutDirection() == x4.m.Rtl) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                i1Var3.a(h1.n1.Horizontal, u1.l0.j(h1Var2, i15, e0Var2, o0Var2, z10, i1Var2.A), this.B, i1Var2.A);
                y3.h1.n(h1Var2, i1Var2, Math.round(-i1Var3.f13332a.g()), 0);
                break;
            default:
                List list = (List) this.L;
                n1.i iVar = (n1.i) obj;
                iVar.getClass();
                iVar.q(list.size(), null, new ai.j(8, list), new v2.c(2039820996, true, new ug.i(list, (mc.l) this.R, (mc.a) this.X, this.B)));
                break;
        }
        return yb.y.f14813a;
    }

    public /* synthetic */ n1(Object obj, Object obj2, Object obj3, int i2, int i10) {
        this.A = i10;
        this.L = obj;
        this.R = obj2;
        this.X = obj3;
        this.B = i2;
    }
}
