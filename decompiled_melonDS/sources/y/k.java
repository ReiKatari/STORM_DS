package y;

import android.hardware.camera2.params.OutputConfiguration;
import java.util.Objects;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final OutputConfiguration f14644a;

    /* renamed from: b  reason: collision with root package name */
    public String f14645b;

    /* renamed from: c  reason: collision with root package name */
    public long f14646c = 1;

    public k(OutputConfiguration outputConfiguration) {
        this.f14644a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (this.f14644a.equals(kVar.f14644a) && this.f14646c == kVar.f14646c && Objects.equals(this.f14645b, kVar.f14645b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f14644a.hashCode() ^ 31;
        int i2 = (hashCode2 << 5) - hashCode2;
        String str = this.f14645b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i10 = hashCode ^ i2;
        return Long.hashCode(this.f14646c) ^ ((i10 << 5) - i10);
    }
}
