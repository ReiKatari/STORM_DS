package n2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class t1 extends ec.j implements mc.q {
    public List X;
    public List Y;
    public List Z;

    /* renamed from: b0  reason: collision with root package name */
    public a1.n0 f10030b0;

    /* renamed from: c0  reason: collision with root package name */
    public a1.n0 f10031c0;

    /* renamed from: d0  reason: collision with root package name */
    public a1.n0 f10032d0;

    /* renamed from: e0  reason: collision with root package name */
    public Set f10033e0;

    /* renamed from: f0  reason: collision with root package name */
    public a1.n0 f10034f0;

    /* renamed from: g0  reason: collision with root package name */
    public int f10035g0;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ b4.a1 f10036h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ u1 f10037i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(u1 u1Var, cc.c cVar) {
        super(3, cVar);
        this.f10037i0 = u1Var;
    }

    public static final void x(u1 u1Var, List list, List list2, List list3, a1.n0 n0Var, a1.n0 n0Var2, a1.n0 n0Var3, a1.n0 n0Var4) {
        char c4;
        long j2;
        long j10;
        synchronized (u1Var.f10041c) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i2 = 0; i2 < size; i2++) {
                    y yVar = (y) list3.get(i2);
                    yVar.a();
                    u1Var.L(yVar);
                }
                list3.clear();
                Object[] objArr = n0Var.f75b;
                long[] jArr = n0Var.f74a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i10 = 0;
                    j2 = 255;
                    while (true) {
                        long j11 = jArr[i10];
                        c4 = 7;
                        j10 = -9187201950435737472L;
                        if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i11 = 8 - ((~(i10 - length)) >>> 31);
                            for (int i12 = 0; i12 < i11; i12++) {
                                if ((j11 & 255) < 128) {
                                    y yVar2 = (y) objArr[(i10 << 3) + i12];
                                    yVar2.a();
                                    u1Var.L(yVar2);
                                }
                                j11 >>= 8;
                            }
                            if (i11 != 8) {
                                break;
                            }
                        }
                        if (i10 == length) {
                            break;
                        }
                        i10++;
                    }
                } else {
                    c4 = 7;
                    j2 = 255;
                    j10 = -9187201950435737472L;
                }
                n0Var.b();
                Object[] objArr2 = n0Var2.f75b;
                long[] jArr2 = n0Var2.f74a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i13 = 0;
                    while (true) {
                        long j12 = jArr2[i13];
                        if ((((~j12) << c4) & j12 & j10) != j10) {
                            int i14 = 8 - ((~(i13 - length2)) >>> 31);
                            for (int i15 = 0; i15 < i14; i15++) {
                                if ((j12 & j2) < 128) {
                                    ((y) objArr2[(i13 << 3) + i15]).g();
                                }
                                j12 >>= 8;
                            }
                            if (i14 != 8) {
                                break;
                            }
                        }
                        if (i13 == length2) {
                            break;
                        }
                        i13++;
                    }
                }
                n0Var2.b();
                n0Var3.b();
                Object[] objArr3 = n0Var4.f75b;
                long[] jArr3 = n0Var4.f74a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i16 = 0;
                    while (true) {
                        long j13 = jArr3[i16];
                        if ((((~j13) << c4) & j13 & j10) != j10) {
                            int i17 = 8 - ((~(i16 - length3)) >>> 31);
                            for (int i18 = 0; i18 < i17; i18++) {
                                if ((j13 & j2) < 128) {
                                    y yVar3 = (y) objArr3[(i16 << 3) + i18];
                                    yVar3.a();
                                    u1Var.L(yVar3);
                                }
                                j13 >>= 8;
                            }
                            if (i17 != 8) {
                                break;
                            }
                        }
                        if (i16 == length3) {
                            break;
                        }
                        i16++;
                    }
                }
                n0Var4.b();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final void y(List list, u1 u1Var) {
        list.clear();
        synchronized (u1Var.f10041c) {
            try {
                ArrayList arrayList = u1Var.f10049k;
                int size = arrayList.size();
                for (int i2 = 0; i2 < size; i2++) {
                    list.add((v0) arrayList.get(i2));
                }
                u1Var.f10049k.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // mc.q
    public final Object i(Object obj, Object obj2, Object obj3) {
        zc.u uVar = (zc.u) obj;
        t1 t1Var = new t1(this.f10037i0, (cc.c) obj3);
        t1Var.f10036h0 = (b4.a1) obj2;
        return t1Var.v(yb.y.f14813a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0098 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0131 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r10v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v5, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v10, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r12v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v11, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v13, types: [java.util.Set] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x0124 -> B:44:0x012c). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x01d9 -> B:12:0x0093). Please submit an issue!!! */
    @Override // ec.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.t1.v(java.lang.Object):java.lang.Object");
    }
}
