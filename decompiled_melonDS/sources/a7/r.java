package a7;

import android.os.Bundle;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class r implements mc.l {
    public final /* synthetic */ int A;
    public final /* synthetic */ Bundle B;

    public /* synthetic */ r(int i2, Bundle bundle) {
        this.A = i2;
        this.B = bundle;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        boolean containsKey;
        String str = (String) obj;
        switch (this.A) {
            case 0:
                str.getClass();
                containsKey = this.B.containsKey(str);
                break;
            default:
                str.getClass();
                containsKey = this.B.containsKey(str);
                break;
        }
        return Boolean.valueOf(!containsKey);
    }
}
