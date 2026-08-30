package kf;

import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;
import me.magnum.melonds.common.camera.DSiCameraSource;
import of.b;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d0 implements cd.i {
    public final /* synthetic */ int A;
    public final /* synthetic */ l0 B;

    public /* synthetic */ d0(l0 l0Var, int i2) {
        this.A = i2;
        this.B = l0Var;
    }

    @Override // cd.i
    public final Object a(Object obj, cc.c cVar) {
        switch (this.A) {
            case 0:
                List<ze.a> list = (List) obj;
                l0 l0Var = this.B;
                File file = new File(l0Var.f8244a.getFilesDir(), "rom_data.json");
                try {
                    ArrayList arrayList = new ArrayList(zb.m.G(list, 10));
                    for (ze.a aVar : list) {
                        arrayList.add(b.a.a(aVar));
                    }
                    String e6 = l0Var.f8245b.e(arrayList);
                    OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file));
                    outputStreamWriter.write(e6);
                    outputStreamWriter.close();
                } catch (Exception e10) {
                    Log.e("FSRomsRepository", "Failed to save ROM data", e10);
                }
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                l0.a(this.B, (ze.a) obj);
                return yb.y.f14813a;
            default:
                l0.a(this.B, (ze.a) obj);
                return yb.y.f14813a;
        }
    }
}
