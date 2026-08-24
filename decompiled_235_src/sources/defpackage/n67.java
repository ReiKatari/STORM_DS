package defpackage;

import java.io.IOException;
import java.math.BigDecimal;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n67  reason: default package */
/* loaded from: classes.dex */
public abstract class n67 implements o67 {
    public static final n67 DOUBLE = new a("DOUBLE", 0);
    public static final n67 LAZILY_PARSED_NUMBER = new n67("LAZILY_PARSED_NUMBER", 1) { // from class: n67.b
        @Override // defpackage.n67, defpackage.o67
        public Number readNumber(hf3 hf3Var) {
            return new fo3(hf3Var.l0());
        }
    };
    public static final n67 LONG_OR_DOUBLE = new n67("LONG_OR_DOUBLE", 2) { // from class: n67.c
        private Number parseAsDouble(String str, hf3 hf3Var) {
            boolean z;
            try {
                Double valueOf = Double.valueOf(str);
                if (!valueOf.isInfinite()) {
                    if (valueOf.isNaN()) {
                    }
                    return valueOf;
                }
                if (hf3Var.B == ls6.LENIENT) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    throw new IOException("JSON forbids NaN and infinities: " + valueOf + "; at path " + hf3Var.D());
                }
                return valueOf;
            } catch (NumberFormatException e) {
                StringBuilder t = i61.t("Cannot parse ", str, "; at path ");
                t.append(hf3Var.D());
                throw new RuntimeException(t.toString(), e);
            }
        }

        @Override // defpackage.n67, defpackage.o67
        public Number readNumber(hf3 hf3Var) {
            String l0 = hf3Var.l0();
            if (l0.indexOf(46) >= 0) {
                return parseAsDouble(l0, hf3Var);
            }
            try {
                return Long.valueOf(Long.parseLong(l0));
            } catch (NumberFormatException unused) {
                return this.parseAsDouble(l0, hf3Var);
            }
        }
    };
    public static final n67 BIG_DECIMAL = new n67("BIG_DECIMAL", 3) { // from class: n67.d
        @Override // defpackage.n67, defpackage.o67
        public BigDecimal readNumber(hf3 hf3Var) {
            String l0 = hf3Var.l0();
            try {
                return qo2.D(l0);
            } catch (NumberFormatException e) {
                StringBuilder t = i61.t("Cannot parse ", l0, "; at path ");
                t.append(hf3Var.D());
                throw new RuntimeException(t.toString(), e);
            }
        }
    };
    private static final /* synthetic */ n67[] $VALUES = $values();

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: n67$a */
    /* loaded from: classes.dex */
    public enum a extends n67 {
        public a(String str, int i) {
            super(str, i, null);
        }

        @Override // defpackage.n67, defpackage.o67
        public Double readNumber(hf3 hf3Var) {
            return Double.valueOf(hf3Var.X());
        }
    }

    private static /* synthetic */ n67[] $values() {
        return new n67[]{DOUBLE, LAZILY_PARSED_NUMBER, LONG_OR_DOUBLE, BIG_DECIMAL};
    }

    private n67(String str, int i) {
    }

    public static n67 valueOf(String str) {
        return (n67) Enum.valueOf(n67.class, str);
    }

    public static n67[] values() {
        return (n67[]) $VALUES.clone();
    }

    @Override // defpackage.o67
    public abstract /* synthetic */ Number readNumber(hf3 hf3Var);

    public /* synthetic */ n67(String str, int i, a aVar) {
        this(str, i);
    }
}
