package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pl  reason: default package */
/* loaded from: classes.dex */
public class pl implements db6 {
    public static final iq0 e = new iq0(21);
    public final Class a;
    public final Method b;
    public final Method c;
    public final Method d;

    public pl(Class cls) {
        this.a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        declaredMethod.getClass();
        this.b = declaredMethod;
        cls.getMethod("setHostname", String.class);
        this.c = cls.getMethod("getAlpnSelectedProtocol", null);
        this.d = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // defpackage.db6
    public final boolean a(SSLSocket sSLSocket) {
        return this.a.isInstance(sSLSocket);
    }

    @Override // defpackage.db6
    public final String b(SSLSocket sSLSocket) {
        if (this.a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.c.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, hk0.a);
                }
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                Throwable cause = e3.getCause();
                if (!(cause instanceof NullPointerException) || !b53.x(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    throw new AssertionError(e3);
                }
            }
        }
        return null;
    }

    @Override // defpackage.db6
    public final boolean c() {
        boolean z = bj.e;
        return bj.e;
    }

    @Override // defpackage.db6
    public final void d(SSLSocket sSLSocket, String str, List list) {
        list.getClass();
        if (this.a.isInstance(sSLSocket)) {
            try {
                this.b.invoke(sSLSocket, Boolean.TRUE);
                Method method = this.d;
                fo4 fo4Var = fo4.a;
                method.invoke(sSLSocket, jo1.q(list));
            } catch (IllegalAccessException e2) {
                throw new AssertionError(e2);
            } catch (InvocationTargetException e3) {
                throw new AssertionError(e3);
            }
        }
    }
}
