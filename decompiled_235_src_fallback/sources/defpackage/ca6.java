package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ca6  reason: default package */
/* loaded from: classes.dex */
public enum ca6 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.ca6[] $VALUES = null;
    public static final defpackage.ca6 EditableText = null;
    public static final defpackage.ca6 StaticText = null;

    private static final /* synthetic */ defpackage.ca6[] $values() {
            ca6 r0 = defpackage.ca6.EditableText
            ca6 r1 = defpackage.ca6.StaticText
            ca6[] r0 = new defpackage.ca6[]{r0, r1}
            return r0
    }

    static {
            ca6 r0 = new ca6
            java.lang.String r1 = "EditableText"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.ca6.EditableText = r0
            ca6 r0 = new ca6
            java.lang.String r1 = "StaticText"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.ca6.StaticText = r0
            ca6[] r0 = $values()
            defpackage.ca6.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.ca6.$ENTRIES = r0
            return
    }

    ca6(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.ca6.$ENTRIES
            return r0
    }

    public static defpackage.ca6 valueOf(java.lang.String r1) {
            java.lang.Class<ca6> r0 = defpackage.ca6.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ca6 r1 = (defpackage.ca6) r1
            return r1
    }

    public static defpackage.ca6[] values() {
            ca6[] r0 = defpackage.ca6.$VALUES
            java.lang.Object r0 = r0.clone()
            ca6[] r0 = (defpackage.ca6[]) r0
            return r0
    }
}
