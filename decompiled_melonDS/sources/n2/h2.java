package n2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h2 {

    /* renamed from: a  reason: collision with root package name */
    public final e2 f9904a;

    /* renamed from: b  reason: collision with root package name */
    public int[] f9905b;

    /* renamed from: c  reason: collision with root package name */
    public Object[] f9906c;

    /* renamed from: d  reason: collision with root package name */
    public ArrayList f9907d;

    /* renamed from: e  reason: collision with root package name */
    public HashMap f9908e;

    /* renamed from: f  reason: collision with root package name */
    public a1.x f9909f;

    /* renamed from: g  reason: collision with root package name */
    public int f9910g;

    /* renamed from: h  reason: collision with root package name */
    public int f9911h;

    /* renamed from: i  reason: collision with root package name */
    public int f9912i;

    /* renamed from: j  reason: collision with root package name */
    public int f9913j;

    /* renamed from: k  reason: collision with root package name */
    public int f9914k;

    /* renamed from: l  reason: collision with root package name */
    public int f9915l;
    public int m;

    /* renamed from: n  reason: collision with root package name */
    public int f9916n;

    /* renamed from: o  reason: collision with root package name */
    public int f9917o;

    /* renamed from: p  reason: collision with root package name */
    public final a4.w f9918p;

    /* renamed from: q  reason: collision with root package name */
    public final a4.w f9919q;

    /* renamed from: r  reason: collision with root package name */
    public final a4.w f9920r;

    /* renamed from: s  reason: collision with root package name */
    public a1.x f9921s;

    /* renamed from: t  reason: collision with root package name */
    public int f9922t;

    /* renamed from: u  reason: collision with root package name */
    public int f9923u;

    /* renamed from: v  reason: collision with root package name */
    public int f9924v;

    /* renamed from: w  reason: collision with root package name */
    public boolean f9925w;

    /* renamed from: x  reason: collision with root package name */
    public a1.w f9926x;

    public h2(e2 e2Var) {
        this.f9904a = e2Var;
        int[] iArr = e2Var.A;
        this.f9905b = iArr;
        Object[] objArr = e2Var.L;
        this.f9906c = objArr;
        this.f9907d = e2Var.f9900c0;
        this.f9908e = e2Var.f9901d0;
        this.f9909f = e2Var.f9902e0;
        int i2 = e2Var.B;
        this.f9910g = i2;
        this.f9911h = (iArr.length / 5) - i2;
        int i10 = e2Var.R;
        this.f9914k = i10;
        this.f9915l = objArr.length - i10;
        this.m = i2;
        this.f9918p = new a4.w();
        this.f9919q = new a4.w();
        this.f9920r = new a4.w();
        this.f9923u = i2;
        this.f9924v = -1;
    }

    public static int i(int i2, int i10, int i11, int i12) {
        if (i2 > i10) {
            return -(((i12 - i11) - i2) + 1);
        }
        return i2;
    }

    public static void z(h2 h2Var) {
        int i2 = h2Var.f9924v;
        int r5 = h2Var.r(i2);
        int[] iArr = h2Var.f9905b;
        int i10 = (r5 * 5) + 1;
        int i11 = iArr[i10];
        if ((i11 & 134217728) == 0) {
            int i12 = (i11 & (-134217729)) | 134217728;
            iArr[i10] = i12;
            if ((67108864 & i12) != 0) {
                return;
            }
            h2Var.T(h2Var.E(iArr, i2));
        }
    }

    public final void A(e2 e2Var, int i2) {
        if (this.f9916n <= 0) {
            t.a("Check failed");
        }
        if (i2 == 0 && this.f9922t == 0 && this.f9904a.B == 0) {
            int[] iArr = e2Var.A;
            int i10 = iArr[(i2 * 5) + 3];
            int i11 = e2Var.B;
            if (i10 == i11) {
                int[] iArr2 = this.f9905b;
                Object[] objArr = this.f9906c;
                ArrayList arrayList = this.f9907d;
                HashMap hashMap = this.f9908e;
                a1.x xVar = this.f9909f;
                Object[] objArr2 = e2Var.L;
                int i12 = e2Var.R;
                HashMap hashMap2 = e2Var.f9901d0;
                a1.x xVar2 = e2Var.f9902e0;
                this.f9905b = iArr;
                this.f9906c = objArr2;
                this.f9907d = e2Var.f9900c0;
                this.f9910g = i11;
                this.f9911h = (iArr.length / 5) - i11;
                this.f9914k = i12;
                this.f9915l = objArr2.length - i12;
                this.m = i11;
                this.f9908e = hashMap2;
                this.f9909f = xVar2;
                e2Var.A = iArr2;
                e2Var.B = 0;
                e2Var.L = objArr;
                e2Var.R = 0;
                e2Var.f9900c0 = arrayList;
                e2Var.f9901d0 = hashMap;
                e2Var.f9902e0 = xVar;
                return;
            }
        }
        h2 d4 = e2Var.d();
        try {
            s.v(d4, i2, this, true, true, false);
            d4.e(true);
        } catch (Throwable th2) {
            d4.e(false);
            throw th2;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
        r2 = r8.f9905b;
        r3 = r9 * 5;
        r4 = r0 * 5;
        r5 = r1 * 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
        if (r9 >= r1) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0065, code lost:
        zb.k.g(r4 + r3, r3, r5, r2, r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x006a, code lost:
        zb.k.g(r5, r5 + r4, r3 + r4, r2, r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void B(int r9) {
        /*
            r8 = this;
            int r0 = r8.f9911h
            int r1 = r8.f9910g
            if (r1 == r9) goto Lab
            java.util.ArrayList r2 = r8.f9907d
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L59
            int r2 = r8.f9911h
            int r3 = r8.o()
            int r3 = r3 - r2
            java.util.ArrayList r2 = r8.f9907d
            if (r1 >= r9) goto L39
            int r2 = n2.g2.a(r2, r1, r3)
        L1d:
            java.util.ArrayList r4 = r8.f9907d
            int r4 = r4.size()
            if (r2 >= r4) goto L59
            java.util.ArrayList r4 = r8.f9907d
            java.lang.Object r4 = r4.get(r2)
            n2.a r4 = (n2.a) r4
            int r5 = r4.f9871a
            if (r5 >= 0) goto L59
            int r5 = r5 + r3
            if (r5 >= r9) goto L59
            r4.f9871a = r5
            int r2 = r2 + 1
            goto L1d
        L39:
            int r2 = n2.g2.a(r2, r9, r3)
        L3d:
            java.util.ArrayList r4 = r8.f9907d
            int r4 = r4.size()
            if (r2 >= r4) goto L59
            java.util.ArrayList r4 = r8.f9907d
            java.lang.Object r4 = r4.get(r2)
            n2.a r4 = (n2.a) r4
            int r5 = r4.f9871a
            if (r5 < 0) goto L59
            int r5 = r3 - r5
            int r5 = -r5
            r4.f9871a = r5
            int r2 = r2 + 1
            goto L3d
        L59:
            if (r0 <= 0) goto L70
            int[] r2 = r8.f9905b
            int r3 = r9 * 5
            int r4 = r0 * 5
            int r5 = r1 * 5
            if (r9 >= r1) goto L6a
            int r4 = r4 + r3
            zb.k.g(r4, r3, r5, r2, r2)
            goto L70
        L6a:
            int r6 = r5 + r4
            int r3 = r3 + r4
            zb.k.g(r5, r6, r3, r2, r2)
        L70:
            if (r9 >= r1) goto L74
            int r1 = r9 + r0
        L74:
            int r2 = r8.o()
            if (r1 >= r2) goto L7b
            goto L80
        L7b:
            java.lang.String r3 = "Check failed"
            n2.t.a(r3)
        L80:
            if (r1 >= r2) goto Lab
            int[] r3 = r8.f9905b
            int r4 = r1 * 5
            int r4 = r4 + 2
            r3 = r3[r4]
            r5 = -2
            if (r3 <= r5) goto L8f
            r6 = r3
            goto L95
        L8f:
            int r6 = r8.p()
            int r6 = r6 + r3
            int r6 = r6 - r5
        L95:
            if (r6 >= r9) goto L98
            goto L9f
        L98:
            int r7 = r8.p()
            int r7 = r7 - r6
            int r7 = r7 - r5
            int r6 = -r7
        L9f:
            if (r6 == r3) goto La5
            int[] r3 = r8.f9905b
            r3[r4] = r6
        La5:
            int r1 = r1 + 1
            if (r1 != r9) goto L80
            int r1 = r1 + r0
            goto L80
        Lab:
            r8.f9910g = r9
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.h2.B(int):void");
    }

    public final void C(int i2, int i10) {
        int i11 = this.f9915l;
        int i12 = this.f9914k;
        int i13 = this.m;
        if (i12 != i2) {
            Object[] objArr = this.f9906c;
            if (i2 < i12) {
                System.arraycopy(objArr, i2, objArr, i2 + i11, i12 - i2);
            } else {
                int i14 = i12 + i11;
                System.arraycopy(objArr, i14, objArr, i12, (i2 + i11) - i14);
            }
        }
        int min = Math.min(i10 + 1, p());
        if (i13 != min) {
            int length = this.f9906c.length - i11;
            if (min < i13) {
                int r5 = r(min);
                int r10 = r(i13);
                int i15 = this.f9910g;
                while (r5 < r10) {
                    int i16 = (r5 * 5) + 4;
                    int i17 = this.f9905b[i16];
                    if (i17 < 0) {
                        t.a("Unexpected anchor value, expected a positive anchor");
                    }
                    this.f9905b[i16] = -((length - i17) + 1);
                    r5++;
                    if (r5 == i15) {
                        r5 += this.f9911h;
                    }
                }
            } else {
                int r11 = r(i13);
                int r12 = r(min);
                while (r11 < r12) {
                    int i18 = (r11 * 5) + 4;
                    int i19 = this.f9905b[i18];
                    if (i19 >= 0) {
                        t.a("Unexpected anchor value, expected a negative anchor");
                    }
                    this.f9905b[i18] = i19 + length + 1;
                    r11++;
                    if (r11 == this.f9910g) {
                        r11 += this.f9911h;
                    }
                }
            }
            this.m = min;
        }
        this.f9914k = i2;
    }

    public final Object D(int i2) {
        int r5 = r(i2);
        int[] iArr = this.f9905b;
        if ((iArr[(r5 * 5) + 1] & 1073741824) != 0) {
            return this.f9906c[h(g(iArr, r5))];
        }
        return null;
    }

    public final int E(int[] iArr, int i2) {
        int i10 = iArr[(r(i2) * 5) + 2];
        if (i10 > -2) {
            return i10;
        }
        return (p() + i10) - (-2);
    }

    public final Object F(Object obj) {
        if (this.f9916n > 0) {
            x(1, this.f9924v);
        }
        Object[] objArr = this.f9906c;
        int i2 = this.f9912i;
        this.f9912i = i2 + 1;
        Object obj2 = objArr[h(i2)];
        if (this.f9912i > this.f9913j) {
            t.a("Writing to an invalid slot");
        }
        this.f9906c[h(this.f9912i - 1)] = obj;
        return obj2;
    }

    public final void G() {
        int i2;
        int i10;
        a1.w wVar = this.f9926x;
        if (wVar != null) {
            while (wVar.f112b != 0) {
                int E = s.E(wVar);
                int r5 = r(E);
                int i11 = E + 1;
                int u4 = u(E) + E;
                while (true) {
                    i2 = 0;
                    if (i11 < u4) {
                        if ((this.f9905b[(r(i11) * 5) + 1] & 201326592) != 0) {
                            i10 = 1;
                            break;
                        }
                        i11 += u(i11);
                    } else {
                        i10 = 0;
                        break;
                    }
                }
                int[] iArr = this.f9905b;
                int i12 = (r5 * 5) + 1;
                int i13 = iArr[i12];
                if ((67108864 & i13) != 0) {
                    i2 = 1;
                }
                if (i2 != i10) {
                    iArr[i12] = (i10 << 26) | ((-67108865) & i13);
                    int E2 = E(iArr, E);
                    if (E2 >= 0) {
                        s.j(wVar, E2);
                    }
                }
            }
        }
    }

    public final boolean H() {
        if (this.f9916n != 0) {
            t.a("Cannot remove group while inserting");
        }
        int i2 = this.f9922t;
        int i10 = this.f9912i;
        int g10 = g(this.f9905b, r(i2));
        int L = L();
        O(this.f9924v);
        a1.w wVar = this.f9926x;
        if (wVar != null) {
            while (true) {
                int i11 = wVar.f112b;
                if (i11 == 0) {
                    break;
                } else if (i11 != 0) {
                    if (wVar.f111a[0] < i2) {
                        break;
                    }
                    s.E(wVar);
                } else {
                    m9.o.x("IntList is empty.");
                    return false;
                }
            }
        }
        boolean I = I(i2, this.f9922t - i2);
        J(g10, this.f9912i - g10, i2 - 1);
        this.f9922t = i2;
        this.f9912i = i10;
        this.f9917o -= L;
        return I;
    }

    public final boolean I(int i2, int i10) {
        boolean z10 = false;
        if (i10 > 0) {
            ArrayList arrayList = this.f9907d;
            B(i2);
            if (!arrayList.isEmpty()) {
                HashMap hashMap = this.f9908e;
                int i11 = i2 + i10;
                int a10 = g2.a(this.f9907d, i11, o() - this.f9911h);
                if (a10 >= this.f9907d.size()) {
                    a10--;
                }
                int i12 = a10 + 1;
                int i13 = 0;
                while (a10 >= 0) {
                    a aVar = (a) this.f9907d.get(a10);
                    int c4 = c(aVar);
                    if (c4 < i2) {
                        break;
                    }
                    if (c4 < i11) {
                        aVar.f9871a = Integer.MIN_VALUE;
                        if (hashMap != null) {
                            m0 m0Var = (m0) hashMap.remove(aVar);
                        }
                        if (i13 == 0) {
                            i13 = a10 + 1;
                        }
                        i12 = a10;
                    }
                    a10--;
                }
                if (i12 < i13) {
                    z10 = true;
                }
                if (z10) {
                    this.f9907d.subList(i12, i13).clear();
                }
            }
            this.f9910g = i2;
            this.f9911h += i10;
            int i14 = this.m;
            if (i14 > i2) {
                this.m = Math.max(i2, i14 - i10);
            }
            int i15 = this.f9923u;
            if (i15 >= this.f9910g) {
                this.f9923u = i15 - i10;
            }
            int i16 = this.f9924v;
            if (i16 >= 0 && (this.f9905b[(r(i16) * 5) + 1] & 67108864) != 0) {
                T(i16);
            }
        }
        return z10;
    }

    public final void J(int i2, int i10, int i11) {
        if (i10 > 0) {
            int i12 = this.f9915l;
            int i13 = i2 + i10;
            C(i13, i11);
            this.f9914k = i2;
            this.f9915l = i12 + i10;
            Arrays.fill(this.f9906c, i2, i13, (Object) null);
            int i14 = this.f9913j;
            if (i14 >= i2) {
                this.f9913j = i14 - i10;
            }
        }
    }

    public final Object K(int i2, int i10, Object obj) {
        int N = N(this.f9905b, r(i2));
        int g10 = g(this.f9905b, r(i2 + 1));
        int i11 = N + i10;
        if (i11 < N || i11 >= g10) {
            t.a("Write to an invalid slot index " + i10 + " for group " + i2);
        }
        int h2 = h(i11);
        Object[] objArr = this.f9906c;
        Object obj2 = objArr[h2];
        objArr[h2] = obj;
        return obj2;
    }

    public final int L() {
        int r5 = r(this.f9922t);
        int i2 = this.f9922t;
        int[] iArr = this.f9905b;
        int i10 = r5 * 5;
        int i11 = iArr[i10 + 3] + i2;
        this.f9922t = i11;
        this.f9912i = g(iArr, r(i11));
        int i12 = this.f9905b[i10 + 1];
        if ((1073741824 & i12) != 0) {
            return 1;
        }
        return i12 & 67108863;
    }

    public final void M() {
        int i2 = this.f9923u;
        this.f9922t = i2;
        this.f9912i = g(this.f9905b, r(i2));
    }

    public final int N(int[] iArr, int i2) {
        if (i2 >= o()) {
            return this.f9906c.length - this.f9915l;
        }
        int b10 = g2.b(iArr, i2);
        int i10 = this.f9915l;
        int length = this.f9906c.length;
        if (b10 < 0) {
            return (length - i10) + b10 + 1;
        }
        return b10;
    }

    public final m0 O(int i2) {
        a R;
        HashMap hashMap = this.f9908e;
        if (hashMap == null || (R = R(i2)) == null) {
            return null;
        }
        return (m0) hashMap.get(R);
    }

    public final void P() {
        if (this.f9916n != 0) {
            t.a("Key must be supplied when inserting");
        }
        e eVar = l.f9953a;
        Q(0, eVar, eVar, false);
    }

    public final void Q(int i2, Object obj, Object obj2, boolean z10) {
        Object[] objArr;
        int i10;
        int i11;
        int i12;
        int i13 = this.f9924v;
        if (this.f9916n > 0) {
            objArr = 1;
        } else {
            objArr = null;
        }
        this.f9920r.c(this.f9917o);
        e eVar = l.f9953a;
        if (objArr != null) {
            int i14 = this.f9922t;
            int g10 = g(this.f9905b, r(i14));
            w(1);
            this.f9912i = g10;
            this.f9913j = g10;
            int r5 = r(i14);
            if (obj != eVar) {
                i11 = 1;
            } else {
                i11 = 0;
            }
            if (!z10 && obj2 != eVar) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            int i15 = i(g10, this.f9914k, this.f9915l, this.f9906c.length);
            if (i15 >= 0 && this.m < i14) {
                i15 = -(((this.f9906c.length - this.f9915l) - i15) + 1);
            }
            int[] iArr = this.f9905b;
            int i16 = this.f9924v;
            int i17 = r5 * 5;
            iArr[i17] = i2;
            iArr[i17 + 1] = ((z10 ? 1 : 0) << 30) | (i11 << 29) | (i12 << 28);
            iArr[i17 + 2] = i16;
            iArr[i17 + 3] = 0;
            iArr[i17 + 4] = i15;
            int i18 = (z10 ? 1 : 0) + i11 + i12;
            if (i18 > 0) {
                x(i18, i14);
                Object[] objArr2 = this.f9906c;
                int i19 = this.f9912i;
                if (z10) {
                    objArr2[i19] = obj2;
                    i19++;
                }
                if (i11 != 0) {
                    objArr2[i19] = obj;
                    i19++;
                }
                if (i12 != 0) {
                    objArr2[i19] = obj2;
                    i19++;
                }
                this.f9912i = i19;
            }
            this.f9917o = 0;
            i10 = i14 + 1;
            this.f9924v = i14;
            this.f9922t = i10;
            if (i13 >= 0) {
                O(i13);
            }
        } else {
            this.f9918p.c(i13);
            this.f9919q.c((o() - this.f9911h) - this.f9923u);
            int i20 = this.f9922t;
            int r10 = r(i20);
            if (!nc.k.a(obj2, eVar)) {
                if (z10) {
                    U(this.f9922t, obj2);
                } else {
                    S(obj2);
                }
            }
            this.f9912i = N(this.f9905b, r10);
            this.f9913j = g(this.f9905b, r(this.f9922t + 1));
            int[] iArr2 = this.f9905b;
            int i21 = r10 * 5;
            this.f9917o = iArr2[i21 + 1] & 67108863;
            this.f9924v = i20;
            this.f9922t = i20 + 1;
            i10 = i20 + iArr2[i21 + 3];
        }
        this.f9923u = i10;
    }

    public final a R(int i2) {
        ArrayList arrayList;
        int d4;
        if (i2 < 0 || i2 >= p() || (d4 = g2.d((arrayList = this.f9907d), i2, p())) < 0) {
            return null;
        }
        return (a) arrayList.get(d4);
    }

    public final void S(Object obj) {
        int r5 = r(this.f9922t);
        int i2 = (r5 * 5) + 1;
        if ((this.f9905b[i2] & 268435456) == 0) {
            t.a("Updating the data of a group that was not created with a data slot");
        }
        Object[] objArr = this.f9906c;
        int[] iArr = this.f9905b;
        objArr[h(Integer.bitCount(iArr[i2] >> 29) + g(iArr, r5))] = obj;
    }

    public final void T(int i2) {
        if (i2 >= 0) {
            a1.w wVar = this.f9926x;
            if (wVar == null) {
                wVar = new a1.w();
                this.f9926x = wVar;
            }
            s.j(wVar, i2);
        }
    }

    public final void U(int i2, Object obj) {
        int r5 = r(i2);
        int[] iArr = this.f9905b;
        if (r5 >= iArr.length || (iArr[(r5 * 5) + 1] & 1073741824) == 0) {
            t.a("Updating the node of a group at " + i2 + " that was not created with as a node group");
        }
        this.f9906c[h(g(this.f9905b, r5))] = obj;
    }

    public final void a(int i2) {
        if (i2 < 0) {
            t.a("Cannot seek backwards");
        }
        if (this.f9916n > 0) {
            l1.b("Cannot call seek() while inserting");
        }
        if (i2 == 0) {
            return;
        }
        int i10 = this.f9922t + i2;
        if (i10 < this.f9924v || i10 > this.f9923u) {
            t.a("Cannot seek outside the current group (" + this.f9924v + '-' + this.f9923u + ')');
        }
        this.f9922t = i10;
        int g10 = g(this.f9905b, r(i10));
        this.f9912i = g10;
        this.f9913j = g10;
    }

    public final a b(int i2) {
        ArrayList arrayList = this.f9907d;
        int d4 = g2.d(arrayList, i2, p());
        if (d4 < 0) {
            if (i2 > this.f9910g) {
                i2 = -(p() - i2);
            }
            a aVar = new a(i2);
            arrayList.add(-(d4 + 1), aVar);
            return aVar;
        }
        return (a) arrayList.get(d4);
    }

    public final int c(a aVar) {
        int i2 = aVar.f9871a;
        if (i2 < 0) {
            return p() + i2;
        }
        return i2;
    }

    public final void d() {
        int i2 = this.f9916n;
        this.f9916n = i2 + 1;
        if (i2 == 0) {
            this.f9919q.c((o() - this.f9911h) - this.f9923u);
        }
    }

    public final void e(boolean z10) {
        this.f9925w = true;
        if (z10 && this.f9918p.f351b == 0) {
            B(p());
            C(this.f9906c.length - this.f9915l, this.f9910g);
            int i2 = this.f9914k;
            Arrays.fill(this.f9906c, i2, this.f9915l + i2, (Object) null);
            G();
        }
        int[] iArr = this.f9905b;
        int i10 = this.f9910g;
        Object[] objArr = this.f9906c;
        int i11 = this.f9914k;
        ArrayList arrayList = this.f9907d;
        HashMap hashMap = this.f9908e;
        a1.x xVar = this.f9909f;
        e2 e2Var = this.f9904a;
        if (!e2Var.Z) {
            l1.a("Unexpected writer close()");
        }
        e2Var.Z = false;
        e2Var.A = iArr;
        e2Var.B = i10;
        e2Var.L = objArr;
        e2Var.R = i11;
        e2Var.f9900c0 = arrayList;
        e2Var.f9901d0 = hashMap;
        e2Var.f9902e0 = xVar;
    }

    public final int f(int i2) {
        return g(this.f9905b, r(i2));
    }

    public final int g(int[] iArr, int i2) {
        if (i2 >= o()) {
            return this.f9906c.length - this.f9915l;
        }
        int i10 = iArr[(i2 * 5) + 4];
        int i11 = this.f9915l;
        int length = this.f9906c.length;
        if (i10 < 0) {
            return (length - i11) + i10 + 1;
        }
        return i10;
    }

    public final int h(int i2) {
        int i10;
        int i11 = this.f9915l;
        if (i2 < this.f9914k) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        return (i11 * i10) + i2;
    }

    public final void j() {
        boolean z10;
        boolean z11;
        int i2;
        int r5;
        a1.h0 h0Var;
        int i10 = 0;
        if (this.f9916n > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        int i11 = this.f9922t;
        int i12 = this.f9923u;
        int i13 = this.f9924v;
        int r10 = r(i13);
        int i14 = this.f9917o;
        int i15 = i11 - i13;
        int i16 = r10 * 5;
        int i17 = i16 + 1;
        if ((this.f9905b[i17] & 1073741824) != 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        a4.w wVar = this.f9920r;
        if (z10) {
            a1.x xVar = this.f9921s;
            if (xVar != null && (h0Var = (a1.h0) xVar.b(i13)) != null) {
                Object[] objArr = h0Var.f44a;
                int i18 = h0Var.f45b;
                for (int i19 = 0; i19 < i18; i19++) {
                    F(objArr[i19]);
                }
                a1.h0 h0Var2 = (a1.h0) xVar.g(i13);
            }
            int[] iArr = this.f9905b;
            iArr[i16 + 3] = i15;
            g2.c(r10, i14, iArr);
            int b10 = wVar.b();
            if (z11) {
                i14 = 1;
            }
            this.f9917o = b10 + i14;
            int E = E(this.f9905b, i13);
            this.f9924v = E;
            if (E < 0) {
                r5 = p();
            } else {
                r5 = r(E + 1);
            }
            if (r5 >= 0) {
                i10 = g(this.f9905b, r5);
            }
            this.f9912i = i10;
            this.f9913j = i10;
            return;
        }
        if (i11 != i12) {
            t.a("Expected to be at the end of a group");
        }
        int[] iArr2 = this.f9905b;
        int i20 = i16 + 3;
        int i21 = iArr2[i20];
        int i22 = iArr2[i17] & 67108863;
        iArr2[i20] = i15;
        g2.c(r10, i14, iArr2);
        int b11 = this.f9918p.b();
        this.f9923u = (o() - this.f9911h) - this.f9919q.b();
        this.f9924v = b11;
        int E2 = E(this.f9905b, i13);
        int b12 = wVar.b();
        this.f9917o = b12;
        if (E2 == b11) {
            if (!z11) {
                i10 = i14 - i22;
            }
            this.f9917o = b12 + i10;
            return;
        }
        int i23 = i15 - i21;
        if (z11) {
            i2 = 0;
        } else {
            i2 = i14 - i22;
        }
        if (i23 != 0 || i2 != 0) {
            while (E2 != 0 && E2 != b11 && (i2 != 0 || i23 != 0)) {
                int r11 = r(E2);
                if (i23 != 0) {
                    int[] iArr3 = this.f9905b;
                    int i24 = (r11 * 5) + 3;
                    iArr3[i24] = iArr3[i24] + i23;
                }
                if (i2 != 0) {
                    int[] iArr4 = this.f9905b;
                    g2.c(r11, (iArr4[(r11 * 5) + 1] & 67108863) + i2, iArr4);
                }
                int[] iArr5 = this.f9905b;
                if ((iArr5[(r11 * 5) + 1] & 1073741824) != 0) {
                    i2 = 0;
                }
                E2 = E(iArr5, E2);
            }
        }
        this.f9917o += i2;
    }

    public final void k() {
        if (this.f9916n <= 0) {
            l1.b("Unbalanced begin/end insert");
        }
        int i2 = this.f9916n - 1;
        this.f9916n = i2;
        if (i2 == 0) {
            if (this.f9920r.f351b != this.f9918p.f351b) {
                t.a("startGroup/endGroup mismatch while inserting");
            }
            this.f9923u = (o() - this.f9911h) - this.f9919q.b();
        }
    }

    public final void l(int i2) {
        boolean z10;
        boolean z11 = false;
        if (this.f9916n <= 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!z10) {
            t.a("Cannot call ensureStarted() while inserting");
        }
        int i10 = this.f9924v;
        if (i10 != i2) {
            if (i2 >= i10 && i2 < this.f9923u) {
                z11 = true;
            }
            if (!z11) {
                t.a("Started group at " + i2 + " must be a subgroup of the group at " + i10);
            }
            int i11 = this.f9922t;
            int i12 = this.f9912i;
            int i13 = this.f9913j;
            this.f9922t = i2;
            P();
            this.f9922t = i11;
            this.f9912i = i12;
            this.f9913j = i13;
        }
    }

    public final void m(int i2, int i10, int i11) {
        if (i2 >= this.f9910g) {
            i2 = -((p() - i2) + 2);
        }
        while (i11 < i10) {
            this.f9905b[(r(i11) * 5) + 2] = i2;
            int i12 = this.f9905b[(r(i11) * 5) + 3] + i11;
            m(i11, i12, i11 + 1);
            i11 = i12;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x011a, code lost:
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void n(int r20, mc.p r21) {
        /*
            Method dump skipped, instructions count: 313
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: n2.h2.n(int, mc.p):void");
    }

    public final int o() {
        return this.f9905b.length / 5;
    }

    public final int p() {
        return o() - this.f9911h;
    }

    public final Object q(int i2) {
        int r5 = r(i2);
        int[] iArr = this.f9905b;
        int i10 = (r5 * 5) + 1;
        if ((iArr[i10] & 268435456) != 0) {
            return this.f9906c[Integer.bitCount(iArr[i10] >> 29) + g(iArr, r5)];
        }
        return l.f9953a;
    }

    public final int r(int i2) {
        int i10;
        int i11 = this.f9911h;
        if (i2 < this.f9910g) {
            i10 = 0;
        } else {
            i10 = 1;
        }
        return (i11 * i10) + i2;
    }

    public final int s(int i2) {
        return this.f9905b[r(i2) * 5];
    }

    public final Object t(int i2) {
        int r5 = r(i2);
        int[] iArr = this.f9905b;
        int i10 = r5 * 5;
        int i11 = iArr[i10 + 1];
        if ((536870912 & i11) != 0) {
            return this.f9906c[Integer.bitCount(i11 >> 30) + iArr[i10 + 4]];
        }
        return null;
    }

    public final String toString() {
        return "SlotWriter(current = " + this.f9922t + " end=" + this.f9923u + " size = " + p() + " gap=" + this.f9910g + '-' + (this.f9910g + this.f9911h) + ')';
    }

    public final int u(int i2) {
        return this.f9905b[(r(i2) * 5) + 3];
    }

    public final boolean v(int i2, int i10) {
        int o5;
        int u4;
        if (i10 == this.f9924v) {
            o5 = this.f9923u;
        } else {
            a4.w wVar = this.f9918p;
            if (i10 > wVar.a(0)) {
                u4 = u(i10);
            } else {
                int[] iArr = wVar.f350a;
                int min = Math.min(iArr.length, wVar.f351b);
                int i11 = 0;
                while (true) {
                    if (i11 < min) {
                        if (iArr[i11] == i10) {
                            break;
                        }
                        i11++;
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                if (i11 < 0) {
                    u4 = u(i10);
                } else {
                    o5 = (o() - this.f9911h) - this.f9919q.f350a[i11];
                }
            }
            o5 = u4 + i10;
        }
        if (i2 <= i10 || i2 >= o5) {
            return false;
        }
        return true;
    }

    public final void w(int i2) {
        int i10;
        if (i2 > 0) {
            int i11 = this.f9922t;
            B(i11);
            int i12 = this.f9910g;
            int i13 = this.f9911h;
            int[] iArr = this.f9905b;
            int length = iArr.length / 5;
            int i14 = length - i13;
            int i15 = 0;
            if (i13 < i2) {
                int max = Math.max(Math.max(length * 2, i14 + i2), 32);
                int[] iArr2 = new int[max * 5];
                int i16 = max - i14;
                zb.k.g(0, 0, i12 * 5, iArr, iArr2);
                zb.k.g((i12 + i16) * 5, (i13 + i12) * 5, length * 5, iArr, iArr2);
                this.f9905b = iArr2;
                i13 = i16;
            }
            int i17 = this.f9923u;
            if (i17 >= i12) {
                this.f9923u = i17 + i2;
            }
            int i18 = i12 + i2;
            this.f9910g = i18;
            this.f9911h = i13 - i2;
            if (i14 > 0) {
                i10 = f(i11 + i2);
            } else {
                i10 = 0;
            }
            if (this.m >= i12) {
                i15 = this.f9914k;
            }
            int i19 = i(i10, i15, this.f9915l, this.f9906c.length);
            for (int i20 = i12; i20 < i18; i20++) {
                this.f9905b[(i20 * 5) + 4] = i19;
            }
            int i21 = this.m;
            if (i21 >= i12) {
                this.m = i21 + i2;
            }
        }
    }

    public final void x(int i2, int i10) {
        if (i2 > 0) {
            C(this.f9912i, i10);
            int i11 = this.f9914k;
            int i12 = this.f9915l;
            if (i12 < i2) {
                Object[] objArr = this.f9906c;
                int length = objArr.length;
                int i13 = length - i12;
                int max = Math.max(Math.max(length * 2, i13 + i2), 32);
                Object[] objArr2 = new Object[max];
                for (int i14 = 0; i14 < max; i14++) {
                    objArr2[i14] = null;
                }
                int i15 = max - i13;
                int i16 = i12 + i11;
                System.arraycopy(objArr, 0, objArr2, 0, i11);
                System.arraycopy(objArr, i16, objArr2, i11 + i15, length - i16);
                this.f9906c = objArr2;
                i12 = i15;
            }
            int i17 = this.f9913j;
            if (i17 >= i11) {
                this.f9913j = i17 + i2;
            }
            this.f9914k = i11 + i2;
            this.f9915l = i12 - i2;
        }
    }

    public final boolean y(int i2) {
        if ((this.f9905b[(r(i2) * 5) + 1] & 1073741824) != 0) {
            return true;
        }
        return false;
    }
}
