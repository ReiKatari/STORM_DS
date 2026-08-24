package me.magnum.melonds.domain.model.retroachievements;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class RASimpleRuntimeAchievement {
    public static final int $stable = 0;
    private final long id;
    private final int target;
    private final int value;

    public RASimpleRuntimeAchievement(long r1, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.id = r1
            r0.value = r3
            r0.target = r4
            return
    }

    public static /* synthetic */ me.magnum.melonds.domain.model.retroachievements.RASimpleRuntimeAchievement copy$default(me.magnum.melonds.domain.model.retroachievements.RASimpleRuntimeAchievement r0, long r1, int r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            long r1 = r0.id
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Lc
            int r3 = r0.value
        Lc:
            r5 = r5 & 4
            if (r5 == 0) goto L12
            int r4 = r0.target
        L12:
            me.magnum.melonds.domain.model.retroachievements.RASimpleRuntimeAchievement r0 = r0.copy(r1, r3, r4)
            return r0
    }

    public final long component1() {
            r2 = this;
            long r0 = r2.id
            return r0
    }

    public final int component2() {
            r0 = this;
            int r0 = r0.value
            return r0
    }

    public final int component3() {
            r0 = this;
            int r0 = r0.target
            return r0
    }

    public final me.magnum.melonds.domain.model.retroachievements.RASimpleRuntimeAchievement copy(long r1, int r3, int r4) {
            r0 = this;
            me.magnum.melonds.domain.model.retroachievements.RASimpleRuntimeAchievement r0 = new me.magnum.melonds.domain.model.retroachievements.RASimpleRuntimeAchievement
            r0.<init>(r1, r3, r4)
            return r0
    }

    public boolean equals(java.lang.Object r8) {
            r7 = this;
            r0 = 1
            if (r7 != r8) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof me.magnum.melonds.domain.model.retroachievements.RASimpleRuntimeAchievement
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            me.magnum.melonds.domain.model.retroachievements.RASimpleRuntimeAchievement r8 = (me.magnum.melonds.domain.model.retroachievements.RASimpleRuntimeAchievement) r8
            long r3 = r7.id
            long r5 = r8.id
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L15
            return r2
        L15:
            int r1 = r7.value
            int r3 = r8.value
            if (r1 == r3) goto L1c
            return r2
        L1c:
            int r7 = r7.target
            int r8 = r8.target
            if (r7 == r8) goto L23
            return r2
        L23:
            return r0
    }

    public final long getId() {
            r2 = this;
            long r0 = r2.id
            return r0
    }

    public final int getTarget() {
            r0 = this;
            int r0 = r0.target
            return r0
    }

    public final int getValue() {
            r0 = this;
            int r0 = r0.value
            return r0
    }

    public int hashCode() {
            r3 = this;
            long r0 = r3.id
            int r0 = java.lang.Long.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.value
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r3 = r3.target
            int r3 = java.lang.Integer.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public java.lang.String toString() {
            r5 = this;
            long r0 = r5.id
            int r2 = r5.value
            int r5 = r5.target
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "RASimpleRuntimeAchievement(id="
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = ", value="
            r3.append(r0)
            r3.append(r2)
            java.lang.String r0 = ", target="
            r3.append(r0)
            r3.append(r5)
            java.lang.String r5 = ")"
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            return r5
    }
}
