package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rl2  reason: default package */
/* loaded from: classes.dex */
public enum rl2 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.rl2[] $VALUES = null;
    public static final defpackage.rl2 DETECT_FRAGMENT_REUSE = null;
    public static final defpackage.rl2 DETECT_FRAGMENT_TAG_USAGE = null;
    public static final defpackage.rl2 DETECT_RETAIN_INSTANCE_USAGE = null;
    public static final defpackage.rl2 DETECT_SET_USER_VISIBLE_HINT = null;
    public static final defpackage.rl2 DETECT_TARGET_FRAGMENT_USAGE = null;
    public static final defpackage.rl2 DETECT_WRONG_FRAGMENT_CONTAINER = null;
    public static final defpackage.rl2 DETECT_WRONG_NESTED_HIERARCHY = null;
    public static final defpackage.rl2 PENALTY_DEATH = null;
    public static final defpackage.rl2 PENALTY_LOG = null;

    private static final /* synthetic */ defpackage.rl2[] $values() {
            rl2 r0 = defpackage.rl2.PENALTY_LOG
            rl2 r1 = defpackage.rl2.PENALTY_DEATH
            rl2 r2 = defpackage.rl2.DETECT_FRAGMENT_REUSE
            rl2 r3 = defpackage.rl2.DETECT_FRAGMENT_TAG_USAGE
            rl2 r4 = defpackage.rl2.DETECT_WRONG_NESTED_HIERARCHY
            rl2 r5 = defpackage.rl2.DETECT_RETAIN_INSTANCE_USAGE
            rl2 r6 = defpackage.rl2.DETECT_SET_USER_VISIBLE_HINT
            rl2 r7 = defpackage.rl2.DETECT_TARGET_FRAGMENT_USAGE
            rl2 r8 = defpackage.rl2.DETECT_WRONG_FRAGMENT_CONTAINER
            rl2[] r0 = new defpackage.rl2[]{r0, r1, r2, r3, r4, r5, r6, r7, r8}
            return r0
    }

    static {
            rl2 r0 = new rl2
            java.lang.String r1 = "PENALTY_LOG"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.rl2.PENALTY_LOG = r0
            rl2 r0 = new rl2
            java.lang.String r1 = "PENALTY_DEATH"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.rl2.PENALTY_DEATH = r0
            rl2 r0 = new rl2
            java.lang.String r1 = "DETECT_FRAGMENT_REUSE"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.rl2.DETECT_FRAGMENT_REUSE = r0
            rl2 r0 = new rl2
            java.lang.String r1 = "DETECT_FRAGMENT_TAG_USAGE"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.rl2.DETECT_FRAGMENT_TAG_USAGE = r0
            rl2 r0 = new rl2
            java.lang.String r1 = "DETECT_WRONG_NESTED_HIERARCHY"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.rl2.DETECT_WRONG_NESTED_HIERARCHY = r0
            rl2 r0 = new rl2
            java.lang.String r1 = "DETECT_RETAIN_INSTANCE_USAGE"
            r2 = 5
            r0.<init>(r1, r2)
            defpackage.rl2.DETECT_RETAIN_INSTANCE_USAGE = r0
            rl2 r0 = new rl2
            java.lang.String r1 = "DETECT_SET_USER_VISIBLE_HINT"
            r2 = 6
            r0.<init>(r1, r2)
            defpackage.rl2.DETECT_SET_USER_VISIBLE_HINT = r0
            rl2 r0 = new rl2
            java.lang.String r1 = "DETECT_TARGET_FRAGMENT_USAGE"
            r2 = 7
            r0.<init>(r1, r2)
            defpackage.rl2.DETECT_TARGET_FRAGMENT_USAGE = r0
            rl2 r0 = new rl2
            java.lang.String r1 = "DETECT_WRONG_FRAGMENT_CONTAINER"
            r2 = 8
            r0.<init>(r1, r2)
            defpackage.rl2.DETECT_WRONG_FRAGMENT_CONTAINER = r0
            rl2[] r0 = $values()
            defpackage.rl2.$VALUES = r0
            return
    }

    rl2(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.rl2 valueOf(java.lang.String r1) {
            java.lang.Class<rl2> r0 = defpackage.rl2.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            rl2 r1 = (defpackage.rl2) r1
            return r1
    }

    public static defpackage.rl2[] values() {
            rl2[] r0 = defpackage.rl2.$VALUES
            java.lang.Object r0 = r0.clone()
            rl2[] r0 = (defpackage.rl2[]) r0
            return r0
    }
}
