package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ot3  reason: default package */
/* loaded from: classes.dex */
public enum ot3 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.ot3[] $VALUES = null;
    public static final defpackage.ot3 DEBUG = null;
    public static final defpackage.ot3 ERROR = null;
    public static final defpackage.ot3 INFO = null;
    public static final defpackage.ot3 TRACE = null;
    public static final defpackage.ot3 WARN = null;
    private int levelInt;
    private java.lang.String levelStr;

    static {
            ot3 r0 = new ot3
            r1 = 40
            java.lang.String r2 = "ERROR"
            r3 = 0
            r0.<init>(r2, r3, r1, r2)
            defpackage.ot3.ERROR = r0
            ot3 r1 = new ot3
            r2 = 1
            r4 = 30
            java.lang.String r5 = "WARN"
            r1.<init>(r5, r2, r4, r5)
            defpackage.ot3.WARN = r1
            ot3 r2 = new ot3
            r4 = 2
            r5 = 20
            java.lang.String r6 = "INFO"
            r2.<init>(r6, r4, r5, r6)
            defpackage.ot3.INFO = r2
            ot3 r4 = new ot3
            r5 = 3
            r6 = 10
            java.lang.String r7 = "DEBUG"
            r4.<init>(r7, r5, r6, r7)
            defpackage.ot3.DEBUG = r4
            ot3 r5 = new ot3
            java.lang.String r6 = "TRACE"
            r7 = 4
            r5.<init>(r6, r7, r3, r6)
            defpackage.ot3.TRACE = r5
            ot3[] r0 = new defpackage.ot3[]{r0, r1, r2, r4, r5}
            defpackage.ot3.$VALUES = r0
            return
    }

    ot3(java.lang.String r1, int r2, int r3, java.lang.String r4) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.levelInt = r3
            r0.levelStr = r4
            return
    }

    public static defpackage.ot3 valueOf(java.lang.String r1) {
            java.lang.Class<ot3> r0 = defpackage.ot3.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ot3 r1 = (defpackage.ot3) r1
            return r1
    }

    public static defpackage.ot3[] values() {
            ot3[] r0 = defpackage.ot3.$VALUES
            java.lang.Object r0 = r0.clone()
            ot3[] r0 = (defpackage.ot3[]) r0
            return r0
    }

    public int toInt() {
            r0 = this;
            int r0 = r0.levelInt
            return r0
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
            r0 = this;
            java.lang.String r0 = r0.levelStr
            return r0
    }
}
