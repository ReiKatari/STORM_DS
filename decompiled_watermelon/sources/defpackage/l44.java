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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: l44  reason: default package */
/* loaded from: classes.dex */
public final class l44 {
    public final Context a;
    public final s34 b;
    public final fh c;
    public final Activity d;
    public boolean e;
    public final my f;
    public final boolean g;

    public l44(Context context) {
        Object obj;
        context.getClass();
        this.a = context;
        this.b = new s34(this, new wz(this, 1));
        this.c = new fh(context, (byte) 0);
        Iterator it = d06.x0(context, new gi3(21)).iterator();
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
        this.f = new my(3, this);
        this.g = true;
        l54 l54Var = this.b.s;
        l54Var.a(new k44(l54Var));
        this.b.s.a(new u8(this.a));
        new il6(new wz(this, 2));
    }

    public static void b(l44 l44Var, Object obj) {
        String str;
        String str2;
        l44Var.getClass();
        obj.getClass();
        s34 s34Var = l44Var.b;
        s34Var.getClass();
        obj.getClass();
        b44 d = s34.d(io2.v(me2.O(q75.a(obj.getClass()))), s34Var.g(), null, true);
        if (d != null) {
            Map d2 = d.d();
            LinkedHashMap linkedHashMap = new LinkedHashMap(zt3.j0(d2.size()));
            for (Map.Entry entry : d2.entrySet()) {
                linkedHashMap.put(entry.getKey(), ((k34) entry.getValue()).a);
            }
            str = io2.w(obj, linkedHashMap);
        } else {
            c44.v("Destination with route ", q75.a(obj.getClass()).c(), " cannot be found in navigation graph ", s34Var.c);
            str = null;
        }
        if (s34Var.c != null) {
            g44 i = s34Var.i();
            a44 k = i.k(str, true, i);
            if (k != null) {
                b44 b44Var = k.A;
                Bundle b = b44Var.b(k.B);
                if (b == null) {
                    b = dk7.k((ti4[]) Arrays.copyOf(new ti4[0], 0));
                }
                int i2 = b44.X;
                String str3 = (String) b44Var.B.e;
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
                b.putParcelable("android-support-nav:controller:deepLinkIntent", intent);
                s34Var.k(b44Var, b, null);
                return;
            }
            i.j(b31.u("Navigation destination that matches route ", str, " cannot be found in the navigation graph "), s34Var.c);
            return;
        }
        f81.s("Cannot navigate to ", str, ". Navigation graph has not been set for NavController ", s34Var, 46);
    }

    public final int a() {
        xt<l34> xtVar = this.b.f;
        int i = 0;
        if (xtVar != null && xtVar.isEmpty()) {
            return 0;
        }
        for (l34 l34Var : xtVar) {
            if (!(l34Var.B instanceof g44) && (i = i + 1) < 0) {
                l07.u0();
                throw null;
            }
        }
        return i;
    }

    public final boolean c() {
        Bundle bundle;
        int[] iArr;
        Bundle bundle2;
        Bundle b;
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
            s34 s34Var = this.b;
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
                        int intValue = ((Number) tq0.b1(arrayList)).intValue();
                        if (parcelableArrayList != null) {
                            Bundle bundle4 = (Bundle) tq0.b1(parcelableArrayList);
                        }
                        b44 d = s34.d(intValue, s34Var.g(), null, false);
                        if (d instanceof g44) {
                            int i3 = g44.Z;
                            intValue = nk2.x((g44) d).B.a;
                        }
                        b44 f = s34Var.f();
                        if (f != null && intValue == f.B.a) {
                            r9 r9Var = new r9(this);
                            Bundle k = dk7.k((ti4[]) Arrays.copyOf(new ti4[0], 0));
                            k.putParcelable("android-support-nav:controller:deepLinkIntent", intent2);
                            Bundle bundle5 = extras.getBundle("android-support-nav:controller:deepLinkExtras");
                            if (bundle5 != null) {
                                k.putAll(bundle5);
                            }
                            ((Intent) r9Var.c).putExtra("android-support-nav:controller:deepLinkExtras", k);
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
                                    ((ArrayList) r9Var.e).add(new z34(intValue2, bundle3));
                                    if (((g44) r9Var.d) != null) {
                                        r9Var.J();
                                    }
                                    i = i5;
                                } else {
                                    l07.v0();
                                    throw null;
                                }
                            }
                            r9Var.s().c();
                            activity.finish();
                            return true;
                        }
                    }
                }
            } else {
                b44 f2 = s34Var.f();
                f2.getClass();
                int i6 = f2.B.a;
                for (g44 g44Var = f2.L; g44Var != null; g44Var = g44Var.L) {
                    y9 y9Var = g44Var.B;
                    if (g44Var.Y.c != i6) {
                        Bundle k2 = dk7.k((ti4[]) Arrays.copyOf(new ti4[0], 0));
                        if (activity != null && activity.getIntent() != null && activity.getIntent().getData() != null) {
                            Intent intent3 = activity.getIntent();
                            intent3.getClass();
                            k2.putParcelable("android-support-nav:controller:deepLinkIntent", intent3);
                            g44 i7 = s34Var.i();
                            Intent intent4 = activity.getIntent();
                            intent4.getClass();
                            a44 j = i7.j(new os(intent4.getData(), intent4.getAction(), intent4.getType(), 24), i7);
                            if (j != null) {
                                bundle2 = j.B;
                            } else {
                                bundle2 = null;
                            }
                            if (bundle2 != null && (b = j.A.b(j.B)) != null) {
                                k2.putAll(b);
                            }
                        }
                        r9 r9Var2 = new r9(this);
                        int i8 = y9Var.a;
                        ArrayList arrayList2 = (ArrayList) r9Var2.e;
                        arrayList2.clear();
                        arrayList2.add(new z34(i8, null));
                        if (((g44) r9Var2.d) != null) {
                            r9Var2.J();
                        }
                        ((Intent) r9Var2.c).putExtra("android-support-nav:controller:deepLinkExtras", k2);
                        r9Var2.s().c();
                        if (activity != null) {
                            activity.finish();
                        }
                        return true;
                    }
                    i6 = y9Var.a;
                }
            }
            return false;
        }
        return d();
    }

    public final boolean d() {
        s34 s34Var = this.b;
        if (!s34Var.f.isEmpty()) {
            b44 f = s34Var.f();
            f.getClass();
            if (s34Var.l(f.B.a, true, false) && s34Var.b()) {
                return true;
            }
        }
        return false;
    }
}
