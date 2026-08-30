package d1;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import g2.f3;
import g2.v2;
import java.util.List;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.ui.settings.preferences.FirmwareColourPickerPreference;
import n2.t2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class x1 implements mc.l {
    public final /* synthetic */ int A;

    public /* synthetic */ x1(int i2) {
        this.A = i2;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        int i2 = this.A;
        int i10 = 0;
        yb.y yVar = yb.y.f14813a;
        switch (i2) {
            case 0:
                m mVar = (m) obj;
                return new x4.j((Math.round(mVar.f3603a) << 32) | (Math.round(mVar.f3604b) & 4294967295L));
            case DSiCameraSource.FrontCamera /* 1 */:
                long j2 = ((x4.l) obj).f14346a;
                return new m((int) (j2 >> 32), (int) (j2 & 4294967295L));
            case 2:
                m mVar2 = (m) obj;
                int round = Math.round(mVar2.f3603a);
                if (round < 0) {
                    round = 0;
                }
                int round2 = Math.round(mVar2.f3604b);
                if (round2 >= 0) {
                    i10 = round2;
                }
                return new x4.l((round << 32) | (i10 & 4294967295L));
            case 3:
                h3.c cVar = (h3.c) obj;
                return new o(cVar.f6052a, cVar.f6053b, cVar.f6054c, cVar.f6055d);
            case 4:
                o oVar = (o) obj;
                return new h3.c(oVar.f3620a, oVar.f3621b, oVar.f3622c, oVar.f3623d);
            case l1.c.f8511g /* 5 */:
                return Float.valueOf(((l) obj).f3600a);
            case l1.c.f8509e /* 6 */:
                List list = (List) obj;
                return yVar;
            case 7:
                q4.i iVar = (q4.i) obj;
                return yVar;
            case 8:
                w6.c cVar2 = (w6.c) obj;
                cVar2.getClass();
                return new d7.b(androidx.lifecycle.s0.b(cVar2));
            case l1.c.f8508d /* 9 */:
                a7.x xVar = (a7.x) obj;
                xVar.getClass();
                a7.z zVar = xVar.L;
                if (zVar == null || zVar.Y.f3860b != xVar.B.f248a) {
                    return null;
                }
                return zVar;
            case l1.c.f8510f /* 10 */:
                a7.x xVar2 = (a7.x) obj;
                xVar2.getClass();
                a7.z zVar2 = xVar2.L;
                if (zVar2 == null || zVar2.Y.f3860b != xVar2.B.f248a) {
                    return null;
                }
                return zVar2;
            case 11:
                a7.x xVar3 = (a7.x) obj;
                xVar3.getClass();
                return Integer.valueOf(xVar3.B.f248a);
            case 12:
                ((a4.r0) obj).a();
                return yVar;
            case 13:
                y3.h1 h1Var = (y3.h1) obj;
                return yVar;
            case 14:
                ((Long) obj).getClass();
                return yVar;
            case l1.c.f8512h /* 15 */:
                v2.g gVar = (v2.g) obj;
                int i11 = f1.k.f4602a;
                t2 t2Var = b4.r0.f1937b;
                gVar.getClass();
                Context context = (Context) n2.s.x(gVar, t2Var);
                x4.c cVar3 = (x4.c) n2.s.x(gVar, b4.q1.f1919h);
                f1.k1 k1Var = (f1.k1) n2.s.x(gVar, f1.l1.f4612a);
                if (k1Var == null) {
                    return null;
                }
                return new f1.j(context, cVar3, k1Var.f4604a, k1Var.f4605b);
            case 16:
                i4.h hVar = i4.h.f6719c;
                tc.c[] cVarArr = i4.v.f6808a;
                i4.w wVar = i4.t.f6783c;
                tc.c cVar4 = i4.v.f6808a[1];
                ((i4.x) obj).a(wVar, hVar);
                return yVar;
            case 17:
                return new f1.w1(((Integer) obj).intValue());
            case 18:
                h3.b bVar = (h3.b) obj;
                long j10 = bVar.f6050a;
                if ((9223372034707292159L & j10) != 9205357640488583168L) {
                    return new m(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (bVar.f6050a & 4294967295L)));
                }
                return f2.k0.f4750a;
            case 19:
                m mVar3 = (m) obj;
                return new h3.b((Float.floatToRawIntBits(mVar3.f3603a) << 32) | (Float.floatToRawIntBits(mVar3.f3604b) & 4294967295L));
            case 20:
                View view = (View) obj;
                Object obj2 = FirmwareColourPickerPreference.B;
                view.getClass();
                return new a6.a1(0, (ViewGroup) view);
            case 21:
                return Boolean.TRUE;
            case 22:
                i4.v.e((i4.x) obj, 0);
                return yVar;
            case 23:
                g2.l1 l1Var = (g2.l1) obj;
                float f8 = g2.j1.f5194a;
                return Boolean.TRUE;
            case 24:
                i4.v.e((i4.x) obj, 0);
                return yVar;
            case 25:
                i4.x xVar4 = (i4.x) obj;
                float f10 = v2.f5434a;
                return yVar;
            case 26:
                i4.x xVar5 = (i4.x) obj;
                float f11 = f3.f5138a;
                return yVar;
            case 27:
                g0 g0Var = (g0) obj;
                g0Var.f3568a = 1332;
                g0Var.a(Float.valueOf(0.0f), 0).f3567b = f3.f5141d;
                g0Var.a(Float.valueOf(290.0f), 666);
                return yVar;
            case 28:
                g0 g0Var2 = (g0) obj;
                g0Var2.f3568a = 1332;
                g0Var2.a(Float.valueOf(0.0f), 666).f3567b = f3.f5141d;
                g0Var2.a(Float.valueOf(290.0f), g0Var2.f3568a);
                return yVar;
            default:
                tc.c[] cVarArr2 = i4.v.f6808a;
                i4.w wVar2 = i4.t.f6792l;
                tc.c cVar5 = i4.v.f6808a[5];
                ((i4.x) obj).a(wVar2, Boolean.TRUE);
                return yVar;
        }
    }
}
