package defpackage;

import java.util.HashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ab6  reason: default package */
/* loaded from: classes.dex */
public final class ab6 {
    public final mi2 a;
    public Object b;
    public s14 c;
    public boolean j;
    public int k;
    public int d = -1;
    public final d24 e = oo2.y();
    public final d24 f = new d24();
    public final e24 g = new e24();
    public final o24 h = new o24(new ee1[16]);
    public final rk2 i = new rk2(1, this);
    public final d24 l = oo2.y();
    public final HashMap m = new HashMap();

    public ab6(mi2 mi2Var) {
        this.a = mi2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0064, code lost:
        if (((defpackage.qe6) r15).f(2) == false) goto L153;
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ab6.a(java.util.Set):boolean");
    }

    public final void b(Object obj, int i, Object obj2, s14 s14Var) {
        int i2;
        if (this.k <= 0) {
            int c = s14Var.c(obj);
            if (c < 0) {
                c = ~c;
                i2 = -1;
            } else {
                i2 = s14Var.c[c];
            }
            s14Var.b[c] = obj;
            s14Var.c[c] = i;
            if ((obj instanceof ee1) && i2 != i) {
                de1 i3 = ((ee1) obj).i();
                this.m.put(obj, i3.f);
                s14 s14Var2 = i3.e;
                d24 d24Var = this.l;
                oo2.R(d24Var, obj);
                Object[] objArr = s14Var2.b;
                long[] jArr = s14Var2.a;
                int length = jArr.length - 2;
                if (length >= 0) {
                    int i4 = 0;
                    while (true) {
                        long j = jArr[i4];
                        if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                            int i5 = 8 - ((~(i4 - length)) >>> 31);
                            for (int i6 = 0; i6 < i5; i6++) {
                                if ((j & 255) < 128) {
                                    pe6 pe6Var = (pe6) objArr[(i4 << 3) + i6];
                                    if (pe6Var instanceof qe6) {
                                        ((qe6) pe6Var).g(2);
                                    }
                                    oo2.q(d24Var, pe6Var, obj);
                                }
                                j >>= 8;
                            }
                            if (i5 != 8) {
                                break;
                            }
                        }
                        if (i4 == length) {
                            break;
                        }
                        i4++;
                    }
                }
            }
            if (i2 == -1) {
                if (obj instanceof qe6) {
                    ((qe6) obj).g(2);
                }
                oo2.q(this.e, obj, obj2);
            }
        }
    }

    public final void c(Object obj, Object obj2) {
        d24 d24Var = this.e;
        oo2.Q(d24Var, obj2, obj);
        if ((obj2 instanceof ee1) && !d24Var.c(obj2)) {
            oo2.R(this.l, obj2);
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ab6.d():void");
    }
}
