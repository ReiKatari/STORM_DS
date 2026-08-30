package i4;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final int f6722a;

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            if (this.f6722a != ((i) obj).f6722a) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f6722a);
    }

    public final String toString() {
        int i2 = this.f6722a;
        if (i2 == 0) {
            return "Button";
        }
        if (i2 == 1) {
            return "Checkbox";
        }
        if (i2 == 2) {
            return "Switch";
        }
        if (i2 == 3) {
            return "RadioButton";
        }
        if (i2 == 4) {
            return "Tab";
        }
        if (i2 == 5) {
            return "Image";
        }
        if (i2 == 6) {
            return "DropdownList";
        }
        if (i2 == 7) {
            return "Picker";
        }
        if (i2 == 8) {
            return "Carousel";
        }
        return "Unknown";
    }
}
