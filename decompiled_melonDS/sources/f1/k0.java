package f1;

import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.domain.model.Cheat;
import me.magnum.melonds.domain.model.DSiWareTitle;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class k0 extends nc.i implements mc.p {

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ int f4603b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0(int i2, Object obj, Class cls, String str, String str2, int i10, int i11, int i12) {
        super(i2, obj, cls, str, str2, i10, i11);
        this.f4603b0 = i12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v6, types: [j1.h, java.lang.Object, j1.d] */
    /* JADX WARN: Type inference failed for: r1v4, types: [nc.t, java.lang.Object] */
    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        boolean isFocused;
        String str;
        boolean z10;
        switch (this.f4603b0) {
            case 0:
                g3.e0 e0Var = (g3.e0) obj;
                g3.e0 e0Var2 = (g3.e0) obj2;
                l0 l0Var = (l0) this.B;
                if (l0Var.f1777h0 && (isFocused = e0Var2.isFocused()) != e0Var.isFocused()) {
                    mc.l lVar = l0Var.f4608l0;
                    if (lVar != null) {
                        lVar.k(Boolean.valueOf(isFocused));
                    }
                    if (isFocused) {
                        zc.x.v(l0Var.C0(), null, null, new a9.b(12, null, l0Var), 3);
                        ?? obj3 = new Object();
                        a4.l.p(l0Var, new a3.e(9, (Object) obj3, l0Var));
                        p1.j0 j0Var = (p1.j0) obj3.A;
                        if (j0Var != null) {
                            j0Var.a();
                        } else {
                            j0Var = null;
                        }
                        l0Var.f4610n0 = j0Var;
                        a4.r1 r1Var = l0Var.f4611o0;
                        if (r1Var != null && r1Var.X0().f1777h0) {
                            l0Var.S0();
                        }
                    } else {
                        p1.j0 j0Var2 = l0Var.f4610n0;
                        if (j0Var2 != null) {
                            j0Var2.b();
                        }
                        l0Var.f4610n0 = null;
                        l0Var.S0();
                    }
                    a4.l.l(l0Var);
                    j1.i iVar = l0Var.f4607k0;
                    if (iVar != null) {
                        j1.d dVar = l0Var.f4609m0;
                        if (isFocused) {
                            if (dVar != null) {
                                l0Var.R0(iVar, new j1.e(dVar));
                                l0Var.f4609m0 = null;
                            }
                            ?? obj4 = new Object();
                            l0Var.R0(iVar, obj4);
                            l0Var.f4609m0 = obj4;
                        } else if (dVar != null) {
                            l0Var.R0(iVar, new j1.e(dVar));
                            l0Var.f4609m0 = null;
                        }
                    }
                }
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                return d0.d.N((cc.c) obj2, (k7.t) this.B, (mc.l) obj);
            case 2:
                return d0.d.N((cc.c) obj2, (k7.t) this.B, (mc.l) obj);
            case 3:
                Cheat cheat = (Cheat) obj;
                kg.e eVar = (kg.e) obj2;
                cheat.getClass();
                eVar.getClass();
                String str2 = eVar.f8297c;
                jg.u uVar = (jg.u) this.B;
                uVar.getClass();
                String str3 = eVar.f8296b;
                String str4 = eVar.f8295a;
                if (!vc.h.j0(str4) && !vc.h.j0(str2) && (!nc.k.a(cheat.getName(), str4) || !nc.k.a(cheat.getDescription(), str3) || !nc.k.a(cheat.getCode(), str2))) {
                    String str5 = eVar.f8295a;
                    if (!vc.h.j0(str3)) {
                        str = str3;
                    } else {
                        str = null;
                    }
                    zc.x.v(androidx.lifecycle.s0.h(uVar), null, null, new di.b(uVar, Cheat.copy$default(cheat, null, 0L, str5, str, str2, false, 35, null), null, 20), 3);
                }
                return yb.y.f14813a;
            case 4:
                ld.e eVar2 = (ld.e) obj;
                int intValue = ((Number) obj2).intValue();
                eVar2.getClass();
                pd.q qVar = (pd.q) this.B;
                qVar.getClass();
                if (!eVar2.k(intValue) && eVar2.j(intValue).h()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                qVar.f11601b = z10;
                return Boolean.valueOf(z10);
            case l1.c.f8511g /* 5 */:
                DSiWareTitle dSiWareTitle = (DSiWareTitle) obj;
                re.a aVar = (re.a) obj2;
                dSiWareTitle.getClass();
                aVar.getClass();
                zg.q qVar2 = (zg.q) this.B;
                qVar2.getClass();
                zg.r rVar = qVar2.f15100a;
                rVar.f15102a = dSiWareTitle;
                rVar.f15103b = aVar;
                qVar2.f15101b.a(new yb.j(null, null));
                return yb.y.f14813a;
            default:
                DSiWareTitle dSiWareTitle2 = (DSiWareTitle) obj;
                re.a aVar2 = (re.a) obj2;
                dSiWareTitle2.getClass();
                aVar2.getClass();
                zg.s sVar = (zg.s) this.B;
                sVar.getClass();
                zg.r rVar2 = sVar.f15104a;
                rVar2.f15102a = dSiWareTitle2;
                rVar2.f15103b = aVar2;
                sVar.f15105b.a(aVar2.getFileName());
                return yb.y.f14813a;
        }
    }
}
