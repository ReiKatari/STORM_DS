package te;

import oe.i;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends g {

    /* renamed from: a  reason: collision with root package name */
    public final i f13178a;

    public c(i iVar) {
        this.f13178a = iVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof c) || !this.f13178a.equals(((c) obj).f13178a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.f13178a.hashCode();
    }

    public final String toString() {
        return "BiosConfigurationIncorrect(configurationDirectoryResult=" + this.f13178a + ")";
    }
}
