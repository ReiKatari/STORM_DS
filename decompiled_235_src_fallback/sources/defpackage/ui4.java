package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ui4  reason: default package */
/* loaded from: classes.dex */
public enum ui4 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.ui4[] $VALUES = null;
    public static final defpackage.ui4 EMPTY = null;
    public static final defpackage.ui4 IO_ERROR = null;
    public static final defpackage.ui4 OK = null;
    public static final defpackage.ui4 SIGNING_KEY_INVALID = null;
    public static final defpackage.ui4 TAMPERED = null;

    private static final /* synthetic */ defpackage.ui4[] $values() {
            ui4 r0 = defpackage.ui4.OK
            ui4 r1 = defpackage.ui4.EMPTY
            ui4 r2 = defpackage.ui4.TAMPERED
            ui4 r3 = defpackage.ui4.SIGNING_KEY_INVALID
            ui4 r4 = defpackage.ui4.IO_ERROR
            ui4[] r0 = new defpackage.ui4[]{r0, r1, r2, r3, r4}
            return r0
    }

    static {
            ui4 r0 = new ui4
            java.lang.String r1 = "OK"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.ui4.OK = r0
            ui4 r0 = new ui4
            java.lang.String r1 = "EMPTY"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.ui4.EMPTY = r0
            ui4 r0 = new ui4
            java.lang.String r1 = "TAMPERED"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.ui4.TAMPERED = r0
            ui4 r0 = new ui4
            java.lang.String r1 = "SIGNING_KEY_INVALID"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.ui4.SIGNING_KEY_INVALID = r0
            ui4 r0 = new ui4
            java.lang.String r1 = "IO_ERROR"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.ui4.IO_ERROR = r0
            ui4[] r0 = $values()
            defpackage.ui4.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.ui4.$ENTRIES = r0
            return
    }

    ui4(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.ui4.$ENTRIES
            return r0
    }

    public static defpackage.ui4 valueOf(java.lang.String r1) {
            java.lang.Class<ui4> r0 = defpackage.ui4.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ui4 r1 = (defpackage.ui4) r1
            return r1
    }

    public static defpackage.ui4[] values() {
            ui4[] r0 = defpackage.ui4.$VALUES
            java.lang.Object r0 = r0.clone()
            ui4[] r0 = (defpackage.ui4[]) r0
            return r0
    }
}
