package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g57  reason: default package */
/* loaded from: classes.dex */
public enum g57 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.g57[] $VALUES = null;
    public static final defpackage.g57 CYBERPUNK = null;
    public static final defpackage.e57 Companion = null;
    public static final defpackage.g57 DARK = null;
    public static final defpackage.g57 GOTHIC = null;
    public static final defpackage.g57 LIGHT = null;
    public static final defpackage.g57 MATRIX = null;
    public static final defpackage.g57 MIDNIGHT = null;
    public static final defpackage.g57 SAKURA = null;
    public static final defpackage.g57 SOLAR = null;
    public static final defpackage.g57 SYSTEM = null;
    private final int nightMode;
    private final java.lang.String preferenceValue;

    private static final /* synthetic */ defpackage.g57[] $values() {
            g57 r0 = defpackage.g57.DARK
            g57 r1 = defpackage.g57.LIGHT
            g57 r2 = defpackage.g57.MIDNIGHT
            g57 r3 = defpackage.g57.CYBERPUNK
            g57 r4 = defpackage.g57.GOTHIC
            g57 r5 = defpackage.g57.MATRIX
            g57 r6 = defpackage.g57.SOLAR
            g57 r7 = defpackage.g57.SAKURA
            g57 r8 = defpackage.g57.SYSTEM
            g57[] r0 = new defpackage.g57[]{r0, r1, r2, r3, r4, r5, r6, r7, r8}
            return r0
    }

    static {
            g57 r0 = new g57
            java.lang.String r1 = "dark"
            java.lang.String r2 = "DARK"
            r3 = 0
            r4 = 2
            r0.<init>(r2, r3, r4, r1)
            defpackage.g57.DARK = r0
            g57 r0 = new g57
            java.lang.String r1 = "light"
            java.lang.String r2 = "LIGHT"
            r3 = 1
            r0.<init>(r2, r3, r3, r1)
            defpackage.g57.LIGHT = r0
            g57 r0 = new g57
            java.lang.String r1 = "MIDNIGHT"
            java.lang.String r2 = "midnight"
            r0.<init>(r1, r4, r4, r2)
            defpackage.g57.MIDNIGHT = r0
            g57 r0 = new g57
            r1 = 3
            java.lang.String r2 = "cyberpunk"
            java.lang.String r5 = "CYBERPUNK"
            r0.<init>(r5, r1, r4, r2)
            defpackage.g57.CYBERPUNK = r0
            g57 r0 = new g57
            r1 = 4
            java.lang.String r2 = "gothic"
            java.lang.String r5 = "GOTHIC"
            r0.<init>(r5, r1, r4, r2)
            defpackage.g57.GOTHIC = r0
            g57 r0 = new g57
            r1 = 5
            java.lang.String r2 = "matrix"
            java.lang.String r5 = "MATRIX"
            r0.<init>(r5, r1, r4, r2)
            defpackage.g57.MATRIX = r0
            g57 r0 = new g57
            r1 = 6
            java.lang.String r2 = "solar"
            java.lang.String r5 = "SOLAR"
            r0.<init>(r5, r1, r4, r2)
            defpackage.g57.SOLAR = r0
            g57 r0 = new g57
            r1 = 7
            java.lang.String r2 = "sakura"
            java.lang.String r4 = "SAKURA"
            r0.<init>(r4, r1, r3, r2)
            defpackage.g57.SAKURA = r0
            g57 r0 = new g57
            r1 = -1
            java.lang.String r2 = "system"
            java.lang.String r3 = "SYSTEM"
            r4 = 8
            r0.<init>(r3, r4, r1, r2)
            defpackage.g57.SYSTEM = r0
            g57[] r0 = $values()
            defpackage.g57.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.g57.$ENTRIES = r0
            e57 r0 = new e57
            r0.<init>()
            defpackage.g57.Companion = r0
            return
    }

    g57(java.lang.String r1, int r2, int r3, java.lang.String r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.nightMode = r3
            r0.preferenceValue = r4
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.g57.$ENTRIES
            return r0
    }

    public static defpackage.g57 valueOf(java.lang.String r1) {
            java.lang.Class<g57> r0 = defpackage.g57.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            g57 r1 = (defpackage.g57) r1
            return r1
    }

    public static defpackage.g57[] values() {
            g57[] r0 = defpackage.g57.$VALUES
            java.lang.Object r0 = r0.clone()
            g57[] r0 = (defpackage.g57[]) r0
            return r0
    }

    public final int getNightMode() {
            r0 = this;
            int r0 = r0.nightMode
            return r0
    }

    public final java.lang.String getPreferenceValue() {
            r0 = this;
            java.lang.String r0 = r0.preferenceValue
            return r0
    }

    public final int getThemeResId() {
            r1 = this;
            int[] r0 = defpackage.f57.a
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 2132017165(0x7f14000d, float:1.96726E38)
            switch(r1) {
                case 1: goto L30;
                case 2: goto L2c;
                case 3: goto L28;
                case 4: goto L24;
                case 5: goto L20;
                case 6: goto L1c;
                case 7: goto L18;
                case 8: goto L14;
                case 9: goto L13;
                default: goto Le;
            }
        Le:
            defpackage.i.d()
            r1 = 0
            return r1
        L13:
            return r0
        L14:
            r1 = 2132017170(0x7f140012, float:1.967261E38)
            return r1
        L18:
            r1 = 2132017171(0x7f140013, float:1.9672613E38)
            return r1
        L1c:
            r1 = 2132017168(0x7f140010, float:1.9672607E38)
            return r1
        L20:
            r1 = 2132017166(0x7f14000e, float:1.9672603E38)
            return r1
        L24:
            r1 = 2132017164(0x7f14000c, float:1.9672599E38)
            return r1
        L28:
            r1 = 2132017169(0x7f140011, float:1.9672609E38)
            return r1
        L2c:
            r1 = 2132017167(0x7f14000f, float:1.9672605E38)
            return r1
        L30:
            return r0
    }
}
