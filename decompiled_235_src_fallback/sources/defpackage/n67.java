package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n67  reason: default package */
/* loaded from: classes.dex */
public enum n67 extends java.lang.Enum implements defpackage.o67 {
    private static final /* synthetic */ defpackage.n67[] $VALUES = null;
    public static final defpackage.n67 BIG_DECIMAL = null;
    public static final defpackage.n67 DOUBLE = null;
    public static final defpackage.n67 LAZILY_PARSED_NUMBER = null;
    public static final defpackage.n67 LONG_OR_DOUBLE = null;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: n67$a */
    /* loaded from: classes.dex */
    public enum a extends defpackage.n67 {
        public a(java.lang.String r2, int r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                return
        }

        @Override // defpackage.n67, defpackage.o67
        public java.lang.Double readNumber(defpackage.hf3 r1) {
                r0 = this;
                double r0 = r1.X()
                java.lang.Double r0 = java.lang.Double.valueOf(r0)
                return r0
        }

        @Override // defpackage.n67, defpackage.o67
        public /* bridge */ /* synthetic */ java.lang.Number readNumber(defpackage.hf3 r1) {
                r0 = this;
                java.lang.Double r0 = r0.readNumber(r1)
                return r0
        }
    }




    private static /* synthetic */ defpackage.n67[] $values() {
            n67 r0 = defpackage.n67.DOUBLE
            n67 r1 = defpackage.n67.LAZILY_PARSED_NUMBER
            n67 r2 = defpackage.n67.LONG_OR_DOUBLE
            n67 r3 = defpackage.n67.BIG_DECIMAL
            n67[] r0 = new defpackage.n67[]{r0, r1, r2, r3}
            return r0
    }

    static {
            n67$a r0 = new n67$a
            java.lang.String r1 = "DOUBLE"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.n67.DOUBLE = r0
            n67$b r0 = new n67$b
            java.lang.String r1 = "LAZILY_PARSED_NUMBER"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.n67.LAZILY_PARSED_NUMBER = r0
            n67$c r0 = new n67$c
            java.lang.String r1 = "LONG_OR_DOUBLE"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.n67.LONG_OR_DOUBLE = r0
            n67$d r0 = new n67$d
            java.lang.String r1 = "BIG_DECIMAL"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.n67.BIG_DECIMAL = r0
            n67[] r0 = $values()
            defpackage.n67.$VALUES = r0
            return
    }

    n67(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    /* synthetic */ n67(java.lang.String r1, int r2, defpackage.n67.a r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.n67 valueOf(java.lang.String r1) {
            java.lang.Class<n67> r0 = defpackage.n67.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            n67 r1 = (defpackage.n67) r1
            return r1
    }

    public static defpackage.n67[] values() {
            n67[] r0 = defpackage.n67.$VALUES
            java.lang.Object r0 = r0.clone()
            n67[] r0 = (defpackage.n67[]) r0
            return r0
    }

    @Override // defpackage.o67
    public abstract /* synthetic */ java.lang.Number readNumber(defpackage.hf3 r1);
}
