package defpackage;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: v52  reason: default package */
/* loaded from: classes.dex */
public abstract class v52 implements w52 {
    public static final v52 IDENTITY = new a("IDENTITY", 0);
    public static final v52 UPPER_CAMEL_CASE = new v52("UPPER_CAMEL_CASE", 1) { // from class: v52.b
        @Override // defpackage.v52, defpackage.w52
        public List alternateNames(Field field) {
            return Collections.EMPTY_LIST;
        }

        @Override // defpackage.v52, defpackage.w52
        public String translateName(Field field) {
            return v52.upperCaseFirstLetter(field.getName());
        }
    };
    public static final v52 UPPER_CAMEL_CASE_WITH_SPACES = new v52("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: v52.c
        @Override // defpackage.v52, defpackage.w52
        public List alternateNames(Field field) {
            return Collections.EMPTY_LIST;
        }

        @Override // defpackage.v52, defpackage.w52
        public String translateName(Field field) {
            return v52.upperCaseFirstLetter(v52.separateCamelCase(field.getName(), ' '));
        }
    };
    public static final v52 UPPER_CASE_WITH_UNDERSCORES = new v52("UPPER_CASE_WITH_UNDERSCORES", 3) { // from class: v52.d
        @Override // defpackage.v52, defpackage.w52
        public List alternateNames(Field field) {
            return Collections.EMPTY_LIST;
        }

        @Override // defpackage.v52, defpackage.w52
        public String translateName(Field field) {
            return v52.separateCamelCase(field.getName(), '_').toUpperCase(Locale.ENGLISH);
        }
    };
    public static final v52 LOWER_CASE_WITH_UNDERSCORES = new v52("LOWER_CASE_WITH_UNDERSCORES", 4) { // from class: v52.e
        @Override // defpackage.v52, defpackage.w52
        public List alternateNames(Field field) {
            return Collections.EMPTY_LIST;
        }

        @Override // defpackage.v52, defpackage.w52
        public String translateName(Field field) {
            return v52.separateCamelCase(field.getName(), '_').toLowerCase(Locale.ENGLISH);
        }
    };
    public static final v52 LOWER_CASE_WITH_DASHES = new v52("LOWER_CASE_WITH_DASHES", 5) { // from class: v52.f
        @Override // defpackage.v52, defpackage.w52
        public List alternateNames(Field field) {
            return Collections.EMPTY_LIST;
        }

        @Override // defpackage.v52, defpackage.w52
        public String translateName(Field field) {
            return v52.separateCamelCase(field.getName(), '-').toLowerCase(Locale.ENGLISH);
        }
    };
    public static final v52 LOWER_CASE_WITH_DOTS = new v52("LOWER_CASE_WITH_DOTS", 6) { // from class: v52.g
        @Override // defpackage.v52, defpackage.w52
        public List alternateNames(Field field) {
            return Collections.EMPTY_LIST;
        }

        @Override // defpackage.v52, defpackage.w52
        public String translateName(Field field) {
            return v52.separateCamelCase(field.getName(), '.').toLowerCase(Locale.ENGLISH);
        }
    };
    private static final /* synthetic */ v52[] $VALUES = $values();

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: v52$a */
    /* loaded from: classes.dex */
    public enum a extends v52 {
        public a(String str, int i) {
            super(str, i, null);
        }

        @Override // defpackage.v52, defpackage.w52
        public List alternateNames(Field field) {
            return Collections.EMPTY_LIST;
        }

        @Override // defpackage.v52, defpackage.w52
        public String translateName(Field field) {
            return field.getName();
        }
    }

    private static /* synthetic */ v52[] $values() {
        return new v52[]{IDENTITY, UPPER_CAMEL_CASE, UPPER_CAMEL_CASE_WITH_SPACES, UPPER_CASE_WITH_UNDERSCORES, LOWER_CASE_WITH_UNDERSCORES, LOWER_CASE_WITH_DASHES, LOWER_CASE_WITH_DOTS};
    }

    private v52(String str, int i) {
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

    public static v52 valueOf(String str) {
        return (v52) Enum.valueOf(v52.class, str);
    }

    public static v52[] values() {
        return (v52[]) $VALUES.clone();
    }

    @Override // defpackage.w52
    public List alternateNames(Field field) {
        return Collections.EMPTY_LIST;
    }

    @Override // defpackage.w52
    public abstract /* synthetic */ String translateName(Field field);

    public /* synthetic */ v52(String str, int i, a aVar) {
        this(str, i);
    }
}
