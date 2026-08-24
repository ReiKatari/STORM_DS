package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ac7  reason: default package */
/* loaded from: classes.dex */
public final class ac7 {
    public static final ac7 e = new ac7(0, 0, new Object[0], null);
    public int a;
    public int b;
    public final jd1 c;
    public Object[] d;

    public ac7(int i, int i2, Object[] objArr, jd1 jd1Var) {
        this.a = i;
        this.b = i2;
        this.c = jd1Var;
        this.d = objArr;
    }

    public static ac7 j(int i, Object obj, Object obj2, int i2, Object obj3, Object obj4, int i3, jd1 jd1Var) {
        if (i3 > 30) {
            return new ac7(0, 0, new Object[]{obj, obj2, obj3, obj4}, jd1Var);
        }
        int I = oi2.I(i, i3);
        int I2 = oi2.I(i2, i3);
        if (I != I2) {
            return new ac7((1 << I) | (1 << I2), 0, I < I2 ? new Object[]{obj, obj2, obj3, obj4} : new Object[]{obj3, obj4, obj, obj2}, jd1Var);
        }
        return new ac7(0, 1 << I, new Object[]{j(i, obj, obj2, i2, obj3, obj4, i3 + 5, jd1Var)}, jd1Var);
    }

    public final Object[] a(int i, int i2, int i3, Object obj, Object obj2, int i4, jd1 jd1Var) {
        int i5;
        Object obj3 = this.d[i];
        if (obj3 != null) {
            i5 = obj3.hashCode();
        } else {
            i5 = 0;
        }
        ac7 j = j(i5, obj3, x(i), i3, obj, obj2, i4 + 5, jd1Var);
        int t = t(i2);
        int i6 = t + 1;
        Object[] objArr = this.d;
        Object[] objArr2 = new Object[objArr.length - 1];
        fv.w0(objArr, objArr2, 0, i, 6);
        fv.t0(objArr, objArr2, i, i + 2, i6);
        objArr2[t - 1] = j;
        fv.t0(objArr, objArr2, t, i6, objArr.length);
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
        j93 P = gi2.P(2, gi2.R(0, this.d.length));
        int i = P.A;
        int i2 = P.B;
        int i3 = P.L;
        if ((i3 > 0 && i <= i2) || (i3 < 0 && i2 <= i)) {
            while (!nb3.k(obj, this.d[i])) {
                if (i != i2) {
                    i += i3;
                }
            }
            return true;
        }
        return false;
    }

    public final boolean d(Object obj, int i, int i2) {
        int I = 1 << oi2.I(i, i2);
        if (h(I)) {
            return nb3.k(obj, this.d[f(I)]);
        } else if (i(I)) {
            ac7 s = s(t(I));
            if (i2 == 30) {
                return s.c(obj);
            }
            return s.d(obj, i, i2 + 5);
        } else {
            return false;
        }
    }

