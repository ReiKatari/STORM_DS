package te;

import oe.i;
import p7.t;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends t {

    /* renamed from: d  reason: collision with root package name */
    public final i f13176d;

    public a(i iVar) {
        this.f13176d = iVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof a) || !this.f13176d.equals(((a) obj).f13176d)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f13176d.hashCode();
    }

    public final String toString() {
        return "BiosConfigurationIncorrect(configurationDirectoryResult=" + this.f13176d + ")";
    }
}
