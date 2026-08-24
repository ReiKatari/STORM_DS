package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sh2  reason: default package */
/* loaded from: classes.dex */
public enum sh2 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.sh2[] $VALUES = null;
    public static final defpackage.sh2 Active = null;
    public static final defpackage.sh2 ActiveParent = null;
    public static final defpackage.sh2 Captured = null;
    public static final defpackage.sh2 Inactive = null;

    private static final /* synthetic */ defpackage.sh2[] $values() {
            sh2 r0 = defpackage.sh2.Active
            sh2 r1 = defpackage.sh2.ActiveParent
            sh2 r2 = defpackage.sh2.Captured
            sh2 r3 = defpackage.sh2.Inactive
            sh2[] r0 = new defpackage.sh2[]{r0, r1, r2, r3}
            return r0
    }

    static {
            sh2 r0 = new sh2
            java.lang.String r1 = "Active"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.sh2.Active = r0
            sh2 r0 = new sh2
            java.lang.String r1 = "ActiveParent"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.sh2.ActiveParent = r0
            sh2 r0 = new sh2
            java.lang.String r1 = "Captured"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.sh2.Captured = r0
            sh2 r0 = new sh2
            java.lang.String r1 = "Inactive"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.sh2.Inactive = r0
            sh2[] r0 = $values()
            defpackage.sh2.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.sh2.$ENTRIES = r0
            return
    }

    sh2(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.sh2.$ENTRIES
            return r0
    }

    public static defpackage.sh2 valueOf(java.lang.String r1) {
            java.lang.Class<sh2> r0 = defpackage.sh2.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            sh2 r1 = (defpackage.sh2) r1
            return r1
    }

    public static defpackage.sh2[] values() {
            sh2[] r0 = defpackage.sh2.$VALUES
            java.lang.Object r0 = r0.clone()
            sh2[] r0 = (defpackage.sh2[]) r0
            return r0
    }

    public boolean getHasFocus() {
            r2 = this;
            int[] r0 = defpackage.rh2.a
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L1b
            r1 = 2
            if (r2 == r1) goto L1b
            r1 = 3
            if (r2 == r1) goto L1b
            r0 = 4
            if (r2 != r0) goto L16
            r2 = 0
            return r2
        L16:
            defpackage.i.d()
            r2 = 0
            return r2
        L1b:
            return r0
    }

    public boolean isCaptured() {
            r1 = this;
            int[] r0 = defpackage.rh2.a
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 1
            if (r1 == r0) goto L1c
            r0 = 2
            if (r1 == r0) goto L1a
            r0 = 3
            if (r1 == r0) goto L1a
            r0 = 4
            if (r1 != r0) goto L15
            goto L1a
        L15:
            defpackage.i.d()
            r1 = 0
            return r1
        L1a:
            r1 = 0
            return r1
        L1c:
            return r0
    }

    public boolean isFocused() {
            r2 = this;
            int[] r0 = defpackage.rh2.a
            int r2 = r2.ordinal()
            r2 = r0[r2]
            r0 = 1
            if (r2 == r0) goto L1c
            r1 = 2
            if (r2 == r1) goto L1c
            r0 = 3
            if (r2 == r0) goto L1a
            r0 = 4
            if (r2 != r0) goto L15
            goto L1a
        L15:
            defpackage.i.d()
            r2 = 0
            return r2
        L1a:
            r2 = 0
            return r2
        L1c:
            return r0
    }
}
