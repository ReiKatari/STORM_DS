package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Trace;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zi2  reason: default package */
/* loaded from: classes.dex */
public abstract class zi2 {
    public static final yz3 a = new yz3(16);
    public static final ThreadPoolExecutor b;
    public static final Object c;
    public static final ci6 d;

    static {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 10000L, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new kx2(1));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        b = threadPoolExecutor;
        c = new Object();
        d = new ci6(0);
    }

    public static String a(int i, List list) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < list.size(); i2++) {
            sb.append(((ui2) list.get(i2)).g);
            sb.append("-");
            sb.append(i);
            if (i2 < list.size() - 1) {
                sb.append(";");
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0052 A[Catch: all -> 0x00c1, TRY_LEAVE, TryCatch #3 {all -> 0x00c1, blocks: (B:3:0x000b, B:5:0x0013, B:8:0x001c, B:9:0x0020, B:30:0x0052, B:33:0x005b, B:35:0x0061, B:37:0x0067, B:39:0x0078, B:47:0x009d, B:50:0x00a9, B:43:0x0081, B:45:0x0098, B:14:0x002f, B:16:0x0037, B:19:0x003b, B:21:0x003f, B:26:0x004a, B:56:0x00b7, B:44:0x0092, B:38:0x0072), top: B:64:0x000b }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005b A[Catch: all -> 0x00c1, TRY_ENTER, TryCatch #3 {all -> 0x00c1, blocks: (B:3:0x000b, B:5:0x0013, B:8:0x001c, B:9:0x0020, B:30:0x0052, B:33:0x005b, B:35:0x0061, B:37:0x0067, B:39:0x0078, B:47:0x009d, B:50:0x00a9, B:43:0x0081, B:45:0x0098, B:14:0x002f, B:16:0x0037, B:19:0x003b, B:21:0x003f, B:26:0x004a, B:56:0x00b7, B:44:0x0092, B:38:0x0072), top: B:64:0x000b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static yi2 b(String str, Context context, List list, int i) {
        int i2;
        Typeface p;
        yz3 yz3Var = a;
        Trace.beginSection(ln2.f0("getFontSync"));
        try {
            Typeface typeface = (Typeface) yz3Var.h(str);
            if (typeface != null) {
                return new yi2(typeface);
            }
            try {
                qj2 a2 = ti2.a(context, list);
                List list2 = a2.b;
                int i3 = a2.a;
                if (i3 != 0) {
                    if (i3 == 1) {
                        i2 = -2;
                        if (i2 == 0) {
                            return new yi2(i2);
                        }
                        if (list2.size() > 1 && Build.VERSION.SDK_INT >= 29) {
                            bl2 bl2Var = je7.a;
                            Trace.beginSection(ln2.f0("TypefaceCompat.createFromFontInfoWithFallback"));
                            p = je7.a.q(context, list2, i);
                            Trace.endSection();
                        } else {
                            rj2[] rj2VarArr = (rj2[]) list2.get(0);
                            bl2 bl2Var2 = je7.a;
                            Trace.beginSection(ln2.f0("TypefaceCompat.createFromFontInfo"));
                            p = je7.a.p(context, rj2VarArr, i);
                            Trace.endSection();
                        }
                        if (p != null) {
                            yz3Var.l(str, p);
                            return new yi2(p);
                        }
                        return new yi2(-3);
                    }
                    i2 = -3;
                    if (i2 == 0) {
                    }
                } else {
                    rj2[] rj2VarArr2 = (rj2[]) list2.get(0);
                    if (rj2VarArr2 != null && rj2VarArr2.length != 0) {
                        int length = rj2VarArr2.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 < length) {
                                int i5 = rj2VarArr2[i4].f;
                                if (i5 != 0) {
                                    if (i5 >= 0) {
                                        i2 = i5;
                                    }
                                } else {
                                    i4++;
                                }
                            } else {
                                i2 = 0;
                                break;
                            }
                        }
                        if (i2 == 0) {
                        }
                    }
                    i2 = 1;
                    if (i2 == 0) {
                    }
                }
            } catch (PackageManager.NameNotFoundException unused) {
                return new yi2(-1);
            }
        } finally {
            Trace.endSection();
        }
    }
}
