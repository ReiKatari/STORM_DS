package defpackage;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: a71  reason: default package */
/* loaded from: classes.dex */
public final class a71 {
    private static final /* synthetic */ t52 $ENTRIES;
    private static final /* synthetic */ a71[] $VALUES;
    public static final a71 DEFAULT = new a71("DEFAULT", 0);
    public static final a71 LAZY = new a71("LAZY", 1);
    public static final a71 ATOMIC = new a71("ATOMIC", 2);
    public static final a71 UNDISPATCHED = new a71("UNDISPATCHED", 3);

    private static final /* synthetic */ a71[] $values() {
        return new a71[]{DEFAULT, LAZY, ATOMIC, UNDISPATCHED};
    }

    static {
        a71[] $values = $values();
        $VALUES = $values;
        $ENTRIES = nc1.L($values);
    }

    private a71(String str, int i) {
    }

    public static t52 getEntries() {
        return $ENTRIES;
    }

    public static a71 valueOf(String str) {
        return (a71) Enum.valueOf(a71.class, str);
    }

    public static a71[] values() {
        return (a71[]) $VALUES.clone();
    }

    public final <R, T> void invoke(eo2 eo2Var, R r, r41<? super T> r41Var) {
        Object o;
        int i = z61.a[ordinal()];
        jg7 jg7Var = jg7.a;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        i.d();
                        return;
                    }
                    return;
                }
                r41Var.getClass();
                try {
                    l61 b = r41Var.b();
                    Object c = k57.c(b, null);
                    if (!(eo2Var instanceof d20)) {
                        o = np2.k0(eo2Var, r, r41Var);
                    } else {
                        ge7.p(2, eo2Var);
                        o = eo2Var.o(r, r41Var);
                    }
                    k57.a(b, c);
                    if (o != x61.COROUTINE_SUSPENDED) {
                        r41Var.i(o);
                        return;
                    }
                    return;
                } catch (Throwable th) {
                    th = th;
                    return;
                }
            }
            eo2Var.getClass();
            r41Var.getClass();
            np2.V(np2.F(eo2Var, r, r41Var)).i(jg7Var);
            return;
        }
        try {
            ok1.a(np2.V(np2.F(eo2Var, r, r41Var)), jg7Var);
        } finally {
            th = th;
            if (th instanceof mk1) {
                th = ((mk1) th).A;
            }
            r41Var.i(oi2.p(th));
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
