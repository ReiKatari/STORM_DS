package ua;

import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a implements ua.b {
    public static final a IDENTITY = new C0021a("IDENTITY", 0);
    public static final a UPPER_CAMEL_CASE = new a("UPPER_CAMEL_CASE", 1) { // from class: ua.a.b
        @Override // ua.a, ua.b
        public List alternateNames(Field field) {
            return Collections.EMPTY_LIST;
        }

        @Override // ua.a, ua.b
        public String translateName(Field field) {
            return a.upperCaseFirstLetter(field.getName());
        }
    };
    public static final a UPPER_CAMEL_CASE_WITH_SPACES = new a("UPPER_CAMEL_CASE_WITH_SPACES", 2) { // from class: ua.a.c
        @Override // ua.a, ua.b
        public List alternateNames(Field field) {
            return Collections.EMPTY_LIST;
        }

        @Override // ua.a, ua.b
        public String translateName(Field field) {
            return a.upperCaseFirstLetter(a.separateCamelCase(field.getName(), ' '));
        }
    };
    public static final a UPPER_CASE_WITH_UNDERSCORES = new a("UPPER_CASE_WITH_UNDERSCORES", 3) { // from class: ua.a.d
        @Override // ua.a, ua.b
        public List alternateNames(Field field) {
            return Collections.EMPTY_LIST;
        }

        @Override // ua.a, ua.b
        public String translateName(Field field) {
            return a.separateCamelCase(field.getName(), '_').toUpperCase(Locale.ENGLISH);
        }
    };
    public static final a LOWER_CASE_WITH_UNDERSCORES = new a("LOWER_CASE_WITH_UNDERSCORES", 4) { // from class: ua.a.e
        @Override // ua.a, ua.b
        public List alternateNames(Field field) {
            return Collections.EMPTY_LIST;
        }

        @Override // ua.a, ua.b
        public String translateName(Field field) {
            return a.separateCamelCase(field.getName(), '_').toLowerCase(Locale.ENGLISH);
        }
    };
    public static final a LOWER_CASE_WITH_DASHES = new a("LOWER_CASE_WITH_DASHES", 5) { // from class: ua.a.f
        @Override // ua.a, ua.b
        public List alternateNames(Field field) {
            return Collections.EMPTY_LIST;
        }

        @Override // ua.a, ua.b
        public String translateName(Field field) {
            return a.separateCamelCase(field.getName(), '-').toLowerCase(Locale.ENGLISH);
        }
    };
    public static final a LOWER_CASE_WITH_DOTS = new a("LOWER_CASE_WITH_DOTS", 6) { // from class: ua.a.g
        @Override // ua.a, ua.b
        public List alternateNames(Field field) {
            return Collections.EMPTY_LIST;
        }

        @Override // ua.a, ua.b
        public String translateName(Field field) {
            return a.separateCamelCase(field.getName(), '.').toLowerCase(Locale.ENGLISH);
        }
    };
    private static final /* synthetic */ a[] $VALUES = $values();

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* renamed from: ua.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public enum C0021a extends a {
        public C0021a(String str, int i2) {
            super(str, i2, null);
        }

        @Override // ua.a, ua.b
        public List alternateNames(Field field) {
            return Collections.EMPTY_LIST;
        }

        @Override // ua.a, ua.b
        public String translateName(Field field) {
            return field.getName();
        }
    }

    private static /* synthetic */ a[] $values() {
        return new a[]{IDENTITY, UPPER_CAMEL_CASE, UPPER_CAMEL_CASE_WITH_SPACES, UPPER_CASE_WITH_UNDERSCORES, LOWER_CASE_WITH_UNDERSCORES, LOWER_CASE_WITH_DASHES, LOWER_CASE_WITH_DOTS};
    }

    private a(String str, int i2) {
    }

    public static String separateCamelCase(String str, char c4) {
        StringBuilder sb2 = new StringBuilder();
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char charAt = str.charAt(i2);
            if (Character.isUpperCase(charAt) && sb2.length() != 0) {
                sb2.append(c4);
            }
            sb2.append(charAt);
        }
        return sb2.toString();
    }

    public static String upperCaseFirstLetter(String str) {
        int length = str.length();
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            char charAt = str.charAt(i2);
            if (Character.isLetter(charAt)) {
                if (!Character.isUpperCase(charAt)) {
                    char upperCase = Character.toUpperCase(charAt);
                    if (i2 == 0) {
                        return upperCase + str.substring(1);
                    }
                    return str.substring(0, i2) + upperCase + str.substring(i2 + 1);
                }
            } else {
                i2++;
            }
        }
        return str;
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    @Override // ua.b
    public List alternateNames(Field field) {
        return Collections.EMPTY_LIST;
    }

    @Override // ua.b
    public abstract /* synthetic */ String translateName(Field field);

    public /* synthetic */ a(String str, int i2, C0021a c0021a) {
        this(str, i2);
    }
}
