package com.squareup.picasso;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f3279a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Looper looper, int i2) {
        super(looper);
        this.f3279a = i2;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        boolean z10;
        Bitmap bitmap;
        switch (this.f3279a) {
            case 0:
                int i2 = message.what;
                if (i2 != 3) {
                    if (i2 != 8) {
                        if (i2 == 13) {
                            List list = (List) message.obj;
                            int size = list.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                n nVar = (n) list.get(i10);
                                a0 a0Var = nVar.f3265a;
                                if (r.shouldReadFromMemoryCache(0)) {
                                    p pVar = (p) ((o) a0Var.f3185d.B).get(nVar.f3268d);
                                    if (pVar != null) {
                                        bitmap = pVar.f3273a;
                                    } else {
                                        bitmap = null;
                                    }
                                    g0 g0Var = a0Var.f3186e;
                                    if (bitmap != null) {
                                        g0Var.f3218b.sendEmptyMessage(0);
                                    } else {
                                        g0Var.f3218b.sendEmptyMessage(1);
                                    }
                                } else {
                                    bitmap = null;
                                }
                                if (bitmap != null) {
                                    a0Var.b(bitmap, y.MEMORY, nVar, null);
                                } else {
                                    a0Var.c(nVar);
                                }
                            }
                            return;
                        }
                        throw new AssertionError("Unknown handler message received: " + message.what);
                    }
                    List list2 = (List) message.obj;
                    int size2 = list2.size();
                    for (int i11 = 0; i11 < size2; i11++) {
                        e eVar = (e) list2.get(i11);
                        a0 a0Var2 = eVar.B;
                        a0Var2.getClass();
                        n nVar2 = eVar.f3203d0;
                        ArrayList arrayList = eVar.f3204e0;
                        if (arrayList != null && !arrayList.isEmpty()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (nVar2 != null || z10) {
                            Object obj = eVar.Z.B;
                            Exception exc = eVar.f3208i0;
                            Bitmap bitmap2 = eVar.f3205f0;
                            y yVar = eVar.f3207h0;
                            if (nVar2 != null) {
                                a0Var2.b(bitmap2, yVar, nVar2, exc);
                            }
                            if (z10) {
                                int size3 = arrayList.size();
                                for (int i12 = 0; i12 < size3; i12++) {
                                    a0Var2.b(bitmap2, yVar, (n) arrayList.get(i12), exc);
                                }
                            }
                        }
                    }
                    return;
                }
                n nVar3 = (n) message.obj;
                nVar3.f3265a.a(nVar3.a());
                return;
            default:
                sendMessageDelayed(obtainMessage(), 1000L);
                return;
        }
    }
}
