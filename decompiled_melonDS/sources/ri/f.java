package ri;

import fj.z;
import java.io.IOException;
import java.util.Iterator;
import me.magnum.melonds.common.camera.DSiCameraSource;
import ti.o;
import ti.p;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends si.a {

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ int f12759e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ Object f12760f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(String str, mc.a aVar) {
        super(str);
        this.f12759e = 1;
        this.f12760f = aVar;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, fj.e0] */
    @Override // si.a
    public final long a() {
        o oVar;
        switch (this.f12759e) {
            case 0:
                h hVar = (h) this.f12760f;
                synchronized (hVar) {
                    if (hVar.f12770g0 && !hVar.f12771h0) {
                        try {
                            hVar.I();
                        } catch (IOException unused) {
                            hVar.f12772i0 = true;
                        }
                        try {
                            if (hVar.w()) {
                                hVar.G();
                                hVar.f12767d0 = 0;
                            }
                        } catch (IOException unused2) {
                            hVar.f12773j0 = true;
                            z zVar = hVar.f12765b0;
                            if (zVar != null) {
                                qi.e.b(zVar);
                            }
                            hVar.f12765b0 = new z(new Object());
                        }
                    }
                }
                return -1L;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((mc.a) this.f12760f).b();
                return -1L;
            default:
                p pVar = (p) this.f12760f;
                long nanoTime = System.nanoTime();
                long j2 = (nanoTime - pVar.f13244a) + 1;
                Iterator it = pVar.f13247d.iterator();
                it.getClass();
                long j10 = Long.MAX_VALUE;
                int i2 = 0;
                int i10 = 0;
                o oVar2 = null;
                o oVar3 = null;
                while (it.hasNext()) {
                    o oVar4 = (o) it.next();
                    oVar4.getClass();
                    synchronized (oVar4) {
                        if (pVar.a(oVar4, nanoTime) > 0) {
                            i10++;
                        } else {
                            long j11 = j10;
                            long j12 = oVar4.f13243q;
                            if (j12 < j2) {
                                j2 = j12;
                                oVar2 = oVar4;
                            }
                            i2++;
                            if (j12 < j11) {
                                j10 = j12;
                                oVar3 = oVar4;
                            } else {
                                j10 = j11;
                            }
                        }
                    }
                }
                long j13 = j10;
                if (oVar2 != null) {
                    oVar = oVar2;
                } else if (i2 > 5) {
                    oVar = oVar3;
                    j2 = j13;
                } else {
                    j2 = -1;
                    oVar = null;
                }
                if (oVar != null) {
                    synchronized (oVar) {
                        if (oVar.f13242p.isEmpty() && oVar.f13243q == j2) {
                            oVar.f13237j = true;
                            pVar.f13247d.remove(oVar);
                            qi.g.b(oVar.f13232e);
                            if (!pVar.f13247d.isEmpty()) {
                                return 0L;
                            }
                            si.b bVar = pVar.f13245b;
                            synchronized (bVar.f12929a) {
                                if (bVar.a()) {
                                    bVar.f12929a.c(bVar);
                                }
                            }
                            return 0L;
                        }
                        return 0L;
                    }
                } else if (oVar3 != null) {
                    return (j13 + pVar.f13244a) - nanoTime;
                } else {
                    if (i10 <= 0) {
                        return -1L;
                    }
                    return pVar.f13244a;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(int i2, Object obj, String str) {
        super(str);
        this.f12759e = i2;
        this.f12760f = obj;
    }
}
