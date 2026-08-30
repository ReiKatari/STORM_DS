package defpackage;

import java.io.IOException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: y83  reason: default package */
/* loaded from: classes.dex */
public final class y83 extends o83 {
    public static final u83 p0 = new u83();
    public static final Object q0 = new Object();
    public Object[] l0;
    public int m0;
    public String[] n0;
    public int[] o0;

    public final String A0() {
        return " at path ".concat(z0(false));
    }

    @Override // defpackage.o83
    public final void B() {
        y0(q83.END_OBJECT);
        this.n0[this.m0 - 1] = null;
        D0();
        D0();
        int i = this.m0;
        if (i > 0) {
            int[] iArr = this.o0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public final String B0(boolean z) {
        String str;
        y0(q83.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) C0()).next();
        String str2 = (String) entry.getKey();
        String[] strArr = this.n0;
        int i = this.m0 - 1;
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
        return this.l0[this.m0 - 1];
    }

    @Override // defpackage.o83
    public final String D() {
        return z0(false);
    }

    public final Object D0() {
        Object[] objArr = this.l0;
        int i = this.m0 - 1;
        this.m0 = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void E0(Object obj) {
        int i = this.m0;
        Object[] objArr = this.l0;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.l0 = Arrays.copyOf(objArr, i2);
            this.o0 = Arrays.copyOf(this.o0, i2);
            this.n0 = (String[]) Arrays.copyOf(this.n0, i2);
        }
        Object[] objArr2 = this.l0;
        int i3 = this.m0;
        this.m0 = i3 + 1;
        objArr2[i3] = obj;
    }

    @Override // defpackage.o83
    public final String I() {
        return z0(true);
    }

    @Override // defpackage.o83
    public final boolean J() {
        q83 n0 = n0();
        if (n0 != q83.END_OBJECT && n0 != q83.END_ARRAY && n0 != q83.END_DOCUMENT) {
            return true;
        }
        return false;
    }

    @Override // defpackage.o83
    public final boolean Q() {
        boolean parseBoolean;
        y0(q83.BOOLEAN);
        l83 l83Var = (l83) D0();
        Serializable serializable = l83Var.A;
        if (serializable instanceof Boolean) {
            parseBoolean = ((Boolean) serializable).booleanValue();
        } else {
            parseBoolean = Boolean.parseBoolean(l83Var.d());
        }
        int i = this.m0;
        if (i > 0) {
            int[] iArr = this.o0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return parseBoolean;
    }

    @Override // defpackage.o83
    public final double R() {
        q83 n0 = n0();
        q83 q83Var = q83.NUMBER;
        if (n0 != q83Var && n0 != q83.STRING) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(q83Var);
            sb.append(" but was ");
            sb.append(n0);
            c44.q(sb, A0());
            return 0.0d;
        }
        double j = ((l83) C0()).j();
        if (this.B == ug6.LENIENT || (!Double.isNaN(j) && !Double.isInfinite(j))) {
            D0();
            int i = this.m0;
            if (i > 0) {
                int[] iArr = this.o0;
                int i2 = i - 1;
                iArr[i2] = iArr[i2] + 1;
            }
            return j;
        }
        throw new IOException("JSON forbids NaN and infinities: " + j);
    }

    @Override // defpackage.o83
    public final int T() {
        q83 n0 = n0();
        q83 q83Var = q83.NUMBER;
        if (n0 != q83Var && n0 != q83.STRING) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(q83Var);
            sb.append(" but was ");
            sb.append(n0);
            c44.q(sb, A0());
            return 0;
        }
        int b = ((l83) C0()).b();
        D0();
        int i = this.m0;
        if (i > 0) {
            int[] iArr = this.o0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return b;
    }

    @Override // defpackage.o83
    public final long V() {
        long parseLong;
        q83 n0 = n0();
        q83 q83Var = q83.NUMBER;
        if (n0 != q83Var && n0 != q83.STRING) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(q83Var);
            sb.append(" but was ");
            sb.append(n0);
            c44.q(sb, A0());
            return 0L;
        }
        l83 l83Var = (l83) C0();
        if (l83Var.A instanceof Number) {
            parseLong = l83Var.k().longValue();
        } else {
            parseLong = Long.parseLong(l83Var.d());
        }
        D0();
        int i = this.m0;
        if (i > 0) {
            int[] iArr = this.o0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return parseLong;
    }

    @Override // defpackage.o83
    public final String Z() {
        return B0(false);
    }

    @Override // defpackage.o83, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.l0 = new Object[]{q0};
        this.m0 = 1;
    }

