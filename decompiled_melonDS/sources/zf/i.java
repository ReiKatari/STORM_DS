package zf;

import android.content.Context;
import cd.h1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;
import l.i0;
import mf.a;
import oe.v;
import oe.w;
import oe.x;
import oe.y;
import pd.c0;
import pd.e0;
import pd.k0;
import pd.t;
import zb.m;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i implements k {

    /* renamed from: a  reason: collision with root package name */
    public final Context f15076a;

    /* renamed from: b  reason: collision with root package name */
    public final od.c f15077b;

    public i(Context context, od.c cVar) {
        this.f15076a = context;
        this.f15077b = cVar;
    }

    @Override // zf.k
    public final int a() {
        return 33;
    }

    @Override // zf.k
    public final int b() {
        return 34;
    }

    @Override // zf.k
    public final void c() {
        x vVar;
        od.c cVar = this.f15077b;
        File file = new File(this.f15076a.getFilesDir(), "controller_config.json");
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            jd.a serializer = cg.a.Companion.serializer();
            serializer.getClass();
            i0 i0Var = new i0(fileInputStream);
            pd.k kVar = (pd.k) i0Var.B;
            try {
                c0 c0Var = new c0(i0Var, pd.i.L.h(16384));
                Object t5 = new e0(cVar, k0.OBJ, c0Var, serializer.e(), null).t(serializer);
                c0Var.n();
                c0Var.C();
                kVar.getClass();
                pd.e eVar = pd.e.L;
                byte[] array = kVar.f11595c.array();
                array.getClass();
                eVar.getClass();
                eVar.e(array);
                cg.a aVar = (cg.a) t5;
                fileInputStream.close();
                List<cg.b> g10 = aVar.g();
                ArrayList arrayList = new ArrayList(m.G(g10, 10));
                for (cg.b bVar : g10) {
                    if (bVar.j() == -1) {
                        vVar = w.f10961a;
                    } else {
                        vVar = new v(bVar.j(), null);
                    }
                    arrayList.add(new y(bVar.h(), vVar, 4));
                }
                oe.j jVar = new oe.j(arrayList);
                a.b bVar2 = mf.a.Companion;
                bVar2.getClass();
                mf.a a10 = a.b.a(jVar);
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                jd.a serializer2 = bVar2.serializer();
                serializer2.getClass();
                h1 h1Var = new h1(fileOutputStream);
                byte[] bArr = (byte[]) h1Var.L;
                t.i(cVar, h1Var, serializer2, a10);
                h1Var.e();
                pd.h hVar = pd.h.L;
                char[] cArr = (char[]) h1Var.R;
                hVar.getClass();
                cArr.getClass();
                hVar.f(cArr);
                pd.f fVar = pd.f.L;
                fVar.getClass();
                bArr.getClass();
                fVar.e(bArr);
                fileOutputStream.close();
            } catch (Throwable th2) {
                kVar.getClass();
                pd.e eVar2 = pd.e.L;
                byte[] array2 = kVar.f11595c.array();
                array2.getClass();
                eVar2.getClass();
                eVar2.e(array2);
                throw th2;
            }
        } catch (Exception unused) {
            file.delete();
        }
    }
}
