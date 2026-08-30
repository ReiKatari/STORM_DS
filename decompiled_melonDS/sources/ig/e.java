package ig;

import g2.s;
import l1.x;
import mc.q;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.r;
import n2.w0;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements q {
    public final /* synthetic */ int A;
    public final /* synthetic */ mc.a B;
    public final /* synthetic */ mc.a L;
    public final /* synthetic */ w0 R;

    public /* synthetic */ e(int i2, mc.a aVar, mc.a aVar2, w0 w0Var) {
        this.A = i2;
        this.B = aVar;
        this.L = aVar2;
        this.R = w0Var;
    }

    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i2 = this.A;
        x xVar = (x) obj;
        n2.m mVar = (n2.m) obj2;
        int intValue = ((Integer) obj3).intValue();
        switch (i2) {
            case 0:
                xVar.getClass();
                if ((intValue & 17) != 16) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                r rVar = (r) mVar;
                if (rVar.O(intValue & 1, z10)) {
                    final mc.a aVar = this.B;
                    boolean f8 = rVar.f(aVar);
                    Object L = rVar.L();
                    final w0 w0Var = this.R;
                    Object obj4 = n2.l.f9953a;
                    if (f8 || L == obj4) {
                        L = new mc.a() { // from class: ig.f
                            @Override // mc.a
                            public final Object b() {
                                switch (r3) {
                                    case 0:
                                        w0Var.setValue(Boolean.FALSE);
                                        aVar.b();
                                        break;
                                    case DSiCameraSource.FrontCamera /* 1 */:
                                        w0Var.setValue(Boolean.FALSE);
                                        aVar.b();
                                        break;
                                    case 2:
                                        w0Var.setValue(Boolean.FALSE);
                                        aVar.b();
                                        break;
                                    case 3:
                                        w0Var.setValue(Boolean.FALSE);
                                        aVar.b();
                                        break;
                                    case 4:
                                        w0Var.setValue(Boolean.FALSE);
                                        aVar.b();
                                        break;
                                    default:
                                        w0Var.setValue(Boolean.FALSE);
                                        aVar.b();
                                        break;
                                }
                                return y.f14813a;
                            }
                        };
                        rVar.h0(L);
                    }
                    s.b((mc.a) L, null, false, null, m.f7076a, rVar, 196608, 30);
                    final mc.a aVar2 = this.L;
                    boolean f10 = rVar.f(aVar2);
                    Object L2 = rVar.L();
                    if (f10 || L2 == obj4) {
                        L2 = new mc.a() { // from class: ig.f
                            @Override // mc.a
                            public final Object b() {
                                switch (r3) {
                                    case 0:
                                        w0Var.setValue(Boolean.FALSE);
                                        aVar2.b();
                                        break;
                                    case DSiCameraSource.FrontCamera /* 1 */:
                                        w0Var.setValue(Boolean.FALSE);
                                        aVar2.b();
                                        break;
                                    case 2:
                                        w0Var.setValue(Boolean.FALSE);
                                        aVar2.b();
                                        break;
                                    case 3:
                                        w0Var.setValue(Boolean.FALSE);
                                        aVar2.b();
                                        break;
                                    case 4:
                                        w0Var.setValue(Boolean.FALSE);
                                        aVar2.b();
                                        break;
                                    default:
                                        w0Var.setValue(Boolean.FALSE);
                                        aVar2.b();
                                        break;
                                }
                                return y.f14813a;
                            }
                        };
                        rVar.h0(L2);
                    }
                    s.b((mc.a) L2, null, false, null, m.f7077b, rVar, 196608, 30);
                } else {
                    rVar.R();
                }
                return y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                xVar.getClass();
                if ((intValue & 17) != 16) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                r rVar2 = (r) mVar;
                if (rVar2.O(intValue & 1, z11)) {
                    final mc.a aVar3 = this.B;
                    boolean f11 = rVar2.f(aVar3);
                    Object L3 = rVar2.L();
                    final w0 w0Var2 = this.R;
                    Object obj5 = n2.l.f9953a;
                    if (f11 || L3 == obj5) {
                        L3 = new mc.a() { // from class: ig.f
                            @Override // mc.a
                            public final Object b() {
                                switch (r3) {
                                    case 0:
                                        w0Var2.setValue(Boolean.FALSE);
                                        aVar3.b();
                                        break;
                                    case DSiCameraSource.FrontCamera /* 1 */:
                                        w0Var2.setValue(Boolean.FALSE);
                                        aVar3.b();
                                        break;
                                    case 2:
                                        w0Var2.setValue(Boolean.FALSE);
                                        aVar3.b();
                                        break;
                                    case 3:
                                        w0Var2.setValue(Boolean.FALSE);
                                        aVar3.b();
                                        break;
                                    case 4:
                                        w0Var2.setValue(Boolean.FALSE);
                                        aVar3.b();
                                        break;
                                    default:
                                        w0Var2.setValue(Boolean.FALSE);
                                        aVar3.b();
                                        break;
                                }
                                return y.f14813a;
                            }
                        };
                        rVar2.h0(L3);
                    }
                    s.b((mc.a) L3, null, false, null, ng.b.f10443a, rVar2, 196608, 30);
                    final mc.a aVar4 = this.L;
                    boolean f12 = rVar2.f(aVar4);
                    Object L4 = rVar2.L();
                    if (f12 || L4 == obj5) {
                        L4 = new mc.a() { // from class: ig.f
                            @Override // mc.a
                            public final Object b() {
                                switch (r3) {
                                    case 0:
                                        w0Var2.setValue(Boolean.FALSE);
                                        aVar4.b();
                                        break;
                                    case DSiCameraSource.FrontCamera /* 1 */:
                                        w0Var2.setValue(Boolean.FALSE);
                                        aVar4.b();
                                        break;
                                    case 2:
                                        w0Var2.setValue(Boolean.FALSE);
                                        aVar4.b();
                                        break;
                                    case 3:
                                        w0Var2.setValue(Boolean.FALSE);
                                        aVar4.b();
                                        break;
                                    case 4:
                                        w0Var2.setValue(Boolean.FALSE);
                                        aVar4.b();
                                        break;
                                    default:
                                        w0Var2.setValue(Boolean.FALSE);
                                        aVar4.b();
                                        break;
                                }
                                return y.f14813a;
                            }
                        };
                        rVar2.h0(L4);
                    }
                    s.b((mc.a) L4, null, false, null, ng.b.f10444b, rVar2, 196608, 30);
                } else {
                    rVar2.R();
                }
                return y.f14813a;
            default:
                xVar.getClass();
                if ((intValue & 17) != 16) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                r rVar3 = (r) mVar;
                if (rVar3.O(intValue & 1, z12)) {
                    final mc.a aVar5 = this.B;
                    boolean f13 = rVar3.f(aVar5);
                    Object L5 = rVar3.L();
                    final w0 w0Var3 = this.R;
                    Object obj6 = n2.l.f9953a;
                    if (f13 || L5 == obj6) {
                        L5 = new mc.a() { // from class: ig.f
                            @Override // mc.a
                            public final Object b() {
                                switch (r3) {
                                    case 0:
                                        w0Var3.setValue(Boolean.FALSE);
                                        aVar5.b();
                                        break;
                                    case DSiCameraSource.FrontCamera /* 1 */:
                                        w0Var3.setValue(Boolean.FALSE);
                                        aVar5.b();
                                        break;
                                    case 2:
                                        w0Var3.setValue(Boolean.FALSE);
                                        aVar5.b();
                                        break;
                                    case 3:
                                        w0Var3.setValue(Boolean.FALSE);
                                        aVar5.b();
                                        break;
                                    case 4:
                                        w0Var3.setValue(Boolean.FALSE);
                                        aVar5.b();
                                        break;
                                    default:
                                        w0Var3.setValue(Boolean.FALSE);
                                        aVar5.b();
                                        break;
                                }
                                return y.f14813a;
                            }
                        };
                        rVar3.h0(L5);
                    }
                    s.b((mc.a) L5, null, false, null, wh.a.f14221e, rVar3, 196608, 30);
                    final mc.a aVar6 = this.L;
                    boolean f14 = rVar3.f(aVar6);
                    Object L6 = rVar3.L();
                    if (f14 || L6 == obj6) {
                        L6 = new mc.a() { // from class: ig.f
                            @Override // mc.a
                            public final Object b() {
                                switch (r3) {
                                    case 0:
                                        w0Var3.setValue(Boolean.FALSE);
                                        aVar6.b();
                                        break;
                                    case DSiCameraSource.FrontCamera /* 1 */:
                                        w0Var3.setValue(Boolean.FALSE);
                                        aVar6.b();
                                        break;
                                    case 2:
                                        w0Var3.setValue(Boolean.FALSE);
                                        aVar6.b();
                                        break;
                                    case 3:
                                        w0Var3.setValue(Boolean.FALSE);
                                        aVar6.b();
                                        break;
                                    case 4:
                                        w0Var3.setValue(Boolean.FALSE);
                                        aVar6.b();
                                        break;
                                    default:
                                        w0Var3.setValue(Boolean.FALSE);
                                        aVar6.b();
                                        break;
                                }
                                return y.f14813a;
                            }
                        };
                        rVar3.h0(L6);
                    }
                    s.b((mc.a) L6, null, false, null, wh.a.f14222f, rVar3, 196608, 30);
                } else {
                    rVar3.R();
                }
                return y.f14813a;
        }
    }
}
