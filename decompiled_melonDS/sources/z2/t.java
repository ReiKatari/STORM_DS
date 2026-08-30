package z2;

import a1.m0;
import a1.n0;
import java.util.HashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    public final mc.l f14933a;

    /* renamed from: b  reason: collision with root package name */
    public Object f14934b;

    /* renamed from: c  reason: collision with root package name */
    public a1.d0 f14935c;

    /* renamed from: j  reason: collision with root package name */
    public boolean f14942j;

    /* renamed from: k  reason: collision with root package name */
    public int f14943k;

    /* renamed from: d  reason: collision with root package name */
    public int f14936d = -1;

    /* renamed from: e  reason: collision with root package name */
    public final m0 f14937e = k0.d.q();

    /* renamed from: f  reason: collision with root package name */
    public final m0 f14938f = new m0();

    /* renamed from: g  reason: collision with root package name */
    public final n0 f14939g = new n0();

    /* renamed from: h  reason: collision with root package name */
    public final p2.b f14940h = new p2.b(new n2.e0[16]);

    /* renamed from: i  reason: collision with root package name */
    public final n2.q f14941i = new n2.q(1, this);

    /* renamed from: l  reason: collision with root package name */
    public final m0 f14944l = k0.d.q();
    public final HashMap m = new HashMap();

    public t(mc.l lVar) {
        this.f14933a = lVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
        if (((z2.z) r15).e(2) == false) goto L153;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:261:0x053c  */
    /* JADX WARN: Type inference failed for: r6v44 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean a(java.util.Set r46) {
        /*
            Method dump skipped, instructions count: 1678
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.t.a(java.util.Set):boolean");
    }

    public final void b(Object obj, int i2, Object obj2, a1.d0 d0Var) {
        int i10;
        if (this.f14943k <= 0) {
            int c4 = d0Var.c(obj);
            if (c4 < 0) {
                c4 = ~c4;
                i10 = -1;
            } else {
                i10 = d0Var.f34c[c4];
            }
            d0Var.f33b[c4] = obj;
            d0Var.f34c[c4] = i2;
            if ((obj instanceof n2.e0) && i10 != i2) {
                n2.d0 h2 = ((n2.e0) obj).h();
                this.m.put(obj, h2.f9884f);
                a1.d0 d0Var2 = h2.f9883e;
                m0 m0Var = this.f14944l;
                k0.d.G(m0Var, obj);
                Object[] objArr = d0Var2.f33b;
                long[] jArr = d0Var2.f32a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i11 = 0;
                    while (true) {
                        long j2 = jArr[i11];
                        if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i12 = 8 - ((~(i11 - length)) >>> 31);
                            for (int i13 = 0; i13 < i12; i13++) {
                                if ((j2 & 255) < 128) {
                                    y yVar = (y) objArr[(i11 << 3) + i13];
                                    if (yVar instanceof z) {
                                        ((z) yVar).f(2);
                                    }
                                    k0.d.j(m0Var, yVar, obj);
                                }
                                j2 >>= 8;
                            }
                            if (i12 != 8) {
                                break;
                            }
                        }
                        if (i11 == length) {
                            break;
                        }
                        i11++;
                    }
                }
            }
            if (i10 == -1) {
                if (obj instanceof z) {
                    ((z) obj).f(2);
                }
                k0.d.j(this.f14937e, obj, obj2);
            }
        }
    }

    public final void c(Object obj, Object obj2) {
        m0 m0Var = this.f14937e;
        k0.d.E(m0Var, obj2, obj);
        if ((obj2 instanceof n2.e0) && !m0Var.c(obj2)) {
            k0.d.G(this.f14944l, obj2);
            this.m.remove(obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d() {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z2.t.d():void");
    }
}
