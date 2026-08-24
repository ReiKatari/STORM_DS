package defpackage;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t84  reason: default package */
/* loaded from: classes.dex */
public final class t84 extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService a;

    public t84(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        ((u03) iInterface).getClass();
        obj.getClass();
        this.a.B.remove((Integer) obj);
    }
}
