package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: st3  reason: default package */
/* loaded from: classes.dex */
public enum st3 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.st3[] $VALUES = null;
    public static final defpackage.qt3 Companion = null;
    public static final defpackage.st3 ON_ANY = null;
    public static final defpackage.st3 ON_CREATE = null;
    public static final defpackage.st3 ON_DESTROY = null;
    public static final defpackage.st3 ON_PAUSE = null;
    public static final defpackage.st3 ON_RESUME = null;
    public static final defpackage.st3 ON_START = null;
    public static final defpackage.st3 ON_STOP = null;

    private static final /* synthetic */ defpackage.st3[] $values() {
            st3 r0 = defpackage.st3.ON_CREATE
            st3 r1 = defpackage.st3.ON_START
            st3 r2 = defpackage.st3.ON_RESUME
            st3 r3 = defpackage.st3.ON_PAUSE
            st3 r4 = defpackage.st3.ON_STOP
            st3 r5 = defpackage.st3.ON_DESTROY
            st3 r6 = defpackage.st3.ON_ANY
            st3[] r0 = new defpackage.st3[]{r0, r1, r2, r3, r4, r5, r6}
            return r0
    }

    static {
            st3 r0 = new st3
            java.lang.String r1 = "ON_CREATE"
            r2 = 0
            r0.<init>(r1, r2)
            defpackage.st3.ON_CREATE = r0
            st3 r0 = new st3
            java.lang.String r1 = "ON_START"
            r2 = 1
            r0.<init>(r1, r2)
            defpackage.st3.ON_START = r0
            st3 r0 = new st3
            java.lang.String r1 = "ON_RESUME"
            r2 = 2
            r0.<init>(r1, r2)
            defpackage.st3.ON_RESUME = r0
            st3 r0 = new st3
            java.lang.String r1 = "ON_PAUSE"
            r2 = 3
            r0.<init>(r1, r2)
            defpackage.st3.ON_PAUSE = r0
            st3 r0 = new st3
            java.lang.String r1 = "ON_STOP"
            r2 = 4
            r0.<init>(r1, r2)
            defpackage.st3.ON_STOP = r0
            st3 r0 = new st3
            java.lang.String r1 = "ON_DESTROY"
            r2 = 5
            r0.<init>(r1, r2)
            defpackage.st3.ON_DESTROY = r0
            st3 r0 = new st3
            java.lang.String r1 = "ON_ANY"
            r2 = 6
            r0.<init>(r1, r2)
            defpackage.st3.ON_ANY = r0
            st3[] r0 = $values()
            defpackage.st3.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.st3.$ENTRIES = r0
            qt3 r0 = new qt3
            r0.<init>()
            defpackage.st3.Companion = r0
            return
    }

    st3(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static final defpackage.st3 downFrom(defpackage.tt3 r1) {
            qt3 r0 = defpackage.st3.Companion
            r0.getClass()
            st3 r1 = defpackage.qt3.a(r1)
            return r1
    }

    public static final defpackage.st3 downTo(defpackage.tt3 r1) {
            qt3 r0 = defpackage.st3.Companion
            r0.getClass()
            r1.getClass()
            int[] r0 = defpackage.pt3.a
            int r1 = r1.ordinal()
            r1 = r0[r1]
            r0 = 1
            if (r1 == r0) goto L21
            r0 = 2
            if (r1 == r0) goto L1e
            r0 = 4
            if (r1 == r0) goto L1b
            r1 = 0
            return r1
        L1b:
            st3 r1 = defpackage.st3.ON_DESTROY
            return r1
        L1e:
            st3 r1 = defpackage.st3.ON_PAUSE
            return r1
        L21:
            st3 r1 = defpackage.st3.ON_STOP
            return r1
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.st3.$ENTRIES
            return r0
    }

    public static final defpackage.st3 upFrom(defpackage.tt3 r1) {
            qt3 r0 = defpackage.st3.Companion
            r0.getClass()
            st3 r1 = defpackage.qt3.b(r1)
            return r1
    }

    public static final defpackage.st3 upTo(defpackage.tt3 r1) {
            qt3 r0 = defpackage.st3.Companion
            r0.getClass()
            st3 r1 = defpackage.qt3.c(r1)
            return r1
    }

    public static defpackage.st3 valueOf(java.lang.String r1) {
            java.lang.Class<st3> r0 = defpackage.st3.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            st3 r1 = (defpackage.st3) r1
            return r1
    }

    public static defpackage.st3[] values() {
            st3[] r0 = defpackage.st3.$VALUES
            java.lang.Object r0 = r0.clone()
            st3[] r0 = (defpackage.st3[]) r0
            return r0
    }

    public final defpackage.tt3 getTargetState() {
            r2 = this;
            int[] r0 = defpackage.rt3.a
            int r1 = r2.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L30;
                case 2: goto L30;
                case 3: goto L2d;
                case 4: goto L2d;
                case 5: goto L2a;
                case 6: goto L27;
                case 7: goto L10;
                default: goto Lb;
            }
        Lb:
            defpackage.i.d()
            r2 = 0
            return r2
        L10:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            java.lang.String r2 = " has no target state"
            r1.append(r2)
            java.lang.String r2 = r1.toString()
            r0.<init>(r2)
            throw r0
        L27:
            tt3 r2 = defpackage.tt3.DESTROYED
            return r2
        L2a:
            tt3 r2 = defpackage.tt3.RESUMED
            return r2
        L2d:
            tt3 r2 = defpackage.tt3.STARTED
            return r2
        L30:
            tt3 r2 = defpackage.tt3.CREATED
            return r2
    }
}
