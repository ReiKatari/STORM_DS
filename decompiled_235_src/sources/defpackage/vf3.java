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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vf3  reason: default package */
/* loaded from: classes.dex */
public class vf3 implements Closeable, Flushable {
    public static final Pattern h0 = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    public static final String[] i0 = new String[128];
    public static final String[] j0;
    public final Writer A;
    public int[] B;
    public int L;
    public ck2 R;
    public String X;
    public String Y;
    public boolean Z;
    public ls6 d0;
    public boolean e0;
    public String f0;
    public boolean g0;

    static {
        for (int i = 0; i <= 31; i++) {
            i0[i] = String.format("\\u%04x", Integer.valueOf(i));
        }
        String[] strArr = i0;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        j0 = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public vf3(Writer writer) {
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
        this.d0 = ls6.LEGACY_STRICT;
        this.g0 = true;
        Objects.requireNonNull(writer, "out == null");
        this.A = writer;
        F(ck2.d);
    }

    public vf3 A() {
        if (this.f0 != null) {
            if (this.g0) {
                j0();
            } else {
                this.f0 = null;
                return this;
            }
        }
        e();
        this.A.write("null");
        return this;
    }

    public final int D() {
        int i = this.L;
        if (i != 0) {
            return this.B[i - 1];
        }
        i.m("JsonWriter is closed.");
        return 0;
    }

    public final void F(ck2 ck2Var) {
        boolean z;
        Objects.requireNonNull(ck2Var);
        this.R = ck2Var;
        this.Y = ",";
        if (ck2Var.c) {
            this.X = ": ";
            if (ck2Var.a.isEmpty()) {
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

    public final void J(ls6 ls6Var) {
        Objects.requireNonNull(ls6Var);
        this.d0 = ls6Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void N(String str) {
        String[] strArr;
        String str2;
        if (this.e0) {
            strArr = j0;
        } else {
            strArr = i0;
        }
        Writer writer = this.A;
        writer.write(34);
        int length = str.length();
        int i = 0;
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                str2 = strArr[charAt];
                if (str2 == null) {
                }
                if (i < i2) {
                    writer.write(str, i, i2 - i);
                }
                writer.write(str2);
                i = i2 + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i < i2) {
                }
                writer.write(str2);
                i = i2 + 1;
            }
        }
        if (i < length) {
            writer.write(str, i, length - i);
        }
        writer.write(34);
    }

    public void U(double d) {
        j0();
        if (this.d0 != ls6.LENIENT && (Double.isNaN(d) || Double.isInfinite(d))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d);
        }
        e();
        this.A.append((CharSequence) Double.toString(d));
    }

    public void X(long j) {
        j0();
        e();
        this.A.write(Long.toString(j));
    }

    public void Z(Boolean bool) {
        String str;
        if (bool == null) {
            A();
            return;
        }
        j0();
        e();
        if (bool.booleanValue()) {
            str = "true";
        } else {
            str = "false";
        }
        this.A.write(str);
    }

    public void a0(Number number) {
        if (number == null) {
            A();
            return;
        }
        j0();
        String obj = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
                if (cls != Float.class && cls != Double.class && !h0.matcher(obj).matches()) {
                    fa6.f("String created by ", cls, " is not a valid JSON number: ", obj);
                    return;
                }
            } else if (this.d0 != ls6.LENIENT) {
                i.h("Numeric values must be finite, but was ".concat(obj));
                return;
            }
        }
        e();
        this.A.append((CharSequence) obj);
    }

    public void c0(String str) {
        if (str == null) {
            A();
            return;
        }
        j0();
        e();
        N(str);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A.close();
        int i = this.L;
        if (i <= 1 && (i != 1 || this.B[i - 1] == 7)) {
            this.L = 0;
        } else {
            e41.i("Incomplete document");
        }
    }

    public final void e() {
        int D = D();
        if (D != 1) {
            Writer writer = this.A;
            if (D != 2) {
                if (D != 4) {
                    if (D != 6) {
                        if (D == 7) {
                            if (this.d0 != ls6.LENIENT) {
                                i.m("JSON must have only one top-level value.");
                                return;
                            }
                        } else {
                            i.m("Nesting problem.");
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
            x();
            return;
        }
        this.B[this.L - 1] = 2;
        x();
    }

    public void e0(boolean z) {
        String str;
        j0();
        e();
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
            i.m("JsonWriter is closed.");
        }
    }

    public void h() {
        j0();
        e();
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
        if (this.f0 != null) {
            int D = D();
            if (D == 5) {
                this.A.write(this.Y);
            } else if (D != 3) {
                i.m("Nesting problem.");
                return;
            }
            x();
            this.B[this.L - 1] = 4;
            N(this.f0);
            this.f0 = null;
        }
    }

    public void k() {
        j0();
        e();
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

    public final void n(char c, int i, int i2) {
        int D = D();
        if (D != i2 && D != i) {
            i.m("Nesting problem.");
        } else if (this.f0 == null) {
            this.L--;
            if (D == i2) {
                x();
            }
            this.A.write(c);
        } else {
            e41.z(this.f0, "Dangling name: ");
        }
    }

    public void r() {
        n(']', 1, 2);
    }

    public void u() {
        n('}', 3, 5);
    }

    public void v(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f0 == null) {
            int D = D();
            if (D != 3 && D != 5) {
                i.m("Please begin an object before writing a name.");
                return;
            } else {
                this.f0 = str;
                return;
            }
        }
        i.m("Already wrote a name, expecting a value.");
    }

    public final void x() {
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
}
