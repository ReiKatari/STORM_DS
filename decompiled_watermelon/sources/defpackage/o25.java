package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o25  reason: default package */
/* loaded from: classes.dex */
public final class o25 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ o25[] $VALUES;
    public static final o25 TRANSPORT_SUSPENSION = new o25("TRANSPORT_SUSPENSION", 0);
    public static final o25 IDENTITY_VERIFICATION = new o25("IDENTITY_VERIFICATION", 1);
    public static final o25 PENDING_VERIFICATION = new o25("PENDING_VERIFICATION", 2);
    public static final o25 TERMINAL_COMMIT = new o25("TERMINAL_COMMIT", 3);
    public static final o25 NATIVE_DISCARD = new o25("NATIVE_DISCARD", 4);
    public static final o25 KOTLIN_DISCARD = new o25("KOTLIN_DISCARD", 5);
    public static final o25 RUNTIME_TERMINATION = new o25("RUNTIME_TERMINATION", 6);
    public static final o25 AUTHENTICATION_CLEAR = new o25("AUTHENTICATION_CLEAR", 7);
    public static final o25 SESSION_CLOSE = new o25("SESSION_CLOSE", 8);

    private static final /* synthetic */ o25[] $values() {
        return new o25[]{TRANSPORT_SUSPENSION, IDENTITY_VERIFICATION, PENDING_VERIFICATION, TERMINAL_COMMIT, NATIVE_DISCARD, KOTLIN_DISCARD, RUNTIME_TERMINATION, AUTHENTICATION_CLEAR, SESSION_CLOSE};
    }

    static {
        o25[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private o25(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static o25 valueOf(String str) {
        return (o25) Enum.valueOf(o25.class, str);
    }

    public static o25[] values() {
        return (o25[]) $VALUES.clone();
    }
}
