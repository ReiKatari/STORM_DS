package b7;

import c1.c1;
import c1.d1;
import c1.l0;
import c1.o2;
import c1.y1;
import g2.k4;
import g2.x3;
import java.util.List;
import java.util.UUID;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.b1;
import n2.s2;
import n2.w0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ Object f2098b0;

    public /* synthetic */ u(List list, UUID uuid, mc.l lVar, y1 y1Var, c1.p pVar, mc.l lVar2, mc.l lVar3) {
        this.A = 2;
        this.B = list;
        this.L = uuid;
        this.R = lVar;
        this.Z = y1Var;
        this.f2098b0 = pVar;
        this.X = lVar2;
        this.Y = lVar3;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        float f8;
        Object obj2;
        float f10;
        switch (this.A) {
            case 0:
                a1.c0 c0Var = (a1.c0) this.B;
                i iVar = (i) this.L;
                mc.l lVar = (mc.l) this.R;
                mc.l lVar2 = (mc.l) this.X;
                mc.l lVar3 = (mc.l) this.Y;
                w0 w0Var = (w0) this.f2098b0;
                c1.v vVar = (c1.v) obj;
                if (((List) ((s2) this.Z).getValue()).contains(vVar.a())) {
                    String str = ((a7.i) vVar.a()).Y;
                    int b10 = c0Var.b(str);
                    if (b10 >= 0) {
                        f8 = c0Var.f28c[b10];
                    } else {
                        c0Var.d(str, 0.0f);
                        f8 = 0.0f;
                    }
                    if (!nc.k.a(((a7.i) vVar.c()).Y, ((a7.i) vVar.a()).Y)) {
                        if (!((Boolean) iVar.f2090c.getValue()).booleanValue() && !((Boolean) w0Var.getValue()).booleanValue()) {
                            f8 += 1.0f;
                        } else {
                            f8 -= 1.0f;
                        }
                    }
                    c0Var.d(((a7.i) vVar.c()).Y, f8);
                    return new l0((c1) lVar.k(vVar), (d1) lVar2.k(vVar), f8, (o2) lVar3.k(vVar));
                }
                return c1.m.c(c1.f2396b, d1.f2401b);
            case DSiCameraSource.FrontCamera /* 1 */:
                List list = (List) this.L;
                zc.u uVar = (zc.u) this.Y;
                x3 x3Var = (x3) this.Z;
                mc.a aVar = (mc.a) this.f2098b0;
                float floatValue = ((Float) obj).floatValue();
                float g10 = ((b1) this.B).g();
                float f11 = ((nc.q) this.R).A;
                float f12 = ((nc.q) this.X).A;
                if (list.isEmpty()) {
                    obj2 = null;
                } else {
                    obj2 = list.get(0);
                    float abs = Math.abs(p7.l.w(f11, f12, ((Number) obj2).floatValue()) - g10);
                    int i2 = 1;
                    int size = list.size() - 1;
                    if (1 <= size) {
                        while (true) {
                            Object obj3 = list.get(i2);
                            float abs2 = Math.abs(p7.l.w(f11, f12, ((Number) obj3).floatValue()) - g10);
                            if (Float.compare(abs, abs2) > 0) {
                                obj2 = obj3;
                                abs = abs2;
                            }
                            if (i2 != size) {
                                i2++;
                            }
                        }
                    }
                }
                Float f13 = (Float) obj2;
                if (f13 != null) {
                    f10 = p7.l.w(f11, f12, f13.floatValue());
                } else {
                    f10 = g10;
                }
                if (g10 == f10) {
                    if (!((Boolean) x3Var.B.getValue()).booleanValue() && aVar != null) {
                        aVar.b();
                    }
                } else {
                    zc.x.v(uVar, null, null, new k4(x3Var, g10, f10, floatValue, aVar, null), 3);
                }
                return yb.y.f14813a;
            default:
                List list2 = (List) this.B;
                UUID uuid = (UUID) this.L;
                mc.l lVar4 = (mc.l) this.R;
                y1 y1Var = (y1) this.Z;
                c1.p pVar = (c1.p) this.f2098b0;
                mc.l lVar5 = (mc.l) this.X;
                mc.l lVar6 = (mc.l) this.Y;
                o1.g gVar = (o1.g) obj;
                gVar.getClass();
                gVar.f10511c.a(list2.size(), new o1.f(o1.g.f10509d, new ai.j(1, list2), new v2.c(-1117249557, true, new ig.j(list2, uuid, lVar4, y1Var, pVar, lVar5, lVar6))));
                return yb.y.f14813a;
        }
    }

    public /* synthetic */ u(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
        this.X = obj4;
        this.Y = obj5;
        this.Z = obj6;
        this.f2098b0 = obj7;
    }
}
