package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ow4  reason: default package */
/* loaded from: classes.dex */
public final class ow4 extends Handler {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ow4(Looper looper, int i) {
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
                                i33 i33Var = (i33) list.get(i2);
                                sw4 sw4Var = i33Var.a;
                                sw4Var.getClass();
                                if (e44.shouldReadFromMemoryCache(0)) {
                                    xz3 xz3Var = (xz3) ((nr1) sw4Var.d.B).get(i33Var.d);
                                    if (xz3Var != null) {
                                        bitmap = xz3Var.a;
                                    } else {
                                        bitmap = null;
                                    }
                                    pq6 pq6Var = sw4Var.e;
                                    if (bitmap != null) {
                                        pq6Var.b.sendEmptyMessage(0);
                                    } else {
                                        pq6Var.b.sendEmptyMessage(1);
                                    }
                                } else {
                                    bitmap = null;
                                }
                                if (bitmap != null) {
                                    sw4Var.b(bitmap, qw4.MEMORY, i33Var, null);
                                } else {
                                    sw4Var.c(i33Var);
                                }
                            }
                            return;
                        }
                        throw new AssertionError("Unknown handler message received: " + message.what);
                    }
                    List list2 = (List) message.obj;
                    int size2 = list2.size();
                    for (int i3 = 0; i3 < size2; i3++) {
                        v40 v40Var = (v40) list2.get(i3);
                        sw4 sw4Var2 = v40Var.B;
                        sw4Var2.getClass();
                        i33 i33Var2 = v40Var.f0;
                        ArrayList arrayList = v40Var.g0;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (i33Var2 != null || z) {
                            Object obj = v40Var.Z.B;
                            Exception exc = v40Var.k0;
                            Bitmap bitmap2 = v40Var.h0;
                            qw4 qw4Var = v40Var.j0;
                            if (i33Var2 != null) {
                                sw4Var2.b(bitmap2, qw4Var, i33Var2, exc);
                            }
                            if (z) {
                                int size3 = arrayList.size();
                                for (int i4 = 0; i4 < size3; i4++) {
                                    sw4Var2.b(bitmap2, qw4Var, (i33) arrayList.get(i4), exc);
                                }
                            }
                        }
                    }
                    return;
                }
                i33 i33Var3 = (i33) message.obj;
                i33Var3.a.getClass();
                i33Var3.a.a(i33Var3.a());
                return;
            default:
                sendMessageDelayed(obtainMessage(), 1000L);
                return;
        }
    }
}
