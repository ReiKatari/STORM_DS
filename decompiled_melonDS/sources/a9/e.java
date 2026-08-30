package a9;

import android.view.View;
import androidx.lifecycle.q;
import androidx.lifecycle.r;
import androidx.lifecycle.x;
import b4.h3;
import j0.o1;
import mc.p;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.u1;
import n2.w0;
import nc.t;
import v3.w;
import yb.y;
import zc.u;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class e extends ec.j implements p {
    public final /* synthetic */ int X;
    public int Y;
    public Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public Object f670b0;

    /* renamed from: c0  reason: collision with root package name */
    public /* synthetic */ Object f671c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ Object f672d0;

    /* renamed from: e0  reason: collision with root package name */
    public final /* synthetic */ Object f673e0;

    /* renamed from: f0  reason: collision with root package name */
    public final /* synthetic */ Object f674f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(r rVar, q qVar, u uVar, p pVar, cc.c cVar) {
        super(2, cVar);
        this.X = 1;
        this.f671c0 = rVar;
        this.f672d0 = qVar;
        this.f673e0 = uVar;
        this.f674f0 = (ec.j) pVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        u uVar = (u) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.X) {
            case 0:
                return ((e) t(cVar, uVar)).v(y.f14813a);
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((e) t(cVar, uVar)).v(y.f14813a);
            case 2:
                return ((e) t(cVar, uVar)).v(y.f14813a);
            case 3:
                return ((e) t(cVar, uVar)).v(y.f14813a);
            default:
                return ((e) t(cVar, uVar)).v(y.f14813a);
        }
    }

    /* JADX WARN: Type inference failed for: r6v1, types: [ec.j, mc.p] */
    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                e eVar = new e((p8.u) this.f672d0, (o1) this.f673e0, (x8.p) this.f674f0, cVar);
                eVar.f671c0 = obj;
                return eVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                return new e((r) this.f671c0, (q) this.f672d0, (u) this.f673e0, (p) ((ec.j) this.f674f0), cVar);
            case 2:
                e eVar2 = new e((t) this.Z, (u1) this.f670b0, (x) this.f672d0, (h3) this.f673e0, (View) this.f674f0, cVar, 2);
                eVar2.f671c0 = obj;
                return eVar2;
            case 3:
                e eVar3 = new e((bd.l) this.f670b0, (d1.c) this.f672d0, (w0) this.f673e0, (w0) this.f674f0, cVar);
                eVar3.f671c0 = obj;
                return eVar3;
            default:
                e eVar4 = new e((w) this.Z, (mc.q) this.f670b0, (mc.l) this.f672d0, (mc.l) this.f673e0, (mc.l) this.f674f0, cVar, 4);
                eVar4.f671c0 = obj;
                return eVar4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0222  */
    /* JADX WARN: Type inference failed for: r13v2, types: [ec.j, mc.p] */
    /* JADX WARN: Type inference failed for: r15v29, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v10, types: [nc.t, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14, types: [zc.y0] */
    /* JADX WARN: Type inference failed for: r3v16, types: [zc.y0] */
    /* JADX WARN: Type inference failed for: r3v2, types: [int] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r8v9, types: [nc.t, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0086 -> B:23:0x0089). Please submit an issue!!! */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 776
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a9.e.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(bd.l lVar, d1.c cVar, w0 w0Var, w0 w0Var2, cc.c cVar2) {
        super(2, cVar2);
        this.X = 3;
        this.f670b0 = lVar;
        this.f672d0 = cVar;
        this.f673e0 = w0Var;
        this.f674f0 = w0Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.Z = obj;
        this.f670b0 = obj2;
        this.f672d0 = obj3;
        this.f673e0 = obj4;
        this.f674f0 = obj5;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p8.u uVar, o1 o1Var, x8.p pVar, cc.c cVar) {
        super(2, cVar);
        this.X = 0;
        this.f672d0 = uVar;
        this.f673e0 = o1Var;
        this.f674f0 = pVar;
    }
}
