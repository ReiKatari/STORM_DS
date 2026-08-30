package cb;

import a0.j;
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
import ua.q;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class c implements Closeable, Flushable {

    /* renamed from: f0  reason: collision with root package name */
    public static final Pattern f2809f0 = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");

    /* renamed from: g0  reason: collision with root package name */
    public static final String[] f2810g0 = new String[128];

    /* renamed from: h0  reason: collision with root package name */
    public static final String[] f2811h0;
    public final Writer A;
    public int[] B;
    public int L;
    public ua.c R;
    public String X;
    public String Y;
    public boolean Z;

    /* renamed from: b0  reason: collision with root package name */
    public q f2812b0;

    /* renamed from: c0  reason: collision with root package name */
    public boolean f2813c0;

    /* renamed from: d0  reason: collision with root package name */
    public String f2814d0;

    /* renamed from: e0  reason: collision with root package name */
    public boolean f2815e0;

    static {
        for (int i2 = 0; i2 <= 31; i2++) {
            f2810g0[i2] = String.format("\\u%04x", Integer.valueOf(i2));
        }
        String[] strArr = f2810g0;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        f2811h0 = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public c(Writer writer) {
        int[] iArr = new int[32];
        this.B = iArr;
        this.L = 0;
        if (iArr.length == 0) {
            this.B = Arrays.copyOf(iArr, 0);
        }
        int[] iArr2 = this.B;
        int i2 = this.L;
        this.L = i2 + 1;
        iArr2[i2] = 6;
        this.f2812b0 = q.LEGACY_STRICT;
        this.f2815e0 = true;
        Objects.requireNonNull(writer, "out == null");
        this.A = writer;
        H(ua.c.f13521d);
    }

    public final void B() {
        if (!this.Z) {
            String str = this.R.f13522a;
            Writer writer = this.A;
            writer.write(str);
            int i2 = this.L;
            for (int i10 = 1; i10 < i2; i10++) {
                writer.write(this.R.f13523b);
            }
        }
    }

    public c F() {
        if (this.f2814d0 != null) {
            if (this.f2815e0) {
                a0();
            } else {
                this.f2814d0 = null;
                return this;
            }
        }
        d();
        this.A.write("null");
        return this;
    }

    public final int G() {
        int i2 = this.L;
        if (i2 != 0) {
            return this.B[i2 - 1];
        }
        j.p("JsonWriter is closed.");
        return 0;
    }

    public final void H(ua.c cVar) {
        boolean z10;
        Objects.requireNonNull(cVar);
        this.R = cVar;
        this.Y = ",";
        if (cVar.f13524c) {
            this.X = ": ";
            if (cVar.f13522a.isEmpty()) {
                this.Y = ", ";
            }
        } else {
            this.X = ":";
        }
        if (this.R.f13522a.isEmpty() && this.R.f13523b.isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.Z = z10;
    }

    public final void I(q qVar) {
        Objects.requireNonNull(qVar);
        this.f2812b0 = qVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void J(java.lang.String r9) {
        /*
            r8 = this;
            boolean r0 = r8.f2813c0
            if (r0 == 0) goto L7
            java.lang.String[] r0 = cb.c.f2811h0
            goto L9
        L7:
            java.lang.String[] r0 = cb.c.f2810g0
        L9:
            java.io.Writer r1 = r8.A
            r2 = 34
            r1.write(r2)
            int r3 = r9.length()
            r4 = 0
            r5 = r4
        L16:
            if (r4 >= r3) goto L41
            char r6 = r9.charAt(r4)
            r7 = 128(0x80, float:1.8E-43)
            if (r6 >= r7) goto L25
            r6 = r0[r6]
            if (r6 != 0) goto L32
            goto L3e
        L25:
            r7 = 8232(0x2028, float:1.1535E-41)
            if (r6 != r7) goto L2c
            java.lang.String r6 = "\\u2028"
            goto L32
        L2c:
            r7 = 8233(0x2029, float:1.1537E-41)
            if (r6 != r7) goto L3e
            java.lang.String r6 = "\\u2029"
        L32:
            if (r5 >= r4) goto L39
            int r7 = r4 - r5
            r1.write(r9, r5, r7)
        L39:
            r1.write(r6)
            int r5 = r4 + 1
        L3e:
            int r4 = r4 + 1
            goto L16
        L41:
            if (r5 >= r3) goto L47
            int r3 = r3 - r5
            r1.write(r9, r5, r3)
        L47:
            r1.write(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: cb.c.J(java.lang.String):void");
    }

    public void K(double d4) {
        a0();
        if (this.f2812b0 != q.LENIENT && (Double.isNaN(d4) || Double.isInfinite(d4))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d4);
        }
        d();
        this.A.append((CharSequence) Double.toString(d4));
    }

    public void L(long j2) {
        a0();
        d();
        this.A.write(Long.toString(j2));
    }

    public void X(Number number) {
        if (number == null) {
            F();
            return;
        }
        a0();
        String obj = number.toString();
        Class<?> cls = number.getClass();
        if (cls != Integer.class && cls != Long.class && cls != Byte.class && cls != Short.class && cls != BigDecimal.class && cls != BigInteger.class && cls != AtomicInteger.class && cls != AtomicLong.class) {
            if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
                if (cls != Float.class && cls != Double.class && !f2809f0.matcher(obj).matches()) {
                    fj.j.s("String created by ", cls, " is not a valid JSON number: ", obj);
                    return;
                }
            } else if (this.f2812b0 != q.LENIENT) {
                j.h("Numeric values must be finite, but was ".concat(obj));
                return;
            }
        }
        d();
        this.A.append((CharSequence) obj);
    }

    public void Y(String str) {
        if (str == null) {
            F();
            return;
        }
        a0();
        d();
        J(str);
    }

    public void Z(boolean z10) {
        String str;
        a0();
        d();
        if (z10) {
            str = "true";
        } else {
            str = "false";
        }
        this.A.write(str);
    }

    public final void a0() {
        if (this.f2814d0 != null) {
            int G = G();
            if (G == 5) {
                this.A.write(this.Y);
            } else if (G != 3) {
                j.p("Nesting problem.");
                return;
            }
            B();
            this.B[this.L - 1] = 4;
            J(this.f2814d0);
            this.f2814d0 = null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.A.close();
        int i2 = this.L;
        if (i2 <= 1 && (i2 != 1 || this.B[i2 - 1] == 7)) {
            this.L = 0;
        } else {
            fj.j.h("Incomplete document");
        }
    }

    public final void d() {
        int G = G();
        if (G != 1) {
            Writer writer = this.A;
            if (G != 2) {
                if (G != 4) {
                    if (G != 6) {
                        if (G == 7) {
                            if (this.f2812b0 != q.LENIENT) {
                                j.p("JSON must have only one top-level value.");
                                return;
                            }
                        } else {
                            j.p("Nesting problem.");
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
            B();
            return;
        }
        this.B[this.L - 1] = 2;
        B();
    }

    @Override // java.io.Flushable
    public void flush() {
        if (this.L != 0) {
            this.A.flush();
        } else {
            j.p("JsonWriter is closed.");
        }
    }

    public void i() {
        a0();
        d();
        int i2 = this.L;
        int[] iArr = this.B;
        if (i2 == iArr.length) {
            this.B = Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.B;
        int i10 = this.L;
        this.L = i10 + 1;
        iArr2[i10] = 1;
        this.A.write(91);
    }

    public void m() {
        a0();
        d();
        int i2 = this.L;
        int[] iArr = this.B;
        if (i2 == iArr.length) {
            this.B = Arrays.copyOf(iArr, i2 * 2);
        }
        int[] iArr2 = this.B;
        int i10 = this.L;
        this.L = i10 + 1;
        iArr2[i10] = 3;
        this.A.write(123);
    }

    public final void t(char c4, int i2, int i10) {
        int G = G();
        if (G != i10 && G != i2) {
            j.p("Nesting problem.");
        } else if (this.f2814d0 == null) {
            this.L--;
            if (G == i10) {
                B();
            }
            this.A.write(c4);
        } else {
            j.g(this.f2814d0, "Dangling name: ");
        }
    }

    public void v() {
        t(']', 1, 2);
    }

    public void w() {
        t('}', 3, 5);
    }

    public void z(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.f2814d0 == null) {
            int G = G();
            if (G != 3 && G != 5) {
                j.p("Please begin an object before writing a name.");
                return;
            } else {
                this.f2814d0 = str;
                return;
            }
        }
        j.p("Already wrote a name, expecting a value.");
    }
}
