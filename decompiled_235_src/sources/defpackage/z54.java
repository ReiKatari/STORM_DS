package defpackage;

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
import java.util.Date;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z54  reason: default package */
/* loaded from: classes.dex */
public final class z54 implements y54 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;
    public final Object d;

    public /* synthetic */ z54(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // defpackage.y54
    public final int a() {
        switch (this.a) {
            case 0:
                return 20;
            default:
                return 21;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v4, types: [em5] */
    @Override // defpackage.y54
    public final void b() {
        Object em5Var;
        Object em5Var2;
        oq5 oq5Var;
        boolean z;
        BufferedInputStream bufferedInputStream;
        List em5Var3;
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ng6 ng6Var = (ng6) ((kd6) obj3);
                Uri uri = (Uri) fv.E0(ng6Var.r());
                if (uri != null && ((yj1) obj).a(uri, sv4.READ_WRITE) != xj1.OK) {
                    ((xb2) ((p06) obj2)).q();
                    SharedPreferences.Editor edit = ng6Var.b.edit();
                    edit.putStringSet("rom_search_dirs", null);
                    edit.apply();
                    return;
                }
                return;
            default:
                Context context = (Context) obj3;
                File file = new File(context.getFilesDir(), "rom_data.json");
                boolean isFile = file.isFile();
                List<nq5> list = yt1.A;
                if (isFile) {
                    Type type = new ie7().b;
                    type.getClass();
                    try {
                        em5Var3 = (List) ((su2) obj2).c(new FileReader(file), new ie7(type));
                    } catch (Throwable th) {
                        em5Var3 = new em5(th);
                    }
                    if (hm5.a(em5Var3) == null) {
                        list = em5Var3;
                    }
                    list = list;
                }
                if (!list.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    for (nq5 nq5Var : list) {
                        Uri l = nq5Var.l();
                        if (l == null) {
                            oq5Var = null;
                        } else {
                            try {
                                zl1 a = ((uh7) obj).a(l);
                                if (a != null) {
                                    em5Var = a.i();
                                } else {
                                    em5Var = null;
                                }
                            } catch (Throwable th2) {
                                em5Var = new em5(th2);
                            }
                            if (em5Var instanceof em5) {
                                em5Var = null;
                            }
                            String str = (String) em5Var;
                            if (str == null && (str = nq5Var.j()) == null) {
                                str = "ROM";
                            }
                            String str2 = str;
                            try {
                                InputStream openInputStream = context.getContentResolver().openInputStream(l);
                                if (openInputStream != null) {
                                    if (openInputStream instanceof BufferedInputStream) {
                                        bufferedInputStream = (BufferedInputStream) openInputStream;
                                    } else {
                                        bufferedInputStream = new BufferedInputStream(openInputStream, 8192);
                                    }
                                    em5Var2 = kn2.K(bufferedInputStream);
                                    openInputStream.close();
                                } else {
                                    em5Var2 = null;
                                }
                            } catch (Throwable th3) {
                                em5Var2 = new em5(th3);
                            }
                            if (em5Var2 instanceof em5) {
                                em5Var2 = null;
                            }
                            uz5 uz5Var = (uz5) em5Var2;
                            String j = nq5Var.j();
                            if (j == null) {
                                j = str2;
                            }
                            Uri k = nq5Var.k();
                            it5 h = nq5Var.h();
                            Date i2 = nq5Var.i();
                            if (uz5Var != null) {
                                z = uz5Var.c;
                            } else {
                                z = false;
                            }
                            oq5Var = new oq5(j, str2, l, k, h, i2, z);
                        }
                        if (oq5Var != null) {
                            arrayList.add(oq5Var);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        try {
                            d(arrayList);
                            return;
                        } catch (Throwable unused) {
                            return;
                        }
                    }
                    return;
                }
                return;
        }
    }

    @Override // defpackage.y54
    public final int c() {
        switch (this.a) {
            case 0:
                return 21;
            default:
                return 22;
        }
    }

    public void d(ArrayList arrayList) {
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(new File(((Context) this.b).getFilesDir(), "rom_data.json")));
        try {
            outputStreamWriter.write(((su2) this.c).f(arrayList));
            outputStreamWriter.close();
        } finally {
        }
    }
}
