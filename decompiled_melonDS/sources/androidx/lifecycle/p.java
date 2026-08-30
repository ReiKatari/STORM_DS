package androidx.lifecycle;

import me.magnum.melonds.common.camera.DSiCameraSource;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ p[] $VALUES;
    public static final n Companion;
    public static final p ON_CREATE = new p("ON_CREATE", 0);
    public static final p ON_START = new p("ON_START", 1);
    public static final p ON_RESUME = new p("ON_RESUME", 2);
    public static final p ON_PAUSE = new p("ON_PAUSE", 3);
    public static final p ON_STOP = new p("ON_STOP", 4);
    public static final p ON_DESTROY = new p("ON_DESTROY", 5);
    public static final p ON_ANY = new p("ON_ANY", 6);

    private static final /* synthetic */ p[] $values() {
        return new p[]{ON_CREATE, ON_START, ON_RESUME, ON_PAUSE, ON_STOP, ON_DESTROY, ON_ANY};
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [java.lang.Object, androidx.lifecycle.n] */
    static {
        p[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
        Companion = new Object();
    }

    private p(String str, int i2) {
    }

    public static final p downFrom(q qVar) {
        Companion.getClass();
        return n.a(qVar);
    }

    public static final p downTo(q qVar) {
        Companion.getClass();
        qVar.getClass();
        int i2 = m.f1477a[qVar.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 4) {
                    return null;
                }
                return ON_DESTROY;
            }
            return ON_PAUSE;
        }
        return ON_STOP;
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static final p upFrom(q qVar) {
        Companion.getClass();
        return n.b(qVar);
    }

    public static final p upTo(q qVar) {
        Companion.getClass();
        return n.c(qVar);
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) $VALUES.clone();
    }

    public final q getTargetState() {
        switch (o.f1478a[ordinal()]) {
            case DSiCameraSource.FrontCamera /* 1 */:
            case 2:
                return q.CREATED;
            case 3:
            case 4:
                return q.STARTED;
            case l1.c.f8511g /* 5 */:
                return q.RESUMED;
            case l1.c.f8509e /* 6 */:
                return q.DESTROYED;
            case 7:
                throw new IllegalArgumentException(this + " has no target state");
            default:
                m9.o.o();
                return null;
        }
    }
}
