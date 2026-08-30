package ah;

import android.net.Uri;
import c1.p1;
import c1.q1;
import java.util.List;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.domain.model.ConsoleType;
import me.magnum.melonds.domain.model.RendererConfiguration;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class u0 extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public /* synthetic */ Object Y;
    public /* synthetic */ Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(mc.p pVar, cc.c cVar) {
        super(2, cVar);
        this.X = 9;
        this.Z = (ec.j) pVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                cc.c cVar = (cc.c) obj2;
                yb.y yVar = yb.y.f14813a;
                ((u0) t(cVar, (zc.u) obj)).v(yVar);
                return yVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                cc.c cVar2 = (cc.c) obj2;
                yb.y yVar2 = yb.y.f14813a;
                ((u0) t(cVar2, (zc.u) obj)).v(yVar2);
                return yVar2;
            case 2:
                cc.c cVar3 = (cc.c) obj2;
                yb.y yVar3 = yb.y.f14813a;
                ((u0) t(cVar3, (zc.u) obj)).v(yVar3);
                return yVar3;
            case 3:
                cc.c cVar4 = (cc.c) obj2;
                yb.y yVar4 = yb.y.f14813a;
                ((u0) t(cVar4, (RendererConfiguration) obj)).v(yVar4);
                return yVar4;
            case 4:
                cc.c cVar5 = (cc.c) obj2;
                yb.y yVar5 = yb.y.f14813a;
                ((u0) t(cVar5, (zc.u) obj)).v(yVar5);
                return yVar5;
            case l1.c.f8511g /* 5 */:
                cc.c cVar6 = (cc.c) obj2;
                yb.y yVar6 = yb.y.f14813a;
                ((u0) t(cVar6, (zc.u) obj)).v(yVar6);
                return yVar6;
            case l1.c.f8509e /* 6 */:
                return ((u0) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case 7:
                cc.c cVar7 = (cc.c) obj2;
                yb.y yVar7 = yb.y.f14813a;
                ((u0) t(cVar7, (Uri[]) obj)).v(yVar7);
                return yVar7;
            case 8:
                return ((u0) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case l1.c.f8508d /* 9 */:
                return ((u0) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
            case l1.c.f8510f /* 10 */:
                cc.c cVar8 = (cc.c) obj2;
                yb.y yVar8 = yb.y.f14813a;
                ((u0) t(cVar8, (zc.u) obj)).v(yVar8);
                return yVar8;
            case 11:
                cc.c cVar9 = (cc.c) obj2;
                yb.y yVar9 = yb.y.f14813a;
                ((u0) t(cVar9, (List) obj)).v(yVar9);
                return yVar9;
            case 12:
                cc.c cVar10 = (cc.c) obj2;
                yb.y yVar10 = yb.y.f14813a;
                ((u0) t(cVar10, (List) obj)).v(yVar10);
                return yVar10;
            case 13:
                cc.c cVar11 = (cc.c) obj2;
                yb.y yVar11 = yb.y.f14813a;
                ((u0) t(cVar11, (List) obj)).v(yVar11);
                return yVar11;
            default:
                return ((u0) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
        }
    }

    /* JADX WARN: Type inference failed for: r1v19, types: [ec.j, mc.p] */
    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new u0((h1) this.Y, (Uri) this.Z, cVar, 0);
            case DSiCameraSource.FrontCamera /* 1 */:
                return new u0((h1) this.Y, (String) this.Z, cVar, 1);
            case 2:
                return new u0((h1) this.Y, (ConsoleType) this.Z, cVar, 2);
            case 3:
                u0 u0Var = new u0((h1) this.Y, cVar);
                u0Var.Z = obj;
                return u0Var;
            case 4:
                u0 u0Var2 = new u0(4, cVar, (androidx.lifecycle.s) this.Z);
                u0Var2.Y = obj;
                return u0Var2;
            case l1.c.f8511g /* 5 */:
                return new u0((p1) this.Y, (q1) this.Z, cVar, 5);
            case l1.c.f8509e /* 6 */:
                u0 u0Var3 = new u0(6, cVar, (d2.i) this.Z);
                u0Var3.Y = obj;
                return u0Var3;
            case 7:
                u0 u0Var4 = new u0(7, cVar, (kf.l0) this.Z);
                u0Var4.Y = obj;
                return u0Var4;
            case 8:
                return new u0((ze.a) this.Y, (kf.g1) this.Z, cVar, 8);
            case l1.c.f8508d /* 9 */:
                u0 u0Var5 = new u0((mc.p) ((ec.j) this.Z), cVar);
                u0Var5.Y = obj;
                return u0Var5;
            case l1.c.f8510f /* 10 */:
                return new u0((xg.h) this.Y, (List) this.Z, cVar, 10);
            case 11:
                u0 u0Var6 = new u0(11, cVar, (xg.k) this.Z);
                u0Var6.Y = obj;
                return u0Var6;
            case 12:
                u0 u0Var7 = new u0(12, cVar, (xh.c) this.Z);
                u0Var7.Y = obj;
                return u0Var7;
            case 13:
                u0 u0Var8 = new u0(13, cVar, (xh.d) this.Z);
                u0Var8.Y = obj;
                return u0Var8;
            default:
                u0 u0Var9 = new u0(14, cVar, (a2.n) this.Z);
                u0Var9.Y = obj;
                return u0Var9;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
        r1.l();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004a, code lost:
        return r10;
     */
    /* JADX WARN: Type inference failed for: r0v40, types: [zc.m, zc.f1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2, types: [ec.j, mc.p] */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r10) {
        /*
            Method dump skipped, instructions count: 796
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ah.u0.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(h1 h1Var, cc.c cVar) {
        super(2, cVar);
        this.X = 3;
        this.Y = h1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(Object obj, Object obj2, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Y = obj;
        this.Z = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u0(int i2, cc.c cVar, Object obj) {
        super(2, cVar);
        this.X = i2;
        this.Z = obj;
    }
}
