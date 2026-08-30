package zf;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import kf.d2;
import kf.l0;
import oe.f0;
import yb.l;
import zb.q;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements k {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f15065a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f15066b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f15067c;

    /* renamed from: d  reason: collision with root package name */
    public final Object f15068d;

    public /* synthetic */ b(Object obj, Object obj2, Object obj3, int i2) {
        this.f15065a = i2;
        this.f15066b = obj;
        this.f15067c = obj2;
        this.f15068d = obj3;
    }

    @Override // zf.k
    public final int a() {
        switch (this.f15065a) {
            case 0:
                return 20;
            default:
                return 21;
        }
    }

    @Override // zf.k
    public final int b() {
        switch (this.f15065a) {
            case 0:
                return 21;
            default:
                return 22;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6, types: [yb.k] */
    @Override // zf.k
    public final void c() {
        Uri uri;
        String f8;
        Object kVar;
        BufferedInputStream bufferedInputStream;
        List kVar2;
        switch (this.f15065a) {
            case 0:
                d2 d2Var = (d2) ((cf.d) this.f15066b);
                Uri[] d4 = d2Var.d();
                if (d4.length == 0) {
                    uri = null;
                } else {
                    uri = d4[0];
                }
                if (uri != null && ((sd.d) this.f15068d).a(uri, sd.f.READ_WRITE) != sd.c.OK) {
                    ((l0) ((cf.c) this.f15067c)).f();
                    SharedPreferences.Editor edit = d2Var.f8181b.edit();
                    edit.putStringSet("rom_search_dirs", null);
                    edit.apply();
                    return;
                }
                return;
            default:
                ua.h hVar = (ua.h) this.f15067c;
                Context context = (Context) this.f15066b;
                File file = new File(context.getFilesDir(), "rom_data.json");
                boolean isFile = file.isFile();
                List<bg.a> list = q.A;
                if (isFile) {
                    Type type = new bb.a().f2156b;
                    type.getClass();
                    try {
                        kVar2 = (List) hVar.b(new FileReader(file), type);
                    } catch (Throwable th2) {
                        kVar2 = new yb.k(th2);
                    }
                    if (l.a(kVar2) == null) {
                        list = kVar2;
                    }
                    list = list;
                }
                ArrayList arrayList = new ArrayList();
                for (bg.a aVar : list) {
                    k6.a a10 = ((be.c) this.f15068d).a(aVar.l());
                    bg.b bVar = null;
                    if (a10 != null && (f8 = a10.f()) != null) {
                        try {
                            InputStream openInputStream = context.getContentResolver().openInputStream(aVar.l());
                            if (openInputStream != null) {
                                if (openInputStream instanceof BufferedInputStream) {
                                    bufferedInputStream = (BufferedInputStream) openInputStream;
                                } else {
                                    bufferedInputStream = new BufferedInputStream(openInputStream, 8192);
                                }
                                kVar = a.a.H(bufferedInputStream);
                                openInputStream.close();
                            } else {
                                kVar = null;
                            }
                        } catch (Throwable th3) {
                            kVar = new yb.k(th3);
                        }
                        if (kVar instanceof yb.k) {
                            kVar = null;
                        }
                        f0 f0Var = (f0) kVar;
                        if (f0Var != null) {
                            bVar = new bg.b(aVar.j(), f8, aVar.l(), aVar.k(), aVar.h(), aVar.i(), f0Var.f10931c);
                        }
                    }
                    if (bVar != null) {
                        arrayList.add(bVar);
                    }
                }
                OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(new File(context.getFilesDir(), "rom_data.json")));
                try {
                    outputStreamWriter.write(hVar.e(arrayList));
                    outputStreamWriter.close();
                    return;
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        l0.f.f(outputStreamWriter, th4);
                        throw th5;
                    }
                }
        }
    }
}
