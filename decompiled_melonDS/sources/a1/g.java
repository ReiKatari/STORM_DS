package a1;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g extends ec.i implements mc.p {
    public final /* synthetic */ int L;
    public long[] R;
    public int X;
    public int Y;
    public int Z;

    /* renamed from: b0  reason: collision with root package name */
    public int f38b0;

    /* renamed from: c0  reason: collision with root package name */
    public long f39c0;

    /* renamed from: d0  reason: collision with root package name */
    public int f40d0;

    /* renamed from: e0  reason: collision with root package name */
    public /* synthetic */ Object f41e0;

    /* renamed from: f0  reason: collision with root package name */
    public Object f42f0;

    /* renamed from: g0  reason: collision with root package name */
    public final /* synthetic */ Object f43g0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(int i2, cc.c cVar, Object obj) {
        super(2, cVar);
        this.L = i2;
        this.f43g0 = obj;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        uc.g gVar = (uc.g) obj;
        cc.c cVar = (cc.c) obj2;
        switch (this.L) {
            case 0:
                return ((g) t(cVar, gVar)).v(yb.y.f14813a);
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((g) t(cVar, gVar)).v(yb.y.f14813a);
            case 2:
                return ((g) t(cVar, gVar)).v(yb.y.f14813a);
            default:
                return ((g) t(cVar, gVar)).v(yb.y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.L) {
            case 0:
                g gVar = new g(0, cVar, (h) this.f43g0);
                gVar.f41e0 = obj;
                return gVar;
            case DSiCameraSource.FrontCamera /* 1 */:
                g gVar2 = new g(1, cVar, (h) this.f43g0);
                gVar2.f41e0 = obj;
                return gVar2;
            case 2:
                g gVar3 = new g(2, cVar, (a1) this.f43g0);
                gVar3.f41e0 = obj;
                return gVar3;
            default:
                g gVar4 = new g(3, cVar, (p2.d) this.f43g0);
                gVar4.f41e0 = obj;
                return gVar4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0292  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0059 -> B:24:0x009e). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x005b -> B:15:0x006c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0075 -> B:21:0x0095). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0092 -> B:21:0x0095). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x00fa -> B:48:0x013f). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x00fc -> B:39:0x010d). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0116 -> B:45:0x0136). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0133 -> B:45:0x0136). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:61:0x0199 -> B:72:0x01de). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x019b -> B:63:0x01ac). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x01b5 -> B:69:0x01d5). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:67:0x01d2 -> B:69:0x01d5). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:86:0x0237 -> B:87:0x0249). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:89:0x0252 -> B:93:0x0282). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:91:0x027f -> B:94:0x0284). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:98:0x0292 -> B:99:0x0293). Please submit an issue!!! */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r21) {
        /*
            Method dump skipped, instructions count: 678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a1.g.v(java.lang.Object):java.lang.Object");
    }
}
