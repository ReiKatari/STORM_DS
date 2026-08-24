package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: l6  reason: default package */
/* loaded from: classes.dex */
public enum l6 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.l6[] $VALUES = null;
    public static final defpackage.l6 All = null;
    public static final defpackage.l6 Core = null;
    public static final defpackage.l6 Leaderboards = null;
    public static final defpackage.l6 Unofficial = null;
    private final int displayOrder;

    private static final /* synthetic */ defpackage.l6[] $values() {
            l6 r0 = defpackage.l6.All
            l6 r1 = defpackage.l6.Core
            l6 r2 = defpackage.l6.Leaderboards
            l6 r3 = defpackage.l6.Unofficial
            l6[] r0 = new defpackage.l6[]{r0, r1, r2, r3}
            return r0
    }

    static {
            l6 r0 = new l6
            java.lang.String r1 = "All"
            r2 = 0
            r0.<init>(r1, r2, r2)
            defpackage.l6.All = r0
            l6 r0 = new l6
            java.lang.String r1 = "Core"
            r2 = 1
            r0.<init>(r1, r2, r2)
            defpackage.l6.Core = r0
            l6 r0 = new l6
            java.lang.String r1 = "Leaderboards"
            r2 = 2
            r0.<init>(r1, r2, r2)
            defpackage.l6.Leaderboards = r0
            l6 r0 = new l6
            java.lang.String r1 = "Unofficial"
            r2 = 3
            r0.<init>(r1, r2, r2)
            defpackage.l6.Unofficial = r0
            l6[] r0 = $values()
            defpackage.l6.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.l6.$ENTRIES = r0
            return
    }

    l6(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.displayOrder = r3
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.l6.$ENTRIES
            return r0
    }

    public static defpackage.l6 valueOf(java.lang.String r1) {
            java.lang.Class<l6> r0 = defpackage.l6.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            l6 r1 = (defpackage.l6) r1
            return r1
    }

    public static defpackage.l6[] values() {
            l6[] r0 = defpackage.l6.$VALUES
            java.lang.Object r0 = r0.clone()
            l6[] r0 = (defpackage.l6[]) r0
            return r0
    }

    public final int getDisplayOrder() {
            r0 = this;
            int r0 = r0.displayOrder
            return r0
    }

    public final boolean matches(defpackage.n75 r4) {
            r3 = this;
            r4.getClass()
            int[] r0 = defpackage.k6.a
            int r3 = r3.ordinal()
            r3 = r0[r3]
            r0 = 1
            if (r3 == r0) goto L28
            r1 = 2
            r2 = 0
            if (r3 == r1) goto L22
            r1 = 3
            if (r3 == r1) goto L21
            r1 = 4
            if (r3 != r1) goto L1e
            n75 r3 = defpackage.n75.UNOFFICIAL
            if (r4 != r3) goto L1d
            return r0
        L1d:
            return r2
        L1e:
            defpackage.i.d()
        L21:
            return r2
        L22:
            n75 r3 = defpackage.n75.CORE
            if (r4 != r3) goto L27
            return r0
        L27:
            return r2
        L28:
            return r0
    }
}
