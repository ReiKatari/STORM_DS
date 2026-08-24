package defpackage;

import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wk4  reason: default package */
/* loaded from: classes.dex */
public final class wk4 {
    public int A;
    public long B;
    public il5 C;
    public qz6 D;
    public os0 b;
    public fa6 e;
    public boolean f;
    public boolean g;
    public xd5 h;
    public boolean i;
    public boolean j;
    public vs0 k;
    public la0 l;
    public d90 m;
    public ProxySelector n;
    public xd5 o;
    public SocketFactory p;
    public SSLSocketFactory q;
    public X509TrustManager r;
    public List s;
    public List t;
    public sk4 u;
    public il0 v;
    public q60 w;
    public int x;
    public int y;
    public int z;
    public eb a = new eb(9);
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();

    public wk4() {
        TimeZone timeZone = az7.a;
        this.e = new fa6(23);
        this.f = true;
        this.g = true;
        xd5 xd5Var = xd5.B;
        this.h = xd5Var;
        this.i = true;
        this.j = true;
        this.k = vs0.e0;
        this.m = d90.s0;
        this.o = xd5Var;
        SocketFactory socketFactory = SocketFactory.getDefault();
        socketFactory.getClass();
        this.p = socketFactory;
        this.s = xk4.F;
        this.t = xk4.E;
        this.u = sk4.a;
        this.v = il0.c;
        this.x = 10000;
        this.y = 10000;
        this.z = 10000;
        this.A = 60000;
        this.B = 1024L;
    }

    public final void a(long j) {
        TimeUnit.SECONDS.getClass();
        this.x = az7.b(j);
    }

    public final void b(long j) {
        TimeUnit.SECONDS.getClass();
        this.y = az7.b(j);
    }
}
