package defpackage;

import java.io.Closeable;
import java.io.Flushable;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b93  reason: default package */
/* loaded from: classes.dex */
public class b93 implements Closeable, Flushable {
    public static final Pattern g0 = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] h0 = new String[128];
    public static final String[] i0;
    public final Writer A;
    public int[] B;
    public int L;
    public df2 R;
    public String X;
    public String Y;
    public boolean Z;
    public ug6 c0;
    public boolean d0;
    public String e0;
    public boolean f0;

    static {
        for (int i = 0; i <= 31; i++) {
            h0[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = h0;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        i0 = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public b93(Writer writer) {
        int[] iArr = new int[32];
        this.B = iArr;
        this.L = 0;
        if (iArr.length == 0) {
            this.B = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.B;
        int i = this.L;
        this.L = i + 1;
        iArr2[i] = 6;
        this.c0 = ug6.LEGACY_STRICT;
        this.f0 = true;
        Objects.requireNonNull(writer, "out == null");
        this.A = writer;
        J(df2.d);
    }

    public void B() {
        w('}', 3, 5);
    }

    public void C(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.e0 == null) {
            int I = I();
            if (I != 3 && I != 5) {
                i.n("Please begin an object before writing a name.");
                return;
            } else {
                this.e0 = str;
                return;
            }
        }
        i.n("Already wrote a name, expecting a value.");
    }

    public final void D() {
        if (!this.Z) {
            String str = this.R.a;
            Writer writer = this.A;
            writer.write(str);
            int i = this.L;
            for (int i2 = 1; i2 < i; i2++) {
                writer.write(this.R.b);
            }
        }
    }

    public b93 F() {
        if (this.e0 != null) {
            if (this.f0) {
                j0();
            } else {
                this.e0 = null;
                return this;
            }
        }
        d();
        this.A.write("null");
        return this;
    }

    public final int I() {
        int i = this.L;
        if (i != 0) {
            return this.B[i - 1];
        }
        i.n("JsonWriter is closed.");
        return 0;
    }

    public final void J(df2 df2Var) {
        boolean z;
        Objects.requireNonNull(df2Var);
        this.R = df2Var;
        this.Y = ",";
        if (df2Var.c) {
            this.X = ": ";
            if (df2Var.a.isEmpty()) {
                this.Y = ", ";
            }
        } else {
            this.X = ":";
        }
        if (this.R.a.isEmpty() && this.R.b.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        this.Z = z;
    }

    public final void K(ug6 ug6Var) {
        Objects.requireNonNull(ug6Var);
        this.c0 = ug6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void N(java.lang.String r8) {
        /*
            r7 = this;
            boolean r0 = r7.d0
            if (r0 == 0) goto L7
            java.lang.String[] r0 = defpackage.b93.i0
            goto L9
        L7:
            java.lang.String[] r0 = defpackage.b93.h0
        L9:
            java.io.Writer r7 = r7.A
            r1 = 34
            r7.write(r1)
            int r2 = r8.length()
            r3 = 0
            r4 = r3
        L16:
            if (r3 >= r2) goto L41
            char r5 = r8.charAt(r3)
            r6 = 128(0x80, float:1.8E-43)
            if (r5 >= r6) goto L25
            r5 = r0[r5]
            if (r5 != 0) goto L32
            goto L3e
        L25:
            r6 = 8232(0x2028, float:1.1535E-41)
            if (r5 != r6) goto L2c
            java.lang.String r5 = "\\u2028"
            goto L32
        L2c:
            r6 = 8233(0x2029, float:1.1537E-41)
            if (r5 != r6) goto L3e
            java.lang.String r5 = "\\u2029"
        L32:
            if (r4 >= r3) goto L39
            int r6 = r3 - r4
            r7.write(r8, r4, r6)
        L39:
            r7.write(r5)
            int r4 = r3 + 1
        L3e:
            int r3 = r3 + 1
            goto L16
        L41:
            if (r4 >= r2) goto L47
            int r2 = r2 - r4
            r7.write(r8, r4, r2)
        L47:
            r7.write(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b93.N(java.lang.String):void");
    }

    public void Q(double d) {
        j0();
        if (this.c0 != ug6.LENIENT && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
        d();
        this.A.append((CharSequence) Double.toString(d));
    }

    public void R(long j) {
        j0();
        d();
        this.A.write(Long.toString(j));
    }

    public void T(Boolean bool) {
        String str;
        if (bool == null) {
            F();
            return;
        }
        j0();
        d();
        if (bool.booleanValue()) {
            str = "true";
        } else {
            str = "false";
        }
        this.A.write(str);
    }

    public void V(Number number) {
        if (number == null) {
            F();
            return;
        }
        j0();
        String obj = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
                if (cls != Float.class && cls != Double.class && !g0.matcher(obj).matches()) {
                    vd6.g("String created by ", cls, " is not a valid JSON number: ", obj);
                    return;
                }
            } else if (this.c0 != ug6.LENIENT) {
                i.i("Numeric values must be finite, but was ".concat(obj));
                return;
            }
        }
        d();
        this.A.append((CharSequence) obj);
    }

    public void Z(String str) {
        if (str == null) {
            F();
            return;
        }
        j0();
        d();
        N(str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A.close();
        int i = this.L;
        if (i <= 1 && (i != 1 || this.B[i - 1] == 7)) {
            this.L = 0;
        } else {
            f81.j("Incomplete document");
        }
    }

    public final void d() {
        int I = I();
        if (I != 1) {
            Writer writer = this.A;
            if (I != 2) {
                if (I != 4) {
                    if (I != 6) {
                        if (I == 7) {
                            if (this.c0 != ug6.LENIENT) {
                                i.n("JSON must have only one top-level value.");
                                return;
                            }
                        } else {
                            i.n("Nesting problem.");
                            return;
                        }
                    }
                    this.B[this.L - 1] = 7;
                    return;
                }
                writer.append((CharSequence) this.X);
                this.B[this.L - 1] = 5;
                return;
            }
            writer.append((CharSequence) this.Y);
            D();
            return;
        }
        this.B[this.L - 1] = 2;
        D();
    }

    public void f0(boolean z) {
        String str;
        j0();
        d();
        if (z) {
            str = "true";
        } else {
            str = "false";
        }
        this.A.write(str);
    }

    public void flush() {
        if (this.L != 0) {
            this.A.flush();
        } else {
            i.n("JsonWriter is closed.");
        }
    }

    public void i() {
        j0();
        d();
        int i = this.L;
        int[] iArr = this.B;
        if (i == iArr.length) {
            this.B = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.B;
        int i2 = this.L;
        this.L = i2 + 1;
        iArr2[i2] = 1;
        this.A.write(91);
    }

    public final void j0() {
        if (this.e0 != null) {
            int I = I();
            if (I == 5) {
                this.A.write(this.Y);
            } else if (I != 3) {
                i.n("Nesting problem.");
                return;
            }
            D();
            this.B[this.L - 1] = 4;
            N(this.e0);
            this.e0 = null;
        }
    }

    public void p() {
        j0();
        d();
        int i = this.L;
        int[] iArr = this.B;
        if (i == iArr.length) {
            this.B = Arrays.copyOf(iArr, i * 2);
        }
        int[] iArr2 = this.B;
        int i2 = this.L;
        this.L = i2 + 1;
        iArr2[i2] = 3;
        this.A.write(123);
    }

    public final void w(char c, int i, int i2) {
        int I = I();
        if (I != i2 && I != i) {
            i.n("Nesting problem.");
        } else if (this.e0 == null) {
            this.L--;
            if (I == i2) {
                D();
            }
            this.A.write(c);
        } else {
            f81.A(this.e0, "Dangling name: ");
        }
    }

    public void x() {
        w(']', 1, 2);
    }
}
