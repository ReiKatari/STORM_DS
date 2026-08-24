package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sw2  reason: default package */
/* loaded from: classes.dex */
public enum sw2 extends java.lang.Enum implements defpackage.w93 {
    private static final /* synthetic */ defpackage.sw2[] $VALUES = null;
    public static final defpackage.sw2 SHA1 = null;
    public static final int SHA1_VALUE = 1;
    public static final defpackage.sw2 SHA256 = null;
    public static final int SHA256_VALUE = 3;
    public static final defpackage.sw2 SHA384 = null;
    public static final int SHA384_VALUE = 2;
    public static final defpackage.sw2 SHA512 = null;
    public static final int SHA512_VALUE = 4;
    public static final defpackage.sw2 UNKNOWN_HASH = null;
    public static final int UNKNOWN_HASH_VALUE = 0;
    public static final defpackage.sw2 UNRECOGNIZED = null;
    private static final defpackage.x93 internalValueMap = null;
    private final int value;

    static {
            sw2 r0 = new sw2
            java.lang.String r1 = "UNKNOWN_HASH"
            r2 = 0
            r0.<init>(r1, r2, r2)
            defpackage.sw2.UNKNOWN_HASH = r0
            sw2 r1 = new sw2
            java.lang.String r2 = "SHA1"
            r3 = 1
            r1.<init>(r2, r3, r3)
            defpackage.sw2.SHA1 = r1
            sw2 r2 = new sw2
            java.lang.String r3 = "SHA384"
            r4 = 2
            r2.<init>(r3, r4, r4)
            defpackage.sw2.SHA384 = r2
            sw2 r3 = new sw2
            java.lang.String r4 = "SHA256"
            r5 = 3
            r3.<init>(r4, r5, r5)
            defpackage.sw2.SHA256 = r3
            sw2 r4 = new sw2
            java.lang.String r5 = "SHA512"
            r6 = 4
            r4.<init>(r5, r6, r6)
            defpackage.sw2.SHA512 = r4
            sw2 r5 = new sw2
            r6 = 5
            r7 = -1
            java.lang.String r8 = "UNRECOGNIZED"
            r5.<init>(r8, r6, r7)
            defpackage.sw2.UNRECOGNIZED = r5
            sw2[] r0 = new defpackage.sw2[]{r0, r1, r2, r3, r4, r5}
            defpackage.sw2.$VALUES = r0
            jd1 r0 = new jd1
            r1 = 7
            r0.<init>(r1)
            defpackage.sw2.internalValueMap = r0
            return
    }

    sw2(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static defpackage.sw2 forNumber(int r1) {
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
            sw2 r1 = defpackage.sw2.SHA512
            return r1
        L13:
            sw2 r1 = defpackage.sw2.SHA256
            return r1
        L16:
            sw2 r1 = defpackage.sw2.SHA384
            return r1
        L19:
            sw2 r1 = defpackage.sw2.SHA1
            return r1
        L1c:
            sw2 r1 = defpackage.sw2.UNKNOWN_HASH
            return r1
    }

    public static defpackage.x93 internalGetValueMap() {
            x93 r0 = defpackage.sw2.internalValueMap
            return r0
    }

    public static defpackage.y93 internalGetVerifier() {
            rw2 r0 = defpackage.rw2.b
            return r0
    }

    @java.lang.Deprecated
    public static defpackage.sw2 valueOf(int r0) {
            sw2 r0 = forNumber(r0)
            return r0
    }

    public static defpackage.sw2 valueOf(java.lang.String r1) {
            java.lang.Class<sw2> r0 = defpackage.sw2.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            sw2 r1 = (defpackage.sw2) r1
            return r1
    }

    public static defpackage.sw2[] values() {
            sw2[] r0 = defpackage.sw2.$VALUES
            java.lang.Object r0 = r0.clone()
            sw2[] r0 = (defpackage.sw2[]) r0
            return r0
    }

    public final int getNumber() {
            r1 = this;
            sw2 r0 = defpackage.sw2.UNRECOGNIZED
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