    public final boolean e(ac7 ac7Var) {
        if (this != ac7Var) {
            if (this.b == ac7Var.b && this.a == ac7Var.a) {
                int length = this.d.length;
                for (int i = 0; i < length; i++) {
                    if (this.d[i] == ac7Var.d[i]) {
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

    public final Object g(Object obj, int i, int i2) {
        int I = 1 << oi2.I(i, i2);
        if (h(I)) {
            int f = f(I);
            if (nb3.k(obj, this.d[f])) {
                return x(f);
            }
            return null;
        } else if (i(I)) {
            ac7 s = s(t(I));
            if (i2 == 30) {
                j93 P = gi2.P(2, gi2.R(0, s.d.length));
                int i3 = P.A;
                int i4 = P.B;
                int i5 = P.L;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!nb3.k(obj, s.d[i3])) {
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
            return s.g(obj, i, i2 + 5);
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

    public final ac7 k(int i, aw4 aw4Var) {
        aw4Var.c(aw4Var.Y - 1);
        aw4Var.R = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c == aw4Var.B) {
            this.d = oi2.e(i, objArr);
            return this;
        }
        return new ac7(0, 0, oi2.e(i, objArr), aw4Var.B);
    }

    public final ac7 l(int i, Object obj, Object obj2, int i2, aw4 aw4Var) {
        aw4 aw4Var2;
        ac7 l;
        int I = 1 << oi2.I(i, i2);
        boolean h = h(I);
        jd1 jd1Var = this.c;
        if (h) {
            int f = f(I);
            if (nb3.k(obj, this.d[f])) {
                aw4Var.R = x(f);
                if (x(f) == obj2) {
                    return this;
                }
                if (jd1Var == aw4Var.B) {
                    this.d[f + 1] = obj2;
                    return this;
                }
                aw4Var.X++;
                Object[] objArr = this.d;
                Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                copyOf[f + 1] = obj2;
                return new ac7(this.a, this.b, copyOf, aw4Var.B);
            }
            aw4Var.c(aw4Var.Y + 1);
            jd1 jd1Var2 = aw4Var.B;
            if (jd1Var == jd1Var2) {
                this.d = a(f, I, i, obj, obj2, i2, jd1Var2);
                this.a ^= I;
                this.b |= I;
                return this;
            }
            return new ac7(this.a ^ I, this.b | I, a(f, I, i, obj, obj2, i2, jd1Var2), jd1Var2);
        } else if (i(I)) {
            int t = t(I);
            ac7 s = s(t);
            if (i2 == 30) {
                j93 P = gi2.P(2, gi2.R(0, s.d.length));
                int i3 = P.A;
                int i4 = P.B;
                int i5 = P.L;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!nb3.k(obj, s.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    aw4Var.R = s.x(i3);
                    if (s.c == aw4Var.B) {
                        s.d[i3 + 1] = obj2;
                        l = s;
                    } else {
                        aw4Var.X++;
                        Object[] objArr2 = s.d;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        copyOf2[i3 + 1] = obj2;
                        l = new ac7(0, 0, copyOf2, aw4Var.B);
                    }
                    aw4Var2 = aw4Var;
                }
                aw4Var.c(aw4Var.Y + 1);
                l = new ac7(0, 0, oi2.d(s.d, 0, obj, obj2), aw4Var.B);
                aw4Var2 = aw4Var;
            } else {
                aw4Var2 = aw4Var;
                l = s.l(i, obj, obj2, i2 + 5, aw4Var2);
            }
            if (s == l) {
                return this;
            }
            return r(t, l, aw4Var2.B);
        } else {
            aw4Var.c(aw4Var.Y + 1);
            jd1 jd1Var3 = aw4Var.B;
            int f2 = f(I);
            Object[] objArr3 = this.d;
            if (jd1Var == jd1Var3) {
                this.d = oi2.d(objArr3, f2, obj, obj2);
                this.a |= I;
                return this;
            }
            return new ac7(this.a | I, this.b, oi2.d(objArr3, f2, obj, obj2), jd1Var3);
        }
    }

    public final ac7 m(ac7 ac7Var, int i, oh1 oh1Var, aw4 aw4Var) {
        ac7 ac7Var2;
        Object[] objArr;
        int i2;
        int i3;
        ac7 j;
        int i4;
        int i5;
        int i6;
        if (this == ac7Var) {
            oh1Var.a += b();
            return this;
        }
        int i7 = 0;
        if (i > 30) {
            jd1 jd1Var = aw4Var.B;
            int i8 = ac7Var.b;
            Object[] objArr2 = this.d;
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + ac7Var.d.length);
            int length = this.d.length;
            j93 P = gi2.P(2, gi2.R(0, ac7Var.d.length));
            int i9 = P.A;
            int i10 = P.B;
            int i11 = P.L;
            if ((i11 > 0 && i9 <= i10) || (i11 < 0 && i10 <= i9)) {
                while (true) {
                    if (!c(ac7Var.d[i9])) {
                        Object[] objArr3 = ac7Var.d;
                        copyOf[length] = objArr3[i9];
                        copyOf[length + 1] = objArr3[i9 + 1];
                        length += 2;
                    } else {
                        oh1Var.a++;
                    }
                    if (i9 == i10) {
                        break;
                    }
                    i9 += i11;
                }
            }
            if (length != this.d.length) {
                if (length == ac7Var.d.length) {
                    return ac7Var;
                }
                if (length == copyOf.length) {
                    return new ac7(0, 0, copyOf, jd1Var);
                }
                return new ac7(0, 0, Arrays.copyOf(copyOf, length), jd1Var);
            }
        } else {
            int i12 = this.b | ac7Var.b;
            int i13 = this.a;
            int i14 = ac7Var.a;
            int i15 = i13 & i14;
            int i16 = (i13 ^ i14) & (~i12);
            while (i15 != 0) {
                int lowestOneBit = Integer.lowestOneBit(i15);
                if (nb3.k(this.d[f(lowestOneBit)], ac7Var.d[ac7Var.f(lowestOneBit)])) {
                    i16 |= lowestOneBit;
                } else {
                    i12 |= lowestOneBit;
                }
                i15 ^= lowestOneBit;
            }
            if ((i12 & i16) != 0) {
                r05.b("Check failed.");
            }
            if (nb3.k(this.c, aw4Var.B) && this.a == i16 && this.b == i12) {
                ac7Var2 = this;
            } else {
                ac7Var2 = new ac7(i16, i12, new Object[Integer.bitCount(i12) + (Integer.bitCount(i16) * 2)], null);
            }
            int i17 = i12;
            int i18 = 0;
            while (i17 != 0) {
                int lowestOneBit2 = Integer.lowestOneBit(i17);
                Object[] objArr4 = ac7Var2.d;
                int length2 = (objArr4.length - 1) - i18;
                if (i(lowestOneBit2)) {
                    j = s(t(lowestOneBit2));
                    if (ac7Var.i(lowestOneBit2)) {
                        j = j.m(ac7Var.s(ac7Var.t(lowestOneBit2)), i + 5, oh1Var, aw4Var);
                        objArr = objArr4;
                    } else if (ac7Var.h(lowestOneBit2)) {
                        int f = ac7Var.f(lowestOneBit2);
                        Object obj = ac7Var.d[f];
                        Object x = ac7Var.x(f);
                        int i19 = aw4Var.Y;
                        if (obj != null) {
                            i6 = obj.hashCode();
                        } else {
                            i6 = i7;
                        }
                        int i20 = i6;
                        objArr = objArr4;
                        j = j.l(i20, obj, x, i + 5, aw4Var);
                        if (aw4Var.Y == i19) {
                            oh1Var.a++;
                        }
                    } else {
                        objArr = objArr4;
                    }
                } else {
                    objArr = objArr4;
                    if (ac7Var.i(lowestOneBit2)) {
                        ac7 s = ac7Var.s(ac7Var.t(lowestOneBit2));
                        if (h(lowestOneBit2)) {
                            int f2 = f(lowestOneBit2);
                            Object obj2 = this.d[f2];
                            if (obj2 != null) {
                                i4 = obj2.hashCode();
                            } else {
                                i4 = 0;
                            }
                            int i21 = i + 5;
                            if (s.d(obj2, i4, i21)) {
                                oh1Var.a++;
                            } else {
                                Object x2 = x(f2);
                                if (obj2 != null) {
                                    i5 = obj2.hashCode();
                                } else {
                                    i5 = 0;
                                }
                                j = s.l(i5, obj2, x2, i21, aw4Var);
                            }
                        }
                        j = s;
                    } else {
                        int f3 = f(lowestOneBit2);
                        Object obj3 = this.d[f3];
                        Object x3 = x(f3);
                        int f4 = ac7Var.f(lowestOneBit2);
                        Object obj4 = ac7Var.d[f4];
                        Object x4 = ac7Var.x(f4);
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
                        j = j(i2, obj3, x3, i3, obj4, x4, i + 5, aw4Var.B);
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
                if (!ac7Var.h(lowestOneBit3)) {
                    int f5 = f(lowestOneBit3);
                    Object[] objArr5 = ac7Var2.d;
                    objArr5[i23] = this.d[f5];
                    objArr5[i23 + 1] = x(f5);
                } else {
                    int f6 = ac7Var.f(lowestOneBit3);
                    Object[] objArr6 = ac7Var2.d;
                    objArr6[i23] = ac7Var.d[f6];
                    objArr6[i23 + 1] = ac7Var.x(f6);
                    if (h(lowestOneBit3)) {
                        oh1Var.a++;
                    }
                }
                i22++;
                i16 ^= lowestOneBit3;
            }
            if (!e(ac7Var2)) {
                if (ac7Var.e(ac7Var2)) {
                    return ac7Var;
                }
                return ac7Var2;
            }
        }
        return this;
    }

    public final ac7 n(int i, Object obj, int i2, aw4 aw4Var) {
        ac7 n;
        int I = 1 << oi2.I(i, i2);
        if (h(I)) {
            int f = f(I);
            if (nb3.k(obj, this.d[f])) {
                return p(f, I, aw4Var);
            }
        } else if (i(I)) {
            int t = t(I);
            ac7 s = s(t);
            if (i2 == 30) {
                j93 P = gi2.P(2, gi2.R(0, s.d.length));
                int i3 = P.A;
                int i4 = P.B;
                int i5 = P.L;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!nb3.k(obj, s.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    n = s.k(i3, aw4Var);
                }
                n = s;
                break;
            }
            n = s.n(i, obj, i2 + 5, aw4Var);
            return q(s, n, t, I, aw4Var.B);
        }
        return this;
    }

    public final ac7 o(int i, Object obj, Object obj2, int i2, aw4 aw4Var) {
        aw4 aw4Var2;
        ac7 o;
        int I = 1 << oi2.I(i, i2);
        if (h(I)) {
            int f = f(I);
            if (nb3.k(obj, this.d[f]) && nb3.k(obj2, x(f))) {
                return p(f, I, aw4Var);
            }
            return this;
        } else if (i(I)) {
            int t = t(I);
            ac7 s = s(t);
            if (i2 == 30) {
                j93 P = gi2.P(2, gi2.R(0, s.d.length));
                int i3 = P.A;
                int i4 = P.B;
                int i5 = P.L;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (true) {
                        if (nb3.k(obj, s.d[i3]) && nb3.k(obj2, s.x(i3))) {
                            o = s.k(i3, aw4Var);
                            break;
                        } else if (i3 == i4) {
                            break;
                        } else {
                            i3 += i5;
                        }
                    }
                    aw4Var2 = aw4Var;
                }
                o = s;
                aw4Var2 = aw4Var;
            } else {
                aw4Var2 = aw4Var;
                o = s.o(i, obj, obj2, i2 + 5, aw4Var2);
            }
            return q(s, o, t, I, aw4Var2.B);
        } else {
            return this;
        }
    }

    public final ac7 p(int i, int i2, aw4 aw4Var) {
        aw4Var.c(aw4Var.Y - 1);
        aw4Var.R = x(i);
        Object[] objArr = this.d;
        if (objArr.length == 2) {
            return null;
        }
        if (this.c == aw4Var.B) {
            this.d = oi2.e(i, objArr);
            this.a ^= i2;
            return this;
        }
        return new ac7(i2 ^ this.a, this.b, oi2.e(i, objArr), aw4Var.B);
    }

    public final ac7 q(ac7 ac7Var, ac7 ac7Var2, int i, int i2, jd1 jd1Var) {
        jd1 jd1Var2 = this.c;
        if (ac7Var2 == null) {
            Object[] objArr = this.d;
            if (objArr.length == 1) {
                return null;
            }
            if (jd1Var2 == jd1Var) {
                this.d = oi2.f(i, objArr);
                this.b ^= i2;
                return this;
            }
            return new ac7(this.a, this.b ^ i2, oi2.f(i, objArr), jd1Var);
        } else if (jd1Var2 != jd1Var && ac7Var == ac7Var2) {
            return this;
        } else {
            return r(i, ac7Var2, jd1Var);
        }
    }

    public final ac7 r(int i, ac7 ac7Var, jd1 jd1Var) {
        Object[] objArr = this.d;
        if (objArr.length == 1 && ac7Var.d.length == 2 && ac7Var.b == 0) {
            ac7Var.a = this.b;
            return ac7Var;
        } else if (this.c == jd1Var) {
            objArr[i] = ac7Var;
            return this;
        } else {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            copyOf[i] = ac7Var;
            return new ac7(this.a, this.b, copyOf, jd1Var);
        }
    }

    public final ac7 s(int i) {
        Object obj = this.d[i];
        obj.getClass();
        return (ac7) obj;
    }

    public final int t(int i) {
        return (this.d.length - 1) - Integer.bitCount(this.b & (i - 1));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00c8, code lost:
        if (r15 != null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d3, code lost:
        if (r15 == null) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d6, code lost:
        r15.L = w(r3, r2, (defpackage.ac7) r15.L);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e0, code lost:
        return r15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final zb u(Object obj, int i, int i2, Object obj2) {
        zb u;
        int I = 1 << oi2.I(i, i2);
        if (h(I)) {
            int f = f(I);
            if (nb3.k(obj, this.d[f])) {
                if (x(f) != obj2) {
                    Object[] objArr = this.d;
                    Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
                    copyOf[f + 1] = obj2;
                    return new zb(new ac7(this.a, this.b, copyOf, null), 0, 16);
                }
            } else {
                return new zb(new ac7(this.a ^ I, this.b | I, a(f, I, i, obj, obj2, i2, null), null), 1, 16);
            }
        } else if (i(I)) {
            int t = t(I);
            ac7 s = s(t);
            if (i2 == 30) {
                j93 P = gi2.P(2, gi2.R(0, s.d.length));
                int i3 = P.A;
                int i4 = P.B;
                int i5 = P.L;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!nb3.k(obj, s.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    if (obj2 == s.x(i3)) {
                        u = null;
                    } else {
                        Object[] objArr2 = s.d;
                        Object[] copyOf2 = Arrays.copyOf(objArr2, objArr2.length);
                        copyOf2[i3 + 1] = obj2;
                        u = new zb(new ac7(0, 0, copyOf2, null), 0, 16);
                    }
                }
                u = new zb(new ac7(0, 0, oi2.d(s.d, 0, obj, obj2), null), 1, 16);
                break;
            }
            u = s.u(obj, i, i2 + 5, obj2);
        } else {
            return new zb(new ac7(I | this.a, this.b, oi2.d(this.d, f(I), obj, obj2), null), 1, 16);
        }
        return null;
    }

    public final ac7 v(Object obj, int i, int i2) {
        ac7 v;
        int I = 1 << oi2.I(i, i2);
        if (h(I)) {
            int f = f(I);
            if (nb3.k(obj, this.d[f])) {
                Object[] objArr = this.d;
                if (objArr.length != 2) {
                    return new ac7(this.a ^ I, this.b, oi2.e(f, objArr), null);
                }
            } else {
                return this;
            }
        } else if (i(I)) {
            int t = t(I);
            ac7 s = s(t);
            if (i2 == 30) {
                j93 P = gi2.P(2, gi2.R(0, s.d.length));
                int i3 = P.A;
                int i4 = P.B;
                int i5 = P.L;
                if ((i5 > 0 && i3 <= i4) || (i5 < 0 && i4 <= i3)) {
                    while (!nb3.k(obj, s.d[i3])) {
                        if (i3 != i4) {
                            i3 += i5;
                        }
                    }
                    Object[] objArr2 = s.d;
                    if (objArr2.length == 2) {
                        v = null;
                    } else {
                        v = new ac7(0, 0, oi2.e(i3, objArr2), null);
                    }
                }
                v = s;
                break;
            }
            v = s.v(obj, i, i2 + 5);
            if (v == null) {
                Object[] objArr3 = this.d;
                if (objArr3.length != 1) {
                    return new ac7(this.a, this.b ^ I, oi2.f(t, objArr3), null);
                }
            } else if (s != v) {
                return w(t, I, v);
            } else {
                return this;
            }
        } else {
            return this;
        }
        return null;
    }

    public final ac7 w(int i, int i2, ac7 ac7Var) {
        Object[] objArr = ac7Var.d;
        if (objArr.length == 2 && ac7Var.b == 0) {
            if (this.d.length == 1) {
                ac7Var.a = this.b;
                return ac7Var;
            }
            int f = f(i2);
            Object[] objArr2 = this.d;
            Object obj = objArr[0];
            Object obj2 = objArr[1];
            Object[] copyOf = Arrays.copyOf(objArr2, objArr2.length + 1);
            fv.t0(copyOf, copyOf, i + 2, i + 1, objArr2.length);
            fv.t0(copyOf, copyOf, f + 2, f, i);
            copyOf[f] = obj;
            copyOf[f + 1] = obj2;
            return new ac7(this.a ^ i2, this.b ^ i2, copyOf, null);
        }
        Object[] objArr3 = this.d;
        Object[] copyOf2 = Arrays.copyOf(objArr3, objArr3.length);
        copyOf2[i] = ac7Var;
        return new ac7(this.a, this.b, copyOf2, null);
    }

    public final Object x(int i) {
        return this.d[i + 1];
    }
}
