package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pc3  reason: default package */
/* loaded from: classes.dex */
public enum pc3 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.pc3[] $VALUES = null;
    public static final defpackage.pc3 BOOLEAN = null;
    public static final defpackage.pc3 BYTE_STRING = null;
    public static final defpackage.pc3 DOUBLE = null;
    public static final defpackage.pc3 ENUM = null;
    public static final defpackage.pc3 FLOAT = null;
    public static final defpackage.pc3 INT = null;
    public static final defpackage.pc3 LONG = null;
    public static final defpackage.pc3 MESSAGE = null;
    public static final defpackage.pc3 STRING = null;
    public static final defpackage.pc3 VOID = null;
    private final java.lang.Class<?> boxedType;
    private final java.lang.Object defaultDefault;
    private final java.lang.Class<?> type;

    static {
            pc3 r0 = new pc3
            java.lang.Class<java.lang.Void> r4 = java.lang.Void.class
            r5 = 0
            java.lang.String r1 = "VOID"
            r2 = 0
            java.lang.Class<java.lang.Void> r3 = java.lang.Void.class
            r0.<init>(r1, r2, r3, r4, r5)
            defpackage.pc3.VOID = r0
            pc3 r1 = new pc3
            java.lang.Integer r6 = java.lang.Integer.valueOf(r2)
            java.lang.String r2 = "INT"
            r3 = 1
            java.lang.Class r4 = java.lang.Integer.TYPE
            java.lang.Class<java.lang.Integer> r5 = java.lang.Integer.class
            r1.<init>(r2, r3, r4, r5, r6)
            defpackage.pc3.INT = r1
            pc3 r2 = new pc3
            r5 = 0
            java.lang.Long r10 = java.lang.Long.valueOf(r5)
            java.lang.String r6 = "LONG"
            r7 = 2
            java.lang.Class r8 = java.lang.Long.TYPE
            java.lang.Class<java.lang.Long> r9 = java.lang.Long.class
            r5 = r2
            r5.<init>(r6, r7, r8, r9, r10)
            defpackage.pc3.LONG = r2
            pc3 r3 = new pc3
            r5 = 0
            java.lang.Float r10 = java.lang.Float.valueOf(r5)
            java.lang.String r6 = "FLOAT"
            r7 = 3
            java.lang.Class r8 = java.lang.Float.TYPE
            java.lang.Class<java.lang.Float> r9 = java.lang.Float.class
            r5 = r3
            r5.<init>(r6, r7, r8, r9, r10)
            defpackage.pc3.FLOAT = r3
            pc3 r5 = new pc3
            r6 = 0
            java.lang.Double r10 = java.lang.Double.valueOf(r6)
            java.lang.String r6 = "DOUBLE"
            r7 = 4
            java.lang.Class r8 = java.lang.Double.TYPE
            java.lang.Class<java.lang.Double> r9 = java.lang.Double.class
            r5.<init>(r6, r7, r8, r9, r10)
            defpackage.pc3.DOUBLE = r5
            pc3 r6 = new pc3
            java.lang.Class<java.lang.Boolean> r10 = java.lang.Boolean.class
            java.lang.Boolean r11 = java.lang.Boolean.FALSE
            java.lang.String r7 = "BOOLEAN"
            r8 = 5
            java.lang.Class r9 = java.lang.Boolean.TYPE
            r6.<init>(r7, r8, r9, r10, r11)
            defpackage.pc3.BOOLEAN = r6
            pc3 r7 = new pc3
            java.lang.Class<java.lang.String> r11 = java.lang.String.class
            java.lang.String r12 = ""
            java.lang.String r8 = "STRING"
            r9 = 6
            java.lang.Class<java.lang.String> r10 = java.lang.String.class
            r7.<init>(r8, r9, r10, r11, r12)
            r13 = r7
            defpackage.pc3.STRING = r13
            pc3 r7 = new pc3
            java.lang.Class<ea0> r11 = defpackage.ea0.class
            ca0 r12 = defpackage.ea0.B
            java.lang.String r8 = "BYTE_STRING"
            r9 = 7
            java.lang.Class<ea0> r10 = defpackage.ea0.class
            r7.<init>(r8, r9, r10, r11, r12)
            r14 = r7
            defpackage.pc3.BYTE_STRING = r14
            pc3 r7 = new pc3
            java.lang.Class<java.lang.Integer> r11 = java.lang.Integer.class
            r12 = 0
            java.lang.String r8 = "ENUM"
            r9 = 8
            r10 = r4
            r7.<init>(r8, r9, r10, r11, r12)
            defpackage.pc3.ENUM = r7
            pc3 r9 = new pc3
            java.lang.Class<java.lang.Object> r19 = java.lang.Object.class
            r20 = 0
            java.lang.String r16 = "MESSAGE"
            r17 = 9
            java.lang.Class<java.lang.Object> r18 = java.lang.Object.class
            r15 = r9
            r15.<init>(r16, r17, r18, r19, r20)
            defpackage.pc3.MESSAGE = r9
            r4 = r5
            r5 = r6
            r8 = r7
            r6 = r13
            r7 = r14
            pc3[] r0 = new defpackage.pc3[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9}
            defpackage.pc3.$VALUES = r0
            return
    }

    pc3(java.lang.String r1, int r2, java.lang.Class r3, java.lang.Class r4, java.lang.Object r5) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.type = r3
            r0.boxedType = r4
            r0.defaultDefault = r5
            return
    }

    public static defpackage.pc3 valueOf(java.lang.String r1) {
            java.lang.Class<pc3> r0 = defpackage.pc3.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            pc3 r1 = (defpackage.pc3) r1
            return r1
    }

    public static defpackage.pc3[] values() {
            pc3[] r0 = defpackage.pc3.$VALUES
            java.lang.Object r0 = r0.clone()
            pc3[] r0 = (defpackage.pc3[]) r0
            return r0
    }

    public java.lang.Class<?> getBoxedType() {
            r0 = this;
            java.lang.Class<?> r0 = r0.boxedType
            return r0
    }

    public java.lang.Object getDefaultDefault() {
            r0 = this;
            java.lang.Object r0 = r0.defaultDefault
            return r0
    }

    public java.lang.Class<?> getType() {
            r0 = this;
            java.lang.Class<?> r0 = r0.type
            return r0
    }

    public boolean isValidType(java.lang.Class<?> r1) {
            r0 = this;
            java.lang.Class<?> r0 = r0.type
            boolean r0 = r0.isAssignableFrom(r1)
            return r0
    }
}
