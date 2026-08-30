package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: f35  reason: default package */
/* loaded from: classes.dex */
public final class f35 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ f35[] $VALUES;
    public static final f35 SYNC_COMPLETED = new f35("SYNC_COMPLETED", 0);
    public static final f35 SYNC_INCOMPLETE = new f35("SYNC_INCOMPLETE", 1);
    public static final f35 CONTINUE_PLAYING = new f35("CONTINUE_PLAYING", 2);
    public static final f35 DISCARD_COMPLETED = new f35("DISCARD_COMPLETED", 3);
    public static final f35 DISCARD_INCOMPLETE = new f35("DISCARD_INCOMPLETE", 4);

    private static final /* synthetic */ f35[] $values() {
        return new f35[]{SYNC_COMPLETED, SYNC_INCOMPLETE, CONTINUE_PLAYING, DISCARD_COMPLETED, DISCARD_INCOMPLETE};
    }

    static {
        f35[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private f35(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static f35 valueOf(String str) {
        return (f35) Enum.valueOf(f35.class, str);
    }

    public static f35[] values() {
        return (f35[]) $VALUES.clone();
    }
}
