package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tt3  reason: default package */
/* loaded from: classes.dex */
public enum tt3 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.tt3[] $VALUES = null;
    public static final defpackage.tt3 CREATED = null;
    public static final defpackage.tt3 DESTROYED = null;
    public static final defpackage.tt3 INITIALIZED = null;
    public static final defpackage.tt3 RESUMED = null;
    public static final defpackage.tt3 STARTED = null;

    private static final /* synthetic */ defpackage.tt3[] $values() {
            tt3 r0 = defpackage.tt3.DESTROYED
            tt3 r1 = defpackage.tt3.INITIALIZED
            tt3 r2 = defpackage.tt3.CREATED
            tt3 r3 = defpackage.tt3.STARTED
            tt3 r4 = defpackage.tt3.RESUMED
            tt3[] r0 = new defpackage.tt3[]{r0, r1, r2, r3, r4}
            return r0
    }

    static {
            tt3 r0 = new tt3
            java.lang.String r1 = "DESTROYED"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.tt3.DESTROYED = r0
            tt3 r0 = new tt3
            java.lang.String r1 = "INITIALIZED"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.tt3.INITIALIZED = r0
            tt3 r0 = new tt3
            java.lang.String r1 = "CREATED"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.tt3.CREATED = r0
            tt3 r0 = new tt3
            java.lang.String r1 = "STARTED"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.tt3.STARTED = r0
            tt3 r0 = new tt3
            java.lang.String r1 = "RESUMED"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.tt3.RESUMED = r0
            tt3[] r0 = $values()
            defpackage.tt3.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.tt3.$ENTRIES = r0
            return
    }

    tt3(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.tt3.$ENTRIES
            return r0
    }

    public static defpackage.tt3 valueOf(java.lang.String r1) {
            java.lang.Class<tt3> r0 = defpackage.tt3.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            tt3 r1 = (defpackage.tt3) r1
            return r1
    }

    public static defpackage.tt3[] values() {
            tt3[] r0 = defpackage.tt3.$VALUES
            java.lang.Object r0 = r0.clone()
            tt3[] r0 = (defpackage.tt3[]) r0
            return r0
    }

    public final boolean isAtLeast(defpackage.tt3 r1) {
            r0 = this;
            r1.getClass()
            int r0 = r0.compareTo(r1)
            if (r0 < 0) goto Lb
            r0 = 1
            return r0
        Lb:
            r0 = 0
            return r0
    }
}
