package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jp4  reason: default package */
/* loaded from: classes.dex */
public enum jp4 extends java.lang.Enum implements defpackage.w93 {
    private static final /* synthetic */ defpackage.jp4[] $VALUES = null;
    public static final defpackage.jp4 CRUNCHY = null;
    public static final int CRUNCHY_VALUE = 4;
    public static final defpackage.jp4 LEGACY = null;
    public static final int LEGACY_VALUE = 2;
    public static final defpackage.jp4 RAW = null;
    public static final int RAW_VALUE = 3;
    public static final defpackage.jp4 TINK = null;
    public static final int TINK_VALUE = 1;
    public static final defpackage.jp4 UNKNOWN_PREFIX = null;
    public static final int UNKNOWN_PREFIX_VALUE = 0;
    public static final defpackage.jp4 UNRECOGNIZED = null;
    private static final defpackage.x93 internalValueMap = null;
    private final int value;

    static {
            jp4 r0 = new jp4
            java.lang.String r1 = "UNKNOWN_PREFIX"
            r2 = 0
            r0.<init>(r1, r2, r2)
            defpackage.jp4.UNKNOWN_PREFIX = r0
            jp4 r1 = new jp4
            java.lang.String r2 = "TINK"
            r3 = 1
            r1.<init>(r2, r3, r3)
            defpackage.jp4.TINK = r1
            jp4 r2 = new jp4
            java.lang.String r3 = "LEGACY"
            r4 = 2
            r2.<init>(r3, r4, r4)
            defpackage.jp4.LEGACY = r2
            jp4 r3 = new jp4
            java.lang.String r4 = "RAW"
            r5 = 3
            r3.<init>(r4, r5, r5)
            defpackage.jp4.RAW = r3
            jp4 r4 = new jp4
            java.lang.String r5 = "CRUNCHY"
            r6 = 4
            r4.<init>(r5, r6, r6)
            defpackage.jp4.CRUNCHY = r4
            jp4 r5 = new jp4
            r6 = 5
            r7 = -1
            java.lang.String r8 = "UNRECOGNIZED"
            r5.<init>(r8, r6, r7)
            defpackage.jp4.UNRECOGNIZED = r5
            jp4[] r0 = new defpackage.jp4[]{r0, r1, r2, r3, r4, r5}
            defpackage.jp4.$VALUES = r0
            w31 r0 = new w31
            r1 = 17
            r0.<init>(r1)
            defpackage.jp4.internalValueMap = r0
            return
    }

    jp4(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static defpackage.jp4 forNumber(int r1) {
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
            jp4 r1 = defpackage.jp4.CRUNCHY
            return r1
        L13:
            jp4 r1 = defpackage.jp4.RAW
            return r1
        L16:
            jp4 r1 = defpackage.jp4.LEGACY
            return r1
        L19:
            jp4 r1 = defpackage.jp4.TINK
            return r1
        L1c:
            jp4 r1 = defpackage.jp4.UNKNOWN_PREFIX
            return r1
    }

    public static defpackage.x93 internalGetValueMap() {
            x93 r0 = defpackage.jp4.internalValueMap
            return r0
    }

    public static defpackage.y93 internalGetVerifier() {
            rw2 r0 = defpackage.rw2.e
            return r0
    }

    @java.lang.Deprecated
    public static defpackage.jp4 valueOf(int r0) {
            jp4 r0 = forNumber(r0)
            return r0
    }

    public static defpackage.jp4 valueOf(java.lang.String r1) {
            java.lang.Class<jp4> r0 = defpackage.jp4.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            jp4 r1 = (defpackage.jp4) r1
            return r1
    }

    public static defpackage.jp4[] values() {
            jp4[] r0 = defpackage.jp4.$VALUES
            java.lang.Object r0 = r0.clone()
            jp4[] r0 = (defpackage.jp4[]) r0
            return r0
    }

    public final int getNumber() {
            r1 = this;
            jp4 r0 = defpackage.jp4.UNRECOGNIZED
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
