package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: bt7  reason: default package */
/* loaded from: classes.dex */
public enum bt7 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.bt7[] $VALUES = null;
    public static final defpackage.bt7 CENTER = null;
    public static final defpackage.bt7 END = null;
    public static final defpackage.bt7 NONE = null;
    public static final defpackage.bt7 START = null;

    private static /* synthetic */ defpackage.bt7[] $values() {
            bt7 r0 = defpackage.bt7.NONE
            bt7 r1 = defpackage.bt7.START
            bt7 r2 = defpackage.bt7.END
            bt7 r3 = defpackage.bt7.CENTER
            bt7[] r0 = new defpackage.bt7[]{r0, r1, r2, r3}
            return r0
    }

    static {
            bt7 r0 = new bt7
            java.lang.String r1 = "NONE"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.bt7.NONE = r0
            bt7 r0 = new bt7
            java.lang.String r1 = "START"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.bt7.START = r0
            bt7 r0 = new bt7
            java.lang.String r1 = "END"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.bt7.END = r0
            bt7 r0 = new bt7
            java.lang.String r1 = "CENTER"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.bt7.CENTER = r0
            bt7[] r0 = $values()
            defpackage.bt7.$VALUES = r0
            return
    }

    bt7(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.bt7 valueOf(java.lang.String r1) {
            java.lang.Class<bt7> r0 = defpackage.bt7.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            bt7 r1 = (defpackage.bt7) r1
            return r1
    }

    public static defpackage.bt7[] values() {
            bt7[] r0 = defpackage.bt7.$VALUES
            java.lang.Object r0 = r0.clone()
            bt7[] r0 = (defpackage.bt7[]) r0
            return r0
    }
}
