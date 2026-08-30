package y;

import android.hardware.camera2.params.OutputConfiguration;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    public final OutputConfiguration f14647a;

    /* renamed from: b  reason: collision with root package name */
    public long f14648b = 1;

    public m(OutputConfiguration outputConfiguration) {
        this.f14647a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof m) {
            m mVar = (m) obj;
            if (this.f14647a.equals(mVar.f14647a) && this.f14648b == mVar.f14648b) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f14647a.hashCode() ^ 31;
        return Long.hashCode(this.f14648b) ^ ((hashCode << 5) - hashCode);
    }
}
