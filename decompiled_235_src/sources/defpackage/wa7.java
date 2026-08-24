package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wa7  reason: default package */
/* loaded from: classes.dex */
public final class wa7 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ wa7[] $VALUES;
    public static final va7 Companion;
    private final String displayName;
    private final String preferenceValue;
    public static final wa7 OFFLINE = new wa7("OFFLINE", 0, "offline", "Автономный оффлайн-переводчик (Без интернета)");
    public static final wa7 YANDEX = new wa7("YANDEX", 1, "yandex", "Яндекс Переводчик (Бесплатно / Идеальный русский)");
    public static final wa7 GOOGLE = new wa7("GOOGLE", 2, "google", "Google Translate (Бесплатно / Высокая скорость)");
    public static final wa7 LINGVA = new wa7("LINGVA", 3, "lingva", "Lingva Neural (Бесплатно / Без ограничений)");
    public static final wa7 DEEPL = new wa7("DEEPL", 4, "deepl", "DeepL Neural API");
    public static final wa7 LIBRE = new wa7("LIBRE", 5, "libre", "LibreTranslate (Open-Source)");
    public static final wa7 MYMEMORY = new wa7("MYMEMORY", 6, "mymemory", "MyMemory Translated");
    public static final wa7 CUSTOM_AI = new wa7("CUSTOM_AI", 7, "custom_ai", "Custom AI (Gemini / OpenAI / Claude)");

    private static final /* synthetic */ wa7[] $values() {
        return new wa7[]{OFFLINE, YANDEX, GOOGLE, LINGVA, DEEPL, LIBRE, MYMEMORY, CUSTOM_AI};
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, va7] */
    static {
        wa7[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
        Companion = new Object();
    }

    private wa7(String str, int i, String str2, String str3) {
        this.preferenceValue = str2;
        this.displayName = str3;
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static wa7 valueOf(String str) {
        return (wa7) Enum.valueOf(wa7.class, str);
    }

    public static wa7[] values() {
        return (wa7[]) $VALUES.clone();
    }

    public final String getDisplayName() {
        return this.displayName;
    }

    public final String getPreferenceValue() {
        return this.preferenceValue;
    }
}
