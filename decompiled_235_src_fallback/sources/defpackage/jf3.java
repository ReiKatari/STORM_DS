package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: jf3  reason: default package */
/* loaded from: classes.dex */
public enum jf3 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.jf3[] $VALUES = null;
    public static final defpackage.jf3 BEGIN_ARRAY = null;
    public static final defpackage.jf3 BEGIN_OBJECT = null;
    public static final defpackage.jf3 BOOLEAN = null;
    public static final defpackage.jf3 END_ARRAY = null;
    public static final defpackage.jf3 END_DOCUMENT = null;
    public static final defpackage.jf3 END_OBJECT = null;
    public static final defpackage.jf3 NAME = null;
    public static final defpackage.jf3 NULL = null;
    public static final defpackage.jf3 NUMBER = null;
    public static final defpackage.jf3 STRING = null;

    private static /* synthetic */ defpackage.jf3[] $values() {
            jf3 r0 = defpackage.jf3.BEGIN_ARRAY
            jf3 r1 = defpackage.jf3.END_ARRAY
            jf3 r2 = defpackage.jf3.BEGIN_OBJECT
            jf3 r3 = defpackage.jf3.END_OBJECT
            jf3 r4 = defpackage.jf3.NAME
            jf3 r5 = defpackage.jf3.STRING
            jf3 r6 = defpackage.jf3.NUMBER
            jf3 r7 = defpackage.jf3.BOOLEAN
            jf3 r8 = defpackage.jf3.NULL
            jf3 r9 = defpackage.jf3.END_DOCUMENT
            jf3[] r0 = new defpackage.jf3[]{r0, r1, r2, r3, r4, r5, r6, r7, r8, r9}
            return r0
    }

    static {
            jf3 r0 = new jf3
            java.lang.String r1 = "BEGIN_ARRAY"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.jf3.BEGIN_ARRAY = r0
            jf3 r0 = new jf3
            java.lang.String r1 = "END_ARRAY"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.jf3.END_ARRAY = r0
            jf3 r0 = new jf3
            java.lang.String r1 = "BEGIN_OBJECT"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.jf3.BEGIN_OBJECT = r0
            jf3 r0 = new jf3
            java.lang.String r1 = "END_OBJECT"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.jf3.END_OBJECT = r0
            jf3 r0 = new jf3
            java.lang.String r1 = "NAME"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.jf3.NAME = r0
            jf3 r0 = new jf3
            java.lang.String r1 = "STRING"
            r2 = 5
            r0.<init>(r1, r2)
            defpackage.jf3.STRING = r0
            jf3 r0 = new jf3
            java.lang.String r1 = "NUMBER"
            r2 = 6
            r0.<init>(r1, r2)
            defpackage.jf3.NUMBER = r0
            jf3 r0 = new jf3
            java.lang.String r1 = "BOOLEAN"
            r2 = 7
            r0.<init>(r1, r2)
            defpackage.jf3.BOOLEAN = r0
            jf3 r0 = new jf3
            java.lang.String r1 = "NULL"
            r2 = 8
            r0.<init>(r1, r2)
            defpackage.jf3.NULL = r0
            jf3 r0 = new jf3
            java.lang.String r1 = "END_DOCUMENT"
            r2 = 9
            r0.<init>(r1, r2)
            defpackage.jf3.END_DOCUMENT = r0
            jf3[] r0 = $values()
            defpackage.jf3.$VALUES = r0
            return
    }

    jf3(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.jf3 valueOf(java.lang.String r1) {
            java.lang.Class<jf3> r0 = defpackage.jf3.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            jf3 r1 = (defpackage.jf3) r1
            return r1
    }

    public static defpackage.jf3[] values() {
            jf3[] r0 = defpackage.jf3.$VALUES
            java.lang.Object r0 = r0.clone()
            jf3[] r0 = (defpackage.jf3[]) r0
            return r0
    }
}
