package defpackage;

import android.util.Log;
import defpackage.mw5;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hb2  reason: default package */
/* loaded from: classes.dex */
public final class hb2 implements ne2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ xb2 B;

    public /* synthetic */ hb2(xb2 xb2Var, int i) {
        this.A = i;
        this.B = xb2Var;
    }

    @Override // defpackage.ne2
    public final Object a(Object obj, r41 r41Var) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        xb2 xb2Var = this.B;
        switch (i) {
            case 0:
                List<pq5> list = (List) obj;
                if (!xb2Var.v.compareAndSet(true, false)) {
                    File file = new File(xb2Var.a.getFilesDir(), "rom_data.json");
                    try {
                        ArrayList arrayList = new ArrayList(ht0.v0(list, 10));
                        for (pq5 pq5Var : list) {
                            arrayList.add(mw5.a.a(pq5Var));
                        }
                        xb2.E(file, xb2Var.b.f(arrayList));
                        xb2Var.x(list);
                        xb2Var.f.i();
                    } catch (Exception e) {
                        Log.e("FSRomsRepository", "Failed to save ROM data", e);
                    }
                }
                return jg7Var;
            case 1:
                xb2.a(xb2Var, (pq5) obj);
                return jg7Var;
            default:
                xb2.a(xb2Var, (pq5) obj);
                return jg7Var;
        }
    }
}
