package o2;

import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.h2;
import n2.p1;
import n2.y1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r extends ek.a {

    /* renamed from: e  reason: collision with root package name */
    public static final r f10656e = new r(1, 2, 0);

    /* renamed from: f  reason: collision with root package name */
    public static final r f10657f = new r(1, 1, 1);

    /* renamed from: g  reason: collision with root package name */
    public static final r f10658g = new r(1, 2, 2);

    /* renamed from: h  reason: collision with root package name */
    public static final r f10659h = new r(1, 1, 3);

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f10660d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r(int i2, int i10, int i11) {
        super(i2, i10);
        this.f10660d = i11;
    }

    @Override // ek.a
    public final void c(f2.s sVar, n2.c cVar, h2 h2Var, v2.i iVar, j0 j0Var) {
        switch (this.f10660d) {
            case 0:
                Object b10 = ((mc.a) sVar.f(0)).b();
                n2.a aVar = (n2.a) sVar.f(1);
                int e6 = sVar.e(0);
                aVar.getClass();
                h2Var.U(h2Var.c(aVar), b10);
                cVar.g(e6, b10);
                cVar.e(b10);
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                n2.a aVar2 = (n2.a) sVar.f(0);
                int e10 = sVar.e(0);
                cVar.n();
                aVar2.getClass();
                cVar.d(e10, h2Var.D(h2Var.c(aVar2)));
                return;
            case 2:
                Object f8 = sVar.f(0);
                n2.a aVar3 = (n2.a) sVar.f(1);
                int e11 = sVar.e(0);
                if (f8 instanceof y1) {
                    y1 y1Var = (y1) f8;
                    iVar.f13618e.b(y1Var);
                    iVar.f13617d.a(y1Var);
                }
                Object K = h2Var.K(h2Var.c(aVar3), e11, f8);
                if (K instanceof y1) {
                    iVar.e((y1) K);
                    return;
                } else if (K instanceof p1) {
                    ((p1) K).c();
                    return;
                } else {
                    return;
                }
            default:
                Object f10 = sVar.f(0);
                int e12 = sVar.e(0);
                if (f10 instanceof y1) {
                    y1 y1Var2 = (y1) f10;
                    iVar.f13618e.b(y1Var2);
                    iVar.f13617d.a(y1Var2);
                }
                Object K2 = h2Var.K(h2Var.f9922t, e12, f10);
                if (K2 instanceof y1) {
                    iVar.e((y1) K2);
                    return;
                } else if (K2 instanceof p1) {
                    ((p1) K2).c();
                    return;
                } else {
                    return;
                }
        }
    }

    @Override // ek.a
    public n2.a d(f2.s sVar) {
        switch (this.f10660d) {
            case 0:
                return (n2.a) sVar.f(1);
            case DSiCameraSource.FrontCamera /* 1 */:
                return (n2.a) sVar.f(0);
            default:
                return super.d(sVar);
        }
    }
}
