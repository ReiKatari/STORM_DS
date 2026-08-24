package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pa2  reason: default package */
/* loaded from: classes.dex */
public enum pa2 extends java.lang.Enum implements defpackage.qa2 {
    private static final /* synthetic */ defpackage.pa2[] $VALUES = null;
    public static final defpackage.pa2 IDENTITY = null;
    public static final defpackage.pa2 LOWER_CASE_WITH_DASHES = null;
    public static final defpackage.pa2 LOWER_CASE_WITH_DOTS = null;
    public static final defpackage.pa2 LOWER_CASE_WITH_UNDERSCORES = null;
    public static final defpackage.pa2 UPPER_CAMEL_CASE = null;
    public static final defpackage.pa2 UPPER_CAMEL_CASE_WITH_SPACES = null;
    public static final defpackage.pa2 UPPER_CASE_WITH_UNDERSCORES = null;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: pa2$a */
    /* loaded from: classes.dex */
    public enum a extends defpackage.pa2 {
        public a(java.lang.String r2, int r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                return
        }

        @Override // defpackage.pa2, defpackage.qa2
        public java.util.List alternateNames(java.lang.reflect.Field r1) {
                r0 = this;
                java.util.List r0 = java.util.Collections.EMPTY_LIST
                return r0
        }

        @Override // defpackage.pa2, defpackage.qa2
        public java.lang.String translateName(java.lang.reflect.Field r1) {
                r0 = this;
                java.lang.String r0 = r1.getName()
                return r0
        }
    }







    private static /* synthetic */ defpackage.pa2[] $values() {
            pa2 r0 = defpackage.pa2.IDENTITY
            pa2 r1 = defpackage.pa2.UPPER_CAMEL_CASE
            pa2 r2 = defpackage.pa2.UPPER_CAMEL_CASE_WITH_SPACES
            pa2 r3 = defpackage.pa2.UPPER_CASE_WITH_UNDERSCORES
            pa2 r4 = defpackage.pa2.LOWER_CASE_WITH_UNDERSCORES
            pa2 r5 = defpackage.pa2.LOWER_CASE_WITH_DASHES
            pa2 r6 = defpackage.pa2.LOWER_CASE_WITH_DOTS
            pa2[] r0 = new defpackage.pa2[]{r0, r1, r2, r3, r4, r5, r6}
            return r0
    }

    static {
            pa2$a r0 = new pa2$a
            java.lang.String r1 = "IDENTITY"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.pa2.IDENTITY = r0
            pa2$b r0 = new pa2$b
            java.lang.String r1 = "UPPER_CAMEL_CASE"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.pa2.UPPER_CAMEL_CASE = r0
            pa2$c r0 = new pa2$c
            java.lang.String r1 = "UPPER_CAMEL_CASE_WITH_SPACES"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.pa2.UPPER_CAMEL_CASE_WITH_SPACES = r0
            pa2$d r0 = new pa2$d
            java.lang.String r1 = "UPPER_CASE_WITH_UNDERSCORES"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.pa2.UPPER_CASE_WITH_UNDERSCORES = r0
            pa2$e r0 = new pa2$e
            java.lang.String r1 = "LOWER_CASE_WITH_UNDERSCORES"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.pa2.LOWER_CASE_WITH_UNDERSCORES = r0
            pa2$f r0 = new pa2$f
            java.lang.String r1 = "LOWER_CASE_WITH_DASHES"
            r2 = 5
            r0.<init>(r1, r2)
            defpackage.pa2.LOWER_CASE_WITH_DASHES = r0
            pa2$g r0 = new pa2$g
            java.lang.String r1 = "LOWER_CASE_WITH_DOTS"
            r2 = 6
            r0.<init>(r1, r2)
            defpackage.pa2.LOWER_CASE_WITH_DOTS = r0
            pa2[] r0 = $values()
            defpackage.pa2.$VALUES = r0
            return
    }

    pa2(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    /* synthetic */ pa2(java.lang.String r1, int r2, defpackage.pa2.a r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static java.lang.String separateCamelCase(java.lang.String r5, char r6) {
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r5.length()
            r2 = 0
        La:
            if (r2 >= r1) goto L25
            char r3 = r5.charAt(r2)
            boolean r4 = java.lang.Character.isUpperCase(r3)
            if (r4 == 0) goto L1f
            int r4 = r0.length()
            if (r4 == 0) goto L1f
            r0.append(r6)
        L1f:
            r0.append(r3)
            int r2 = r2 + 1
            goto La
        L25:
            java.lang.String r5 = r0.toString()
            return r5
    }

    public static java.lang.String upperCaseFirstLetter(java.lang.String r5) {
            int r0 = r5.length()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L53
            char r3 = r5.charAt(r2)
            boolean r4 = java.lang.Character.isLetter(r3)
            if (r4 == 0) goto L50
            boolean r0 = java.lang.Character.isUpperCase(r3)
            if (r0 == 0) goto L19
            goto L53
        L19:
            char r0 = java.lang.Character.toUpperCase(r3)
            r3 = 1
            if (r2 != 0) goto L34
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r5 = r5.substring(r3)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
        L34:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r1 = r5.substring(r1, r2)
            r4.append(r1)
            r4.append(r0)
            int r2 = r2 + r3
            java.lang.String r5 = r5.substring(r2)
            r4.append(r5)
            java.lang.String r5 = r4.toString()
            return r5
        L50:
            int r2 = r2 + 1
            goto L6
        L53:
            return r5
    }

    public static defpackage.pa2 valueOf(java.lang.String r1) {
            java.lang.Class<pa2> r0 = defpackage.pa2.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            pa2 r1 = (defpackage.pa2) r1
            return r1
    }

    public static defpackage.pa2[] values() {
            pa2[] r0 = defpackage.pa2.$VALUES
            java.lang.Object r0 = r0.clone()
            pa2[] r0 = (defpackage.pa2[]) r0
            return r0
    }

    @Override // defpackage.qa2
    public java.util.List alternateNames(java.lang.reflect.Field r1) {
            r0 = this;
            java.util.List r0 = java.util.Collections.EMPTY_LIST
            return r0
    }

    @Override // defpackage.qa2
    public abstract /* synthetic */ java.lang.String translateName(java.lang.reflect.Field r1);
}
