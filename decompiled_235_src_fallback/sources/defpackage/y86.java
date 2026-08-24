package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: y86  reason: default package */
/* loaded from: classes.dex */
public enum y86 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.y86[] $VALUES = null;
    public static final defpackage.y86 Inherit = null;
    public static final defpackage.y86 SecureOff = null;
    public static final defpackage.y86 SecureOn = null;

    private static final /* synthetic */ defpackage.y86[] $values() {
            y86 r0 = defpackage.y86.Inherit
            y86 r1 = defpackage.y86.SecureOn
            y86 r2 = defpackage.y86.SecureOff
            y86[] r0 = new defpackage.y86[]{r0, r1, r2}
            return r0
    }

    static {
            y86 r0 = new y86
            java.lang.String r1 = "Inherit"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.y86.Inherit = r0
            y86 r0 = new y86
            java.lang.String r1 = "SecureOn"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.y86.SecureOn = r0
            y86 r0 = new y86
            java.lang.String r1 = "SecureOff"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.y86.SecureOff = r0
            y86[] r0 = $values()
            defpackage.y86.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.y86.$ENTRIES = r0
            return
    }

    y86(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.y86.$ENTRIES
            return r0
    }

    public static defpackage.y86 valueOf(java.lang.String r1) {
            java.lang.Class<y86> r0 = defpackage.y86.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            y86 r1 = (defpackage.y86) r1
            return r1
    }

    public static defpackage.y86[] values() {
            y86[] r0 = defpackage.y86.$VALUES
            java.lang.Object r0 = r0.clone()
            y86[] r0 = (defpackage.y86[]) r0
            return r0
    }
}
