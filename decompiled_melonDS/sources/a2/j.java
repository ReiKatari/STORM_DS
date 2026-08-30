package a2;

import ah.h1;
import android.app.DownloadManager;
import bd.v;
import h1.n2;
import h1.p2;
import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.w0;
import yb.y;
import zc.u;
import zc.y0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j extends ec.j implements mc.p {
    public final /* synthetic */ int X;
    public long Y;
    public int Z;

    /* renamed from: b0  reason: collision with root package name */
    public Object f129b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ Object f130c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ Object f131d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(k kVar, long j2, b2.h hVar, i iVar, cc.c cVar) {
        super(2, cVar);
        this.X = 0;
        this.f129b0 = kVar;
        this.Y = j2;
        this.f130c0 = hVar;
        this.f131d0 = iVar;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        switch (this.X) {
            case 0:
                return ((j) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case DSiCameraSource.FrontCamera /* 1 */:
                return ((j) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case 2:
                return ((j) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case 3:
                return ((j) t((cc.c) obj2, (u) obj)).v(y.f14813a);
            case 4:
                return ((j) t((cc.c) obj2, c3.p.m(obj))).v(y.f14813a);
            case l1.c.f8511g /* 5 */:
                return ((j) t((cc.c) obj2, (n2) obj)).v(y.f14813a);
            case l1.c.f8509e /* 6 */:
                return ((j) t((cc.c) obj2, (cd.i) obj)).v(y.f14813a);
            case 7:
                return ((j) t((cc.c) obj2, (v) obj)).v(y.f14813a);
            default:
                return ((j) t((cc.c) obj2, (u) obj)).v(y.f14813a);
        }
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        switch (this.X) {
            case 0:
                return new j((k) this.f129b0, this.Y, (b2.h) this.f130c0, (i) this.f131d0, cVar);
            case DSiCameraSource.FrontCamera /* 1 */:
                j jVar = new j((h1) this.f130c0, (ze.a) this.f131d0, cVar, 1);
                jVar.f129b0 = obj;
                return jVar;
            case 2:
                return new j((f1.g) this.f130c0, this.Y, (j1.i) this.f131d0, cVar, 2);
            case 3:
                return new j((y0) this.f130c0, this.Y, (j1.i) this.f131d0, cVar, 3);
            case 4:
                j jVar2 = new j(this.Y, cVar, (f2.p) this.f130c0, (CharSequence) this.f131d0);
                jVar2.f129b0 = obj;
                return jVar2;
            case l1.c.f8511g /* 5 */:
                j jVar3 = new j((p2) this.f130c0, this.Y, (nc.q) this.f131d0, cVar, 5);
                jVar3.f129b0 = obj;
                return jVar3;
            case l1.c.f8509e /* 6 */:
                j jVar4 = new j((jf.b) this.f130c0, (pe.b) this.f131d0, cVar, 6);
                jVar4.f129b0 = obj;
                return jVar4;
            case 7:
                j jVar5 = new j(this.Y, (jf.b) this.f130c0, (DownloadManager) this.f131d0, cVar);
                jVar5.f129b0 = obj;
                return jVar5;
            default:
                return new j((w0) this.f130c0, this.Y, (j1.i) this.f131d0, cVar, 8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:114:0x02bc, code lost:
        if (zc.x.h(r9, r28) == r0) goto L129;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x03c5, code lost:
        if (new f2.t0(r1.Z, r28, 0).v(r7) == r0) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0050, code lost:
        if (r8.a(r3, r28) == r0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x01bd, code lost:
        if (r3 == r1) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0267, code lost:
        if (((zc.y0) r4).G(r28) == r0) goto L108;
     */
    /* JADX WARN: Removed duplicated region for block: B:130:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0336  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0358 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:182:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:185:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:131:0x0309 -> B:133:0x030e). Please submit an issue!!! */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r29) {
        /*
            Method dump skipped, instructions count: 1002
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a2.j.v(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(long j2, jf.b bVar, DownloadManager downloadManager, cc.c cVar) {
        super(2, cVar);
        this.X = 7;
        this.Y = j2;
        this.f130c0 = bVar;
        this.f131d0 = downloadManager;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(long j2, cc.c cVar, f2.p pVar, CharSequence charSequence) {
        super(2, cVar);
        this.X = 4;
        this.f130c0 = pVar;
        this.f131d0 = charSequence;
        this.Y = j2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, long j2, Object obj2, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.f130c0 = obj;
        this.Y = j2;
        this.f131d0 = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(Object obj, Object obj2, cc.c cVar, int i2) {
        super(2, cVar);
        this.X = i2;
        this.f130c0 = obj;
        this.f131d0 = obj2;
    }
}
