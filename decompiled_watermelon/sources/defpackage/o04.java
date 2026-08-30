package defpackage;

import android.os.IInterface;
import android.os.RemoteCallbackList;
import androidx.room.MultiInstanceInvalidationService;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o04  reason: default package */
/* loaded from: classes.dex */
public final class o04 extends RemoteCallbackList {
    public final /* synthetic */ MultiInstanceInvalidationService a;

    public o04(MultiInstanceInvalidationService multiInstanceInvalidationService) {
        this.a = multiInstanceInvalidationService;
    }

    @Override // android.os.RemoteCallbackList
    public final void onCallbackDied(IInterface iInterface, Object obj) {
        ((su2) iInterface).getClass();
        obj.getClass();
        this.a.B.remove((Integer) obj);
    }
}
