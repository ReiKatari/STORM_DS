package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rf3  reason: default package */
/* loaded from: classes.dex */
public final class rf3 extends hf3 {
    public static final nf3 q0 = new nf3();
    public static final Object r0 = new Object();
    public Object[] m0;
    public int n0;
    public String[] o0;
    public int[] p0;

    public final String A0() {
        return " at path ".concat(z0(false));
    }

    public final String B0(boolean z) {
        String str;
        y0(jf3.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) C0()).next();
        String str2 = (String) entry.getKey();
        String[] strArr = this.o0;
        int i = this.n0 - 1;
        if (z) {
            str = "<skipped>";
        } else {
            str = str2;
        }
        strArr[i] = str;
        E0(entry.getValue());
        return str2;
    }

    public final Object C0() {
        return this.m0[this.n0 - 1];
    }

    @Override // defpackage.hf3
    public final String D() {
        return z0(true);
    }

    public final Object D0() {
        Object[] objArr = this.m0;
        int i = this.n0 - 1;
        this.n0 = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void E0(Object obj) {
        int i = this.n0;
        Object[] objArr = this.m0;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.m0 = Arrays.copyOf(objArr, i2);
            this.p0 = Arrays.copyOf(this.p0, i2);
            this.o0 = (String[]) Arrays.copyOf(this.o0, i2);
        }
        Object[] objArr2 = this.m0;
        int i3 = this.n0;
        this.n0 = i3 + 1;
        objArr2[i3] = obj;
    }

    @Override // defpackage.hf3
    public final boolean F() {
        jf3 n0 = n0();
        if (n0 != jf3.END_OBJECT && n0 != jf3.END_ARRAY && n0 != jf3.END_DOCUMENT) {
            return true;
        }
        return false;
    }

    @Override // defpackage.hf3
    public final boolean U() {
        boolean parseBoolean;
        y0(jf3.BOOLEAN);
        ef3 ef3Var = (ef3) D0();
        Serializable serializable = ef3Var.A;
        if (serializable instanceof Boolean) {
            parseBoolean = ((Boolean) serializable).booleanValue();
        } else {
            parseBoolean = Boolean.parseBoolean(ef3Var.c());
        }
        int i = this.n0;
        if (i > 0) {
            int[] iArr = this.p0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return parseBoolean;
    }

    @Override // defpackage.hf3
    public final double X() {
        jf3 n0 = n0();
        jf3 jf3Var = jf3.NUMBER;
        if (n0 != jf3Var && n0 != jf3.STRING) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(jf3Var);
            sb.append(" but was ");
            sb.append(n0);
            u34.r(sb, A0());
            return 0.0d;
        }
        double f = ((ef3) C0()).f();
        if (this.B == ls6.LENIENT || (!Double.isNaN(f) && !Double.isInfinite(f))) {
            D0();
            int i = this.n0;
            if (i > 0) {
                int[] iArr = this.p0;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return f;
        }
        throw new IOException("JSON forbids NaN and infinities: " + f);
    }

    @Override // defpackage.hf3
    public final int Z() {
        jf3 n0 = n0();
        jf3 jf3Var = jf3.NUMBER;
        if (n0 != jf3Var && n0 != jf3.STRING) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(jf3Var);
            sb.append(" but was ");
            sb.append(n0);
            u34.r(sb, A0());
            return 0;
        }
        int a = ((ef3) C0()).a();
        D0();
        int i = this.n0;
        if (i > 0) {
            int[] iArr = this.p0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return a;
    }

    @Override // defpackage.hf3
    public final long a0() {
        long parseLong;
        jf3 n0 = n0();
        jf3 jf3Var = jf3.NUMBER;
        if (n0 != jf3Var && n0 != jf3.STRING) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(jf3Var);
            sb.append(" but was ");
            sb.append(n0);
            u34.r(sb, A0());
            return 0L;
        }
        ef3 ef3Var = (ef3) C0();
        if (ef3Var.A instanceof Number) {
            parseLong = ef3Var.g().longValue();
        } else {
            parseLong = Long.parseLong(ef3Var.c());
        }
        D0();
        int i = this.n0;
        if (i > 0) {
            int[] iArr = this.p0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return parseLong;
    }

    @Override // defpackage.hf3
    public final String c0() {
        return B0(false);
    }

    @Override // defpackage.hf3, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.m0 = new Object[]{r0};
        this.n0 = 1;
    }

    @Override // defpackage.hf3
    public final void e() {
        y0(jf3.BEGIN_ARRAY);
        E0(((od3) C0()).A.iterator());
        this.p0[this.n0 - 1] = 0;
    }

    @Override // defpackage.hf3
    public final void h() {
        y0(jf3.BEGIN_OBJECT);
        E0(((yv3) ((ze3) C0()).A.entrySet()).iterator());
    }

    @Override // defpackage.hf3
    public final void j0() {
        y0(jf3.NULL);
        D0();
        int i = this.n0;
        if (i > 0) {
            int[] iArr = this.p0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // defpackage.hf3
    public final String l0() {
        jf3 n0 = n0();
        jf3 jf3Var = jf3.STRING;
        if (n0 != jf3Var && n0 != jf3.NUMBER) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(jf3Var);
            sb.append(" but was ");
            sb.append(n0);
            u34.r(sb, A0());
            return null;
        }
        String c = ((ef3) D0()).c();
        int i = this.n0;
        if (i > 0) {
            int[] iArr = this.p0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return c;
    }

    @Override // defpackage.hf3
    public final jf3 n0() {
        if (this.n0 == 0) {
            return jf3.END_DOCUMENT;
        }
        Object C0 = C0();
        if (C0 instanceof Iterator) {
            boolean z = this.m0[this.n0 - 2] instanceof ze3;
            Iterator it = (Iterator) C0;
            if (it.hasNext()) {
                if (z) {
                    return jf3.NAME;
                }
                E0(it.next());
                return n0();
            } else if (z) {
                return jf3.END_OBJECT;
            } else {
                return jf3.END_ARRAY;
            }
        } else if (C0 instanceof ze3) {
            return jf3.BEGIN_OBJECT;
        } else {
            if (C0 instanceof od3) {
                return jf3.BEGIN_ARRAY;
            }
            if (C0 instanceof ef3) {
                Serializable serializable = ((ef3) C0).A;
                if (serializable instanceof String) {
                    return jf3.STRING;
                }
                if (serializable instanceof Boolean) {
                    return jf3.BOOLEAN;
                }
                if (serializable instanceof Number) {
                    return jf3.NUMBER;
                }
                throw new AssertionError();
            } else if (C0 instanceof ve3) {
                return jf3.NULL;
            } else {
                if (C0 == r0) {
                    i.m("JsonReader is closed");
                    return null;
                }
                String name = C0.getClass().getName();
                throw new IOException("Custom JsonElement subclass " + name + " is not supported");
            }
        }
    }

    @Override // defpackage.hf3
    public final void r() {
        y0(jf3.END_ARRAY);
        D0();
        D0();
        int i = this.n0;
        if (i > 0) {
            int[] iArr = this.p0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // defpackage.hf3
    public final String toString() {
        return rf3.class.getSimpleName().concat(A0());
    }

    @Override // defpackage.hf3
    public final void u() {
        y0(jf3.END_OBJECT);
        this.o0[this.n0 - 1] = null;
        D0();
        D0();
        int i = this.n0;
        if (i > 0) {
            int[] iArr = this.p0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // defpackage.hf3
    public final void u0() {
        int i = of3.a[n0().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        D0();
                        int i2 = this.n0;
                        if (i2 > 0) {
                            int[] iArr = this.p0;
                            int i3 = i2 - 1;
                            iArr[i3] = iArr[i3] + 1;
                            return;
                        }
                        return;
                    }
                    return;
                }
                u();
                return;
            }
            r();
            return;
        }
        B0(true);
    }

    @Override // defpackage.hf3
    public final String x() {
        return z0(false);
    }

    public final void y0(jf3 jf3Var) {
        if (n0() == jf3Var) {
            return;
        }
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(jf3Var);
        sb.append(" but was ");
        sb.append(n0());
        u34.r(sb, A0());
    }

    public final String z0(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.n0;
            if (i < i2) {
                Object[] objArr = this.m0;
                Object obj = objArr[i];
                if (obj instanceof od3) {
                    i++;
                    if (i < i2 && (objArr[i] instanceof Iterator)) {
                        int i3 = this.p0[i];
                        if (z && i3 > 0 && (i == i2 - 1 || i == i2 - 2)) {
                            i3--;
                        }
                        sb.append('[');
                        sb.append(i3);
                        sb.append(']');
                    }
                } else if ((obj instanceof ze3) && (i = i + 1) < i2 && (objArr[i] instanceof Iterator)) {
                    sb.append('.');
                    String str = this.o0[i];
                    if (str != null) {
                        sb.append(str);
                    }
                }
                i++;
            } else {
                return sb.toString();
            }
        }
    }
}
