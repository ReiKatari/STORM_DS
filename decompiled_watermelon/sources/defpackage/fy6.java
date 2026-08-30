package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fy6  reason: default package */
/* loaded from: classes.dex */
public final class fy6 {
    public static final fy6 e = new fy6(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final hm1 c;
    public Object[] d;

    public fy6(int i, int i2, Object[] objArr, hm1 hm1Var) {
        this.a = i;
        this.b = i2;
        this.c = hm1Var;
        this.d = objArr;
    }

    public static fy6 j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, hm1 hm1Var) {
        if (i3 > 30) {
            return new fy6(0, 0, new Object[]{obj, obj2, obj3, obj4}, hm1Var);
        }
        int z = yf2.z(i, i3);
        int z2 = yf2.z(i2, i3);
        if (z != z2) {
            return new fy6((1 << z) | (1 << z2), 0, z < z2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, hm1Var);
        }
        return new fy6(0, 1 << z, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, hm1Var)}, hm1Var);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, hm1 hm1Var) {
        int i5;
        Object obj3 = this.d[i];
        if (obj3 != null) {
            i5 = obj3.hashCode();
        } else {
            i5 = 0;
        }
        fy6 j = j(i5, obj3, x(i), i3, obj, obj2, i4 + 5, hm1Var);
        int t = t(i2);
        int i6 = t + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        nu.i0(objArr, objArr2, 0, i, 6);
        nu.f0(objArr, objArr2, i, i + 2, i6);
        objArr2[t - 1] = j;
        nu.f0(objArr, objArr2, t, i6, objArr.length);
        return objArr2;
    }

    public final int b() {
        if (this.b == 0) {
            return this.d.length / 2;
        }
        int bitCount = Integer.bitCount(this.a);
        int length = this.d.length;
        for (int i = bitCount * 2; i < length; i++) {
            bitCount += s(i).b();
        }
        return bitCount;
    }

    public final boolean c(Object obj) {
        b33 o0 = io2.o0(2, io2.t0(0, this.d.length));
        int i = o0.A;
        int i2 = o0.B;
        int i3 = o0.L;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!b53.x(obj, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(int i, int i2, Object obj) {
        int z = 1 << yf2.z(i, i2);
        if (h(z)) {
            return b53.x(obj, this.d[f(z)]);
        } else if (i(z)) {
            fy6 s = s(t(z));
            if (i2 == 30) {
                return s.c(obj);
            }
            return s.d(i, i2 + 5, obj);
        } else {
            return false;
        }
    }

    public final boolean e(fy6 fy6Var) {
        if (this != fy6Var) {
            if (this.b == fy6Var.b && this.a == fy6Var.a) {
                int length = this.d.length;
                for (int i = 0; i < length; i++) {
                    if (this.d[i] == fy6Var.d[i]) {
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int f(int i) {
        return Integer.bitCount(this.a & (i - 1)) * 2;
    }

    public final Object g(int i, int i2, Object obj) {
        int z = 1 << yf2.z(i, i2);
        if (h(z)) {
            int f = f(z);
            if (b53.x(obj, this.d[f])) {
                return x(f);
            }
            return null;
        } else if (i(z)) {
            fy6 s = s(t(z));
            if (i2 == 30) {
                b33 o0 = io2.o0(2, io2.t0(0, s.d.length));
                int i3 = o0.A;
                int i4 = o0.B;
                int i5 = o0.L;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!b53.x(obj, s.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        } else {
                            return null;
                        }
                    }
                    return s.x(i3);
                }
                return null;
            }
            return s.g(i, i2 + 5, obj);
        } else {
            return null;
        }
    }

    public final boolean h(int i) {
        if ((this.a & i) != 0) {
            return true;
        }
        return false;
    }

    public final boolean i(int i) {
        if ((this.b & i) != 0) {
            return true;
        }
        return false;
    }

    public final fy6 k(int i, vm4 vm4Var) {
        vm4Var.c(vm4Var.Y - 1);
        vm4Var.R = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c == vm4Var.B) {
            this.d = yf2.g(i, objArr);
            return this;
        }
        return new fy6(0, 0, yf2.g(i, objArr), vm4Var.B);
    }

    public final fy6 l(int i, Object obj, Object obj2, int i2, vm4 vm4Var) {
        vm4 vm4Var2;
        fy6 l;
        int z = 1 << yf2.z(i, i2);
        boolean h = h(z);
        hm1 hm1Var = this.c;
        if (h) {
            int f = f(z);
            if (b53.x(obj, this.d[f])) {
                vm4Var.R = x(f);
                if (x(f) == obj2) {
                    return this;
                }
                if (hm1Var == vm4Var.B) {
                    this.d[f + 1] = obj2;
                    return this;
                }
                vm4Var.X++;
                Object[] objArr = this.d;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                copyOf[f + 1] = obj2;
                return new fy6(this.a, this.b, copyOf, vm4Var.B);
            }
            vm4Var.c(vm4Var.Y + 1);
            hm1 hm1Var2 = vm4Var.B;
            if (hm1Var == hm1Var2) {
                this.d = a(f, z, i, obj, obj2, i2, hm1Var2);
                this.a ^= z;
                this.b |= z;
                return this;
            }
            return new fy6(this.a ^ z, this.b | z, a(f, z, i, obj, obj2, i2, hm1Var2), hm1Var2);
        } else if (i(z)) {
            int t = t(z);
            fy6 s = s(t);
            if (i2 == 30) {
                b33 o0 = io2.o0(2, io2.t0(0, s.d.length));
                int i3 = o0.A;
                int i4 = o0.B;
                int i5 = o0.L;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!b53.x(obj, s.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    vm4Var.R = s.x(i3);
                    if (s.c == vm4Var.B) {
                        s.d[i3 + 1] = obj2;
                        l = s;
                    } else {
                        vm4Var.X++;
                        Object[] objArr2 = s.d;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        copyOf2[i3 + 1] = obj2;
                        l = new fy6(0, 0, copyOf2, vm4Var.B);
                    }
                    vm4Var2 = vm4Var;
                }
                vm4Var.c(vm4Var.Y + 1);
                l = new fy6(0, 0, yf2.f(s.d, 0, obj, obj2), vm4Var.B);
                vm4Var2 = vm4Var;
            } else {
                vm4Var2 = vm4Var;
                l = s.l(i, obj, obj2, i2 + 5, vm4Var2);
            }
            if (s == l) {
                return this;
            }
            return r(t, l, vm4Var2.B);
        } else {
            vm4Var.c(vm4Var.Y + 1);
            hm1 hm1Var3 = vm4Var.B;
            int f2 = f(z);
            Object[] objArr3 = this.d;
            if (hm1Var == hm1Var3) {
                this.d = yf2.f(objArr3, f2, obj, obj2);
                this.a |= z;
                return this;
            }
            return new fy6(this.a | z, this.b, yf2.f(objArr3, f2, obj, obj2), hm1Var3);
        }
    }

    public final fy6 m(fy6 fy6Var, int i, md1 md1Var, vm4 vm4Var) {
        fy6 fy6Var2;
        Object[] objArr;
        int i2;
        int i3;
        fy6 j;
        int i4;
        int i5;
        int i6;
        if (this == fy6Var) {
            md1Var.a += b();
            return this;
        }
        int i7 = 0;
        if (i > 30) {
            hm1 hm1Var = vm4Var.B;
            int i8 = fy6Var.b;
            Object[] objArr2 = this.d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + fy6Var.d.length);
            int length = this.d.length;
            b33 o0 = io2.o0(2, io2.t0(0, fy6Var.d.length));
            int i9 = o0.A;
            int i10 = o0.B;
            int i11 = o0.L;
            if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
                while (true) {
                    if (!c(fy6Var.d[i9])) {
                        Object[] objArr3 = fy6Var.d;
                        copyOf[length] = objArr3[i9];
                        copyOf[length + 1] = objArr3[i9 + 1];
                        length += 2;
                    } else {
                        md1Var.a++;
                    }
                    if (i9 == i10) {
                        break;
                    }
                    i9 += i11;
                }
            }
            if (length != this.d.length) {
                if (length == fy6Var.d.length) {
                    return fy6Var;
                }
                if (length == copyOf.length) {
                    return new fy6(0, 0, copyOf, hm1Var);
                }
                return new fy6(0, 0, Arrays.copyOf(copyOf, length), hm1Var);
            }
        } else {
            int i12 = this.b | fy6Var.b;
            int i13 = this.a;
            int i14 = fy6Var.a;
            int i15 = i13 & i14;
            int i16 = (i13 ^ i14) & (~i12);
            while (i15 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i15);
                if (b53.x(this.d[f(lowestOneBit)], fy6Var.d[fy6Var.f(lowestOneBit)])) {
                    i16 |= lowestOneBit;
                } else {
                    i12 |= lowestOneBit;
                }
                i15 ^= lowestOneBit;
            }
            if ((i12 & i16) != 0) {
                or4.b("Check failed.");
            }
            if (b53.x(this.c, vm4Var.B) && this.a == i16 && this.b == i12) {
                fy6Var2 = this;
            } else {
                fy6Var2 = new fy6(i16, i12, new Object[Integer.bitCount(i12) + (Integer.bitCount(i16) * 2)], null);
            }
            int i17 = i12;
            int i18 = 0;
            while (i17 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i17);
                Object[] objArr4 = fy6Var2.d;
                int length2 = (objArr4.length - 1) - i18;
                if (i(lowestOneBit2)) {
                    j = s(t(lowestOneBit2));
                    if (fy6Var.i(lowestOneBit2)) {
                        j = j.m(fy6Var.s(fy6Var.t(lowestOneBit2)), i + 5, md1Var, vm4Var);
                        objArr = objArr4;
                    } else if (fy6Var.h(lowestOneBit2)) {
                        int f = fy6Var.f(lowestOneBit2);
                        Object obj = fy6Var.d[f];
                        Object x = fy6Var.x(f);
                        int i19 = vm4Var.Y;
                        if (obj != null) {
                            i6 = obj.hashCode();
                        } else {
                            i6 = i7;
                        }
                        int i20 = i6;
                        objArr = objArr4;
                        j = j.l(i20, obj, x, i + 5, vm4Var);
                        if (vm4Var.Y == i19) {
                            md1Var.a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (fy6Var.i(lowestOneBit2)) {
                        fy6 s = fy6Var.s(fy6Var.t(lowestOneBit2));
                        if (h(lowestOneBit2)) {
                            int f2 = f(lowestOneBit2);
                            Object obj2 = this.d[f2];
                            if (obj2 != null) {
                                i4 = obj2.hashCode();
                            } else {
                                i4 = 0;
                            }
                            int i21 = i + 5;
                            if (s.d(i4, i21, obj2)) {
                                md1Var.a++;
                            } else {
                                Object x2 = x(f2);
                                if (obj2 != null) {
                                    i5 = obj2.hashCode();
                                } else {
                                    i5 = 0;
                                }
                                j = s.l(i5, obj2, x2, i21, vm4Var);
                            }
                        }
                        j = s;
                    } else {
                        int f3 = f(lowestOneBit2);
                        Object obj3 = this.d[f3];
                        Object x3 = x(f3);
                        int f4 = fy6Var.f(lowestOneBit2);
                        Object obj4 = fy6Var.d[f4];
                        Object x4 = fy6Var.x(f4);
                        if (obj3 != null) {
                            i2 = obj3.hashCode();
                        } else {
                            i2 = 0;
                        }
                        if (obj4 != null) {
                            i3 = obj4.hashCode();
                        } else {
                            i3 = 0;
                        }
                        j = j(i2, obj3, x3, i3, obj4, x4, i + 5, vm4Var.B);
                    }
                }
                objArr[length2] = j;
                i18++;
                i17 ^= lowestOneBit2;
                i7 = 0;
            }
            int i22 = 0;
            while (i16 != 0) {
                int lowestOneBit3 = Integer.lowestOneBit(i16);
                int i23 = i22 * 2;
                if (!fy6Var.h(lowestOneBit3)) {
                    int f5 = f(lowestOneBit3);
                    Object[] objArr5 = fy6Var2.d;
                    objArr5[i23] = this.d[f5];
                    objArr5[i23 + 1] = x(f5);
                } else {
                    int f6 = fy6Var.f(lowestOneBit3);
                    Object[] objArr6 = fy6Var2.d;
                    objArr6[i23] = fy6Var.d[f6];
                    objArr6[i23 + 1] = fy6Var.x(f6);
                    if (h(lowestOneBit3)) {
                        md1Var.a++;
                    }
                }
                i22++;
                i16 ^= lowestOneBit3;
            }
            if (!e(fy6Var2)) {
                if (fy6Var.e(fy6Var2)) {
                    return fy6Var;
                }
                return fy6Var2;
            }
        }
        return this;
    }

    public final fy6 n(int i, Object obj, int i2, vm4 vm4Var) {
        fy6 n;
        int z = 1 << yf2.z(i, i2);
        if (h(z)) {
            int f = f(z);
            if (b53.x(obj, this.d[f])) {
                return p(f, z, vm4Var);
            }
        } else if (i(z)) {
            int t = t(z);
            fy6 s = s(t);
            if (i2 == 30) {
                b33 o0 = io2.o0(2, io2.t0(0, s.d.length));
                int i3 = o0.A;
                int i4 = o0.B;
                int i5 = o0.L;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!b53.x(obj, s.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    n = s.k(i3, vm4Var);
                }
                n = s;
                break;
            }
            n = s.n(i, obj, i2 + 5, vm4Var);
            return q(s, n, t, z, vm4Var.B);
        }
        return this;
    }

    public final fy6 o(int i, Object obj, Object obj2, int i2, vm4 vm4Var) {
        vm4 vm4Var2;
        fy6 o;
        int z = 1 << yf2.z(i, i2);
        if (h(z)) {
            int f = f(z);
            if (b53.x(obj, this.d[f]) && b53.x(obj2, x(f))) {
                return p(f, z, vm4Var);
            }
            return this;
        } else if (i(z)) {
            int t = t(z);
            fy6 s = s(t);
            if (i2 == 30) {
                b33 o0 = io2.o0(2, io2.t0(0, s.d.length));
                int i3 = o0.A;
                int i4 = o0.B;
                int i5 = o0.L;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (b53.x(obj, s.d[i3]) && b53.x(obj2, s.x(i3))) {
                            o = s.k(i3, vm4Var);
                            break;
                        } else if (i3 == i4) {
                            break;
                        } else {
                            i3 += i5;
                        }
                    }
                    vm4Var2 = vm4Var;
                }
                o = s;
                vm4Var2 = vm4Var;
            } else {
                vm4Var2 = vm4Var;
                o = s.o(i, obj, obj2, i2 + 5, vm4Var2);
            }
            return q(s, o, t, z, vm4Var2.B);
        } else {
            return this;
        }
    }

    public final fy6 p(int i, int i2, vm4 vm4Var) {
        vm4Var.c(vm4Var.Y - 1);
        vm4Var.R = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c == vm4Var.B) {
            this.d = yf2.g(i, objArr);
            this.a ^= i2;
            return this;
        }
        return new fy6(i2 ^ this.a, this.b, yf2.g(i, objArr), vm4Var.B);
    }

    public final fy6 q(fy6 fy6Var, fy6 fy6Var2, int i, int i2, hm1 hm1Var) {
        hm1 hm1Var2 = this.c;
        if (fy6Var2 == null) {
            Object[] objArr = this.d;
            if (objArr.length == 1) {
                return null;
            }
            if (hm1Var2 == hm1Var) {
                this.d = yf2.h(i, objArr);
                this.b ^= i2;
                return this;
            }
            return new fy6(this.a, this.b ^ i2, yf2.h(i, objArr), hm1Var);
        } else if (hm1Var2 != hm1Var && fy6Var == fy6Var2) {
            return this;
        } else {
            return r(i, fy6Var2, hm1Var);
        }
    }

    public final fy6 r(int i, fy6 fy6Var, hm1 hm1Var) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && fy6Var.d.length == 2 && fy6Var.b == 0) {
            fy6Var.a = this.b;
            return fy6Var;
        } else if (this.c == hm1Var) {
            objArr[i] = fy6Var;
            return this;
        } else {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            copyOf[i] = fy6Var;
            return new fy6(this.a, this.b, copyOf, hm1Var);
        }
    }

    public final fy6 s(int i) {
        Object obj = this.d[i];
        obj.getClass();
        return (fy6) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c5, code lost:
        if (r14 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ce, code lost:
        if (r14 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d1, code lost:
        r14.L = w(r7, r2, (defpackage.fy6) r14.L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00db, code lost:
        return r14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.sb u(int r14, int r15, java.lang.Object r16, java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fy6.u(int, int, java.lang.Object, java.lang.Object):sb");
    }

    public final fy6 v(int i, int i2, Object obj) {
        fy6 v;
        int z = 1 << yf2.z(i, i2);
        if (h(z)) {
            int f = f(z);
            if (b53.x(obj, this.d[f])) {
                Object[] objArr = this.d;
                if (objArr.length != 2) {
                    return new fy6(this.a ^ z, this.b, yf2.g(f, objArr), null);
                }
            } else {
                return this;
            }
        } else if (i(z)) {
            int t = t(z);
            fy6 s = s(t);
            if (i2 == 30) {
                b33 o0 = io2.o0(2, io2.t0(0, s.d.length));
                int i3 = o0.A;
                int i4 = o0.B;
                int i5 = o0.L;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!b53.x(obj, s.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    Object[] objArr2 = s.d;
                    if (objArr2.length == 2) {
                        v = null;
                    } else {
                        v = new fy6(0, 0, yf2.g(i3, objArr2), null);
                    }
                }
                v = s;
                break;
            }
            v = s.v(i, i2 + 5, obj);
            if (v == null) {
                Object[] objArr3 = this.d;
                if (objArr3.length != 1) {
                    return new fy6(this.a, this.b ^ z, yf2.h(t, objArr3), null);
                }
            } else if (s != v) {
                return w(t, z, v);
            } else {
                return this;
            }
        } else {
            return this;
        }
        return null;
    }

    public final fy6 w(int i, int i2, fy6 fy6Var) {
        Object[] objArr = fy6Var.d;
        if (objArr.length == 2 && fy6Var.b == 0) {
            if (this.d.length == 1) {
                fy6Var.a = this.b;
                return fy6Var;
            }
            int f = f(i2);
            Object[] objArr2 = this.d;
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + 1);
            nu.f0(copyOf, copyOf, i + 2, i + 1, objArr2.length);
            nu.f0(copyOf, copyOf, f + 2, f, i);
            copyOf[f] = obj;
            copyOf[f + 1] = obj2;
            return new fy6(this.a ^ i2, this.b ^ i2, copyOf, null);
        }
        Object[] objArr3 = this.d;
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length);
        copyOf2[i] = fy6Var;
        return new fy6(this.a, this.b, copyOf2, null);
    }

    public final Object x(int i) {
        return this.d[i + 1];
    }
}
