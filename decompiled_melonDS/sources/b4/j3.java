package b4;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j3 extends ContentObserver {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1869a = 0;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1870b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(q.z2 z2Var) {
        super(new Handler());
        this.f1870b = z2Var;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.f1869a) {
            case DSiCameraSource.FrontCamera /* 1 */:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10) {
        Cursor cursor;
        switch (this.f1869a) {
            case DSiCameraSource.FrontCamera /* 1 */:
                q.z2 z2Var = (q.z2) this.f1870b;
                if (z2Var.B && (cursor = z2Var.L) != null && !cursor.isClosed()) {
                    z2Var.A = z2Var.L.requery();
                    return;
                }
                return;
            default:
                super.onChange(z10);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3(bd.h hVar, Handler handler) {
        super(handler);
        this.f1870b = hVar;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z10, Uri uri) {
        switch (this.f1869a) {
            case 0:
                ((bd.h) this.f1870b).a(yb.y.f14813a);
                return;
            default:
                super.onChange(z10, uri);
                return;
        }
    }
}
