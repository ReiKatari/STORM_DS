package hh;

import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y extends z {

    /* renamed from: a  reason: collision with root package name */
    public final List f6585a;

    /* renamed from: b  reason: collision with root package name */
    public final x f6586b;

    public y(List list, x xVar) {
        xVar.getClass();
        this.f6585a = list;
        this.f6586b = xVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof y) {
                y yVar = (y) obj;
                if (!this.f6585a.equals(yVar.f6585a) || this.f6586b != yVar.f6586b) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.f6586b.hashCode() + (this.f6585a.hashCode() * 31);
    }

    public final String toString() {
        return "ShowRomSaveStates(saveStates=" + this.f6585a + ", reason=" + this.f6586b + ")";
    }
}
