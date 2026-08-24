package defpackage;

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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rc4  reason: default package */
/* loaded from: classes.dex */
public final class rc4 {
    public final Context a;
    public final zb4 b;
    public final rh c;
    public final Activity d;
    public boolean e;
    public final d00 f;
    public final boolean g;

    public rc4(Context context) {
        Object obj;
        context.getClass();
        this.a = context;
        this.b = new zb4(this, new n10(this, 1));
        this.c = new rh(context, (byte) 0);
        Iterator it = sb6.Z(context, new x84(3)).iterator();
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
        this.d = (Activity) obj;
        this.f = new d00(this, 3);
        this.g = true;
        rd4 rd4Var = this.b.s;
        rd4Var.a(new qc4(rd4Var));
        this.b.s.a(new v8(this.a));
        new ex6(new n10(this, 2));
    }

    public static void b(rc4 rc4Var, Object obj) {
        String str;
        String str2;
        rc4Var.getClass();
        obj.getClass();
        zb4 zb4Var = rc4Var.b;
        zb4Var.getClass();
        obj.getClass();
        ic4 d = zb4.d(np2.O(jx2.K(gh5.a(obj.getClass()))), zb4Var.g(), null, true);
        if (d != null) {
            Map c = d.c();
            LinkedHashMap linkedHashMap = new LinkedHashMap(c14.k0(c.size()));
            for (Map.Entry entry : c.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((rb4) entry.getValue()).a);
            }
            str = np2.P(obj, linkedHashMap);
        } else {
            u34.y("Destination with route ", gh5.a(obj.getClass()).c(), " cannot be found in navigation graph ", zb4Var.c);
            str = null;
        }
        if (zb4Var.c != null) {
            mc4 i = zb4Var.i();
            hc4 g = i.g(str, true, i);
            if (g != null) {
                ic4 ic4Var = g.A;
                Bundle a = ic4Var.a(g.B);
                if (a == null) {
                    a = jw2.l((vr4[]) Arrays.copyOf(new vr4[0], 0));
                }
                int i2 = ic4.X;
                String str3 = (String) ic4Var.B.e;
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
                a.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                zb4Var.k(ic4Var, a, null);
                return;
            }
            i.j(i61.t("Navigation destination that matches route ", str, " cannot be found in the navigation graph "), zb4Var.c);
            return;
        }
        e41.s("Cannot navigate to ", str, ". Navigation graph has not been set for NavController ", zb4Var, 46);
    }

    public final int a() {
        pu<sb4> puVar = this.b.f;
        int i = 0;
        if (puVar != null && puVar.isEmpty()) {
            return 0;
        }
        for (sb4 sb4Var : puVar) {
            if (!(sb4Var.B instanceof mc4) && (i = i + 1) < 0) {
                hf.p0();
                throw null;
            }
        }
        return i;
    }

    public final boolean c() {
        Bundle bundle;
        int[] iArr;
        Bundle bundle2;
        Bundle a;
        Bundle bundle3;
        Intent intent;
        if (a() == 1) {
            Activity activity = this.d;
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
            zb4 zb4Var = this.b;
            int i = 0;
            if (iArr != null) {
                if (this.e) {
                    activity.getClass();
                    Intent intent2 = activity.getIntent();
                    Bundle extras = intent2.getExtras();
                    extras.getClass();
                    int[] intArray = extras.getIntArray("android-support-nav:controller:deepLinkIds");
                    intArray.getClass();
                    ArrayList arrayList = new ArrayList(intArray.length);
                    for (int i2 : intArray) {
                        arrayList.add(Integer.valueOf(i2));
                    }
                    ArrayList parcelableArrayList = extras.getParcelableArrayList("android-support-nav:controller:deepLinkArgs");
                    if (arrayList.size() >= 2) {
                        int intValue = ((Number) gt0.Y0(arrayList)).intValue();
                        if (parcelableArrayList != null) {
                            Bundle bundle4 = (Bundle) gt0.Y0(parcelableArrayList);
                        }
                        ic4 d = zb4.d(intValue, zb4Var.g(), null, false);
                        if (d instanceof mc4) {
                            int i3 = mc4.Z;
                            intValue = np2.M((mc4) d).B.a;
                        }
                        ic4 f = zb4Var.f();
                        if (f != null && intValue == f.B.a) {
                            s9 s9Var = new s9(this);
                            Bundle l = jw2.l((vr4[]) Arrays.copyOf(new vr4[0], 0));
                            l.putParcelable("android-support-nav:controller:deepLinkIntent", intent2);
                            Bundle bundle5 = extras.getBundle("android-support-nav:controller:deepLinkExtras");
                            if (bundle5 != null) {
                                l.putAll(bundle5);
                            }
                            ((Intent) s9Var.c).putExtra("android-support-nav:controller:deepLinkExtras", l);
                            int size = arrayList.size();
                            int i4 = 0;
                            while (i4 < size) {
                                Object obj = arrayList.get(i4);
                                i4++;
                                int i5 = i + 1;
                                if (i >= 0) {
                                    int intValue2 = ((Number) obj).intValue();
                                    if (parcelableArrayList != null) {
                                        bundle3 = (Bundle) parcelableArrayList.get(i);
                                    } else {
                                        bundle3 = null;
                                    }
                                    ((ArrayList) s9Var.e).add(new gc4(intValue2, bundle3));
                                    if (((mc4) s9Var.d) != null) {
                                        s9Var.J();
                                    }
                                    i = i5;
                                } else {
                                    hf.q0();
                                    throw null;
                                }
                            }
                            s9Var.s().b();
                            activity.finish();
                            return true;
                        }
                    }
                }
            } else {
                ic4 f2 = zb4Var.f();
                f2.getClass();
                int i6 = f2.B.a;
                for (mc4 mc4Var = f2.L; mc4Var != null; mc4Var = mc4Var.L) {
                    z9 z9Var = mc4Var.B;
                    if (mc4Var.Y.L != i6) {
                        Bundle l2 = jw2.l((vr4[]) Arrays.copyOf(new vr4[0], 0));
                        if (activity != null && activity.getIntent() != null && activity.getIntent().getData() != null) {
                            Intent intent3 = activity.getIntent();
                            intent3.getClass();
                            l2.putParcelable("android-support-nav:controller:deepLinkIntent", intent3);
                            mc4 i7 = zb4Var.i();
                            Intent intent4 = activity.getIntent();
                            intent4.getClass();
                            hc4 f3 = i7.f(new m44(intent4.getData(), intent4.getAction(), intent4.getType(), 3), i7);
                            if (f3 != null) {
                                bundle2 = f3.B;
                            } else {
                                bundle2 = null;
                            }
                            if (bundle2 != null && (a = f3.A.a(f3.B)) != null) {
                                l2.putAll(a);
                            }
                        }
                        s9 s9Var2 = new s9(this);
                        int i8 = z9Var.a;
                        ArrayList arrayList2 = (ArrayList) s9Var2.e;
                        arrayList2.clear();
                        arrayList2.add(new gc4(i8, null));
                        if (((mc4) s9Var2.d) != null) {
                            s9Var2.J();
                        }
                        ((Intent) s9Var2.c).putExtra("android-support-nav:controller:deepLinkExtras", l2);
                        s9Var2.s().b();
                        if (activity != null) {
                            activity.finish();
                        }
                        return true;
                    }
                    i6 = z9Var.a;
                }
            }
            return false;
        }
        return d();
    }

    public final boolean d() {
        zb4 zb4Var = this.b;
        if (!zb4Var.f.isEmpty()) {
            ic4 f = zb4Var.f();
            f.getClass();
            if (zb4Var.l(f.B.a, true, false) && zb4Var.b()) {
                return true;
            }
        }
        return false;
    }
}
