package defpackage;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ef3  reason: default package */
/* loaded from: classes.dex */
public final class ef3 extends ee3 {
    public final Serializable A;

    public ef3(Boolean bool) {
        Objects.requireNonNull(bool);
        this.A = bool;
    }

    public static boolean h(ef3 ef3Var) {
        Serializable serializable = ef3Var.A;
        if (serializable instanceof Number) {
            Number number = (Number) serializable;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.ee3
    public final int a() {
        if (this.A instanceof Number) {
            return g().intValue();
        }
        return Integer.parseInt(c());
    }

    @Override // defpackage.ee3
    public final String c() {
        Serializable serializable = this.A;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return g().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        Class<?> cls = serializable.getClass();
        throw new AssertionError("Unexpected value type: " + cls);
    }

    public final BigInteger d() {
        Serializable serializable = this.A;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (h(this)) {
            return BigInteger.valueOf(g().longValue());
        }
        String c = c();
        qo2.n(c);
        return new BigInteger(c);
    }

    public final boolean equals(Object obj) {
        BigDecimal D;
        BigDecimal D2;
        if (this != obj) {
            if (obj != null && ef3.class == obj.getClass()) {
                ef3 ef3Var = (ef3) obj;
                Serializable serializable = ef3Var.A;
                Serializable serializable2 = this.A;
                if (serializable2 == null) {
                    if (serializable == null) {
                        return true;
                    }
                    return false;
                } else if (h(this) && h(ef3Var)) {
                    if (!(serializable2 instanceof BigInteger) && !(serializable instanceof BigInteger)) {
                        if (g().longValue() == ef3Var.g().longValue()) {
                            return true;
                        }
                        return false;
                    }
                    return d().equals(ef3Var.d());
                } else if ((serializable2 instanceof Number) && (serializable instanceof Number)) {
                    if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
                        if (serializable2 instanceof BigDecimal) {
                            D = (BigDecimal) serializable2;
                        } else {
                            D = qo2.D(c());
                        }
                        if (serializable instanceof BigDecimal) {
                            D2 = (BigDecimal) serializable;
                        } else {
                            D2 = qo2.D(ef3Var.c());
                        }
                        if (D.compareTo(D2) == 0) {
                            return true;
                        }
                        return false;
                    }
                    double f = f();
                    double f2 = ef3Var.f();
                    if (f != f2) {
                        if (Double.isNaN(f) && Double.isNaN(f2)) {
                            return true;
                        }
                        return false;
                    }
                    return true;
                } else {
                    return serializable2.equals(serializable);
                }
            }
            return false;
        }
        return true;
    }

    public final double f() {
        if (this.A instanceof Number) {
            return g().doubleValue();
        }
        return Double.parseDouble(c());
    }

    public final Number g() {
        Serializable serializable = this.A;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new fo3((String) serializable);
        }
        fa6.h("Primitive is neither a number nor a string");
        return null;
    }

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.A;
        if (serializable == null) {
            return 31;
        }
        if (h(this)) {
            doubleToLongBits = g().longValue();
        } else if (serializable instanceof Number) {
            doubleToLongBits = Double.doubleToLongBits(g().doubleValue());
        } else {
            return serializable.hashCode();
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public ef3(Number number) {
        Objects.requireNonNull(number);
        this.A = number;
    }

    public ef3(String str) {
        Objects.requireNonNull(str);
        this.A = str;
    }
}
