package h1;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class s0 extends ec.i implements mc.p {
    public final /* synthetic */ int L;
    public Object R;
    public int X;
    public Object Y;
    public final /* synthetic */ Object Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(cc.g gVar, mc.p pVar, cc.c cVar) {
        super(2, cVar);
        this.L = 0;
        this.Y = gVar;
        this.Z = (ec.i) pVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.L) {
            case 0:
                return ((s0) t((cc.c) obj2, (v3.f0) obj)).v(yb.y.f14813a);
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((s0) t((cc.c) obj2, (uc.g) obj)).v(yb.y.f14813a);
            case 2:
                return ((s0) t((cc.c) obj2, (v3.f0) obj)).v(yb.y.f14813a);
            default:
                return ((s0) t((cc.c) obj2, (v3.f0) obj)).v(yb.y.f14813a);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ec.i, mc.p] */
    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.L) {
            case 0:
                s0 s0Var = new s0((cc.g) this.Y, (mc.p) ((ec.i) this.Z), cVar);
                s0Var.R = obj;
                return s0Var;
            case DSiCameraSource.FrontCamera /* 1 */:
                s0 s0Var2 = new s0(1, cVar, (a2.n) this.Z);
                s0Var2.Y = obj;
                return s0Var2;
            case 2:
                s0 s0Var3 = new s0((v3.l) this.Y, (nc.t) this.Z, cVar);
                s0Var3.R = obj;
                return s0Var3;
            default:
                s0 s0Var4 = new s0(3, cVar, (u1.v0) this.Z);
                s0Var4.R = obj;
                return s0Var4;
        }
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01dc A[Catch: CancellationException -> 0x01c3, TRY_ENTER, TryCatch #0 {CancellationException -> 0x01c3, blocks: (B:102:0x01dc, B:105:0x01eb, B:91:0x01bf, B:96:0x01ca), top: B:116:0x01a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:114:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0194  */
    /* JADX WARN: Type inference failed for: r0v10, types: [ec.i, mc.p] */
    /* JADX WARN: Type inference failed for: r6v7, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v12, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:106:0x01f5 -> B:100:0x01d6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:111:0x0208 -> B:100:0x01d6). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0060 -> B:18:0x0063). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0125 -> B:58:0x0128). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x018e -> B:80:0x0192). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:79:0x0191 -> B:80:0x0192). Please submit an issue!!! */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.s0.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0(int i2, cc.c cVar, Object obj) {
        super(2, cVar);
        this.L = i2;
        this.Z = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(v3.l lVar, nc.t tVar, cc.c cVar) {
        super(2, cVar);
        this.L = 2;
        this.Y = lVar;
        this.Z = tVar;
    }
}
