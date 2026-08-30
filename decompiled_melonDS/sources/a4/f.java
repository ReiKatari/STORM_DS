package a4;

import b4.z2;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.t2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends nc.l implements mc.p {
    public static final f L = new f(2, 0);
    public static final f R = new f(2, 1);
    public static final f X = new f(2, 2);
    public static final f Y = new f(2, 3);
    public final /* synthetic */ int B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i2, int i10) {
        super(i2);
        this.B = i10;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.B) {
            case 0:
                ((Number) obj2).intValue();
                ((h) obj).getClass();
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((o0) ((h) obj)).e0((y3.v0) obj2);
                return yb.y.f14813a;
            case 2:
                ((o0) ((h) obj)).f0((b3.p) obj2);
                return yb.y.f14813a;
            default:
                n2.a0 a0Var = (n2.a0) obj2;
                o0 o0Var = (o0) ((h) obj);
                o0Var.f298w0 = a0Var;
                n1 n1Var = o0Var.A0;
                t2 t2Var = b4.q1.f1919h;
                v2.g gVar = (v2.g) a0Var;
                gVar.getClass();
                o0Var.b0((x4.c) n2.s.x(gVar, t2Var));
                x4.m mVar = (x4.m) n2.s.x(gVar, b4.q1.f1924n);
                if (o0Var.f296u0 != mVar) {
                    o0Var.f296u0 = mVar;
                    o0Var.E();
                    o0 u4 = o0Var.u();
                    if (u4 != null) {
                        u4.C();
                    }
                    o0Var.D();
                    for (b3.o oVar = n1Var.f268f; oVar != null; oVar = oVar.Y) {
                        oVar.w0();
                    }
                }
                o0Var.g0((z2) n2.s.x(gVar, b4.q1.f1929s));
                b3.o oVar2 = n1Var.f268f;
                if ((oVar2.R & 32768) != 0) {
                    while (oVar2 != null) {
                        if ((oVar2.L & 32768) != 0) {
                            b3.o oVar3 = oVar2;
                            p2.b bVar = null;
                            while (oVar3 != null) {
                                if (oVar3 instanceof i) {
                                    b3.o oVar4 = ((b3.o) ((i) oVar3)).A;
                                    if (oVar4.f1777h0) {
                                        s1.c(oVar4);
                                    } else {
                                        oVar4.f1773d0 = true;
                                    }
                                } else if ((oVar3.L & 32768) != 0 && (oVar3 instanceof k)) {
                                    int i2 = 0;
                                    for (b3.o oVar5 = ((k) oVar3).f247j0; oVar5 != null; oVar5 = oVar5.Y) {
                                        if ((oVar5.L & 32768) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                oVar3 = oVar5;
                                            } else {
                                                if (bVar == null) {
                                                    bVar = new p2.b(new b3.o[16]);
                                                }
                                                if (oVar3 != null) {
                                                    bVar.b(oVar3);
                                                    oVar3 = null;
                                                }
                                                bVar.b(oVar5);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                oVar3 = l.e(bVar);
                            }
                        }
                        if ((oVar2.R & 32768) != 0) {
                            oVar2 = oVar2.Y;
                        }
                    }
                }
                return yb.y.f14813a;
        }
    }
}
