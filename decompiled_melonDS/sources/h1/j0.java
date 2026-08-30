package h1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j0 extends ec.j implements mc.p {
    public final /* synthetic */ int X = 1;
    public nc.t Y;
    public nc.t Z;

    /* renamed from: b0  reason: collision with root package name */
    public int f5922b0;

    /* renamed from: c0  reason: collision with root package name */
    public /* synthetic */ Object f5923c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ k0 f5924d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(nc.t tVar, k0 k0Var, cc.c cVar) {
        super(2, cVar);
        this.Z = tVar;
        this.f5924d0 = k0Var;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                return ((j0) t((cc.c) obj2, (mc.l) obj)).v(yb.y.f14813a);
            default:
                return ((j0) t((cc.c) obj2, (zc.u) obj)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                j0 j0Var = new j0(this.Z, this.f5924d0, cVar);
                j0Var.f5923c0 = obj;
                return j0Var;
            default:
                j0 j0Var2 = new j0(this.f5924d0, cVar);
                j0Var2.f5923c0 = obj;
                return j0Var2;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:22|23|(1:43)|25|26|27|(2:33|(2:35|(1:37)))(2:29|(2:31|32))) */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00c6, code lost:
        r1 = r5;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b6 A[Catch: CancellationException -> 0x00c6, TryCatch #2 {CancellationException -> 0x00c6, blocks: (B:39:0x00b0, B:41:0x00b6, B:45:0x00c8, B:47:0x00cc), top: B:87:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c8 A[Catch: CancellationException -> 0x00c6, TryCatch #2 {CancellationException -> 0x00c6, blocks: (B:39:0x00b0, B:41:0x00b6, B:45:0x00c8, B:47:0x00cc), top: B:87:0x00b0 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v24, types: [nc.t, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x0087 -> B:20:0x005b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x00c3 -> B:20:0x005b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:46:0x00ca -> B:20:0x005b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x00d7 -> B:20:0x005b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:51:0x00e5 -> B:12:0x002c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x013a -> B:77:0x013b). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x013f -> B:79:0x0140). Please submit an issue!!! */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r7) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h1.j0.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0(k0 k0Var, cc.c cVar) {
        super(2, cVar);
        this.f5924d0 = k0Var;
    }
}
