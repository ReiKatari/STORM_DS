package defpackage;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.Build;
import android.os.CancellationSignal;
import androidx.recyclerview.widget.RecyclerView;
import defpackage.b6;
import defpackage.bk2;
import defpackage.h03;
import defpackage.nq2;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.UUID;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: do1  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class do1 implements ki2 {
    public final /* synthetic */ int A;

    public /* synthetic */ do1(int i) {
        this.A = i;
    }

    @Override // defpackage.ki2
    public final Object c() {
        Class<?> returnType;
        int i = this.A;
        o27 o27Var = o27.a;
        switch (i) {
            case 0:
                return new ji1(RecyclerView.A1);
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
                    String[] strArr = vh2.B;
                    Method method = (Method) vh2.R.getValue();
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
                return me2.G(Boolean.FALSE);
            case 5:
                bk2.b bVar = bk2.Companion;
                return new zt(b6.a.a, 0);
            case ig7.b /* 6 */:
                il6 il6Var = vo2.a;
                ArrayList arrayList = new ArrayList();
                kj6 kj6Var = new kj6();
                cg6 cg6Var = pj6.e;
                nj6 nj6Var = nj6.PRIV;
                lj6 lj6Var = lj6.S1080P_16_9;
                cg6 cg6Var2 = pj6.e;
                kj6Var.a(jo1.r(nj6Var, lj6Var, cg6Var2));
                arrayList.add(kj6Var);
                kj6 kj6Var2 = new kj6();
                lj6 lj6Var2 = lj6.S720P_16_9;
                kj6Var2.a(jo1.r(nj6Var, lj6Var2, cg6Var2));
                arrayList.add(kj6Var2);
                lj6 lj6Var3 = lj6.MAXIMUM_16_9;
                arrayList.addAll(vo2.a(lj6Var, lj6Var3));
                lj6 lj6Var4 = lj6.UHD;
                arrayList.addAll(vo2.a(lj6Var, lj6Var4));
                arrayList.addAll(vo2.a(lj6Var, lj6.S1440P_16_9));
                arrayList.addAll(vo2.a(lj6Var, lj6Var));
                arrayList.addAll(vo2.a(lj6Var2, lj6Var3));
                arrayList.addAll(vo2.a(lj6Var2, lj6Var4));
                arrayList.addAll(vo2.a(lj6Var2, lj6Var));
                lj6 lj6Var5 = lj6.X_VGA;
                lj6 lj6Var6 = lj6.MAXIMUM_4_3;
                arrayList.addAll(vo2.a(lj6Var5, lj6Var6));
                arrayList.addAll(vo2.a(lj6.S1080P_4_3, lj6Var6));
                return arrayList;
            case 7:
                ArrayList arrayList2 = new ArrayList();
                kj6 kj6Var3 = new kj6();
                cg6 cg6Var3 = pj6.e;
                nj6 nj6Var2 = nj6.PRIV;
                lj6 lj6Var7 = lj6.S1080P_16_9;
                cg6 cg6Var4 = pj6.e;
                wh1.v(kj6Var3, jo1.r(nj6Var2, lj6Var7, cg6Var4), nj6Var2, lj6Var7, cg6Var4);
                kj6 e = wh1.e(arrayList2, kj6Var3);
                e.a(jo1.r(nj6Var2, lj6Var7, cg6Var4));
                e.a(jo1.r(nj6Var2, lj6.S1440P_16_9, cg6Var4));
                arrayList2.add(e);
                kj6 kj6Var4 = new kj6();
                kj6Var4.a(jo1.r(nj6Var2, lj6Var7, cg6Var4));
                kj6Var4.a(jo1.r(nj6Var2, lj6.UHD, cg6Var4));
                arrayList2.add(kj6Var4);
                kj6 kj6Var5 = new kj6();
                kj6Var5.a(jo1.r(nj6Var2, lj6Var7, cg6Var4));
                wh1.v(kj6Var5, jo1.r(nj6.YUV, lj6Var7, cg6Var4), nj6Var2, lj6Var7, cg6Var4);
                arrayList2.add(kj6Var5);
                return arrayList2;
            case 8:
                nq2.b bVar2 = nq2.Companion;
                return new pq2(yg6.a, as3.a, 1);
            case 9:
                throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
            case 10:
                return new zb4();
            case 11:
                return null;
            case mj2.L /* 12 */:
                tv0 tv0Var = gy2.a;
                return t91.a;
            case 13:
                h03.d dVar = h03.Companion;
                yz2[] values = yz2.values();
                values.getClass();
                return new g12("me.magnum.melonds.domain.model.Input", values);
            case 14:
                h03.b.a.C0001b c0001b = h03.b.a.Companion;
                a03[] values2 = a03.values();
                values2.getClass();
                return new g12("me.magnum.melonds.domain.model.InputConfig.Assignment.Axis.Direction", values2);
            case ig7.e /* 15 */:
                return new d94("none", h03.b.d.INSTANCE, new Annotation[0]);
            case 16:
                return i03.a();
            case 17:
                ye6 ye6Var = k23.a;
                return null;
            case 18:
                ye6 ye6Var2 = m33.a;
                return Boolean.TRUE;
            case 19:
            case 20:
                return o27Var;
            case 21:
                return n83.b;
            case 22:
                return d83.b;
            case 23:
                return y73.b;
            case 24:
                return i83.b;
            case 25:
                return b73.b;
            case 26:
                return Boolean.valueOf(Build.BRAND.equals("google"));
            case 27:
                return me2.G(Boolean.FALSE);
            case 28:
                return new ki3(0, 0);
            default:
                return new pk3(0, 0);
        }
    }
}
