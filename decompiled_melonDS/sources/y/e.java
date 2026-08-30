package y;

import android.hardware.camera2.params.InputConfiguration;
import java.util.Objects;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public final InputConfiguration f14636a;

    public e(Object obj) {
        this.f14636a = (InputConfiguration) obj;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        return Objects.equals(this.f14636a, ((e) obj).f14636a);
    }

    public final int hashCode() {
        return this.f14636a.hashCode();
    }

    public final String toString() {
        return this.f14636a.toString();
    }
}
