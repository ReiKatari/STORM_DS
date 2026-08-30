package g2;

import android.graphics.Path;
import android.graphics.PathMeasure;
import java.util.List;
import java.util.UUID;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class h0 implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;

    public /* synthetic */ h0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
        this.X = obj4;
        this.Y = obj5;
        this.Z = obj6;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        Path path;
        float f8;
        switch (this.A) {
            case 0:
                e0 e0Var = (e0) this.B;
                n2.s2 s2Var = (n2.s2) this.X;
                n2.s2 s2Var2 = (n2.s2) this.Y;
                n2.s2 s2Var3 = (n2.s2) this.Z;
                k3.d dVar = (k3.d) obj;
                float floor = (float) Math.floor(dVar.v(k0.f5213d));
                long j2 = ((i3.s) ((n2.s2) this.L).getValue()).f6689a;
                long j10 = ((i3.s) ((n2.s2) this.R).getValue()).f6689a;
                float v10 = dVar.v(k0.f5214e);
                float f10 = floor / 2.0f;
                k3.h hVar = new k3.h(floor, 0.0f, 0, 0, 30);
                float intBitsToFloat = Float.intBitsToFloat((int) (dVar.c() >> 32));
                boolean c4 = i3.s.c(j2, j10);
                k3.g gVar = k3.g.f7961a;
                if (c4) {
                    k3.d.T(dVar, j2, 0L, (Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(intBitsToFloat) << 32), (Float.floatToRawIntBits(v10) & 4294967295L) | (Float.floatToRawIntBits(v10) << 32), gVar, 0.0f, 226);
                } else {
                    float f11 = intBitsToFloat - (2 * floor);
                    float max = Math.max(0.0f, v10 - floor);
                    k3.d.T(dVar, j2, (Float.floatToRawIntBits(floor) << 32) | (Float.floatToRawIntBits(floor) & 4294967295L), (Float.floatToRawIntBits(f11) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L), (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max) & 4294967295L), gVar, 0.0f, 224);
                    float f12 = intBitsToFloat - floor;
                    float f13 = v10 - f10;
                    k3.d.T(dVar, j10, (Float.floatToRawIntBits(f10) & 4294967295L) | (Float.floatToRawIntBits(f10) << 32), (Float.floatToRawIntBits(f12) & 4294967295L) | (Float.floatToRawIntBits(f12) << 32), (Float.floatToRawIntBits(f13) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32), hVar, 0.0f, 224);
                }
                long j11 = ((i3.s) s2Var.getValue()).f6689a;
                float floatValue = ((Number) s2Var2.getValue()).floatValue();
                float floatValue2 = ((Number) s2Var3.getValue()).floatValue();
                k3.h hVar2 = new k3.h(floor, 0.0f, 2, 0, 26);
                float intBitsToFloat2 = Float.intBitsToFloat((int) (dVar.c() >> 32));
                float w10 = p7.l.w(0.4f, 0.5f, floatValue2);
                float w11 = p7.l.w(0.7f, 0.5f, floatValue2);
                float w12 = p7.l.w(0.5f, 0.5f, floatValue2);
                float w13 = p7.l.w(0.3f, 0.5f, floatValue2);
                i3.h hVar3 = e0Var.f5118a;
                i3.h hVar4 = e0Var.f5120c;
                hVar3.f();
                i3.h hVar5 = e0Var.f5118a;
                Path path2 = hVar5.f6635a;
                Path path3 = hVar5.f6635a;
                path2.moveTo(0.2f * intBitsToFloat2, w12 * intBitsToFloat2);
                path3.lineTo(w10 * intBitsToFloat2, w11 * intBitsToFloat2);
                path3.lineTo(0.8f * intBitsToFloat2, intBitsToFloat2 * w13);
                i3.i iVar = e0Var.f5119b;
                PathMeasure pathMeasure = iVar.f6641a;
                if (hVar5 != null) {
                    path = hVar5.f6635a;
                } else {
                    path = null;
                }
                pathMeasure.setPath(path, false);
                hVar4.f();
                iVar.a(0.0f, iVar.f6641a.getLength() * floatValue, hVar4);
                dVar.Y(hVar4, j11, hVar2);
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                n2.b1 b1Var = (n2.b1) this.B;
                n2.b1 b1Var2 = (n2.b1) this.L;
                nc.q qVar = (nc.q) this.R;
                nc.q qVar2 = (nc.q) this.X;
                sc.a aVar = (sc.a) this.Z;
                b1Var.h(b1Var2.g() + b1Var.g() + ((Float) obj).floatValue());
                float f14 = 0.0f;
                b1Var2.h(0.0f);
                float f15 = p7.j.f(b1Var.g(), qVar.A, qVar2.A);
                mc.l lVar = (mc.l) ((n2.w0) this.Y).getValue();
                float f16 = qVar.A;
                float f17 = qVar2.A;
                float f18 = aVar.f12863a;
                float f19 = aVar.f12864b;
                float f20 = f17 - f16;
                if (f20 == 0.0f) {
                    f8 = 0.0f;
                } else {
                    f8 = (f15 - f16) / f20;
                }
                if (f8 >= 0.0f) {
                    f14 = f8;
                }
                if (f14 > 1.0f) {
                    f14 = 1.0f;
                }
                lVar.k(Float.valueOf(p7.l.w(f18, f19, f14)));
                break;
            case 2:
                y3.i1[] i1VarArr = (y3.i1[]) this.B;
                List list = (List) this.L;
                y3.x0 x0Var = (y3.x0) this.R;
                nc.r rVar = (nc.r) this.X;
                nc.r rVar2 = (nc.r) this.Y;
                l1.r rVar3 = (l1.r) this.Z;
                y3.h1 h1Var = (y3.h1) obj;
                int length = i1VarArr.length;
                int i2 = 0;
                int i10 = 0;
                while (i10 < length) {
                    y3.i1 i1Var = i1VarArr[i10];
                    i1Var.getClass();
                    l1.p.b(h1Var, i1Var, (y3.u0) list.get(i2), x0Var.getLayoutDirection(), rVar.A, rVar2.A, rVar3.f8610a);
                    i10++;
                    i2++;
                }
                return yb.y.f14813a;
            default:
                List list2 = (List) this.B;
                UUID uuid = (UUID) this.L;
                mc.l lVar2 = (mc.l) this.R;
                mc.l lVar3 = (mc.l) this.X;
                cd.w0 w0Var = (cd.w0) this.Y;
                mc.l lVar4 = (mc.l) this.Z;
                n1.i iVar2 = (n1.i) obj;
                iVar2.getClass();
                iVar2.q(list2.size(), new ai.b1(11, new u1.h1(12), list2), new ai.j(9, list2), new v2.c(802480018, true, new wh.f(list2, uuid, lVar2, lVar3, w0Var, lVar4)));
                break;
        }
        return yb.y.f14813a;
    }
}
