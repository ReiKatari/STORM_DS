package me.magnum.melonds.domain.model;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class Rect {
    public static final int $stable = 0;
    private final int height;
    private final int width;
    private final int x;
    private final int y;

    public Rect(int r1, int r2, int r3, int r4) {
            r0 = this;
            r0.<init>()
            r0.x = r1
            r0.y = r2
            r0.width = r3
            r0.height = r4
            return
    }

    public static /* synthetic */ me.magnum.melonds.domain.model.Rect copy$default(me.magnum.melonds.domain.model.Rect r0, int r1, int r2, int r3, int r4, int r5, java.lang.Object r6) {
            r6 = r5 & 1
            if (r6 == 0) goto L6
            int r1 = r0.x
        L6:
            r6 = r5 & 2
            if (r6 == 0) goto Lc
            int r2 = r0.y
        Lc:
            r6 = r5 & 4
            if (r6 == 0) goto L12
            int r3 = r0.width
        L12:
            r5 = r5 & 8
            if (r5 == 0) goto L18
            int r4 = r0.height
        L18:
            me.magnum.melonds.domain.model.Rect r0 = r0.copy(r1, r2, r3, r4)
            return r0
    }

    public final int component1() {
            r0 = this;
            int r0 = r0.x
            return r0
    }

    public final int component2() {
            r0 = this;
            int r0 = r0.y
            return r0
    }

    public final int component3() {
            r0 = this;
            int r0 = r0.width
            return r0
    }

    public final int component4() {
            r0 = this;
            int r0 = r0.height
            return r0
    }

    public final boolean contains(me.magnum.melonds.domain.model.Rect r3) {
            r2 = this;
            r3.getClass()
            int r0 = r2.x
            int r1 = r3.x
            if (r0 > r1) goto L25
            int r0 = r2.y
            int r1 = r3.y
            if (r0 > r1) goto L25
            int r0 = r2.getRight()
            int r1 = r3.getRight()
            if (r0 < r1) goto L25
            int r2 = r2.getBottom()
            int r3 = r3.getBottom()
            if (r2 < r3) goto L25
            r2 = 1
            return r2
        L25:
            r2 = 0
            return r2
    }

    public final me.magnum.melonds.domain.model.Rect copy(int r1, int r2, int r3, int r4) {
            r0 = this;
            me.magnum.melonds.domain.model.Rect r0 = new me.magnum.melonds.domain.model.Rect
            r0.<init>(r1, r2, r3, r4)
            return r0
    }

    public boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r4 != r5) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof me.magnum.melonds.domain.model.Rect
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            me.magnum.melonds.domain.model.Rect r5 = (me.magnum.melonds.domain.model.Rect) r5
            int r1 = r4.x
            int r3 = r5.x
            if (r1 == r3) goto L13
            return r2
        L13:
            int r1 = r4.y
            int r3 = r5.y
            if (r1 == r3) goto L1a
            return r2
        L1a:
            int r1 = r4.width
            int r3 = r5.width
            if (r1 == r3) goto L21
            return r2
        L21:
            int r4 = r4.height
            int r5 = r5.height
            if (r4 == r5) goto L28
            return r2
        L28:
            return r0
    }

    public final int getBottom() {
            r1 = this;
            int r0 = r1.y
            int r1 = r1.height
            int r0 = r0 + r1
            return r0
    }

    public final int getHeight() {
            r0 = this;
            int r0 = r0.height
            return r0
    }

    public final int getRight() {
            r1 = this;
            int r0 = r1.x
            int r1 = r1.width
            int r0 = r0 + r1
            return r0
    }

    public final int getWidth() {
            r0 = this;
            int r0 = r0.width
            return r0
    }

    public final int getX() {
            r0 = this;
            int r0 = r0.x
            return r0
    }

    public final int getY() {
            r0 = this;
            int r0 = r0.y
            return r0
    }

    public int hashCode() {
            r3 = this;
            int r0 = r3.x
            int r0 = java.lang.Integer.hashCode(r0)
            r1 = 31
            int r0 = r0 * r1
            int r2 = r3.y
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r2 = r3.width
            int r0 = defpackage.lb1.a(r2, r0, r1)
            int r3 = r3.height
            int r3 = java.lang.Integer.hashCode(r3)
            int r3 = r3 + r0
            return r3
    }

    public java.lang.String toString() {
            r6 = this;
            int r0 = r6.x
            int r1 = r6.y
            int r2 = r6.width
            int r6 = r6.height
            java.lang.String r3 = ", y="
            java.lang.String r4 = ", width="
            java.lang.String r5 = "Rect(x="
            java.lang.StringBuilder r0 = defpackage.i61.q(r0, r1, r5, r3, r4)
            r0.append(r2)
            java.lang.String r1 = ", height="
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = ")"
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            return r6
    }
}
