package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hh3  reason: default package */
/* loaded from: classes.dex */
public enum hh3 extends java.lang.Enum implements defpackage.w93 {
    private static final /* synthetic */ defpackage.hh3[] $VALUES = null;
    public static final defpackage.hh3 DESTROYED = null;
    public static final int DESTROYED_VALUE = 3;
    public static final defpackage.hh3 DISABLED = null;
    public static final int DISABLED_VALUE = 2;
    public static final defpackage.hh3 ENABLED = null;
    public static final int ENABLED_VALUE = 1;
    public static final defpackage.hh3 UNKNOWN_STATUS = null;
    public static final int UNKNOWN_STATUS_VALUE = 0;
    public static final defpackage.hh3 UNRECOGNIZED = null;
    private static final defpackage.x93 internalValueMap = null;
    private final int value;

    static {
            hh3 r0 = new hh3
            java.lang.String r1 = "UNKNOWN_STATUS"
            r2 = 0
            r0.<init>(r1, r2, r2)
            defpackage.hh3.UNKNOWN_STATUS = r0
            hh3 r1 = new hh3
            java.lang.String r2 = "ENABLED"
            r3 = 1
            r1.<init>(r2, r3, r3)
            defpackage.hh3.ENABLED = r1
            hh3 r2 = new hh3
            java.lang.String r3 = "DISABLED"
            r4 = 2
            r2.<init>(r3, r4, r4)
            defpackage.hh3.DISABLED = r2
            hh3 r3 = new hh3
            java.lang.String r4 = "DESTROYED"
            r5 = 3
            r3.<init>(r4, r5, r5)
            defpackage.hh3.DESTROYED = r3
            hh3 r4 = new hh3
            r5 = 4
            r6 = -1
            java.lang.String r7 = "UNRECOGNIZED"
            r4.<init>(r7, r5, r6)
            defpackage.hh3.UNRECOGNIZED = r4
            hh3[] r0 = new defpackage.hh3[]{r0, r1, r2, r3, r4}
            defpackage.hh3.$VALUES = r0
            x31 r0 = new x31
            r1 = 13
            r0.<init>(r1)
            defpackage.hh3.internalValueMap = r0
            return
    }

    hh3(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static defpackage.hh3 forNumber(int r1) {
            if (r1 == 0) goto L16
            r0 = 1
            if (r1 == r0) goto L13
            r0 = 2
            if (r1 == r0) goto L10
            r0 = 3
            if (r1 == r0) goto Ld
            r1 = 0
            return r1
        Ld:
            hh3 r1 = defpackage.hh3.DESTROYED
            return r1
        L10:
            hh3 r1 = defpackage.hh3.DISABLED
            return r1
        L13:
            hh3 r1 = defpackage.hh3.ENABLED
            return r1
        L16:
            hh3 r1 = defpackage.hh3.UNKNOWN_STATUS
            return r1
    }

    public static defpackage.x93 internalGetValueMap() {
            x93 r0 = defpackage.hh3.internalValueMap
            return r0
    }

    public static defpackage.y93 internalGetVerifier() {
            rw2 r0 = defpackage.rw2.d
            return r0
    }

    @java.lang.Deprecated
    public static defpackage.hh3 valueOf(int r0) {
            hh3 r0 = forNumber(r0)
            return r0
    }

    public static defpackage.hh3 valueOf(java.lang.String r1) {
            java.lang.Class<hh3> r0 = defpackage.hh3.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            hh3 r1 = (defpackage.hh3) r1
            return r1
    }

    public static defpackage.hh3[] values() {
            hh3[] r0 = defpackage.hh3.$VALUES
            java.lang.Object r0 = r0.clone()
            hh3[] r0 = (defpackage.hh3[]) r0
            return r0
    }

    public final int getNumber() {
            r1 = this;
            hh3 r0 = defpackage.hh3.UNRECOGNIZED
            if (r1 == r0) goto L7
            int r1 = r1.value
            return r1
        L7:
            java.lang.String r1 = "Can't get the number of an unknown enum value."
            defpackage.i.h(r1)
            r1 = 0
            return r1
    }
}
