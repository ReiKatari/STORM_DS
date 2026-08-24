package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: py4  reason: default package */
/* loaded from: classes.dex */
public enum py4 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.py4[] $VALUES = null;
    public static final defpackage.py4 Final = null;
    public static final defpackage.py4 Initial = null;
    public static final defpackage.py4 Main = null;

    private static final /* synthetic */ defpackage.py4[] $values() {
            py4 r0 = defpackage.py4.Initial
            py4 r1 = defpackage.py4.Main
            py4 r2 = defpackage.py4.Final
            py4[] r0 = new defpackage.py4[]{r0, r1, r2}
            return r0
    }

    static {
            py4 r0 = new py4
            java.lang.String r1 = "Initial"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.py4.Initial = r0
            py4 r0 = new py4
            java.lang.String r1 = "Main"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.py4.Main = r0
            py4 r0 = new py4
            java.lang.String r1 = "Final"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.py4.Final = r0
            py4[] r0 = $values()
            defpackage.py4.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.py4.$ENTRIES = r0
            return
    }

    py4(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.py4.$ENTRIES
            return r0
    }

    public static defpackage.py4 valueOf(java.lang.String r1) {
            java.lang.Class<py4> r0 = defpackage.py4.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            py4 r1 = (defpackage.py4) r1
            return r1
    }

    public static defpackage.py4[] values() {
            py4[] r0 = defpackage.py4.$VALUES
            java.lang.Object r0 = r0.clone()
            py4[] r0 = (defpackage.py4[]) r0
            return r0
    }
}