    @Override // defpackage.o83
    public final void d() {
        y0(q83.BEGIN_ARRAY);
        E0(((z63) C0()).A.iterator());
        this.o0[this.m0 - 1] = 0;
    }

    @Override // defpackage.o83
    public final void i() {
        y0(q83.BEGIN_OBJECT);
        E0(((wo3) ((g83) C0()).A.entrySet()).iterator());
    }

    @Override // defpackage.o83
    public final void j0() {
        y0(q83.NULL);
        D0();
        int i = this.m0;
        if (i > 0) {
            int[] iArr = this.o0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // defpackage.o83
    public final String l0() {
        q83 n0 = n0();
        q83 q83Var = q83.STRING;
        if (n0 != q83Var && n0 != q83.NUMBER) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(q83Var);
            sb.append(" but was ");
            sb.append(n0);
            c44.q(sb, A0());
            return null;
        }
        String d = ((l83) D0()).d();
        int i = this.m0;
        if (i > 0) {
            int[] iArr = this.o0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return d;
    }

    @Override // defpackage.o83
    public final q83 n0() {
        if (this.m0 == 0) {
            return q83.END_DOCUMENT;
        }
        Object C0 = C0();
        if (C0 instanceof Iterator) {
            boolean z = this.l0[this.m0 - 2] instanceof g83;
            Iterator it = (Iterator) C0;
            if (it.hasNext()) {
                if (z) {
                    return q83.NAME;
                }
                E0(it.next());
                return n0();
            } else if (z) {
                return q83.END_OBJECT;
            } else {
                return q83.END_ARRAY;
            }
        } else if (C0 instanceof g83) {
            return q83.BEGIN_OBJECT;
        } else {
            if (C0 instanceof z63) {
                return q83.BEGIN_ARRAY;
            }
            if (C0 instanceof l83) {
                Serializable serializable = ((l83) C0).A;
                if (serializable instanceof String) {
                    return q83.STRING;
                }
                if (serializable instanceof Boolean) {
                    return q83.BOOLEAN;
                }
                if (serializable instanceof Number) {
                    return q83.NUMBER;
                }
                throw new AssertionError();
            } else if (C0 instanceof c83) {
                return q83.NULL;
            } else {
                if (C0 == q0) {
                    i.n("JsonReader is closed");
                    return null;
                }
                String name = C0.getClass().getName();
                throw new IOException("Custom JsonElement subclass " + name + " is not supported");
            }
        }
    }

    @Override // defpackage.o83
    public final String toString() {
        return y83.class.getSimpleName().concat(A0());
    }

    @Override // defpackage.o83
    public final void u0() {
        int i = v83.a[n0().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        D0();
                        int i2 = this.m0;
                        if (i2 > 0) {
                            int[] iArr = this.o0;
                            int i3 = i2 - 1;
                            iArr[i3] = iArr[i3] + 1;
                            return;
                        }
                        return;
                    }
                    return;
                }
                B();
                return;
            }
            x();
            return;
        }
        B0(true);
    }

    @Override // defpackage.o83
    public final void x() {
        y0(q83.END_ARRAY);
        D0();
        D0();
        int i = this.m0;
        if (i > 0) {
            int[] iArr = this.o0;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public final void y0(q83 q83Var) {
        if (n0() == q83Var) {
            return;
        }
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(q83Var);
        sb.append(" but was ");
        sb.append(n0());
        c44.q(sb, A0());
    }

    public final String z0(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.m0;
            if (i < i2) {
                Object[] objArr = this.l0;
                Object obj = objArr[i];
                if (obj instanceof z63) {
                    i++;
                    if (i < i2 && (objArr[i] instanceof Iterator)) {
                        int i3 = this.o0[i];
                        if (z && i3 > 0 && (i == i2 - 1 || i == i2 - 2)) {
                            i3--;
                        }
                        sb.append('[');
                        sb.append(i3);
                        sb.append(']');
                    }
                } else if ((obj instanceof g83) && (i = i + 1) < i2 && (objArr[i] instanceof Iterator)) {
                    sb.append('.');
                    String str = this.n0[i];
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
