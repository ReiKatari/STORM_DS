package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: og6  reason: default package */
/* loaded from: classes.dex */
public final class og6 extends ct3 implements f73 {
    public final t63 o0;
    public final ej7 p0;
    public final t0 q0;
    public final vn1 r0;
    public int s0;
    public final n73 t0;

    public og6(t63 t63Var, ej7 ej7Var, t0 t0Var, h06 h06Var) {
        n73 n73Var;
        ej7Var.getClass();
        h06Var.getClass();
        this.o0 = t63Var;
        this.p0 = ej7Var;
        this.q0 = t0Var;
        this.r0 = t63Var.b;
        this.s0 = -1;
        if (t63Var.a.b) {
            n73Var = null;
        } else {
            n73Var = new n73(h06Var);
        }
        this.t0 = n73Var;
    }

    @Override // defpackage.f73
    public final t63 D() {
        return this.o0;
    }

    @Override // defpackage.f73
    public final k73 I() {
        return new sb(this.o0.a, this.q0).q();
    }

    @Override // defpackage.ct3, defpackage.b91
    public final int L() {
        t0 t0Var = this.q0;
        long j = t0Var.j();
        int i = (int) j;
        if (j == i) {
            return i;
        }
        t0.q(t0Var, "Failed to parse int for input '" + j + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.ct3, defpackage.b91
    public final byte Q() {
        t0 t0Var = this.q0;
        long j = t0Var.j();
        byte b = (byte) j;
        if (j == b) {
            return b;
        }
        t0.q(t0Var, "Failed to parse byte for input '" + j + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.ct3, defpackage.b91
    public final b91 T(h06 h06Var) {
        h06Var.getClass();
        if (rg6.a(h06Var)) {
            return new g73(this.q0, this.o0);
        }
        return this;
    }

    @Override // defpackage.ct3, defpackage.yu0
    public final Object U(h06 h06Var, int i, m93 m93Var, Object obj) {
        boolean z;
        Object obj2;
        oi oiVar = (oi) this.q0.R;
        h06Var.getClass();
        m93Var.getClass();
        if (this.p0 == ej7.MAP && (i & 1) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = oiVar.B;
            if (((int[]) oiVar.X)[i2] == -2) {
                ((Object[]) oiVar.R)[i2] = iq0.g0;
            }
        }
        Object n = n(m93Var);
        if (z) {
            int i3 = oiVar.B;
            if (((int[]) oiVar.X)[i3] != -2) {
                int i4 = i3 + 1;
                oiVar.B = i4;
                if (i4 == ((Object[]) oiVar.R).length) {
                    oiVar.i();
                }
            }
            Object[] objArr = (Object[]) oiVar.R;
            int i5 = oiVar.B;
            if (((e73) oiVar.L).g) {
                obj2 = n;
            } else {
                obj2 = y60.t0;
            }
            objArr[i5] = obj2;
            ((int[]) oiVar.X)[i5] = -2;
        }
        return n;
    }

    @Override // defpackage.ct3, defpackage.b91
    public final short W() {
        t0 t0Var = this.q0;
        long j = t0Var.j();
        short s = (short) j;
        if (j == s) {
            return s;
        }
        t0.q(t0Var, "Failed to parse short for input '" + j + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.ct3, defpackage.b91
    public final String X() {
        return this.q0.k();
    }

    @Override // defpackage.ct3, defpackage.b91
    public final float Z() {
        t0 t0Var = this.q0;
        String m = t0Var.m();
        try {
            float parseFloat = Float.parseFloat(m);
            if (Math.abs(parseFloat) <= Float.MAX_VALUE) {
                return parseFloat;
            }
            t0.q(t0Var, io2.a0(Float.valueOf(parseFloat), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            t0.q(t0Var, b31.n('\'', "Failed to parse type 'float' for input '", m), 0, null, 6);
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    @Override // defpackage.ct3, defpackage.yu0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.h06 r5) {
        /*
            r4 = this;
            r5.getClass()
            int r0 = r5.d()
            r1 = -1
            if (r0 != 0) goto L18
            t63 r0 = r4.o0
            boolean r0 = defpackage.a83.c(r0, r5)
            if (r0 == 0) goto L18
        L12:
            int r0 = r4.v(r5)
            if (r0 != r1) goto L12
        L18:
            t0 r5 = r4.q0
            boolean r0 = r5.A()
            if (r0 != 0) goto L43
            ej7 r4 = r4.p0
            char r4 = r4.end
            r5.i(r4)
            java.lang.Object r4 = r5.R
            oi r4 = (defpackage.oi) r4
            int r5 = r4.B
            java.lang.Object r0 = r4.X
            int[] r0 = (int[]) r0
            r2 = r0[r5]
            r3 = -2
            if (r2 != r3) goto L3b
            r0[r5] = r1
            int r5 = r5 + r1
            r4.B = r5
        L3b:
            int r5 = r4.B
            if (r5 == r1) goto L42
            int r5 = r5 + r1
            r4.B = r5
        L42:
            return
        L43:
            java.lang.String r4 = ""
            defpackage.io2.Q(r5, r4)
            r4 = 0
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.og6.a(h06):void");
    }

    @Override // defpackage.yu0
    public final vn1 b() {
        return this.r0;
    }

    @Override // defpackage.ct3, defpackage.b91
    public final yu0 c(h06 h06Var) {
        h06Var.getClass();
        t63 t63Var = this.o0;
        ej7 c = fj7.c(t63Var, h06Var);
        t0 t0Var = this.q0;
        oi oiVar = (oi) t0Var.R;
        oiVar.getClass();
        int i = oiVar.B + 1;
        oiVar.B = i;
        if (i == ((Object[]) oiVar.R).length) {
            oiVar.i();
        }
        ((Object[]) oiVar.R)[i] = h06Var;
        t0Var.i(c.begin);
        if (t0Var.v() != 4) {
            int i2 = ng6.a[c.ordinal()];
            if (i2 != 1 && i2 != 2 && i2 != 3) {
                if (this.p0 == c && t63Var.a.b) {
                    return this;
                }
                return new og6(t63Var, c, t0Var, h06Var);
            }
            return new og6(t63Var, c, t0Var, h06Var);
        }
        t0.q(t0Var, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    @Override // defpackage.ct3, defpackage.b91
    public final int c0(h06 h06Var) {
        h06Var.getClass();
        t0 t0Var = this.q0;
        return a83.b(h06Var, this.o0, t0Var.k(), " at path ".concat(((oi) t0Var.R).d()));
    }

    @Override // defpackage.ct3, defpackage.b91
    public final double d0() {
        t0 t0Var = this.q0;
        String m = t0Var.m();
        try {
            double parseDouble = Double.parseDouble(m);
            if (Math.abs(parseDouble) <= Double.MAX_VALUE) {
                return parseDouble;
            }
            t0.q(t0Var, io2.a0(Double.valueOf(parseDouble), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            t0.q(t0Var, b31.n('\'', "Failed to parse type 'double' for input '", m), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.ct3, defpackage.b91
    public final long e() {
        return this.q0.j();
    }

    @Override // defpackage.ct3, defpackage.b91
    public final boolean h() {
        boolean z;
        boolean z2;
        t0 t0Var = this.q0;
        int y = t0Var.y();
        if (y != t0Var.s().length()) {
            if (t0Var.s().charAt(y) == '\"') {
                y++;
                z = true;
            } else {
                z = false;
            }
            int x = t0Var.x(y);
            if (x < t0Var.s().length() && x != -1) {
                int i = x + 1;
                int charAt = t0Var.s().charAt(x) | ' ';
                if (charAt != 102) {
                    if (charAt == 116) {
                        t0Var.e(i, "rue");
                        z2 = true;
                    } else {
                        t0.q(t0Var, "Expected valid boolean literal prefix, but had '" + t0Var.m() + '\'', 0, null, 6);
                        throw null;
                    }
                } else {
                    t0Var.e(i, "alse");
                    z2 = false;
                }
                if (z) {
                    if (t0Var.B != t0Var.s().length()) {
                        if (t0Var.s().charAt(t0Var.B) == '\"') {
                            t0Var.B++;
                            return z2;
                        }
                        t0.q(t0Var, "Expected closing quotation mark", 0, null, 6);
                        throw null;
                    }
                    t0.q(t0Var, "EOF", 0, null, 6);
                    throw null;
                }
                return z2;
            }
            t0.q(t0Var, "EOF", 0, null, 6);
            throw null;
        }
        t0.q(t0Var, "EOF", 0, null, 6);
        throw null;
    }

    @Override // defpackage.ct3, defpackage.b91
    public final boolean i() {
        boolean z;
        boolean z2;
        n73 n73Var = this.t0;
        if (n73Var != null) {
            z = n73Var.b;
        } else {
            z = false;
        }
        if (!z) {
            t0 t0Var = this.q0;
            int x = t0Var.x(t0Var.y());
            int length = t0Var.s().length() - x;
            if (length >= 4 && x != -1) {
                int i = 0;
                while (true) {
                    if (i < 4) {
                        if ("null".charAt(i) != t0Var.s().charAt(x + i)) {
                            break;
                        }
                        i++;
                    } else if (length <= 4 || jv3.n(t0Var.s().charAt(x + 4)) != 0) {
                        t0Var.B = x + 4;
                        z2 = true;
                    }
                }
            }
            z2 = false;
            if (!z2) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ct3, defpackage.b91
    public final char j() {
        t0 t0Var = this.q0;
        String m = t0Var.m();
        if (m.length() == 1) {
            return m.charAt(0);
        }
        t0.q(t0Var, b31.n('\'', "Expected single char, but got '", m), 0, null, 6);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0120  */
    @Override // defpackage.b91
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object n(defpackage.m93 r11) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.og6.n(m93):java.lang.Object");
    }

    @Override // defpackage.yu0
    public final int v(h06 h06Var) {
        boolean z;
        t0 t0Var = this.q0;
        oi oiVar = (oi) t0Var.R;
        h06Var.getClass();
        int[] iArr = ng6.a;
        ej7 ej7Var = this.p0;
        int i = iArr[ej7Var.ordinal()];
        char c = ':';
        boolean z2 = false;
        int i2 = -1;
        if (i != 2) {
            if (i != 4) {
                boolean A = t0Var.A();
                if (t0Var.d()) {
                    int i3 = this.s0;
                    if (i3 != -1 && !A) {
                        t0.q(t0Var, "Expected end of the array or comma", 0, null, 6);
                        throw null;
                    }
                    i2 = i3 + 1;
                    this.s0 = i2;
                } else if (A) {
                    io2.Q(t0Var, "array");
                    throw null;
                }
            } else {
                boolean A2 = t0Var.A();
                while (true) {
                    boolean d = t0Var.d();
                    n73 n73Var = this.t0;
                    if (d) {
                        String f = t0Var.f();
                        t0Var.i(c);
                        t63 t63Var = this.o0;
                        int a = a83.a(h06Var, t63Var, f);
                        if (a != -3) {
                            if (n73Var != null) {
                                n73Var.a.a(a);
                            }
                            i2 = a;
                        } else if (!a83.c(t63Var, h06Var)) {
                            int i4 = oiVar.B;
                            int[] iArr2 = (int[]) oiVar.X;
                            if (iArr2[i4] == -2) {
                                iArr2[i4] = -1;
                                oiVar.B = i4 - 1;
                            }
                            int i5 = oiVar.B;
                            if (i5 != -1) {
                                oiVar.B = i5 - 1;
                            }
                            t0Var.p(b31.n('\'', "Encountered an unknown key '", f), zg6.E0(t0Var.z(0, t0Var.B), f, 0, 6), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.");
                            throw null;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            byte v = t0Var.v();
                            if (v == 8 || v == 6) {
                                while (true) {
                                    byte v2 = t0Var.v();
                                    if (v2 == 1) {
                                        t0Var.f();
                                    } else {
                                        if (v2 != 8 && v2 != 6) {
                                            if (v2 == 9) {
                                                if (((Number) tq0.T0(arrayList)).byteValue() == 8) {
                                                    tq0.b1(arrayList);
                                                } else {
                                                    t0.q(t0Var, "found ] instead of }", 0, null, 6);
                                                    throw null;
                                                }
                                            } else if (v2 == 7) {
                                                if (((Number) tq0.T0(arrayList)).byteValue() == 6) {
                                                    tq0.b1(arrayList);
                                                } else {
                                                    t0.q(t0Var, "found } instead of ]", 0, null, 6);
                                                    throw null;
                                                }
                                            } else if (v2 == 10) {
                                                t0.q(t0Var, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                                throw null;
                                            }
                                        } else {
                                            arrayList.add(Byte.valueOf(v2));
                                        }
                                        t0Var.g();
                                        if (arrayList.size() == 0) {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                t0Var.m();
                            }
                            A2 = t0Var.A();
                            c = ':';
                        }
                    } else if (!A2) {
                        if (n73Var != null) {
                            i2 = n73Var.a.b();
                        }
                    } else {
                        io2.Q(t0Var, "object");
                        throw null;
                    }
                }
            }
        } else {
            int i6 = this.s0;
            if (i6 % 2 != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (i6 != -1) {
                    z2 = t0Var.A();
                }
            } else {
                t0Var.i(':');
            }
            if (t0Var.d()) {
                if (z) {
                    int i7 = this.s0;
                    int i8 = t0Var.B;
                    if (i7 == -1) {
                        if (z2) {
                            t0.q(t0Var, "Unexpected leading comma", i8, null, 4);
                            throw null;
                        }
                    } else if (!z2) {
                        t0.q(t0Var, "Expected comma after the key-value pair", i8, null, 4);
                        throw null;
                    }
                }
                i2 = this.s0 + 1;
                this.s0 = i2;
            } else if (z2) {
                io2.Q(t0Var, "object");
                throw null;
            }
        }
        if (ej7Var != ej7.MAP) {
            ((int[]) oiVar.X)[oiVar.B] = i2;
        }
        return i2;
    }
}
