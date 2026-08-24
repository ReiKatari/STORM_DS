package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yb5  reason: default package */
/* loaded from: classes.dex */
public final class yb5 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ yb5[] $VALUES;
    public static final yb5 TRANSPORT_SUSPENSION = new yb5("TRANSPORT_SUSPENSION", 0);
    public static final yb5 IDENTITY_VERIFICATION = new yb5("IDENTITY_VERIFICATION", 1);
    public static final yb5 PENDING_VERIFICATION = new yb5("PENDING_VERIFICATION", 2);
    public static final yb5 TERMINAL_COMMIT = new yb5("TERMINAL_COMMIT", 3);
    public static final yb5 NATIVE_DISCARD = new yb5("NATIVE_DISCARD", 4);
    public static final yb5 KOTLIN_DISCARD = new yb5("KOTLIN_DISCARD", 5);
    public static final yb5 RUNTIME_TERMINATION = new yb5("RUNTIME_TERMINATION", 6);
    public static final yb5 AUTHENTICATION_CLEAR = new yb5("AUTHENTICATION_CLEAR", 7);
    public static final yb5 SESSION_CLOSE = new yb5("SESSION_CLOSE", 8);

    private static final /* synthetic */ yb5[] $values() {
        return new yb5[]{TRANSPORT_SUSPENSION, IDENTITY_VERIFICATION, PENDING_VERIFICATION, TERMINAL_COMMIT, NATIVE_DISCARD, KOTLIN_DISCARD, RUNTIME_TERMINATION, AUTHENTICATION_CLEAR, SESSION_CLOSE};
    }

    static {
        yb5[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private yb5(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static yb5 valueOf(String str) {
        return (yb5) Enum.valueOf(yb5.class, str);
    }

    public static yb5[] values() {
        return (yb5[]) $VALUES.clone();
    }
}
