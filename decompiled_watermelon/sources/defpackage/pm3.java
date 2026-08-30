package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pm3  reason: default package */
/* loaded from: classes.dex */
public final class pm3 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ pm3[] $VALUES;
    public static final nm3 Companion;
    public static final pm3 ON_CREATE = new pm3("ON_CREATE", 0);
    public static final pm3 ON_START = new pm3("ON_START", 1);
    public static final pm3 ON_RESUME = new pm3("ON_RESUME", 2);
    public static final pm3 ON_PAUSE = new pm3("ON_PAUSE", 3);
    public static final pm3 ON_STOP = new pm3("ON_STOP", 4);
    public static final pm3 ON_DESTROY = new pm3("ON_DESTROY", 5);
    public static final pm3 ON_ANY = new pm3("ON_ANY", 6);

    private static final /* synthetic */ pm3[] $values() {
        return new pm3[]{ON_CREATE, ON_START, ON_RESUME, ON_PAUSE, ON_STOP, ON_DESTROY, ON_ANY};
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [nm3, java.lang.Object] */
    static {
        pm3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
        Companion = new Object();
    }

    private pm3(String str, int i) {
    }

    public static final pm3 downFrom(qm3 qm3Var) {
        Companion.getClass();
        return nm3.a(qm3Var);
    }

    public static final pm3 downTo(qm3 qm3Var) {
        Companion.getClass();
        qm3Var.getClass();
        int i = mm3.a[qm3Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    return null;
                }
                return ON_DESTROY;
            }
            return ON_PAUSE;
        }
        return ON_STOP;
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static final pm3 upFrom(qm3 qm3Var) {
        Companion.getClass();
        return nm3.b(qm3Var);
    }

    public static final pm3 upTo(qm3 qm3Var) {
        Companion.getClass();
        return nm3.c(qm3Var);
    }

    public static pm3 valueOf(String str) {
        return (pm3) Enum.valueOf(pm3.class, str);
    }

    public static pm3[] values() {
        return (pm3[]) $VALUES.clone();
    }

    public final qm3 getTargetState() {
        switch (om3.a[ordinal()]) {
            case 1:
            case 2:
                return qm3.CREATED;
            case 3:
            case 4:
                return qm3.STARTED;
            case 5:
                return qm3.RESUMED;
            case ig7.b /* 6 */:
                return qm3.DESTROYED;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                i.c();
                return null;
        }
    }
}
