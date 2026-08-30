package ua;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n extends j {
    public final Serializable A;

    public n(Boolean bool) {
        Objects.requireNonNull(bool);
        this.A = bool;
    }

    public static boolean d(n nVar) {
        Serializable serializable = nVar.A;
        if (serializable instanceof Number) {
            Number number = (Number) serializable;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // ua.j
    public final String a() {
        Serializable serializable = this.A;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return c().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        Class<?> cls = serializable.getClass();
        throw new AssertionError("Unexpected value type: " + cls);
    }

    public final BigInteger b() {
        Serializable serializable = this.A;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (d(this)) {
            return BigInteger.valueOf(c().longValue());
        }
        String a10 = a();
        wa.i.c(a10);
        return new BigInteger(a10);
    }

    public final Number c() {
        Serializable serializable = this.A;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new wa.k((String) serializable);
        }
        m9.o.v("Primitive is neither a number nor a string");
        return null;
    }

    public final boolean equals(Object obj) {
        double parseDouble;
        double parseDouble2;
        BigDecimal i2;
        BigDecimal i10;
        if (this != obj) {
            if (obj != null && n.class == obj.getClass()) {
                n nVar = (n) obj;
                Serializable serializable = nVar.A;
                Serializable serializable2 = this.A;
                if (serializable2 == null) {
                    if (serializable == null) {
                        return true;
                    }
                    return false;
                } else if (d(this) && d(nVar)) {
                    if (!(serializable2 instanceof BigInteger) && !(serializable instanceof BigInteger)) {
                        if (c().longValue() == nVar.c().longValue()) {
                            return true;
                        }
                        return false;
                    }
                    return b().equals(nVar.b());
                } else if ((serializable2 instanceof Number) && (serializable instanceof Number)) {
                    if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
                        if (serializable2 instanceof BigDecimal) {
                            i2 = (BigDecimal) serializable2;
                        } else {
                            i2 = wa.i.i(a());
                        }
                        if (serializable instanceof BigDecimal) {
                            i10 = (BigDecimal) serializable;
                        } else {
                            i10 = wa.i.i(nVar.a());
                        }
                        if (i2.compareTo(i10) == 0) {
                            return true;
                        }
                        return false;
                    }
                    if (serializable2 instanceof Number) {
                        parseDouble = c().doubleValue();
                    } else {
                        parseDouble = Double.parseDouble(a());
                    }
                    if (serializable instanceof Number) {
                        parseDouble2 = nVar.c().doubleValue();
                    } else {
                        parseDouble2 = Double.parseDouble(nVar.a());
                    }
                    if (parseDouble != parseDouble2) {
                        if (Double.isNaN(parseDouble) && Double.isNaN(parseDouble2)) {
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

    public final int hashCode() {
        long doubleToLongBits;
        Serializable serializable = this.A;
        if (serializable == null) {
            return 31;
        }
        if (d(this)) {
            doubleToLongBits = c().longValue();
        } else if (serializable instanceof Number) {
            doubleToLongBits = Double.doubleToLongBits(c().doubleValue());
        } else {
            return serializable.hashCode();
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public n(Number number) {
        Objects.requireNonNull(number);
        this.A = number;
    }

    public n(String str) {
        Objects.requireNonNull(str);
        this.A = str;
    }
}
