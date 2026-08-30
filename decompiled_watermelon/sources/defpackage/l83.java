package defpackage;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l83  reason: default package */
/* loaded from: classes.dex */
public final class l83 extends l73 {
    public final Serializable A;

    public l83(Boolean bool) {
        Objects.requireNonNull(bool);
        this.A = bool;
    }

    public static boolean l(l83 l83Var) {
        Serializable serializable = l83Var.A;
        if (serializable instanceof Number) {
            Number number = (Number) serializable;
            if ((number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // defpackage.l73
    public final int b() {
        if (this.A instanceof Number) {
            return k().intValue();
        }
        return Integer.parseInt(d());
    }

    @Override // defpackage.l73
    public final String d() {
        Serializable serializable = this.A;
        if (serializable instanceof String) {
            return (String) serializable;
        }
        if (serializable instanceof Number) {
            return k().toString();
        }
        if (serializable instanceof Boolean) {
            return ((Boolean) serializable).toString();
        }
        Class<?> cls = serializable.getClass();
        throw new AssertionError("Unexpected value type: " + cls);
    }

    public final boolean equals(Object obj) {
        BigDecimal J;
        BigDecimal J2;
        if (this != obj) {
            if (obj != null && l83.class == obj.getClass()) {
                l83 l83Var = (l83) obj;
                Serializable serializable = l83Var.A;
                Serializable serializable2 = this.A;
                if (serializable2 == null) {
                    if (serializable == null) {
                        return true;
                    }
                    return false;
                } else if (l(this) && l(l83Var)) {
                    if (!(serializable2 instanceof BigInteger) && !(serializable instanceof BigInteger)) {
                        if (k().longValue() == l83Var.k().longValue()) {
                            return true;
                        }
                        return false;
                    }
                    return i().equals(l83Var.i());
                } else if ((serializable2 instanceof Number) && (serializable instanceof Number)) {
                    if ((serializable2 instanceof BigDecimal) && (serializable instanceof BigDecimal)) {
                        if (serializable2 instanceof BigDecimal) {
                            J = (BigDecimal) serializable2;
                        } else {
                            J = hk2.J(d());
                        }
                        if (serializable instanceof BigDecimal) {
                            J2 = (BigDecimal) serializable;
                        } else {
                            J2 = hk2.J(l83Var.d());
                        }
                        if (J.compareTo(J2) == 0) {
                            return true;
                        }
                        return false;
                    }
                    double j = j();
                    double j2 = l83Var.j();
                    if (j != j2) {
                        if (Double.isNaN(j) && Double.isNaN(j2)) {
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
        if (l(this)) {
            doubleToLongBits = k().longValue();
        } else if (serializable instanceof Number) {
            doubleToLongBits = Double.doubleToLongBits(k().doubleValue());
        } else {
            return serializable.hashCode();
        }
        return (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
    }

    public final BigInteger i() {
        Serializable serializable = this.A;
        if (serializable instanceof BigInteger) {
            return (BigInteger) serializable;
        }
        if (l(this)) {
            return BigInteger.valueOf(k().longValue());
        }
        String d = d();
        hk2.f(d);
        return new BigInteger(d);
    }

    public final double j() {
        if (this.A instanceof Number) {
            return k().doubleValue();
        }
        return Double.parseDouble(d());
    }

    public final Number k() {
        Serializable serializable = this.A;
        if (serializable instanceof Number) {
            return (Number) serializable;
        }
        if (serializable instanceof String) {
            return new fh3((String) serializable);
        }
        vd6.i("Primitive is neither a number nor a string");
        return null;
    }

    public l83(Number number) {
        Objects.requireNonNull(number);
        this.A = number;
    }

    public l83(String str) {
        Objects.requireNonNull(str);
        this.A = str;
    }
}
