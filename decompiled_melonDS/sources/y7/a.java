package y7;

import aj.g;
import android.content.Context;
import android.os.Bundle;
import android.os.Trace;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: d  reason: collision with root package name */
    public static volatile a f14786d;

    /* renamed from: e  reason: collision with root package name */
    public static final Object f14787e = new Object();

    /* renamed from: c  reason: collision with root package name */
    public final Context f14790c;

    /* renamed from: b  reason: collision with root package name */
    public final HashSet f14789b = new HashSet();

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f14788a = new HashMap();

    public a(Context context) {
        this.f14790c = context.getApplicationContext();
    }

    public static a c(Context context) {
        if (f14786d == null) {
            synchronized (f14787e) {
                try {
                    if (f14786d == null) {
                        f14786d = new a(context);
                    }
                } finally {
                }
            }
        }
        return f14786d;
    }

    public final void a(Bundle bundle) {
        HashSet hashSet;
        String string = this.f14790c.getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = this.f14789b;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (b.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    b((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e6) {
                throw new RuntimeException(e6);
            }
        }
    }

    public final Object b(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = this.f14788a;
        if (g.N()) {
            try {
                Trace.beginSection(g.v0(cls.getSimpleName()));
            } catch (Throwable th2) {
                Trace.endSection();
                throw th2;
            }
        }
        if (!hashSet.contains(cls)) {
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                b bVar = (b) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a10 = bVar.a();
                if (!a10.isEmpty()) {
                    for (Class cls2 : a10) {
                        if (!hashMap.containsKey(cls2)) {
                            b(cls2, hashSet);
                        }
                    }
                }
                obj = bVar.b(this.f14790c);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } else {
                obj = hashMap.get(cls);
            }
            Trace.endSection();
            return obj;
        }
        String name = cls.getName();
        throw new IllegalStateException("Cannot initialize " + name + ". Cycle detected.");
    }
}
