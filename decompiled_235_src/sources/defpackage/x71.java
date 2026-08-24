package defpackage;

import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: x71  reason: default package */
/* loaded from: classes.dex */
public final class x71 extends ContentObserver {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x71(du6 du6Var) {
        super(new Handler());
        this.b = du6Var;
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
                du6 du6Var = (du6) this.b;
                if (du6Var.B && (cursor = du6Var.L) != null && !cursor.isClosed()) {
                    du6Var.A = du6Var.L.requery();
                    return;
                }
                return;
            default:
                super.onChange(z);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x71(v80 v80Var, Handler handler) {
        super(handler);
        this.b = v80Var;
    }

    @Override // android.database.ContentObserver
    public void onChange(boolean z, Uri uri) {
        switch (this.a) {
            case 1:
                ((v80) this.b).c(jg7.a);
                return;
            default:
                super.onChange(z, uri);
                return;
        }
    }
}
