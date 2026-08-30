package g2;

import java.util.ArrayList;
import java.util.List;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class p2 implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ long B;
    public final /* synthetic */ Object L;

    public /* synthetic */ p2(long j2, Object obj, int i2) {
        this.A = i2;
        this.B = j2;
        this.L = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v20, types: [ie.d, java.lang.Object] */
    @Override // mc.l
    public final Object k(Object obj) {
        float f8;
        t7.c T;
        Long valueOf;
        Long valueOf2;
        List arrayList;
        Long valueOf3;
        boolean z10;
        boolean z11;
        switch (this.A) {
            case 0:
                l1.d1 d1Var = (l1.d1) this.L;
                a4.r0 r0Var = (a4.r0) obj;
                long j2 = this.B;
                float intBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
                float f10 = 0.0f;
                if (intBitsToFloat > 0.0f) {
                    float v10 = r0Var.v(v2.f5434a);
                    k3.b bVar = r0Var.A;
                    float v11 = r0Var.v(d1Var.c(r0Var.getLayoutDirection())) - v10;
                    float f11 = 2;
                    float f12 = (v10 * f11) + intBitsToFloat + v11;
                    x4.m layoutDirection = r0Var.getLayoutDirection();
                    int[] iArr = u2.f5419a;
                    if (iArr[layoutDirection.ordinal()] == 1) {
                        f8 = Float.intBitsToFloat((int) (bVar.c() >> 32)) - f12;
                    } else if (v11 < 0.0f) {
                        f8 = 0.0f;
                    } else {
                        f8 = v11;
                    }
                    float f13 = f8;
                    if (iArr[r0Var.getLayoutDirection().ordinal()] == 1) {
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (bVar.c() >> 32));
                        if (v11 >= 0.0f) {
                            f10 = v11;
                        }
                        f12 = intBitsToFloat2 - f10;
                    }
                    float f14 = f12;
                    float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 & 4294967295L));
                    float f15 = (-intBitsToFloat3) / f11;
                    float f16 = intBitsToFloat3 / f11;
                    a4.n nVar = bVar.B;
                    long t5 = nVar.t();
                    nVar.p().p();
                    try {
                        ((a4.n) ((d2.t) nVar.B).B).p().j(f13, f15, f14, f16, 0);
                        r0Var.a();
                    } finally {
                        w.d.y(nVar, t5);
                    }
                } else {
                    r0Var.a();
                }
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                long j10 = this.B;
                he.i iVar = (he.i) this.L;
                t7.a aVar = (t7.a) obj;
                aVar.getClass();
                T = aVar.T("SELECT * FROM cheat_folder WHERE game_id = ?");
                try {
                    T.g(1, j10);
                    int t10 = p7.m.t(T, "id");
                    int t11 = p7.m.t(T, "game_id");
                    int t12 = p7.m.t(T, "name");
                    a1.q qVar = new a1.q((Object) null);
                    while (T.N()) {
                        if (T.isNull(t10)) {
                            valueOf3 = null;
                        } else {
                            valueOf3 = Long.valueOf(T.getLong(t10));
                        }
                        if (valueOf3 != null) {
                            if (qVar.c(valueOf3.longValue()) >= 0) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (!z10) {
                                qVar.g(valueOf3.longValue(), new ArrayList());
                            }
                        }
                    }
                    T.reset();
                    iVar.a(aVar, qVar);
                    ArrayList arrayList2 = new ArrayList();
                    while (T.N()) {
                        if (T.isNull(t10)) {
                            valueOf = null;
                        } else {
                            valueOf = Long.valueOf(T.getLong(t10));
                        }
                        ie.c cVar = new ie.c(valueOf, T.getLong(t11), T.n(t12));
                        if (T.isNull(t10)) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Long.valueOf(T.getLong(t10));
                        }
                        if (valueOf2 != null) {
                            Object b10 = qVar.b(valueOf2.longValue());
                            if (b10 != null) {
                                arrayList = (List) b10;
                            } else {
                                throw new IllegalStateException("Required value was null.");
                            }
                        } else {
                            arrayList = new ArrayList();
                        }
                        ?? obj2 = new Object();
                        obj2.f7053a = cVar;
                        obj2.f7054b = arrayList;
                        arrayList2.add(obj2);
                    }
                    T.close();
                    return arrayList2;
                } finally {
                }
            default:
                long j11 = this.B;
                he.t tVar = (he.t) this.L;
                t7.a aVar2 = (t7.a) obj;
                aVar2.getClass();
                T = aVar2.T("SELECT * FROM ra_game WHERE game_id = ?");
                try {
                    T.g(1, j11);
                    int t13 = p7.m.t(T, "game_id");
                    int t14 = p7.m.t(T, "rich_presence_patch");
                    int t15 = p7.m.t(T, "title");
                    int t16 = p7.m.t(T, "icon");
                    Object obj3 = null;
                    a1.q qVar2 = new a1.q((Object) null);
                    while (T.N()) {
                        long j12 = T.getLong(t13);
                        if (qVar2.c(j12) >= 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if (!z11) {
                            qVar2.g(j12, new ArrayList());
                        }
                    }
                    T.reset();
                    tVar.F(aVar2, qVar2);
                    if (T.N()) {
                        long j13 = T.getLong(t13);
                        if (!T.isNull(t14)) {
                            obj3 = T.n(t14);
                        }
                        je.d dVar = new je.d(j13, obj3, T.n(t15), T.n(t16));
                        Object b11 = qVar2.b(T.getLong(t13));
                        if (b11 != null) {
                            obj3 = new je.g(dVar, (List) b11);
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                    return obj3;
                } finally {
                    T.close();
                }
        }
    }
}
