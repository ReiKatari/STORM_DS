package me.magnum.melonds.domain.model.retroachievements;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class RASimpleLeaderboard {
    public static final int $stable = 0;
    private final java.lang.String format;
    private final long id;
    private final java.lang.String memoryAddress;

    public RASimpleLeaderboard(long r1, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r3.getClass()
            r4.getClass()
            r0.<init>()
            r0.id = r1
            r0.memoryAddress = r3
            r0.format = r4
            return
    }

    public static /* synthetic */ me.magnum.melonds.domain.model.retroachievements.RASimpleLeaderboard copy$default(me.magnum.melonds.domain.model.retroachievements.RASimpleLeaderboard r0, long r1, java.lang.String r3, java.lang.String r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            long r1 = r0.id
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Lc
            java.lang.String r3 = r0.memoryAddress
        Lc:
            r5 = r5 & 4
            if (r5 == 0) goto L12
            java.lang.String r4 = r0.format
        L12:
            me.magnum.melonds.domain.model.retroachievements.RASimpleLeaderboard r0 = r0.copy(r1, r3, r4)
            return r0
    }

    public final long component1() {
            r2 = this;
            long r0 = r2.id
            return r0
    }

    public final java.lang.String component2() {
            r0 = this;
            java.lang.String r0 = r0.memoryAddress
            return r0
    }

    public final java.lang.String component3() {
            r0 = this;
            java.lang.String r0 = r0.format
            return r0
    }

    public final me.magnum.melonds.domain.model.retroachievements.RASimpleLeaderboard copy(long r1, java.lang.String r3, java.lang.String r4) {
            r0 = this;
            r3.getClass()
            r4.getClass()
            me.magnum.melonds.domain.model.retroachievements.RASimpleLeaderboard r0 = new me.magnum.melonds.domain.model.retroachievements.RASimpleLeaderboard
            r0.<init>(r1, r3, r4)
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof me.magnum.melonds.domain.model.retroachievements.RASimpleLeaderboard
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            me.magnum.melonds.domain.model.retroachievements.RASimpleLeaderboard r8 = (me.magnum.melonds.domain.model.retroachievements.RASimpleLeaderboard) r8
            long r3 = r7.id
            long r5 = r8.id
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            java.lang.String r1 = r7.memoryAddress
            java.lang.String r3 = r8.memoryAddress
            boolean r1 = defpackage.nb3.k(r1, r3)
            if (r1 != 0) goto L20
            return r2
        L20:
            java.lang.String r7 = r7.format
            java.lang.String r8 = r8.format
            boolean r7 = defpackage.nb3.k(r7, r8)
            if (r7 != 0) goto L2b
            return r2
        L2b:
            return r0
    }

    public final java.lang.String getFormat() {
            r0 = this;
            java.lang.String r0 = r0.format
            return r0
    }

    public final long getId() {
            r2 = this;
            long r0 = r2.id
            return r0
    }

    public final java.lang.String getMemoryAddress() {
            r0 = this;
            java.lang.String r0 = r0.memoryAddress
            return r0
    }

    public int hashCode() {
            r3 = this;
            long r0 = r3.id
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            java.lang.String r2 = r3.memoryAddress
            int r0 = defpackage.xg6.d(r0, r1, r2)
            java.lang.String r3 = r3.format
            int r3 = r3.hashCode()
            int r3 = r3 + r0
            return r3
    }

    public java.lang.String toString() {
            r5 = this;
            long r0 = r5.id
            java.lang.String r2 = r5.memoryAddress
            java.lang.String r5 = r5.format
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "RASimpleLeaderboard(id="
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = ", memoryAddress="
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = ", format="
            r3.append(r0)
            r3.append(r5)
            java.lang.String r5 = ")"
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            return r5
    }
}
