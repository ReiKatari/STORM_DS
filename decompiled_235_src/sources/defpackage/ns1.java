package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.CancellationSignal;
import androidx.recyclerview.widget.RecyclerView;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.CommonStatusCodes;
import com.google.mlkit.vision.text.TextRecognition;
import com.google.mlkit.vision.text.chinese.ChineseTextRecognizerOptions;
import com.google.mlkit.vision.text.japanese.JapaneseTextRecognizerOptions;
import com.google.mlkit.vision.text.latin.TextRecognizerOptions;
import defpackage.b6;
import defpackage.fp2;
import defpackage.k63;
import defpackage.ow2;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Set;
import java.util.UUID;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ns1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ns1 implements on2 {
    public final /* synthetic */ int A;

    public /* synthetic */ ns1(int i) {
        this.A = i;
    }

    @Override // defpackage.on2
    public final Object c() {
        Class<?> returnType;
        int i = this.A;
        jg7 jg7Var = jg7.a;
        switch (i) {
            case 0:
                return new om1(RecyclerView.B1);
            case 1:
                try {
                    Method declaredMethod = SQLiteDatabase.class.getDeclaredMethod("getThreadSession", null);
                    declaredMethod.setAccessible(true);
                    return declaredMethod;
                } catch (Throwable unused) {
                    return null;
                }
            case 2:
                try {
                    String[] strArr = vm2.B;
                    Method method = (Method) vm2.R.getValue();
                    if (method == null || (returnType = method.getReturnType()) == null) {
                        return null;
                    }
                    Class cls = Integer.TYPE;
                    return returnType.getDeclaredMethod("beginTransaction", cls, SQLiteTransactionListener.class, cls, CancellationSignal.class);
                } catch (Throwable unused2) {
                    return null;
                }
            case 3:
                return UUID.randomUUID();
            case 4:
                return np2.Y(Boolean.FALSE);
            case 5:
                fp2.b bVar = fp2.Companion;
                return new ru(b6.a.a, 0);
            case 6:
                return TextRecognition.getClient(TextRecognizerOptions.DEFAULT_OPTIONS);
            case 7:
                return TextRecognition.getClient(new JapaneseTextRecognizerOptions.Builder().build());
            case 8:
                return TextRecognition.getClient(new ChineseTextRecognizerOptions.Builder().build());
            case 9:
                ex6 ex6Var = xu2.a;
                ArrayList arrayList = new ArrayList();
                ev6 ev6Var = new ev6();
                tr6 tr6Var = jv6.e;
                hv6 hv6Var = hv6.PRIV;
                fv6 fv6Var = fv6.S1080P_16_9;
                tr6 tr6Var2 = jv6.e;
                ev6Var.a(w31.m(hv6Var, fv6Var, tr6Var2));
                arrayList.add(ev6Var);
                ev6 ev6Var2 = new ev6();
                fv6 fv6Var2 = fv6.S720P_16_9;
                ev6Var2.a(w31.m(hv6Var, fv6Var2, tr6Var2));
                arrayList.add(ev6Var2);
                fv6 fv6Var3 = fv6.MAXIMUM_16_9;
                arrayList.addAll(xu2.a(fv6Var, fv6Var3));
                fv6 fv6Var4 = fv6.UHD;
                arrayList.addAll(xu2.a(fv6Var, fv6Var4));
                arrayList.addAll(xu2.a(fv6Var, fv6.S1440P_16_9));
                arrayList.addAll(xu2.a(fv6Var, fv6Var));
                arrayList.addAll(xu2.a(fv6Var2, fv6Var3));
                arrayList.addAll(xu2.a(fv6Var2, fv6Var4));
                arrayList.addAll(xu2.a(fv6Var2, fv6Var));
                fv6 fv6Var5 = fv6.X_VGA;
                fv6 fv6Var6 = fv6.MAXIMUM_4_3;
                arrayList.addAll(xu2.a(fv6Var5, fv6Var6));
                arrayList.addAll(xu2.a(fv6.S1080P_4_3, fv6Var6));
                return arrayList;
            case 10:
                ArrayList arrayList2 = new ArrayList();
                ev6 ev6Var3 = new ev6();
                tr6 tr6Var3 = jv6.e;
                hv6 hv6Var2 = hv6.PRIV;
                fv6 fv6Var7 = fv6.S1080P_16_9;
                tr6 tr6Var4 = jv6.e;
                lb1.u(ev6Var3, w31.m(hv6Var2, fv6Var7, tr6Var4), hv6Var2, fv6Var7, tr6Var4);
                ev6 f = lb1.f(arrayList2, ev6Var3);
                f.a(w31.m(hv6Var2, fv6Var7, tr6Var4));
                f.a(w31.m(hv6Var2, fv6.S1440P_16_9, tr6Var4));
                arrayList2.add(f);
                ev6 ev6Var4 = new ev6();
                ev6Var4.a(w31.m(hv6Var2, fv6Var7, tr6Var4));
                ev6Var4.a(w31.m(hv6Var2, fv6.UHD, tr6Var4));
                arrayList2.add(ev6Var4);
                ev6 ev6Var5 = new ev6();
                ev6Var5.a(w31.m(hv6Var2, fv6Var7, tr6Var4));
                lb1.u(ev6Var5, w31.m(hv6.YUV, fv6Var7, tr6Var4), hv6Var2, fv6Var7, tr6Var4);
                arrayList2.add(ev6Var5);
                return arrayList2;
            case 11:
                ow2.b bVar2 = ow2.Companion;
                return new qw2(ps6.a, fz3.a, 1);
            case 12:
                throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
            case 13:
                return new xk4();
            case 14:
                return null;
            case 15:
                py0 py0Var = k43.a;
                return pd1.a;
            case 16:
                k63.d dVar = k63.Companion;
                b63[] values = b63.values();
                values.getClass();
                return new v52("me.magnum.melonds.domain.model.Input", values);
            case 17:
                k63.b.a.C0001b c0001b = k63.b.a.Companion;
                d63[] values2 = d63.values();
                values2.getClass();
                return new v52("me.magnum.melonds.domain.model.InputConfig.Assignment.Axis.Direction", values2);
            case 18:
                return new wh4("none", k63.b.d.INSTANCE, new Annotation[0]);
            case 19:
                return l63.a();
            case 20:
                Set set = x73.a;
                return jg7Var;
            case CommonStatusCodes.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                nq6 nq6Var = r83.a;
                return null;
            case 22:
                nq6 nq6Var2 = u93.a;
                return Boolean.TRUE;
            case ConnectionResult.API_DISABLED /* 23 */:
            case ConnectionResult.API_DISABLED_FOR_CONNECTION /* 24 */:
                return jg7Var;
            case 25:
                return gf3.b;
            case SubAllocator.N4 /* 26 */:
                return we3.b;
            case 27:
                return re3.b;
            case 28:
                return bf3.b;
            default:
                return qd3.b;
        }
    }
}
