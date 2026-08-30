package c2;

import c8.c0;
import ec.i;
import mc.p;
import me.magnum.melonds.common.camera.DSiCameraSource;
import q1.a0;
import u1.v0;
import v3.f0;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends i implements p {
    public final /* synthetic */ int L;
    public int R;
    public /* synthetic */ Object X;
    public Object Y;
    public Object Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ Object f2552b0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(c0 c0Var, d0.c cVar, v0 v0Var, cc.c cVar2) {
        super(2, cVar2);
        this.L = 1;
        this.Y = c0Var;
        this.Z = cVar;
        this.f2552b0 = v0Var;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        f0 f0Var = (f0) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.L) {
            case 0:
                return ((c) t(cVar, f0Var)).v(y.f14813a);
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((c) t(cVar, f0Var)).v(y.f14813a);
            default:
                return ((c) t(cVar, f0Var)).v(y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.L) {
            case 0:
                c cVar2 = new c(0, cVar, (d) this.f2552b0);
                cVar2.X = obj;
                return cVar2;
            case DSiCameraSource.FrontCamera /* 1 */:
                c cVar3 = new c((c0) this.Y, (d0.c) this.Z, (v0) this.f2552b0, cVar);
                cVar3.X = obj;
                return cVar3;
            default:
                c cVar4 = new c(2, cVar, (a0) this.f2552b0);
                cVar4.X = obj;
                return cVar4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:260:0x0336, code lost:
        continue;
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x028f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0092 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03ea A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0289 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:279:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:284:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:285:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x016c  */
    /* JADX WARN: Type inference failed for: r11v17, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v22, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v44, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v41, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x0258 -> B:110:0x025c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0074 -> B:19:0x0077). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:208:0x03bd -> B:210:0x03c0). Please submit an issue!!! */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 1028
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: c2.c.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i2, cc.c cVar, Object obj) {
        super(2, cVar);
        this.L = i2;
        this.f2552b0 = obj;
    }
}
