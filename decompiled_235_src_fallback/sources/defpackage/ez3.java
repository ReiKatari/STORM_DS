package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ez3  reason: default package */
/* loaded from: classes.dex */
public enum ez3 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.ez3[] $VALUES = null;
    public static final defpackage.ez3 DEFAULT = null;
    public static final defpackage.ez3 STRING = null;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: ez3$a */
    /* loaded from: classes.dex */
    public enum a extends defpackage.ez3 {
        public a(java.lang.String r2, int r3) {
                r1 = this;
                r0 = 0
                r1.<init>(r2, r3, r0)
                return
        }

        @Override // defpackage.ez3
        public defpackage.ee3 serialize(java.lang.Long r1) {
                r0 = this;
                if (r1 != 0) goto L5
                ve3 r0 = defpackage.ve3.A
                return r0
            L5:
                ef3 r0 = new ef3
                r0.<init>(r1)
                return r0
        }

        @Override // defpackage.ez3
        public defpackage.yc7 typeAdapter() {
                r0 = this;
                dd7 r0 = defpackage.fe7.k
                return r0
        }
    }


    private static /* synthetic */ defpackage.ez3[] $values() {
            ez3 r0 = defpackage.ez3.DEFAULT
            ez3 r1 = defpackage.ez3.STRING
            ez3[] r0 = new defpackage.ez3[]{r0, r1}
            return r0
    }

    static {
            ez3$a r0 = new ez3$a
            java.lang.String r1 = "DEFAULT"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.ez3.DEFAULT = r0
            ez3$b r0 = new ez3$b
            java.lang.String r1 = "STRING"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.ez3.STRING = r0
            ez3[] r0 = $values()
            defpackage.ez3.$VALUES = r0
            return
    }

    ez3(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    /* synthetic */ ez3(java.lang.String r1, int r2, defpackage.ez3.a r3) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.ez3 valueOf(java.lang.String r1) {
            java.lang.Class<ez3> r0 = defpackage.ez3.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ez3 r1 = (defpackage.ez3) r1
            return r1
    }

    public static defpackage.ez3[] values() {
            ez3[] r0 = defpackage.ez3.$VALUES
            java.lang.Object r0 = r0.clone()
            ez3[] r0 = (defpackage.ez3[]) r0
            return r0
    }

    public abstract defpackage.ee3 serialize(java.lang.Long r1);

    public abstract defpackage.yc7 typeAdapter();
}
