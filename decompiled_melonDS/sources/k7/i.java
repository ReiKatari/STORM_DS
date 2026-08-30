package k7;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i extends RemoteCallbackList {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ MultiInstanceInvalidationService f8022a;

    public i(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.f8022a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        ((e) iInterface).getClass();
        obj.getClass();
        this.f8022a.B.remove((Integer) obj);
    }
}
