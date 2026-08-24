package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: st3  reason: default package */
/* loaded from: classes.dex */
public final class st3 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ st3[] $VALUES;
    public static final qt3 Companion;
    public static final st3 ON_CREATE = new st3("ON_CREATE", 0);
    public static final st3 ON_START = new st3("ON_START", 1);
    public static final st3 ON_RESUME = new st3("ON_RESUME", 2);
    public static final st3 ON_PAUSE = new st3("ON_PAUSE", 3);
    public static final st3 ON_STOP = new st3("ON_STOP", 4);
    public static final st3 ON_DESTROY = new st3("ON_DESTROY", 5);
    public static final st3 ON_ANY = new st3("ON_ANY", 6);

    private static final /* synthetic */ st3[] $values() {
        return new st3[]{ON_CREATE, ON_START, ON_RESUME, ON_PAUSE, ON_STOP, ON_DESTROY, ON_ANY};
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [qt3, java.lang.Object] */
    static {
        st3[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
        Companion = new Object();
    }

    private st3(String str, int i) {
    }

    public static final st3 downFrom(tt3 tt3Var) {
        Companion.getClass();
        return qt3.a(tt3Var);
    }

    public static final st3 downTo(tt3 tt3Var) {
        Companion.getClass();
        tt3Var.getClass();
        int i = pt3.a[tt3Var.ordinal()];
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

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static final st3 upFrom(tt3 tt3Var) {
        Companion.getClass();
        return qt3.b(tt3Var);
    }

    public static final st3 upTo(tt3 tt3Var) {
        Companion.getClass();
        return qt3.c(tt3Var);
    }

    public static st3 valueOf(String str) {
        return (st3) Enum.valueOf(st3.class, str);
    }

    public static st3[] values() {
        return (st3[]) $VALUES.clone();
    }

    public final tt3 getTargetState() {
        switch (rt3.a[ordinal()]) {
            case 1:
            case 2:
                return tt3.CREATED;
            case 3:
            case 4:
                return tt3.STARTED;
            case 5:
                return tt3.RESUMED;
            case 6:
                return tt3.DESTROYED;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                i.d();
                return null;
        }
    }
}
