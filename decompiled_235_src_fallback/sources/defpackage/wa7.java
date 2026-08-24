package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wa7  reason: default package */
/* loaded from: classes.dex */
public enum wa7 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.wa7[] $VALUES = null;
    public static final defpackage.wa7 CUSTOM_AI = null;
    public static final defpackage.va7 Companion = null;
    public static final defpackage.wa7 DEEPL = null;
    public static final defpackage.wa7 GOOGLE = null;
    public static final defpackage.wa7 LIBRE = null;
    public static final defpackage.wa7 LINGVA = null;
    public static final defpackage.wa7 MYMEMORY = null;
    public static final defpackage.wa7 OFFLINE = null;
    public static final defpackage.wa7 YANDEX = null;
    private final java.lang.String displayName;
    private final java.lang.String preferenceValue;

    private static final /* synthetic */ defpackage.wa7[] $values() {
            wa7 r0 = defpackage.wa7.OFFLINE
            wa7 r1 = defpackage.wa7.YANDEX
            wa7 r2 = defpackage.wa7.GOOGLE
            wa7 r3 = defpackage.wa7.LINGVA
            wa7 r4 = defpackage.wa7.DEEPL
            wa7 r5 = defpackage.wa7.LIBRE
            wa7 r6 = defpackage.wa7.MYMEMORY
            wa7 r7 = defpackage.wa7.CUSTOM_AI
            wa7[] r0 = new defpackage.wa7[]{r0, r1, r2, r3, r4, r5, r6, r7}
            return r0
    }

    static {
            wa7 r0 = new wa7
            java.lang.String r1 = "offline"
            java.lang.String r2 = "Автономный оффлайн-переводчик (Без интернета)"
            java.lang.String r3 = "OFFLINE"
            r4 = 0
            r0.<init>(r3, r4, r1, r2)
            defpackage.wa7.OFFLINE = r0
            wa7 r0 = new wa7
            java.lang.String r1 = "yandex"
            java.lang.String r2 = "Яндекс Переводчик (Бесплатно / Идеальный русский)"
            java.lang.String r3 = "YANDEX"
            r4 = 1
            r0.<init>(r3, r4, r1, r2)
            defpackage.wa7.YANDEX = r0
            wa7 r0 = new wa7
            java.lang.String r1 = "google"
            java.lang.String r2 = "Google Translate (Бесплатно / Высокая скорость)"
            java.lang.String r3 = "GOOGLE"
            r4 = 2
            r0.<init>(r3, r4, r1, r2)
            defpackage.wa7.GOOGLE = r0
            wa7 r0 = new wa7
            java.lang.String r1 = "lingva"
            java.lang.String r2 = "Lingva Neural (Бесплатно / Без ограничений)"
            java.lang.String r3 = "LINGVA"
            r4 = 3
            r0.<init>(r3, r4, r1, r2)
            defpackage.wa7.LINGVA = r0
            wa7 r0 = new wa7
            java.lang.String r1 = "deepl"
            java.lang.String r2 = "DeepL Neural API"
            java.lang.String r3 = "DEEPL"
            r4 = 4
            r0.<init>(r3, r4, r1, r2)
            defpackage.wa7.DEEPL = r0
            wa7 r0 = new wa7
            java.lang.String r1 = "libre"
            java.lang.String r2 = "LibreTranslate (Open-Source)"
            java.lang.String r3 = "LIBRE"
            r4 = 5
            r0.<init>(r3, r4, r1, r2)
            defpackage.wa7.LIBRE = r0
            wa7 r0 = new wa7
            java.lang.String r1 = "mymemory"
            java.lang.String r2 = "MyMemory Translated"
            java.lang.String r3 = "MYMEMORY"
            r4 = 6
            r0.<init>(r3, r4, r1, r2)
            defpackage.wa7.MYMEMORY = r0
            wa7 r0 = new wa7
            java.lang.String r1 = "custom_ai"
            java.lang.String r2 = "Custom AI (Gemini / OpenAI / Claude)"
            java.lang.String r3 = "CUSTOM_AI"
            r4 = 7
            r0.<init>(r3, r4, r1, r2)
            defpackage.wa7.CUSTOM_AI = r0
            wa7[] r0 = $values()
            defpackage.wa7.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.wa7.$ENTRIES = r0
            va7 r0 = new va7
            r0.<init>()
            defpackage.wa7.Companion = r0
            return
    }

    wa7(java.lang.String r1, int r2, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.preferenceValue = r3
            r0.displayName = r4
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.wa7.$ENTRIES
            return r0
    }

    public static defpackage.wa7 valueOf(java.lang.String r1) {
            java.lang.Class<wa7> r0 = defpackage.wa7.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            wa7 r1 = (defpackage.wa7) r1
            return r1
    }

    public static defpackage.wa7[] values() {
            wa7[] r0 = defpackage.wa7.$VALUES
            java.lang.Object r0 = r0.clone()
            wa7[] r0 = (defpackage.wa7[]) r0
            return r0
    }

    public final java.lang.String getDisplayName() {
            r0 = this;
            java.lang.String r0 = r0.displayName
            return r0
    }

    public final java.lang.String getPreferenceValue() {
            r0 = this;
            java.lang.String r0 = r0.preferenceValue
            return r0
    }
}
