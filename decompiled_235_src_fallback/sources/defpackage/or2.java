package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: or2  reason: default package */
/* loaded from: classes.dex */
public enum or2 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.or2[] $VALUES = null;
    public static final defpackage.or2 BUILD_MESSAGE_INFO = null;
    public static final defpackage.or2 GET_DEFAULT_INSTANCE = null;
    public static final defpackage.or2 GET_MEMOIZED_IS_INITIALIZED = null;
    public static final defpackage.or2 GET_PARSER = null;
    public static final defpackage.or2 NEW_BUILDER = null;
    public static final defpackage.or2 NEW_MUTABLE_INSTANCE = null;
    public static final defpackage.or2 SET_MEMOIZED_IS_INITIALIZED = null;

    static {
            or2 r0 = new or2
            java.lang.String r1 = "GET_MEMOIZED_IS_INITIALIZED"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.or2.GET_MEMOIZED_IS_INITIALIZED = r0
            or2 r1 = new or2
            java.lang.String r2 = "SET_MEMOIZED_IS_INITIALIZED"
            r3 = 1
            r1.<init>(r2, r3)
            defpackage.or2.SET_MEMOIZED_IS_INITIALIZED = r1
            or2 r2 = new or2
            java.lang.String r3 = "BUILD_MESSAGE_INFO"
            r4 = 2
            r2.<init>(r3, r4)
            defpackage.or2.BUILD_MESSAGE_INFO = r2
            or2 r3 = new or2
            java.lang.String r4 = "NEW_MUTABLE_INSTANCE"
            r5 = 3
            r3.<init>(r4, r5)
            defpackage.or2.NEW_MUTABLE_INSTANCE = r3
            or2 r4 = new or2
            java.lang.String r5 = "NEW_BUILDER"
            r6 = 4
            r4.<init>(r5, r6)
            defpackage.or2.NEW_BUILDER = r4
            or2 r5 = new or2
            java.lang.String r6 = "GET_DEFAULT_INSTANCE"
            r7 = 5
            r5.<init>(r6, r7)
            defpackage.or2.GET_DEFAULT_INSTANCE = r5
            or2 r6 = new or2
            java.lang.String r7 = "GET_PARSER"
            r8 = 6
            r6.<init>(r7, r8)
            defpackage.or2.GET_PARSER = r6
            or2[] r0 = new defpackage.or2[]{r0, r1, r2, r3, r4, r5, r6}
            defpackage.or2.$VALUES = r0
            return
    }

    or2(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.or2 valueOf(java.lang.String r1) {
            java.lang.Class<or2> r0 = defpackage.or2.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            or2 r1 = (defpackage.or2) r1
            return r1
    }

    public static defpackage.or2[] values() {
            or2[] r0 = defpackage.or2.$VALUES
            java.lang.Object r0 = r0.clone()
            or2[] r0 = (defpackage.or2[]) r0
            return r0
    }
}
