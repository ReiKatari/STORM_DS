package defpackage;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pa2  reason: default package */
/* loaded from: classes.dex */
public abstract class pa2 implements qa2 {
    public static final pa2 IDENTITY = new a("IDENTITY", 0);
    public static final pa2 UPPER_CAMEL_CASE = new pa2("UPPER_CAMEL_CASE", 1) { // from class: pa2.b
        @Override // defpackage.pa2, defpackage.qa2
        public List alternateNames(Field field) {
            return Collections.EMPTY_LIST;
        }

        @Override // defpackage.pa2, defpackage.qa2
        public String translateName(Field field) {
            return pa2.upperCaseFirstLetter(field.getName());
        }
    };
    public static final pa2 UPPER_CAMEL_CASE_WITH_SPACES = new pa2("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: pa2.c
        @Override // defpackage.pa2, defpackage.qa2
        public List alternateNames(Field field) {
            return Collections.EMPTY_LIST;
        }

        @Override // defpackage.pa2, defpackage.qa2
        public String translateName(Field field) {
            return pa2.upperCaseFirstLetter(pa2.separateCamelCase(field.getName(), ' '));
        }
    };
    public static final pa2 UPPER_CASE_WITH_UNDERSCORES = new pa2("UPPER_CASE_WITH_UNDERSCORES", 3) { // from class: pa2.d
        @Override // defpackage.pa2, defpackage.qa2
        public List alternateNames(Field field) {
            return Collections.EMPTY_LIST;
        }

        @Override // defpackage.pa2, defpackage.qa2
        public String translateName(Field field) {
            return pa2.separateCamelCase(field.getName(), '_').toUpperCase(Locale.ENGLISH);
        }
    };
    public static final pa2 LOWER_CASE_WITH_UNDERSCORES = new pa2("LOWER_CASE_WITH_UNDERSCORES", 4) { // from class: pa2.e
        @Override // defpackage.pa2, defpackage.qa2
        public List alternateNames(Field field) {
            return Collections.EMPTY_LIST;
        }

        @Override // defpackage.pa2, defpackage.qa2
        public String translateName(Field field) {
            return pa2.separateCamelCase(field.getName(), '_').toLowerCase(Locale.ENGLISH);
        }
    };
    public static final pa2 LOWER_CASE_WITH_DASHES = new pa2("LOWER_CASE_WITH_DASHES", 5) { // from class: pa2.f
        @Override // defpackage.pa2, defpackage.qa2
        public List alternateNames(Field field) {
            return Collections.EMPTY_LIST;
        }

        @Override // defpackage.pa2, defpackage.qa2
        public String translateName(Field field) {
            return pa2.separateCamelCase(field.getName(), '-').toLowerCase(Locale.ENGLISH);
        }
    };
    public static final pa2 LOWER_CASE_WITH_DOTS = new pa2("LOWER_CASE_WITH_DOTS", 6) { // from class: pa2.g
        @Override // defpackage.pa2, defpackage.qa2
        public List alternateNames(Field field) {
            return Collections.EMPTY_LIST;
        }

        @Override // defpackage.pa2, defpackage.qa2
        public String translateName(Field field) {
            return pa2.separateCamelCase(field.getName(), '.').toLowerCase(Locale.ENGLISH);
        }
    };
    private static final /* synthetic */ pa2[] $VALUES = $values();

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: pa2$a */
    /* loaded from: classes.dex */
    public enum a extends pa2 {
        public a(String str, int i) {
            super(str, i, null);
        }

        @Override // defpackage.pa2, defpackage.qa2
        public List alternateNames(Field field) {
            return Collections.EMPTY_LIST;
        }

        @Override // defpackage.pa2, defpackage.qa2
        public String translateName(Field field) {
            return field.getName();
        }
    }

    private static /* synthetic */ pa2[] $values() {
        return new pa2[]{IDENTITY, UPPER_CAMEL_CASE, UPPER_CAMEL_CASE_WITH_SPACES, UPPER_CASE_WITH_UNDERSCORES, LOWER_CASE_WITH_UNDERSCORES, LOWER_CASE_WITH_DASHES, LOWER_CASE_WITH_DOTS};
    }

    private pa2(String str, int i) {
    }

    public static String separateCamelCase(String str, char c2) {
        StringBuilder sb = new StringBuilder();
        int length = str.length();
        for (int i = 0; i < length; i++) {
            char charAt = str.charAt(i);
            if (Character.isUpperCase(charAt) && sb.length() != 0) {
                sb.append(c2);
            }
            sb.append(charAt);
        }
        return sb.toString();
    }

    public static String upperCaseFirstLetter(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            char charAt = str.charAt(i);
            if (Character.isLetter(charAt)) {
                if (!Character.isUpperCase(charAt)) {
                    char upperCase = Character.toUpperCase(charAt);
                    if (i == 0) {
                        return upperCase + str.substring(1);
                    }
                    return str.substring(0, i) + upperCase + str.substring(i + 1);
                }
            } else {
                i++;
            }
        }
        return str;
    }

    public static pa2 valueOf(String str) {
        return (pa2) Enum.valueOf(pa2.class, str);
    }

    public static pa2[] values() {
        return (pa2[]) $VALUES.clone();
    }

    @Override // defpackage.qa2
    public List alternateNames(Field field) {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.qa2
    public abstract /* synthetic */ String translateName(Field field);

    public /* synthetic */ pa2(String str, int i, a aVar) {
        this(str, i);
    }
}
