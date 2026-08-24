package defpackage;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build;
import android.widget.Toast;
import com.stormds.emulator.R;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rh  reason: default package */
/* loaded from: classes.dex */
public final class rh implements y23, vs1 {
    public Context a;

    public rh(Context context, int i) {
        switch (i) {
            case 4:
                this.a = context.getApplicationContext();
                return;
            default:
                this.a = context.getApplicationContext();
                return;
        }
    }

    @Override // defpackage.vs1
    public void a(hv hvVar) {
        ry0 ry0Var = new ry0("EmojiCompatInitializer");
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), ry0Var);
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new v(this, hvVar, threadPoolExecutor, 16));
    }

    @Override // defpackage.y23
    public void b() {
        Toast.makeText(this.a, (int) R.string.layout_background_load_failed, 1).show();
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [vb1, java.lang.Object] */
    public vb1 d() {
        Context context = this.a;
        if (context != null) {
            ?? obj = new Object();
            obj.A = fm1.a(f04.l);
            g71 g71Var = new g71(context, 1);
            obj.B = g71Var;
            obj.L = fm1.a(new n54(g71Var, new g71(g71Var, 0)));
            n55 a = fm1.a(new g71(new g71(obj.B, 3), 2));
            obj.R = a;
            c72 c72Var = new c72(1);
            g71 g71Var2 = obj.B;
            i66 i66Var = new i66(g71Var2, a, c72Var, 0);
            n55 n55Var = obj.A;
            n55 n55Var2 = obj.L;
            obj.X = fm1.a(new i66(new ze1(n55Var, n55Var2, i66Var, a, a), new sh7(g71Var2, n55Var2, a, i66Var, n55Var, a), new kw7(n55Var, a, i66Var, a), 1));
            return obj;
        }
        String canonicalName = Context.class.getCanonicalName();
        throw new IllegalStateException(canonicalName + " must be set");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Typeface e(ll5 ll5Var) {
        int i;
        String str;
        boolean z;
        float b;
        int i2;
        Context context = this.a;
        if (!(ll5Var instanceof ll5)) {
            return null;
        }
        Typeface a = sl5.a(context, ll5Var.a);
        a.getClass();
        List list = ll5Var.c.a;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 26) {
            ThreadLocal threadLocal = me7.a;
            if (a == null) {
                return null;
            }
            if (!list.isEmpty()) {
                ThreadLocal threadLocal2 = me7.a;
                Paint paint = (Paint) threadLocal2.get();
                if (paint == null) {
                    paint = new Paint();
                    threadLocal2.set(paint);
                }
                paint.setFontVariationSettings(null);
                paint.setTypeface(a);
                uh1 s = ak7.s(context);
                int i4 = 0;
                if (i3 >= 31) {
                    i2 = context.getResources().getConfiguration().fontWeightAdjustment;
                    if (i2 != Integer.MAX_VALUE) {
                        i = context.getResources().getConfiguration().fontWeightAdjustment;
                        if (i != 0) {
                            str = ex3.a(31, new dv4(s), null, list);
                        } else {
                            int size = list.size();
                            String str2 = "";
                            boolean z2 = false;
                            while (i4 < size) {
                                lj2 lj2Var = (lj2) list.get(i4);
                                if (nb3.k(lj2Var.a(), "wght")) {
                                    b = gi2.p(lj2Var.b() + i, 1.0f, 1000.0f);
                                    z = true;
                                } else {
                                    z = z2;
                                    b = lj2Var.b();
                                }
                                if (i4 != 0) {
                                    str2 = str2.concat(",");
                                }
                                str2 = str2 + '\'' + lj2Var.a() + "' " + b;
                                i4++;
                                z2 = z;
                            }
                            if (!z2) {
                                float p = gi2.p(i + 400.0f, 1.0f, 1000.0f);
                                if (!list.isEmpty()) {
                                    str2 = str2.concat(",");
                                }
                                str = str2 + "'wght' " + p;
                            } else {
                                str = str2;
                            }
                        }
                        paint.setFontVariationSettings(str);
                        return paint.getTypeface();
                    }
                }
                i = 0;
                if (i != 0) {
                }
                paint.setFontVariationSettings(str);
                return paint.getTypeface();
            }
        }
        return a;
    }

    @Override // defpackage.y23
    public void c() {
    }

    public /* synthetic */ rh(Context context, byte b) {
        this.a = context;
    }
}
