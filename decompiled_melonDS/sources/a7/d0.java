package a7;

import a4.k2;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f551a;

    /* renamed from: b  reason: collision with root package name */
    public final d7.f f552b;

    /* renamed from: c  reason: collision with root package name */
    public final d7.c f553c;

    /* renamed from: d  reason: collision with root package name */
    public final Activity f554d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f555e;

    /* renamed from: f  reason: collision with root package name */
    public final n f556f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f557g;

    public d0(Context context) {
        Object obj;
        context.getClass();
        this.f551a = context;
        this.f552b = new d7.f(this, new k(this, 0));
        this.f553c = new d7.c(context, false);
        Iterator it = uc.h.J(context, new a(1)).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Context) obj) instanceof Activity) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        this.f554d = (Activity) obj;
        this.f556f = new n(0, this);
        this.f557g = true;
        n0 n0Var = this.f552b.f3938s;
        n0Var.a(new c0(n0Var));
        this.f552b.f3938s.a(new c(this.f551a));
        new yb.n(new k(this, 1));
    }

    public static void b(d0 d0Var, Object obj) {
        String str;
        String str2;
        d0Var.getClass();
        obj.getClass();
        d7.f fVar = d0Var.f552b;
        fVar.getClass();
        fVar.getClass();
        obj.getClass();
        x d4 = d7.f.d(e7.d.b(aj.g.Y(nc.u.a(obj.getClass()))), fVar.g(), null, true);
        if (d4 != null) {
            Map c4 = d4.c();
            LinkedHashMap linkedHashMap = new LinkedHashMap(zb.v.E(c4.size()));
            for (Map.Entry entry : c4.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((h) entry.getValue()).f571a);
            }
            str = e7.d.c(obj, linkedHashMap);
        } else {
            fj.j.i("Destination with route ", nc.u.a(obj.getClass()).c(), " cannot be found in navigation graph ", fVar.f3923c);
            str = null;
        }
        if (fVar.f3923c != null) {
            z i2 = fVar.i();
            w f8 = i2.f(str, true, i2);
            if (f8 != null) {
                x xVar = f8.A;
                Bundle a10 = xVar.a(f8.B);
                if (a10 == null) {
                    a10 = zb.k.b((yb.j[]) Arrays.copyOf(new yb.j[0], 0));
                }
                int i10 = x.X;
                String str3 = (String) xVar.B.f252e;
                if (str3 != null) {
                    str2 = "android-app://androidx.navigation/".concat(str3);
                } else {
                    str2 = "";
                }
                Uri parse = Uri.parse(str2);
                parse.getClass();
                Intent intent = new Intent();
                intent.setDataAndType(parse, null);
                intent.setAction(null);
                a10.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                fVar.k(xVar, a10, null);
                return;
            }
            m9.o.n(w.d.u("Navigation destination that matches route ", str, " cannot be found in the navigation graph "), fVar.f3923c);
            return;
        }
        m9.o.k("Cannot navigate to ", str, ". Navigation graph has not been set for NavController ", fVar, 46);
    }

    public final int a() {
        zb.j jVar = this.f552b.f3926f;
        int i2 = 0;
        if (jVar != null && jVar.isEmpty()) {
            return 0;
        }
        Iterator it = jVar.iterator();
        while (it.hasNext()) {
            if (!(((i) it.next()).B instanceof z) && (i2 = i2 + 1) < 0) {
                throw new ArithmeticException("Count overflow has happened.");
            }
        }
        return i2;
    }

    public final boolean c() {
        Bundle bundle;
        int[] iArr;
        Bundle bundle2;
        Bundle a10;
        Bundle bundle3;
        Intent intent;
        if (a() == 1) {
            Activity activity = this.f554d;
            if (activity != null && (intent = activity.getIntent()) != null) {
                bundle = intent.getExtras();
            } else {
                bundle = null;
            }
            if (bundle != null) {
                iArr = bundle.getIntArray("android-support-nav:controller:deepLinkIds");
            } else {
                iArr = null;
            }
            d7.f fVar = this.f552b;
            int i2 = 0;
            if (iArr != null) {
                if (this.f555e) {
                    activity.getClass();
                    Intent intent2 = activity.getIntent();
                    Bundle extras = intent2.getExtras();
                    extras.getClass();
                    int[] intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                    intArray.getClass();
                    ArrayList arrayList = new ArrayList(intArray.length);
                    for (int i10 : intArray) {
                        arrayList.add(Integer.valueOf(i10));
                    }
                    ArrayList parcelableArrayList = extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
                    if (arrayList.size() >= 2) {
                        int intValue = ((Number) zb.l.h0(arrayList)).intValue();
                        if (parcelableArrayList != null) {
                            Bundle bundle4 = (Bundle) zb.l.h0(parcelableArrayList);
                        }
                        x d4 = d7.f.d(intValue, fVar.g(), null, false);
                        if (d4 instanceof z) {
                            int i11 = z.Z;
                            intValue = l0.f.k((z) d4).B.f248a;
                        }
                        x f8 = fVar.f();
                        if (f8 != null && intValue == f8.B.f248a) {
                            v vVar = new v(this);
                            Bundle b10 = zb.k.b((yb.j[]) Arrays.copyOf(new yb.j[0], 0));
                            b10.putParcelable("android-support-nav:controller:deepLinkIntent", intent2);
                            Bundle bundle5 = extras.getBundle("android-support-nav:controller:deepLinkExtras");
                            if (bundle5 != null) {
                                b10.putAll(bundle5);
                            }
                            ((Intent) vVar.L).putExtra("android-support-nav:controller:deepLinkExtras", b10);
                            int size = arrayList.size();
                            int i12 = 0;
                            while (i12 < size) {
                                Object obj = arrayList.get(i12);
                                i12++;
                                int i13 = i2 + 1;
                                if (i2 >= 0) {
                                    int intValue2 = ((Number) obj).intValue();
                                    if (parcelableArrayList != null) {
                                        bundle3 = (Bundle) parcelableArrayList.get(i2);
                                    } else {
                                        bundle3 = null;
                                    }
                                    ((ArrayList) vVar.X).add(new u(intValue2, bundle3));
                                    if (((z) vVar.R) != null) {
                                        vVar.y();
                                    }
                                    i2 = i13;
                                } else {
                                    p7.t.F();
                                    throw null;
                                }
                            }
                            vVar.k().b();
                            activity.finish();
                            return true;
                        }
                    }
                }
            } else {
                x f10 = fVar.f();
                f10.getClass();
                int i14 = f10.B.f248a;
                for (z zVar = f10.L; zVar != null; zVar = zVar.L) {
                    k2 k2Var = zVar.B;
                    if (zVar.Y.f3860b != i14) {
                        Bundle b11 = zb.k.b((yb.j[]) Arrays.copyOf(new yb.j[0], 0));
                        if (activity != null && activity.getIntent() != null && activity.getIntent().getData() != null) {
                            Intent intent3 = activity.getIntent();
                            intent3.getClass();
                            b11.putParcelable("android-support-nav:controller:deepLinkIntent", intent3);
                            z i15 = fVar.i();
                            Intent intent4 = activity.getIntent();
                            intent4.getClass();
                            w e6 = i15.e(new a4.n(intent4.getData(), intent4.getAction(), intent4.getType(), 2), i15);
                            if (e6 != null) {
                                bundle2 = e6.B;
                            } else {
                                bundle2 = null;
                            }
                            if (bundle2 != null && (a10 = e6.A.a(e6.B)) != null) {
                                b11.putAll(a10);
                            }
                        }
                        v vVar2 = new v(this);
                        int i16 = k2Var.f248a;
                        ArrayList arrayList2 = (ArrayList) vVar2.X;
                        arrayList2.clear();
                        arrayList2.add(new u(i16, null));
                        if (((z) vVar2.R) != null) {
                            vVar2.y();
                        }
                        ((Intent) vVar2.L).putExtra("android-support-nav:controller:deepLinkExtras", b11);
                        vVar2.k().b();
                        if (activity != null) {
                            activity.finish();
                        }
                        return true;
                    }
                    i14 = k2Var.f248a;
                }
            }
            return false;
        }
        return d();
    }

    public final boolean d() {
        d7.f fVar = this.f552b;
        if (!fVar.f3926f.isEmpty()) {
            x f8 = fVar.f();
            f8.getClass();
            if (fVar.l(f8.B.f248a, true, false) && fVar.b()) {
                return true;
            }
        }
        return false;
    }
}
