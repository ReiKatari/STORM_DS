package zc;
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w {
    private static final /* synthetic */ fc.a $ENTRIES;
    private static final /* synthetic */ w[] $VALUES;
    public static final w DEFAULT = new w("DEFAULT", 0);
    public static final w LAZY = new w("LAZY", 1);
    public static final w ATOMIC = new w("ATOMIC", 2);
    public static final w UNDISPATCHED = new w("UNDISPATCHED", 3);

    private static final /* synthetic */ w[] $values() {
        return new w[]{DEFAULT, LAZY, ATOMIC, UNDISPATCHED};
    }

    static {
        w[] $values = $values();
        $VALUES = $values;
        $ENTRIES = q8.r.x($values);
    }

    private w(String str, int i2) {
    }

    public static fc.a getEntries() {
        return $ENTRIES;
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) $VALUES.clone();
    }

    public final <R, T> void invoke(mc.p pVar, R r5, cc.c<? super T> cVar) {
        Object j2;
        int i2 = v.f15029a[ordinal()];
        yb.y yVar = yb.y.f14813a;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        m9.o.o();
                        return;
                    }
                    return;
                }
                cVar.getClass();
                try {
                    cc.g g10 = cVar.g();
                    Object n10 = ed.b.n(g10, null);
                    if (!(pVar instanceof ec.a)) {
                        j2 = pc.a.Q(pVar, r5, cVar);
                    } else {
                        nc.w.b(2, pVar);
                        j2 = pVar.j(r5, cVar);
                    }
                    ed.b.g(g10, n10);
                    if (j2 != dc.a.COROUTINE_SUSPENDED) {
                        cVar.h(j2);
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    return;
                }
            }
            pVar.getClass();
            cVar.getClass();
            pc.a.A(pc.a.q(pVar, r5, cVar)).h(yVar);
            return;
        }
        try {
            ed.b.h(pc.a.A(pc.a.q(pVar, r5, cVar)), yVar);
        } finally {
            th = th;
            if (th instanceof c0) {
                th = ((c0) th).A;
            }
            cVar.h(p7.j.o(th));
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
