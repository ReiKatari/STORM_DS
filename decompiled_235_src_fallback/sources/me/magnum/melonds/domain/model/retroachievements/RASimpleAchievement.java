package me.magnum.melonds.domain.model.retroachievements;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class RASimpleAchievement {
    public static final int $stable = 0;
    private final long id;
    private final java.lang.String memoryAddress;

    public RASimpleAchievement(long r1, java.lang.String r3) {
            r0 = this;
            r3.getClass()
            r0.<init>()
            r0.id = r1
            r0.memoryAddress = r3
            return
    }

    public static /* synthetic */ me.magnum.melonds.domain.model.retroachievements.RASimpleAchievement copy$default(me.magnum.melonds.domain.model.retroachievements.RASimpleAchievement r0, long r1, java.lang.String r3, int r4, java.lang.Object r5) {
            r5 = r4 & 1
            if (r5 == 0) goto L6
            long r1 = r0.id
        L6:
            r4 = r4 & 2
            if (r4 == 0) goto Lc
            java.lang.String r3 = r0.memoryAddress
        Lc:
            me.magnum.melonds.domain.model.retroachievements.RASimpleAchievement r0 = r0.copy(r1, r3)
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

    public final me.magnum.melonds.domain.model.retroachievements.RASimpleAchievement copy(long r1, java.lang.String r3) {
            r0 = this;
            r3.getClass()
            me.magnum.melonds.domain.model.retroachievements.RASimpleAchievement r0 = new me.magnum.melonds.domain.model.retroachievements.RASimpleAchievement
            r0.<init>(r1, r3)
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof me.magnum.melonds.domain.model.retroachievements.RASimpleAchievement
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            me.magnum.melonds.domain.model.retroachievements.RASimpleAchievement r8 = (me.magnum.melonds.domain.model.retroachievements.RASimpleAchievement) r8
            long r3 = r7.id
            long r5 = r8.id
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            java.lang.String r7 = r7.memoryAddress
            java.lang.String r8 = r8.memoryAddress
            boolean r7 = defpackage.nb3.k(r7, r8)
            if (r7 != 0) goto L20
            return r2
        L20:
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
            r2 = this;
            long r0 = r2.id
            int r0 = java.lang.Long.hashCode(r0)
            int r0 = r0 * 31
            java.lang.String r2 = r2.memoryAddress
            int r2 = r2.hashCode()
            int r2 = r2 + r0
            return r2
    }

    public java.lang.String toString() {
            r4 = this;
            long r0 = r4.id
            java.lang.String r4 = r4.memoryAddress
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "RASimpleAchievement(id="
            r2.<init>(r3)
            r2.append(r0)
            java.lang.String r0 = ", memoryAddress="
            r2.append(r0)
            r2.append(r4)
            java.lang.String r4 = ")"
            r2.append(r4)
            java.lang.String r4 = r2.toString()
            return r4
    }
}
