package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s31  reason: default package */
/* loaded from: classes.dex */
public final class s31 {
    private static final /* synthetic */ e12 $ENTRIES;
    private static final /* synthetic */ s31[] $VALUES;
    public static final s31 DEFAULT = new s31("DEFAULT", 0);
    public static final s31 LAZY = new s31("LAZY", 1);
    public static final s31 ATOMIC = new s31("ATOMIC", 2);
    public static final s31 UNDISPATCHED = new s31("UNDISPATCHED", 3);

    private static final /* synthetic */ s31[] $values() {
        return new s31[]{DEFAULT, LAZY, ATOMIC, UNDISPATCHED};
    }

    static {
        s31[] $values = $values();
        $VALUES = $values;
        $ENTRIES = l.C($values);
    }

    private s31(String str, int i) {
    }

    public static e12 getEntries() {
        return $ENTRIES;
    }

    public static s31 valueOf(String str) {
        return (s31) Enum.valueOf(s31.class, str);
    }

    public static s31[] values() {
        return (s31[]) $VALUES.clone();
    }

    public final <R, T> void invoke(aj2 aj2Var, R r, j11<? super T> j11Var) {
        Object j;
        int i = r31.a[ordinal()];
        o27 o27Var = o27.a;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        i.c();
                        return;
                    }
                    return;
                }
                j11Var.getClass();
                try {
                    e31 a = j11Var.a();
                    Object c = ts6.c(a, null);
                    if (!(aj2Var instanceof m00)) {
                        j = nk2.c0(aj2Var, r, j11Var);
                    } else {
                        l07.q(2, aj2Var);
                        j = aj2Var.j(r, j11Var);
                    }
                    ts6.a(a, c);
                    if (j != p31.COROUTINE_SUSPENDED) {
                        j11Var.k(j);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    th = th;
                    return;
                }
            }
            aj2Var.getClass();
            j11Var.getClass();
            nk2.J(nk2.v(aj2Var, r, j11Var)).k(o27Var);
            return;
        }
        try {
            kg1.a(nk2.J(nk2.v(aj2Var, r, j11Var)), o27Var);
        } finally {
            th = th;
            if (th instanceof ig1) {
                th = ((ig1) th).A;
            }
            j11Var.k(me2.o(th));
        }
    }

    public final boolean isLazy() {
        if (this == LAZY) {
            return true;
        }
        return false;
    }

    public static /* synthetic */ void isLazy$annotations() {
    }
}
