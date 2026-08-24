package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cy7  reason: default package */
/* loaded from: classes.dex */
public enum cy7 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.cy7[] $VALUES = null;
    public static final defpackage.cy7 ASCENDING = null;
    public static final defpackage.cy7 DESCENDING = null;

    static {
            cy7 r0 = new cy7
            java.lang.String r1 = "ASCENDING"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.cy7.ASCENDING = r0
            cy7 r1 = new cy7
            java.lang.String r2 = "DESCENDING"
            r3 = 1
            r1.<init>(r2, r3)
            defpackage.cy7.DESCENDING = r1
            cy7[] r0 = new defpackage.cy7[]{r0, r1}
            defpackage.cy7.$VALUES = r0
            return
    }

    cy7(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.cy7 valueOf(java.lang.String r1) {
            java.lang.Class<cy7> r0 = defpackage.cy7.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            cy7 r1 = (defpackage.cy7) r1
            return r1
    }

    public static defpackage.cy7[] values() {
            cy7[] r0 = defpackage.cy7.$VALUES
            java.lang.Object r0 = r0.clone()
            cy7[] r0 = (defpackage.cy7[]) r0
            return r0
    }
}
