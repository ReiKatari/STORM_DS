package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fs6  reason: default package */
/* loaded from: classes.dex */
public final class fs6 extends nw7 implements yd3 {
    public final id3 t0;
    public final by7 u0;
    public final u0 v0;
    public final jd1 w0;
    public int x0;
    public final ge3 y0;

    public fs6(id3 id3Var, by7 by7Var, u0 u0Var, wb6 wb6Var) {
        ge3 ge3Var;
        by7Var.getClass();
        wb6Var.getClass();
        this.t0 = id3Var;
        this.u0 = by7Var;
        this.v0 = u0Var;
        this.w0 = id3Var.b;
        this.x0 = -1;
        if (id3Var.a.b) {
            ge3Var = null;
        } else {
            ge3Var = new ge3(wb6Var);
        }
        this.y0 = ge3Var;
    }

    @Override // defpackage.nw7, defpackage.sc1
    public final int B() {
        u0 u0Var = this.v0;
        long j = u0Var.j();
        int i = (int) j;
        if (j == i) {
            return i;
        }
        u0.q(u0Var, "Failed to parse int for input '" + j + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.nw7, defpackage.sc1
    public final sc1 F(wb6 wb6Var) {
        wb6Var.getClass();
        if (is6.a(wb6Var)) {
            return new zd3(this.v0, this.t0);
        }
        return this;
    }

    @Override // defpackage.nw7, defpackage.ux0
    public final Object G(wb6 wb6Var, int i, gg3 gg3Var, Object obj) {
        boolean z;
        Object obj2;
        aj ajVar = (aj) this.v0.R;
        wb6Var.getClass();
        gg3Var.getClass();
        if (this.u0 == by7.MAP && (i & 1) == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i2 = ajVar.B;
            if (((int[]) ajVar.X)[i2] == -2) {
                ((Object[]) ajVar.R)[i2] = xd5.g0;
            }
        }
        Object k = k(gg3Var);
        if (z) {
            int i3 = ajVar.B;
            if (((int[]) ajVar.X)[i3] != -2) {
                int i4 = i3 + 1;
                ajVar.B = i4;
                if (i4 == ((Object[]) ajVar.R).length) {
                    ajVar.i();
                }
            }
            Object[] objArr = (Object[]) ajVar.R;
            int i5 = ajVar.B;
            if (((td3) ajVar.L).g) {
                obj2 = k;
            } else {
                obj2 = cs1.e0;
            }
            objArr[i5] = obj2;
            ((int[]) ajVar.X)[i5] = -2;
        }
        return k;
    }

    @Override // defpackage.nw7, defpackage.sc1
    public final String I() {
        return this.v0.k();
    }

    @Override // defpackage.nw7, defpackage.sc1
    public final int J(wb6 wb6Var) {
        wb6Var.getClass();
        u0 u0Var = this.v0;
        return te3.b(wb6Var, this.t0, u0Var.k(), " at path ".concat(((aj) u0Var.R).c()));
    }

    @Override // defpackage.nw7, defpackage.sc1
    public final long L() {
        return this.v0.j();
    }

    @Override // defpackage.nw7, defpackage.sc1
    public final boolean M() {
        boolean z;
        boolean z2;
        ge3 ge3Var = this.y0;
        if (ge3Var != null) {
            z = ge3Var.b;
        } else {
            z = false;
        }
        if (!z) {
            u0 u0Var = this.v0;
            int x = u0Var.x(u0Var.y());
            int length = u0Var.s().length() - x;
            if (length >= 4 && x != -1) {
                int i = 0;
                while (true) {
                    if (i < 4) {
                        if ("null".charAt(i) != u0Var.s().charAt(x + i)) {
                            break;
                        }
                        i++;
                    } else if (length <= 4 || l.n(u0Var.s().charAt(x + 4)) != 0) {
                        u0Var.B = x + 4;
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

    @Override // defpackage.yd3
    public final id3 S() {
        return this.t0;
    }

    @Override // defpackage.nw7, defpackage.sc1
    public final byte Y() {
        u0 u0Var = this.v0;
        long j = u0Var.j();
        byte b = (byte) j;
        if (j == b) {
            return b;
        }
        u0.q(u0Var, "Failed to parse byte for input '" + j + '\'', 0, null, 6);
        throw null;
    }

    @Override // defpackage.nw7, defpackage.sc1
    public final short Z() {
        u0 u0Var = this.v0;
        long j = u0Var.j();
        short s = (short) j;
        if (j == s) {
            return s;
        }
        u0.q(u0Var, "Failed to parse short for input '" + j + '\'', 0, null, 6);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0043  */
    @Override // defpackage.nw7, defpackage.ux0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(wb6 wb6Var) {
        u0 u0Var;
        wb6Var.getClass();
        if (wb6Var.f() == 0 && te3.c(this.t0, wb6Var)) {
            do {
            } while (q(wb6Var) != -1);
            u0Var = this.v0;
            if (u0Var.A()) {
            }
        } else {
            u0Var = this.v0;
            if (u0Var.A()) {
                u0Var.i(this.u0.end);
                aj ajVar = (aj) u0Var.R;
                int i = ajVar.B;
                int[] iArr = (int[]) ajVar.X;
                if (iArr[i] == -2) {
                    iArr[i] = -1;
                    ajVar.B = i - 1;
                }
                int i2 = ajVar.B;
                if (i2 != -1) {
                    ajVar.B = i2 - 1;
                    return;
                }
                return;
            }
            hi2.F(u0Var, "");
            throw null;
        }
    }

    @Override // defpackage.ux0
    public final jd1 b() {
        return this.w0;
    }

    @Override // defpackage.nw7, defpackage.sc1
    public final float b0() {
        u0 u0Var = this.v0;
        String m = u0Var.m();
        try {
            float parseFloat = Float.parseFloat(m);
            if (Math.abs(parseFloat) <= Float.MAX_VALUE) {
                return parseFloat;
            }
            u0.q(u0Var, hi2.I(Float.valueOf(parseFloat), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            u0.q(u0Var, i61.k('\'', "Failed to parse type 'float' for input '", m), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.nw7, defpackage.sc1
    public final ux0 c(wb6 wb6Var) {
        wb6Var.getClass();
        id3 id3Var = this.t0;
        by7 c = js7.c(id3Var, wb6Var);
        u0 u0Var = this.v0;
        aj ajVar = (aj) u0Var.R;
        ajVar.getClass();
        int i = ajVar.B + 1;
        ajVar.B = i;
        if (i == ((Object[]) ajVar.R).length) {
            ajVar.i();
        }
        ((Object[]) ajVar.R)[i] = wb6Var;
        u0Var.i(c.begin);
        if (u0Var.v() != 4) {
            int i2 = es6.a[c.ordinal()];
            if (i2 != 1 && i2 != 2 && i2 != 3) {
                if (this.u0 == c && id3Var.a.b) {
                    return this;
                }
                return new fs6(id3Var, c, u0Var, wb6Var);
            }
            return new fs6(id3Var, c, u0Var, wb6Var);
        }
        u0.q(u0Var, "Unexpected leading comma", 0, null, 6);
        throw null;
    }

    @Override // defpackage.nw7, defpackage.sc1
    public final double e0() {
        u0 u0Var = this.v0;
        String m = u0Var.m();
        try {
            double parseDouble = Double.parseDouble(m);
            if (Math.abs(parseDouble) <= Double.MAX_VALUE) {
                return parseDouble;
            }
            u0.q(u0Var, hi2.I(Double.valueOf(parseDouble), null), 0, "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2);
            throw null;
        } catch (IllegalArgumentException unused) {
            u0.q(u0Var, i61.k('\'', "Failed to parse type 'double' for input '", m), 0, null, 6);
            throw null;
        }
    }

    @Override // defpackage.nw7, defpackage.sc1
    public final boolean g() {
        boolean z;
        boolean z2;
        u0 u0Var = this.v0;
        int y = u0Var.y();
        if (y != u0Var.s().length()) {
            if (u0Var.s().charAt(y) == '\"') {
                y++;
                z = true;
            } else {
                z = false;
            }
            int x = u0Var.x(y);
            if (x < u0Var.s().length() && x != -1) {
                int i = x + 1;
                int charAt = u0Var.s().charAt(x) | ' ';
                if (charAt != 102) {
                    if (charAt == 116) {
                        u0Var.e(i, "rue");
                        z2 = true;
                    } else {
                        u0.q(u0Var, "Expected valid boolean literal prefix, but had '" + u0Var.m() + '\'', 0, null, 6);
                        throw null;
                    }
                } else {
                    u0Var.e(i, "alse");
                    z2 = false;
                }
                if (z) {
                    if (u0Var.B != u0Var.s().length()) {
                        if (u0Var.s().charAt(u0Var.B) == '\"') {
                            u0Var.B++;
                            return z2;
                        }
                        u0.q(u0Var, "Expected closing quotation mark", 0, null, 6);
                        throw null;
                    }
                    u0.q(u0Var, "EOF", 0, null, 6);
                    throw null;
                }
                return z2;
            }
            u0.q(u0Var, "EOF", 0, null, 6);
            throw null;
        }
        u0.q(u0Var, "EOF", 0, null, 6);
        throw null;
    }

    @Override // defpackage.nw7, defpackage.sc1
    public final char h() {
        u0 u0Var = this.v0;
        String m = u0Var.m();
        if (m.length() == 1) {
            return m.charAt(0);
        }
        u0.q(u0Var, i61.k('\'', "Expected single char, but got '", m), 0, null, 6);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0120  */
    @Override // defpackage.sc1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(gg3 gg3Var) {
        String message;
        String str;
        String str2;
        String str3;
        id3 id3Var = this.t0;
        u0 u0Var = this.v0;
        aj ajVar = (aj) u0Var.R;
        gg3Var.getClass();
        try {
        } catch (o64 e) {
            message = e.getMessage();
            message.getClass();
            if (!qs6.j0(message, "at path", false)) {
            }
        }
        if (gg3Var instanceof fz4) {
            String u = u0Var.u(uj2.r(id3Var, ((fz4) gg3Var).e()));
            if (u == null) {
                String r = uj2.r(id3Var, ((fz4) gg3Var).e());
                de3 y = y();
                String a = ((fz4) gg3Var).e().a();
                if (!(y instanceof ye3)) {
                    String str4 = "Expected " + gh5.a(ye3.class).c() + ", but had " + gh5.a(y.getClass()).c() + " as the serialized body of " + a;
                    String c = ajVar.c();
                    if (id3Var.a.g) {
                        str3 = hi2.H(-1, y.toString()).toString();
                    } else {
                        str3 = null;
                    }
                    throw new me3(hi2.x(str4, c, -1, null, str3));
                }
                ye3 ye3Var = (ye3) y;
                de3 de3Var = (de3) ye3Var.get(r);
                try {
                    if (de3Var != null) {
                        df3 h = fe3.h(de3Var);
                        if (!(h instanceof ue3)) {
                            str = h.a();
                            xk2.g((fz4) gg3Var, this, str);
                            throw null;
                        }
                    }
                    xk2.g((fz4) gg3Var, this, str);
                    throw null;
                } catch (fc6 e2) {
                    String message2 = e2.getMessage();
                    message2.getClass();
                    if (id3Var.a.g) {
                        str2 = hi2.H(-1, ye3Var.toString()).toString();
                    } else {
                        str2 = null;
                    }
                    throw new me3(hi2.x(message2, null, -1, null, str2));
                }
                str = null;
            } else {
                try {
                    xk2.g((fz4) gg3Var, this, u);
                    throw null;
                } catch (fc6 e3) {
                    String message3 = e3.getMessage();
                    message3.getClass();
                    String E0 = qs6.E0(qs6.P0(message3, '\n'), ".");
                    String message4 = e3.getMessage();
                    message4.getClass();
                    u0.q(u0Var, E0, 0, qs6.M0('\n', message4, ""), 2);
                    throw null;
                }
            }
            message = e.getMessage();
            message.getClass();
            if (!qs6.j0(message, "at path", false)) {
                throw e;
            }
            throw new o64(e.getMessage() + " at path: " + ajVar.c(), e, e.A, e.B);
        }
        return gg3Var.c(this);
    }

    @Override // defpackage.ux0
    public final int q(wb6 wb6Var) {
        boolean z;
        u0 u0Var = this.v0;
        aj ajVar = (aj) u0Var.R;
        wb6Var.getClass();
        int[] iArr = es6.a;
        by7 by7Var = this.u0;
        int i = iArr[by7Var.ordinal()];
        char c = ':';
        boolean z2 = false;
        int i2 = -1;
        if (i != 2) {
            if (i != 4) {
                boolean A = u0Var.A();
                if (u0Var.d()) {
                    int i3 = this.x0;
                    if (i3 != -1 && !A) {
                        u0.q(u0Var, "Expected end of the array or comma", 0, null, 6);
                        throw null;
                    }
                    i2 = i3 + 1;
                    this.x0 = i2;
                } else if (A) {
                    hi2.F(u0Var, "array");
                    throw null;
                }
            } else {
                boolean A2 = u0Var.A();
                while (true) {
                    boolean d = u0Var.d();
                    ge3 ge3Var = this.y0;
                    if (d) {
                        String f = u0Var.f();
                        u0Var.i(c);
                        id3 id3Var = this.t0;
                        int a = te3.a(wb6Var, id3Var, f);
                        if (a != -3) {
                            if (ge3Var != null) {
                                ge3Var.a.a(a);
                            }
                            i2 = a;
                        } else if (!te3.c(id3Var, wb6Var)) {
                            int i4 = ajVar.B;
                            int[] iArr2 = (int[]) ajVar.X;
                            if (iArr2[i4] == -2) {
                                iArr2[i4] = -1;
                                ajVar.B = i4 - 1;
                            }
                            int i5 = ajVar.B;
                            if (i5 != -1) {
                                ajVar.B = i5 - 1;
                            }
                            u0Var.p(i61.k('\'', "Encountered an unknown key '", f), qs6.y0(u0Var.z(0, u0Var.B), f, 0, 6), "Use 'ignoreUnknownKeys = true' in 'Json {}' builder or '@JsonIgnoreUnknownKeys' annotation to ignore unknown keys.");
                            throw null;
                        } else {
                            ArrayList arrayList = new ArrayList();
                            byte v = u0Var.v();
                            if (v == 8 || v == 6) {
                                while (true) {
                                    byte v2 = u0Var.v();
                                    if (v2 == 1) {
                                        u0Var.f();
                                    } else {
                                        if (v2 != 8 && v2 != 6) {
                                            if (v2 == 9) {
                                                if (((Number) gt0.Q0(arrayList)).byteValue() == 8) {
                                                    gt0.Y0(arrayList);
                                                } else {
                                                    u0.q(u0Var, "found ] instead of }", 0, null, 6);
                                                    throw null;
                                                }
                                            } else if (v2 == 7) {
                                                if (((Number) gt0.Q0(arrayList)).byteValue() == 6) {
                                                    gt0.Y0(arrayList);
                                                } else {
                                                    u0.q(u0Var, "found } instead of ]", 0, null, 6);
                                                    throw null;
                                                }
                                            } else if (v2 == 10) {
                                                u0.q(u0Var, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6);
                                                throw null;
                                            }
                                        } else {
                                            arrayList.add(Byte.valueOf(v2));
                                        }
                                        u0Var.g();
                                        if (arrayList.size() == 0) {
                                            break;
                                        }
                                    }
                                }
                            } else {
                                u0Var.m();
                            }
                            A2 = u0Var.A();
                            c = ':';
                        }
                    } else if (!A2) {
                        if (ge3Var != null) {
                            i2 = ge3Var.a.b();
                        }
                    } else {
                        hi2.F(u0Var, "object");
                        throw null;
                    }
                }
            }
        } else {
            int i6 = this.x0;
            if (i6 % 2 != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (i6 != -1) {
                    z2 = u0Var.A();
                }
            } else {
                u0Var.i(':');
            }
            if (u0Var.d()) {
                if (z) {
                    int i7 = this.x0;
                    int i8 = u0Var.B;
                    if (i7 == -1) {
                        if (z2) {
                            u0.q(u0Var, "Unexpected leading comma", i8, null, 4);
                            throw null;
                        }
                    } else if (!z2) {
                        u0.q(u0Var, "Expected comma after the key-value pair", i8, null, 4);
                        throw null;
                    }
                }
                i2 = this.x0 + 1;
                this.x0 = i2;
            } else if (z2) {
                hi2.F(u0Var, "object");
                throw null;
            }
        }
        if (by7Var != by7.MAP) {
            ((int[]) ajVar.X)[ajVar.B] = i2;
        }
        return i2;
    }

    @Override // defpackage.yd3
    public final de3 y() {
        return new zb(this.t0.a, this.v0).q();
    }
}
