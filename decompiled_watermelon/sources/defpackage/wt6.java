package defpackage;

import java.io.IOException;
import java.math.BigDecimal;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wt6  reason: default package */
/* loaded from: classes.dex */
public abstract class wt6 implements xt6 {
    public static final wt6 DOUBLE = new a("DOUBLE", 0);
    public static final wt6 LAZILY_PARSED_NUMBER = new wt6("LAZILY_PARSED_NUMBER", 1) { // from class: wt6.b
        @Override // defpackage.wt6, defpackage.xt6
        public Number readNumber(o83 o83Var) {
            return new fh3(o83Var.l0());
        }
    };
    public static final wt6 LONG_OR_DOUBLE = new wt6("LONG_OR_DOUBLE", 2) { // from class: wt6.c
        private Number parseAsDouble(String str, o83 o83Var) {
            boolean z;
            try {
                Double valueOf = Double.valueOf(str);
                if (!valueOf.isInfinite()) {
                    if (valueOf.isNaN()) {
                    }
                    return valueOf;
                }
                if (o83Var.B == ug6.LENIENT) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    throw new IOException("JSON forbids NaN and infinities: " + valueOf + "; at path " + o83Var.I());
                }
                return valueOf;
            } catch (NumberFormatException e) {
                StringBuilder u = b31.u("Cannot parse ", str, "; at path ");
                u.append(o83Var.I());
                throw new RuntimeException(u.toString(), e);
            }
        }

        @Override // defpackage.wt6, defpackage.xt6
        public Number readNumber(o83 o83Var) {
            String l0 = o83Var.l0();
            if (l0.indexOf(46) >= 0) {
                return parseAsDouble(l0, o83Var);
            }
            try {
                return Long.valueOf(Long.parseLong(l0));
            } catch (NumberFormatException unused) {
                return this.parseAsDouble(l0, o83Var);
            }
        }
    };
    public static final wt6 BIG_DECIMAL = new wt6("BIG_DECIMAL", 3) { // from class: wt6.d
        @Override // defpackage.wt6, defpackage.xt6
        public BigDecimal readNumber(o83 o83Var) {
            String l0 = o83Var.l0();
            try {
                return hk2.J(l0);
            } catch (NumberFormatException e) {
                StringBuilder u = b31.u("Cannot parse ", l0, "; at path ");
                u.append(o83Var.I());
                throw new RuntimeException(u.toString(), e);
            }
        }
    };
    private static final /* synthetic */ wt6[] $VALUES = $values();

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: wt6$a */
    /* loaded from: classes.dex */
    public enum a extends wt6 {
        public a(String str, int i) {
            super(str, i, null);
        }

        @Override // defpackage.wt6, defpackage.xt6
        public Double readNumber(o83 o83Var) {
            return Double.valueOf(o83Var.R());
        }
    }

    private static /* synthetic */ wt6[] $values() {
        return new wt6[]{DOUBLE, LAZILY_PARSED_NUMBER, LONG_OR_DOUBLE, BIG_DECIMAL};
    }

    private wt6(String str, int i) {
    }

    public static wt6 valueOf(String str) {
        return (wt6) Enum.valueOf(wt6.class, str);
    }

    public static wt6[] values() {
        return (wt6[]) $VALUES.clone();
    }

    @Override // defpackage.xt6
    public abstract /* synthetic */ Number readNumber(o83 o83Var);

    public /* synthetic */ wt6(String str, int i, a aVar) {
        this(str, i);
    }
}
