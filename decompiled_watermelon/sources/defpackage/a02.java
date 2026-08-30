package defpackage;

import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: a02  reason: default package */
/* loaded from: classes.dex */
public final class a02 {
    public static final Logger c = Logger.getLogger(a02.class.getName());
    public static final ArrayList d;
    public static final a02 e;
    public static final a02 f;
    public final i02 a;
    public final List b = d;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, i02] */
    static {
        try {
            Class.forName("android.app.Application", false, null);
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                String str = strArr[i];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    c.info("Provider " + str + " not available");
                }
            }
            d = arrayList;
        } catch (Exception unused) {
            d = new ArrayList();
        }
        e = new a02(new so1(1));
        f = new a02(new Object());
    }

    public a02(i02 i02Var) {
        this.a = i02Var;
    }

    public final Object a(String str) {
        Iterator it = this.b.iterator();
        Exception exc = null;
        while (true) {
            boolean hasNext = it.hasNext();
            i02 i02Var = this.a;
            if (hasNext) {
                try {
                    return i02Var.a(str, (Provider) it.next());
                } catch (Exception e2) {
                    if (exc == null) {
                        exc = e2;
                    }
                }
            } else {
                return i02Var.a(str, null);
            }
        }
    }
}
