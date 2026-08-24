package me.magnum.melonds.domain.model;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class Cheat {
    public static final int $stable = 0;
    private final long cheatDatabaseId;
    private final java.lang.String code;
    private final java.lang.String description;
    private final boolean enabled;
    private final java.lang.Long id;
    private final java.lang.String name;

    public Cheat(java.lang.Long r1, long r2, java.lang.String r4, java.lang.String r5, java.lang.String r6, boolean r7) {
            r0 = this;
            r4.getClass()
            r6.getClass()
            r0.<init>()
            r0.id = r1
            r0.cheatDatabaseId = r2
            r0.name = r4
            r0.description = r5
            r0.code = r6
            r0.enabled = r7
            return
    }

    public static /* synthetic */ me.magnum.melonds.domain.model.Cheat copy$default(me.magnum.melonds.domain.model.Cheat r0, java.lang.Long r1, long r2, java.lang.String r4, java.lang.String r5, java.lang.String r6, boolean r7, int r8, java.lang.Object r9) {
            r9 = r8 & 1
            if (r9 == 0) goto L6
            java.lang.Long r1 = r0.id
        L6:
            r9 = r8 & 2
            if (r9 == 0) goto Lc
            long r2 = r0.cheatDatabaseId
        Lc:
            r9 = r8 & 4
            if (r9 == 0) goto L12
            java.lang.String r4 = r0.name
        L12:
            r9 = r8 & 8
            if (r9 == 0) goto L18
            java.lang.String r5 = r0.description
        L18:
            r9 = r8 & 16
            if (r9 == 0) goto L1e
            java.lang.String r6 = r0.code
        L1e:
            r8 = r8 & 32
            if (r8 == 0) goto L24
            boolean r7 = r0.enabled
        L24:
            r8 = r6
            r9 = r7
            r6 = r4
            r7 = r5
            r4 = r2
            r2 = r0
            r3 = r1
            me.magnum.melonds.domain.model.Cheat r0 = r2.copy(r3, r4, r6, r7, r8, r9)
            return r0
    }

    public final java.lang.Long component1() {
            r0 = this;
            java.lang.Long r0 = r0.id
            return r0
    }

    public final long component2() {
            r2 = this;
            long r0 = r2.cheatDatabaseId
            return r0
    }

    public final java.lang.String component3() {
            r0 = this;
            java.lang.String r0 = r0.name
            return r0
    }

    public final java.lang.String component4() {
            r0 = this;
            java.lang.String r0 = r0.description
            return r0
    }

    public final java.lang.String component5() {
            r0 = this;
            java.lang.String r0 = r0.code
            return r0
    }

    public final boolean component6() {
            r0 = this;
            boolean r0 = r0.enabled
            return r0
    }

    public final me.magnum.melonds.domain.model.Cheat copy(java.lang.Long r1, long r2, java.lang.String r4, java.lang.String r5, java.lang.String r6, boolean r7) {
            r0 = this;
            r4.getClass()
            r6.getClass()
            me.magnum.melonds.domain.model.Cheat r0 = new me.magnum.melonds.domain.model.Cheat
            r0.<init>(r1, r2, r4, r5, r6, r7)
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof me.magnum.melonds.domain.model.Cheat
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            me.magnum.melonds.domain.model.Cheat r8 = (me.magnum.melonds.domain.model.Cheat) r8
            java.lang.Long r1 = r7.id
            java.lang.Long r3 = r8.id
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L17
            return r2
        L17:
            long r3 = r7.cheatDatabaseId
            long r5 = r8.cheatDatabaseId
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L20
            return r2
        L20:
            java.lang.String r1 = r7.name
            java.lang.String r3 = r8.name
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L2b
            return r2
        L2b:
            java.lang.String r1 = r7.description
            java.lang.String r3 = r8.description
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L36
            return r2
        L36:
            java.lang.String r1 = r7.code
            java.lang.String r3 = r8.code
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L41
            return r2
        L41:
            boolean r7 = r7.enabled
            boolean r8 = r8.enabled
            if (r7 == r8) goto L48
            return r2
        L48:
            return r0
    }

    public final long getCheatDatabaseId() {
            r2 = this;
            long r0 = r2.cheatDatabaseId
            return r0
    }

    public final java.lang.String getCode() {
            r0 = this;
            java.lang.String r0 = r0.code
            return r0
    }

    public final java.lang.String getDescription() {
            r0 = this;
            java.lang.String r0 = r0.description
            return r0
    }

    public final boolean getEnabled() {
            r0 = this;
            boolean r0 = r0.enabled
            return r0
    }

    public final java.lang.Long getId() {
            r0 = this;
            java.lang.Long r0 = r0.id
            return r0
    }

    public final java.lang.String getName() {
            r0 = this;
            java.lang.String r0 = r0.name
            return r0
    }

    public int hashCode() {
            r5 = this;
            java.lang.Long r0 = r5.id
            r1 = 0
            if (r0 != 0) goto L7
            r0 = r1
            goto Lb
        L7:
            int r0 = r0.hashCode()
        Lb:
            r2 = 31
            int r0 = r0 * r2
            long r3 = r5.cheatDatabaseId
            int r0 = defpackage.i61.c(r3, r0, r2)
            java.lang.String r3 = r5.name
            int r0 = defpackage.xg6.d(r0, r2, r3)
            java.lang.String r3 = r5.description
            if (r3 != 0) goto L1f
            goto L23
        L1f:
            int r1 = r3.hashCode()
        L23:
            int r0 = r0 + r1
            int r0 = r0 * r2
            java.lang.String r1 = r5.code
            int r0 = defpackage.xg6.d(r0, r2, r1)
            boolean r5 = r5.enabled
            int r5 = java.lang.Boolean.hashCode(r5)
            int r5 = r5 + r0
            return r5
    }

    public java.lang.String toString() {
            r8 = this;
            java.lang.Long r0 = r8.id
            long r1 = r8.cheatDatabaseId
            java.lang.String r3 = r8.name
            java.lang.String r4 = r8.description
            java.lang.String r5 = r8.code
            boolean r8 = r8.enabled
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Cheat(id="
            r6.<init>(r7)
            r6.append(r0)
            java.lang.String r0 = ", cheatDatabaseId="
            r6.append(r0)
            r6.append(r1)
            java.lang.String r0 = ", name="
            java.lang.String r1 = ", description="
            defpackage.i61.B(r6, r0, r3, r1, r4)
            java.lang.String r0 = ", code="
            r6.append(r0)
            r6.append(r5)
            java.lang.String r0 = ", enabled="
            r6.append(r0)
            r6.append(r8)
            java.lang.String r8 = ")"
            r6.append(r8)
            java.lang.String r8 = r6.toString()
            return r8
    }
}
