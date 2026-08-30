package aj;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class e implements n {

    /* renamed from: e  reason: collision with root package name */
    public static final x8.e f858e = new x8.e(4);

    /* renamed from: a  reason: collision with root package name */
    public final Class f859a;

    /* renamed from: b  reason: collision with root package name */
    public final Method f860b;

    /* renamed from: c  reason: collision with root package name */
    public final Method f861c;

    /* renamed from: d  reason: collision with root package name */
    public final Method f862d;

    public e(Class cls) {
        this.f859a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        declaredMethod.getClass();
        this.f860b = declaredMethod;
        cls.getMethod("setHostname", String.class);
        this.f861c = cls.getMethod("getAlpnSelectedProtocol", null);
        this.f862d = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // aj.n
    public final boolean a(SSLSocket sSLSocket) {
        return this.f859a.isInstance(sSLSocket);
    }

    @Override // aj.n
    public final String b(SSLSocket sSLSocket) {
        if (this.f859a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.f861c.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, vc.a.f13781a);
                }
            } catch (IllegalAccessException e6) {
                throw new AssertionError(e6);
            } catch (InvocationTargetException e10) {
                Throwable cause = e10.getCause();
                if (!(cause instanceof NullPointerException) || !nc.k.a(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e10);
                }
            }
        }
        return null;
    }

    @Override // aj.n
    public final boolean c() {
        boolean z10 = zi.d.f15148e;
        return zi.d.f15148e;
    }

    @Override // aj.n
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (this.f859a.isInstance(sSLSocket)) {
            try {
                this.f860b.invoke(sSLSocket, Boolean.TRUE);
                Method method = this.f862d;
                zi.f fVar = zi.f.f15151a;
                method.invoke(sSLSocket, l7.a.f(list));
            } catch (IllegalAccessException e6) {
                throw new AssertionError(e6);
            } catch (InvocationTargetException e10) {
                throw new AssertionError(e10);
            }
        }
    }
}
