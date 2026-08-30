package a7;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import androidx.lifecycle.s0;
import c1.w0;
import d1.q0;
import d1.u1;
import d1.x0;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements mc.l {
    public final /* synthetic */ int A;

    public /* synthetic */ a(int i2) {
        this.A = i2;
    }

    /* JADX WARN: Type inference failed for: r0v14, types: [yb.f, java.lang.Object] */
    @Override // mc.l
    public final Object k(Object obj) {
        ContextWrapper contextWrapper;
        int i2 = this.A;
        boolean z10 = false;
        yb.y yVar = yb.y.f14813a;
        switch (i2) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                if (!(context instanceof ContextWrapper)) {
                    return null;
                }
                return ((ContextWrapper) context).getBaseContext();
            case DSiCameraSource.FrontCamera /* 1 */:
                Context context2 = (Context) obj;
                context2.getClass();
                if (!(context2 instanceof ContextWrapper)) {
                    return null;
                }
                return ((ContextWrapper) context2).getBaseContext();
            case 2:
                ((w6.c) obj).getClass();
                return new o();
            case 3:
                Context context3 = (Context) obj;
                context3.getClass();
                if (context3 instanceof ContextWrapper) {
                    contextWrapper = (ContextWrapper) context3;
                } else {
                    contextWrapper = null;
                }
                if (contextWrapper == null) {
                    return null;
                }
                return contextWrapper.getBaseContext();
            case 4:
                Context context4 = (Context) obj;
                context4.getClass();
                if (!(context4 instanceof Activity)) {
                    return null;
                }
                return (Activity) context4;
            case l1.c.f8511g /* 5 */:
                x xVar = (x) obj;
                xVar.getClass();
                return xVar.L;
            case l1.c.f8509e /* 6 */:
                x xVar2 = (x) obj;
                xVar2.getClass();
                if (!(xVar2 instanceof z)) {
                    return null;
                }
                d5.j jVar = ((z) xVar2).Y;
                return jVar.e(jVar.f3860b);
            case 7:
                ((String) obj).getClass();
                return Boolean.TRUE;
            case 8:
                ((pg.c) obj).getClass();
                return "achievement";
            case l1.c.f8508d /* 9 */:
                return new b7.a(s0.b((w6.c) obj));
            case l1.c.f8510f /* 10 */:
                x xVar3 = ((i) ((c1.v) obj).c()).B;
                xVar3.getClass();
                int i10 = x.X;
                for (x xVar4 : k7.w.s((b7.h) xVar3)) {
                }
                return null;
            case 11:
                c1.v vVar = (c1.v) obj;
                return w0.e(d1.d.r(700, 0, null, 6), 2);
            case 12:
                return ((i) obj).Y;
            case 13:
                return (c9.g) obj;
            case 14:
                Resources resources = (Resources) obj;
                resources.getClass();
                if ((resources.getConfiguration().uiMode & 48) == 32) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case l1.c.f8512h /* 15 */:
                d1.i iVar = (d1.i) obj;
                return yVar;
            case 16:
                x0 x0Var = (x0) obj;
                long j2 = x0Var.f3698f;
                ((z2.u) u1.f3683b.getValue()).c(x0Var, u1.f3682a, x0Var.f3699g);
                long j10 = x0Var.f3698f;
                if (j2 != j10) {
                    q0 q0Var = x0Var.f3705n;
                    if (q0Var != null) {
                        if (q0Var.f3641a > j10) {
                            x0Var.o();
                        } else {
                            q0Var.f3647g = j10;
                            if (q0Var.f3642b == null) {
                                q0Var.f3648h = pc.a.N((1.0d - q0Var.f3645e.a(0)) * x0Var.f3698f);
                            }
                        }
                    } else if (j10 != 0) {
                        x0Var.r();
                    }
                }
                return yVar;
            case 17:
                ((mc.a) obj).b();
                return yVar;
            case 18:
                return new d1.l(((Float) obj).floatValue());
            case 19:
                return new d1.l(((Integer) obj).intValue());
            case 20:
                return Integer.valueOf((int) ((d1.l) obj).f3600a);
            case 21:
                return new d1.l(((x4.f) obj).A);
            case 22:
                return new x4.f(((d1.l) obj).f3600a);
            case 23:
                x4.g gVar = (x4.g) obj;
                return new d1.m(Float.intBitsToFloat((int) (gVar.f14338a >> 32)), Float.intBitsToFloat((int) (gVar.f14338a & 4294967295L)));
            case 24:
                d1.m mVar = (d1.m) obj;
                return new x4.g((Float.floatToRawIntBits(mVar.f3603a) << 32) | (Float.floatToRawIntBits(mVar.f3604b) & 4294967295L));
            case 25:
                h3.e eVar = (h3.e) obj;
                return new d1.m(Float.intBitsToFloat((int) (eVar.f6064a >> 32)), Float.intBitsToFloat((int) (eVar.f6064a & 4294967295L)));
            case 26:
                d1.m mVar2 = (d1.m) obj;
                return new h3.e((Float.floatToRawIntBits(mVar2.f3603a) << 32) | (Float.floatToRawIntBits(mVar2.f3604b) & 4294967295L));
            case 27:
                h3.b bVar = (h3.b) obj;
                return new d1.m(Float.intBitsToFloat((int) (bVar.f6050a >> 32)), Float.intBitsToFloat((int) (bVar.f6050a & 4294967295L)));
            case 28:
                d1.m mVar3 = (d1.m) obj;
                return new h3.b((Float.floatToRawIntBits(mVar3.f3603a) << 32) | (Float.floatToRawIntBits(mVar3.f3604b) & 4294967295L));
            default:
                long j11 = ((x4.j) obj).f14340a;
                return new d1.m((int) (j11 >> 32), (int) (j11 & 4294967295L));
        }
    }
}
