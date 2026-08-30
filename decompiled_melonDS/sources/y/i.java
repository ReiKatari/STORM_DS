package y;

import android.hardware.camera2.params.OutputConfiguration;
import java.util.Objects;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public final OutputConfiguration f14639a;

    /* renamed from: b  reason: collision with root package name */
    public String f14640b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f14641c;

    /* renamed from: d  reason: collision with root package name */
    public long f14642d = 1;

    public i(OutputConfiguration outputConfiguration) {
        this.f14639a = outputConfiguration;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.f14639a.equals(iVar.f14639a) && this.f14641c == iVar.f14641c && this.f14642d == iVar.f14642d && Objects.equals(this.f14640b, iVar.f14640b)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2 = this.f14639a.hashCode() ^ 31;
        int i2 = (this.f14641c ? 1 : 0) ^ ((hashCode2 << 5) - hashCode2);
        int i10 = (i2 << 5) - i2;
        String str = this.f14640b;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i11 = hashCode ^ i10;
        return Long.hashCode(this.f14642d) ^ ((i11 << 5) - i11);
    }
}
