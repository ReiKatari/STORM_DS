package defpackage;

import android.util.Log;
import defpackage.xl5;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: n62  reason: default package */
/* loaded from: classes.dex */
public final class n62 implements w92 {
    public final /* synthetic */ int A;
    public final /* synthetic */ d72 B;

    public /* synthetic */ n62(d72 d72Var, int i) {
        this.A = i;
        this.B = d72Var;
    }

    @Override // defpackage.w92
    public final Object b(Object obj, j11 j11Var) {
        int i = this.A;
        o27 o27Var = o27.a;
        d72 d72Var = this.B;
        switch (i) {
            case 0:
                List<rg5> list = (List) obj;
                if (!d72Var.v.compareAndSet(true, false)) {
                    File file = new File(d72Var.a.getFilesDir(), "rom_data.json");
                    try {
                        ArrayList arrayList = new ArrayList(uq0.y0(list, 10));
                        for (rg5 rg5Var : list) {
                            arrayList.add(xl5.a.a(rg5Var));
                        }
                        d72.B(file, d72Var.b.f(arrayList));
                        d72Var.u(list);
                        d72Var.f.i();
                    } catch (Exception e) {
                        Log.e("FSRomsRepository", "Failed to save ROM data", e);
                    }
                }
                return o27Var;
            case 1:
                d72.a(d72Var, (rg5) obj);
                return o27Var;
            default:
                d72.a(d72Var, (rg5) obj);
                return o27Var;
        }
    }
}
