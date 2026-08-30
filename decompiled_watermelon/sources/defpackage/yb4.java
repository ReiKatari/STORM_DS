package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import javax.net.SocketFactory;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yb4  reason: default package */
/* loaded from: classes.dex */
public final class yb4 {
    public bq0 b;
    public final vd6 e;
    public final boolean f;
    public final boolean g;
    public final k45 h;
    public boolean i;
    public boolean j;
    public final y60 k;
    public d80 l;
    public final k45 m;
    public final k45 n;
    public final SocketFactory o;
    public final List p;
    public final List q;
    public final ub4 r;
    public final zi0 s;
    public final int t;
    public final int u;
    public final int v;
    public final q9 a = new q9(9);
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();

    public yb4() {
        TimeZone timeZone = ik7.a;
        this.e = new vd6(22);
        this.f = true;
        this.g = true;
        k45 k45Var = k45.B;
        this.h = k45Var;
        this.i = true;
        this.j = true;
        this.k = y60.q0;
        this.m = k45.Z;
        this.n = k45Var;
        SocketFactory socketFactory = SocketFactory.getDefault();
        socketFactory.getClass();
        this.o = socketFactory;
        this.p = zb4.D;
        this.q = zb4.C;
        this.r = ub4.a;
        this.s = zi0.c;
        this.t = 10000;
        this.u = 10000;
        this.v = 10000;
    }
}
