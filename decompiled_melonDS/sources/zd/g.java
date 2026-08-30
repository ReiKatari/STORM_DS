package zd;

import a0.j;
import android.app.ActivityManager;
import android.content.Context;
import d1.s;
import ij.i;
import ij.n;
import ij.v;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.nio.file.OpenOption;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Locale;
import kf.d1;
import oe.o0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g extends d {

    /* renamed from: e  reason: collision with root package name */
    public final Context f15052e;

    public g(Context context, be.c cVar, d1 d1Var) {
        super(context, cVar, d1Var);
        this.f15052e = context;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [oj.c, ij.u] */
    @Override // zd.d
    public final i g(InputStream inputStream) {
        o0 o0Var;
        v vVar;
        n nVar;
        InputStream inputStream2;
        byte[] bArr;
        if (inputStream instanceof FileInputStream) {
            ActivityManager activityManager = (ActivityManager) this.f15052e.getSystemService(ActivityManager.class);
            if (activityManager != null) {
                ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                activityManager.getMemoryInfo(memoryInfo);
                o0Var = new o0(memoryInfo.totalMem);
            } else {
                o0Var = new o0(2147483647L);
            }
            ?? cVar = new oj.c();
            cVar.f7134i = "unknown archive";
            cVar.f7135j = (int) ((((float) o0Var.A) * 0.1f) / 1024);
            cVar.f7133h = ((FileInputStream) inputStream).getChannel();
            FileChannel fileChannel = cVar.f7133h;
            if (fileChannel != null) {
                vVar = new v(fileChannel, cVar.f7134i, true, cVar.f7135j);
            } else {
                if (cVar.f11054e != null) {
                    if (cVar.f11055f.length == 0) {
                        OpenOption[] openOptionArr = new OpenOption[1];
                        StandardOpenOption.READ;
                    }
                    oj.a aVar = cVar.f11054e;
                    if (aVar == null) {
                        j.p("origin == null");
                    } else {
                        String simpleName = oj.a.class.getSimpleName();
                        Object obj = aVar.f11052e;
                        throw new UnsupportedOperationException(String.format("%s#getPath() for %s origin %s", simpleName, obj.getClass().getSimpleName(), obj));
                    }
                } else {
                    j.p("origin == null");
                }
                vVar = null;
            }
            String str = vVar.A;
            s sVar = vVar.L;
            while (true) {
                int i2 = vVar.R;
                n[] nVarArr = (n[]) sVar.f3670h;
                if (i2 >= nVarArr.length - 1) {
                    nVar = null;
                } else {
                    int i10 = i2 + 1;
                    vVar.R = i10;
                    nVar = nVarArr[i10];
                    String str2 = nVar.f7109a;
                    vVar.i(i10, false);
                }
                if (nVar == null) {
                    nVar = null;
                    break;
                } else if (!nVar.f7111c) {
                    String str3 = nVar.f7109a;
                    str3.getClass();
                    String lowerCase = vc.h.x0('.', str3, str3).toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    if (d.f15046d.contains(lowerCase)) {
                        break;
                    }
                }
            }
            if (nVar != null) {
                int i11 = 0;
                while (true) {
                    n[] nVarArr2 = (n[]) sVar.f3670h;
                    if (i11 < nVarArr2.length) {
                        if (nVar == nVarArr2[i11]) {
                            break;
                        }
                        i11++;
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                if (i11 >= 0) {
                    vVar.i(i11, true);
                    vVar.R = i11;
                    vVar.X = ((int[]) ((b9.e) sVar.f3671i).X)[i11];
                    ArrayList arrayList = vVar.f7137b0;
                    if (((n[]) sVar.f3670h)[i11].f7122o == 0) {
                        inputStream2 = new ByteArrayInputStream(mj.b.f9707a);
                    } else if (!arrayList.isEmpty()) {
                        while (arrayList.size() > 1) {
                            InputStream inputStream3 = (InputStream) arrayList.remove(0);
                            try {
                                nj.b bVar = nj.c.f10450a;
                                long j2 = Long.MAX_VALUE;
                                while (j2 > 0) {
                                    nj.b bVar2 = nj.c.f10450a;
                                    long read = inputStream3.read(new byte[8192], 0, (int) Math.min(j2, bArr.length));
                                    if (read < 0) {
                                        break;
                                    }
                                    j2 -= read;
                                }
                                if (inputStream3 != null) {
                                    inputStream3.close();
                                }
                            } catch (Throwable th2) {
                                if (inputStream3 != null) {
                                    try {
                                        inputStream3.close();
                                    } catch (Throwable th3) {
                                        th2.addSuppressed(th3);
                                    }
                                }
                                throw th2;
                            }
                        }
                        inputStream2 = (InputStream) arrayList.get(0);
                    } else {
                        j.p("No current 7z entry (call getNextEntry() first).");
                        return null;
                    }
                    inputStream2.getClass();
                    return new i(inputStream2, new o0(nVar.f7122o), 1);
                }
                throw new IllegalArgumentException("Can not find " + nVar.f7109a + " in " + str);
            }
        }
        return null;
    }
}
