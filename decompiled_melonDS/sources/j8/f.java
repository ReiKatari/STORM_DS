package j8;

import android.content.Context;
import g2.v3;
import java.math.BigInteger;
import java.util.concurrent.locks.ReentrantLock;
import nc.u;
import yb.n;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ f f7770a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final n f7771b;

    /* renamed from: c  reason: collision with root package name */
    public static final a f7772c;

    /* JADX WARN: Type inference failed for: r0v0, types: [j8.f, java.lang.Object] */
    static {
        u.a(g.class).c();
        f7771b = new n(new v3(8));
        f7772c = a.f7753a;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [na.f, java.lang.Object] */
    public static b a(Context context) {
        context.getClass();
        k8.a aVar = (k8.a) f7771b.getValue();
        if (aVar == null) {
            m8.l lVar = m8.l.f9359c;
            if (m8.l.f9359c == null) {
                ReentrantLock reentrantLock = m8.l.f9360d;
                reentrantLock.lock();
                try {
                    if (m8.l.f9359c == null) {
                        m8.j jVar = null;
                        try {
                            h8.j b10 = m8.i.b();
                            if (b10 != null) {
                                h8.j jVar2 = h8.j.Y;
                                jVar2.getClass();
                                Object value = b10.X.getValue();
                                value.getClass();
                                Object value2 = jVar2.X.getValue();
                                value2.getClass();
                                if (((BigInteger) value).compareTo((BigInteger) value2) >= 0) {
                                    m8.j jVar3 = new m8.j(context);
                                    if (jVar3.e()) {
                                        jVar = jVar3;
                                    }
                                }
                            }
                        } catch (Throwable unused) {
                        }
                        m8.l.f9359c = new m8.l(jVar);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
            aVar = m8.l.f9359c;
            aVar.getClass();
        }
        m mVar = new m();
        ?? obj = new Object();
        h8.e.a();
        b bVar = new b(mVar, aVar, obj);
        f7772c.getClass();
        return bVar;
    }
}
