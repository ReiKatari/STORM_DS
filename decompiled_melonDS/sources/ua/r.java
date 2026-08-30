package ua;

import java.io.IOException;
import java.math.BigDecimal;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class r implements s {
    public static final r DOUBLE = new a("DOUBLE", 0);
    public static final r LAZILY_PARSED_NUMBER = new r("LAZILY_PARSED_NUMBER", 1) { // from class: ua.r.b
        @Override // ua.r, ua.s
        public Number readNumber(cb.a aVar) {
            return new wa.k(aVar.b0());
        }
    };
    public static final r LONG_OR_DOUBLE = new r("LONG_OR_DOUBLE", 2) { // from class: ua.r.c
        private Number parseAsDouble(String str, cb.a aVar) {
            boolean z10;
            try {
                Double valueOf = Double.valueOf(str);
                if (!valueOf.isInfinite()) {
                    if (valueOf.isNaN()) {
                    }
                    return valueOf;
                }
                if (aVar.B == q.LENIENT) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10) {
                    throw new IOException("JSON forbids NaN and infinities: " + valueOf + "; at path " + aVar.B(true));
                }
                return valueOf;
            } catch (NumberFormatException e6) {
                StringBuilder u4 = w.d.u("Cannot parse ", str, "; at path ");
                u4.append(aVar.B(true));
                throw new RuntimeException(u4.toString(), e6);
            }
        }

        @Override // ua.r, ua.s
        public Number readNumber(cb.a aVar) {
            String b02 = aVar.b0();
            if (b02.indexOf(46) >= 0) {
                return parseAsDouble(b02, aVar);
            }
            try {
                return Long.valueOf(Long.parseLong(b02));
            } catch (NumberFormatException unused) {
                return parseAsDouble(b02, aVar);
            }
        }
    };
    public static final r BIG_DECIMAL = new r("BIG_DECIMAL", 3) { // from class: ua.r.d
        @Override // ua.r, ua.s
        public BigDecimal readNumber(cb.a aVar) {
            String b02 = aVar.b0();
            try {
                return wa.i.i(b02);
            } catch (NumberFormatException e6) {
                StringBuilder u4 = w.d.u("Cannot parse ", b02, "; at path ");
                u4.append(aVar.B(true));
                throw new RuntimeException(u4.toString(), e6);
            }
        }
    };
    private static final /* synthetic */ r[] $VALUES = $values();

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* loaded from: classes.dex */
    public enum a extends r {
        public a(String str, int i2) {
            super(str, i2, null);
        }

        @Override // ua.r, ua.s
        public Double readNumber(cb.a aVar) {
            return Double.valueOf(aVar.J());
        }
    }

    private static /* synthetic */ r[] $values() {
        return new r[]{DOUBLE, LAZILY_PARSED_NUMBER, LONG_OR_DOUBLE, BIG_DECIMAL};
    }

    private r(String str, int i2) {
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) $VALUES.clone();
    }

    @Override // ua.s
    public abstract /* synthetic */ Number readNumber(cb.a aVar);

    public /* synthetic */ r(String str, int i2, a aVar) {
        this(str, i2);
    }
}
