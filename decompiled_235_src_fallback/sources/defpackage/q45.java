package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: q45  reason: default package */
/* loaded from: classes.dex */
public enum q45 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.q45[] $VALUES = null;
    public static final defpackage.q45 DEFAULT = null;
    public static final defpackage.q45 FIXED = null;
    public static final defpackage.q45 SIGNED = null;
    private final long signature;

    private static final /* synthetic */ defpackage.q45[] $values() {
            q45 r0 = defpackage.q45.DEFAULT
            q45 r1 = defpackage.q45.SIGNED
            q45 r2 = defpackage.q45.FIXED
            q45[] r0 = new defpackage.q45[]{r0, r1, r2}
            return r0
    }

    static {
            q45 r0 = new q45
            r1 = 0
            r2 = 0
            java.lang.String r4 = "DEFAULT"
            r0.<init>(r4, r1, r2)
            defpackage.q45.DEFAULT = r0
            q45 r0 = new q45
            r1 = 1
            r2 = 8589934592(0x200000000, double:4.243991582E-314)
            java.lang.String r4 = "SIGNED"
            r0.<init>(r4, r1, r2)
            defpackage.q45.SIGNED = r0
            q45 r0 = new q45
            r1 = 2
            r2 = 17179869184(0x400000000, double:8.487983164E-314)
            java.lang.String r4 = "FIXED"
            r0.<init>(r4, r1, r2)
            defpackage.q45.FIXED = r0
            q45[] r0 = $values()
            defpackage.q45.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.q45.$ENTRIES = r0
            return
    }

    q45(java.lang.String r1, int r2, long r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.signature = r3
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.q45.$ENTRIES
            return r0
    }

    public static defpackage.q45 valueOf(java.lang.String r1) {
            java.lang.Class<q45> r0 = defpackage.q45.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            q45 r1 = (defpackage.q45) r1
            return r1
    }

    public static defpackage.q45[] values() {
            q45[] r0 = defpackage.q45.$VALUES
            java.lang.Object r0 = r0.clone()
            q45[] r0 = (defpackage.q45[]) r0
            return r0
    }

    public final long getSignature$kotlinx_serialization_protobuf() {
            r2 = this;
            long r0 = r2.signature
            return r0
    }
}
