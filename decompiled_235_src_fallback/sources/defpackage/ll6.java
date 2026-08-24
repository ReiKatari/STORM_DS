package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ll6  reason: default package */
/* loaded from: classes.dex */
public enum ll6 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.ll6[] $VALUES = null;
    public static final defpackage.ll6 ActionPerformed = null;
    public static final defpackage.ll6 Dismissed = null;

    private static final /* synthetic */ defpackage.ll6[] $values() {
            ll6 r0 = defpackage.ll6.Dismissed
            ll6 r1 = defpackage.ll6.ActionPerformed
            ll6[] r0 = new defpackage.ll6[]{r0, r1}
            return r0
    }

    static {
            ll6 r0 = new ll6
            java.lang.String r1 = "Dismissed"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.ll6.Dismissed = r0
            ll6 r0 = new ll6
            java.lang.String r1 = "ActionPerformed"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.ll6.ActionPerformed = r0
            ll6[] r0 = $values()
            defpackage.ll6.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.ll6.$ENTRIES = r0
            return
    }

    ll6(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.ll6.$ENTRIES
            return r0
    }

    public static defpackage.ll6 valueOf(java.lang.String r1) {
            java.lang.Class<ll6> r0 = defpackage.ll6.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            ll6 r1 = (defpackage.ll6) r1
            return r1
    }

    public static defpackage.ll6[] values() {
            ll6[] r0 = defpackage.ll6.$VALUES
            java.lang.Object r0 = r0.clone()
            ll6[] r0 = (defpackage.ll6[]) r0
            return r0
    }
}
