package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jn4  reason: default package */
/* loaded from: classes.dex */
public final class jn4 extends Handler {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jn4(Looper looper, int i) {
        super(looper);
        this.a = i;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        boolean z;
        Bitmap bitmap;
        switch (this.a) {
            case 0:
                int i = message.what;
                if (i != 3) {
                    if (i != 8) {
                        if (i == 13) {
                            List list = (List) message.obj;
                            int size = list.size();
                            for (int i2 = 0; i2 < size; i2++) {
                                ex2 ex2Var = (ex2) list.get(i2);
                                nn4 nn4Var = ex2Var.a;
                                nn4Var.getClass();
                                if (qw3.shouldReadFromMemoryCache(0)) {
                                    ts3 ts3Var = (ts3) ((ss3) nn4Var.d.B).get(ex2Var.d);
                                    if (ts3Var != null) {
                                        bitmap = ts3Var.a;
                                    } else {
                                        bitmap = null;
                                    }
                                    af6 af6Var = nn4Var.e;
                                    if (bitmap != null) {
                                        af6Var.b.sendEmptyMessage(0);
                                    } else {
                                        af6Var.b.sendEmptyMessage(1);
                                    }
                                } else {
                                    bitmap = null;
                                }
                                if (bitmap != null) {
                                    nn4Var.b(bitmap, ln4.MEMORY, ex2Var, null);
                                } else {
                                    nn4Var.c(ex2Var);
                                }
                            }
                            return;
                        }
                        throw new AssertionError("Unknown handler message received: " + message.what);
                    }
                    List list2 = (List) message.obj;
                    int size2 = list2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        x20 x20Var = (x20) list2.get(i3);
                        nn4 nn4Var2 = x20Var.B;
                        nn4Var2.getClass();
                        ex2 ex2Var2 = x20Var.e0;
                        ArrayList arrayList = x20Var.f0;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (ex2Var2 != null || z) {
                            Object obj = x20Var.Z.B;
                            Exception exc = x20Var.j0;
                            Bitmap bitmap2 = x20Var.g0;
                            ln4 ln4Var = x20Var.i0;
                            if (ex2Var2 != null) {
                                nn4Var2.b(bitmap2, ln4Var, ex2Var2, exc);
                            }
                            if (z) {
                                int size3 = arrayList.size();
                                for (int i4 = 0; i4 < size3; i4++) {
                                    nn4Var2.b(bitmap2, ln4Var, (ex2) arrayList.get(i4), exc);
                                }
                            }
                        }
                    }
                    return;
                }
                ex2 ex2Var3 = (ex2) message.obj;
                ex2Var3.a.getClass();
                ex2Var3.a.a(ex2Var3.a());
                return;
            default:
                sendMessageDelayed(obtainMessage(), 1000L);
                return;
        }
    }
}
