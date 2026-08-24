package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ug3  reason: default package */
/* loaded from: classes.dex */
public enum ug3 extends java.lang.Enum implements defpackage.w93 {
    private static final /* synthetic */ defpackage.ug3[] $VALUES = null;
    public static final defpackage.ug3 ASYMMETRIC_PRIVATE = null;
    public static final int ASYMMETRIC_PRIVATE_VALUE = 2;
    public static final defpackage.ug3 ASYMMETRIC_PUBLIC = null;
    public static final int ASYMMETRIC_PUBLIC_VALUE = 3;
    public static final defpackage.ug3 REMOTE = null;
    public static final int REMOTE_VALUE = 4;
    public static final defpackage.ug3 SYMMETRIC = null;
    public static final int SYMMETRIC_VALUE = 1;
    public static final defpackage.ug3 UNKNOWN_KEYMATERIAL = null;
    public static final int UNKNOWN_KEYMATERIAL_VALUE = 0;
    public static final defpackage.ug3 UNRECOGNIZED = null;
    private static final defpackage.x93 internalValueMap = null;
    private final int value;

    static {
            ug3 r0 = new ug3
            java.lang.String r1 = "UNKNOWN_KEYMATERIAL"
            r2 = 0
            r0.<init>(r1, r2, r2)
            defpackage.ug3.UNKNOWN_KEYMATERIAL = r0
            ug3 r1 = new ug3
            java.lang.String r2 = "SYMMETRIC"
            r3 = 1
            r1.<init>(r2, r3, r3)
            defpackage.ug3.SYMMETRIC = r1
            ug3 r2 = new ug3
            java.lang.String r3 = "ASYMMETRIC_PRIVATE"
            r4 = 2
            r2.<init>(r3, r4, r4)
            defpackage.ug3.ASYMMETRIC_PRIVATE = r2
            ug3 r3 = new ug3
            java.lang.String r4 = "ASYMMETRIC_PUBLIC"
            r5 = 3
            r3.<init>(r4, r5, r5)
            defpackage.ug3.ASYMMETRIC_PUBLIC = r3
            ug3 r4 = new ug3
            java.lang.String r5 = "REMOTE"
            r6 = 4
            r4.<init>(r5, r6, r6)
            defpackage.ug3.REMOTE = r4
            ug3 r5 = new ug3
            r6 = 5
            r7 = -1
            java.lang.String r8 = "UNRECOGNIZED"
            r5.<init>(r8, r6, r7)
            defpackage.ug3.UNRECOGNIZED = r5
            ug3[] r0 = new defpackage.ug3[]{r0, r1, r2, r3, r4, r5}
            defpackage.ug3.$VALUES = r0
            q61 r0 = new q61
            r0.<init>()
            defpackage.ug3.internalValueMap = r0
            return
    }

    ug3(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.value = r3
            return
    }

    public static defpackage.ug3 forNumber(int r1) {
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
            ug3 r1 = defpackage.ug3.REMOTE
            return r1
        L13:
            ug3 r1 = defpackage.ug3.ASYMMETRIC_PUBLIC
            return r1
        L16:
            ug3 r1 = defpackage.ug3.ASYMMETRIC_PRIVATE
            return r1
        L19:
            ug3 r1 = defpackage.ug3.SYMMETRIC
            return r1
        L1c:
            ug3 r1 = defpackage.ug3.UNKNOWN_KEYMATERIAL
            return r1
    }

    public static defpackage.x93 internalGetValueMap() {
            x93 r0 = defpackage.ug3.internalValueMap
            return r0
    }

    public static defpackage.y93 internalGetVerifier() {
            rw2 r0 = defpackage.rw2.c
            return r0
    }

    @java.lang.Deprecated
    public static defpackage.ug3 valueOf(int r0) {
            ug3 r0 = forNumber(r0)
            return r0
    }

    public static defpackage.ug3 valueOf(java.lang.String r1) {
            java.lang.Class<ug3> r0 = defpackage.ug3.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ug3 r1 = (defpackage.ug3) r1
            return r1
    }

    public static defpackage.ug3[] values() {
            ug3[] r0 = defpackage.ug3.$VALUES
            java.lang.Object r0 = r0.clone()
            ug3[] r0 = (defpackage.ug3[]) r0
            return r0
    }

    public final int getNumber() {
            r1 = this;
            ug3 r0 = defpackage.ug3.UNRECOGNIZED
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
