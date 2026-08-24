package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p37  reason: default package */
/* loaded from: classes.dex */
public final class p37 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ p37[] $VALUES;
    public static final p37 StartInput = new p37("StartInput", 0);
    public static final p37 StopInput = new p37("StopInput", 1);
    public static final p37 ShowKeyboard = new p37("ShowKeyboard", 2);
    public static final p37 HideKeyboard = new p37("HideKeyboard", 3);

    private static final /* synthetic */ p37[] $values() {
        return new p37[]{StartInput, StopInput, ShowKeyboard, HideKeyboard};
    }

    static {
        p37[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private p37(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static p37 valueOf(String str) {
        return (p37) Enum.valueOf(p37.class, str);
    }

    public static p37[] values() {
        return (p37[]) $VALUES.clone();
    }
}
