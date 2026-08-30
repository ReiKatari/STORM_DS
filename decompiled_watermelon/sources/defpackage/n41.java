package defpackage;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n41  reason: default package */
/* loaded from: classes.dex */
public final class n41 extends ContentObserver {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n41(ji6 ji6Var) {
        super(new Handler());
        this.b = ji6Var;
    }

    @Override // android.database.ContentObserver
    public boolean deliverSelfNotifications() {
        switch (this.a) {
            case 0:
                return true;
            default:
                return super.deliverSelfNotifications();
        }
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z) {
        Cursor cursor;
        switch (this.a) {
            case 0:
                ji6 ji6Var = (ji6) this.b;
                if (ji6Var.B && (cursor = ji6Var.L) != null && !cursor.isClosed()) {
                    ji6Var.A = ji6Var.L.requery();
                    return;
                }
                return;
            default:
                super.onChange(z);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n41(q60 q60Var, Handler handler) {
        super(handler);
        this.b = q60Var;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z, Uri uri) {
        switch (this.a) {
            case 1:
                ((q60) this.b).c(o27.a);
                return;
            default:
                super.onChange(z, uri);
                return;
        }
    }
}
