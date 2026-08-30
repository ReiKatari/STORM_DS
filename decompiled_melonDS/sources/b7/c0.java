package b7;

import d1.q1;
import java.util.List;
import n2.f1;
import n2.s2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c0 extends ec.j implements mc.p {
    public final /* synthetic */ q1 X;
    public final /* synthetic */ a7.d0 Y;
    public final /* synthetic */ a7.i Z;

    /* renamed from: b0  reason: collision with root package name */
    public final /* synthetic */ a1.c0 f2086b0;

    /* renamed from: c0  reason: collision with root package name */
    public final /* synthetic */ s2 f2087c0;

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ i f2088d0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(q1 q1Var, a7.d0 d0Var, a7.i iVar, a1.c0 c0Var, s2 s2Var, i iVar2, cc.c cVar) {
        super(2, cVar);
        this.X = q1Var;
        this.Y = d0Var;
        this.Z = iVar;
        this.f2086b0 = c0Var;
        this.f2087c0 = s2Var;
        this.f2088d0 = iVar2;
    }

    @Override // mc.p
    public final Object j(Object obj, Object obj2) {
        cc.c cVar = (cc.c) obj2;
        yb.y yVar = yb.y.f14813a;
        ((c0) t(cVar, (zc.u) obj)).v(yVar);
        return yVar;
    }

    @Override // ec.a
    public final cc.c t(cc.c cVar, Object obj) {
        return new c0(this.X, this.Y, this.Z, this.f2086b0, this.f2087c0, this.f2088d0, cVar);
    }

    @Override // ec.a
    public final Object v(Object obj) {
        char c4;
        dc.a aVar = dc.a.COROUTINE_SUSPENDED;
        p7.j.I(obj);
        q1 q1Var = this.X;
        Object c10 = q1Var.f3649a.c();
        f1 f1Var = q1Var.f3652d;
        if (nc.k.a(c10, f1Var.getValue()) && (((a7.i) this.Y.f552b.f3926f.g()) == null || nc.k.a(f1Var.getValue(), this.Z))) {
            for (a7.i iVar : (List) this.f2087c0.getValue()) {
                this.f2088d0.b().c(iVar);
            }
            a1.c0 c0Var = this.f2086b0;
            long[] jArr = c0Var.f26a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i2 = 0;
                while (true) {
                    long j2 = jArr[i2];
                    char c11 = 7;
                    if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i10 = 8 - ((~(i2 - length)) >>> 31);
                        int i11 = 0;
                        while (i11 < i10) {
                            if ((j2 & 255) < 128) {
                                int i12 = (i2 << 3) + i11;
                                Object obj2 = c0Var.f27b[i12];
                                c4 = c11;
                                float f8 = c0Var.f28c[i12];
                                if (!nc.k.a((String) obj2, ((a7.i) f1Var.getValue()).Y)) {
                                    c0Var.f30e--;
                                    long[] jArr2 = c0Var.f26a;
                                    int i13 = c0Var.f29d;
                                    int i14 = i12 >> 3;
                                    int i15 = (i12 & 7) << 3;
                                    long j10 = (jArr2[i14] & (~(255 << i15))) | (254 << i15);
                                    jArr2[i14] = j10;
                                    jArr2[(((i12 - 7) & i13) + (i13 & 7)) >> 3] = j10;
                                    c0Var.f27b[i12] = null;
                                }
                            } else {
                                c4 = c11;
                            }
                            j2 >>= 8;
                            i11++;
                            c11 = c4;
                        }
                        if (i10 != 8) {
                            break;
                        }
                    }
                    if (i2 == length) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return yb.y.f14813a;
    }
}
