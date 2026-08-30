package ji;

import androidx.preference.Preference;
import androidx.preference.o;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements o {

    /* renamed from: a  reason: collision with root package name */
    public final ArrayList f7906a = new ArrayList();

    @Override // androidx.preference.o
    public final boolean a(Preference preference, Object obj) {
        preference.getClass();
        ArrayList arrayList = this.f7906a;
        if (arrayList == null || !arrayList.isEmpty()) {
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj2 = arrayList.get(i2);
                i2++;
                if (!((o) obj2).a(preference, obj)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }
}
