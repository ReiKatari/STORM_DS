package defpackage;

import java.util.concurrent.Executor;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pf1  reason: default package */
/* loaded from: classes.dex */
public final class pf1 implements Executor {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ pf1[] $VALUES;
    public static final pf1 INSTANCE = new pf1("INSTANCE", 0);

    private static final /* synthetic */ pf1[] $values() {
        return new pf1[]{INSTANCE};
    }

    static {
        pf1[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private pf1(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static pf1 valueOf(String str) {
        return (pf1) Enum.valueOf(pf1.class, str);
    }

    public static pf1[] values() {
        return (pf1[]) $VALUES.clone();
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
