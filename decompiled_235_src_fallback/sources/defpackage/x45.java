package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x45  reason: default package */
/* loaded from: classes.dex */
public enum x45 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.t52 $ENTRIES = null;
    private static final /* synthetic */ defpackage.x45[] $VALUES = null;
    public static final defpackage.w45 Companion = null;
    public static final defpackage.x45 INVALID = null;
    public static final defpackage.x45 SIZE_DELIMITED = null;
    public static final defpackage.x45 VARINT = null;
    private static final defpackage.x45[] entryArray = null;
    public static final defpackage.x45 i32 = null;
    public static final defpackage.x45 i64 = null;
    private final int typeId;

    private static final /* synthetic */ defpackage.x45[] $values() {
            x45 r0 = defpackage.x45.INVALID
            x45 r1 = defpackage.x45.VARINT
            x45 r2 = defpackage.x45.i64
            x45 r3 = defpackage.x45.SIZE_DELIMITED
            x45 r4 = defpackage.x45.i32
            x45[] r0 = new defpackage.x45[]{r0, r1, r2, r3, r4}
            return r0
    }

    static {
            x45 r0 = new x45
            r1 = -1
            java.lang.String r2 = "INVALID"
            r3 = 0
            r0.<init>(r2, r3, r1)
            defpackage.x45.INVALID = r0
            x45 r0 = new x45
            java.lang.String r1 = "VARINT"
            r2 = 1
            r0.<init>(r1, r2, r3)
            defpackage.x45.VARINT = r0
            x45 r0 = new x45
            java.lang.String r1 = "i64"
            r4 = 2
            r0.<init>(r1, r4, r2)
            defpackage.x45.i64 = r0
            x45 r0 = new x45
            java.lang.String r1 = "SIZE_DELIMITED"
            r2 = 3
            r0.<init>(r1, r2, r4)
            defpackage.x45.SIZE_DELIMITED = r0
            x45 r0 = new x45
            r1 = 4
            r2 = 5
            java.lang.String r4 = "i32"
            r0.<init>(r4, r1, r2)
            defpackage.x45.i32 = r0
            x45[] r0 = $values()
            defpackage.x45.$VALUES = r0
            u52 r0 = defpackage.nc1.L(r0)
            defpackage.x45.$ENTRIES = r0
            w45 r0 = new w45
            r0.<init>()
            defpackage.x45.Companion = r0
            r0 = 8
            x45[] r1 = new defpackage.x45[r0]
        L4b:
            if (r3 >= r0) goto L73
            t52 r2 = getEntries()
            java.util.Iterator r2 = r2.iterator()
        L55:
            boolean r4 = r2.hasNext()
            if (r4 == 0) goto L67
            java.lang.Object r4 = r2.next()
            r5 = r4
            x45 r5 = (defpackage.x45) r5
            int r5 = r5.typeId
            if (r5 != r3) goto L55
            goto L68
        L67:
            r4 = 0
        L68:
            x45 r4 = (defpackage.x45) r4
            if (r4 != 0) goto L6e
            x45 r4 = defpackage.x45.INVALID
        L6e:
            r1[r3] = r4
            int r3 = r3 + 1
            goto L4b
        L73:
            defpackage.x45.entryArray = r1
            return
    }

    x45(java.lang.String r1, int r2, int r3) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.typeId = r3
            return
    }

    public static final /* synthetic */ defpackage.x45[] access$getEntryArray$cp() {
            x45[] r0 = defpackage.x45.entryArray
            return r0
    }

    public static defpackage.t52 getEntries() {
            t52 r0 = defpackage.x45.$ENTRIES
            return r0
    }

    public static defpackage.x45 valueOf(java.lang.String r1) {
            java.lang.Class<x45> r0 = defpackage.x45.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            x45 r1 = (defpackage.x45) r1
            return r1
    }

    public static defpackage.x45[] values() {
            x45[] r0 = defpackage.x45.$VALUES
            java.lang.Object r0 = r0.clone()
            x45[] r0 = (defpackage.x45[]) r0
            return r0
    }

    public final int getTypeId() {
            r0 = this;
            int r0 = r0.typeId
            return r0
    }

    @Override // java.lang.Enum
    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = r2.name()
            r0.append(r1)
            r1 = 40
            r0.append(r1)
            int r2 = r2.typeId
            r1 = 41
            java.lang.String r2 = defpackage.xg6.q(r0, r2, r1)
            return r2
    }

    public final int wireIntWithTag(int r1) {
            r0 = this;
            int r1 = r1 << 3
            int r0 = r0.typeId
            r0 = r0 | r1
            return r0
    }
}
