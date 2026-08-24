package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q65  reason: default package */
/* loaded from: classes.dex */
public enum q65 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.q65[] $VALUES = null;
    public static final defpackage.q65 DEFAULT = null;
    public static final defpackage.q65 FAST_IF_RADIO_AWAKE = null;
    public static final defpackage.q65 NEVER = null;
    public static final defpackage.q65 UNMETERED_ONLY = null;
    public static final defpackage.q65 UNMETERED_OR_DAILY = null;
    public static final defpackage.q65 UNRECOGNIZED = null;
    private static final android.util.SparseArray<defpackage.q65> valueMap = null;
    private final int value;

    static {
            q65 r0 = new q65
            java.lang.String r1 = "DEFAULT"
            r6 = 0
            r0.<init>(r1, r6, r6)
            defpackage.q65.DEFAULT = r0
            q65 r1 = new q65
            java.lang.String r2 = "UNMETERED_ONLY"
            r7 = 1
            r1.<init>(r2, r7, r7)
            defpackage.q65.UNMETERED_ONLY = r1
            q65 r2 = new q65
            java.lang.String r3 = "UNMETERED_OR_DAILY"
            r8 = 2
            r2.<init>(r3, r8, r8)
            defpackage.q65.UNMETERED_OR_DAILY = r2
            q65 r3 = new q65
            java.lang.String r4 = "FAST_IF_RADIO_AWAKE"
            r9 = 3
            r3.<init>(r4, r9, r9)
            defpackage.q65.FAST_IF_RADIO_AWAKE = r3
            q65 r4 = new q65
            java.lang.String r5 = "NEVER"
            r10 = 4
            r4.<init>(r5, r10, r10)
            defpackage.q65.NEVER = r4
            q65 r5 = new q65
            java.lang.String r11 = "UNRECOGNIZED"
            r12 = 5
            r13 = -1
            r5.<init>(r11, r12, r13)
            defpackage.q65.UNRECOGNIZED = r5
            q65[] r11 = new defpackage.q65[]{r0, r1, r2, r3, r4, r5}
            defpackage.q65.$VALUES = r11
            android.util.SparseArray r11 = new android.util.SparseArray
            r11.<init>()
            defpackage.q65.valueMap = r11
            r11.put(r6, r0)
            r11.put(r7, r1)
            r11.put(r8, r2)
            r11.put(r9, r3)
            r11.put(r10, r4)
            r11.put(r13, r5)
            return
    }

    q65(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static defpackage.q65 forNumber(int r1) {
            if (r1 == 0) goto L1c
            r0 = 1
            if (r1 == r0) goto L19
            r0 = 2
            if (r1 == r0) goto L16
            r0 = 3
            if (r1 == r0) goto L13
            r0 = 4
            if (r1 == r0) goto L10
            r1 = 0
            return r1
        L10:
            q65 r1 = defpackage.q65.NEVER
            return r1
        L13:
            q65 r1 = defpackage.q65.FAST_IF_RADIO_AWAKE
            return r1
        L16:
            q65 r1 = defpackage.q65.UNMETERED_OR_DAILY
            return r1
        L19:
            q65 r1 = defpackage.q65.UNMETERED_ONLY
            return r1
        L1c:
            q65 r1 = defpackage.q65.DEFAULT
            return r1
    }

    public static defpackage.q65 valueOf(java.lang.String r1) {
            java.lang.Class<q65> r0 = defpackage.q65.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            q65 r1 = (defpackage.q65) r1
            return r1
    }

    public static defpackage.q65[] values() {
            q65[] r0 = defpackage.q65.$VALUES
            java.lang.Object r0 = r0.clone()
            q65[] r0 = (defpackage.q65[]) r0
            return r0
    }

    public final int getNumber() {
            r0 = this;
            int r0 = r0.value
            return r0
    }
}
