package defpackage;

import android.content.Context;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g71  reason: default package */
/* loaded from: classes.dex */
public final class g71 implements f92 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ g71(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [wr0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [wr0, java.lang.Object] */
    @Override // defpackage.n55
    public final Object get() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return new bt(12, (Context) ((g71) obj).b, new Object(), new Object(), false);
            case 1:
                return obj;
            case 2:
                return new i36(new Object(), new Object(), iy.f, (l66) ((g71) obj).get());
            default:
                List list = l66.L;
                return new l66((Context) ((n55) obj).get(), 4, "com.google.android.datatransport.events");
        }
    }
}
