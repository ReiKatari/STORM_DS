package s2;

import java.util.Arrays;
import n2.l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: e  reason: collision with root package name */
    public static final k f12817e = new k(0, 0, new Object[0], null);

    /* renamed from: a  reason: collision with root package name */
    public int f12818a;

    /* renamed from: b  reason: collision with root package name */
    public int f12819b;

    /* renamed from: c  reason: collision with root package name */
    public final u2.b f12820c;

    /* renamed from: d  reason: collision with root package name */
    public Object[] f12821d;

    public k(int i2, int i10, Object[] objArr, u2.b bVar) {
        this.f12818a = i2;
        this.f12819b = i10;
        this.f12820c = bVar;
        this.f12821d = objArr;
    }

    public static k j(int i2, Object obj, Object obj2, int i10, Object obj3, Object obj4, int i11, u2.b bVar) {
        if (i11 > 30) {
            return new k(0, 0, new Object[]{obj, obj2, obj3, obj4}, bVar);
        }
        int q10 = p7.a.q(i2, i11);
        int q11 = p7.a.q(i10, i11);
        if (q10 != q11) {
            return new k((1 << q10) | (1 << q11), 0, q10 < q11 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, bVar);
        }
        return new k(0, 1 << q10, new Object[]{j(i2, obj, obj2, i10, obj3, obj4, i11 + 5, bVar)}, bVar);
    }

    public final Object[] a(int i2, int i10, int i11, Object obj, Object obj2, int i12, u2.b bVar) {
        int i13;
        Object obj3 = this.f12821d[i2];
        if (obj3 != null) {
            i13 = obj3.hashCode();
        } else {
            i13 = 0;
        }
        k j2 = j(i13, obj3, x(i2), i11, obj, obj2, i12 + 5, bVar);
        int t5 = t(i10);
        int i14 = t5 + 1;
        Object[] objArr = this.f12821d;
        Object[] objArr2 = new Object[objArr.length - 1];
        zb.k.l(objArr, objArr2, 0, i2, 6);
        zb.k.i(objArr, objArr2, i2, i2 + 2, i14);
        objArr2[t5 - 1] = j2;
        zb.k.i(objArr, objArr2, t5, i14, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.f12819b == 0) {
            return this.f12821d.length / 2;
        }
        int bitCount = Integer.bitCount(this.f12818a);
        int length = this.f12821d.length;
        for (int i2 = bitCount * 2; i2 < length; i2++) {
            bitCount += s(i2).b();
        }
        return bitCount;
    }

    public final boolean c(Object obj) {
        sc.b H = p7.j.H(p7.j.L(0, this.f12821d.length), 2);
        int i2 = H.A;
        int i10 = H.B;
        int i11 = H.L;
        if ((i11 > 0 && i2 <= i10) || (i11 < 0 && i10 <= i2)) {
            while (!nc.k.a(obj, this.f12821d[i2])) {
                if (i2 != i10) {
                    i2 += i11;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i2, int i10, Object obj) {
        int q10 = 1 << p7.a.q(i2, i10);
        if (h(q10)) {
            return nc.k.a(obj, this.f12821d[f(q10)]);
        } else if (i(q10)) {
            k s10 = s(t(q10));
            if (i10 == 30) {
                return s10.c(obj);
            }
            return s10.d(i2, i10 + 5, obj);
        } else {
            return false;
        }
    }

    public final boolean e(k kVar) {
        if (this != kVar) {
            if (this.f12819b == kVar.f12819b && this.f12818a == kVar.f12818a) {
                int length = this.f12821d.length;
                for (int i2 = 0; i2 < length; i2++) {
                    if (this.f12821d[i2] == kVar.f12821d[i2]) {
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int f(int i2) {
        return Integer.bitCount((i2 - 1) & this.f12818a) * 2;
    }

    public final Object g(int i2, int i10, Object obj) {
        int q10 = 1 << p7.a.q(i2, i10);
        if (h(q10)) {
            int f8 = f(q10);
            if (nc.k.a(obj, this.f12821d[f8])) {
                return x(f8);
            }
            return null;
        } else if (i(q10)) {
            k s10 = s(t(q10));
            if (i10 == 30) {
                sc.b H = p7.j.H(p7.j.L(0, s10.f12821d.length), 2);
                int i11 = H.A;
                int i12 = H.B;
                int i13 = H.L;
                if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                    while (!nc.k.a(obj, s10.f12821d[i11])) {
                        if (i11 != i12) {
                            i11 += i13;
                        } else {
                            return null;
                        }
                    }
                    return s10.x(i11);
                }
                return null;
            }
            return s10.g(i2, i10 + 5, obj);
        } else {
            return null;
        }
    }

    public final boolean h(int i2) {
        if ((i2 & this.f12818a) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i(int i2) {
        if ((i2 & this.f12819b) != 0) {
            return true;
        }
        return false;
    }

    public final k k(int i2, d dVar) {
        dVar.c(dVar.Y - 1);
        dVar.R = x(i2);
        Object[] objArr = this.f12821d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f12820c == dVar.B) {
            this.f12821d = p7.a.e(i2, objArr);
            return this;
        }
        return new k(0, 0, p7.a.e(i2, objArr), dVar.B);
    }

    public final k l(int i2, Object obj, Object obj2, int i10, d dVar) {
        d dVar2;
        k l10;
        int q10 = 1 << p7.a.q(i2, i10);
        boolean h2 = h(q10);
        u2.b bVar = this.f12820c;
        if (h2) {
            int f8 = f(q10);
            if (nc.k.a(obj, this.f12821d[f8])) {
                dVar.R = x(f8);
                if (x(f8) == obj2) {
                    return this;
                }
                if (bVar == dVar.B) {
                    this.f12821d[f8 + 1] = obj2;
                    return this;
                }
                dVar.X++;
                Object[] objArr = this.f12821d;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                copyOf[f8 + 1] = obj2;
                return new k(this.f12818a, this.f12819b, copyOf, dVar.B);
            }
            dVar.c(dVar.Y + 1);
            u2.b bVar2 = dVar.B;
            if (bVar == bVar2) {
                this.f12821d = a(f8, q10, i2, obj, obj2, i10, bVar2);
                this.f12818a ^= q10;
                this.f12819b |= q10;
                return this;
            }
            return new k(this.f12818a ^ q10, this.f12819b | q10, a(f8, q10, i2, obj, obj2, i10, bVar2), bVar2);
        } else if (i(q10)) {
            int t5 = t(q10);
            k s10 = s(t5);
            if (i10 == 30) {
                sc.b H = p7.j.H(p7.j.L(0, s10.f12821d.length), 2);
                int i11 = H.A;
                int i12 = H.B;
                int i13 = H.L;
                if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                    while (!nc.k.a(obj, s10.f12821d[i11])) {
                        if (i11 != i12) {
                            i11 += i13;
                        }
                    }
                    dVar.R = s10.x(i11);
                    if (s10.f12820c == dVar.B) {
                        s10.f12821d[i11 + 1] = obj2;
                        l10 = s10;
                    } else {
                        dVar.X++;
                        Object[] objArr2 = s10.f12821d;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        copyOf2[i11 + 1] = obj2;
                        l10 = new k(0, 0, copyOf2, dVar.B);
                    }
                    dVar2 = dVar;
                }
                dVar.c(dVar.Y + 1);
                l10 = new k(0, 0, p7.a.d(s10.f12821d, 0, obj, obj2), dVar.B);
                dVar2 = dVar;
            } else {
                dVar2 = dVar;
                l10 = s10.l(i2, obj, obj2, i10 + 5, dVar2);
            }
            if (s10 == l10) {
                return this;
            }
            return r(t5, l10, dVar2.B);
        } else {
            dVar.c(dVar.Y + 1);
            u2.b bVar3 = dVar.B;
            int f10 = f(q10);
            Object[] objArr3 = this.f12821d;
            if (bVar == bVar3) {
                this.f12821d = p7.a.d(objArr3, f10, obj, obj2);
                this.f12818a |= q10;
                return this;
            }
            return new k(this.f12818a | q10, this.f12819b, p7.a.d(objArr3, f10, obj, obj2), bVar3);
        }
    }

    public final k m(k kVar, int i2, u2.a aVar, d dVar) {
        k kVar2;
        Object[] objArr;
        int i10;
        int i11;
        k j2;
        int i12;
        int i13;
        int i14;
        if (this == kVar) {
            aVar.f13478a += b();
            return this;
        }
        int i15 = 0;
        if (i2 > 30) {
            u2.b bVar = dVar.B;
            int i16 = kVar.f12819b;
            Object[] objArr2 = this.f12821d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + kVar.f12821d.length);
            int length = this.f12821d.length;
            sc.b H = p7.j.H(p7.j.L(0, kVar.f12821d.length), 2);
            int i17 = H.A;
            int i18 = H.B;
            int i19 = H.L;
            if ((i19 > 0 && i17 <= i18) || (i19 < 0 && i18 <= i17)) {
                while (true) {
                    if (!c(kVar.f12821d[i17])) {
                        Object[] objArr3 = kVar.f12821d;
                        copyOf[length] = objArr3[i17];
                        copyOf[length + 1] = objArr3[i17 + 1];
                        length += 2;
                    } else {
                        aVar.f13478a++;
                    }
                    if (i17 == i18) {
                        break;
                    }
                    i17 += i19;
                }
            }
            if (length != this.f12821d.length) {
                if (length == kVar.f12821d.length) {
                    return kVar;
                }
                if (length == copyOf.length) {
                    return new k(0, 0, copyOf, bVar);
                }
                return new k(0, 0, Arrays.copyOf(copyOf, length), bVar);
            }
        } else {
            int i20 = this.f12819b | kVar.f12819b;
            int i21 = this.f12818a;
            int i22 = kVar.f12818a;
            int i23 = i21 & i22;
            int i24 = (i21 ^ i22) & (~i20);
            while (i23 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i23);
                if (nc.k.a(this.f12821d[f(lowestOneBit)], kVar.f12821d[kVar.f(lowestOneBit)])) {
                    i24 |= lowestOneBit;
                } else {
                    i20 |= lowestOneBit;
                }
                i23 ^= lowestOneBit;
            }
            if ((i20 & i24) != 0) {
                l1.b("Check failed.");
            }
            if (nc.k.a(this.f12820c, dVar.B) && this.f12818a == i24 && this.f12819b == i20) {
                kVar2 = this;
            } else {
                kVar2 = new k(i24, i20, new Object[Integer.bitCount(i20) + (Integer.bitCount(i24) * 2)], null);
            }
            int i25 = i20;
            int i26 = 0;
            while (i25 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i25);
                Object[] objArr4 = kVar2.f12821d;
                int length2 = (objArr4.length - 1) - i26;
                if (i(lowestOneBit2)) {
                    j2 = s(t(lowestOneBit2));
                    if (kVar.i(lowestOneBit2)) {
                        j2 = j2.m(kVar.s(kVar.t(lowestOneBit2)), i2 + 5, aVar, dVar);
                        objArr = objArr4;
                    } else if (kVar.h(lowestOneBit2)) {
                        int f8 = kVar.f(lowestOneBit2);
                        Object obj = kVar.f12821d[f8];
                        Object x9 = kVar.x(f8);
                        int i27 = dVar.Y;
                        if (obj != null) {
                            i14 = obj.hashCode();
                        } else {
                            i14 = i15;
                        }
                        int i28 = i14;
                        objArr = objArr4;
                        j2 = j2.l(i28, obj, x9, i2 + 5, dVar);
                        if (dVar.Y == i27) {
                            aVar.f13478a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (kVar.i(lowestOneBit2)) {
                        k s10 = kVar.s(kVar.t(lowestOneBit2));
                        if (h(lowestOneBit2)) {
                            int f10 = f(lowestOneBit2);
                            Object obj2 = this.f12821d[f10];
                            if (obj2 != null) {
                                i12 = obj2.hashCode();
                            } else {
                                i12 = 0;
                            }
                            int i29 = i2 + 5;
                            if (s10.d(i12, i29, obj2)) {
                                aVar.f13478a++;
                            } else {
                                Object x10 = x(f10);
                                if (obj2 != null) {
                                    i13 = obj2.hashCode();
                                } else {
                                    i13 = 0;
                                }
                                j2 = s10.l(i13, obj2, x10, i29, dVar);
                            }
                        }
                        j2 = s10;
                    } else {
                        int f11 = f(lowestOneBit2);
                        Object obj3 = this.f12821d[f11];
                        Object x11 = x(f11);
                        int f12 = kVar.f(lowestOneBit2);
                        Object obj4 = kVar.f12821d[f12];
                        Object x12 = kVar.x(f12);
                        if (obj3 != null) {
                            i10 = obj3.hashCode();
                        } else {
                            i10 = 0;
                        }
                        if (obj4 != null) {
                            i11 = obj4.hashCode();
                        } else {
                            i11 = 0;
                        }
                        j2 = j(i10, obj3, x11, i11, obj4, x12, i2 + 5, dVar.B);
                    }
                }
                objArr[length2] = j2;
                i26++;
                i25 ^= lowestOneBit2;
                i15 = 0;
            }
            int i30 = 0;
            while (i24 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i24);
                int i31 = i30 * 2;
                if (!kVar.h(lowestOneBit3)) {
                    int f13 = f(lowestOneBit3);
                    Object[] objArr5 = kVar2.f12821d;
                    objArr5[i31] = this.f12821d[f13];
                    objArr5[i31 + 1] = x(f13);
                } else {
                    int f14 = kVar.f(lowestOneBit3);
                    Object[] objArr6 = kVar2.f12821d;
                    objArr6[i31] = kVar.f12821d[f14];
                    objArr6[i31 + 1] = kVar.x(f14);
                    if (h(lowestOneBit3)) {
                        aVar.f13478a++;
                    }
                }
                i30++;
                i24 ^= lowestOneBit3;
            }
            if (!e(kVar2)) {
                if (kVar.e(kVar2)) {
                    return kVar;
                }
                return kVar2;
            }
        }
        return this;
    }

    public final k n(int i2, Object obj, int i10, d dVar) {
        k n10;
        int q10 = 1 << p7.a.q(i2, i10);
        if (h(q10)) {
            int f8 = f(q10);
            if (nc.k.a(obj, this.f12821d[f8])) {
                return p(f8, q10, dVar);
            }
        } else if (i(q10)) {
            int t5 = t(q10);
            k s10 = s(t5);
            if (i10 == 30) {
                sc.b H = p7.j.H(p7.j.L(0, s10.f12821d.length), 2);
                int i11 = H.A;
                int i12 = H.B;
                int i13 = H.L;
                if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                    while (!nc.k.a(obj, s10.f12821d[i11])) {
                        if (i11 != i12) {
                            i11 += i13;
                        }
                    }
                    n10 = s10.k(i11, dVar);
                }
                n10 = s10;
                break;
            }
            n10 = s10.n(i2, obj, i10 + 5, dVar);
            return q(s10, n10, t5, q10, dVar.B);
        }
        return this;
    }

    public final k o(int i2, Object obj, Object obj2, int i10, d dVar) {
        k kVar;
        k o5;
        int q10 = 1 << p7.a.q(i2, i10);
        if (h(q10)) {
            int f8 = f(q10);
            if (nc.k.a(obj, this.f12821d[f8]) && nc.k.a(obj2, x(f8))) {
                return p(f8, q10, dVar);
            }
        } else if (i(q10)) {
            int t5 = t(q10);
            k s10 = s(t5);
            if (i10 == 30) {
                sc.b H = p7.j.H(p7.j.L(0, s10.f12821d.length), 2);
                int i11 = H.A;
                int i12 = H.B;
                int i13 = H.L;
                if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                    while (true) {
                        if (nc.k.a(obj, s10.f12821d[i11]) && nc.k.a(obj2, s10.x(i11))) {
                            o5 = s10.k(i11, dVar);
                            break;
                        } else if (i11 == i12) {
                            break;
                        } else {
                            i11 += i13;
                        }
                    }
                    kVar = s10;
                }
                o5 = s10;
                kVar = s10;
            } else {
                kVar = s10;
                o5 = kVar.o(i2, obj, obj2, i10 + 5, dVar);
            }
            return q(kVar, o5, t5, q10, dVar.B);
        }
        return this;
    }

    public final k p(int i2, int i10, d dVar) {
        dVar.c(dVar.Y - 1);
        dVar.R = x(i2);
        Object[] objArr = this.f12821d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.f12820c == dVar.B) {
            this.f12821d = p7.a.e(i2, objArr);
            this.f12818a ^= i10;
            return this;
        }
        return new k(i10 ^ this.f12818a, this.f12819b, p7.a.e(i2, objArr), dVar.B);
    }

    public final k q(k kVar, k kVar2, int i2, int i10, u2.b bVar) {
        u2.b bVar2 = this.f12820c;
        if (kVar2 == null) {
            Object[] objArr = this.f12821d;
            if (objArr.length == 1) {
                return null;
            }
            if (bVar2 == bVar) {
                this.f12821d = p7.a.f(i2, objArr);
                this.f12819b ^= i10;
                return this;
            }
            return new k(this.f12818a, i10 ^ this.f12819b, p7.a.f(i2, objArr), bVar);
        } else if (bVar2 != bVar && kVar == kVar2) {
            return this;
        } else {
            return r(i2, kVar2, bVar);
        }
    }

    public final k r(int i2, k kVar, u2.b bVar) {
        Object[] objArr = this.f12821d;
        if (objArr.length == 1 && kVar.f12821d.length == 2 && kVar.f12819b == 0) {
            kVar.f12818a = this.f12819b;
            return kVar;
        } else if (this.f12820c == bVar) {
            objArr[i2] = kVar;
            return this;
        } else {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            copyOf[i2] = kVar;
            return new k(this.f12818a, this.f12819b, copyOf, bVar);
        }
    }

    public final k s(int i2) {
        Object obj = this.f12821d[i2];
        obj.getClass();
        return (k) obj;
    }

    public final int t(int i2) {
        return (this.f12821d.length - 1) - Integer.bitCount((i2 - 1) & this.f12819b);
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00cf, code lost:
        if (r14 != null) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d8, code lost:
        if (r14 == null) goto L8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00db, code lost:
        r14.L = w(r12, r4, (s2.k) r14.L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e5, code lost:
        return r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final bk.a u(java.lang.Object r12, int r13, java.lang.Object r14, int r15) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: s2.k.u(java.lang.Object, int, java.lang.Object, int):bk.a");
    }

    public final k v(int i2, int i10, Object obj) {
        k v10;
        int q10 = 1 << p7.a.q(i2, i10);
        if (h(q10)) {
            int f8 = f(q10);
            if (nc.k.a(obj, this.f12821d[f8])) {
                Object[] objArr = this.f12821d;
                if (objArr.length != 2) {
                    return new k(this.f12818a ^ q10, this.f12819b, p7.a.e(f8, objArr), null);
                }
                return null;
            }
            return this;
        }
        if (i(q10)) {
            int t5 = t(q10);
            k s10 = s(t5);
            if (i10 == 30) {
                sc.b H = p7.j.H(p7.j.L(0, s10.f12821d.length), 2);
                int i11 = H.A;
                int i12 = H.B;
                int i13 = H.L;
                if ((i13 > 0 && i11 <= i12) || (i13 < 0 && i12 <= i11)) {
                    while (!nc.k.a(obj, s10.f12821d[i11])) {
                        if (i11 != i12) {
                            i11 += i13;
                        }
                    }
                    Object[] objArr2 = s10.f12821d;
                    if (objArr2.length == 2) {
                        v10 = null;
                    } else {
                        v10 = new k(0, 0, p7.a.e(i11, objArr2), null);
                    }
                }
                v10 = s10;
                break;
            }
            v10 = s10.v(i2, i10 + 5, obj);
            if (v10 == null) {
                Object[] objArr3 = this.f12821d;
                if (objArr3.length != 1) {
                    return new k(this.f12818a, q10 ^ this.f12819b, p7.a.f(t5, objArr3), null);
                }
                return null;
            } else if (s10 != v10) {
                return w(t5, q10, v10);
            }
        }
        return this;
    }

    public final k w(int i2, int i10, k kVar) {
        Object[] objArr = kVar.f12821d;
        if (objArr.length == 2 && kVar.f12819b == 0) {
            if (this.f12821d.length == 1) {
                kVar.f12818a = this.f12819b;
                return kVar;
            }
            int f8 = f(i10);
            Object[] objArr2 = this.f12821d;
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + 1);
            zb.k.i(copyOf, copyOf, i2 + 2, i2 + 1, objArr2.length);
            zb.k.i(copyOf, copyOf, f8 + 2, f8, i2);
            copyOf[f8] = obj;
            copyOf[f8 + 1] = obj2;
            return new k(this.f12818a ^ i10, i10 ^ this.f12819b, copyOf, null);
        }
        Object[] objArr3 = this.f12821d;
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length);
        copyOf2[i2] = kVar;
        return new k(this.f12818a, this.f12819b, copyOf2, null);
    }

    public final Object x(int i2) {
        return this.f12821d[i2 + 1];
    }
}
