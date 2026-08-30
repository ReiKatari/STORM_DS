package me.magnum.melonds.domain.model;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public final class Rect {
    public static final int $stable = 0;
    private final int height;
    private final int width;
    private final int x;
    private final int y;

    public Rect(int i, int i2, int i3, int i4) {
        this.x = i;
        this.y = i2;
        this.width = i3;
        this.height = i4;
    }

    public static /* synthetic */ Rect copy$default(Rect rect, int i, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = rect.x;
        }
        if ((i5 & 2) != 0) {
            i2 = rect.y;
        }
        if ((i5 & 4) != 0) {
            i3 = rect.width;
        }
        if ((i5 & 8) != 0) {
            i4 = rect.height;
        }
        return rect.copy(i, i2, i3, i4);
    }

    public final int component1() {
        return this.x;
    }

    public final int component2() {
        return this.y;
    }

    public final int component3() {
        return this.width;
    }

    public final int component4() {
        return this.height;
    }

    public final boolean contains(Rect rect) {
        rect.getClass();
        if (this.x <= rect.x && this.y <= rect.y && getRight() >= rect.getRight() && getBottom() >= rect.getBottom()) {
            return true;
        }
        return false;
    }

    public final Rect copy(int i, int i2, int i3, int i4) {
        return new Rect(i, i2, i3, i4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Rect)) {
            return false;
        }
        Rect rect = (Rect) obj;
        if (this.x == rect.x && this.y == rect.y && this.width == rect.width && this.height == rect.height) {
            return true;
        }
        return false;
    }

    public final int getBottom() {
        return this.y + this.height;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getRight() {
        return this.x + this.width;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getX() {
        return this.x;
    }

    public final int getY() {
        return this.y;
    }

    public int hashCode() {
        return Integer.hashCode(this.height) + wh1.a(this.width, wh1.a(this.y, Integer.hashCode(this.x) * 31, 31), 31);
    }

    public String toString() {
        int i = this.x;
        int i2 = this.y;
        int i3 = this.width;
        int i4 = this.height;
        StringBuilder s = b31.s(i, i2, "Rect(x=", ", y=", ", width=");
        s.append(i3);
        s.append(", height=");
        s.append(i4);
        s.append(")");
        return s.toString();
    }
}
