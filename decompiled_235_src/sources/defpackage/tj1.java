package defpackage;

import java.util.concurrent.Executor;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tj1  reason: default package */
/* loaded from: classes.dex */
public final class tj1 implements Executor {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ tj1[] $VALUES;
    public static final tj1 INSTANCE = new tj1("INSTANCE", 0);

    private static final /* synthetic */ tj1[] $values() {
        return new tj1[]{INSTANCE};
    }

    static {
        tj1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private tj1(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static tj1 valueOf(String str) {
        return (tj1) Enum.valueOf(tj1.class, str);
    }

    public static tj1[] values() {
        return (tj1[]) $VALUES.clone();
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        runnable.getClass();
        runnable.run();
    }

    @Override // java.lang.Enum
    public String toString() {
        return "DirectExecutor";
    }
}
