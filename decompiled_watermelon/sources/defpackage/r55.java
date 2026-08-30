package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r55  reason: default package */
/* loaded from: classes.dex */
public final class r55 extends nk6 implements bj2 {
    public List X;
    public List Y;
    public List Z;
    public e24 c0;
    public e24 d0;
    public e24 e0;
    public Set f0;
    public e24 g0;
    public int h0;
    public /* synthetic */ im i0;
    public final /* synthetic */ s55 j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r55(s55 s55Var, j11 j11Var) {
        super(3, j11Var);
        this.j0 = s55Var;
    }

    public static final void x(s55 s55Var, List list, List list2, List list3, e24 e24Var, e24 e24Var2, e24 e24Var3, e24 e24Var4) {
        char c;
        long j;
        long j2;
        synchronized (s55Var.c) {
            try {
                list.clear();
                list2.clear();
                int size = list3.size();
                for (int i = 0; i < size; i++) {
                    iv0 iv0Var = (iv0) list3.get(i);
                    iv0Var.a();
                    s55Var.L(iv0Var);
                }
                list3.clear();
                Object[] objArr = e24Var.b;
                long[] jArr = e24Var.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i2 = 0;
                    j = 255;
                    while (true) {
                        long j3 = jArr[i2];
                        c = 7;
                        j2 = -9187201950435737472L;
                        if ((((~j3) << 7) & j3 & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i3 = 8 - ((~(i2 - length)) >>> 31);
                            for (int i4 = 0; i4 < i3; i4++) {
                                if ((j3 & 255) < 128) {
                                    iv0 iv0Var2 = (iv0) objArr[(i2 << 3) + i4];
                                    iv0Var2.a();
                                    s55Var.L(iv0Var2);
                                }
                                j3 >>= 8;
                            }
                            if (i3 != 8) {
                                break;
                            }
                        }
                        if (i2 == length) {
                            break;
                        }
                        i2++;
                    }
                } else {
                    c = 7;
                    j = 255;
                    j2 = -9187201950435737472L;
                }
                e24Var.b();
                Object[] objArr2 = e24Var2.b;
                long[] jArr2 = e24Var2.a;
                int length2 = jArr2.length - 2;
                if (length2 >= 0) {
                    int i5 = 0;
                    while (true) {
                        long j4 = jArr2[i5];
                        if ((((~j4) << c) & j4 & j2) != j2) {
                            int i6 = 8 - ((~(i5 - length2)) >>> 31);
                            for (int i7 = 0; i7 < i6; i7++) {
                                if ((j4 & j) < 128) {
                                    ((iv0) objArr2[(i5 << 3) + i7]).g();
                                }
                                j4 >>= 8;
                            }
                            if (i6 != 8) {
                                break;
                            }
                        }
                        if (i5 == length2) {
                            break;
                        }
                        i5++;
                    }
                }
                e24Var2.b();
                e24Var3.b();
                Object[] objArr3 = e24Var4.b;
                long[] jArr3 = e24Var4.a;
                int length3 = jArr3.length - 2;
                if (length3 >= 0) {
                    int i8 = 0;
                    while (true) {
                        long j5 = jArr3[i8];
                        if ((((~j5) << c) & j5 & j2) != j2) {
                            int i9 = 8 - ((~(i8 - length3)) >>> 31);
                            for (int i10 = 0; i10 < i9; i10++) {
                                if ((j5 & j) < 128) {
                                    iv0 iv0Var3 = (iv0) objArr3[(i8 << 3) + i10];
                                    iv0Var3.a();
                                    s55Var.L(iv0Var3);
                                }
                                j5 >>= 8;
                            }
                            if (i9 != 8) {
                                break;
                            }
                        }
                        if (i8 == length3) {
                            break;
                        }
                        i8++;
                    }
                }
                e24Var4.b();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static final void y(List list, s55 s55Var) {
        list.clear();
        synchronized (s55Var.c) {
            try {
                ArrayList arrayList = s55Var.k;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    list.add((j04) arrayList.get(i));
                }
                s55Var.k.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.bj2
    public final Object i(Object obj, Object obj2, Object obj3) {
        o31 o31Var = (o31) obj;
        r55 r55Var = new r55(this.j0, (j11) obj3);
        r55Var.i0 = (im) obj2;
        return r55Var.v(o27.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0098 A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d8  */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:62:0x01d8 -> B:12:0x0093). Please submit an issue!!! */
    @Override // defpackage.m00
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object v(java.lang.Object r23) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r55.v(java.lang.Object):java.lang.Object");
    }
}
