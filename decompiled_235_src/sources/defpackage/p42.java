package defpackage;

import java.security.Provider;
import java.security.Security;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Logger;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p42  reason: default package */
/* loaded from: classes.dex */
public final class p42 {
    public static final Logger c = Logger.getLogger(p42.class.getName());
    public static final ArrayList d;
    public static final p42 e;
    public static final p42 f;
    public final x42 a;
    public final List b = d;

    /* JADX WARN: Type inference failed for: r1v0, types: [x42, java.lang.Object] */
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
        e = new p42(new Object());
        f = new p42(new jd1(3));
    }

    public p42(x42 x42Var) {
        this.a = x42Var;
    }

    public final Object a(String str) {
        Iterator it = this.b.iterator();
        Exception exc = null;
        while (true) {
            boolean hasNext = it.hasNext();
            x42 x42Var = this.a;
            if (hasNext) {
                try {
                    return x42Var.a(str, (Provider) it.next());
                } catch (Exception e2) {
                    if (exc == null) {
                        exc = e2;
                    }
                }
            } else {
                return x42Var.a(str, null);
            }
        }
    }
}
